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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GuaranteedRateBenefitSubpayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class GuaranteedRateBenefitSubpayload {
  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("min_rate")
  private BigDecimal minRate = null;

  @SerializedName("max_rate")
  private BigDecimal maxRate = null;

  public GuaranteedRateBenefitSubpayload start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * The starting period for the guarantee, where 1 indicates the first period in accumulation_horizon. Must be greater than or equal to 1. Defaults to 1.
   * minimum: 1
   * @return start
  **/
  @ApiModelProperty(value = "The starting period for the guarantee, where 1 indicates the first period in accumulation_horizon. Must be greater than or equal to 1. Defaults to 1.")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public GuaranteedRateBenefitSubpayload end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * The ending period for the guarantee. Must be less than or equal to the sum of accumulation_horizon and decumulation_horizon. Defaults to the sum of accumulation_horizon and decumulation_horizon.
   * @return end
  **/
  @ApiModelProperty(value = "The ending period for the guarantee. Must be less than or equal to the sum of accumulation_horizon and decumulation_horizon. Defaults to the sum of accumulation_horizon and decumulation_horizon.")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public GuaranteedRateBenefitSubpayload minRate(BigDecimal minRate) {
    this.minRate = minRate;
    return this;
  }

   /**
   * The minimum allowable rate. Must be less than or equal to max_rate.
   * @return minRate
  **/
  @ApiModelProperty(value = "The minimum allowable rate. Must be less than or equal to max_rate.")
  public BigDecimal getMinRate() {
    return minRate;
  }

  public void setMinRate(BigDecimal minRate) {
    this.minRate = minRate;
  }

  public GuaranteedRateBenefitSubpayload maxRate(BigDecimal maxRate) {
    this.maxRate = maxRate;
    return this;
  }

   /**
   * The minimum allowable rate. Must be greater than or equal to min_rate.
   * @return maxRate
  **/
  @ApiModelProperty(value = "The minimum allowable rate. Must be greater than or equal to min_rate.")
  public BigDecimal getMaxRate() {
    return maxRate;
  }

  public void setMaxRate(BigDecimal maxRate) {
    this.maxRate = maxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedRateBenefitSubpayload guaranteedRateBenefitSubpayload = (GuaranteedRateBenefitSubpayload) o;
    return Objects.equals(this.start, guaranteedRateBenefitSubpayload.start) &&
        Objects.equals(this.end, guaranteedRateBenefitSubpayload.end) &&
        Objects.equals(this.minRate, guaranteedRateBenefitSubpayload.minRate) &&
        Objects.equals(this.maxRate, guaranteedRateBenefitSubpayload.maxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, minRate, maxRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedRateBenefitSubpayload {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
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

