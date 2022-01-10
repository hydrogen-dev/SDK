package com.hydrogen.admin;

public enum Environment {
    SANDBOX("https://dev.hydrogenplatform.com"),
    PRODUCTION("https://api.hydrogenplatform.com");

    private String url;

    Environment(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
