/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
 * The array of token restrictions applied on this token.
 */
@ApiModel(description = "The array of token restrictions applied on this token.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-03T13:24:11.956-04:00")
public class TokenRestrictionsPayload {
  @SerializedName("min_age")
  private BigDecimal minAge = null;

  @SerializedName("max_age")
  private BigDecimal maxAge = null;

  @SerializedName("min_annual_income")
  private BigDecimal minAnnualIncome = null;

  @SerializedName("max_annual_income")
  private BigDecimal maxAnnualIncome = null;

  @SerializedName("min_household_income")
  private BigDecimal minHouseholdIncome = null;

  @SerializedName("max_household_income")
  private BigDecimal maxHouseholdIncome = null;

  @SerializedName("min_net_worth")
  private BigDecimal minNetWorth = null;

  @SerializedName("max_net_worth")
  private BigDecimal maxNetWorth = null;

  @SerializedName("min_credit_score")
  private BigDecimal minCreditScore = null;

  @SerializedName("max_credit_score")
  private BigDecimal maxCreditScore = null;

  @SerializedName("accreditation_required")
  private Boolean accreditationRequired = null;

  @SerializedName("kyc_required")
  private Boolean kycRequired = null;

  public TokenRestrictionsPayload minAge(BigDecimal minAge) {
    this.minAge = minAge;
    return this;
  }

   /**
   * Investors older than this age will be allowed to invest
   * @return minAge
  **/
  @ApiModelProperty(value = "Investors older than this age will be allowed to invest")
  public BigDecimal getMinAge() {
    return minAge;
  }

  public void setMinAge(BigDecimal minAge) {
    this.minAge = minAge;
  }

