package com.hydrogen.electron;

public enum Environment {
    SANDBOX("https://sandbox.hydrogenplatform.com/electron/v1"),
    PRODUCTION("https://api.hydrogenplatform.com/electron/v1");
    private String url;

    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
