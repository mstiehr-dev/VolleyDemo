package dev.mstiehr.de.volleydemo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AppVersionInformation {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("link")
    @Expose
    private String link;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppVersionInformation() {
    }

    /**
     * 
     * @param status
     * @param link
     * @param version
     */
    public AppVersionInformation(String version, String status, String link) {
        this.version = version;
        this.status = status;
        this.link = link;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    public AppVersionInformation withVersion(String version) {
        this.version = version;
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

    public AppVersionInformation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    public AppVersionInformation withLink(String link) {
        this.link = link;
        return this;
    }
}
