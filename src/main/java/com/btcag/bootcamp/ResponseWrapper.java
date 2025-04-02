package com.btcag.bootcamp;

public class ResponseWrapper {
    private String id;

    public ResponseWrapper(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}