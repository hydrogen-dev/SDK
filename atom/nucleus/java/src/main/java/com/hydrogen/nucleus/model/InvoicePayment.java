/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.2
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
import org.threeten.bp.OffsetDateTime;

/**
 * InvoicePayment Object
 */
@ApiModel(description = "InvoicePayment Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class InvoicePayment {
  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("invoice_id")
  private UUID invoiceId = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("payment_amount")
  private Float paymentAmount = null;

  @SerializedName("payment_date")
  private OffsetDateTime paymentDate = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public InvoicePayment createDate(OffsetDateTime createDate) {
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

  public InvoicePayment currencyCode(String currencyCode) {
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

  public InvoicePayment id(UUID id) {
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

  public InvoicePayment invoiceId(UUID invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(example = "14566616-6846-4090-beae-5b1568b82370", required = true, value = "invoiceId")
  public UUID getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(UUID invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoicePayment metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public InvoicePayment putMetadataItem(String key, String metadataItem) {
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

  public InvoicePayment paymentAmount(Float paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "paymentAmount")
  public Float getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(Float paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public InvoicePayment paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(example = "2020-03-18T18:17:23.579+0000", required = true, value = "paymentDate")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public InvoicePayment secondaryId(String secondaryId) {
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

  public InvoicePayment updateDate(OffsetDateTime updateDate) {
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
    InvoicePayment invoicePayment = (InvoicePayment) o;
    return Objects.equals(this.createDate, invoicePayment.createDate) &&
        Objects.equals(this.currencyCode, invoicePayment.currencyCode) &&
        Objects.equals(this.id, invoicePayment.id) &&
        Objects.equals(this.invoiceId, invoicePayment.invoiceId) &&
        Objects.equals(this.metadata, invoicePayment.metadata) &&
        Objects.equals(this.paymentAmount, invoicePayment.paymentAmount) &&
        Objects.equals(this.paymentDate, invoicePayment.paymentDate) &&
        Objects.equals(this.secondaryId, invoicePayment.secondaryId) &&
        Objects.equals(this.updateDate, invoicePayment.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, currencyCode, id, invoiceId, metadata, paymentAmount, paymentDate, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePayment {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

