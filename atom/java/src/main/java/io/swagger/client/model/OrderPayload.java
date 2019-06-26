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
 * OrderPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class OrderPayload {
  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("order_bulk_id")
  private UUID orderBulkId = null;

  @SerializedName("is_read")
  private Boolean isRead = false;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("order_ticket_id")
  private UUID orderTicketId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public OrderPayload transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * The ID referring to the transaction codes defined by your firm
   * @return transactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The ID referring to the transaction codes defined by your firm")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public OrderPayload quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of shares of security being bought or sold
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of shares of security being bought or sold")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public OrderPayload securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security being bought or sold
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security being bought or sold")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public OrderPayload date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for when the order was generated
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date for when the order was generated")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public OrderPayload price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price of the security at the time the order is created. Should be provided to use the rebalancing functionality
   * @return price
  **/
  @ApiModelProperty(value = "Price of the security at the time the order is created. Should be provided to use the rebalancing functionality")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderPayload orderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
    return this;
  }

   /**
   * In the case that the order is part of a bulk order, the ID of the bulk order
   * @return orderBulkId
  **/
  @ApiModelProperty(value = "In the case that the order is part of a bulk order, the ID of the bulk order")
  public UUID getOrderBulkId() {
    return orderBulkId;
  }

  public void setOrderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
  }

  public OrderPayload isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read
   * @return isRead
  **/
  @ApiModelProperty(value = "Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public OrderPayload orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Type of the order transaction
   * @return orderType
  **/
  @ApiModelProperty(value = "Type of the order transaction")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public OrderPayload orderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
    return this;
  }

   /**
   * The ID that reflects all orders generated during a rebalance
   * @return orderTicketId
  **/
  @ApiModelProperty(value = "The ID that reflects all orders generated during a rebalance")
  public UUID getOrderTicketId() {
    return orderTicketId;
  }

  public void setOrderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
  }

  public OrderPayload portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order
   * @return portfolioId
  **/
  @ApiModelProperty(value = "The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public OrderPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that the order falls under. Used when aggregating order records into Bulk Order
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the account that the order falls under. Used when aggregating order records into Bulk Order")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public OrderPayload modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order
   * @return modelId
  **/
  @ApiModelProperty(value = "The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public OrderPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the order record in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the order record in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPayload orderPayload = (OrderPayload) o;
    return Objects.equals(this.transactionCodeId, orderPayload.transactionCodeId) &&
        Objects.equals(this.quantity, orderPayload.quantity) &&
        Objects.equals(this.securityId, orderPayload.securityId) &&
        Objects.equals(this.date, orderPayload.date) &&
        Objects.equals(this.price, orderPayload.price) &&
        Objects.equals(this.orderBulkId, orderPayload.orderBulkId) &&
        Objects.equals(this.isRead, orderPayload.isRead) &&
        Objects.equals(this.orderType, orderPayload.orderType) &&
        Objects.equals(this.orderTicketId, orderPayload.orderTicketId) &&
        Objects.equals(this.portfolioId, orderPayload.portfolioId) &&
        Objects.equals(this.accountId, orderPayload.accountId) &&
        Objects.equals(this.modelId, orderPayload.modelId) &&
        Objects.equals(this.metadata, orderPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCodeId, quantity, securityId, date, price, orderBulkId, isRead, orderType, orderTicketId, portfolioId, accountId, modelId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPayload {\n");
    
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    orderBulkId: ").append(toIndentedString(orderBulkId)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderTicketId: ").append(toIndentedString(orderTicketId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

