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
 * PurchaseCalculatorPurchaseamountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class PurchaseCalculatorPurchaseamountResponse {
  @SerializedName("purchase_amount")
  private BigDecimal purchaseAmount = null;

  @SerializedName("purchase_amount_adjusted")
  private BigDecimal purchaseAmountAdjusted = null;

  @SerializedName("projected_savings_at_purchase_horizon")
  private BigDecimal projectedSavingsAtPurchaseHorizon = null;

  @SerializedName("total_earnings")
  private BigDecimal totalEarnings = null;

  @SerializedName("total_contributions")
  private BigDecimal totalContributions = null;

  @SerializedName("return_details")
  private Map<String, PurchaseCalculatorReturnDetail> returnDetails = new HashMap<String, PurchaseCalculatorReturnDetail>();

  public PurchaseCalculatorPurchaseamountResponse purchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * The amount of the major purchase.
   * minimum: 0
   * @return purchaseAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of the major purchase.")
  public BigDecimal getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public PurchaseCalculatorPurchaseamountResponse purchaseAmountAdjusted(BigDecimal purchaseAmountAdjusted) {
    this.purchaseAmountAdjusted = purchaseAmountAdjusted;
    return this;
  }

   /**
   * The amount of the major purchase, represented in today&#39;s dollars.
   * minimum: 0
   * @return purchaseAmountAdjusted
  **/
  @ApiModelProperty(required = true, value = "The amount of the major purchase, represented in today's dollars.")
  public BigDecimal getPurchaseAmountAdjusted() {
    return purchaseAmountAdjusted;
  }

  public void setPurchaseAmountAdjusted(BigDecimal purchaseAmountAdjusted) {
    this.purchaseAmountAdjusted = purchaseAmountAdjusted;
  }

  public PurchaseCalculatorPurchaseamountResponse projectedSavingsAtPurchaseHorizon(BigDecimal projectedSavingsAtPurchaseHorizon) {
    this.projectedSavingsAtPurchaseHorizon = projectedSavingsAtPurchaseHorizon;
    return this;
  }

   /**
   * The total amount of savings that are projected to be available at the purchase horizon, expressed in today’s dollars.
   * minimum: 0
   * @return projectedSavingsAtPurchaseHorizon
  **/
  @ApiModelProperty(required = true, value = "The total amount of savings that are projected to be available at the purchase horizon, expressed in today’s dollars.")
  public BigDecimal getProjectedSavingsAtPurchaseHorizon() {
    return projectedSavingsAtPurchaseHorizon;
  }

  public void setProjectedSavingsAtPurchaseHorizon(BigDecimal projectedSavingsAtPurchaseHorizon) {
    this.projectedSavingsAtPurchaseHorizon = projectedSavingsAtPurchaseHorizon;
  }

  public PurchaseCalculatorPurchaseamountResponse totalEarnings(BigDecimal totalEarnings) {
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

  public PurchaseCalculatorPurchaseamountResponse totalContributions(BigDecimal totalContributions) {
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

  public PurchaseCalculatorPurchaseamountResponse returnDetails(Map<String, PurchaseCalculatorReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public PurchaseCalculatorPurchaseamountResponse putReturnDetailsItem(String key, PurchaseCalculatorReturnDetail returnDetailsItem) {
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
    PurchaseCalculatorPurchaseamountResponse purchaseCalculatorPurchaseamountResponse = (PurchaseCalculatorPurchaseamountResponse) o;
    return Objects.equals(this.purchaseAmount, purchaseCalculatorPurchaseamountResponse.purchaseAmount) &&
        Objects.equals(this.purchaseAmountAdjusted, purchaseCalculatorPurchaseamountResponse.purchaseAmountAdjusted) &&
        Objects.equals(this.projectedSavingsAtPurchaseHorizon, purchaseCalculatorPurchaseamountResponse.projectedSavingsAtPurchaseHorizon) &&
        Objects.equals(this.totalEarnings, purchaseCalculatorPurchaseamountResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, purchaseCalculatorPurchaseamountResponse.totalContributions) &&
        Objects.equals(this.returnDetails, purchaseCalculatorPurchaseamountResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseAmount, purchaseAmountAdjusted, projectedSavingsAtPurchaseHorizon, totalEarnings, totalContributions, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCalculatorPurchaseamountResponse {\n");
    
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    purchaseAmountAdjusted: ").append(toIndentedString(purchaseAmountAdjusted)).append("\n");
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

