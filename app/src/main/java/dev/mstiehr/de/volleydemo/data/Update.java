package dev.mstiehr.de.volleydemo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Update {

    @SerializedName("responseGenerated")
    @Expose
    private String responseGenerated;
    @SerializedName("generator")
    @Expose
    private String generator;
    @SerializedName("requestId")
    @Expose
    private Object requestId;
    @SerializedName("payload")
    @Expose
    private List<Payload> payload = new ArrayList<Payload>();
    @SerializedName("executionTime")
    @Expose
    private int executionTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Update() {
    }

    /**
     * 
     * @param responseGenerated
     * @param executionTime
     * @param requestId
     * @param payload
     * @param generator
     */
    public Update(String responseGenerated, String generator, Object requestId, List<Payload> payload, int executionTime) {
        this.responseGenerated = responseGenerated;
        this.generator = generator;
        this.requestId = requestId;
        this.payload = payload;
        this.executionTime = executionTime;
    }

    /**
     * 
     * @return
     *     The responseGenerated
     */
    public String getResponseGenerated() {
        return responseGenerated;
    }

    /**
     * 
     * @param responseGenerated
     *     The responseGenerated
     */
    public void setResponseGenerated(String responseGenerated) {
        this.responseGenerated = responseGenerated;
    }

    public Update withResponseGenerated(String responseGenerated) {
        this.responseGenerated = responseGenerated;
        return this;
    }

    /**
     * 
     * @return
     *     The generator
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * 
     * @param generator
     *     The generator
     */
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public Update withGenerator(String generator) {
        this.generator = generator;
        return this;
    }

    /**
     * 
     * @return
     *     The requestId
     */
    public Object getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    public void setRequestId(Object requestId) {
        this.requestId = requestId;
    }

    public Update withRequestId(Object requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 
     * @return
     *     The payload
     */
    public List<Payload> getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(List<Payload> payload) {
        this.payload = payload;
    }

    public Update withPayload(List<Payload> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * 
     * @return
     *     The executionTime
     */
    public int getExecutionTime() {
        return executionTime;
    }

    /**
     * 
     * @param executionTime
     *     The executionTime
     */
    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public Update withExecutionTime(int executionTime) {
        this.executionTime = executionTime;
        return this;
    }

}
