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
 * GuaranteedRateBenefit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class GuaranteedRateBenefit {
  @SerializedName("max_rate")
  private Float maxRate = null;

  @SerializedName("end_period")
  private Integer endPeriod = null;

  @SerializedName("min_rate")
  private Float minRate = 0.0f;

  @SerializedName("start_period")
  private Integer startPeriod = 1;

  public GuaranteedRateBenefit maxRate(Float maxRate) {
    this.maxRate = maxRate;
    return this;
  }

   /**
   * Get maxRate
   * minimum: -1
   * @return maxRate
  **/
  @ApiModelProperty(value = "")
  public Float getMaxRate() {
    return maxRate;
  }

  public void setMaxRate(Float maxRate) {
    this.maxRate = maxRate;
  }

  public GuaranteedRateBenefit endPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
    return this;
  }

   /**
   * Get endPeriod
   * minimum: 1
   * @return endPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getEndPeriod() {
    return endPeriod;
  }

  public void setEndPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
  }

  public GuaranteedRateBenefit minRate(Float minRate) {
    this.minRate = minRate;
    return this;
  }

   /**
   * Get minRate
   * minimum: -1
   * @return minRate
  **/
  @ApiModelProperty(value = "")
  public Float getMinRate() {
    return minRate;
  }

  public void setMinRate(Float minRate) {
    this.minRate = minRate;
  }

  public GuaranteedRateBenefit startPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

   /**
   * Get startPeriod
   * minimum: 1
   * @return startPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedRateBenefit guaranteedRateBenefit = (GuaranteedRateBenefit) o;
    return Objects.equals(this.maxRate, guaranteedRateBenefit.maxRate) &&
        Objects.equals(this.endPeriod, guaranteedRateBenefit.endPeriod) &&
        Objects.equals(this.minRate, guaranteedRateBenefit.minRate) &&
        Objects.equals(this.startPeriod, guaranteedRateBenefit.startPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRate, endPeriod, minRate, startPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedRateBenefit {\n");
    
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
    sb.append("    endPeriod: ").append(toIndentedString(endPeriod)).append("\n");
    sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
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

