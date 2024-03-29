/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * PortfolioAssetSizeLog Object
 */
@ApiModel(description = "PortfolioAssetSizeLog Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class PortfolioAssetSizeLog {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("asset_size")
  private Double assetSize = null;

  @SerializedName("asset_size_available")
  private Double assetSizeAvailable = null;

  @SerializedName("asset_size_pending")
  private Double assetSizePending = null;

  @SerializedName("cash_flow")
  private Double cashFlow = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public PortfolioAssetSizeLog accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", required = true, value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public PortfolioAssetSizeLog assetSize(Double assetSize) {
    this.assetSize = assetSize;
    return this;
  }

   /**
   * asset_size
   * @return assetSize
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "asset_size")
  public Double getAssetSize() {
    return assetSize;
  }

  public void setAssetSize(Double assetSize) {
    this.assetSize = assetSize;
  }

  public PortfolioAssetSizeLog assetSizeAvailable(Double assetSizeAvailable) {
    this.assetSizeAvailable = assetSizeAvailable;
    return this;
  }

   /**
   * asset_size_available
   * @return assetSizeAvailable
  **/
  @ApiModelProperty(example = "100.0", value = "asset_size_available")
  public Double getAssetSizeAvailable() {
    return assetSizeAvailable;
  }

  public void setAssetSizeAvailable(Double assetSizeAvailable) {
    this.assetSizeAvailable = assetSizeAvailable;
  }

  public PortfolioAssetSizeLog assetSizePending(Double assetSizePending) {
    this.assetSizePending = assetSizePending;
    return this;
  }

   /**
   * asset_size_pending
   * @return assetSizePending
  **/
  @ApiModelProperty(example = "100.0", value = "asset_size_pending")
  public Double getAssetSizePending() {
    return assetSizePending;
  }

  public void setAssetSizePending(Double assetSizePending) {
    this.assetSizePending = assetSizePending;
  }

  public PortfolioAssetSizeLog cashFlow(Double cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * cash_flow
   * @return cashFlow
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "cash_flow")
  public Double getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(Double cashFlow) {
    this.cashFlow = cashFlow;
  }

  public PortfolioAssetSizeLog createDate(OffsetDateTime createDate) {
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

  public PortfolioAssetSizeLog currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PortfolioAssetSizeLog date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-09T00:00:00+0000", required = true, value = "date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PortfolioAssetSizeLog id(UUID id) {
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

  public PortfolioAssetSizeLog modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", required = true, value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public PortfolioAssetSizeLog portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "c34794e9-f927-468b-b47e-ea17c3d533c5", required = true, value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public PortfolioAssetSizeLog secondaryId(String secondaryId) {
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

  public PortfolioAssetSizeLog updateDate(OffsetDateTime updateDate) {
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
    PortfolioAssetSizeLog portfolioAssetSizeLog = (PortfolioAssetSizeLog) o;
    return Objects.equals(this.accountId, portfolioAssetSizeLog.accountId) &&
        Objects.equals(this.assetSize, portfolioAssetSizeLog.assetSize) &&
        Objects.equals(this.assetSizeAvailable, portfolioAssetSizeLog.assetSizeAvailable) &&
        Objects.equals(this.assetSizePending, portfolioAssetSizeLog.assetSizePending) &&
        Objects.equals(this.cashFlow, portfolioAssetSizeLog.cashFlow) &&
        Objects.equals(this.createDate, portfolioAssetSizeLog.createDate) &&
        Objects.equals(this.currencyCode, portfolioAssetSizeLog.currencyCode) &&
        Objects.equals(this.date, portfolioAssetSizeLog.date) &&
        Objects.equals(this.id, portfolioAssetSizeLog.id) &&
        Objects.equals(this.modelId, portfolioAssetSizeLog.modelId) &&
        Objects.equals(this.portfolioId, portfolioAssetSizeLog.portfolioId) &&
        Objects.equals(this.secondaryId, portfolioAssetSizeLog.secondaryId) &&
        Objects.equals(this.updateDate, portfolioAssetSizeLog.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, assetSize, assetSizeAvailable, assetSizePending, cashFlow, createDate, currencyCode, date, id, modelId, portfolioId, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioAssetSizeLog {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    assetSize: ").append(toIndentedString(assetSize)).append("\n");
    sb.append("    assetSizeAvailable: ").append(toIndentedString(assetSizeAvailable)).append("\n");
    sb.append("    assetSizePending: ").append(toIndentedString(assetSizePending)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

