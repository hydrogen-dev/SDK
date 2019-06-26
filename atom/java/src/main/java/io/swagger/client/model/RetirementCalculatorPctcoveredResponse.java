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
import io.swagger.client.model.RetirementReturnDetail;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RetirementCalculatorPctcoveredResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class RetirementCalculatorPctcoveredResponse {
  @SerializedName("achievable_expenses")
  private BigDecimal achievableExpenses = null;

  @SerializedName("target_expenses")
  private BigDecimal targetExpenses = null;

  @SerializedName("percent_of_expenses_covered")
  private BigDecimal percentOfExpensesCovered = null;

  @SerializedName("projected_savings_at_retirement")
  private BigDecimal projectedSavingsAtRetirement = null;

  @SerializedName("total_earnings")
  private BigDecimal totalEarnings = null;

  @SerializedName("total_contributions")
  private BigDecimal totalContributions = null;

  @SerializedName("total_withdrawals")
  private BigDecimal totalWithdrawals = null;

  @SerializedName("total_taxes")
  private BigDecimal totalTaxes = null;

  @SerializedName("return_details")
  private Map<String, RetirementReturnDetail> returnDetails = new HashMap<String, RetirementReturnDetail>();

  public RetirementCalculatorPctcoveredResponse achievableExpenses(BigDecimal achievableExpenses) {
    this.achievableExpenses = achievableExpenses;
    return this;
  }

   /**
   * The annual retirement expenses that can be covered, expressed in today&#39;s dollars.
   * @return achievableExpenses
  **/
  @ApiModelProperty(required = true, value = "The annual retirement expenses that can be covered, expressed in today's dollars.")
  public BigDecimal getAchievableExpenses() {
    return achievableExpenses;
  }

  public void setAchievableExpenses(BigDecimal achievableExpenses) {
    this.achievableExpenses = achievableExpenses;
  }

  public RetirementCalculatorPctcoveredResponse targetExpenses(BigDecimal targetExpenses) {
    this.targetExpenses = targetExpenses;
    return this;
  }

   /**
   * The retirement_expenses input representing the target annual goal amount.
   * @return targetExpenses
  **/
  @ApiModelProperty(required = true, value = "The retirement_expenses input representing the target annual goal amount.")
  public BigDecimal getTargetExpenses() {
    return targetExpenses;
  }

  public void setTargetExpenses(BigDecimal targetExpenses) {
    this.targetExpenses = targetExpenses;
  }

  public RetirementCalculatorPctcoveredResponse percentOfExpensesCovered(BigDecimal percentOfExpensesCovered) {
    this.percentOfExpensesCovered = percentOfExpensesCovered;
    return this;
  }

   /**
   * The percentage of expenses covered, given the other user inputs.
   * minimum: 0
   * @return percentOfExpensesCovered
  **/
  @ApiModelProperty(required = true, value = "The percentage of expenses covered, given the other user inputs.")
  public BigDecimal getPercentOfExpensesCovered() {
    return percentOfExpensesCovered;
  }

  public void setPercentOfExpensesCovered(BigDecimal percentOfExpensesCovered) {
    this.percentOfExpensesCovered = percentOfExpensesCovered;
  }

  public RetirementCalculatorPctcoveredResponse projectedSavingsAtRetirement(BigDecimal projectedSavingsAtRetirement) {
    this.projectedSavingsAtRetirement = projectedSavingsAtRetirement;
    return this;
  }

   /**
   * The total amount of savings projected to be available at retirement, expressed in today’s dollars.
   * @return projectedSavingsAtRetirement
  **/
  @ApiModelProperty(required = true, value = "The total amount of savings projected to be available at retirement, expressed in today’s dollars.")
  public BigDecimal getProjectedSavingsAtRetirement() {
    return projectedSavingsAtRetirement;
  }

  public void setProjectedSavingsAtRetirement(BigDecimal projectedSavingsAtRetirement) {
    this.projectedSavingsAtRetirement = projectedSavingsAtRetirement;
  }

  public RetirementCalculatorPctcoveredResponse totalEarnings(BigDecimal totalEarnings) {
    this.totalEarnings = totalEarnings;
    return this;
  }

   /**
   * The total earnings generated over the horizon.
   * @return totalEarnings
  **/
  @ApiModelProperty(required = true, value = "The total earnings generated over the horizon.")
  public BigDecimal getTotalEarnings() {
    return totalEarnings;
  }

  public void setTotalEarnings(BigDecimal totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public RetirementCalculatorPctcoveredResponse totalContributions(BigDecimal totalContributions) {
    this.totalContributions = totalContributions;
    return this;
  }

   /**
   * The total contributions added over the horizon.
   * @return totalContributions
  **/
  @ApiModelProperty(required = true, value = "The total contributions added over the horizon.")
  public BigDecimal getTotalContributions() {
    return totalContributions;
  }

  public void setTotalContributions(BigDecimal totalContributions) {
    this.totalContributions = totalContributions;
  }

  public RetirementCalculatorPctcoveredResponse totalWithdrawals(BigDecimal totalWithdrawals) {
    this.totalWithdrawals = totalWithdrawals;
    return this;
  }

   /**
   * The total amount of withdrawals taken over decumulation_horizon.
   * @return totalWithdrawals
  **/
  @ApiModelProperty(required = true, value = "The total amount of withdrawals taken over decumulation_horizon.")
  public BigDecimal getTotalWithdrawals() {
    return totalWithdrawals;
  }

  public void setTotalWithdrawals(BigDecimal totalWithdrawals) {
    this.totalWithdrawals = totalWithdrawals;
  }

  public RetirementCalculatorPctcoveredResponse totalTaxes(BigDecimal totalTaxes) {
    this.totalTaxes = totalTaxes;
    return this;
  }

   /**
   * The total taxes paid on withdrawals over decumulation_horizon.
   * @return totalTaxes
  **/
  @ApiModelProperty(required = true, value = "The total taxes paid on withdrawals over decumulation_horizon.")
  public BigDecimal getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(BigDecimal totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public RetirementCalculatorPctcoveredResponse returnDetails(Map<String, RetirementReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public RetirementCalculatorPctcoveredResponse putReturnDetailsItem(String key, RetirementReturnDetail returnDetailsItem) {
    this.returnDetails.put(key, returnDetailsItem);
    return this;
  }

   /**
   * Get returnDetails
   * @return returnDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, RetirementReturnDetail> getReturnDetails() {
    return returnDetails;
  }

  public void setReturnDetails(Map<String, RetirementReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetirementCalculatorPctcoveredResponse retirementCalculatorPctcoveredResponse = (RetirementCalculatorPctcoveredResponse) o;
    return Objects.equals(this.achievableExpenses, retirementCalculatorPctcoveredResponse.achievableExpenses) &&
        Objects.equals(this.targetExpenses, retirementCalculatorPctcoveredResponse.targetExpenses) &&
        Objects.equals(this.percentOfExpensesCovered, retirementCalculatorPctcoveredResponse.percentOfExpensesCovered) &&
        Objects.equals(this.projectedSavingsAtRetirement, retirementCalculatorPctcoveredResponse.projectedSavingsAtRetirement) &&
        Objects.equals(this.totalEarnings, retirementCalculatorPctcoveredResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, retirementCalculatorPctcoveredResponse.totalContributions) &&
        Objects.equals(this.totalWithdrawals, retirementCalculatorPctcoveredResponse.totalWithdrawals) &&
        Objects.equals(this.totalTaxes, retirementCalculatorPctcoveredResponse.totalTaxes) &&
        Objects.equals(this.returnDetails, retirementCalculatorPctcoveredResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievableExpenses, targetExpenses, percentOfExpensesCovered, projectedSavingsAtRetirement, totalEarnings, totalContributions, totalWithdrawals, totalTaxes, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetirementCalculatorPctcoveredResponse {\n");
    
    sb.append("    achievableExpenses: ").append(toIndentedString(achievableExpenses)).append("\n");
    sb.append("    targetExpenses: ").append(toIndentedString(targetExpenses)).append("\n");
    sb.append("    percentOfExpensesCovered: ").append(toIndentedString(percentOfExpensesCovered)).append("\n");
    sb.append("    projectedSavingsAtRetirement: ").append(toIndentedString(projectedSavingsAtRetirement)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    totalContributions: ").append(toIndentedString(totalContributions)).append("\n");
    sb.append("    totalWithdrawals: ").append(toIndentedString(totalWithdrawals)).append("\n");
    sb.append("    totalTaxes: ").append(toIndentedString(totalTaxes)).append("\n");
    sb.append("    returnDetails: ").append(toIndentedString(returnDetails)).append("\n");
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

