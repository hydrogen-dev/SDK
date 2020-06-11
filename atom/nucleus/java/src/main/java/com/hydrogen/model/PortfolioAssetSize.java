/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * PortfolioAssetSize Object
 */
@ApiModel(description = "PortfolioAssetSize Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class PortfolioAssetSize {
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
  private LocalDate date = null;

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

  public PortfolioAssetSize accountId(UUID accountId) {
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

  public PortfolioAssetSize assetSize(Double assetSize) {
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

  public PortfolioAssetSize assetSizeAvailable(Double assetSizeAvailable) {
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

  public PortfolioAssetSize assetSizePending(Double assetSizePending) {
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

  public PortfolioAssetSize cashFlow(Double cashFlow) {
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

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public PortfolioAssetSize currencyCode(String currencyCode) {
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

  public PortfolioAssetSize date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", required = true, value = "date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public PortfolioAssetSize id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * logId
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", required = true, value = "logId")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PortfolioAssetSize modelId(UUID modelId) {
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

  public PortfolioAssetSize portfolioId(UUID portfolioId) {
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

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioAssetSize portfolioAssetSize = (PortfolioAssetSize) o;
    return Objects.equals(this.accountId, portfolioAssetSize.accountId) &&
        Objects.equals(this.assetSize, portfolioAssetSize.assetSize) &&
        Objects.equals(this.assetSizeAvailable, portfolioAssetSize.assetSizeAvailable) &&
        Objects.equals(this.assetSizePending, portfolioAssetSize.assetSizePending) &&
        Objects.equals(this.cashFlow, portfolioAssetSize.cashFlow) &&
        Objects.equals(this.createDate, portfolioAssetSize.createDate) &&
        Objects.equals(this.currencyCode, portfolioAssetSize.currencyCode) &&
        Objects.equals(this.date, portfolioAssetSize.date) &&
        Objects.equals(this.id, portfolioAssetSize.id) &&
        Objects.equals(this.modelId, portfolioAssetSize.modelId) &&
        Objects.equals(this.portfolioId, portfolioAssetSize.portfolioId) &&
        Objects.equals(this.secondaryId, portfolioAssetSize.secondaryId) &&
        Objects.equals(this.updateDate, portfolioAssetSize.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, assetSize, assetSizeAvailable, assetSizePending, cashFlow, createDate, currencyCode, date, id, modelId, portfolioId, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioAssetSize {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
