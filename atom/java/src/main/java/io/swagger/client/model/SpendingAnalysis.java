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
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * SpendingAnalysis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SpendingAnalysis {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("benchmark_start_date")
  private LocalDate benchmarkStartDate = null;

  @SerializedName("benchmark_end_date")
  private LocalDate benchmarkEndDate = null;

  public SpendingAnalysis clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client’s cash flows
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the client’s cash flows")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SpendingAnalysis startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the analysis period
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of the analysis period")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public SpendingAnalysis endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the analysis period
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the analysis period")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SpendingAnalysis benchmarkStartDate(LocalDate benchmarkStartDate) {
    this.benchmarkStartDate = benchmarkStartDate;
    return this;
  }

   /**
   * Start date of the benchmark analysis period
   * @return benchmarkStartDate
  **/
  @ApiModelProperty(value = "Start date of the benchmark analysis period")
  public LocalDate getBenchmarkStartDate() {
    return benchmarkStartDate;
  }

  public void setBenchmarkStartDate(LocalDate benchmarkStartDate) {
    this.benchmarkStartDate = benchmarkStartDate;
  }

  public SpendingAnalysis benchmarkEndDate(LocalDate benchmarkEndDate) {
    this.benchmarkEndDate = benchmarkEndDate;
    return this;
  }

   /**
   * End date of the benchmark analysis period
   * @return benchmarkEndDate
  **/
  @ApiModelProperty(value = "End date of the benchmark analysis period")
  public LocalDate getBenchmarkEndDate() {
    return benchmarkEndDate;
  }

  public void setBenchmarkEndDate(LocalDate benchmarkEndDate) {
    this.benchmarkEndDate = benchmarkEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingAnalysis spendingAnalysis = (SpendingAnalysis) o;
    return Objects.equals(this.clientId, spendingAnalysis.clientId) &&
        Objects.equals(this.startDate, spendingAnalysis.startDate) &&
        Objects.equals(this.endDate, spendingAnalysis.endDate) &&
        Objects.equals(this.benchmarkStartDate, spendingAnalysis.benchmarkStartDate) &&
        Objects.equals(this.benchmarkEndDate, spendingAnalysis.benchmarkEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, startDate, endDate, benchmarkStartDate, benchmarkEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingAnalysis {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    benchmarkStartDate: ").append(toIndentedString(benchmarkStartDate)).append("\n");
    sb.append("    benchmarkEndDate: ").append(toIndentedString(benchmarkEndDate)).append("\n");
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

