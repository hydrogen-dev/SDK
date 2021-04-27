package com.hydrogen.admin.model;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class WhiteLabel {

    private UUID id;

    private String name;

    private String description;

    @SerializedName("auth_type")
    private String authType;

    private Boolean isActive = true;

    private Boolean isModule;

    private UUID parentApplicationId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getModule() {
        return isModule;
    }

    public void setModule(Boolean module) {
        isModule = module;
    }

    public UUID getParentApplicationId() {
        return parentApplicationId;
    }

    public void setParentApplicationId(UUID parentApplicationId) {
        this.parentApplicationId = parentApplicationId;
    }
}
