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
 * LifeInsuranceNeedsBreakdown
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class LifeInsuranceNeedsBreakdown {
  @SerializedName("mortgage")
  private BigDecimal mortgage = null;

  @SerializedName("other")
  private BigDecimal other = null;

  @SerializedName("education")
  private BigDecimal education = null;

  @SerializedName("income_replacement")
  private BigDecimal incomeReplacement = null;

  @SerializedName("beneficiary_bequest")
  private BigDecimal beneficiaryBequest = null;

  @SerializedName("end_of_life")
  private BigDecimal endOfLife = null;

  public LifeInsuranceNeedsBreakdown mortgage(BigDecimal mortgage) {
    this.mortgage = mortgage;
    return this;
  }

   /**
   * Insurance required to cover existing mortgage balance, paid immediately.
   * minimum: 0
   * @return mortgage
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover existing mortgage balance, paid immediately.")
  public BigDecimal getMortgage() {
    return mortgage;
  }

  public void setMortgage(BigDecimal mortgage) {
    this.mortgage = mortgage;
  }

  public LifeInsuranceNeedsBreakdown other(BigDecimal other) {
    this.other = other;
    return this;
  }

   /**
   * Insurance required to cover other debt.
   * minimum: 0
   * @return other
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover other debt.")
  public BigDecimal getOther() {
    return other;
  }

  public void setOther(BigDecimal other) {
    this.other = other;
  }

  public LifeInsuranceNeedsBreakdown education(BigDecimal education) {
    this.education = education;
    return this;
  }

   /**
   * Insurance required to cover future education expenses.
   * minimum: 0
   * @return education
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover future education expenses.")
  public BigDecimal getEducation() {
    return education;
  }

  public void setEducation(BigDecimal education) {
    this.education = education;
  }

  public LifeInsuranceNeedsBreakdown incomeReplacement(BigDecimal incomeReplacement) {
    this.incomeReplacement = incomeReplacement;
    return this;
  }

   /**
   * Insurance required to cover loss of income.
   * minimum: 0
   * @return incomeReplacement
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover loss of income.")
  public BigDecimal getIncomeReplacement() {
    return incomeReplacement;
  }

  public void setIncomeReplacement(BigDecimal incomeReplacement) {
    this.incomeReplacement = incomeReplacement;
  }

  public LifeInsuranceNeedsBreakdown beneficiaryBequest(BigDecimal beneficiaryBequest) {
    this.beneficiaryBequest = beneficiaryBequest;
    return this;
  }

   /**
   * Insurance required to cover amount being bequested.
   * minimum: 0
   * @return beneficiaryBequest
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover amount being bequested.")
  public BigDecimal getBeneficiaryBequest() {
    return beneficiaryBequest;
  }

  public void setBeneficiaryBequest(BigDecimal beneficiaryBequest) {
    this.beneficiaryBequest = beneficiaryBequest;
  }

  public LifeInsuranceNeedsBreakdown endOfLife(BigDecimal endOfLife) {
    this.endOfLife = endOfLife;
    return this;
  }

   /**
   * Insurance required to cover end of life expenses.
   * minimum: 0
   * @return endOfLife
  **/
  @ApiModelProperty(required = true, value = "Insurance required to cover end of life expenses.")
  public BigDecimal getEndOfLife() {
    return endOfLife;
  }

  public void setEndOfLife(BigDecimal endOfLife) {
    this.endOfLife = endOfLife;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifeInsuranceNeedsBreakdown lifeInsuranceNeedsBreakdown = (LifeInsuranceNeedsBreakdown) o;
    return Objects.equals(this.mortgage, lifeInsuranceNeedsBreakdown.mortgage) &&
        Objects.equals(this.other, lifeInsuranceNeedsBreakdown.other) &&
        Objects.equals(this.education, lifeInsuranceNeedsBreakdown.education) &&
        Objects.equals(this.incomeReplacement, lifeInsuranceNeedsBreakdown.incomeReplacement) &&
        Objects.equals(this.beneficiaryBequest, lifeInsuranceNeedsBreakdown.beneficiaryBequest) &&
        Objects.equals(this.endOfLife, lifeInsuranceNeedsBreakdown.endOfLife);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mortgage, other, education, incomeReplacement, beneficiaryBequest, endOfLife);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifeInsuranceNeedsBreakdown {\n");
    
    sb.append("    mortgage: ").append(toIndentedString(mortgage)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    incomeReplacement: ").append(toIndentedString(incomeReplacement)).append("\n");
    sb.append("    beneficiaryBequest: ").append(toIndentedString(beneficiaryBequest)).append("\n");
    sb.append("    endOfLife: ").append(toIndentedString(endOfLife)).append("\n");
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

