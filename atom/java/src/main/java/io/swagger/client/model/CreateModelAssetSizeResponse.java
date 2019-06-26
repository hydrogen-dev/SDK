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
import io.swagger.client.model.ModelAssetSizePayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateModelAssetSizeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class CreateModelAssetSizeResponse {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("asset_size")
  private Double assetSize = null;

  @SerializedName("is_reconciled")
  private Boolean isReconciled = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateModelAssetSizeResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for this asset size record
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date for this asset size record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CreateModelAssetSizeResponse assetSize(Double assetSize) {
    this.assetSize = assetSize;
    return this;
  }

   /**
   * “Growth of a dollar” within the model on the particular date
   * @return assetSize
  **/
  @ApiModelProperty(required = true, value = "“Growth of a dollar” within the model on the particular date")
  public Double getAssetSize() {
    return assetSize;
  }

  public void setAssetSize(Double assetSize) {
    this.assetSize = assetSize;
  }

  public CreateModelAssetSizeResponse isReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
    return this;
  }

   /**
   * Indicates the asset size record is reconciled. true means it is reconciled
   * @return isReconciled
  **/
  @ApiModelProperty(required = true, value = "Indicates the asset size record is reconciled. true means it is reconciled")
  public Boolean isIsReconciled() {
    return isReconciled;
  }

  public void setIsReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
  }

  public CreateModelAssetSizeResponse modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model for the asset size record
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model for the asset size record")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public CreateModelAssetSizeResponse secondaryId(String secondaryId) {
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

  public CreateModelAssetSizeResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the model asset size
   * @return id
  **/
  @ApiModelProperty(value = "ID of the model asset size")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateModelAssetSizeResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the model asset size was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the model asset size was created")
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
    CreateModelAssetSizeResponse createModelAssetSizeResponse = (CreateModelAssetSizeResponse) o;
    return Objects.equals(this.date, createModelAssetSizeResponse.date) &&
        Objects.equals(this.assetSize, createModelAssetSizeResponse.assetSize) &&
        Objects.equals(this.isReconciled, createModelAssetSizeResponse.isReconciled) &&
        Objects.equals(this.modelId, createModelAssetSizeResponse.modelId) &&
        Objects.equals(this.secondaryId, createModelAssetSizeResponse.secondaryId) &&
        Objects.equals(this.id, createModelAssetSizeResponse.id) &&
        Objects.equals(this.createDate, createModelAssetSizeResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, assetSize, isReconciled, modelId, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModelAssetSizeResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    assetSize: ").append(toIndentedString(assetSize)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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

