/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * ChatInfo Object
 */
@ApiModel(description = "ChatInfo Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class ChatInfo {
  @SerializedName("assigned_to")
  private UUID assignedTo = null;

  @SerializedName("chat_log")
  private String chatLog = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_notification")
  private Boolean isNotification = null;

  @SerializedName("is_open")
  private Boolean isOpen = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public ChatInfo assignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * assignedTo
   * @return assignedTo
  **/
  @ApiModelProperty(example = "38eb9a3b-6e7d-4a36-ba8a-0e9e7b7c7a84", value = "assignedTo")
  public UUID getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(UUID assignedTo) {
    this.assignedTo = assignedTo;
  }

  public ChatInfo chatLog(String chatLog) {
    this.chatLog = chatLog;
    return this;
  }

   /**
   * chatInfo
   * @return chatLog
  **/
  @ApiModelProperty(example = "balance", required = true, value = "chatInfo")
  public String getChatLog() {
    return chatLog;
  }

  public void setChatLog(String chatLog) {
    this.chatLog = chatLog;
  }

  public ChatInfo comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * comments
   * @return comments
  **/
  @ApiModelProperty(example = "Investing", value = "comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public ChatInfo isNotification(Boolean isNotification) {
    this.isNotification = isNotification;
    return this;
  }

   /**
   * isNotification
   * @return isNotification
  **/
  @ApiModelProperty(example = "true", value = "isNotification")
  public Boolean isIsNotification() {
    return isNotification;
  }

  public void setIsNotification(Boolean isNotification) {
    this.isNotification = isNotification;
  }

  public ChatInfo isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * isOpen
   * @return isOpen
  **/
  @ApiModelProperty(example = "true", value = "isOpen")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public ChatInfo metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ChatInfo putMetadataItem(String key, String metadataItem) {
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
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatInfo chatInfo = (ChatInfo) o;
    return Objects.equals(this.assignedTo, chatInfo.assignedTo) &&
        Objects.equals(this.chatLog, chatInfo.chatLog) &&
        Objects.equals(this.comments, chatInfo.comments) &&
        Objects.equals(this.createDate, chatInfo.createDate) &&
        Objects.equals(this.id, chatInfo.id) &&
        Objects.equals(this.isNotification, chatInfo.isNotification) &&
        Objects.equals(this.isOpen, chatInfo.isOpen) &&
        Objects.equals(this.metadata, chatInfo.metadata) &&
        Objects.equals(this.secondaryId, chatInfo.secondaryId) &&
        Objects.equals(this.updateDate, chatInfo.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedTo, chatLog, comments, createDate, id, isNotification, isOpen, metadata, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatInfo {\n");
    
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    chatLog: ").append(toIndentedString(chatLog)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isNotification: ").append(toIndentedString(isNotification)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

