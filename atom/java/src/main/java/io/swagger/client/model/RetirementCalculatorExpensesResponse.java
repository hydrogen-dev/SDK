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
 * RetirementCalculatorExpensesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class RetirementCalculatorExpensesResponse {
  @SerializedName("projected_retirement_expenses")
  private BigDecimal projectedRetirementExpenses = null;

  @SerializedName("projected_retirement_expenses_adjusted")
  private BigDecimal projectedRetirementExpensesAdjusted = null;

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

  public RetirementCalculatorExpensesResponse projectedRetirementExpenses(BigDecimal projectedRetirementExpenses) {
    this.projectedRetirementExpenses = projectedRetirementExpenses;
    return this;
  }

   /**
   * The after-tax retirement expenses available expressed in today’s dollars.
   * @return projectedRetirementExpenses
  **/
  @ApiModelProperty(required = true, value = "The after-tax retirement expenses available expressed in today’s dollars.")
  public BigDecimal getProjectedRetirementExpenses() {
    return projectedRetirementExpenses;
  }

  public void setProjectedRetirementExpenses(BigDecimal projectedRetirementExpenses) {
    this.projectedRetirementExpenses = projectedRetirementExpenses;
  }

  public RetirementCalculatorExpensesResponse projectedRetirementExpensesAdjusted(BigDecimal projectedRetirementExpensesAdjusted) {
    this.projectedRetirementExpensesAdjusted = projectedRetirementExpensesAdjusted;
    return this;
  }

   /**
   * The after-tax retirement expenses available, expressed in today&#39;s dollars.
   * @return projectedRetirementExpensesAdjusted
  **/
  @ApiModelProperty(required = true, value = "The after-tax retirement expenses available, expressed in today's dollars.")
  public BigDecimal getProjectedRetirementExpensesAdjusted() {
    return projectedRetirementExpensesAdjusted;
  }

  public void setProjectedRetirementExpensesAdjusted(BigDecimal projectedRetirementExpensesAdjusted) {
    this.projectedRetirementExpensesAdjusted = projectedRetirementExpensesAdjusted;
  }

  public RetirementCalculatorExpensesResponse projectedSavingsAtRetirement(BigDecimal projectedSavingsAtRetirement) {
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

  public RetirementCalculatorExpensesResponse totalEarnings(BigDecimal totalEarnings) {
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

  public RetirementCalculatorExpensesResponse totalContributions(BigDecimal totalContributions) {
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

  public RetirementCalculatorExpensesResponse totalWithdrawals(BigDecimal totalWithdrawals) {
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

  public RetirementCalculatorExpensesResponse totalTaxes(BigDecimal totalTaxes) {
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

  public RetirementCalculatorExpensesResponse returnDetails(Map<String, RetirementReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public RetirementCalculatorExpensesResponse putReturnDetailsItem(String key, RetirementReturnDetail returnDetailsItem) {
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
    RetirementCalculatorExpensesResponse retirementCalculatorExpensesResponse = (RetirementCalculatorExpensesResponse) o;
    return Objects.equals(this.projectedRetirementExpenses, retirementCalculatorExpensesResponse.projectedRetirementExpenses) &&
        Objects.equals(this.projectedRetirementExpensesAdjusted, retirementCalculatorExpensesResponse.projectedRetirementExpensesAdjusted) &&
        Objects.equals(this.projectedSavingsAtRetirement, retirementCalculatorExpensesResponse.projectedSavingsAtRetirement) &&
        Objects.equals(this.totalEarnings, retirementCalculatorExpensesResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, retirementCalculatorExpensesResponse.totalContributions) &&
        Objects.equals(this.totalWithdrawals, retirementCalculatorExpensesResponse.totalWithdrawals) &&
        Objects.equals(this.totalTaxes, retirementCalculatorExpensesResponse.totalTaxes) &&
        Objects.equals(this.returnDetails, retirementCalculatorExpensesResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectedRetirementExpenses, projectedRetirementExpensesAdjusted, projectedSavingsAtRetirement, totalEarnings, totalContributions, totalWithdrawals, totalTaxes, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetirementCalculatorExpensesResponse {\n");
    
    sb.append("    projectedRetirementExpenses: ").append(toIndentedString(projectedRetirementExpenses)).append("\n");
    sb.append("    projectedRetirementExpensesAdjusted: ").append(toIndentedString(projectedRetirementExpensesAdjusted)).append("\n");
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

