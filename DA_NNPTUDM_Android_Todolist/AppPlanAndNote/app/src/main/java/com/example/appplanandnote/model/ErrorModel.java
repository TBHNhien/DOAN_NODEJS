package com.example.appplanandnote.model;

import com.google.gson.annotations.SerializedName;

public class ErrorModel {
    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private String value;

    @SerializedName("msg")
    private String msg;

    @SerializedName("path")
    private String path;

    @SerializedName("location")
    private String location;

    // Các phương thức GET, SET khác

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