  public TokenRestrictionsPayload maxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Investors younger than this age will be allowed to invest
   * @return maxAge
  **/
  @ApiModelProperty(value = "Investors younger than this age will be allowed to invest")
  public BigDecimal getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
  }

  public TokenRestrictionsPayload minAnnualIncome(BigDecimal minAnnualIncome) {
    this.minAnnualIncome = minAnnualIncome;
    return this;
  }

   /**
   * Investors with an annual income higher than this number will be allowed to invest
   * @return minAnnualIncome
  **/
  @ApiModelProperty(value = "Investors with an annual income higher than this number will be allowed to invest")
  public BigDecimal getMinAnnualIncome() {
    return minAnnualIncome;
  }

  public void setMinAnnualIncome(BigDecimal minAnnualIncome) {
    this.minAnnualIncome = minAnnualIncome;
  }

  public TokenRestrictionsPayload maxAnnualIncome(BigDecimal maxAnnualIncome) {
    this.maxAnnualIncome = maxAnnualIncome;
    return this;
  }

   /**
   * Investors with an annual income lower than this number will be allowed to invest
   * @return maxAnnualIncome
  **/
  @ApiModelProperty(value = "Investors with an annual income lower than this number will be allowed to invest")
  public BigDecimal getMaxAnnualIncome() {
    return maxAnnualIncome;
  }

  public void setMaxAnnualIncome(BigDecimal maxAnnualIncome) {
    this.maxAnnualIncome = maxAnnualIncome;
  }

  public TokenRestrictionsPayload minHouseholdIncome(BigDecimal minHouseholdIncome) {
    this.minHouseholdIncome = minHouseholdIncome;
    return this;
  }

   /**
   * Investors with an household income higher than this number will be allowed to invest
   * @return minHouseholdIncome
  **/
  @ApiModelProperty(value = "Investors with an household income higher than this number will be allowed to invest")
  public BigDecimal getMinHouseholdIncome() {
    return minHouseholdIncome;
  }

  public void setMinHouseholdIncome(BigDecimal minHouseholdIncome) {
    this.minHouseholdIncome = minHouseholdIncome;
  }

  public TokenRestrictionsPayload maxHouseholdIncome(BigDecimal maxHouseholdIncome) {
    this.maxHouseholdIncome = maxHouseholdIncome;
    return this;
  }

   /**
   * Investors with an household income lower than this number will be allowed to invest
   * @return maxHouseholdIncome
  **/
  @ApiModelProperty(value = "Investors with an household income lower than this number will be allowed to invest")
  public BigDecimal getMaxHouseholdIncome() {
    return maxHouseholdIncome;
  }

  public void setMaxHouseholdIncome(BigDecimal maxHouseholdIncome) {
    this.maxHouseholdIncome = maxHouseholdIncome;
  }

  public TokenRestrictionsPayload minNetWorth(BigDecimal minNetWorth) {
    this.minNetWorth = minNetWorth;
    return this;
  }

   /**
   * Investors with a net worth higher than this number will be allowed to invest
   * @return minNetWorth
  **/
  @ApiModelProperty(value = "Investors with a net worth higher than this number will be allowed to invest")
  public BigDecimal getMinNetWorth() {
    return minNetWorth;
  }

  public void setMinNetWorth(BigDecimal minNetWorth) {
    this.minNetWorth = minNetWorth;
  }

  public TokenRestrictionsPayload maxNetWorth(BigDecimal maxNetWorth) {
    this.maxNetWorth = maxNetWorth;
    return this;
  }

   /**
   * Investors with a net worth lower than this number will be allowed to invest
   * @return maxNetWorth
  **/
  @ApiModelProperty(value = "Investors with a net worth lower than this number will be allowed to invest")
  public BigDecimal getMaxNetWorth() {
    return maxNetWorth;
  }

  public void setMaxNetWorth(BigDecimal maxNetWorth) {
    this.maxNetWorth = maxNetWorth;
  }

  public TokenRestrictionsPayload minCreditScore(BigDecimal minCreditScore) {
    this.minCreditScore = minCreditScore;
    return this;
  }

   /**
   * Investors with a credit score higher than this number will be allowed to invest
   * @return minCreditScore
  **/
  @ApiModelProperty(value = "Investors with a credit score higher than this number will be allowed to invest")
  public BigDecimal getMinCreditScore() {
    return minCreditScore;
  }

  public void setMinCreditScore(BigDecimal minCreditScore) {
    this.minCreditScore = minCreditScore;
  }

  public TokenRestrictionsPayload maxCreditScore(BigDecimal maxCreditScore) {
    this.maxCreditScore = maxCreditScore;
    return this;
  }

   /**
   * Investors with a credit score lower than this number will be allowed to invest
   * @return maxCreditScore
  **/
  @ApiModelProperty(value = "Investors with a credit score lower than this number will be allowed to invest")
  public BigDecimal getMaxCreditScore() {
    return maxCreditScore;
  }

  public void setMaxCreditScore(BigDecimal maxCreditScore) {
    this.maxCreditScore = maxCreditScore;
  }

  public TokenRestrictionsPayload accreditationRequired(Boolean accreditationRequired) {
    this.accreditationRequired = accreditationRequired;
    return this;
  }

   /**
   * Only accredited investors will be allowed to invest
   * @return accreditationRequired
  **/
  @ApiModelProperty(value = "Only accredited investors will be allowed to invest")
  public Boolean isAccreditationRequired() {
    return accreditationRequired;
  }

  public void setAccreditationRequired(Boolean accreditationRequired) {
    this.accreditationRequired = accreditationRequired;
  }

  public TokenRestrictionsPayload kycRequired(Boolean kycRequired) {
    this.kycRequired = kycRequired;
    return this;
  }

   /**
   * Investors who are verified by a Know-Your-Customer vendor will be allowed to invest
   * @return kycRequired
  **/
  @ApiModelProperty(value = "Investors who are verified by a Know-Your-Customer vendor will be allowed to invest")
  public Boolean isKycRequired() {
    return kycRequired;
  }

  public void setKycRequired(Boolean kycRequired) {
    this.kycRequired = kycRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRestrictionsPayload tokenRestrictionsPayload = (TokenRestrictionsPayload) o;
    return Objects.equals(this.minAge, tokenRestrictionsPayload.minAge) &&
        Objects.equals(this.maxAge, tokenRestrictionsPayload.maxAge) &&
        Objects.equals(this.minAnnualIncome, tokenRestrictionsPayload.minAnnualIncome) &&
        Objects.equals(this.maxAnnualIncome, tokenRestrictionsPayload.maxAnnualIncome) &&
        Objects.equals(this.minHouseholdIncome, tokenRestrictionsPayload.minHouseholdIncome) &&
        Objects.equals(this.maxHouseholdIncome, tokenRestrictionsPayload.maxHouseholdIncome) &&
        Objects.equals(this.minNetWorth, tokenRestrictionsPayload.minNetWorth) &&
        Objects.equals(this.maxNetWorth, tokenRestrictionsPayload.maxNetWorth) &&
        Objects.equals(this.minCreditScore, tokenRestrictionsPayload.minCreditScore) &&
        Objects.equals(this.maxCreditScore, tokenRestrictionsPayload.maxCreditScore) &&
        Objects.equals(this.accreditationRequired, tokenRestrictionsPayload.accreditationRequired) &&
        Objects.equals(this.kycRequired, tokenRestrictionsPayload.kycRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAge, maxAge, minAnnualIncome, maxAnnualIncome, minHouseholdIncome, maxHouseholdIncome, minNetWorth, maxNetWorth, minCreditScore, maxCreditScore, accreditationRequired, kycRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRestrictionsPayload {\n");
    
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    minAnnualIncome: ").append(toIndentedString(minAnnualIncome)).append("\n");
    sb.append("    maxAnnualIncome: ").append(toIndentedString(maxAnnualIncome)).append("\n");
    sb.append("    minHouseholdIncome: ").append(toIndentedString(minHouseholdIncome)).append("\n");
    sb.append("    maxHouseholdIncome: ").append(toIndentedString(maxHouseholdIncome)).append("\n");
    sb.append("    minNetWorth: ").append(toIndentedString(minNetWorth)).append("\n");
    sb.append("    maxNetWorth: ").append(toIndentedString(maxNetWorth)).append("\n");
    sb.append("    minCreditScore: ").append(toIndentedString(minCreditScore)).append("\n");
    sb.append("    maxCreditScore: ").append(toIndentedString(maxCreditScore)).append("\n");
    sb.append("    accreditationRequired: ").append(toIndentedString(accreditationRequired)).append("\n");
    sb.append("    kycRequired: ").append(toIndentedString(kycRequired)).append("\n");
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

