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
import io.swagger.client.model.CashFlowAnalysisResponseSpendingSummaryChange;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Aggregate view of spending over the analysis period
 */
@ApiModel(description = "Aggregate view of spending over the analysis period")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class CashFlowAnalysisResponseSpendingSummary {
  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("benchmark_total")
  private BigDecimal benchmarkTotal = null;

  @SerializedName("change")
  private CashFlowAnalysisResponseSpendingSummaryChange change = null;

  public CashFlowAnalysisResponseSpendingSummary total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total spending over the base time period
   * @return total
  **/
  @ApiModelProperty(value = "Total spending over the base time period")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CashFlowAnalysisResponseSpendingSummary benchmarkTotal(BigDecimal benchmarkTotal) {
    this.benchmarkTotal = benchmarkTotal;
    return this;
  }

   /**
   * Total spending over the benchmark time period
   * @return benchmarkTotal
  **/
  @ApiModelProperty(value = "Total spending over the benchmark time period")
  public BigDecimal getBenchmarkTotal() {
    return benchmarkTotal;
  }

  public void setBenchmarkTotal(BigDecimal benchmarkTotal) {
    this.benchmarkTotal = benchmarkTotal;
  }

  public CashFlowAnalysisResponseSpendingSummary change(CashFlowAnalysisResponseSpendingSummaryChange change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @ApiModelProperty(value = "")
  public CashFlowAnalysisResponseSpendingSummaryChange getChange() {
    return change;
  }

  public void setChange(CashFlowAnalysisResponseSpendingSummaryChange change) {
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
    CashFlowAnalysisResponseSpendingSummary cashFlowAnalysisResponseSpendingSummary = (CashFlowAnalysisResponseSpendingSummary) o;
    return Objects.equals(this.total, cashFlowAnalysisResponseSpendingSummary.total) &&
        Objects.equals(this.benchmarkTotal, cashFlowAnalysisResponseSpendingSummary.benchmarkTotal) &&
        Objects.equals(this.change, cashFlowAnalysisResponseSpendingSummary.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, benchmarkTotal, change);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowAnalysisResponseSpendingSummary {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    benchmarkTotal: ").append(toIndentedString(benchmarkTotal)).append("\n");
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

