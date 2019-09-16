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
import io.swagger.client.model.PurchaseCalculatorReturnDetail;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PurchaseCalculatorDepositamountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class PurchaseCalculatorDepositamountResponse {
  @SerializedName("deposit_amount")
  private BigDecimal depositAmount = null;

  @SerializedName("deposit_frequency_interval")
  private String depositFrequencyInterval = null;

  @SerializedName("adjusted_goal_amount")
  private BigDecimal adjustedGoalAmount = null;

  @SerializedName("projected_savings_at_purchase_horizon")
  private BigDecimal projectedSavingsAtPurchaseHorizon = null;

  @SerializedName("total_earnings")
  private BigDecimal totalEarnings = null;

  @SerializedName("total_contributions")
  private BigDecimal totalContributions = null;

  @SerializedName("return_details")
  private Map<String, PurchaseCalculatorReturnDetail> returnDetails = new HashMap<String, PurchaseCalculatorReturnDetail>();

  public PurchaseCalculatorDepositamountResponse depositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * The amount to deposit in order to meet the purchase goal.
   * minimum: 0
   * @return depositAmount
  **/
  @ApiModelProperty(required = true, value = "The amount to deposit in order to meet the purchase goal.")
  public BigDecimal getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
  }

  public PurchaseCalculatorDepositamountResponse depositFrequencyInterval(String depositFrequencyInterval) {
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

  public PurchaseCalculatorDepositamountResponse adjustedGoalAmount(BigDecimal adjustedGoalAmount) {
    this.adjustedGoalAmount = adjustedGoalAmount;
    return this;
  }

   /**
   * The effective goal target amount, adjusted for taxes and inflation.
   * @return adjustedGoalAmount
  **/
  @ApiModelProperty(required = true, value = "The effective goal target amount, adjusted for taxes and inflation.")
  public BigDecimal getAdjustedGoalAmount() {
    return adjustedGoalAmount;
  }

  public void setAdjustedGoalAmount(BigDecimal adjustedGoalAmount) {
    this.adjustedGoalAmount = adjustedGoalAmount;
  }

  public PurchaseCalculatorDepositamountResponse projectedSavingsAtPurchaseHorizon(BigDecimal projectedSavingsAtPurchaseHorizon) {
    this.projectedSavingsAtPurchaseHorizon = projectedSavingsAtPurchaseHorizon;
    return this;
  }

   /**
   * The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars.
   * minimum: 0
   * @return projectedSavingsAtPurchaseHorizon
  **/
  @ApiModelProperty(required = true, value = "The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars.")
  public BigDecimal getProjectedSavingsAtPurchaseHorizon() {
    return projectedSavingsAtPurchaseHorizon;
  }

  public void setProjectedSavingsAtPurchaseHorizon(BigDecimal projectedSavingsAtPurchaseHorizon) {
    this.projectedSavingsAtPurchaseHorizon = projectedSavingsAtPurchaseHorizon;
  }

  public PurchaseCalculatorDepositamountResponse totalEarnings(BigDecimal totalEarnings) {
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

  public PurchaseCalculatorDepositamountResponse totalContributions(BigDecimal totalContributions) {
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

  public PurchaseCalculatorDepositamountResponse returnDetails(Map<String, PurchaseCalculatorReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public PurchaseCalculatorDepositamountResponse putReturnDetailsItem(String key, PurchaseCalculatorReturnDetail returnDetailsItem) {
    this.returnDetails.put(key, returnDetailsItem);
    return this;
  }

   /**
   * Get returnDetails
   * @return returnDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, PurchaseCalculatorReturnDetail> getReturnDetails() {
    return returnDetails;
  }

  public void setReturnDetails(Map<String, PurchaseCalculatorReturnDetail> returnDetails) {
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
    PurchaseCalculatorDepositamountResponse purchaseCalculatorDepositamountResponse = (PurchaseCalculatorDepositamountResponse) o;
    return Objects.equals(this.depositAmount, purchaseCalculatorDepositamountResponse.depositAmount) &&
        Objects.equals(this.depositFrequencyInterval, purchaseCalculatorDepositamountResponse.depositFrequencyInterval) &&
        Objects.equals(this.adjustedGoalAmount, purchaseCalculatorDepositamountResponse.adjustedGoalAmount) &&
        Objects.equals(this.projectedSavingsAtPurchaseHorizon, purchaseCalculatorDepositamountResponse.projectedSavingsAtPurchaseHorizon) &&
        Objects.equals(this.totalEarnings, purchaseCalculatorDepositamountResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, purchaseCalculatorDepositamountResponse.totalContributions) &&
        Objects.equals(this.returnDetails, purchaseCalculatorDepositamountResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositAmount, depositFrequencyInterval, adjustedGoalAmount, projectedSavingsAtPurchaseHorizon, totalEarnings, totalContributions, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCalculatorDepositamountResponse {\n");
    
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositFrequencyInterval: ").append(toIndentedString(depositFrequencyInterval)).append("\n");
    sb.append("    adjustedGoalAmount: ").append(toIndentedString(adjustedGoalAmount)).append("\n");
    sb.append("    projectedSavingsAtPurchaseHorizon: ").append(toIndentedString(projectedSavingsAtPurchaseHorizon)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    totalContributions: ").append(toIndentedString(totalContributions)).append("\n");
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

