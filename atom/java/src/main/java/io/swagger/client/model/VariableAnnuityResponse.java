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
import io.swagger.client.model.VariableAnnuityReturnDetail;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VariableAnnuityResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class VariableAnnuityResponse {
  @SerializedName("accumulation_balance")
  private BigDecimal accumulationBalance = null;

  @SerializedName("total_earnings")
  private BigDecimal totalEarnings = null;

  @SerializedName("total_contributions")
  private BigDecimal totalContributions = null;

  @SerializedName("total_withdrawals")
  private BigDecimal totalWithdrawals = null;

  @SerializedName("total_taxes")
  private BigDecimal totalTaxes = null;

  @SerializedName("return_details")
  private Map<String, VariableAnnuityReturnDetail> returnDetails = new HashMap<String, VariableAnnuityReturnDetail>();

  public VariableAnnuityResponse accumulationBalance(BigDecimal accumulationBalance) {
    this.accumulationBalance = accumulationBalance;
    return this;
  }

   /**
   * The balance at the end of accumulation_horizon, before annuity payments occur.
   * @return accumulationBalance
  **/
  @ApiModelProperty(required = true, value = "The balance at the end of accumulation_horizon, before annuity payments occur.")
  public BigDecimal getAccumulationBalance() {
    return accumulationBalance;
  }

  public void setAccumulationBalance(BigDecimal accumulationBalance) {
    this.accumulationBalance = accumulationBalance;
  }

  public VariableAnnuityResponse totalEarnings(BigDecimal totalEarnings) {
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

  public VariableAnnuityResponse totalContributions(BigDecimal totalContributions) {
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

  public VariableAnnuityResponse totalWithdrawals(BigDecimal totalWithdrawals) {
    this.totalWithdrawals = totalWithdrawals;
    return this;
  }

   /**
   * The total amount of annuity payments over decumulation_horizon.
   * @return totalWithdrawals
  **/
  @ApiModelProperty(required = true, value = "The total amount of annuity payments over decumulation_horizon.")
  public BigDecimal getTotalWithdrawals() {
    return totalWithdrawals;
  }

  public void setTotalWithdrawals(BigDecimal totalWithdrawals) {
    this.totalWithdrawals = totalWithdrawals;
  }

  public VariableAnnuityResponse totalTaxes(BigDecimal totalTaxes) {
    this.totalTaxes = totalTaxes;
    return this;
  }

   /**
   * The total taxes paid on annuity payments over decumulation_horizon.
   * @return totalTaxes
  **/
  @ApiModelProperty(required = true, value = "The total taxes paid on annuity payments over decumulation_horizon.")
  public BigDecimal getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(BigDecimal totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public VariableAnnuityResponse returnDetails(Map<String, VariableAnnuityReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public VariableAnnuityResponse putReturnDetailsItem(String key, VariableAnnuityReturnDetail returnDetailsItem) {
    this.returnDetails.put(key, returnDetailsItem);
    return this;
  }

   /**
   * Get returnDetails
   * @return returnDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, VariableAnnuityReturnDetail> getReturnDetails() {
    return returnDetails;
  }

  public void setReturnDetails(Map<String, VariableAnnuityReturnDetail> returnDetails) {
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
    VariableAnnuityResponse variableAnnuityResponse = (VariableAnnuityResponse) o;
    return Objects.equals(this.accumulationBalance, variableAnnuityResponse.accumulationBalance) &&
        Objects.equals(this.totalEarnings, variableAnnuityResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, variableAnnuityResponse.totalContributions) &&
        Objects.equals(this.totalWithdrawals, variableAnnuityResponse.totalWithdrawals) &&
        Objects.equals(this.totalTaxes, variableAnnuityResponse.totalTaxes) &&
        Objects.equals(this.returnDetails, variableAnnuityResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulationBalance, totalEarnings, totalContributions, totalWithdrawals, totalTaxes, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableAnnuityResponse {\n");
    
    sb.append("    accumulationBalance: ").append(toIndentedString(accumulationBalance)).append("\n");
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

