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
 * AccountTransactionResponseContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class AccountTransactionResponseContent {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public AccountTransactionResponseContent id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID for the transaction record
   * @return id
  **/
  @ApiModelProperty(value = "The ID for the transaction record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AccountTransactionResponseContent date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for when the transaction occurred
   * @return date
  **/
  @ApiModelProperty(value = "Date for when the transaction occurred")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public AccountTransactionResponseContent isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Indicates if the transaction has been read. Defaults to false which indicates it has not been read
   * @return isRead
  **/
  @ApiModelProperty(value = "Indicates if the transaction has been read. Defaults to false which indicates it has not been read")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public AccountTransactionResponseContent portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The ID for the portfolio that the transaction falls under
   * @return portfolioId
  **/
  @ApiModelProperty(value = "The ID for the portfolio that the transaction falls under")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public AccountTransactionResponseContent modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID for the model to which the portfolio that the transaction falls under subscribes
   * @return modelId
  **/
  @ApiModelProperty(value = "The ID for the model to which the portfolio that the transaction falls under subscribes")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public AccountTransactionResponseContent price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price at which security was bought or sold included in the transaction
   * @return price
  **/
  @ApiModelProperty(value = "Price at which security was bought or sold included in the transaction")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public AccountTransactionResponseContent quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of shares of the security purchased
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of shares of the security purchased")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public AccountTransactionResponseContent securityId(UUID securityId) {
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

  public AccountTransactionResponseContent transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * The ID referring to the transaction code, defined by your firm
   * @return transactionCodeId
  **/
  @ApiModelProperty(value = "The ID referring to the transaction code, defined by your firm")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public AccountTransactionResponseContent secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Alternate ID that can be used to identify the object such as an internal id
   * @return secondaryId
  **/
  @ApiModelProperty(value = "Alternate ID that can be used to identify the object such as an internal id")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public AccountTransactionResponseContent createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Timestamp for the date and time that the transaction record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Timestamp for the date and time that the transaction record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public AccountTransactionResponseContent updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Timestamp for the date and time that the transaction record was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Timestamp for the date and time that the transaction record was last updated")
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
    AccountTransactionResponseContent accountTransactionResponseContent = (AccountTransactionResponseContent) o;
    return Objects.equals(this.id, accountTransactionResponseContent.id) &&
        Objects.equals(this.date, accountTransactionResponseContent.date) &&
        Objects.equals(this.isRead, accountTransactionResponseContent.isRead) &&
        Objects.equals(this.portfolioId, accountTransactionResponseContent.portfolioId) &&
        Objects.equals(this.modelId, accountTransactionResponseContent.modelId) &&
        Objects.equals(this.price, accountTransactionResponseContent.price) &&
        Objects.equals(this.quantity, accountTransactionResponseContent.quantity) &&
        Objects.equals(this.securityId, accountTransactionResponseContent.securityId) &&
        Objects.equals(this.transactionCodeId, accountTransactionResponseContent.transactionCodeId) &&
        Objects.equals(this.secondaryId, accountTransactionResponseContent.secondaryId) &&
        Objects.equals(this.createDate, accountTransactionResponseContent.createDate) &&
        Objects.equals(this.updateDate, accountTransactionResponseContent.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, isRead, portfolioId, modelId, price, quantity, securityId, transactionCodeId, secondaryId, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionResponseContent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

