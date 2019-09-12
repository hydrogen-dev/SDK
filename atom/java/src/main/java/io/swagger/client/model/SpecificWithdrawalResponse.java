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
import io.swagger.client.model.CreateWithdrawalResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * SpecificWithdrawalResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class SpecificWithdrawalResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("funding_id")
  private UUID fundingId = null;

  @SerializedName("withdrawal_date")
  private String withdrawalDate = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("fees")
  private String fees = null;

  @SerializedName("last_request_date")
  private String lastRequestDate = null;

  @SerializedName("received_date")
  private String receivedDate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_time_stamp")
  private String statusTimeStamp = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificWithdrawalResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the withdrawal request
   * @return id
  **/
  @ApiModelProperty(value = "ID of the withdrawal request")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificWithdrawalResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime of the withdrawal request
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime of the withdrawal request")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificWithdrawalResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account that is the destination of the withdrawal
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID for the account that is the destination of the withdrawal")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SpecificWithdrawalResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount that is being withdrawn from the account
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount that is being withdrawn from the account")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SpecificWithdrawalResponse fundingId(UUID fundingId) {
    this.fundingId = fundingId;
    return this;
  }

   /**
   * The ID of the funding record that maps to this withdrawal
   * @return fundingId
  **/
  @ApiModelProperty(required = true, value = "The ID of the funding record that maps to this withdrawal")
  public UUID getFundingId() {
    return fundingId;
  }

  public void setFundingId(UUID fundingId) {
    this.fundingId = fundingId;
  }

  public SpecificWithdrawalResponse withdrawalDate(String withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
    return this;
  }

   /**
   * Date and time that the withdrawal was made
   * @return withdrawalDate
  **/
  @ApiModelProperty(required = true, value = "Date and time that the withdrawal was made")
  public String getWithdrawalDate() {
    return withdrawalDate;
  }

  public void setWithdrawalDate(String withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
  }

  public SpecificWithdrawalResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Bank account number that is the destination of the withdrawal
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Bank account number that is the destination of the withdrawal")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public SpecificWithdrawalResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comment for the withdrawal such as “Funded”
   * @return comments
  **/
  @ApiModelProperty(value = "Comment for the withdrawal such as “Funded”")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public SpecificWithdrawalResponse direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Label to indicate the direction of the transaction such as “Incoming” or “Outgoing”
   * @return direction
  **/
  @ApiModelProperty(value = "Label to indicate the direction of the transaction such as “Incoming” or “Outgoing”")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public SpecificWithdrawalResponse fees(String fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Any fees associated with the withdrawal, especially for an investment account
   * @return fees
  **/
  @ApiModelProperty(value = "Any fees associated with the withdrawal, especially for an investment account")
  public String getFees() {
    return fees;
  }

  public void setFees(String fees) {
    this.fees = fees;
  }

  public SpecificWithdrawalResponse lastRequestDate(String lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
    return this;
  }

   /**
   * In the case of recurring withdrawals, the date and time that the withdrawal was last requested
   * @return lastRequestDate
  **/
  @ApiModelProperty(value = "In the case of recurring withdrawals, the date and time that the withdrawal was last requested")
  public String getLastRequestDate() {
    return lastRequestDate;
  }

  public void setLastRequestDate(String lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
  }

  public SpecificWithdrawalResponse receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Date and time that the withdrawal was received
   * @return receivedDate
  **/
  @ApiModelProperty(value = "Date and time that the withdrawal was received")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public SpecificWithdrawalResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the transaction such as “Processing”
   * @return status
  **/
  @ApiModelProperty(value = "Status of the transaction such as “Processing”")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SpecificWithdrawalResponse statusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
    return this;
  }

   /**
   * Date and time that the status of the record was last updated
   * @return statusTimeStamp
  **/
  @ApiModelProperty(value = "Date and time that the status of the record was last updated")
  public String getStatusTimeStamp() {
    return statusTimeStamp;
  }

  public void setStatusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
  }

  public SpecificWithdrawalResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the payment type such as “check, “wire”, etc.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the payment type such as “check, “wire”, etc.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SpecificWithdrawalResponse secondaryId(String secondaryId) {
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

  public SpecificWithdrawalResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the withdrawal in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the withdrawal in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public SpecificWithdrawalResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the withdrawal request was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the withdrawal request was last updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificWithdrawalResponse specificWithdrawalResponse = (SpecificWithdrawalResponse) o;
    return Objects.equals(this.id, specificWithdrawalResponse.id) &&
        Objects.equals(this.createDate, specificWithdrawalResponse.createDate) &&
        Objects.equals(this.accountId, specificWithdrawalResponse.accountId) &&
        Objects.equals(this.amount, specificWithdrawalResponse.amount) &&
        Objects.equals(this.fundingId, specificWithdrawalResponse.fundingId) &&
        Objects.equals(this.withdrawalDate, specificWithdrawalResponse.withdrawalDate) &&
        Objects.equals(this.accountNumber, specificWithdrawalResponse.accountNumber) &&
        Objects.equals(this.comments, specificWithdrawalResponse.comments) &&
        Objects.equals(this.direction, specificWithdrawalResponse.direction) &&
        Objects.equals(this.fees, specificWithdrawalResponse.fees) &&
        Objects.equals(this.lastRequestDate, specificWithdrawalResponse.lastRequestDate) &&
        Objects.equals(this.receivedDate, specificWithdrawalResponse.receivedDate) &&
        Objects.equals(this.status, specificWithdrawalResponse.status) &&
        Objects.equals(this.statusTimeStamp, specificWithdrawalResponse.statusTimeStamp) &&
        Objects.equals(this.type, specificWithdrawalResponse.type) &&
        Objects.equals(this.secondaryId, specificWithdrawalResponse.secondaryId) &&
        Objects.equals(this.metadata, specificWithdrawalResponse.metadata) &&
        Objects.equals(this.updateDate, specificWithdrawalResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, accountId, amount, fundingId, withdrawalDate, accountNumber, comments, direction, fees, lastRequestDate, receivedDate, status, statusTimeStamp, type, secondaryId, metadata, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificWithdrawalResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fundingId: ").append(toIndentedString(fundingId)).append("\n");
    sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    lastRequestDate: ").append(toIndentedString(lastRequestDate)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusTimeStamp: ").append(toIndentedString(statusTimeStamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

