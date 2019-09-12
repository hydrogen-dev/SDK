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
import io.swagger.client.model.DepositSchedule;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * RetirementCalculatorPercentCovered
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class RetirementCalculatorPercentCovered {
  @SerializedName("current_age")
  private Integer currentAge = null;

  @SerializedName("death_age")
  private Integer deathAge = null;

  @SerializedName("retirement_expenses")
  private BigDecimal retirementExpenses = null;

  @SerializedName("portfolio_return")
  private BigDecimal portfolioReturn = null;

  @SerializedName("retirement_age")
  private Integer retirementAge = null;

  @SerializedName("retirement_savings")
  private BigDecimal retirementSavings = null;

  @SerializedName("retirement_income")
  private BigDecimal retirementIncome = null;

  @SerializedName("deposit_schedule")
  private DepositSchedule depositSchedule = null;

  @SerializedName("inflation_rate")
  private BigDecimal inflationRate = null;

  @SerializedName("retirement_tax")
  private BigDecimal retirementTax = null;

  public RetirementCalculatorPercentCovered currentAge(Integer currentAge) {
    this.currentAge = currentAge;
    return this;
  }

   /**
   * Current age of the user
   * minimum: 0
   * @return currentAge
  **/
  @ApiModelProperty(required = true, value = "Current age of the user")
  public Integer getCurrentAge() {
    return currentAge;
  }

  public void setCurrentAge(Integer currentAge) {
    this.currentAge = currentAge;
  }

  public RetirementCalculatorPercentCovered deathAge(Integer deathAge) {
    this.deathAge = deathAge;
    return this;
  }

   /**
   * Expected death age
   * minimum: 0
   * @return deathAge
  **/
  @ApiModelProperty(required = true, value = "Expected death age")
  public Integer getDeathAge() {
    return deathAge;
  }

  public void setDeathAge(Integer deathAge) {
    this.deathAge = deathAge;
  }

  public RetirementCalculatorPercentCovered retirementExpenses(BigDecimal retirementExpenses) {
    this.retirementExpenses = retirementExpenses;
    return this;
  }

   /**
   * Annual retirement expenses
   * minimum: 0
   * @return retirementExpenses
  **/
  @ApiModelProperty(required = true, value = "Annual retirement expenses")
  public BigDecimal getRetirementExpenses() {
    return retirementExpenses;
  }

  public void setRetirementExpenses(BigDecimal retirementExpenses) {
    this.retirementExpenses = retirementExpenses;
  }

  public RetirementCalculatorPercentCovered portfolioReturn(BigDecimal portfolioReturn) {
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

  public RetirementCalculatorPercentCovered retirementAge(Integer retirementAge) {
    this.retirementAge = retirementAge;
    return this;
  }

   /**
   * The age of retirement
   * minimum: 0
   * @return retirementAge
  **/
  @ApiModelProperty(value = "The age of retirement")
  public Integer getRetirementAge() {
    return retirementAge;
  }

  public void setRetirementAge(Integer retirementAge) {
    this.retirementAge = retirementAge;
  }

  public RetirementCalculatorPercentCovered retirementSavings(BigDecimal retirementSavings) {
    this.retirementSavings = retirementSavings;
    return this;
  }

   /**
   * Current amount of retirement savings
   * minimum: 0
   * @return retirementSavings
  **/
  @ApiModelProperty(value = "Current amount of retirement savings")
  public BigDecimal getRetirementSavings() {
    return retirementSavings;
  }

  public void setRetirementSavings(BigDecimal retirementSavings) {
    this.retirementSavings = retirementSavings;
  }

  public RetirementCalculatorPercentCovered retirementIncome(BigDecimal retirementIncome) {
    this.retirementIncome = retirementIncome;
    return this;
  }

   /**
   * Expected retirement income
   * minimum: 0
   * @return retirementIncome
  **/
  @ApiModelProperty(value = "Expected retirement income")
  public BigDecimal getRetirementIncome() {
    return retirementIncome;
  }

  public void setRetirementIncome(BigDecimal retirementIncome) {
    this.retirementIncome = retirementIncome;
  }

  public RetirementCalculatorPercentCovered depositSchedule(DepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public DepositSchedule getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(DepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public RetirementCalculatorPercentCovered inflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * The annualized inflation rate
   * minimum: -1
   * @return inflationRate
  **/
  @ApiModelProperty(value = "The annualized inflation rate")
  public BigDecimal getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
  }

  public RetirementCalculatorPercentCovered retirementTax(BigDecimal retirementTax) {
    this.retirementTax = retirementTax;
    return this;
  }

   /**
   * The expected tax rate in retirement
   * minimum: 0
   * maximum: 1
   * @return retirementTax
  **/
  @ApiModelProperty(value = "The expected tax rate in retirement")
  public BigDecimal getRetirementTax() {
    return retirementTax;
  }

  public void setRetirementTax(BigDecimal retirementTax) {
    this.retirementTax = retirementTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetirementCalculatorPercentCovered retirementCalculatorPercentCovered = (RetirementCalculatorPercentCovered) o;
    return Objects.equals(this.currentAge, retirementCalculatorPercentCovered.currentAge) &&
        Objects.equals(this.deathAge, retirementCalculatorPercentCovered.deathAge) &&
        Objects.equals(this.retirementExpenses, retirementCalculatorPercentCovered.retirementExpenses) &&
        Objects.equals(this.portfolioReturn, retirementCalculatorPercentCovered.portfolioReturn) &&
        Objects.equals(this.retirementAge, retirementCalculatorPercentCovered.retirementAge) &&
        Objects.equals(this.retirementSavings, retirementCalculatorPercentCovered.retirementSavings) &&
        Objects.equals(this.retirementIncome, retirementCalculatorPercentCovered.retirementIncome) &&
        Objects.equals(this.depositSchedule, retirementCalculatorPercentCovered.depositSchedule) &&
        Objects.equals(this.inflationRate, retirementCalculatorPercentCovered.inflationRate) &&
        Objects.equals(this.retirementTax, retirementCalculatorPercentCovered.retirementTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAge, deathAge, retirementExpenses, portfolioReturn, retirementAge, retirementSavings, retirementIncome, depositSchedule, inflationRate, retirementTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetirementCalculatorPercentCovered {\n");
    
    sb.append("    currentAge: ").append(toIndentedString(currentAge)).append("\n");
    sb.append("    deathAge: ").append(toIndentedString(deathAge)).append("\n");
    sb.append("    retirementExpenses: ").append(toIndentedString(retirementExpenses)).append("\n");
    sb.append("    portfolioReturn: ").append(toIndentedString(portfolioReturn)).append("\n");
    sb.append("    retirementAge: ").append(toIndentedString(retirementAge)).append("\n");
    sb.append("    retirementSavings: ").append(toIndentedString(retirementSavings)).append("\n");
    sb.append("    retirementIncome: ").append(toIndentedString(retirementIncome)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    retirementTax: ").append(toIndentedString(retirementTax)).append("\n");
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

