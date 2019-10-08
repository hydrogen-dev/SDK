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
 * RetirementCalculatorDepositamountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class RetirementCalculatorDepositamountResponse {
  @SerializedName("deposit_amount")
  private BigDecimal depositAmount = null;

  @SerializedName("deposit_frequency_interval")
  private String depositFrequencyInterval = null;

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

  public RetirementCalculatorDepositamountResponse depositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * The amount to deposit in order to meet the retirement goal.
   * @return depositAmount
  **/
  @ApiModelProperty(required = true, value = "The amount to deposit in order to meet the retirement goal.")
  public BigDecimal getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
  }

  public RetirementCalculatorDepositamountResponse depositFrequencyInterval(String depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
    return this;
  }

   /**
   * The frequency interval of the deposit.
   * @return depositFrequencyInterval
  **/
  @ApiModelProperty(required = true, value = "The frequency interval of the deposit.")
  public String getDepositFrequencyInterval() {
    return depositFrequencyInterval;
  }

  public void setDepositFrequencyInterval(String depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
  }

  public RetirementCalculatorDepositamountResponse projectedSavingsAtRetirement(BigDecimal projectedSavingsAtRetirement) {
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

  public RetirementCalculatorDepositamountResponse totalEarnings(BigDecimal totalEarnings) {
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

  public RetirementCalculatorDepositamountResponse totalContributions(BigDecimal totalContributions) {
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

  public RetirementCalculatorDepositamountResponse totalWithdrawals(BigDecimal totalWithdrawals) {
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

  public RetirementCalculatorDepositamountResponse totalTaxes(BigDecimal totalTaxes) {
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

  public RetirementCalculatorDepositamountResponse returnDetails(Map<String, RetirementReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public RetirementCalculatorDepositamountResponse putReturnDetailsItem(String key, RetirementReturnDetail returnDetailsItem) {
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
    RetirementCalculatorDepositamountResponse retirementCalculatorDepositamountResponse = (RetirementCalculatorDepositamountResponse) o;
    return Objects.equals(this.depositAmount, retirementCalculatorDepositamountResponse.depositAmount) &&
        Objects.equals(this.depositFrequencyInterval, retirementCalculatorDepositamountResponse.depositFrequencyInterval) &&
        Objects.equals(this.projectedSavingsAtRetirement, retirementCalculatorDepositamountResponse.projectedSavingsAtRetirement) &&
        Objects.equals(this.totalEarnings, retirementCalculatorDepositamountResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, retirementCalculatorDepositamountResponse.totalContributions) &&
        Objects.equals(this.totalWithdrawals, retirementCalculatorDepositamountResponse.totalWithdrawals) &&
        Objects.equals(this.totalTaxes, retirementCalculatorDepositamountResponse.totalTaxes) &&
        Objects.equals(this.returnDetails, retirementCalculatorDepositamountResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositAmount, depositFrequencyInterval, projectedSavingsAtRetirement, totalEarnings, totalContributions, totalWithdrawals, totalTaxes, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetirementCalculatorDepositamountResponse {\n");
    
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositFrequencyInterval: ").append(toIndentedString(depositFrequencyInterval)).append("\n");
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

