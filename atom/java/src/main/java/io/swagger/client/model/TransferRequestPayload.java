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
 * TransferRequestPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class TransferRequestPayload {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("account_holder")
  private String accountHolder = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("account_type_id")
  private UUID accountTypeId = null;

  @SerializedName("firm_name")
  private String firmName = null;

  @SerializedName("transfer_all_cash")
  private Boolean transferAllCash = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("dtc_number")
  private String dtcNumber = null;

  @SerializedName("roth_five_year")
  private Integer rothFiveYear = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("transfer_type")
  private String transferType = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public TransferRequestPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the transfer belongs
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account to which the transfer belongs")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public TransferRequestPayload accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Name of the individual that is the owner of the external account
   * @return accountHolder
  **/
  @ApiModelProperty(required = true, value = "Name of the individual that is the owner of the external account")
  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public TransferRequestPayload accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number for the external account that is the source of the funds
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Account number for the external account that is the source of the funds")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TransferRequestPayload accountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
    return this;
  }

   /**
   * The ID for the type of the account on your platform
   * @return accountTypeId
  **/
  @ApiModelProperty(required = true, value = "The ID for the type of the account on your platform")
  public UUID getAccountTypeId() {
    return accountTypeId;
  }

  public void setAccountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
  }

  public TransferRequestPayload firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * Name of the firm that previously held or holds the external account
   * @return firmName
  **/
  @ApiModelProperty(required = true, value = "Name of the firm that previously held or holds the external account")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public TransferRequestPayload transferAllCash(Boolean transferAllCash) {
    this.transferAllCash = transferAllCash;
    return this;
  }

   /**
   * Indicator if the external account should be entirely converted to cash to be transferred.
   * @return transferAllCash
  **/
  @ApiModelProperty(required = true, value = "Indicator if the external account should be entirely converted to cash to be transferred.")
  public Boolean isTransferAllCash() {
    return transferAllCash;
  }

  public void setTransferAllCash(Boolean transferAllCash) {
    this.transferAllCash = transferAllCash;
  }

  public TransferRequestPayload amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount that is transferred
   * @return amount
  **/
  @ApiModelProperty(value = "Amount that is transferred")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TransferRequestPayload comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment for the transfer such as “Funded”
   * @return comment
  **/
  @ApiModelProperty(value = "Comment for the transfer such as “Funded”")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public TransferRequestPayload dtcNumber(String dtcNumber) {
    this.dtcNumber = dtcNumber;
    return this;
  }

   /**
   * Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States
   * @return dtcNumber
  **/
  @ApiModelProperty(value = "Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States")
  public String getDtcNumber() {
    return dtcNumber;
  }

  public void setDtcNumber(String dtcNumber) {
    this.dtcNumber = dtcNumber;
  }

  public TransferRequestPayload rothFiveYear(Integer rothFiveYear) {
    this.rothFiveYear = rothFiveYear;
    return this;
  }

   /**
   * In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010)
   * @return rothFiveYear
  **/
  @ApiModelProperty(value = "In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010)")
  public Integer getRothFiveYear() {
    return rothFiveYear;
  }

  public void setRothFiveYear(Integer rothFiveYear) {
    this.rothFiveYear = rothFiveYear;
  }

  public TransferRequestPayload status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the transfer such as “Pending”
   * @return status
  **/
  @ApiModelProperty(value = "Status of the transfer such as “Pending”")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransferRequestPayload transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Type of transaction being made such as “wire” or “check”
   * @return transferType
  **/
  @ApiModelProperty(value = "Type of transaction being made such as “wire” or “check”")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public TransferRequestPayload secondaryId(String secondaryId) {
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
    TransferRequestPayload transferRequestPayload = (TransferRequestPayload) o;
    return Objects.equals(this.accountId, transferRequestPayload.accountId) &&
        Objects.equals(this.accountHolder, transferRequestPayload.accountHolder) &&
        Objects.equals(this.accountNumber, transferRequestPayload.accountNumber) &&
        Objects.equals(this.accountTypeId, transferRequestPayload.accountTypeId) &&
        Objects.equals(this.firmName, transferRequestPayload.firmName) &&
        Objects.equals(this.transferAllCash, transferRequestPayload.transferAllCash) &&
        Objects.equals(this.amount, transferRequestPayload.amount) &&
        Objects.equals(this.comment, transferRequestPayload.comment) &&
        Objects.equals(this.dtcNumber, transferRequestPayload.dtcNumber) &&
        Objects.equals(this.rothFiveYear, transferRequestPayload.rothFiveYear) &&
        Objects.equals(this.status, transferRequestPayload.status) &&
        Objects.equals(this.transferType, transferRequestPayload.transferType) &&
        Objects.equals(this.secondaryId, transferRequestPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountHolder, accountNumber, accountTypeId, firmName, transferAllCash, amount, comment, dtcNumber, rothFiveYear, status, transferType, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestPayload {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    transferAllCash: ").append(toIndentedString(transferAllCash)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    dtcNumber: ").append(toIndentedString(dtcNumber)).append("\n");
    sb.append("    rothFiveYear: ").append(toIndentedString(rothFiveYear)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

