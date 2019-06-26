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
 * BankLinkPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class BankLinkPayload {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("bank_account_holder")
  private String bankAccountHolder = null;

  @SerializedName("bank_account_number")
  private String bankAccountNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("routing")
  private String routing = null;

  @SerializedName("routing_wire")
  private String routingWire = null;

  @SerializedName("bank_account_name")
  private String bankAccountName = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("available_balance")
  private String availableBalance = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("is_link_verified")
  private Boolean isLinkVerified = false;

  @SerializedName("link_verified_date")
  private LocalDate linkVerifiedDate = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public BankLinkPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account to which the bank link belongs
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID for the account to which the bank link belongs")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public BankLinkPayload bankAccountHolder(String bankAccountHolder) {
    this.bankAccountHolder = bankAccountHolder;
    return this;
  }

   /**
   * Name of the individual that owns the bank account
   * @return bankAccountHolder
  **/
  @ApiModelProperty(required = true, value = "Name of the individual that owns the bank account")
  public String getBankAccountHolder() {
    return bankAccountHolder;
  }

  public void setBankAccountHolder(String bankAccountHolder) {
    this.bankAccountHolder = bankAccountHolder;
  }

  public BankLinkPayload bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * Account number of the bank account
   * @return bankAccountNumber
  **/
  @ApiModelProperty(required = true, value = "Account number of the bank account")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public BankLinkPayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the bank for the bank link, e.g. HSBC
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the bank for the bank link, e.g. HSBC")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankLinkPayload routing(String routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Routing number of the bank for the bank link
   * @return routing
  **/
  @ApiModelProperty(required = true, value = "Routing number of the bank for the bank link")
  public String getRouting() {
    return routing;
  }

  public void setRouting(String routing) {
    this.routing = routing;
  }

  public BankLinkPayload routingWire(String routingWire) {
    this.routingWire = routingWire;
    return this;
  }

   /**
   * Routing number of the bank for the bank link used for wire transfers
   * @return routingWire
  **/
  @ApiModelProperty(value = "Routing number of the bank for the bank link used for wire transfers")
  public String getRoutingWire() {
    return routingWire;
  }

  public void setRoutingWire(String routingWire) {
    this.routingWire = routingWire;
  }

  public BankLinkPayload bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

   /**
   * Name of the bank account, e.g. Mike’s HSBC Checking
   * @return bankAccountName
  **/
  @ApiModelProperty(value = "Name of the bank account, e.g. Mike’s HSBC Checking")
  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  public BankLinkPayload currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankLinkPayload balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Current balance of the bank account
   * @return balance
  **/
  @ApiModelProperty(value = "Current balance of the bank account")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public BankLinkPayload availableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Available balance of the bank account, usually taking into consideration pending transactions or available overdraft
   * @return availableBalance
  **/
  @ApiModelProperty(value = "Available balance of the bank account, usually taking into consideration pending transactions or available overdraft")
  public String getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
  }

  public BankLinkPayload type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Used to indicate the type of bank account for this bank link such as a ‘savings’ account
   * @return type
  **/
  @ApiModelProperty(value = "Used to indicate the type of bank account for this bank link such as a ‘savings’ account")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BankLinkPayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the bank link is active. Defaults to true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the bank link is active. Defaults to true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public BankLinkPayload isLinkVerified(Boolean isLinkVerified) {
    this.isLinkVerified = isLinkVerified;
    return this;
  }

   /**
   * Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified
   * @return isLinkVerified
  **/
  @ApiModelProperty(value = "Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified")
  public Boolean isIsLinkVerified() {
    return isLinkVerified;
  }

  public void setIsLinkVerified(Boolean isLinkVerified) {
    this.isLinkVerified = isLinkVerified;
  }

  public BankLinkPayload linkVerifiedDate(LocalDate linkVerifiedDate) {
    this.linkVerifiedDate = linkVerifiedDate;
    return this;
  }

   /**
   * Date and time that the bank link was verified
   * @return linkVerifiedDate
  **/
  @ApiModelProperty(value = "Date and time that the bank link was verified")
  public LocalDate getLinkVerifiedDate() {
    return linkVerifiedDate;
  }

  public void setLinkVerifiedDate(LocalDate linkVerifiedDate) {
    this.linkVerifiedDate = linkVerifiedDate;
  }

  public BankLinkPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the bank link in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the bank link in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public BankLinkPayload secondaryId(String secondaryId) {
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
    BankLinkPayload bankLinkPayload = (BankLinkPayload) o;
    return Objects.equals(this.accountId, bankLinkPayload.accountId) &&
        Objects.equals(this.bankAccountHolder, bankLinkPayload.bankAccountHolder) &&
        Objects.equals(this.bankAccountNumber, bankLinkPayload.bankAccountNumber) &&
        Objects.equals(this.name, bankLinkPayload.name) &&
        Objects.equals(this.routing, bankLinkPayload.routing) &&
        Objects.equals(this.routingWire, bankLinkPayload.routingWire) &&
        Objects.equals(this.bankAccountName, bankLinkPayload.bankAccountName) &&
        Objects.equals(this.currencyCode, bankLinkPayload.currencyCode) &&
        Objects.equals(this.balance, bankLinkPayload.balance) &&
        Objects.equals(this.availableBalance, bankLinkPayload.availableBalance) &&
        Objects.equals(this.type, bankLinkPayload.type) &&
        Objects.equals(this.isActive, bankLinkPayload.isActive) &&
        Objects.equals(this.isLinkVerified, bankLinkPayload.isLinkVerified) &&
        Objects.equals(this.linkVerifiedDate, bankLinkPayload.linkVerifiedDate) &&
        Objects.equals(this.metadata, bankLinkPayload.metadata) &&
        Objects.equals(this.secondaryId, bankLinkPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankAccountHolder, bankAccountNumber, name, routing, routingWire, bankAccountName, currencyCode, balance, availableBalance, type, isActive, isLinkVerified, linkVerifiedDate, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankLinkPayload {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankAccountHolder: ").append(toIndentedString(bankAccountHolder)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    routingWire: ").append(toIndentedString(routingWire)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isLinkVerified: ").append(toIndentedString(isLinkVerified)).append("\n");
    sb.append("    linkVerifiedDate: ").append(toIndentedString(linkVerifiedDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

