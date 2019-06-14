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
import io.swagger.client.model.CreateChatResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * SpecificChatResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class SpecificChatResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("chat_log")
  private String chatLog = null;

  @SerializedName("assigned_to")
  private UUID assignedTo = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("is_notification")
  private Boolean isNotification = true;

  @SerializedName("is_open")
  private Boolean isOpen = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificChatResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the chat log
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the chat log")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificChatResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the chat log was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the chat log was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificChatResponse chatLog(String chatLog) {
    this.chatLog = chatLog;
    return this;
  }

   /**
   * Short description of the subject of the chat
   * @return chatLog
  **/
  @ApiModelProperty(required = true, value = "Short description of the subject of the chat")
  public String getChatLog() {
    return chatLog;
  }

  public void setChatLog(String chatLog) {
    this.chatLog = chatLog;
  }

  public SpecificChatResponse assignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * The ID of the internal user to whom the chat is assigned
   * @return assignedTo
  **/
  @ApiModelProperty(value = "The ID of the internal user to whom the chat is assigned")
  public UUID getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
  }

  public SpecificChatResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Additional information on the content of the chat
   * @return comments
  **/
  @ApiModelProperty(value = "Additional information on the content of the chat")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public SpecificChatResponse isNotification(Boolean isNotification) {
    this.isNotification = isNotification;
    return this;
  }

   /**
   * Indicates if there is a notification associated with the chat log. Defaults to true or that there is a notification
   * @return isNotification
  **/
  @ApiModelProperty(value = "Indicates if there is a notification associated with the chat log. Defaults to true or that there is a notification")
  public Boolean isIsNotification() {
    return isNotification;
  }

  public void setIsNotification(Boolean isNotification) {
    this.isNotification = isNotification;
  }

  public SpecificChatResponse isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Indicates if the chat is still open. Defaults to true which indicates that the chat is still open
   * @return isOpen
  **/
  @ApiModelProperty(value = "Indicates if the chat is still open. Defaults to true which indicates that the chat is still open")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public SpecificChatResponse secondaryId(String secondaryId) {
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

  public SpecificChatResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the chat log was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the chat log was last updated")
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
    SpecificChatResponse specificChatResponse = (SpecificChatResponse) o;
    return Objects.equals(this.id, specificChatResponse.id) &&
        Objects.equals(this.createDate, specificChatResponse.createDate) &&
        Objects.equals(this.chatLog, specificChatResponse.chatLog) &&
        Objects.equals(this.assignedTo, specificChatResponse.assignedTo) &&
        Objects.equals(this.comments, specificChatResponse.comments) &&
        Objects.equals(this.isNotification, specificChatResponse.isNotification) &&
        Objects.equals(this.isOpen, specificChatResponse.isOpen) &&
        Objects.equals(this.secondaryId, specificChatResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificChatResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, chatLog, assignedTo, comments, isNotification, isOpen, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificChatResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    chatLog: ").append(toIndentedString(chatLog)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    isNotification: ").append(toIndentedString(isNotification)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

