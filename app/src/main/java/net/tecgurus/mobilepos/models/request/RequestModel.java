package net.tecgurus.mobilepos.models.request;

import net.tecgurus.mobilepos.controllers.request.RequestManager;

public abstract class RequestModel {

    private boolean result;
    private String error;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

