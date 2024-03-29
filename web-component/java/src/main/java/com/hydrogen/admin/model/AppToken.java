/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



package com.hydrogen.admin.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * AppToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-27T14:06:28.208Z")



public class AppToken {
  @SerializedName("app_name")
  private String appName = null;

  @SerializedName("app_token")
  private String appToken = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_valid")
  private Boolean isValid = null;

  @SerializedName("tenant_name")
  private String tenantName = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("username")
  private String username = null;

  public AppToken appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @ApiModelProperty(value = "")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AppToken appToken(String appToken) {
    this.appToken = appToken;
    return this;
  }

   /**
   * Get appToken
   * @return appToken
  **/
  @ApiModelProperty(value = "")
  public String getAppToken() {
    return appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public AppToken isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public AppToken tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  @ApiModelProperty(value = "")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public AppToken updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public AppToken username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppToken appToken = (AppToken) o;
    return Objects.equals(this.appName, appToken.appName) &&
        Objects.equals(this.appToken, appToken.appToken) &&
        Objects.equals(this.createDate, appToken.createDate) &&
        Objects.equals(this.id, appToken.id) &&
        Objects.equals(this.isValid, appToken.isValid) &&
        Objects.equals(this.tenantName, appToken.tenantName) &&
        Objects.equals(this.updateDate, appToken.updateDate) &&
        Objects.equals(this.username, appToken.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appToken, createDate, id, isValid, tenantName, updateDate, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppToken {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appToken: ").append(toIndentedString(appToken)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

