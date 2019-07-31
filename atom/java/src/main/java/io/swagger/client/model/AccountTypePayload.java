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

/**
 * AccountTypePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class AccountTypePayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("short_name")
  private String shortName = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("is_taxable")
  private Boolean isTaxable = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public AccountTypePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account type such as “Taxable” or “Joint”
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account type such as “Taxable” or “Joint”")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountTypePayload shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Abbreviated name for the account type
   * @return shortName
  **/
  @ApiModelProperty(value = "Abbreviated name for the account type")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AccountTypePayload category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category grouping that the account type falls under
   * @return category
  **/
  @ApiModelProperty(value = "Category grouping that the account type falls under")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AccountTypePayload subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Subcategory grouping under the category that the account type falls under
   * @return subcategory
  **/
  @ApiModelProperty(value = "Subcategory grouping under the category that the account type falls under")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public AccountTypePayload code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code defined by your firm for the account type
   * @return code
  **/
  @ApiModelProperty(value = "Code defined by your firm for the account type")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccountTypePayload isTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
    return this;
  }

   /**
   * Indicates if this account type is taxable. true indicates it is taxable
   * @return isTaxable
  **/
  @ApiModelProperty(value = "Indicates if this account type is taxable. true indicates it is taxable")
  public Boolean isIsTaxable() {
    return isTaxable;
  }

  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }

  public AccountTypePayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if this account type is active. Defaults to true which indicates it is active and available to be assigned to accounts
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if this account type is active. Defaults to true which indicates it is active and available to be assigned to accounts")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AccountTypePayload secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTypePayload accountTypePayload = (AccountTypePayload) o;
    return Objects.equals(this.name, accountTypePayload.name) &&
        Objects.equals(this.shortName, accountTypePayload.shortName) &&
        Objects.equals(this.category, accountTypePayload.category) &&
        Objects.equals(this.subcategory, accountTypePayload.subcategory) &&
        Objects.equals(this.code, accountTypePayload.code) &&
        Objects.equals(this.isTaxable, accountTypePayload.isTaxable) &&
        Objects.equals(this.isActive, accountTypePayload.isActive) &&
        Objects.equals(this.secondaryId, accountTypePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, category, subcategory, code, isTaxable, isActive, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTypePayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

