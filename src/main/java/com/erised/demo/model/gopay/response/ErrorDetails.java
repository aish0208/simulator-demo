package com.erised.demo.model.gopay.response;

import java.util.HashMap;
import java.util.Map;

public class ErrorDetails {

    private int code;
    private String description;

    private static Map<Integer,String> errorCodeDesc;

    static {
        errorCodeDesc = new HashMap<>();
        errorCodeDesc.put(116, "Merchant Not Found");
        errorCodeDesc.put(112, "User Blocked");
        errorCodeDesc.put(116, "Merchant Not Found");
        errorCodeDesc.put(900, "Internal Server Error");
    }

    public ErrorDetails(){

    }

    public ErrorDetails(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
