/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CampaignPlanRate Object
 */
@ApiModel(description = "CampaignPlanRate Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class CampaignPlanRate {
  @SerializedName("max_asset")
  private Double maxAsset = null;

  @SerializedName("min_asset")
  private Double minAsset = null;

  @SerializedName("rate")
  private Double rate = null;

  public CampaignPlanRate maxAsset(Double maxAsset) {
    this.maxAsset = maxAsset;
    return this;
  }

   /**
   * maxAsset
   * @return maxAsset
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "maxAsset")
  public Double getMaxAsset() {
    return maxAsset;
  }

  public void setMaxAsset(Double maxAsset) {
    this.maxAsset = maxAsset;
  }

  public CampaignPlanRate minAsset(Double minAsset) {
    this.minAsset = minAsset;
    return this;
  }

   /**
   * maxAsset
   * @return minAsset
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "maxAsset")
  public Double getMinAsset() {
    return minAsset;
  }

  public void setMinAsset(Double minAsset) {
    this.minAsset = minAsset;
  }

  public CampaignPlanRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * maxAsset
   * @return rate
  **/
  @ApiModelProperty(example = "50.0", required = true, value = "maxAsset")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanRate campaignPlanRate = (CampaignPlanRate) o;
    return Objects.equals(this.maxAsset, campaignPlanRate.maxAsset) &&
        Objects.equals(this.minAsset, campaignPlanRate.minAsset) &&
        Objects.equals(this.rate, campaignPlanRate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAsset, minAsset, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanRate {\n");
    
    sb.append("    maxAsset: ").append(toIndentedString(maxAsset)).append("\n");
    sb.append("    minAsset: ").append(toIndentedString(minAsset)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
