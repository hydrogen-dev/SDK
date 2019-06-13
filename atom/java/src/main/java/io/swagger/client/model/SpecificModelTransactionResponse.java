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
import io.swagger.client.model.CreateModelTransactionResponse;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * SpecificModelTransactionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class SpecificModelTransactionResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

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

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificModelTransactionResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the model transaction
   * @return id
  **/
  @ApiModelProperty(value = "ID of the model transaction")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificModelTransactionResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the model transaction was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the model transaction was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificModelTransactionResponse shares(Double shares) {
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

  public SpecificModelTransactionResponse price(Double price) {
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

  public SpecificModelTransactionResponse date(LocalDate date) {
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

  public SpecificModelTransactionResponse modelId(UUID modelId) {
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

  public SpecificModelTransactionResponse securityId(UUID securityId) {
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

  public SpecificModelTransactionResponse transactionCodeId(Integer transactionCodeId) {
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

  public SpecificModelTransactionResponse secondaryId(String secondaryId) {
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

  public SpecificModelTransactionResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the model transaction was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the model transaction was last updated")
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
    SpecificModelTransactionResponse specificModelTransactionResponse = (SpecificModelTransactionResponse) o;
    return Objects.equals(this.id, specificModelTransactionResponse.id) &&
        Objects.equals(this.createDate, specificModelTransactionResponse.createDate) &&
        Objects.equals(this.shares, specificModelTransactionResponse.shares) &&
        Objects.equals(this.price, specificModelTransactionResponse.price) &&
        Objects.equals(this.date, specificModelTransactionResponse.date) &&
        Objects.equals(this.modelId, specificModelTransactionResponse.modelId) &&
        Objects.equals(this.securityId, specificModelTransactionResponse.securityId) &&
        Objects.equals(this.transactionCodeId, specificModelTransactionResponse.transactionCodeId) &&
        Objects.equals(this.secondaryId, specificModelTransactionResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificModelTransactionResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, shares, price, date, modelId, securityId, transactionCodeId, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificModelTransactionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

