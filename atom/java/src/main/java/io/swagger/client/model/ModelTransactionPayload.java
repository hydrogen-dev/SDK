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
import org.threeten.bp.LocalDate;

/**
 * ModelTransactionPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class ModelTransactionPayload {
  @SerializedName("shares")
  private Double shares = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("transaction_code_id")
  private Integer transactionCodeId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public ModelTransactionPayload shares(Double shares) {
    this.shares = shares;
    return this;
  }

   /**
   * Number of shares of the security purchased as part of the transaction
   * @return shares
  **/
  @ApiModelProperty(required = true, value = "Number of shares of the security purchased as part of the transaction")
  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public ModelTransactionPayload price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Security price at which the shares were purchased as part of the transaction
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Security price at which the shares were purchased as part of the transaction")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ModelTransactionPayload date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the transaction
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of the transaction")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ModelTransactionPayload modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model that the transaction record falls under
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model that the transaction record falls under")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public ModelTransactionPayload securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security included in the transaction
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security included in the transaction")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public ModelTransactionPayload transactionCodeId(Integer transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * The ID referring to the transaction codes defined by your firm
   * @return transactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The ID referring to the transaction codes defined by your firm")
  public Integer getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(Integer transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public ModelTransactionPayload secondaryId(String secondaryId) {
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
    ModelTransactionPayload modelTransactionPayload = (ModelTransactionPayload) o;
    return Objects.equals(this.shares, modelTransactionPayload.shares) &&
        Objects.equals(this.price, modelTransactionPayload.price) &&
        Objects.equals(this.date, modelTransactionPayload.date) &&
        Objects.equals(this.modelId, modelTransactionPayload.modelId) &&
        Objects.equals(this.securityId, modelTransactionPayload.securityId) &&
        Objects.equals(this.transactionCodeId, modelTransactionPayload.transactionCodeId) &&
        Objects.equals(this.secondaryId, modelTransactionPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares, price, date, modelId, securityId, transactionCodeId, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTransactionPayload {\n");
    
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
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

