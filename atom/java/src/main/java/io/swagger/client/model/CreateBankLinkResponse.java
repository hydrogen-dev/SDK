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
import io.swagger.client.model.BankLinkPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateBankLinkResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class CreateBankLinkResponse {
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

  @SerializedName("mask")
  private String mask = null;

  @SerializedName("bank_account_name")
  private String bankAccountName = null;

  @SerializedName("client_id")
  private UUID clientId = null;

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

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateBankLinkResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account to which the bank link belongs
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID for the account to which the bank link belongs")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public CreateBankLinkResponse bankAccountHolder(String bankAccountHolder) {
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

  public CreateBankLinkResponse bankAccountNumber(String bankAccountNumber) {
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

  public CreateBankLinkResponse name(String name) {
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

  public CreateBankLinkResponse routing(String routing) {
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

  public CreateBankLinkResponse routingWire(String routingWire) {
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

  public CreateBankLinkResponse mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Masked version of the bank account number for this bank link
   * @return mask
  **/
  @ApiModelProperty(value = "Masked version of the bank account number for this bank link")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
  }

  public CreateBankLinkResponse bankAccountName(String bankAccountName) {
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

  public CreateBankLinkResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ID of the client to which the bank link belongs
   * @return clientId
  **/
  @ApiModelProperty(value = "ID of the client to which the bank link belongs")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public CreateBankLinkResponse currencyCode(String currencyCode) {
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

  public CreateBankLinkResponse balance(String balance) {
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

  public CreateBankLinkResponse availableBalance(String availableBalance) {
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

  public CreateBankLinkResponse type(String type) {
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

  public CreateBankLinkResponse isActive(Boolean isActive) {
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

  public CreateBankLinkResponse isLinkVerified(Boolean isLinkVerified) {
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

  public CreateBankLinkResponse linkVerifiedDate(LocalDate linkVerifiedDate) {
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

  public CreateBankLinkResponse metadata(Object metadata) {
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

  public CreateBankLinkResponse secondaryId(String secondaryId) {
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

  public CreateBankLinkResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the bank link
   * @return id
  **/
  @ApiModelProperty(value = "ID of the bank link")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateBankLinkResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the bank link was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the bank link was created")
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
    CreateBankLinkResponse createBankLinkResponse = (CreateBankLinkResponse) o;
    return Objects.equals(this.accountId, createBankLinkResponse.accountId) &&
        Objects.equals(this.bankAccountHolder, createBankLinkResponse.bankAccountHolder) &&
        Objects.equals(this.bankAccountNumber, createBankLinkResponse.bankAccountNumber) &&
        Objects.equals(this.name, createBankLinkResponse.name) &&
        Objects.equals(this.routing, createBankLinkResponse.routing) &&
        Objects.equals(this.routingWire, createBankLinkResponse.routingWire) &&
        Objects.equals(this.mask, createBankLinkResponse.mask) &&
        Objects.equals(this.bankAccountName, createBankLinkResponse.bankAccountName) &&
        Objects.equals(this.clientId, createBankLinkResponse.clientId) &&
        Objects.equals(this.currencyCode, createBankLinkResponse.currencyCode) &&
        Objects.equals(this.balance, createBankLinkResponse.balance) &&
        Objects.equals(this.availableBalance, createBankLinkResponse.availableBalance) &&
        Objects.equals(this.type, createBankLinkResponse.type) &&
        Objects.equals(this.isActive, createBankLinkResponse.isActive) &&
        Objects.equals(this.isLinkVerified, createBankLinkResponse.isLinkVerified) &&
        Objects.equals(this.linkVerifiedDate, createBankLinkResponse.linkVerifiedDate) &&
        Objects.equals(this.metadata, createBankLinkResponse.metadata) &&
        Objects.equals(this.secondaryId, createBankLinkResponse.secondaryId) &&
        Objects.equals(this.id, createBankLinkResponse.id) &&
        Objects.equals(this.createDate, createBankLinkResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankAccountHolder, bankAccountNumber, name, routing, routingWire, mask, bankAccountName, clientId, currencyCode, balance, availableBalance, type, isActive, isLinkVerified, linkVerifiedDate, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBankLinkResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankAccountHolder: ").append(toIndentedString(bankAccountHolder)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    routingWire: ").append(toIndentedString(routingWire)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isLinkVerified: ").append(toIndentedString(isLinkVerified)).append("\n");
    sb.append("    linkVerifiedDate: ").append(toIndentedString(linkVerifiedDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

