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
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import dev.mstiehr.de.volleydemo.data.AppVersionInformation;
import dev.mstiehr.de.volleydemo.data.Update;

import java.util.ArrayList;
import java.util.List;

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

        List<Request<String>> requests = new ArrayList<>(10);
        for(int i=0; i<10; i++)
        {
            final int index = i;
            StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>()
            {

                @Override
                public void onResponse (String response)
                {
                    tvOutput.setText("response #"+index);
                    try
                    {
                        Update info = new Gson().fromJson(response, Update.class);
                        tvOutput.setText(info.getPayload().get(0).getAppVersionInformation().getVersion());
                    }
                    catch (JsonSyntaxException e)
                    {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener(){

                @Override
                public void onErrorResponse (VolleyError error)
                {
                    tvOutput.setText(error.toString());
                }
            });
            requests.add(request);
        }
        for(Request<String> req : requests)
            queue.add(req);
    }
}
