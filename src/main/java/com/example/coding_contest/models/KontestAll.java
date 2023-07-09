package com.example.coding_contest.models;


import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KontestAll {
    private String name;
    private String url;
    private String startTime;
    private String endTime;
    private String duration;
    private String site;
    private In24_Hours in24_Hours;
    private Status status;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("start_time")
    public String getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(String value) { this.startTime = value; }

    @JsonProperty("end_time")
    public String getEndTime() { return endTime; }
    @JsonProperty("end_time")
    public void setEndTime(String value) { this.endTime = value; }

    @JsonProperty("duration")
    public String getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(String value) { this.duration = value; }

    @JsonProperty("site")
    public String getSite() { return site; }
    @JsonProperty("site")
    public void setSite(String value) { this.site = value; }

    @JsonProperty("in_24_hours")
    public In24_Hours getIn24Hours() { return in24_Hours; }
    @JsonProperty("in_24_hours")
    public void setIn24Hours(In24_Hours value) { this.in24_Hours = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }
}
