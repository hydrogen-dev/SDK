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
 * HealthCheckResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class HealthCheckResult {
  @SerializedName("ratio_result")
  private BigDecimal ratioResult = null;

  @SerializedName("pass")
  private Boolean pass = null;

  @SerializedName("percentile_grade")
  private Integer percentileGrade = null;

  public HealthCheckResult ratioResult(BigDecimal ratioResult) {
    this.ratioResult = ratioResult;
    return this;
  }

   /**
   * The ratio value
   * @return ratioResult
  **/
  @ApiModelProperty(required = true, value = "The ratio value")
  public BigDecimal getRatioResult() {
    return ratioResult;
  }

  public void setRatioResult(BigDecimal ratioResult) {
    this.ratioResult = ratioResult;
  }

  public HealthCheckResult pass(Boolean pass) {
    this.pass = pass;
    return this;
  }

   /**
   * A boolean indicating if ratio_result is sufficiently high. If ratio_result is greater than or equal to the corresponding value from ratio_targets, then pass is true.
   * @return pass
  **/
  @ApiModelProperty(required = true, value = "A boolean indicating if ratio_result is sufficiently high. If ratio_result is greater than or equal to the corresponding value from ratio_targets, then pass is true.")
  public Boolean isPass() {
    return pass;
  }

  public void setPass(Boolean pass) {
    this.pass = pass;
  }

  public HealthCheckResult percentileGrade(Integer percentileGrade) {
    this.percentileGrade = percentileGrade;
    return this;
  }

   /**
   * A linear percentile score for ratio_result on a scale from 0 to 100, where 100 represents the relevant value in ratio_targets.
   * minimum: 0
   * maximum: 100
   * @return percentileGrade
  **/
  @ApiModelProperty(required = true, value = "A linear percentile score for ratio_result on a scale from 0 to 100, where 100 represents the relevant value in ratio_targets.")
  public Integer getPercentileGrade() {
    return percentileGrade;
  }

  public void setPercentileGrade(Integer percentileGrade) {
    this.percentileGrade = percentileGrade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.ratioResult, healthCheckResult.ratioResult) &&
        Objects.equals(this.pass, healthCheckResult.pass) &&
        Objects.equals(this.percentileGrade, healthCheckResult.percentileGrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratioResult, pass, percentileGrade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    
    sb.append("    ratioResult: ").append(toIndentedString(ratioResult)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    percentileGrade: ").append(toIndentedString(percentileGrade)).append("\n");
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

