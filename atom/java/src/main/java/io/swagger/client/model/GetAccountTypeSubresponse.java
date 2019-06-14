/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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

/**
 * GetAccountTypeSubresponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class GetAccountTypeSubresponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_taxable")
  private Boolean isTaxable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("short_name")
  private String shortName = null;

  public GetAccountTypeSubresponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GetAccountTypeSubresponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public GetAccountTypeSubresponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public GetAccountTypeSubresponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GetAccountTypeSubresponse subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @ApiModelProperty(value = "")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public GetAccountTypeSubresponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetAccountTypeSubresponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetAccountTypeSubresponse isTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
    return this;
  }

   /**
   * Get isTaxable
   * @return isTaxable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsTaxable() {
    return isTaxable;
  }

  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }

  public GetAccountTypeSubresponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetAccountTypeSubresponse shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTypeSubresponse getAccountTypeSubresponse = (GetAccountTypeSubresponse) o;
    return Objects.equals(this.id, getAccountTypeSubresponse.id) &&
        Objects.equals(this.createDate, getAccountTypeSubresponse.createDate) &&
        Objects.equals(this.updateDate, getAccountTypeSubresponse.updateDate) &&
        Objects.equals(this.category, getAccountTypeSubresponse.category) &&
        Objects.equals(this.subcategory, getAccountTypeSubresponse.subcategory) &&
        Objects.equals(this.code, getAccountTypeSubresponse.code) &&
        Objects.equals(this.isActive, getAccountTypeSubresponse.isActive) &&
        Objects.equals(this.isTaxable, getAccountTypeSubresponse.isTaxable) &&
        Objects.equals(this.name, getAccountTypeSubresponse.name) &&
        Objects.equals(this.shortName, getAccountTypeSubresponse.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, updateDate, category, subcategory, code, isActive, isTaxable, name, shortName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTypeSubresponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

