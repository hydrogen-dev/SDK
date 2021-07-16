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
 * Order Object
 */
@ApiModel(description = "Order Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Order {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("commission")
  private Double commission = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("order_bulk_id")
  private UUID orderBulkId = null;

  @SerializedName("order_ticket_id")
  private UUID orderTicketId = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("tmp_tracker_id")
  private UUID tmpTrackerId = null;

  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Order accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Order amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(example = "9000.0", value = "amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Order commission(Double commission) {
    this.commission = commission;
    return this;
  }

   /**
   * commission
   * @return commission
  **/
  @ApiModelProperty(example = "9000.0", value = "commission")
  public Double getCommission() {
    return commission;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public Order createDate(OffsetDateTime createDate) {
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

  public Order date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-09", required = true, value = "date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Order id(UUID id) {
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

  public Order isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * isRead
   * @return isRead
  **/
  @ApiModelProperty(example = "true", value = "isRead")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public Order metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Order putMetadataItem(String key, String metadataItem) {
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

  public Order modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public Order orderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
    return this;
  }

   /**
   * orderBulkId
   * @return orderBulkId
  **/
  @ApiModelProperty(example = "114556fe-ee78-431d-be5e-60ae08ddf9a7", value = "orderBulkId")
  public UUID getOrderBulkId() {
    return orderBulkId;
  }

  public void setOrderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
  }

  public Order orderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
    return this;
  }

   /**
   * orderTicketId
   * @return orderTicketId
  **/
  @ApiModelProperty(example = "5da53a30-49e6-4162-8728-58d6348bfb24", required = true, value = "orderTicketId")
  public UUID getOrderTicketId() {
    return orderTicketId;
  }

  public void setOrderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
  }

  public Order orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * orderType
   * @return orderType
  **/
  @ApiModelProperty(example = "bulk order", value = "orderType")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public Order portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "c34794e9-f927-468b-b47e-ea17c3d533c5", value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public Order price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * price
   * @return price
  **/
  @ApiModelProperty(example = "9000.0", value = "price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Order quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "100.0", value = "quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Order secondaryId(String secondaryId) {
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

  public Order securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * securityId
   * @return securityId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", required = true, value = "securityId")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public Order tmpTrackerId(UUID tmpTrackerId) {
    this.tmpTrackerId = tmpTrackerId;
    return this;
  }

   /**
   * Get tmpTrackerId
   * @return tmpTrackerId
  **/
  @ApiModelProperty(value = "")
  public UUID getTmpTrackerId() {
    return tmpTrackerId;
  }

  public void setTmpTrackerId(UUID tmpTrackerId) {
    this.tmpTrackerId = tmpTrackerId;
  }

  public Order transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * transactionCodeId
   * @return transactionCodeId
  **/
  @ApiModelProperty(example = "f5af397b-7d22-433f-b01e-8202184a6386", required = true, value = "transactionCodeId")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public Order updateDate(OffsetDateTime updateDate) {
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
    Order order = (Order) o;
    return Objects.equals(this.accountId, order.accountId) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.commission, order.commission) &&
        Objects.equals(this.createDate, order.createDate) &&
        Objects.equals(this.date, order.date) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.isRead, order.isRead) &&
        Objects.equals(this.metadata, order.metadata) &&
        Objects.equals(this.modelId, order.modelId) &&
        Objects.equals(this.orderBulkId, order.orderBulkId) &&
        Objects.equals(this.orderTicketId, order.orderTicketId) &&
        Objects.equals(this.orderType, order.orderType) &&
        Objects.equals(this.portfolioId, order.portfolioId) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.secondaryId, order.secondaryId) &&
        Objects.equals(this.securityId, order.securityId) &&
        Objects.equals(this.tmpTrackerId, order.tmpTrackerId) &&
        Objects.equals(this.transactionCodeId, order.transactionCodeId) &&
        Objects.equals(this.updateDate, order.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, commission, createDate, date, id, isRead, metadata, modelId, orderBulkId, orderTicketId, orderType, portfolioId, price, quantity, secondaryId, securityId, tmpTrackerId, transactionCodeId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    orderBulkId: ").append(toIndentedString(orderBulkId)).append("\n");
    sb.append("    orderTicketId: ").append(toIndentedString(orderTicketId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    tmpTrackerId: ").append(toIndentedString(tmpTrackerId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
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

