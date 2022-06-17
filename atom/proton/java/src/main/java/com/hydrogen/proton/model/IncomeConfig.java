/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * IncomeConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class IncomeConfig {
  @SerializedName("annual_net_take_home_pay")
  private BigDecimal annualNetTakeHomePay = null;

  @SerializedName("income_benefit_duration")
  private Integer incomeBenefitDuration = 10;

  @SerializedName("percentage_of_income_covered")
  private Float percentageOfIncomeCovered = 1.0f;

  public IncomeConfig annualNetTakeHomePay(BigDecimal annualNetTakeHomePay) {
    this.annualNetTakeHomePay = annualNetTakeHomePay;
    return this;
  }

   /**
   * Get annualNetTakeHomePay
   * minimum: 0
   * @return annualNetTakeHomePay
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAnnualNetTakeHomePay() {
    return annualNetTakeHomePay;
  }

  public void setAnnualNetTakeHomePay(BigDecimal annualNetTakeHomePay) {
    this.annualNetTakeHomePay = annualNetTakeHomePay;
  }

  public IncomeConfig incomeBenefitDuration(Integer incomeBenefitDuration) {
    this.incomeBenefitDuration = incomeBenefitDuration;
    return this;
  }

   /**
   * Get incomeBenefitDuration
   * minimum: 1
   * @return incomeBenefitDuration
  **/
  @ApiModelProperty(value = "")
  public Integer getIncomeBenefitDuration() {
    return incomeBenefitDuration;
  }

  public void setIncomeBenefitDuration(Integer incomeBenefitDuration) {
    this.incomeBenefitDuration = incomeBenefitDuration;
  }

  public IncomeConfig percentageOfIncomeCovered(Float percentageOfIncomeCovered) {
    this.percentageOfIncomeCovered = percentageOfIncomeCovered;
    return this;
  }

   /**
   * Get percentageOfIncomeCovered
   * minimum: 0
   * maximum: 1
   * @return percentageOfIncomeCovered
  **/
  @ApiModelProperty(value = "")
  public Float getPercentageOfIncomeCovered() {
    return percentageOfIncomeCovered;
  }

  public void setPercentageOfIncomeCovered(Float percentageOfIncomeCovered) {
    this.percentageOfIncomeCovered = percentageOfIncomeCovered;
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
        Objects.equals(this.incomeBenefitDuration, incomeConfig.incomeBenefitDuration) &&
        Objects.equals(this.percentageOfIncomeCovered, incomeConfig.percentageOfIncomeCovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualNetTakeHomePay, incomeBenefitDuration, percentageOfIncomeCovered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeConfig {\n");
    
    sb.append("    annualNetTakeHomePay: ").append(toIndentedString(annualNetTakeHomePay)).append("\n");
    sb.append("    incomeBenefitDuration: ").append(toIndentedString(incomeBenefitDuration)).append("\n");
    sb.append("    percentageOfIncomeCovered: ").append(toIndentedString(percentageOfIncomeCovered)).append("\n");
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

