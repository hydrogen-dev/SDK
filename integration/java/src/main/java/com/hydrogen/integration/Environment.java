package com.hydrogen.integration;

public enum Environment {
    SANDBOX("https://sandbox.hydrogenplatform.com/integration/v1"),
    PRODUCTION("https://api.hydrogenplatform.com/integration/v1");
    private String url;

    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
