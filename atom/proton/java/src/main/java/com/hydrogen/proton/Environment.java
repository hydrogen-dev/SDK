package com.hydrogen.proton;

public enum Environment {
    SANDBOX("https://sandbox.hydrogenplatform.com/proton/v1"),
    PRODUCTION("https://api.hydrogenplatform.com/proton/v1");

    private String url;

    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
