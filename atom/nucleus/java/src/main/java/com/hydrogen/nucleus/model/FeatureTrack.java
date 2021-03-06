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

import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Feature Track Object
 */
@ApiModel(description = "Feature Track Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class FeatureTrack {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("feature_id")
  private UUID featureId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public FeatureTrack clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "2feae367-77be-4613-9cd0-f62fd5b3cff9", required = true, value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public FeatureTrack featureId(UUID featureId) {
    this.featureId = featureId;
    return this;
  }

   /**
   * feature_id
   * @return featureId
  **/
  @ApiModelProperty(example = "2feae367-77be-4613-9cd0-f62fd5b3cff9", required = true, value = "feature_id")
  public UUID getFeatureId() {
    return featureId;
  }

  public void setFeatureId(UUID featureId) {
    this.featureId = featureId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
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
    FeatureTrack featureTrack = (FeatureTrack) o;
    return Objects.equals(this.clientId, featureTrack.clientId) &&
        Objects.equals(this.createDate, featureTrack.createDate) &&
        Objects.equals(this.featureId, featureTrack.featureId) &&
        Objects.equals(this.id, featureTrack.id) &&
        Objects.equals(this.metadata, featureTrack.metadata) &&
        Objects.equals(this.secondaryId, featureTrack.secondaryId) &&
        Objects.equals(this.updateDate, featureTrack.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, createDate, featureId, id, metadata, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureTrack {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

