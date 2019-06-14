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
import io.swagger.client.model.EducationCalculatorReturnDetail;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EducationCalculatorDepositamountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class EducationCalculatorDepositamountResponse {
  @SerializedName("deposit_amount")
  private BigDecimal depositAmount = null;

  /**
   * The period interval to be used in relation to deposit_duration.
   */
  @JsonAdapter(DepositFrequencyIntervalEnum.Adapter.class)
  public enum DepositFrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week");

    private String value;

    DepositFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepositFrequencyIntervalEnum fromValue(String text) {
      for (DepositFrequencyIntervalEnum b : DepositFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepositFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepositFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepositFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepositFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deposit_frequency_interval")
  private DepositFrequencyIntervalEnum depositFrequencyInterval = DepositFrequencyIntervalEnum.YEAR;

  @SerializedName("projected_accumulation_savings")
  private BigDecimal projectedAccumulationSavings = null;

  @SerializedName("total_earnings")
  private BigDecimal totalEarnings = null;

  @SerializedName("total_contributions")
  private BigDecimal totalContributions = null;

  @SerializedName("total_cost")
  private BigDecimal totalCost = null;

  @SerializedName("total_taxes")
  private BigDecimal totalTaxes = null;

  @SerializedName("return_details")
  private Map<String, EducationCalculatorReturnDetail> returnDetails = new HashMap<String, EducationCalculatorReturnDetail>();

  public EducationCalculatorDepositamountResponse depositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * The deposit amount to meet the education goal.
   * minimum: 0
   * @return depositAmount
  **/
  @ApiModelProperty(required = true, value = "The deposit amount to meet the education goal.")
  public BigDecimal getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(BigDecimal depositAmount) {
    this.depositAmount = depositAmount;
  }

  public EducationCalculatorDepositamountResponse depositFrequencyInterval(DepositFrequencyIntervalEnum depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
    return this;
  }

   /**
   * The period interval to be used in relation to deposit_duration.
   * @return depositFrequencyInterval
  **/
  @ApiModelProperty(required = true, value = "The period interval to be used in relation to deposit_duration.")
  public DepositFrequencyIntervalEnum getDepositFrequencyInterval() {
    return depositFrequencyInterval;
  }

  public void setDepositFrequencyInterval(DepositFrequencyIntervalEnum depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
  }

  public EducationCalculatorDepositamountResponse projectedAccumulationSavings(BigDecimal projectedAccumulationSavings) {
    this.projectedAccumulationSavings = projectedAccumulationSavings;
    return this;
  }

   /**
   * The projected balance at the end of accumulation_horizon.
   * @return projectedAccumulationSavings
  **/
  @ApiModelProperty(required = true, value = "The projected balance at the end of accumulation_horizon.")
  public BigDecimal getProjectedAccumulationSavings() {
    return projectedAccumulationSavings;
  }

  public void setProjectedAccumulationSavings(BigDecimal projectedAccumulationSavings) {
    this.projectedAccumulationSavings = projectedAccumulationSavings;
  }

  public EducationCalculatorDepositamountResponse totalEarnings(BigDecimal totalEarnings) {
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

  public EducationCalculatorDepositamountResponse totalContributions(BigDecimal totalContributions) {
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

  public EducationCalculatorDepositamountResponse totalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * The total cost of education over the decumulation horizon, represented in future dollars.
   * minimum: 0
   * @return totalCost
  **/
  @ApiModelProperty(required = true, value = "The total cost of education over the decumulation horizon, represented in future dollars.")
  public BigDecimal getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
  }

  public EducationCalculatorDepositamountResponse totalTaxes(BigDecimal totalTaxes) {
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

  public EducationCalculatorDepositamountResponse returnDetails(Map<String, EducationCalculatorReturnDetail> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public EducationCalculatorDepositamountResponse putReturnDetailsItem(String key, EducationCalculatorReturnDetail returnDetailsItem) {
    this.returnDetails.put(key, returnDetailsItem);
    return this;
  }

   /**
   * Get returnDetails
   * @return returnDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, EducationCalculatorReturnDetail> getReturnDetails() {
    return returnDetails;
  }

  public void setReturnDetails(Map<String, EducationCalculatorReturnDetail> returnDetails) {
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
    EducationCalculatorDepositamountResponse educationCalculatorDepositamountResponse = (EducationCalculatorDepositamountResponse) o;
    return Objects.equals(this.depositAmount, educationCalculatorDepositamountResponse.depositAmount) &&
        Objects.equals(this.depositFrequencyInterval, educationCalculatorDepositamountResponse.depositFrequencyInterval) &&
        Objects.equals(this.projectedAccumulationSavings, educationCalculatorDepositamountResponse.projectedAccumulationSavings) &&
        Objects.equals(this.totalEarnings, educationCalculatorDepositamountResponse.totalEarnings) &&
        Objects.equals(this.totalContributions, educationCalculatorDepositamountResponse.totalContributions) &&
        Objects.equals(this.totalCost, educationCalculatorDepositamountResponse.totalCost) &&
        Objects.equals(this.totalTaxes, educationCalculatorDepositamountResponse.totalTaxes) &&
        Objects.equals(this.returnDetails, educationCalculatorDepositamountResponse.returnDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositAmount, depositFrequencyInterval, projectedAccumulationSavings, totalEarnings, totalContributions, totalCost, totalTaxes, returnDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationCalculatorDepositamountResponse {\n");
    
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositFrequencyInterval: ").append(toIndentedString(depositFrequencyInterval)).append("\n");
    sb.append("    projectedAccumulationSavings: ").append(toIndentedString(projectedAccumulationSavings)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    totalContributions: ").append(toIndentedString(totalContributions)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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

