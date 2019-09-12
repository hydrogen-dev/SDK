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
 * ChatPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class ChatPayload {
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

  @SerializedName("metadata")
  private Object metadata = null;

  public ChatPayload chatLog(String chatLog) {
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

  public ChatPayload assignedTo(UUID assignedTo) {
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

  public ChatPayload comments(String comments) {
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

  public ChatPayload isNotification(Boolean isNotification) {
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

  public ChatPayload isOpen(Boolean isOpen) {
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

  public ChatPayload secondaryId(String secondaryId) {
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

  public ChatPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the chat in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the chat in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatPayload chatPayload = (ChatPayload) o;
    return Objects.equals(this.chatLog, chatPayload.chatLog) &&
        Objects.equals(this.assignedTo, chatPayload.assignedTo) &&
        Objects.equals(this.comments, chatPayload.comments) &&
        Objects.equals(this.isNotification, chatPayload.isNotification) &&
        Objects.equals(this.isOpen, chatPayload.isOpen) &&
        Objects.equals(this.secondaryId, chatPayload.secondaryId) &&
        Objects.equals(this.metadata, chatPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatLog, assignedTo, comments, isNotification, isOpen, secondaryId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatPayload {\n");
    
    sb.append("    chatLog: ").append(toIndentedString(chatLog)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    isNotification: ").append(toIndentedString(isNotification)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

