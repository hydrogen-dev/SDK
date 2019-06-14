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
import io.swagger.client.model.OrderPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateOrderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class CreateOrderResponse {
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

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateOrderResponse transactionCodeId(UUID transactionCodeId) {
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

  public CreateOrderResponse quantity(Double quantity) {
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

  public CreateOrderResponse securityId(UUID securityId) {
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

  public CreateOrderResponse date(LocalDate date) {
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

  public CreateOrderResponse price(Double price) {
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

  public CreateOrderResponse orderBulkId(UUID orderBulkId) {
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

  public CreateOrderResponse isRead(Boolean isRead) {
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

  public CreateOrderResponse orderType(String orderType) {
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

  public CreateOrderResponse orderTicketId(UUID orderTicketId) {
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

  public CreateOrderResponse portfolioId(UUID portfolioId) {
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

  public CreateOrderResponse accountId(UUID accountId) {
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

  public CreateOrderResponse modelId(UUID modelId) {
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

  public CreateOrderResponse metadata(Object metadata) {
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

  public CreateOrderResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the order record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the order record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateOrderResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the order record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the order record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderResponse createOrderResponse = (CreateOrderResponse) o;
    return Objects.equals(this.transactionCodeId, createOrderResponse.transactionCodeId) &&
        Objects.equals(this.quantity, createOrderResponse.quantity) &&
        Objects.equals(this.securityId, createOrderResponse.securityId) &&
        Objects.equals(this.date, createOrderResponse.date) &&
        Objects.equals(this.price, createOrderResponse.price) &&
        Objects.equals(this.orderBulkId, createOrderResponse.orderBulkId) &&
        Objects.equals(this.isRead, createOrderResponse.isRead) &&
        Objects.equals(this.orderType, createOrderResponse.orderType) &&
        Objects.equals(this.orderTicketId, createOrderResponse.orderTicketId) &&
        Objects.equals(this.portfolioId, createOrderResponse.portfolioId) &&
        Objects.equals(this.accountId, createOrderResponse.accountId) &&
        Objects.equals(this.modelId, createOrderResponse.modelId) &&
        Objects.equals(this.metadata, createOrderResponse.metadata) &&
        Objects.equals(this.id, createOrderResponse.id) &&
        Objects.equals(this.createDate, createOrderResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCodeId, quantity, securityId, date, price, orderBulkId, isRead, orderType, orderTicketId, portfolioId, accountId, modelId, metadata, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderResponse {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

