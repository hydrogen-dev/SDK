/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * RebalancingSignalRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class RebalancingSignalRequest {
  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("update_model")
  private Boolean updateModel = false;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("initial_weights")
  private Object initialWeights = null;

  @SerializedName("settings")
  private Settings settings = null;

  public RebalancingSignalRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public RebalancingSignalRequest updateModel(Boolean updateModel) {
    this.updateModel = updateModel;
    return this;
  }

   /**
   * Get updateModel
   * @return updateModel
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateModel() {
    return updateModel;
  }

  public void setUpdateModel(Boolean updateModel) {
    this.updateModel = updateModel;
  }

  public RebalancingSignalRequest modelId(UUID modelId) {
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

  public RebalancingSignalRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RebalancingSignalRequest initialWeights(Object initialWeights) {
    this.initialWeights = initialWeights;
    return this;
  }

   /**
   * Get initialWeights
   * @return initialWeights
  **/
  @ApiModelProperty(value = "")
  public Object getInitialWeights() {
    return initialWeights;
  }

  public void setInitialWeights(Object initialWeights) {
    this.initialWeights = initialWeights;
  }

  public RebalancingSignalRequest settings(Settings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public Settings getSettings() {
    return settings;
  }

  public void setSettings(Settings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebalancingSignalRequest rebalancingSignalRequest = (RebalancingSignalRequest) o;
    return Objects.equals(this.endDate, rebalancingSignalRequest.endDate) &&
        Objects.equals(this.updateModel, rebalancingSignalRequest.updateModel) &&
        Objects.equals(this.modelId, rebalancingSignalRequest.modelId) &&
        Objects.equals(this.startDate, rebalancingSignalRequest.startDate) &&
        Objects.equals(this.initialWeights, rebalancingSignalRequest.initialWeights) &&
        Objects.equals(this.settings, rebalancingSignalRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, updateModel, modelId, startDate, initialWeights, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebalancingSignalRequest {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updateModel: ").append(toIndentedString(updateModel)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    initialWeights: ").append(toIndentedString(initialWeights)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

