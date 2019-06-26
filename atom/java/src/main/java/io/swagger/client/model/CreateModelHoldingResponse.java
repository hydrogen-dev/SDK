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
import io.swagger.client.model.ModelHoldingPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateModelHoldingResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class CreateModelHoldingResponse {
  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("current_weight")
  private Double currentWeight = null;

  @SerializedName("strategic_weight")
  private Double strategicWeight = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateModelHoldingResponse modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model that the security holding record falls under
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model that the security holding record falls under")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public CreateModelHoldingResponse securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security included in this holding record
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security included in this holding record")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public CreateModelHoldingResponse currentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
    return this;
  }

   /**
   * Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100
   * @return currentWeight
  **/
  @ApiModelProperty(required = true, value = "Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100")
  public Double getCurrentWeight() {
    return currentWeight;
  }

  public void setCurrentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
  }

  public CreateModelHoldingResponse strategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
    return this;
  }

   /**
   * Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100
   * @return strategicWeight
  **/
  @ApiModelProperty(required = true, value = "Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100")
  public Double getStrategicWeight() {
    return strategicWeight;
  }

  public void setStrategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
  }

  public CreateModelHoldingResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the security weight
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of the security weight")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CreateModelHoldingResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the model holding in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the model holding in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateModelHoldingResponse secondaryId(String secondaryId) {
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

  public CreateModelHoldingResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the model holding
   * @return id
  **/
  @ApiModelProperty(value = "ID of the model holding")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateModelHoldingResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the model holding was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the model holding was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModelHoldingResponse createModelHoldingResponse = (CreateModelHoldingResponse) o;
    return Objects.equals(this.modelId, createModelHoldingResponse.modelId) &&
        Objects.equals(this.securityId, createModelHoldingResponse.securityId) &&
        Objects.equals(this.currentWeight, createModelHoldingResponse.currentWeight) &&
        Objects.equals(this.strategicWeight, createModelHoldingResponse.strategicWeight) &&
        Objects.equals(this.date, createModelHoldingResponse.date) &&
        Objects.equals(this.metadata, createModelHoldingResponse.metadata) &&
        Objects.equals(this.secondaryId, createModelHoldingResponse.secondaryId) &&
        Objects.equals(this.id, createModelHoldingResponse.id) &&
        Objects.equals(this.createDate, createModelHoldingResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, securityId, currentWeight, strategicWeight, date, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModelHoldingResponse {\n");
    
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    currentWeight: ").append(toIndentedString(currentWeight)).append("\n");
    sb.append("    strategicWeight: ").append(toIndentedString(strategicWeight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

