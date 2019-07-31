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
 * EducationCalculatorReturnDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class EducationCalculatorReturnDetail {
  @SerializedName("period_earnings")
  private BigDecimal periodEarnings = null;

  @SerializedName("period_contribution")
  private BigDecimal periodContribution = null;

  @SerializedName("period_withdrawal")
  private BigDecimal periodWithdrawal = null;

  @SerializedName("period_taxes")
  private BigDecimal periodTaxes = null;

  @SerializedName("cumulative_earnings")
  private BigDecimal cumulativeEarnings = null;

  @SerializedName("cumulative_contributions")
  private BigDecimal cumulativeContributions = null;

  @SerializedName("cumulative_withdrawals")
  private BigDecimal cumulativeWithdrawals = null;

  @SerializedName("cumulative_taxes")
  private BigDecimal cumulativeTaxes = null;

  @SerializedName("ending_balance")
  private BigDecimal endingBalance = null;

  public EducationCalculatorReturnDetail periodEarnings(BigDecimal periodEarnings) {
    this.periodEarnings = periodEarnings;
    return this;
  }

   /**
   * The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions or withdrawals are made.
   * minimum: 0
   * @return periodEarnings
  **/
  @ApiModelProperty(required = true, value = "The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions or withdrawals are made.")
  public BigDecimal getPeriodEarnings() {
    return periodEarnings;
  }

  public void setPeriodEarnings(BigDecimal periodEarnings) {
    this.periodEarnings = periodEarnings;
  }

  public EducationCalculatorReturnDetail periodContribution(BigDecimal periodContribution) {
    this.periodContribution = periodContribution;
    return this;
  }

   /**
   * The deposit made for this period.
   * minimum: 0
   * @return periodContribution
  **/
  @ApiModelProperty(required = true, value = "The deposit made for this period.")
  public BigDecimal getPeriodContribution() {
    return periodContribution;
  }

  public void setPeriodContribution(BigDecimal periodContribution) {
    this.periodContribution = periodContribution;
  }

  public EducationCalculatorReturnDetail periodWithdrawal(BigDecimal periodWithdrawal) {
    this.periodWithdrawal = periodWithdrawal;
    return this;
  }

   /**
   * The withdrawal made for this period.
   * maximum: 0
   * @return periodWithdrawal
  **/
  @ApiModelProperty(required = true, value = "The withdrawal made for this period.")
  public BigDecimal getPeriodWithdrawal() {
    return periodWithdrawal;
  }

  public void setPeriodWithdrawal(BigDecimal periodWithdrawal) {
    this.periodWithdrawal = periodWithdrawal;
  }

  public EducationCalculatorReturnDetail periodTaxes(BigDecimal periodTaxes) {
    this.periodTaxes = periodTaxes;
    return this;
  }

   /**
   * The taxes paid during this period.
   * maximum: 0
   * @return periodTaxes
  **/
  @ApiModelProperty(required = true, value = "The taxes paid during this period.")
  public BigDecimal getPeriodTaxes() {
    return periodTaxes;
  }

  public void setPeriodTaxes(BigDecimal periodTaxes) {
    this.periodTaxes = periodTaxes;
  }

  public EducationCalculatorReturnDetail cumulativeEarnings(BigDecimal cumulativeEarnings) {
    this.cumulativeEarnings = cumulativeEarnings;
    return this;
  }

   /**
   * The cumulative investment earnings made up to and including this period.
   * minimum: 0
   * @return cumulativeEarnings
  **/
  @ApiModelProperty(required = true, value = "The cumulative investment earnings made up to and including this period.")
  public BigDecimal getCumulativeEarnings() {
    return cumulativeEarnings;
  }

  public void setCumulativeEarnings(BigDecimal cumulativeEarnings) {
    this.cumulativeEarnings = cumulativeEarnings;
  }

  public EducationCalculatorReturnDetail cumulativeContributions(BigDecimal cumulativeContributions) {
    this.cumulativeContributions = cumulativeContributions;
    return this;
  }

   /**
   * The cumulative deposits made up to and including this period.
   * minimum: 0
   * @return cumulativeContributions
  **/
  @ApiModelProperty(required = true, value = "The cumulative deposits made up to and including this period.")
  public BigDecimal getCumulativeContributions() {
    return cumulativeContributions;
  }

  public void setCumulativeContributions(BigDecimal cumulativeContributions) {
    this.cumulativeContributions = cumulativeContributions;
  }

  public EducationCalculatorReturnDetail cumulativeWithdrawals(BigDecimal cumulativeWithdrawals) {
    this.cumulativeWithdrawals = cumulativeWithdrawals;
    return this;
  }

   /**
   * The cumulative withdrawals made up to and including this period.
   * maximum: 0
   * @return cumulativeWithdrawals
  **/
  @ApiModelProperty(required = true, value = "The cumulative withdrawals made up to and including this period.")
  public BigDecimal getCumulativeWithdrawals() {
    return cumulativeWithdrawals;
  }

  public void setCumulativeWithdrawals(BigDecimal cumulativeWithdrawals) {
    this.cumulativeWithdrawals = cumulativeWithdrawals;
  }

  public EducationCalculatorReturnDetail cumulativeTaxes(BigDecimal cumulativeTaxes) {
    this.cumulativeTaxes = cumulativeTaxes;
    return this;
  }

   /**
   * The cumulative taxes paid up to and including this period.
   * maximum: 0
   * @return cumulativeTaxes
  **/
  @ApiModelProperty(required = true, value = "The cumulative taxes paid up to and including this period.")
  public BigDecimal getCumulativeTaxes() {
    return cumulativeTaxes;
  }

  public void setCumulativeTaxes(BigDecimal cumulativeTaxes) {
    this.cumulativeTaxes = cumulativeTaxes;
  }

  public EducationCalculatorReturnDetail endingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
    return this;
  }

   /**
   * The ending balance, inclusive of earnings and contributions for the current period.
   * minimum: 0
   * @return endingBalance
  **/
  @ApiModelProperty(required = true, value = "The ending balance, inclusive of earnings and contributions for the current period.")
  public BigDecimal getEndingBalance() {
    return endingBalance;
  }

  public void setEndingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EducationCalculatorReturnDetail educationCalculatorReturnDetail = (EducationCalculatorReturnDetail) o;
    return Objects.equals(this.periodEarnings, educationCalculatorReturnDetail.periodEarnings) &&
        Objects.equals(this.periodContribution, educationCalculatorReturnDetail.periodContribution) &&
        Objects.equals(this.periodWithdrawal, educationCalculatorReturnDetail.periodWithdrawal) &&
        Objects.equals(this.periodTaxes, educationCalculatorReturnDetail.periodTaxes) &&
        Objects.equals(this.cumulativeEarnings, educationCalculatorReturnDetail.cumulativeEarnings) &&
        Objects.equals(this.cumulativeContributions, educationCalculatorReturnDetail.cumulativeContributions) &&
        Objects.equals(this.cumulativeWithdrawals, educationCalculatorReturnDetail.cumulativeWithdrawals) &&
        Objects.equals(this.cumulativeTaxes, educationCalculatorReturnDetail.cumulativeTaxes) &&
        Objects.equals(this.endingBalance, educationCalculatorReturnDetail.endingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEarnings, periodContribution, periodWithdrawal, periodTaxes, cumulativeEarnings, cumulativeContributions, cumulativeWithdrawals, cumulativeTaxes, endingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationCalculatorReturnDetail {\n");
    
    sb.append("    periodEarnings: ").append(toIndentedString(periodEarnings)).append("\n");
    sb.append("    periodContribution: ").append(toIndentedString(periodContribution)).append("\n");
    sb.append("    periodWithdrawal: ").append(toIndentedString(periodWithdrawal)).append("\n");
    sb.append("    periodTaxes: ").append(toIndentedString(periodTaxes)).append("\n");
    sb.append("    cumulativeEarnings: ").append(toIndentedString(cumulativeEarnings)).append("\n");
    sb.append("    cumulativeContributions: ").append(toIndentedString(cumulativeContributions)).append("\n");
    sb.append("    cumulativeWithdrawals: ").append(toIndentedString(cumulativeWithdrawals)).append("\n");
    sb.append("    cumulativeTaxes: ").append(toIndentedString(cumulativeTaxes)).append("\n");
    sb.append("    endingBalance: ").append(toIndentedString(endingBalance)).append("\n");
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

