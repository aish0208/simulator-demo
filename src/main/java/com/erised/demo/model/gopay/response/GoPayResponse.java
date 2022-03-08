package com.erised.demo.model.gopay.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoPayResponse {

    private boolean success;
    private ResponseData data;
    private ErrorDetails error;

    public GoPayResponse() {

    }

    public GoPayResponse(boolean success) {
       this.success = success;
    }

    public ResponseData getData() {
        return data;
    }

    public ErrorDetails getError() {
        return error;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

    public void setError(ErrorDetails error) {
        this.error = error;
    }

    public Boolean getSuccess() {
        return success;
    }
}
