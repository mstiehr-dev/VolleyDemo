package dev.mstiehr.de.volleydemo;

import android.Manifest;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v4.os.BuildCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class UpdateActivity extends AppCompatActivity
{
    TextView tvOutput;
    Button btnFetch;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        tvOutput = (TextView) findViewById(R.id.tv_output);

        btnFetch = (Button) findViewById(R.id.btn_fetch);
        btnFetch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                fetchUpdate(true);
            }
        });
    }

    private void fetchUpdate(boolean permission)
    {
        if(!permission)
            return;

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://maltin.pisces.uberspace.de/jsontest";

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>()
        {

            @Override
            public void onResponse (String response)
            {
                tvOutput.setText(response);
            }
        }, new Response.ErrorListener(){

            @Override
            public void onErrorResponse (VolleyError error)
            {
                tvOutput.setText(error.toString());
            }
        });

        queue.add(request);
    }
}
