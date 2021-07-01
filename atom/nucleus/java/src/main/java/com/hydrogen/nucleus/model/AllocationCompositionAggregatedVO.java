/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.2
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
import com.hydrogen.nucleus.model.AllocationCompositionModelHoldingsVO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * AllocationCompositionAggregatedVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class AllocationCompositionAggregatedVO {
  @SerializedName("allocation_composition_create_date")
  private OffsetDateTime allocationCompositionCreateDate = null;

  @SerializedName("allocation_composition_date")
  private LocalDate allocationCompositionDate = null;

  @SerializedName("allocation_composition_id")
  private UUID allocationCompositionId = null;

  @SerializedName("allocation_composition_update_date")
  private OffsetDateTime allocationCompositionUpdateDate = null;

  @SerializedName("model_category")
  private String modelCategory = null;

  @SerializedName("model_current_weight")
  private Double modelCurrentWeight = null;

  @SerializedName("model_description")
  private String modelDescription = null;

  @SerializedName("model_holdings")
  private List<AllocationCompositionModelHoldingsVO> modelHoldings = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("model_name")
  private String modelName = null;

  @SerializedName("model_secondary_id")
  private String modelSecondaryId = null;

  @SerializedName("model_strategic_weight")
  private Double modelStrategicWeight = null;

  public AllocationCompositionAggregatedVO allocationCompositionCreateDate(OffsetDateTime allocationCompositionCreateDate) {
    this.allocationCompositionCreateDate = allocationCompositionCreateDate;
    return this;
  }

   /**
   * Get allocationCompositionCreateDate
   * @return allocationCompositionCreateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAllocationCompositionCreateDate() {
    return allocationCompositionCreateDate;
  }

  public void setAllocationCompositionCreateDate(OffsetDateTime allocationCompositionCreateDate) {
    this.allocationCompositionCreateDate = allocationCompositionCreateDate;
  }

  public AllocationCompositionAggregatedVO allocationCompositionDate(LocalDate allocationCompositionDate) {
    this.allocationCompositionDate = allocationCompositionDate;
    return this;
  }

   /**
   * Get allocationCompositionDate
   * @return allocationCompositionDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getAllocationCompositionDate() {
    return allocationCompositionDate;
  }

  public void setAllocationCompositionDate(LocalDate allocationCompositionDate) {
    this.allocationCompositionDate = allocationCompositionDate;
  }

  public AllocationCompositionAggregatedVO allocationCompositionId(UUID allocationCompositionId) {
    this.allocationCompositionId = allocationCompositionId;
    return this;
  }

   /**
   * Get allocationCompositionId
   * @return allocationCompositionId
  **/
  @ApiModelProperty(value = "")
  public UUID getAllocationCompositionId() {
    return allocationCompositionId;
  }

  public void setAllocationCompositionId(UUID allocationCompositionId) {
    this.allocationCompositionId = allocationCompositionId;
  }

  public AllocationCompositionAggregatedVO allocationCompositionUpdateDate(OffsetDateTime allocationCompositionUpdateDate) {
    this.allocationCompositionUpdateDate = allocationCompositionUpdateDate;
    return this;
  }

   /**
   * Get allocationCompositionUpdateDate
   * @return allocationCompositionUpdateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAllocationCompositionUpdateDate() {
    return allocationCompositionUpdateDate;
  }

  public void setAllocationCompositionUpdateDate(OffsetDateTime allocationCompositionUpdateDate) {
    this.allocationCompositionUpdateDate = allocationCompositionUpdateDate;
  }

  public AllocationCompositionAggregatedVO modelCategory(String modelCategory) {
    this.modelCategory = modelCategory;
    return this;
  }

   /**
   * Get modelCategory
   * @return modelCategory
  **/
  @ApiModelProperty(value = "")
  public String getModelCategory() {
    return modelCategory;
  }

  public void setModelCategory(String modelCategory) {
    this.modelCategory = modelCategory;
  }

  public AllocationCompositionAggregatedVO modelCurrentWeight(Double modelCurrentWeight) {
    this.modelCurrentWeight = modelCurrentWeight;
    return this;
  }

   /**
   * Get modelCurrentWeight
   * @return modelCurrentWeight
  **/
  @ApiModelProperty(value = "")
  public Double getModelCurrentWeight() {
    return modelCurrentWeight;
  }

  public void setModelCurrentWeight(Double modelCurrentWeight) {
    this.modelCurrentWeight = modelCurrentWeight;
  }

  public AllocationCompositionAggregatedVO modelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
    return this;
  }

   /**
   * Get modelDescription
   * @return modelDescription
  **/
  @ApiModelProperty(value = "")
  public String getModelDescription() {
    return modelDescription;
  }

  public void setModelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
  }

  public AllocationCompositionAggregatedVO modelHoldings(List<AllocationCompositionModelHoldingsVO> modelHoldings) {
    this.modelHoldings = modelHoldings;
    return this;
  }

  public AllocationCompositionAggregatedVO addModelHoldingsItem(AllocationCompositionModelHoldingsVO modelHoldingsItem) {
    if (this.modelHoldings == null) {
      this.modelHoldings = new ArrayList<AllocationCompositionModelHoldingsVO>();
    }
    this.modelHoldings.add(modelHoldingsItem);
    return this;
  }

   /**
   * Get modelHoldings
   * @return modelHoldings
  **/
  @ApiModelProperty(value = "")
  public List<AllocationCompositionModelHoldingsVO> getModelHoldings() {
    return modelHoldings;
  }

  public void setModelHoldings(List<AllocationCompositionModelHoldingsVO> modelHoldings) {
    this.modelHoldings = modelHoldings;
  }

  public AllocationCompositionAggregatedVO modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(value = "")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public AllocationCompositionAggregatedVO modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @ApiModelProperty(value = "")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public AllocationCompositionAggregatedVO modelSecondaryId(String modelSecondaryId) {
    this.modelSecondaryId = modelSecondaryId;
    return this;
  }

   /**
   * Get modelSecondaryId
   * @return modelSecondaryId
  **/
  @ApiModelProperty(value = "")
  public String getModelSecondaryId() {
    return modelSecondaryId;
  }

  public void setModelSecondaryId(String modelSecondaryId) {
    this.modelSecondaryId = modelSecondaryId;
  }

  public AllocationCompositionAggregatedVO modelStrategicWeight(Double modelStrategicWeight) {
    this.modelStrategicWeight = modelStrategicWeight;
    return this;
  }

   /**
   * Get modelStrategicWeight
   * @return modelStrategicWeight
  **/
  @ApiModelProperty(value = "")
  public Double getModelStrategicWeight() {
    return modelStrategicWeight;
  }

  public void setModelStrategicWeight(Double modelStrategicWeight) {
    this.modelStrategicWeight = modelStrategicWeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationCompositionAggregatedVO allocationCompositionAggregatedVO = (AllocationCompositionAggregatedVO) o;
    return Objects.equals(this.allocationCompositionCreateDate, allocationCompositionAggregatedVO.allocationCompositionCreateDate) &&
        Objects.equals(this.allocationCompositionDate, allocationCompositionAggregatedVO.allocationCompositionDate) &&
        Objects.equals(this.allocationCompositionId, allocationCompositionAggregatedVO.allocationCompositionId) &&
        Objects.equals(this.allocationCompositionUpdateDate, allocationCompositionAggregatedVO.allocationCompositionUpdateDate) &&
        Objects.equals(this.modelCategory, allocationCompositionAggregatedVO.modelCategory) &&
        Objects.equals(this.modelCurrentWeight, allocationCompositionAggregatedVO.modelCurrentWeight) &&
        Objects.equals(this.modelDescription, allocationCompositionAggregatedVO.modelDescription) &&
        Objects.equals(this.modelHoldings, allocationCompositionAggregatedVO.modelHoldings) &&
        Objects.equals(this.modelId, allocationCompositionAggregatedVO.modelId) &&
        Objects.equals(this.modelName, allocationCompositionAggregatedVO.modelName) &&
        Objects.equals(this.modelSecondaryId, allocationCompositionAggregatedVO.modelSecondaryId) &&
        Objects.equals(this.modelStrategicWeight, allocationCompositionAggregatedVO.modelStrategicWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationCompositionCreateDate, allocationCompositionDate, allocationCompositionId, allocationCompositionUpdateDate, modelCategory, modelCurrentWeight, modelDescription, modelHoldings, modelId, modelName, modelSecondaryId, modelStrategicWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationCompositionAggregatedVO {\n");
    
    sb.append("    allocationCompositionCreateDate: ").append(toIndentedString(allocationCompositionCreateDate)).append("\n");
    sb.append("    allocationCompositionDate: ").append(toIndentedString(allocationCompositionDate)).append("\n");
    sb.append("    allocationCompositionId: ").append(toIndentedString(allocationCompositionId)).append("\n");
    sb.append("    allocationCompositionUpdateDate: ").append(toIndentedString(allocationCompositionUpdateDate)).append("\n");
    sb.append("    modelCategory: ").append(toIndentedString(modelCategory)).append("\n");
    sb.append("    modelCurrentWeight: ").append(toIndentedString(modelCurrentWeight)).append("\n");
    sb.append("    modelDescription: ").append(toIndentedString(modelDescription)).append("\n");
    sb.append("    modelHoldings: ").append(toIndentedString(modelHoldings)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelSecondaryId: ").append(toIndentedString(modelSecondaryId)).append("\n");
    sb.append("    modelStrategicWeight: ").append(toIndentedString(modelStrategicWeight)).append("\n");
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

