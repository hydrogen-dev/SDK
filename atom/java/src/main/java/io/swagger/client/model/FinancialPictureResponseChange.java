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
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Change records of the client
 */
@ApiModel(description = "Change records of the client")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialPictureResponseChange {
  @SerializedName("analysis_start")
  private LocalDate analysisStart = null;

  @SerializedName("analysis_end")
  private LocalDate analysisEnd = null;

  @SerializedName("total_assets")
  private FinancialPictureResponseChangeTotalAssets totalAssets = null;

  @SerializedName("total_liabilities")
  private FinancialPictureResponseChangeTotalAssets totalLiabilities = null;

  @SerializedName("net_worth")
  private FinancialPictureResponseChangeTotalAssets netWorth = null;

  public FinancialPictureResponseChange analysisStart(LocalDate analysisStart) {
    this.analysisStart = analysisStart;
    return this;
  }

   /**
   * Start date of the available data used in the change analysis
   * @return analysisStart
  **/
  @ApiModelProperty(value = "Start date of the available data used in the change analysis")
  public LocalDate getAnalysisStart() {
    return analysisStart;
  }

  public void setAnalysisStart(LocalDate analysisStart) {
    this.analysisStart = analysisStart;
  }

  public FinancialPictureResponseChange analysisEnd(LocalDate analysisEnd) {
    this.analysisEnd = analysisEnd;
    return this;
  }

   /**
   * End date of the available data used in the change analysis
   * @return analysisEnd
  **/
  @ApiModelProperty(value = "End date of the available data used in the change analysis")
  public LocalDate getAnalysisEnd() {
    return analysisEnd;
  }

  public void setAnalysisEnd(LocalDate analysisEnd) {
    this.analysisEnd = analysisEnd;
  }

  public FinancialPictureResponseChange totalAssets(FinancialPictureResponseChangeTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * @return totalAssets
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(FinancialPictureResponseChangeTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
  }

  public FinancialPictureResponseChange totalLiabilities(FinancialPictureResponseChangeTotalAssets totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Get totalLiabilities
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(FinancialPictureResponseChangeTotalAssets totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public FinancialPictureResponseChange netWorth(FinancialPictureResponseChangeTotalAssets netWorth) {
    this.netWorth = netWorth;
    return this;
  }

   /**
   * Get netWorth
   * @return netWorth
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(FinancialPictureResponseChangeTotalAssets netWorth) {
    this.netWorth = netWorth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseChange financialPictureResponseChange = (FinancialPictureResponseChange) o;
    return Objects.equals(this.analysisStart, financialPictureResponseChange.analysisStart) &&
        Objects.equals(this.analysisEnd, financialPictureResponseChange.analysisEnd) &&
        Objects.equals(this.totalAssets, financialPictureResponseChange.totalAssets) &&
        Objects.equals(this.totalLiabilities, financialPictureResponseChange.totalLiabilities) &&
        Objects.equals(this.netWorth, financialPictureResponseChange.netWorth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisStart, analysisEnd, totalAssets, totalLiabilities, netWorth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseChange {\n");
    
    sb.append("    analysisStart: ").append(toIndentedString(analysisStart)).append("\n");
    sb.append("    analysisEnd: ").append(toIndentedString(analysisEnd)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    netWorth: ").append(toIndentedString(netWorth)).append("\n");
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

