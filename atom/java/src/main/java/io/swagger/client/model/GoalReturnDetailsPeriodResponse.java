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
 * GoalReturnDetailsPeriodResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class GoalReturnDetailsPeriodResponse {
  @SerializedName("period_earnings")
  private BigDecimal periodEarnings = null;

  @SerializedName("period_deposit")
  private BigDecimal periodDeposit = null;

  @SerializedName("period_withdrawal")
  private BigDecimal periodWithdrawal = null;

  @SerializedName("cumulative_earnings")
  private BigDecimal cumulativeEarnings = null;

  @SerializedName("cumulative_deposits")
  private BigDecimal cumulativeDeposits = null;

  @SerializedName("cumulative_withdrawals")
  private BigDecimal cumulativeWithdrawals = null;

  @SerializedName("ending_balance")
  private BigDecimal endingBalance = null;

  public GoalReturnDetailsPeriodResponse periodEarnings(BigDecimal periodEarnings) {
    this.periodEarnings = periodEarnings;
    return this;
  }

   /**
   * The investment earnings for this period.
   * @return periodEarnings
  **/
  @ApiModelProperty(required = true, value = "The investment earnings for this period.")
  public BigDecimal getPeriodEarnings() {
    return periodEarnings;
  }

  public void setPeriodEarnings(BigDecimal periodEarnings) {
    this.periodEarnings = periodEarnings;
  }

  public GoalReturnDetailsPeriodResponse periodDeposit(BigDecimal periodDeposit) {
    this.periodDeposit = periodDeposit;
    return this;
  }

   /**
   * The deposit made for this period in the accumulation phase.
   * minimum: 0
   * @return periodDeposit
  **/
  @ApiModelProperty(required = true, value = "The deposit made for this period in the accumulation phase.")
  public BigDecimal getPeriodDeposit() {
    return periodDeposit;
  }

  public void setPeriodDeposit(BigDecimal periodDeposit) {
    this.periodDeposit = periodDeposit;
  }

  public GoalReturnDetailsPeriodResponse periodWithdrawal(BigDecimal periodWithdrawal) {
    this.periodWithdrawal = periodWithdrawal;
    return this;
  }

   /**
   * The withdrawal made for this period.
   * minimum: 0
   * @return periodWithdrawal
  **/
  @ApiModelProperty(required = true, value = "The withdrawal made for this period.")
  public BigDecimal getPeriodWithdrawal() {
    return periodWithdrawal;
  }

  public void setPeriodWithdrawal(BigDecimal periodWithdrawal) {
    this.periodWithdrawal = periodWithdrawal;
  }

  public GoalReturnDetailsPeriodResponse cumulativeEarnings(BigDecimal cumulativeEarnings) {
    this.cumulativeEarnings = cumulativeEarnings;
    return this;
  }

   /**
   * The cumulative investment earnings made up to and including this period.
   * @return cumulativeEarnings
  **/
  @ApiModelProperty(required = true, value = "The cumulative investment earnings made up to and including this period.")
  public BigDecimal getCumulativeEarnings() {
    return cumulativeEarnings;
  }

  public void setCumulativeEarnings(BigDecimal cumulativeEarnings) {
    this.cumulativeEarnings = cumulativeEarnings;
  }

  public GoalReturnDetailsPeriodResponse cumulativeDeposits(BigDecimal cumulativeDeposits) {
    this.cumulativeDeposits = cumulativeDeposits;
    return this;
  }

   /**
   * The cumulative deposits made up to and including this period for the decumulation phase.
   * minimum: 0
   * @return cumulativeDeposits
  **/
  @ApiModelProperty(required = true, value = "The cumulative deposits made up to and including this period for the decumulation phase.")
  public BigDecimal getCumulativeDeposits() {
    return cumulativeDeposits;
  }

  public void setCumulativeDeposits(BigDecimal cumulativeDeposits) {
    this.cumulativeDeposits = cumulativeDeposits;
  }

  public GoalReturnDetailsPeriodResponse cumulativeWithdrawals(BigDecimal cumulativeWithdrawals) {
    this.cumulativeWithdrawals = cumulativeWithdrawals;
    return this;
  }

   /**
   * The cumulative withdrawals made up to and including this period.
   * minimum: 0
   * @return cumulativeWithdrawals
  **/
  @ApiModelProperty(required = true, value = "The cumulative withdrawals made up to and including this period.")
  public BigDecimal getCumulativeWithdrawals() {
    return cumulativeWithdrawals;
  }

  public void setCumulativeWithdrawals(BigDecimal cumulativeWithdrawals) {
    this.cumulativeWithdrawals = cumulativeWithdrawals;
  }

  public GoalReturnDetailsPeriodResponse endingBalance(BigDecimal endingBalance) {
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
    GoalReturnDetailsPeriodResponse goalReturnDetailsPeriodResponse = (GoalReturnDetailsPeriodResponse) o;
    return Objects.equals(this.periodEarnings, goalReturnDetailsPeriodResponse.periodEarnings) &&
        Objects.equals(this.periodDeposit, goalReturnDetailsPeriodResponse.periodDeposit) &&
        Objects.equals(this.periodWithdrawal, goalReturnDetailsPeriodResponse.periodWithdrawal) &&
        Objects.equals(this.cumulativeEarnings, goalReturnDetailsPeriodResponse.cumulativeEarnings) &&
        Objects.equals(this.cumulativeDeposits, goalReturnDetailsPeriodResponse.cumulativeDeposits) &&
        Objects.equals(this.cumulativeWithdrawals, goalReturnDetailsPeriodResponse.cumulativeWithdrawals) &&
        Objects.equals(this.endingBalance, goalReturnDetailsPeriodResponse.endingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEarnings, periodDeposit, periodWithdrawal, cumulativeEarnings, cumulativeDeposits, cumulativeWithdrawals, endingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalReturnDetailsPeriodResponse {\n");
    
    sb.append("    periodEarnings: ").append(toIndentedString(periodEarnings)).append("\n");
    sb.append("    periodDeposit: ").append(toIndentedString(periodDeposit)).append("\n");
    sb.append("    periodWithdrawal: ").append(toIndentedString(periodWithdrawal)).append("\n");
    sb.append("    cumulativeEarnings: ").append(toIndentedString(cumulativeEarnings)).append("\n");
    sb.append("    cumulativeDeposits: ").append(toIndentedString(cumulativeDeposits)).append("\n");
    sb.append("    cumulativeWithdrawals: ").append(toIndentedString(cumulativeWithdrawals)).append("\n");
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

