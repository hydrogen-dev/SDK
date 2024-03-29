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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * BankLink Object
 */
@ApiModel(description = "BankLink Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class BankLink {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("available_balance")
  private Double availableBalance = null;

  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("bank_account_holder")
  private String bankAccountHolder = null;

  @SerializedName("bank_account_name")
  private String bankAccountName = null;

  @SerializedName("bank_account_number")
  private String bankAccountNumber = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("institution_id")
  private UUID institutionId = null;

  @SerializedName("institution_name")
  private String institutionName = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("is_link_verified")
  private Boolean isLinkVerified = null;

  @SerializedName("link_verified_date")
  private LocalDate linkVerifiedDate = null;

  @SerializedName("mask")
  private String mask = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("routing")
  private String routing = null;

  @SerializedName("routing_wire")
  private String routingWire = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public BankLink accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public BankLink availableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(example = "available_balance", value = "availableBalance")
  public Double getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
  }

  public BankLink balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * balance
   * @return balance
  **/
  @ApiModelProperty(example = "1000.12", value = "balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public BankLink bankAccountHolder(String bankAccountHolder) {
    this.bankAccountHolder = bankAccountHolder;
    return this;
  }

   /**
   * bankAccountHolder
   * @return bankAccountHolder
  **/
  @ApiModelProperty(example = "XYZ", required = true, value = "bankAccountHolder")
  public String getBankAccountHolder() {
    return bankAccountHolder;
  }

  public void setBankAccountHolder(String bankAccountHolder) {
    this.bankAccountHolder = bankAccountHolder;
  }

  public BankLink bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

   /**
   * bankAccountName
   * @return bankAccountName
  **/
  @ApiModelProperty(example = "XYZ", value = "bankAccountName")
  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  public BankLink bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * bankAccountNumber
   * @return bankAccountNumber
  **/
  @ApiModelProperty(example = "566788991", required = true, value = "bankAccountNumber")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public BankLink businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "businessId")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public BankLink clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public BankLink createDate(OffsetDateTime createDate) {
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

  public BankLink currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankLink id(UUID id) {
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

  public BankLink institutionId(UUID institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * institutionId
   * @return institutionId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "institutionId")
  public UUID getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(UUID institutionId) {
    this.institutionId = institutionId;
  }

  public BankLink institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

   /**
   * institutionName
   * @return institutionName
  **/
  @ApiModelProperty(example = "xyz", required = true, value = "institutionName")
  public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public BankLink isActive(Boolean isActive) {
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

  public BankLink isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * isDefault
   * @return isDefault
  **/
  @ApiModelProperty(example = "false", value = "isDefault")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public BankLink isLinkVerified(Boolean isLinkVerified) {
    this.isLinkVerified = isLinkVerified;
    return this;
  }

   /**
   * isLinkVerified
   * @return isLinkVerified
  **/
  @ApiModelProperty(example = "true", value = "isLinkVerified")
  public Boolean isIsLinkVerified() {
    return isLinkVerified;
  }

  public void setIsLinkVerified(Boolean isLinkVerified) {
    this.isLinkVerified = isLinkVerified;
  }

  public BankLink linkVerifiedDate(LocalDate linkVerifiedDate) {
    this.linkVerifiedDate = linkVerifiedDate;
    return this;
  }

   /**
   * linkVerifiedDate
   * @return linkVerifiedDate
  **/
  @ApiModelProperty(example = "2017-11-01", value = "linkVerifiedDate")
  public LocalDate getLinkVerifiedDate() {
    return linkVerifiedDate;
  }

  public void setLinkVerifiedDate(LocalDate linkVerifiedDate) {
    this.linkVerifiedDate = linkVerifiedDate;
  }

  public BankLink mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * mask
   * @return mask
  **/
  @ApiModelProperty(value = "mask")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
  }

  public BankLink metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BankLink putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public BankLink routing(String routing) {
    this.routing = routing;
    return this;
  }

   /**
   * routing
   * @return routing
  **/
  @ApiModelProperty(example = "091000022", required = true, value = "routing")
  public String getRouting() {
    return routing;
  }

  public void setRouting(String routing) {
    this.routing = routing;
  }

  public BankLink routingWire(String routingWire) {
    this.routingWire = routingWire;
    return this;
  }

   /**
   * routingWire
   * @return routingWire
  **/
  @ApiModelProperty(example = "routing_wire", value = "routingWire")
  public String getRoutingWire() {
    return routingWire;
  }

  public void setRoutingWire(String routingWire) {
    this.routingWire = routingWire;
  }

  public BankLink secondaryId(String secondaryId) {
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

  public BankLink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(example = "saving", value = "type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BankLink updateDate(OffsetDateTime updateDate) {
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
    BankLink bankLink = (BankLink) o;
    return Objects.equals(this.accountId, bankLink.accountId) &&
        Objects.equals(this.availableBalance, bankLink.availableBalance) &&
        Objects.equals(this.balance, bankLink.balance) &&
        Objects.equals(this.bankAccountHolder, bankLink.bankAccountHolder) &&
        Objects.equals(this.bankAccountName, bankLink.bankAccountName) &&
        Objects.equals(this.bankAccountNumber, bankLink.bankAccountNumber) &&
        Objects.equals(this.businessId, bankLink.businessId) &&
        Objects.equals(this.clientId, bankLink.clientId) &&
        Objects.equals(this.createDate, bankLink.createDate) &&
        Objects.equals(this.currencyCode, bankLink.currencyCode) &&
        Objects.equals(this.id, bankLink.id) &&
        Objects.equals(this.institutionId, bankLink.institutionId) &&
        Objects.equals(this.institutionName, bankLink.institutionName) &&
        Objects.equals(this.isActive, bankLink.isActive) &&
        Objects.equals(this.isDefault, bankLink.isDefault) &&
        Objects.equals(this.isLinkVerified, bankLink.isLinkVerified) &&
        Objects.equals(this.linkVerifiedDate, bankLink.linkVerifiedDate) &&
        Objects.equals(this.mask, bankLink.mask) &&
        Objects.equals(this.metadata, bankLink.metadata) &&
        Objects.equals(this.routing, bankLink.routing) &&
        Objects.equals(this.routingWire, bankLink.routingWire) &&
        Objects.equals(this.secondaryId, bankLink.secondaryId) &&
        Objects.equals(this.type, bankLink.type) &&
        Objects.equals(this.updateDate, bankLink.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, availableBalance, balance, bankAccountHolder, bankAccountName, bankAccountNumber, businessId, clientId, createDate, currencyCode, id, institutionId, institutionName, isActive, isDefault, isLinkVerified, linkVerifiedDate, mask, metadata, routing, routingWire, secondaryId, type, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankLink {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bankAccountHolder: ").append(toIndentedString(bankAccountHolder)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isLinkVerified: ").append(toIndentedString(isLinkVerified)).append("\n");
    sb.append("    linkVerifiedDate: ").append(toIndentedString(linkVerifiedDate)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    routingWire: ").append(toIndentedString(routingWire)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

