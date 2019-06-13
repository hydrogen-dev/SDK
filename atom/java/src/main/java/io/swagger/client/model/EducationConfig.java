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
 * EducationConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class EducationConfig {
  @SerializedName("start_age")
  private Integer startAge = null;

  @SerializedName("end_age")
  private Integer endAge = null;

  @SerializedName("total_annual_cost")
  private BigDecimal totalAnnualCost = null;

  public EducationConfig startAge(Integer startAge) {
    this.startAge = startAge;
    return this;
  }

   /**
   * The start age
   * minimum: 0
   * @return startAge
  **/
  @ApiModelProperty(required = true, value = "The start age")
  public Integer getStartAge() {
    return startAge;
  }

  public void setStartAge(Integer startAge) {
    this.startAge = startAge;
  }

  public EducationConfig endAge(Integer endAge) {
    this.endAge = endAge;
    return this;
  }

   /**
   * The end age
   * minimum: 0
   * @return endAge
  **/
  @ApiModelProperty(required = true, value = "The end age")
  public Integer getEndAge() {
    return endAge;
  }

  public void setEndAge(Integer endAge) {
    this.endAge = endAge;
  }

  public EducationConfig totalAnnualCost(BigDecimal totalAnnualCost) {
    this.totalAnnualCost = totalAnnualCost;
    return this;
  }

   /**
   * The total annual cost
   * minimum: 0
   * @return totalAnnualCost
  **/
  @ApiModelProperty(required = true, value = "The total annual cost")
  public BigDecimal getTotalAnnualCost() {
    return totalAnnualCost;
  }

  public void setTotalAnnualCost(BigDecimal totalAnnualCost) {
    this.totalAnnualCost = totalAnnualCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EducationConfig educationConfig = (EducationConfig) o;
    return Objects.equals(this.startAge, educationConfig.startAge) &&
        Objects.equals(this.endAge, educationConfig.endAge) &&
        Objects.equals(this.totalAnnualCost, educationConfig.totalAnnualCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAge, endAge, totalAnnualCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationConfig {\n");
    
    sb.append("    startAge: ").append(toIndentedString(startAge)).append("\n");
    sb.append("    endAge: ").append(toIndentedString(endAge)).append("\n");
    sb.append("    totalAnnualCost: ").append(toIndentedString(totalAnnualCost)).append("\n");
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

