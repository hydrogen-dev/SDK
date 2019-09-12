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
import io.swagger.client.model.BudgetCalculatorResponseBudgetComponents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * BudgetCalculatorResponseBudgetTrack
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class BudgetCalculatorResponseBudgetTrack {
  @SerializedName("period_start")
  private LocalDate periodStart = null;

  @SerializedName("period_end")
  private LocalDate periodEnd = null;

  @SerializedName("total_funds_budgeted")
  private Double totalFundsBudgeted = null;

  @SerializedName("total_funds_spent")
  private Double totalFundsSpent = null;

  @SerializedName("total_funds_remaining")
  private Double totalFundsRemaining = null;

  @SerializedName("budget_components")
  private List<BudgetCalculatorResponseBudgetComponents> budgetComponents = null;

  public BudgetCalculatorResponseBudgetTrack periodStart(LocalDate periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Start date of the budget period
   * @return periodStart
  **/
  @ApiModelProperty(value = "Start date of the budget period")
  public LocalDate getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(LocalDate periodStart) {
    this.periodStart = periodStart;
  }

  public BudgetCalculatorResponseBudgetTrack periodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * End date of the budget period
   * @return periodEnd
  **/
  @ApiModelProperty(value = "End date of the budget period")
  public LocalDate getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
  }

  public BudgetCalculatorResponseBudgetTrack totalFundsBudgeted(Double totalFundsBudgeted) {
    this.totalFundsBudgeted = totalFundsBudgeted;
    return this;
  }

   /**
   * Total amount of funds originally budgeted
   * @return totalFundsBudgeted
  **/
  @ApiModelProperty(value = "Total amount of funds originally budgeted")
  public Double getTotalFundsBudgeted() {
    return totalFundsBudgeted;
  }

  public void setTotalFundsBudgeted(Double totalFundsBudgeted) {
    this.totalFundsBudgeted = totalFundsBudgeted;
  }

  public BudgetCalculatorResponseBudgetTrack totalFundsSpent(Double totalFundsSpent) {
    this.totalFundsSpent = totalFundsSpent;
    return this;
  }

   /**
   * Total amount of funds spent
   * @return totalFundsSpent
  **/
  @ApiModelProperty(value = "Total amount of funds spent")
  public Double getTotalFundsSpent() {
    return totalFundsSpent;
  }

  public void setTotalFundsSpent(Double totalFundsSpent) {
    this.totalFundsSpent = totalFundsSpent;
  }

  public BudgetCalculatorResponseBudgetTrack totalFundsRemaining(Double totalFundsRemaining) {
    this.totalFundsRemaining = totalFundsRemaining;
    return this;
  }

   /**
   * Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent
   * @return totalFundsRemaining
  **/
  @ApiModelProperty(value = "Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent")
  public Double getTotalFundsRemaining() {
    return totalFundsRemaining;
  }

  public void setTotalFundsRemaining(Double totalFundsRemaining) {
    this.totalFundsRemaining = totalFundsRemaining;
  }

  public BudgetCalculatorResponseBudgetTrack budgetComponents(List<BudgetCalculatorResponseBudgetComponents> budgetComponents) {
    this.budgetComponents = budgetComponents;
    return this;
  }

  public BudgetCalculatorResponseBudgetTrack addBudgetComponentsItem(BudgetCalculatorResponseBudgetComponents budgetComponentsItem) {
    if (this.budgetComponents == null) {
      this.budgetComponents = new ArrayList<BudgetCalculatorResponseBudgetComponents>();
    }
    this.budgetComponents.add(budgetComponentsItem);
    return this;
  }

   /**
   * Details about each item defined in the budget
   * @return budgetComponents
  **/
  @ApiModelProperty(value = "Details about each item defined in the budget")
  public List<BudgetCalculatorResponseBudgetComponents> getBudgetComponents() {
    return budgetComponents;
  }

  public void setBudgetComponents(List<BudgetCalculatorResponseBudgetComponents> budgetComponents) {
    this.budgetComponents = budgetComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetCalculatorResponseBudgetTrack budgetCalculatorResponseBudgetTrack = (BudgetCalculatorResponseBudgetTrack) o;
    return Objects.equals(this.periodStart, budgetCalculatorResponseBudgetTrack.periodStart) &&
        Objects.equals(this.periodEnd, budgetCalculatorResponseBudgetTrack.periodEnd) &&
        Objects.equals(this.totalFundsBudgeted, budgetCalculatorResponseBudgetTrack.totalFundsBudgeted) &&
        Objects.equals(this.totalFundsSpent, budgetCalculatorResponseBudgetTrack.totalFundsSpent) &&
        Objects.equals(this.totalFundsRemaining, budgetCalculatorResponseBudgetTrack.totalFundsRemaining) &&
        Objects.equals(this.budgetComponents, budgetCalculatorResponseBudgetTrack.budgetComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStart, periodEnd, totalFundsBudgeted, totalFundsSpent, totalFundsRemaining, budgetComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetCalculatorResponseBudgetTrack {\n");
    
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    totalFundsBudgeted: ").append(toIndentedString(totalFundsBudgeted)).append("\n");
    sb.append("    totalFundsSpent: ").append(toIndentedString(totalFundsSpent)).append("\n");
    sb.append("    totalFundsRemaining: ").append(toIndentedString(totalFundsRemaining)).append("\n");
    sb.append("    budgetComponents: ").append(toIndentedString(budgetComponents)).append("\n");
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

