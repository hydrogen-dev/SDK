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
import io.swagger.client.model.RatioTargets;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FinancialHealthCheck
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class FinancialHealthCheck {
  @SerializedName("liquid_assets")
  private BigDecimal liquidAssets = null;

  @SerializedName("non_liquid_assets")
  private BigDecimal nonLiquidAssets = null;

  @SerializedName("short_term_liabilities")
  private BigDecimal shortTermLiabilities = null;

  @SerializedName("total_liabilities")
  private BigDecimal totalLiabilities = null;

  @SerializedName("gross_annual_income")
  private BigDecimal grossAnnualIncome = null;

  @SerializedName("net_monthly_income")
  private BigDecimal netMonthlyIncome = null;

  @SerializedName("monthly_expenses")
  private BigDecimal monthlyExpenses = null;

  @SerializedName("ratio_targets")
  private RatioTargets ratioTargets = null;

  public FinancialHealthCheck liquidAssets(BigDecimal liquidAssets) {
    this.liquidAssets = liquidAssets;
    return this;
  }

   /**
   * Liquid assets
   * minimum: 0
   * @return liquidAssets
  **/
  @ApiModelProperty(value = "Liquid assets")
  public BigDecimal getLiquidAssets() {
    return liquidAssets;
  }

  public void setLiquidAssets(BigDecimal liquidAssets) {
    this.liquidAssets = liquidAssets;
  }

  public FinancialHealthCheck nonLiquidAssets(BigDecimal nonLiquidAssets) {
    this.nonLiquidAssets = nonLiquidAssets;
    return this;
  }

   /**
   * Non-liquid assets
   * minimum: 0
   * @return nonLiquidAssets
  **/
  @ApiModelProperty(value = "Non-liquid assets")
  public BigDecimal getNonLiquidAssets() {
    return nonLiquidAssets;
  }

  public void setNonLiquidAssets(BigDecimal nonLiquidAssets) {
    this.nonLiquidAssets = nonLiquidAssets;
  }

  public FinancialHealthCheck shortTermLiabilities(BigDecimal shortTermLiabilities) {
    this.shortTermLiabilities = shortTermLiabilities;
    return this;
  }

   /**
   * Short-term liabilities
   * minimum: 0
   * @return shortTermLiabilities
  **/
  @ApiModelProperty(value = "Short-term liabilities")
  public BigDecimal getShortTermLiabilities() {
    return shortTermLiabilities;
  }

  public void setShortTermLiabilities(BigDecimal shortTermLiabilities) {
    this.shortTermLiabilities = shortTermLiabilities;
  }

  public FinancialHealthCheck totalLiabilities(BigDecimal totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Total liabilities
   * minimum: 0
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "Total liabilities")
  public BigDecimal getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(BigDecimal totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public FinancialHealthCheck grossAnnualIncome(BigDecimal grossAnnualIncome) {
    this.grossAnnualIncome = grossAnnualIncome;
    return this;
  }

   /**
   * Gross annual income
   * minimum: 0
   * @return grossAnnualIncome
  **/
  @ApiModelProperty(value = "Gross annual income")
  public BigDecimal getGrossAnnualIncome() {
    return grossAnnualIncome;
  }

  public void setGrossAnnualIncome(BigDecimal grossAnnualIncome) {
    this.grossAnnualIncome = grossAnnualIncome;
  }

  public FinancialHealthCheck netMonthlyIncome(BigDecimal netMonthlyIncome) {
    this.netMonthlyIncome = netMonthlyIncome;
    return this;
  }

   /**
   * Net monthly income
   * minimum: 0
   * @return netMonthlyIncome
  **/
  @ApiModelProperty(value = "Net monthly income")
  public BigDecimal getNetMonthlyIncome() {
    return netMonthlyIncome;
  }

  public void setNetMonthlyIncome(BigDecimal netMonthlyIncome) {
    this.netMonthlyIncome = netMonthlyIncome;
  }

  public FinancialHealthCheck monthlyExpenses(BigDecimal monthlyExpenses) {
    this.monthlyExpenses = monthlyExpenses;
    return this;
  }

   /**
   * Monthly expenses
   * minimum: 0
   * @return monthlyExpenses
  **/
  @ApiModelProperty(value = "Monthly expenses")
  public BigDecimal getMonthlyExpenses() {
    return monthlyExpenses;
  }

  public void setMonthlyExpenses(BigDecimal monthlyExpenses) {
    this.monthlyExpenses = monthlyExpenses;
  }

  public FinancialHealthCheck ratioTargets(RatioTargets ratioTargets) {
    this.ratioTargets = ratioTargets;
    return this;
  }

   /**
   * Get ratioTargets
   * @return ratioTargets
  **/
  @ApiModelProperty(value = "")
  public RatioTargets getRatioTargets() {
    return ratioTargets;
  }

  public void setRatioTargets(RatioTargets ratioTargets) {
    this.ratioTargets = ratioTargets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialHealthCheck financialHealthCheck = (FinancialHealthCheck) o;
    return Objects.equals(this.liquidAssets, financialHealthCheck.liquidAssets) &&
        Objects.equals(this.nonLiquidAssets, financialHealthCheck.nonLiquidAssets) &&
        Objects.equals(this.shortTermLiabilities, financialHealthCheck.shortTermLiabilities) &&
        Objects.equals(this.totalLiabilities, financialHealthCheck.totalLiabilities) &&
        Objects.equals(this.grossAnnualIncome, financialHealthCheck.grossAnnualIncome) &&
        Objects.equals(this.netMonthlyIncome, financialHealthCheck.netMonthlyIncome) &&
        Objects.equals(this.monthlyExpenses, financialHealthCheck.monthlyExpenses) &&
        Objects.equals(this.ratioTargets, financialHealthCheck.ratioTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liquidAssets, nonLiquidAssets, shortTermLiabilities, totalLiabilities, grossAnnualIncome, netMonthlyIncome, monthlyExpenses, ratioTargets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialHealthCheck {\n");
    
    sb.append("    liquidAssets: ").append(toIndentedString(liquidAssets)).append("\n");
    sb.append("    nonLiquidAssets: ").append(toIndentedString(nonLiquidAssets)).append("\n");
    sb.append("    shortTermLiabilities: ").append(toIndentedString(shortTermLiabilities)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    grossAnnualIncome: ").append(toIndentedString(grossAnnualIncome)).append("\n");
    sb.append("    netMonthlyIncome: ").append(toIndentedString(netMonthlyIncome)).append("\n");
    sb.append("    monthlyExpenses: ").append(toIndentedString(monthlyExpenses)).append("\n");
    sb.append("    ratioTargets: ").append(toIndentedString(ratioTargets)).append("\n");
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

