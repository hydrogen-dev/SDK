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
 * SupportTicketPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class SupportTicketPayload {
  @SerializedName("description")
  private String description = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("open_time")
  private LocalDate openTime = null;

  @SerializedName("close_time")
  private LocalDate closeTime = null;

  @SerializedName("assigned_to")
  private UUID assignedTo = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public SupportTicketPayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Details and description of the support ticket issue
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Details and description of the support ticket issue")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SupportTicketPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID for the client associated with the support ticket
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The ID for the client associated with the support ticket")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SupportTicketPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account associated with the support ticket
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID for the account associated with the support ticket")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SupportTicketPayload openTime(LocalDate openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * Date that the support ticket was opened
   * @return openTime
  **/
  @ApiModelProperty(required = true, value = "Date that the support ticket was opened")
  public LocalDate getOpenTime() {
    return openTime;
  }

  public void setOpenTime(LocalDate openTime) {
    this.openTime = openTime;
  }

  public SupportTicketPayload closeTime(LocalDate closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * Date that the support ticket was resolved and closed
   * @return closeTime
  **/
  @ApiModelProperty(value = "Date that the support ticket was resolved and closed")
  public LocalDate getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(LocalDate closeTime) {
    this.closeTime = closeTime;
  }

  public SupportTicketPayload assignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * The ID of the internal user to whom the support ticket is assigned to be resolved
   * @return assignedTo
  **/
  @ApiModelProperty(value = "The ID of the internal user to whom the support ticket is assigned to be resolved")
  public UUID getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
  }

  public SupportTicketPayload status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the support ticket such as closed
   * @return status
  **/
  @ApiModelProperty(value = "Status of the support ticket such as closed")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SupportTicketPayload subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Title of the support ticket relating to the underlying issue
   * @return subject
  **/
  @ApiModelProperty(value = "Title of the support ticket relating to the underlying issue")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SupportTicketPayload secondaryId(String secondaryId) {
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
    SupportTicketPayload supportTicketPayload = (SupportTicketPayload) o;
    return Objects.equals(this.description, supportTicketPayload.description) &&
        Objects.equals(this.clientId, supportTicketPayload.clientId) &&
        Objects.equals(this.accountId, supportTicketPayload.accountId) &&
        Objects.equals(this.openTime, supportTicketPayload.openTime) &&
        Objects.equals(this.closeTime, supportTicketPayload.closeTime) &&
        Objects.equals(this.assignedTo, supportTicketPayload.assignedTo) &&
        Objects.equals(this.status, supportTicketPayload.status) &&
        Objects.equals(this.subject, supportTicketPayload.subject) &&
        Objects.equals(this.secondaryId, supportTicketPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, clientId, accountId, openTime, closeTime, assignedTo, status, subject, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportTicketPayload {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

