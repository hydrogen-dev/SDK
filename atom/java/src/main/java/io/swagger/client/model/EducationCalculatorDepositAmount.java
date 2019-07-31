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
import io.swagger.client.model.EducationCalculatorDepositScheduleNoDepAmt;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EducationCalculatorDepositAmount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class EducationCalculatorDepositAmount {
  @SerializedName("initial_balance")
  private BigDecimal initialBalance = null;

  @SerializedName("accumulation_horizon")
  private Integer accumulationHorizon = null;

  @SerializedName("decumulation_horizon")
  private Integer decumulationHorizon = null;

  @SerializedName("total_annual_cost")
  private BigDecimal totalAnnualCost = null;

  @SerializedName("portfolio_return")
  private BigDecimal portfolioReturn = null;

  @SerializedName("percent_of_costs_covered")
  private BigDecimal percentOfCostsCovered = null;

  @SerializedName("education_inflation_rate")
  private BigDecimal educationInflationRate = null;

  @SerializedName("general_inflation_rate")
  private BigDecimal generalInflationRate = null;

  @SerializedName("tax_rate")
  private BigDecimal taxRate = null;

  @SerializedName("deposit_schedule")
  private EducationCalculatorDepositScheduleNoDepAmt depositSchedule = null;

  public EducationCalculatorDepositAmount initialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * The amount currently saved for the goal
   * minimum: 0
   * @return initialBalance
  **/
  @ApiModelProperty(required = true, value = "The amount currently saved for the goal")
  public BigDecimal getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
  }

  public EducationCalculatorDepositAmount accumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * The amount of years until funds are needed
   * minimum: 0
   * @return accumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "The amount of years until funds are needed")
  public Integer getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public EducationCalculatorDepositAmount decumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * The amount of years funds will be used
   * minimum: 0
   * @return decumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "The amount of years funds will be used")
  public Integer getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public EducationCalculatorDepositAmount totalAnnualCost(BigDecimal totalAnnualCost) {
    this.totalAnnualCost = totalAnnualCost;
    return this;
  }

   /**
   * The total annual education cost
   * minimum: 0
   * @return totalAnnualCost
  **/
  @ApiModelProperty(required = true, value = "The total annual education cost")
  public BigDecimal getTotalAnnualCost() {
    return totalAnnualCost;
  }

  public void setTotalAnnualCost(BigDecimal totalAnnualCost) {
    this.totalAnnualCost = totalAnnualCost;
  }

  public EducationCalculatorDepositAmount portfolioReturn(BigDecimal portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
    return this;
  }

   /**
   * The annualized portfolio return
   * minimum: -1
   * @return portfolioReturn
  **/
  @ApiModelProperty(required = true, value = "The annualized portfolio return")
  public BigDecimal getPortfolioReturn() {
    return portfolioReturn;
  }

  public void setPortfolioReturn(BigDecimal portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
  }

  public EducationCalculatorDepositAmount percentOfCostsCovered(BigDecimal percentOfCostsCovered) {
    this.percentOfCostsCovered = percentOfCostsCovered;
    return this;
  }

   /**
   * The desired percent of education costs covered
   * minimum: 0
   * maximum: 1
   * @return percentOfCostsCovered
  **/
  @ApiModelProperty(value = "The desired percent of education costs covered")
  public BigDecimal getPercentOfCostsCovered() {
    return percentOfCostsCovered;
  }

  public void setPercentOfCostsCovered(BigDecimal percentOfCostsCovered) {
    this.percentOfCostsCovered = percentOfCostsCovered;
  }

  public EducationCalculatorDepositAmount educationInflationRate(BigDecimal educationInflationRate) {
    this.educationInflationRate = educationInflationRate;
    return this;
  }

   /**
   * The inflation rate for education prices
   * minimum: -1
   * maximum: 20
   * @return educationInflationRate
  **/
  @ApiModelProperty(value = "The inflation rate for education prices")
  public BigDecimal getEducationInflationRate() {
    return educationInflationRate;
  }

  public void setEducationInflationRate(BigDecimal educationInflationRate) {
    this.educationInflationRate = educationInflationRate;
  }

  public EducationCalculatorDepositAmount generalInflationRate(BigDecimal generalInflationRate) {
    this.generalInflationRate = generalInflationRate;
    return this;
  }

   /**
   * The annualized general inflation rate
   * minimum: -1
   * maximum: 20
   * @return generalInflationRate
  **/
  @ApiModelProperty(value = "The annualized general inflation rate")
  public BigDecimal getGeneralInflationRate() {
    return generalInflationRate;
  }

  public void setGeneralInflationRate(BigDecimal generalInflationRate) {
    this.generalInflationRate = generalInflationRate;
  }

  public EducationCalculatorDepositAmount taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The tax rate for withdrawals from the account
   * minimum: 0
   * maximum: 1
   * @return taxRate
  **/
  @ApiModelProperty(value = "The tax rate for withdrawals from the account")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public EducationCalculatorDepositAmount depositSchedule(EducationCalculatorDepositScheduleNoDepAmt depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public EducationCalculatorDepositScheduleNoDepAmt getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(EducationCalculatorDepositScheduleNoDepAmt depositSchedule) {
    this.depositSchedule = depositSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EducationCalculatorDepositAmount educationCalculatorDepositAmount = (EducationCalculatorDepositAmount) o;
    return Objects.equals(this.initialBalance, educationCalculatorDepositAmount.initialBalance) &&
        Objects.equals(this.accumulationHorizon, educationCalculatorDepositAmount.accumulationHorizon) &&
        Objects.equals(this.decumulationHorizon, educationCalculatorDepositAmount.decumulationHorizon) &&
        Objects.equals(this.totalAnnualCost, educationCalculatorDepositAmount.totalAnnualCost) &&
        Objects.equals(this.portfolioReturn, educationCalculatorDepositAmount.portfolioReturn) &&
        Objects.equals(this.percentOfCostsCovered, educationCalculatorDepositAmount.percentOfCostsCovered) &&
        Objects.equals(this.educationInflationRate, educationCalculatorDepositAmount.educationInflationRate) &&
        Objects.equals(this.generalInflationRate, educationCalculatorDepositAmount.generalInflationRate) &&
        Objects.equals(this.taxRate, educationCalculatorDepositAmount.taxRate) &&
        Objects.equals(this.depositSchedule, educationCalculatorDepositAmount.depositSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialBalance, accumulationHorizon, decumulationHorizon, totalAnnualCost, portfolioReturn, percentOfCostsCovered, educationInflationRate, generalInflationRate, taxRate, depositSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationCalculatorDepositAmount {\n");
    
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    totalAnnualCost: ").append(toIndentedString(totalAnnualCost)).append("\n");
    sb.append("    portfolioReturn: ").append(toIndentedString(portfolioReturn)).append("\n");
    sb.append("    percentOfCostsCovered: ").append(toIndentedString(percentOfCostsCovered)).append("\n");
    sb.append("    educationInflationRate: ").append(toIndentedString(educationInflationRate)).append("\n");
    sb.append("    generalInflationRate: ").append(toIndentedString(generalInflationRate)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
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

