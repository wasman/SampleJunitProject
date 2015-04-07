package com.diosoft.taining;

public class MyEception extends Exception {
    private final String errorCode;

    public MyEception(String errorCode) {this.errorCode = errorCode;}

    public String getErrorCode() {
        return errorCode;
    }
}
