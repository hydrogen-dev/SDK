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
import com.hydrogen.nucleus.model.ClientViewGoalData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * VClientGoalViewData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class VClientGoalViewData {
  @SerializedName("client_asset_size")
  private Double clientAssetSize = null;

  @SerializedName("client_asset_size_date")
  private LocalDate clientAssetSizeDate = null;

  @SerializedName("client_first_name")
  private String clientFirstName = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("client_last_name")
  private String clientLastName = null;

  @SerializedName("client_view_goal_data")
  private List<ClientViewGoalData> clientViewGoalData = null;

  public VClientGoalViewData clientAssetSize(Double clientAssetSize) {
    this.clientAssetSize = clientAssetSize;
    return this;
  }

   /**
   * Get clientAssetSize
   * @return clientAssetSize
  **/
  @ApiModelProperty(value = "")
  public Double getClientAssetSize() {
    return clientAssetSize;
  }

  public void setClientAssetSize(Double clientAssetSize) {
    this.clientAssetSize = clientAssetSize;
  }

  public VClientGoalViewData clientAssetSizeDate(LocalDate clientAssetSizeDate) {
    this.clientAssetSizeDate = clientAssetSizeDate;
    return this;
  }

   /**
   * Get clientAssetSizeDate
   * @return clientAssetSizeDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getClientAssetSizeDate() {
    return clientAssetSizeDate;
  }

  public void setClientAssetSizeDate(LocalDate clientAssetSizeDate) {
    this.clientAssetSizeDate = clientAssetSizeDate;
  }

  public VClientGoalViewData clientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
    return this;
  }

   /**
   * Get clientFirstName
   * @return clientFirstName
  **/
  @ApiModelProperty(value = "")
  public String getClientFirstName() {
    return clientFirstName;
  }

  public void setClientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
  }

  public VClientGoalViewData clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public VClientGoalViewData clientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
    return this;
  }

   /**
   * Get clientLastName
   * @return clientLastName
  **/
  @ApiModelProperty(value = "")
  public String getClientLastName() {
    return clientLastName;
  }

  public void setClientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
  }

  public VClientGoalViewData clientViewGoalData(List<ClientViewGoalData> clientViewGoalData) {
    this.clientViewGoalData = clientViewGoalData;
    return this;
  }

  public VClientGoalViewData addClientViewGoalDataItem(ClientViewGoalData clientViewGoalDataItem) {
    if (this.clientViewGoalData == null) {
      this.clientViewGoalData = new ArrayList<ClientViewGoalData>();
    }
    this.clientViewGoalData.add(clientViewGoalDataItem);
    return this;
  }

   /**
   * Get clientViewGoalData
   * @return clientViewGoalData
  **/
  @ApiModelProperty(value = "")
  public List<ClientViewGoalData> getClientViewGoalData() {
    return clientViewGoalData;
  }

  public void setClientViewGoalData(List<ClientViewGoalData> clientViewGoalData) {
    this.clientViewGoalData = clientViewGoalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VClientGoalViewData vclientGoalViewData = (VClientGoalViewData) o;
    return Objects.equals(this.clientAssetSize, vclientGoalViewData.clientAssetSize) &&
        Objects.equals(this.clientAssetSizeDate, vclientGoalViewData.clientAssetSizeDate) &&
        Objects.equals(this.clientFirstName, vclientGoalViewData.clientFirstName) &&
        Objects.equals(this.clientId, vclientGoalViewData.clientId) &&
        Objects.equals(this.clientLastName, vclientGoalViewData.clientLastName) &&
        Objects.equals(this.clientViewGoalData, vclientGoalViewData.clientViewGoalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAssetSize, clientAssetSizeDate, clientFirstName, clientId, clientLastName, clientViewGoalData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VClientGoalViewData {\n");
    
    sb.append("    clientAssetSize: ").append(toIndentedString(clientAssetSize)).append("\n");
    sb.append("    clientAssetSizeDate: ").append(toIndentedString(clientAssetSizeDate)).append("\n");
    sb.append("    clientFirstName: ").append(toIndentedString(clientFirstName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientLastName: ").append(toIndentedString(clientLastName)).append("\n");
    sb.append("    clientViewGoalData: ").append(toIndentedString(clientViewGoalData)).append("\n");
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

