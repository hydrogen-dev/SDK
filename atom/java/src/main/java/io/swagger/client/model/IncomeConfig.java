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
 * IncomeConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class IncomeConfig {
  @SerializedName("annual_net_take_home_pay")
  private BigDecimal annualNetTakeHomePay = null;

  @SerializedName("percentage_of_income_covered")
  private BigDecimal percentageOfIncomeCovered = null;

  @SerializedName("income_benefit_duration")
  private BigDecimal incomeBenefitDuration = null;

  public IncomeConfig annualNetTakeHomePay(BigDecimal annualNetTakeHomePay) {
    this.annualNetTakeHomePay = annualNetTakeHomePay;
    return this;
  }

   /**
   * The annual net take-home pay
   * minimum: 0
   * @return annualNetTakeHomePay
  **/
  @ApiModelProperty(required = true, value = "The annual net take-home pay")
  public BigDecimal getAnnualNetTakeHomePay() {
    return annualNetTakeHomePay;
  }

  public void setAnnualNetTakeHomePay(BigDecimal annualNetTakeHomePay) {
    this.annualNetTakeHomePay = annualNetTakeHomePay;
  }

  public IncomeConfig percentageOfIncomeCovered(BigDecimal percentageOfIncomeCovered) {
    this.percentageOfIncomeCovered = percentageOfIncomeCovered;
    return this;
  }

   /**
   * The percentage of income covered
   * minimum: 0
   * maximum: 1
   * @return percentageOfIncomeCovered
  **/
  @ApiModelProperty(value = "The percentage of income covered")
  public BigDecimal getPercentageOfIncomeCovered() {
    return percentageOfIncomeCovered;
  }

  public void setPercentageOfIncomeCovered(BigDecimal percentageOfIncomeCovered) {
    this.percentageOfIncomeCovered = percentageOfIncomeCovered;
  }

  public IncomeConfig incomeBenefitDuration(BigDecimal incomeBenefitDuration) {
    this.incomeBenefitDuration = incomeBenefitDuration;
    return this;
  }

   /**
   * The income benefit duration
   * minimum: 0
   * @return incomeBenefitDuration
  **/
  @ApiModelProperty(value = "The income benefit duration")
  public BigDecimal getIncomeBenefitDuration() {
    return incomeBenefitDuration;
  }

  public void setIncomeBenefitDuration(BigDecimal incomeBenefitDuration) {
    this.incomeBenefitDuration = incomeBenefitDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeConfig incomeConfig = (IncomeConfig) o;
    return Objects.equals(this.annualNetTakeHomePay, incomeConfig.annualNetTakeHomePay) &&
        Objects.equals(this.percentageOfIncomeCovered, incomeConfig.percentageOfIncomeCovered) &&
        Objects.equals(this.incomeBenefitDuration, incomeConfig.incomeBenefitDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualNetTakeHomePay, percentageOfIncomeCovered, incomeBenefitDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeConfig {\n");
    
    sb.append("    annualNetTakeHomePay: ").append(toIndentedString(annualNetTakeHomePay)).append("\n");
    sb.append("    percentageOfIncomeCovered: ").append(toIndentedString(percentageOfIncomeCovered)).append("\n");
    sb.append("    incomeBenefitDuration: ").append(toIndentedString(incomeBenefitDuration)).append("\n");
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

