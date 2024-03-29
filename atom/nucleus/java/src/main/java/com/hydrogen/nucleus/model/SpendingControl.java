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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * SpendingControl Object
 */
@ApiModel(description = "SpendingControl Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-23T10:29:50.096Z")
public class SpendingControl {
  @SerializedName("client_group")
  private String clientGroup = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("control_scope")
  private String controlScope = null;

  @SerializedName("control_type")
  private String controlType = null;

  @SerializedName("control_values")
  private List<String> controlValues = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("frequency_unit")
  private String frequencyUnit = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("limit_value")
  private Double limitValue = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public SpendingControl clientGroup(String clientGroup) {
    this.clientGroup = clientGroup;
    return this;
  }

   /**
   * client_group
   * @return clientGroup
  **/
  @ApiModelProperty(example = "card client group", value = "client_group")
  public String getClientGroup() {
    return clientGroup;
  }

  public void setClientGroup(String clientGroup) {
    this.clientGroup = clientGroup;
  }

  public SpendingControl clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "04638eb3-d94d-45d6-b6f3-c685bb5a6009", value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SpendingControl controlScope(String controlScope) {
    this.controlScope = controlScope;
    return this;
  }

   /**
   * controlScope
   * @return controlScope
  **/
  @ApiModelProperty(example = "merchant", required = true, value = "controlScope")
  public String getControlScope() {
    return controlScope;
  }

  public void setControlScope(String controlScope) {
    this.controlScope = controlScope;
  }

  public SpendingControl controlType(String controlType) {
    this.controlType = controlType;
    return this;
  }

   /**
   * controlType
   * @return controlType
  **/
  @ApiModelProperty(example = "spending_limit", required = true, value = "controlType")
  public String getControlType() {
    return controlType;
  }

  public void setControlType(String controlType) {
    this.controlType = controlType;
  }

  public SpendingControl controlValues(List<String> controlValues) {
    this.controlValues = controlValues;
    return this;
  }

  public SpendingControl addControlValuesItem(String controlValuesItem) {
    if (this.controlValues == null) {
      this.controlValues = new ArrayList<String>();
    }
    this.controlValues.add(controlValuesItem);
    return this;
  }

   /**
   * control_values
   * @return controlValues
  **/
  @ApiModelProperty(example = "[\"Entertainment\"]", value = "control_values")
  public List<String> getControlValues() {
    return controlValues;
  }

  public void setControlValues(List<String> controlValues) {
    this.controlValues = controlValues;
  }

  public SpendingControl createDate(OffsetDateTime createDate) {
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

  public SpendingControl currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SpendingControl description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "card spending description", value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SpendingControl frequency(Integer frequency) {
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

  public SpendingControl frequencyUnit(String frequencyUnit) {
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

  public SpendingControl id(UUID id) {
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

  public SpendingControl isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * is_active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "is_active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SpendingControl limitValue(Double limitValue) {
    this.limitValue = limitValue;
    return this;
  }

   /**
   * limitValue
   * @return limitValue
  **/
  @ApiModelProperty(example = "1000.0", value = "limitValue")
  public Double getLimitValue() {
    return limitValue;
  }

  public void setLimitValue(Double limitValue) {
    this.limitValue = limitValue;
  }

  public SpendingControl metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SpendingControl putMetadataItem(String key, String metadataItem) {
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

  public SpendingControl secondaryId(String secondaryId) {
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

  public SpendingControl updateDate(OffsetDateTime updateDate) {
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
    SpendingControl spendingControl = (SpendingControl) o;
    return Objects.equals(this.clientGroup, spendingControl.clientGroup) &&
        Objects.equals(this.clientId, spendingControl.clientId) &&
        Objects.equals(this.controlScope, spendingControl.controlScope) &&
        Objects.equals(this.controlType, spendingControl.controlType) &&
        Objects.equals(this.controlValues, spendingControl.controlValues) &&
        Objects.equals(this.createDate, spendingControl.createDate) &&
        Objects.equals(this.currencyCode, spendingControl.currencyCode) &&
        Objects.equals(this.description, spendingControl.description) &&
        Objects.equals(this.frequency, spendingControl.frequency) &&
        Objects.equals(this.frequencyUnit, spendingControl.frequencyUnit) &&
        Objects.equals(this.id, spendingControl.id) &&
        Objects.equals(this.isActive, spendingControl.isActive) &&
        Objects.equals(this.limitValue, spendingControl.limitValue) &&
        Objects.equals(this.metadata, spendingControl.metadata) &&
        Objects.equals(this.secondaryId, spendingControl.secondaryId) &&
        Objects.equals(this.updateDate, spendingControl.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientGroup, clientId, controlScope, controlType, controlValues, createDate, currencyCode, description, frequency, frequencyUnit, id, isActive, limitValue, metadata, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingControl {\n");
    
    sb.append("    clientGroup: ").append(toIndentedString(clientGroup)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    controlScope: ").append(toIndentedString(controlScope)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    controlValues: ").append(toIndentedString(controlValues)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    limitValue: ").append(toIndentedString(limitValue)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

