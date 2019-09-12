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
 * ChangeModelCompositionResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class ChangeModelCompositionResponseInner {
  @SerializedName("id")
  private UUID id = null;

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
  private UUID transactionCodeId = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public ChangeModelCompositionResponseInner id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the model transaction record created
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the model transaction record created")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ChangeModelCompositionResponseInner shares(Double shares) {
    this.shares = shares;
    return this;
  }

   /**
   * Number of shares of the security purchased as part of the transaction
   * @return shares
  **/
  @ApiModelProperty(value = "Number of shares of the security purchased as part of the transaction")
  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public ChangeModelCompositionResponseInner price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Security price at which the shares were purchased as part of the transaction
   * @return price
  **/
  @ApiModelProperty(value = "Security price at which the shares were purchased as part of the transaction")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ChangeModelCompositionResponseInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the transaction
   * @return date
  **/
  @ApiModelProperty(value = "Date of the transaction")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ChangeModelCompositionResponseInner modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model that the transaction record falls under
   * @return modelId
  **/
  @ApiModelProperty(value = "The ID of the model that the transaction record falls under")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public ChangeModelCompositionResponseInner securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security included in the transaction
   * @return securityId
  **/
  @ApiModelProperty(value = "The ID of the security included in the transaction")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public ChangeModelCompositionResponseInner transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * The ID referring to the transaction codes defined by your firm
   * @return transactionCodeId
  **/
  @ApiModelProperty(value = "The ID referring to the transaction codes defined by your firm")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public ChangeModelCompositionResponseInner createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Timestamp for the date and time that the record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Timestamp for the date and time that the record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public ChangeModelCompositionResponseInner updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Timestamp for the date and time that the record was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Timestamp for the date and time that the record was last updated")
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
    ChangeModelCompositionResponseInner changeModelCompositionResponseInner = (ChangeModelCompositionResponseInner) o;
    return Objects.equals(this.id, changeModelCompositionResponseInner.id) &&
        Objects.equals(this.shares, changeModelCompositionResponseInner.shares) &&
        Objects.equals(this.price, changeModelCompositionResponseInner.price) &&
        Objects.equals(this.date, changeModelCompositionResponseInner.date) &&
        Objects.equals(this.modelId, changeModelCompositionResponseInner.modelId) &&
        Objects.equals(this.securityId, changeModelCompositionResponseInner.securityId) &&
        Objects.equals(this.transactionCodeId, changeModelCompositionResponseInner.transactionCodeId) &&
        Objects.equals(this.createDate, changeModelCompositionResponseInner.createDate) &&
        Objects.equals(this.updateDate, changeModelCompositionResponseInner.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shares, price, date, modelId, securityId, transactionCodeId, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeModelCompositionResponseInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

