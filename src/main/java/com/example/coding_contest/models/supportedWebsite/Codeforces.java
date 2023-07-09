package com.example.coding_contest.models.supportedWebsite;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class Codeforces {
    private String name;
    private String url;
    private OffsetDateTime startTime;
    private OffsetDateTime endTime;
    private String duration;
    private String in24_Hours;
    private String status;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("start_time")
    public OffsetDateTime getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(OffsetDateTime value) { this.startTime = value; }

    @JsonProperty("end_time")
    public OffsetDateTime getEndTime() { return endTime; }
    @JsonProperty("end_time")
    public void setEndTime(OffsetDateTime value) { this.endTime = value; }

    @JsonProperty("duration")
    public String getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(String value) { this.duration = value; }

    @JsonProperty("in_24_hours")
    public String getIn24Hours() { return in24_Hours; }
    @JsonProperty("in_24_hours")
    public void setIn24Hours(String value) { this.in24_Hours = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }
}
