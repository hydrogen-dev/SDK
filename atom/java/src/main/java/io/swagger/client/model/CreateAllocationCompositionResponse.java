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
import io.swagger.client.model.AllocationCompositionPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateAllocationCompositionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class CreateAllocationCompositionResponse {
  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("current_weight")
  private Double currentWeight = null;

  @SerializedName("strategic_weight")
  private Double strategicWeight = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("core")
  private Boolean core = false;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateAllocationCompositionResponse allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * The ID of the allocation for which you are adding a composition record
   * @return allocationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the allocation for which you are adding a composition record")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public CreateAllocationCompositionResponse modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model that is assigned to the allocation
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model that is assigned to the allocation")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public CreateAllocationCompositionResponse currentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
    return this;
  }

   /**
   * The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100
   * @return currentWeight
  **/
  @ApiModelProperty(required = true, value = "The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100")
  public Double getCurrentWeight() {
    return currentWeight;
  }

  public void setCurrentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
  }

  public CreateAllocationCompositionResponse strategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
    return this;
  }

   /**
   * The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100
   * @return strategicWeight
  **/
  @ApiModelProperty(required = true, value = "The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100")
  public Double getStrategicWeight() {
    return strategicWeight;
  }

  public void setStrategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
  }

  public CreateAllocationCompositionResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date for this allocation composition record
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The date for this allocation composition record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CreateAllocationCompositionResponse core(Boolean core) {
    this.core = core;
    return this;
  }

   /**
   * Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model
   * @return core
  **/
  @ApiModelProperty(value = "Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model")
  public Boolean isCore() {
    return core;
  }

  public void setCore(Boolean core) {
    this.core = core;
  }

  public CreateAllocationCompositionResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the allocation composition
   * @return id
  **/
  @ApiModelProperty(value = "ID of the allocation composition")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateAllocationCompositionResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the allocation composition was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the allocation composition was created")
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
    CreateAllocationCompositionResponse createAllocationCompositionResponse = (CreateAllocationCompositionResponse) o;
    return Objects.equals(this.allocationId, createAllocationCompositionResponse.allocationId) &&
        Objects.equals(this.modelId, createAllocationCompositionResponse.modelId) &&
        Objects.equals(this.currentWeight, createAllocationCompositionResponse.currentWeight) &&
        Objects.equals(this.strategicWeight, createAllocationCompositionResponse.strategicWeight) &&
        Objects.equals(this.date, createAllocationCompositionResponse.date) &&
        Objects.equals(this.core, createAllocationCompositionResponse.core) &&
        Objects.equals(this.id, createAllocationCompositionResponse.id) &&
        Objects.equals(this.createDate, createAllocationCompositionResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, modelId, currentWeight, strategicWeight, date, core, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAllocationCompositionResponse {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    currentWeight: ").append(toIndentedString(currentWeight)).append("\n");
    sb.append("    strategicWeight: ").append(toIndentedString(strategicWeight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
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

