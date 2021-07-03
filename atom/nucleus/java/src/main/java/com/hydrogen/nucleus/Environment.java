package com.hydrogen.nucleus;

public enum Environment {
    SANDBOX("https://sandbox.hydrogenplatform.com"),
    PRODUCTION("https://api.hydrogenplatform.com");

    private String url;

    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
