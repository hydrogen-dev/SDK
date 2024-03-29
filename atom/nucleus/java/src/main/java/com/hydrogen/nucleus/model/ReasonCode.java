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
import org.threeten.bp.OffsetDateTime;

/**
 * ReasonCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class ReasonCode {
  @SerializedName("category")
  private String category = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("reason_code")
  private String reasonCode = null;

  @SerializedName("reason_code_description")
  private String reasonCodeDescription = null;

  @SerializedName("reason_type")
  private String reasonType = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public ReasonCode category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category
   * @return category
  **/
  @ApiModelProperty(example = "Deposit", value = "category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ReasonCode createDate(OffsetDateTime createDate) {
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

  public ReasonCode id(UUID id) {
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

  public ReasonCode metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ReasonCode putMetadataItem(String key, String metadataItem) {
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

  public ReasonCode reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(example = "codeSell1543998799676", required = true, value = "reasonCode")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ReasonCode reasonCodeDescription(String reasonCodeDescription) {
    this.reasonCodeDescription = reasonCodeDescription;
    return this;
  }

   /**
   * reasonCodeDescription
   * @return reasonCodeDescription
  **/
  @ApiModelProperty(example = "Bank deposit ACH", value = "reasonCodeDescription")
  public String getReasonCodeDescription() {
    return reasonCodeDescription;
  }

  public void setReasonCodeDescription(String reasonCodeDescription) {
    this.reasonCodeDescription = reasonCodeDescription;
  }

  public ReasonCode reasonType(String reasonType) {
    this.reasonType = reasonType;
    return this;
  }

   /**
   * reasonType
   * @return reasonType
  **/
  @ApiModelProperty(example = "ACH", value = "reasonType")
  public String getReasonType() {
    return reasonType;
  }

  public void setReasonType(String reasonType) {
    this.reasonType = reasonType;
  }

  public ReasonCode secondaryId(String secondaryId) {
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

  public ReasonCode subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * subcategory
   * @return subcategory
  **/
  @ApiModelProperty(example = "Bank Deposit", value = "subcategory")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public ReasonCode updateDate(OffsetDateTime updateDate) {
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
    ReasonCode reasonCode = (ReasonCode) o;
    return Objects.equals(this.category, reasonCode.category) &&
        Objects.equals(this.createDate, reasonCode.createDate) &&
        Objects.equals(this.id, reasonCode.id) &&
        Objects.equals(this.metadata, reasonCode.metadata) &&
        Objects.equals(this.reasonCode, reasonCode.reasonCode) &&
        Objects.equals(this.reasonCodeDescription, reasonCode.reasonCodeDescription) &&
        Objects.equals(this.reasonType, reasonCode.reasonType) &&
        Objects.equals(this.secondaryId, reasonCode.secondaryId) &&
        Objects.equals(this.subcategory, reasonCode.subcategory) &&
        Objects.equals(this.updateDate, reasonCode.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, createDate, id, metadata, reasonCode, reasonCodeDescription, reasonType, secondaryId, subcategory, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReasonCode {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonCodeDescription: ").append(toIndentedString(reasonCodeDescription)).append("\n");
    sb.append("    reasonType: ").append(toIndentedString(reasonType)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
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

