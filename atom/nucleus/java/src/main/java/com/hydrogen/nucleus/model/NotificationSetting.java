/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
import org.threeten.bp.OffsetDateTime;

/**
 * Notification Setting Object
 */
@ApiModel(description = "Notification Setting Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class NotificationSetting {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("frequency_unit")
  private String frequencyUnit = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_receive")
  private Boolean isReceive = null;

  @SerializedName("last_run_date")
  private OffsetDateTime lastRunDate = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("notification_id")
  private UUID notificationId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("threshold_value")
  private Double thresholdValue = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public NotificationSetting clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "04638eb3-d94d-45d6-b6f3-c685bb5a6009", required = true, value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public NotificationSetting createDate(OffsetDateTime createDate) {
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

  public NotificationSetting frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * frequency
   * @return frequency
  **/
  @ApiModelProperty(example = "1", value = "frequency")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public NotificationSetting frequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * frequency_unit
   * @return frequencyUnit
  **/
  @ApiModelProperty(example = "one_time", value = "frequency_unit")
  public String getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public NotificationSetting id(UUID id) {
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

  public NotificationSetting isReceive(Boolean isReceive) {
    this.isReceive = isReceive;
    return this;
  }

   /**
   * is_receive
   * @return isReceive
  **/
  @ApiModelProperty(example = "true", value = "is_receive")
  public Boolean isIsReceive() {
    return isReceive;
  }

  public void setIsReceive(Boolean isReceive) {
    this.isReceive = isReceive;
  }

  public NotificationSetting lastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
    return this;
  }

   /**
   * last_run_date
   * @return lastRunDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "last_run_date")
  public OffsetDateTime getLastRunDate() {
    return lastRunDate;
  }

  public void setLastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
  }

  public NotificationSetting metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public NotificationSetting putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public NotificationSetting notificationId(UUID notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * notification_id
   * @return notificationId
  **/
  @ApiModelProperty(example = "04638eb3-d94d-45d6-b6f3-c685bb5a6009", required = true, value = "notification_id")
  public UUID getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(UUID notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationSetting secondaryId(String secondaryId) {
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

  public NotificationSetting thresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }

   /**
   * Get thresholdValue
   * @return thresholdValue
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public Double getThresholdValue() {
    return thresholdValue;
  }

  public void setThresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
  }

  public NotificationSetting updateDate(OffsetDateTime updateDate) {
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
    NotificationSetting notificationSetting = (NotificationSetting) o;
    return Objects.equals(this.clientId, notificationSetting.clientId) &&
        Objects.equals(this.createDate, notificationSetting.createDate) &&
        Objects.equals(this.frequency, notificationSetting.frequency) &&
        Objects.equals(this.frequencyUnit, notificationSetting.frequencyUnit) &&
        Objects.equals(this.id, notificationSetting.id) &&
        Objects.equals(this.isReceive, notificationSetting.isReceive) &&
        Objects.equals(this.lastRunDate, notificationSetting.lastRunDate) &&
        Objects.equals(this.metadata, notificationSetting.metadata) &&
        Objects.equals(this.notificationId, notificationSetting.notificationId) &&
        Objects.equals(this.secondaryId, notificationSetting.secondaryId) &&
        Objects.equals(this.thresholdValue, notificationSetting.thresholdValue) &&
        Objects.equals(this.updateDate, notificationSetting.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, createDate, frequency, frequencyUnit, id, isReceive, lastRunDate, metadata, notificationId, secondaryId, thresholdValue, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSetting {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isReceive: ").append(toIndentedString(isReceive)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
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

