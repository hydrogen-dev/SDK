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
import io.swagger.client.model.CreateDepositRequestResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * SpecificDepositRequestResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class SpecificDepositRequestResponse {
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

  @SerializedName("invested_date")
  private String investedDate = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("direction")
  private String direction = null;

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

  public SpecificDepositRequestResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the deposit request
   * @return id
  **/
  @ApiModelProperty(value = "ID of the deposit request")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificDepositRequestResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the deposit request was last updated
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the deposit request was last updated")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificDepositRequestResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account that is the destination of the deposit
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID for the account that is the destination of the deposit")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SpecificDepositRequestResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount that is being deposited
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount that is being deposited")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SpecificDepositRequestResponse fundingId(UUID fundingId) {
    this.fundingId = fundingId;
    return this;
  }

   /**
   * The ID of the funding record that maps to this deposit
   * @return fundingId
  **/
  @ApiModelProperty(required = true, value = "The ID of the funding record that maps to this deposit")
  public UUID getFundingId() {
    return fundingId;
  }

  public void setFundingId(UUID fundingId) {
    this.fundingId = fundingId;
  }

  public SpecificDepositRequestResponse investedDate(String investedDate) {
    this.investedDate = investedDate;
    return this;
  }

   /**
   * Date and time that the funds should be pulled from the funding request to be invested
   * @return investedDate
  **/
  @ApiModelProperty(required = true, value = "Date and time that the funds should be pulled from the funding request to be invested")
  public String getInvestedDate() {
    return investedDate;
  }

  public void setInvestedDate(String investedDate) {
    this.investedDate = investedDate;
  }

  public SpecificDepositRequestResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Bank account number that is the source of the deposit
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Bank account number that is the source of the deposit")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public SpecificDepositRequestResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comment for the deposit such as “Funded”
   * @return comments
  **/
  @ApiModelProperty(value = "Comment for the deposit such as “Funded”")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public SpecificDepositRequestResponse direction(String direction) {
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

  public SpecificDepositRequestResponse lastRequestDate(String lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
    return this;
  }

   /**
   * In the case of recurring deposits, the last date and time that the deposit was last requested
   * @return lastRequestDate
  **/
  @ApiModelProperty(value = "In the case of recurring deposits, the last date and time that the deposit was last requested")
  public String getLastRequestDate() {
    return lastRequestDate;
  }

  public void setLastRequestDate(String lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
  }

  public SpecificDepositRequestResponse receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Date and time that the deposit was received into the account
   * @return receivedDate
  **/
  @ApiModelProperty(value = "Date and time that the deposit was received into the account")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public SpecificDepositRequestResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the deposit transaction such as “Processing”. Use this field to track the status of the individual deposit if it is associated with a recurring Funding request
   * @return status
  **/
  @ApiModelProperty(value = "Status of the deposit transaction such as “Processing”. Use this field to track the status of the individual deposit if it is associated with a recurring Funding request")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SpecificDepositRequestResponse statusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
    return this;
  }

   /**
   * Date and time that the record was last updated
   * @return statusTimeStamp
  **/
  @ApiModelProperty(value = "Date and time that the record was last updated")
  public String getStatusTimeStamp() {
    return statusTimeStamp;
  }

  public void setStatusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
  }

  public SpecificDepositRequestResponse type(String type) {
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

  public SpecificDepositRequestResponse secondaryId(String secondaryId) {
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

  public SpecificDepositRequestResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the deposit in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the deposit in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public SpecificDepositRequestResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the deposit request was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the deposit request was last updated")
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
    SpecificDepositRequestResponse specificDepositRequestResponse = (SpecificDepositRequestResponse) o;
    return Objects.equals(this.id, specificDepositRequestResponse.id) &&
        Objects.equals(this.createDate, specificDepositRequestResponse.createDate) &&
        Objects.equals(this.accountId, specificDepositRequestResponse.accountId) &&
        Objects.equals(this.amount, specificDepositRequestResponse.amount) &&
        Objects.equals(this.fundingId, specificDepositRequestResponse.fundingId) &&
        Objects.equals(this.investedDate, specificDepositRequestResponse.investedDate) &&
        Objects.equals(this.accountNumber, specificDepositRequestResponse.accountNumber) &&
        Objects.equals(this.comments, specificDepositRequestResponse.comments) &&
        Objects.equals(this.direction, specificDepositRequestResponse.direction) &&
        Objects.equals(this.lastRequestDate, specificDepositRequestResponse.lastRequestDate) &&
        Objects.equals(this.receivedDate, specificDepositRequestResponse.receivedDate) &&
        Objects.equals(this.status, specificDepositRequestResponse.status) &&
        Objects.equals(this.statusTimeStamp, specificDepositRequestResponse.statusTimeStamp) &&
        Objects.equals(this.type, specificDepositRequestResponse.type) &&
        Objects.equals(this.secondaryId, specificDepositRequestResponse.secondaryId) &&
        Objects.equals(this.metadata, specificDepositRequestResponse.metadata) &&
        Objects.equals(this.updateDate, specificDepositRequestResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, accountId, amount, fundingId, investedDate, accountNumber, comments, direction, lastRequestDate, receivedDate, status, statusTimeStamp, type, secondaryId, metadata, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDepositRequestResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fundingId: ").append(toIndentedString(fundingId)).append("\n");
    sb.append("    investedDate: ").append(toIndentedString(investedDate)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

