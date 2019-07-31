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
 * SpendingAnalysisResponseIncome
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SpendingAnalysisResponseIncome {
  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("benchmark")
  private BigDecimal benchmark = null;

  @SerializedName("change")
  private BigDecimal change = null;

  public SpendingAnalysisResponseIncome total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total cash inflows over the trend period
   * @return total
  **/
  @ApiModelProperty(value = "Total cash inflows over the trend period")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public SpendingAnalysisResponseIncome benchmark(BigDecimal benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Total cash inflows over the benchmark trend period
   * @return benchmark
  **/
  @ApiModelProperty(value = "Total cash inflows over the benchmark trend period")
  public BigDecimal getBenchmark() {
    return benchmark;
  }

  public void setBenchmark(BigDecimal benchmark) {
    this.benchmark = benchmark;
  }

  public SpendingAnalysisResponseIncome change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * Difference in total cash inflows between the trend period and the benchmark trend period
   * @return change
  **/
  @ApiModelProperty(value = "Difference in total cash inflows between the trend period and the benchmark trend period")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingAnalysisResponseIncome spendingAnalysisResponseIncome = (SpendingAnalysisResponseIncome) o;
    return Objects.equals(this.total, spendingAnalysisResponseIncome.total) &&
        Objects.equals(this.benchmark, spendingAnalysisResponseIncome.benchmark) &&
        Objects.equals(this.change, spendingAnalysisResponseIncome.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, benchmark, change);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingAnalysisResponseIncome {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

