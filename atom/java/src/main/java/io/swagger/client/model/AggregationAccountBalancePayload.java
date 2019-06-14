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

/**
 * AggregationAccountBalancePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class AggregationAccountBalancePayload {
  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("available_balance")
  private String availableBalance = null;

  @SerializedName("balance_time_stamp")
  private String balanceTimeStamp = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public AggregationAccountBalancePayload aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * The ID of the aggregation account to which the balance record belongs
   * @return aggregationAccountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the aggregation account to which the balance record belongs")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }

  public AggregationAccountBalancePayload currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Alphabetic currency code for the currency of the balance, limited to 3 characters
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "Alphabetic currency code for the currency of the balance, limited to 3 characters")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AggregationAccountBalancePayload balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Balance of the aggregation account
   * @return balance
  **/
  @ApiModelProperty(value = "Balance of the aggregation account")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public AggregationAccountBalancePayload availableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft
   * @return availableBalance
  **/
  @ApiModelProperty(value = "Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft")
  public String getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
  }

  public AggregationAccountBalancePayload balanceTimeStamp(String balanceTimeStamp) {
    this.balanceTimeStamp = balanceTimeStamp;
    return this;
  }

   /**
   * Date and time for when the balance above applies, defaults to current timestamp
   * @return balanceTimeStamp
  **/
  @ApiModelProperty(value = "Date and time for when the balance above applies, defaults to current timestamp")
  public String getBalanceTimeStamp() {
    return balanceTimeStamp;
  }

  public void setBalanceTimeStamp(String balanceTimeStamp) {
    this.balanceTimeStamp = balanceTimeStamp;
  }

  public AggregationAccountBalancePayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AggregationAccountBalancePayload secondaryId(String secondaryId) {
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
    AggregationAccountBalancePayload aggregationAccountBalancePayload = (AggregationAccountBalancePayload) o;
    return Objects.equals(this.aggregationAccountId, aggregationAccountBalancePayload.aggregationAccountId) &&
        Objects.equals(this.currencyCode, aggregationAccountBalancePayload.currencyCode) &&
        Objects.equals(this.balance, aggregationAccountBalancePayload.balance) &&
        Objects.equals(this.availableBalance, aggregationAccountBalancePayload.availableBalance) &&
        Objects.equals(this.balanceTimeStamp, aggregationAccountBalancePayload.balanceTimeStamp) &&
        Objects.equals(this.isActive, aggregationAccountBalancePayload.isActive) &&
        Objects.equals(this.secondaryId, aggregationAccountBalancePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationAccountId, currencyCode, balance, availableBalance, balanceTimeStamp, isActive, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationAccountBalancePayload {\n");
    
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    balanceTimeStamp: ").append(toIndentedString(balanceTimeStamp)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

