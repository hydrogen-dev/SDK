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
 * CreateAggregationAccountBalanceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class CreateAggregationAccountBalanceResponse {
  @SerializedName("id")
  private UUID id = null;

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
  private Boolean isActive = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateAggregationAccountBalanceResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID for the aggregation account balance record
   * @return id
  **/
  @ApiModelProperty(value = "The ID for the aggregation account balance record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateAggregationAccountBalanceResponse aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * The ID of the aggregation account to which the balance record belongs
   * @return aggregationAccountId
  **/
  @ApiModelProperty(value = "The ID of the aggregation account to which the balance record belongs")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }

  public CreateAggregationAccountBalanceResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Alphabetic currency code for the currency of the balance, limited to 3 characters
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Alphabetic currency code for the currency of the balance, limited to 3 characters")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CreateAggregationAccountBalanceResponse balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Current balance of the aggregation account
   * @return balance
  **/
  @ApiModelProperty(value = "Current balance of the aggregation account")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public CreateAggregationAccountBalanceResponse availableBalance(String availableBalance) {
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

  public CreateAggregationAccountBalanceResponse balanceTimeStamp(String balanceTimeStamp) {
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

  public CreateAggregationAccountBalanceResponse isActive(Boolean isActive) {
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

  public CreateAggregationAccountBalanceResponse secondaryId(String secondaryId) {
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

  public CreateAggregationAccountBalanceResponse createDate(String createDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAggregationAccountBalanceResponse createAggregationAccountBalanceResponse = (CreateAggregationAccountBalanceResponse) o;
    return Objects.equals(this.id, createAggregationAccountBalanceResponse.id) &&
        Objects.equals(this.aggregationAccountId, createAggregationAccountBalanceResponse.aggregationAccountId) &&
        Objects.equals(this.currencyCode, createAggregationAccountBalanceResponse.currencyCode) &&
        Objects.equals(this.balance, createAggregationAccountBalanceResponse.balance) &&
        Objects.equals(this.availableBalance, createAggregationAccountBalanceResponse.availableBalance) &&
        Objects.equals(this.balanceTimeStamp, createAggregationAccountBalanceResponse.balanceTimeStamp) &&
        Objects.equals(this.isActive, createAggregationAccountBalanceResponse.isActive) &&
        Objects.equals(this.secondaryId, createAggregationAccountBalanceResponse.secondaryId) &&
        Objects.equals(this.createDate, createAggregationAccountBalanceResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, aggregationAccountId, currencyCode, balance, availableBalance, balanceTimeStamp, isActive, secondaryId, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAggregationAccountBalanceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    balanceTimeStamp: ").append(toIndentedString(balanceTimeStamp)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

