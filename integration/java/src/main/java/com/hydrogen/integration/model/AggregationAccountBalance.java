/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

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
 * Aggregation Account Balance Object
 */
@ApiModel(description = "Aggregation Account Balance Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class AggregationAccountBalance {
  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("available_balance")
  private Double availableBalance = null;

  @SerializedName("available_credit")
  private Double availableCredit = null;

  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("balance_time_stamp")
  private OffsetDateTime balanceTimeStamp = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public AggregationAccountBalance aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * aggregationAccountId
   * @return aggregationAccountId
  **/
  @ApiModelProperty(example = "2feae367-77be-4613-9cd0-f62fd5b3cff9", value = "aggregationAccountId")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }

  public AggregationAccountBalance availableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(example = "10000.0", value = "availableBalance")
  public Double getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
  }

  public AggregationAccountBalance availableCredit(Double availableCredit) {
    this.availableCredit = availableCredit;
    return this;
  }

   /**
   * availableCredit
   * @return availableCredit
  **/
  @ApiModelProperty(example = "10000.0", value = "availableCredit")
  public Double getAvailableCredit() {
    return availableCredit;
  }

  public void setAvailableCredit(Double availableCredit) {
    this.availableCredit = availableCredit;
  }

  public AggregationAccountBalance balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * balance
   * @return balance
  **/
  @ApiModelProperty(example = "9000.0", value = "balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public AggregationAccountBalance balanceTimeStamp(OffsetDateTime balanceTimeStamp) {
    this.balanceTimeStamp = balanceTimeStamp;
    return this;
  }

   /**
   * balanceTimeStamp
   * @return balanceTimeStamp
  **/
  @ApiModelProperty(example = "2018-11-29T14:48:38.000+0000", required = true, value = "balanceTimeStamp")
  public OffsetDateTime getBalanceTimeStamp() {
    return balanceTimeStamp;
  }

  public void setBalanceTimeStamp(OffsetDateTime balanceTimeStamp) {
    this.balanceTimeStamp = balanceTimeStamp;
  }

  public AggregationAccountBalance createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2017-01-05T00:00:00.000+0000", value = "createDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public AggregationAccountBalance currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AggregationAccountBalance id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @ApiModelProperty(example = "1feae367-77be-4613-9cd0-f62fd5b3cff2", value = "id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AggregationAccountBalance isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AggregationAccountBalance secondaryId(String secondaryId) {
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

  public AggregationAccountBalance updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2017-01-05T00:00:00.000+0000", value = "updateDate")
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
    AggregationAccountBalance aggregationAccountBalance = (AggregationAccountBalance) o;
    return Objects.equals(this.aggregationAccountId, aggregationAccountBalance.aggregationAccountId) &&
        Objects.equals(this.availableBalance, aggregationAccountBalance.availableBalance) &&
        Objects.equals(this.availableCredit, aggregationAccountBalance.availableCredit) &&
        Objects.equals(this.balance, aggregationAccountBalance.balance) &&
        Objects.equals(this.balanceTimeStamp, aggregationAccountBalance.balanceTimeStamp) &&
        Objects.equals(this.createDate, aggregationAccountBalance.createDate) &&
        Objects.equals(this.currencyCode, aggregationAccountBalance.currencyCode) &&
        Objects.equals(this.id, aggregationAccountBalance.id) &&
        Objects.equals(this.isActive, aggregationAccountBalance.isActive) &&
        Objects.equals(this.secondaryId, aggregationAccountBalance.secondaryId) &&
        Objects.equals(this.updateDate, aggregationAccountBalance.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationAccountId, availableBalance, availableCredit, balance, balanceTimeStamp, createDate, currencyCode, id, isActive, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationAccountBalance {\n");
    
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceTimeStamp: ").append(toIndentedString(balanceTimeStamp)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

