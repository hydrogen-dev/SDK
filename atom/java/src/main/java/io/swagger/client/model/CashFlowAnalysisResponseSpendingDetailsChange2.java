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
 * CashFlowAnalysisResponseSpendingDetailsChange2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class CashFlowAnalysisResponseSpendingDetailsChange2 {
  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("percentage")
  private BigDecimal percentage = null;

  public CashFlowAnalysisResponseSpendingDetailsChange2 value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Absolute difference in merchant spending between the base time period and the benchmark time period
   * @return value
  **/
  @ApiModelProperty(value = "Absolute difference in merchant spending between the base time period and the benchmark time period")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public CashFlowAnalysisResponseSpendingDetailsChange2 percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage difference in merchant spending between the base time period and the benchmark time period
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage difference in merchant spending between the base time period and the benchmark time period")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowAnalysisResponseSpendingDetailsChange2 cashFlowAnalysisResponseSpendingDetailsChange2 = (CashFlowAnalysisResponseSpendingDetailsChange2) o;
    return Objects.equals(this.value, cashFlowAnalysisResponseSpendingDetailsChange2.value) &&
        Objects.equals(this.percentage, cashFlowAnalysisResponseSpendingDetailsChange2.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowAnalysisResponseSpendingDetailsChange2 {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

