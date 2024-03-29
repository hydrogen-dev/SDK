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

/**
 * RatioTargets1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class RatioTargets1 {
  @SerializedName("return_on_equity")
  private Float returnOnEquity = 0.15f;

  @SerializedName("return_on_assets")
  private Float returnOnAssets = 0.05f;

  @SerializedName("debt_to_equity")
  private Float debtToEquity = 1.5f;

  @SerializedName("profit_margin")
  private Float profitMargin = 0.1f;

  @SerializedName("debt_ratio")
  private Float debtRatio = 0.5f;

  @SerializedName("asset_turnover")
  private Float assetTurnover = 1.0f;

  public RatioTargets1 returnOnEquity(Float returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Get returnOnEquity
   * minimum: 0
   * @return returnOnEquity
  **/
  @ApiModelProperty(value = "")
  public Float getReturnOnEquity() {
    return returnOnEquity;
  }

  public void setReturnOnEquity(Float returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }

  public RatioTargets1 returnOnAssets(Float returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Get returnOnAssets
   * minimum: 0
   * @return returnOnAssets
  **/
  @ApiModelProperty(value = "")
  public Float getReturnOnAssets() {
    return returnOnAssets;
  }

  public void setReturnOnAssets(Float returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }

  public RatioTargets1 debtToEquity(Float debtToEquity) {
    this.debtToEquity = debtToEquity;
    return this;
  }

   /**
   * Get debtToEquity
   * minimum: 0
   * @return debtToEquity
  **/
  @ApiModelProperty(value = "")
  public Float getDebtToEquity() {
    return debtToEquity;
  }

  public void setDebtToEquity(Float debtToEquity) {
    this.debtToEquity = debtToEquity;
  }

  public RatioTargets1 profitMargin(Float profitMargin) {
    this.profitMargin = profitMargin;
    return this;
  }

   /**
   * Get profitMargin
   * minimum: 0
   * @return profitMargin
  **/
  @ApiModelProperty(value = "")
  public Float getProfitMargin() {
    return profitMargin;
  }

  public void setProfitMargin(Float profitMargin) {
    this.profitMargin = profitMargin;
  }

  public RatioTargets1 debtRatio(Float debtRatio) {
    this.debtRatio = debtRatio;
    return this;
  }

   /**
   * Get debtRatio
   * minimum: 0
   * @return debtRatio
  **/
  @ApiModelProperty(value = "")
  public Float getDebtRatio() {
    return debtRatio;
  }

  public void setDebtRatio(Float debtRatio) {
    this.debtRatio = debtRatio;
  }

  public RatioTargets1 assetTurnover(Float assetTurnover) {
    this.assetTurnover = assetTurnover;
    return this;
  }

   /**
   * Get assetTurnover
   * minimum: 0
   * @return assetTurnover
  **/
  @ApiModelProperty(value = "")
  public Float getAssetTurnover() {
    return assetTurnover;
  }

  public void setAssetTurnover(Float assetTurnover) {
    this.assetTurnover = assetTurnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatioTargets1 ratioTargets1 = (RatioTargets1) o;
    return Objects.equals(this.returnOnEquity, ratioTargets1.returnOnEquity) &&
        Objects.equals(this.returnOnAssets, ratioTargets1.returnOnAssets) &&
        Objects.equals(this.debtToEquity, ratioTargets1.debtToEquity) &&
        Objects.equals(this.profitMargin, ratioTargets1.profitMargin) &&
        Objects.equals(this.debtRatio, ratioTargets1.debtRatio) &&
        Objects.equals(this.assetTurnover, ratioTargets1.assetTurnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnOnEquity, returnOnAssets, debtToEquity, profitMargin, debtRatio, assetTurnover);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatioTargets1 {\n");
    
    sb.append("    returnOnEquity: ").append(toIndentedString(returnOnEquity)).append("\n");
    sb.append("    returnOnAssets: ").append(toIndentedString(returnOnAssets)).append("\n");
    sb.append("    debtToEquity: ").append(toIndentedString(debtToEquity)).append("\n");
    sb.append("    profitMargin: ").append(toIndentedString(profitMargin)).append("\n");
    sb.append("    debtRatio: ").append(toIndentedString(debtRatio)).append("\n");
    sb.append("    assetTurnover: ").append(toIndentedString(assetTurnover)).append("\n");
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

