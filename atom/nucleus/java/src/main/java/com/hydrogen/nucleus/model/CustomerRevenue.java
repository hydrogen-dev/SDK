/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Customer Revenue Object
 */
@ApiModel(description = "Customer Revenue Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class CustomerRevenue {
  @SerializedName("accounting_method")
  private String accountingMethod = null;

  @SerializedName("contact_id")
  private UUID contactId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("revenue")
  private Double revenue = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public CustomerRevenue accountingMethod(String accountingMethod) {
    this.accountingMethod = accountingMethod;
    return this;
  }

   /**
   * accounting_method
   * @return accountingMethod
  **/
  @ApiModelProperty(example = "cash", required = true, value = "accounting_method")
  public String getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(String accountingMethod) {
    this.accountingMethod = accountingMethod;
  }

  public CustomerRevenue contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * contactId
   * @return contactId
  **/
  @ApiModelProperty(example = "50d76212-0fcd-4d36-8633-e4a52cbcb79f", required = true, value = "contactId")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public CustomerRevenue createDate(OffsetDateTime createDate) {
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

  public CustomerRevenue currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CustomerRevenue date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2020-03-18", required = true, value = "date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CustomerRevenue id(UUID id) {
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

  public CustomerRevenue metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CustomerRevenue putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CustomerRevenue revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * revenue
   * @return revenue
  **/
  @ApiModelProperty(example = "10.0", required = true, value = "revenue")
  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  public CustomerRevenue secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public CustomerRevenue updateDate(OffsetDateTime updateDate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRevenue customerRevenue = (CustomerRevenue) o;
    return Objects.equals(this.accountingMethod, customerRevenue.accountingMethod) &&
        Objects.equals(this.contactId, customerRevenue.contactId) &&
        Objects.equals(this.createDate, customerRevenue.createDate) &&
        Objects.equals(this.currencyCode, customerRevenue.currencyCode) &&
        Objects.equals(this.date, customerRevenue.date) &&
        Objects.equals(this.id, customerRevenue.id) &&
        Objects.equals(this.metadata, customerRevenue.metadata) &&
        Objects.equals(this.revenue, customerRevenue.revenue) &&
        Objects.equals(this.secondaryId, customerRevenue.secondaryId) &&
        Objects.equals(this.updateDate, customerRevenue.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingMethod, contactId, createDate, currencyCode, date, id, metadata, revenue, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRevenue {\n");
    
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

