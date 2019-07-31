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
 * SpendingAnalysisResponseSubcategories
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SpendingAnalysisResponseSubcategories {
  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("weight")
  private BigDecimal weight = null;

  @SerializedName("benchmark_value")
  private BigDecimal benchmarkValue = null;

  @SerializedName("benchmark_weight")
  private BigDecimal benchmarkWeight = null;

  public SpendingAnalysisResponseSubcategories subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Spending subcategory as defined in the Nucleus transactions
   * @return subcategory
  **/
  @ApiModelProperty(value = "Spending subcategory as defined in the Nucleus transactions")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public SpendingAnalysisResponseSubcategories value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Sum of all transactions over the period for the given subcategory
   * @return value
  **/
  @ApiModelProperty(value = "Sum of all transactions over the period for the given subcategory")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public SpendingAnalysisResponseSubcategories weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The proportion of all spending over the period related to this subcategory
   * @return weight
  **/
  @ApiModelProperty(value = "The proportion of all spending over the period related to this subcategory")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public SpendingAnalysisResponseSubcategories benchmarkValue(BigDecimal benchmarkValue) {
    this.benchmarkValue = benchmarkValue;
    return this;
  }

   /**
   * The proportion of all spending over the benchmark period related to this subcategory
   * @return benchmarkValue
  **/
  @ApiModelProperty(value = "The proportion of all spending over the benchmark period related to this subcategory")
  public BigDecimal getBenchmarkValue() {
    return benchmarkValue;
  }

  public void setBenchmarkValue(BigDecimal benchmarkValue) {
    this.benchmarkValue = benchmarkValue;
  }

  public SpendingAnalysisResponseSubcategories benchmarkWeight(BigDecimal benchmarkWeight) {
    this.benchmarkWeight = benchmarkWeight;
    return this;
  }

   /**
   * The proportion of all spending over the benchmark period related to this subcategory
   * @return benchmarkWeight
  **/
  @ApiModelProperty(value = "The proportion of all spending over the benchmark period related to this subcategory")
  public BigDecimal getBenchmarkWeight() {
    return benchmarkWeight;
  }

  public void setBenchmarkWeight(BigDecimal benchmarkWeight) {
    this.benchmarkWeight = benchmarkWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingAnalysisResponseSubcategories spendingAnalysisResponseSubcategories = (SpendingAnalysisResponseSubcategories) o;
    return Objects.equals(this.subcategory, spendingAnalysisResponseSubcategories.subcategory) &&
        Objects.equals(this.value, spendingAnalysisResponseSubcategories.value) &&
        Objects.equals(this.weight, spendingAnalysisResponseSubcategories.weight) &&
        Objects.equals(this.benchmarkValue, spendingAnalysisResponseSubcategories.benchmarkValue) &&
        Objects.equals(this.benchmarkWeight, spendingAnalysisResponseSubcategories.benchmarkWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subcategory, value, weight, benchmarkValue, benchmarkWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingAnalysisResponseSubcategories {\n");
    
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    benchmarkValue: ").append(toIndentedString(benchmarkValue)).append("\n");
    sb.append("    benchmarkWeight: ").append(toIndentedString(benchmarkWeight)).append("\n");
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

