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
import io.swagger.client.model.CreateTransactionCodeResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * SpecificTransactionCodeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class SpecificTransactionCodeResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("transaction_code")
  private String transactionCode = null;

  @SerializedName("transaction_code_description")
  private String transactionCodeDescription = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("is_buy")
  private Boolean isBuy = false;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificTransactionCodeResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the transaction code
   * @return id
  **/
  @ApiModelProperty(value = "ID of the transaction code")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificTransactionCodeResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the transaction code was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the transaction code was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificTransactionCodeResponse transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Usually a standard short combination of letters and numbers used to identify the transaction code within your firm
   * @return transactionCode
  **/
  @ApiModelProperty(required = true, value = "Usually a standard short combination of letters and numbers used to identify the transaction code within your firm")
  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public SpecificTransactionCodeResponse transactionCodeDescription(String transactionCodeDescription) {
    this.transactionCodeDescription = transactionCodeDescription;
    return this;
  }

   /**
   * Short description to clarify the type of transaction
   * @return transactionCodeDescription
  **/
  @ApiModelProperty(value = "Short description to clarify the type of transaction")
  public String getTransactionCodeDescription() {
    return transactionCodeDescription;
  }

  public void setTransactionCodeDescription(String transactionCodeDescription) {
    this.transactionCodeDescription = transactionCodeDescription;
  }

  public SpecificTransactionCodeResponse transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Name of the transaction code such as “Customer Payment”
   * @return transactionType
  **/
  @ApiModelProperty(value = "Name of the transaction code such as “Customer Payment”")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public SpecificTransactionCodeResponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Grouping of similar transaction codes
   * @return category
  **/
  @ApiModelProperty(value = "Grouping of similar transaction codes")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public SpecificTransactionCodeResponse subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Sub-grouping of similar transaction codes
   * @return subcategory
  **/
  @ApiModelProperty(value = "Sub-grouping of similar transaction codes")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public SpecificTransactionCodeResponse isBuy(Boolean isBuy) {
    this.isBuy = isBuy;
    return this;
  }

   /**
   * Indicates if the transaction is to buy securities. Defaults to false which means it is a sell transaction.
   * @return isBuy
  **/
  @ApiModelProperty(value = "Indicates if the transaction is to buy securities. Defaults to false which means it is a sell transaction.")
  public Boolean isIsBuy() {
    return isBuy;
  }

  public void setIsBuy(Boolean isBuy) {
    this.isBuy = isBuy;
  }

  public SpecificTransactionCodeResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the transaction code in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the transaction code in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public SpecificTransactionCodeResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the transaction code was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the transaction code was last updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificTransactionCodeResponse specificTransactionCodeResponse = (SpecificTransactionCodeResponse) o;
    return Objects.equals(this.id, specificTransactionCodeResponse.id) &&
        Objects.equals(this.createDate, specificTransactionCodeResponse.createDate) &&
        Objects.equals(this.transactionCode, specificTransactionCodeResponse.transactionCode) &&
        Objects.equals(this.transactionCodeDescription, specificTransactionCodeResponse.transactionCodeDescription) &&
        Objects.equals(this.transactionType, specificTransactionCodeResponse.transactionType) &&
        Objects.equals(this.category, specificTransactionCodeResponse.category) &&
        Objects.equals(this.subcategory, specificTransactionCodeResponse.subcategory) &&
        Objects.equals(this.isBuy, specificTransactionCodeResponse.isBuy) &&
        Objects.equals(this.metadata, specificTransactionCodeResponse.metadata) &&
        Objects.equals(this.updateDate, specificTransactionCodeResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, transactionCode, transactionCodeDescription, transactionType, category, subcategory, isBuy, metadata, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificTransactionCodeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionCodeDescription: ").append(toIndentedString(transactionCodeDescription)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

