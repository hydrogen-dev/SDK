/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Institution Object
 */
@ApiModel(description = "Institution Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Institution {
  @SerializedName("code")
  private String code = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("logo_url_medium")
  private String logoUrlMedium = null;

  @SerializedName("logo_url_small")
  private String logoUrlSmall = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("website_url")
  private String websiteUrl = null;

  public Institution code(String code) {
    this.code = code;
    return this;
  }

   /**
   * code
   * @return code
  **/
  @ApiModelProperty(example = "code", value = "code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Institution createDate(OffsetDateTime createDate) {
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

  public Institution id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Institution logoUrlMedium(String logoUrlMedium) {
    this.logoUrlMedium = logoUrlMedium;
    return this;
  }

   /**
   * logo_url_medium
   * @return logoUrlMedium
  **/
  @ApiModelProperty(example = "https://domain.com/logo.png", value = "logo_url_medium")
  public String getLogoUrlMedium() {
    return logoUrlMedium;
  }

  public void setLogoUrlMedium(String logoUrlMedium) {
    this.logoUrlMedium = logoUrlMedium;
  }

  public Institution logoUrlSmall(String logoUrlSmall) {
    this.logoUrlSmall = logoUrlSmall;
    return this;
  }

   /**
   * logo_url_small
   * @return logoUrlSmall
  **/
  @ApiModelProperty(example = "https://domain.com/logo.png", value = "logo_url_small")
  public String getLogoUrlSmall() {
    return logoUrlSmall;
  }

  public void setLogoUrlSmall(String logoUrlSmall) {
    this.logoUrlSmall = logoUrlSmall;
  }

  public Institution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(example = "Chase", required = true, value = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Institution updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public Institution websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * website_url
   * @return websiteUrl
  **/
  @ApiModelProperty(example = "https://domain.com", value = "website_url")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.code, institution.code) &&
        Objects.equals(this.createDate, institution.createDate) &&
        Objects.equals(this.id, institution.id) &&
        Objects.equals(this.logoUrlMedium, institution.logoUrlMedium) &&
        Objects.equals(this.logoUrlSmall, institution.logoUrlSmall) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.updateDate, institution.updateDate) &&
        Objects.equals(this.websiteUrl, institution.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, createDate, id, logoUrlMedium, logoUrlSmall, name, updateDate, websiteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrlMedium: ").append(toIndentedString(logoUrlMedium)).append("\n");
    sb.append("    logoUrlSmall: ").append(toIndentedString(logoUrlSmall)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

