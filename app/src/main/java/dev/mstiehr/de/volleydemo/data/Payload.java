package dev.mstiehr.de.volleydemo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Payload {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("func")
    @Expose
    private String func;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("appVersionInformation")
    @Expose
    private AppVersionInformation appVersionInformation;
    @SerializedName("userMessages")
    @Expose
    private List<Object> userMessages = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param id
     * @param status
     * @param func
     * @param appVersionInformation
     * @param userMessages
     */
    public Payload(String id, String func, String status, AppVersionInformation appVersionInformation, List<Object> userMessages) {
        this.id = id;
        this.func = func;
        this.status = status;
        this.appVersionInformation = appVersionInformation;
        this.userMessages = userMessages;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Payload withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The func
     */
    public String getFunc() {
        return func;
    }

    /**
     * 
     * @param func
     *     The func
     */
    public void setFunc(String func) {
        this.func = func;
    }

    public Payload withFunc(String func) {
        this.func = func;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Payload withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The appVersionInformation
     */
    public AppVersionInformation getAppVersionInformation() {
        return appVersionInformation;
    }

    /**
     * 
     * @param appVersionInformation
     *     The appVersionInformation
     */
    public void setAppVersionInformation(AppVersionInformation appVersionInformation) {
        this.appVersionInformation = appVersionInformation;
    }

    public Payload withAppVersionInformation(AppVersionInformation appVersionInformation) {
        this.appVersionInformation = appVersionInformation;
        return this;
    }

    /**
     * 
     * @return
     *     The userMessages
     */
    public List<Object> getUserMessages() {
        return userMessages;
    }

    /**
     * 
     * @param userMessages
     *     The userMessages
     */
    public void setUserMessages(List<Object> userMessages) {
        this.userMessages = userMessages;
    }

    public Payload withUserMessages(List<Object> userMessages) {
        this.userMessages = userMessages;
        return this;
    }
}
