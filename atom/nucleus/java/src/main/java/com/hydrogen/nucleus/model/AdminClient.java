/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * AdminClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class AdminClient {
  @SerializedName("authorities")
  private String authorities = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_2fa")
  private Boolean is2fa = null;

  @SerializedName("is_2fa_verified")
  private Boolean is2faVerified = null;

  @SerializedName("is_account_non_expired")
  private Boolean isAccountNonExpired = null;

  @SerializedName("is_account_non_locked")
  private Boolean isAccountNonLocked = null;

  @SerializedName("is_credentials_non_expired")
  private Boolean isCredentialsNonExpired = null;

  @SerializedName("is_enabled")
  private Boolean isEnabled = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("tenant")
  private String tenant = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("username")
  private String username = null;

  public AdminClient authorities(String authorities) {
    this.authorities = authorities;
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(value = "")
  public String getAuthorities() {
    return authorities;
  }

  public void setAuthorities(String authorities) {
    this.authorities = authorities;
  }

  public AdminClient createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public AdminClient id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AdminClient is2fa(Boolean is2fa) {
    this.is2fa = is2fa;
    return this;
  }

   /**
   * Get is2fa
   * @return is2fa
  **/
  @ApiModelProperty(value = "")
  public Boolean isIs2fa() {
    return is2fa;
  }

  public void setIs2fa(Boolean is2fa) {
    this.is2fa = is2fa;
  }

  public AdminClient is2faVerified(Boolean is2faVerified) {
    this.is2faVerified = is2faVerified;
    return this;
  }

   /**
   * Get is2faVerified
   * @return is2faVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean isIs2faVerified() {
    return is2faVerified;
  }

  public void setIs2faVerified(Boolean is2faVerified) {
    this.is2faVerified = is2faVerified;
  }

  public AdminClient isAccountNonExpired(Boolean isAccountNonExpired) {
    this.isAccountNonExpired = isAccountNonExpired;
    return this;
  }

   /**
   * Get isAccountNonExpired
   * @return isAccountNonExpired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAccountNonExpired() {
    return isAccountNonExpired;
  }

  public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
    this.isAccountNonExpired = isAccountNonExpired;
  }

  public AdminClient isAccountNonLocked(Boolean isAccountNonLocked) {
    this.isAccountNonLocked = isAccountNonLocked;
    return this;
  }

   /**
   * Get isAccountNonLocked
   * @return isAccountNonLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAccountNonLocked() {
    return isAccountNonLocked;
  }

  public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
    this.isAccountNonLocked = isAccountNonLocked;
  }

  public AdminClient isCredentialsNonExpired(Boolean isCredentialsNonExpired) {
    this.isCredentialsNonExpired = isCredentialsNonExpired;
    return this;
  }

   /**
   * Get isCredentialsNonExpired
   * @return isCredentialsNonExpired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCredentialsNonExpired() {
    return isCredentialsNonExpired;
  }

  public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
    this.isCredentialsNonExpired = isCredentialsNonExpired;
  }

  public AdminClient isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AdminClient password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AdminClient tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @ApiModelProperty(value = "")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public AdminClient updateDate(OffsetDateTime updateDate) {
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

  public AdminClient username(String username) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminClient adminClient = (AdminClient) o;
    return Objects.equals(this.authorities, adminClient.authorities) &&
        Objects.equals(this.createDate, adminClient.createDate) &&
        Objects.equals(this.id, adminClient.id) &&
        Objects.equals(this.is2fa, adminClient.is2fa) &&
        Objects.equals(this.is2faVerified, adminClient.is2faVerified) &&
        Objects.equals(this.isAccountNonExpired, adminClient.isAccountNonExpired) &&
        Objects.equals(this.isAccountNonLocked, adminClient.isAccountNonLocked) &&
        Objects.equals(this.isCredentialsNonExpired, adminClient.isCredentialsNonExpired) &&
        Objects.equals(this.isEnabled, adminClient.isEnabled) &&
        Objects.equals(this.password, adminClient.password) &&
        Objects.equals(this.tenant, adminClient.tenant) &&
        Objects.equals(this.updateDate, adminClient.updateDate) &&
        Objects.equals(this.username, adminClient.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorities, createDate, id, is2fa, is2faVerified, isAccountNonExpired, isAccountNonLocked, isCredentialsNonExpired, isEnabled, password, tenant, updateDate, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminClient {\n");
    
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    is2fa: ").append(toIndentedString(is2fa)).append("\n");
    sb.append("    is2faVerified: ").append(toIndentedString(is2faVerified)).append("\n");
    sb.append("    isAccountNonExpired: ").append(toIndentedString(isAccountNonExpired)).append("\n");
    sb.append("    isAccountNonLocked: ").append(toIndentedString(isAccountNonLocked)).append("\n");
    sb.append("    isCredentialsNonExpired: ").append(toIndentedString(isCredentialsNonExpired)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

