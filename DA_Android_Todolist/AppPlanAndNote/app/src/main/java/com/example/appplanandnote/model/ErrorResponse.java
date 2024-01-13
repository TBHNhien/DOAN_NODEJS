package com.example.appplanandnote.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorResponse {
    @SerializedName("errors")
    @Expose
    private List<ErrorModel> errors;

    public List<ErrorModel> getErrors() {
        return errors;
    }
}
