/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

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
import java.util.List;
import java.util.UUID;

/**
 * AchBalanceResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class AchBalanceResponseVO {
  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_asset_sizes_posted")
  private List<Object> nucleusAssetSizesPosted = null;

  @SerializedName("nucleus_asset_sizes_updated")
  private List<Object> nucleusAssetSizesUpdated = null;

  @SerializedName("nucleus_portfolio_id")
  private UUID nucleusPortfolioId = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public AchBalanceResponseVO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AchBalanceResponseVO nucleusAssetSizesPosted(List<Object> nucleusAssetSizesPosted) {
    this.nucleusAssetSizesPosted = nucleusAssetSizesPosted;
    return this;
  }

  public AchBalanceResponseVO addNucleusAssetSizesPostedItem(Object nucleusAssetSizesPostedItem) {
    if (this.nucleusAssetSizesPosted == null) {
      this.nucleusAssetSizesPosted = new ArrayList<Object>();
    }
    this.nucleusAssetSizesPosted.add(nucleusAssetSizesPostedItem);
    return this;
  }

   /**
   * Get nucleusAssetSizesPosted
   * @return nucleusAssetSizesPosted
  **/
  @ApiModelProperty(value = "")
  public List<Object> getNucleusAssetSizesPosted() {
    return nucleusAssetSizesPosted;
  }

  public void setNucleusAssetSizesPosted(List<Object> nucleusAssetSizesPosted) {
    this.nucleusAssetSizesPosted = nucleusAssetSizesPosted;
  }

  public AchBalanceResponseVO nucleusAssetSizesUpdated(List<Object> nucleusAssetSizesUpdated) {
    this.nucleusAssetSizesUpdated = nucleusAssetSizesUpdated;
    return this;
  }

  public AchBalanceResponseVO addNucleusAssetSizesUpdatedItem(Object nucleusAssetSizesUpdatedItem) {
    if (this.nucleusAssetSizesUpdated == null) {
      this.nucleusAssetSizesUpdated = new ArrayList<Object>();
    }
    this.nucleusAssetSizesUpdated.add(nucleusAssetSizesUpdatedItem);
    return this;
  }

   /**
   * Get nucleusAssetSizesUpdated
   * @return nucleusAssetSizesUpdated
  **/
  @ApiModelProperty(value = "")
  public List<Object> getNucleusAssetSizesUpdated() {
    return nucleusAssetSizesUpdated;
  }

  public void setNucleusAssetSizesUpdated(List<Object> nucleusAssetSizesUpdated) {
    this.nucleusAssetSizesUpdated = nucleusAssetSizesUpdated;
  }

  public AchBalanceResponseVO nucleusPortfolioId(UUID nucleusPortfolioId) {
    this.nucleusPortfolioId = nucleusPortfolioId;
    return this;
  }

   /**
   * Get nucleusPortfolioId
   * @return nucleusPortfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusPortfolioId() {
    return nucleusPortfolioId;
  }

  public void setNucleusPortfolioId(UUID nucleusPortfolioId) {
    this.nucleusPortfolioId = nucleusPortfolioId;
  }

  public AchBalanceResponseVO vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public AchBalanceResponseVO vendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
    return this;
  }

   /**
   * Get vendorResponse
   * @return vendorResponse
  **/
  @ApiModelProperty(value = "")
  public Object getVendorResponse() {
    return vendorResponse;
  }

  public void setVendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchBalanceResponseVO achBalanceResponseVO = (AchBalanceResponseVO) o;
    return Objects.equals(this.message, achBalanceResponseVO.message) &&
        Objects.equals(this.nucleusAssetSizesPosted, achBalanceResponseVO.nucleusAssetSizesPosted) &&
        Objects.equals(this.nucleusAssetSizesUpdated, achBalanceResponseVO.nucleusAssetSizesUpdated) &&
        Objects.equals(this.nucleusPortfolioId, achBalanceResponseVO.nucleusPortfolioId) &&
        Objects.equals(this.vendorName, achBalanceResponseVO.vendorName) &&
        Objects.equals(this.vendorResponse, achBalanceResponseVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, nucleusAssetSizesPosted, nucleusAssetSizesUpdated, nucleusPortfolioId, vendorName, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchBalanceResponseVO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusAssetSizesPosted: ").append(toIndentedString(nucleusAssetSizesPosted)).append("\n");
    sb.append("    nucleusAssetSizesUpdated: ").append(toIndentedString(nucleusAssetSizesUpdated)).append("\n");
    sb.append("    nucleusPortfolioId: ").append(toIndentedString(nucleusPortfolioId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorResponse: ").append(toIndentedString(vendorResponse)).append("\n");
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

