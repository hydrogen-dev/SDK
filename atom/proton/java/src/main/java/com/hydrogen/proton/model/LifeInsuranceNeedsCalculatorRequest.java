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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * LifeInsuranceNeedsCalculatorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class LifeInsuranceNeedsCalculatorRequest {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("beneficiary_bequest_config")
  private List<BeneficiaryBequestConfig> beneficiaryBequestConfig = null;

  @SerializedName("education_inflation_rate")
  private Float educationInflationRate = 0.0f;

  @SerializedName("margin_of_error")
  private Float marginOfError = 0.0f;

  @SerializedName("liquid_assets")
  private BigDecimal liquidAssets = null;

  @SerializedName("tax_rate")
  private Float taxRate = 0.0f;

  @SerializedName("other_debt")
  private BigDecimal otherDebt = null;

  @SerializedName("end_of_life_expenses")
  private BigDecimal endOfLifeExpenses = null;

  @SerializedName("existing_life_insurance")
  private BigDecimal existingLifeInsurance = null;

  @SerializedName("income_config")
  private List<IncomeConfig> incomeConfig = null;

  @SerializedName("mortgage_balance")
  private BigDecimal mortgageBalance = null;

  @SerializedName("benefit_amount_rounding")
  private Integer benefitAmountRounding = 0;

  @SerializedName("interest_rate")
  private Float interestRate = null;

  @SerializedName("children_education_config")
  private List<ChildrenEducationConfig> childrenEducationConfig = null;

  @SerializedName("general_inflation_rate")
  private Float generalInflationRate = 0.0f;

  public LifeInsuranceNeedsCalculatorRequest clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public LifeInsuranceNeedsCalculatorRequest beneficiaryBequestConfig(List<BeneficiaryBequestConfig> beneficiaryBequestConfig) {
    this.beneficiaryBequestConfig = beneficiaryBequestConfig;
    return this;
  }

  public LifeInsuranceNeedsCalculatorRequest addBeneficiaryBequestConfigItem(BeneficiaryBequestConfig beneficiaryBequestConfigItem) {
    if (this.beneficiaryBequestConfig == null) {
      this.beneficiaryBequestConfig = new ArrayList<BeneficiaryBequestConfig>();
    }
    this.beneficiaryBequestConfig.add(beneficiaryBequestConfigItem);
    return this;
  }

   /**
   * Get beneficiaryBequestConfig
   * @return beneficiaryBequestConfig
  **/
  @ApiModelProperty(value = "")
  public List<BeneficiaryBequestConfig> getBeneficiaryBequestConfig() {
    return beneficiaryBequestConfig;
  }

  public void setBeneficiaryBequestConfig(List<BeneficiaryBequestConfig> beneficiaryBequestConfig) {
    this.beneficiaryBequestConfig = beneficiaryBequestConfig;
  }

  public LifeInsuranceNeedsCalculatorRequest educationInflationRate(Float educationInflationRate) {
    this.educationInflationRate = educationInflationRate;
    return this;
  }

   /**
   * Get educationInflationRate
   * minimum: -1
   * @return educationInflationRate
  **/
  @ApiModelProperty(value = "")
  public Float getEducationInflationRate() {
    return educationInflationRate;
  }

  public void setEducationInflationRate(Float educationInflationRate) {
    this.educationInflationRate = educationInflationRate;
  }

  public LifeInsuranceNeedsCalculatorRequest marginOfError(Float marginOfError) {
    this.marginOfError = marginOfError;
    return this;
  }

   /**
   * Get marginOfError
   * minimum: 0
   * @return marginOfError
  **/
  @ApiModelProperty(value = "")
  public Float getMarginOfError() {
    return marginOfError;
  }

  public void setMarginOfError(Float marginOfError) {
    this.marginOfError = marginOfError;
  }

  public LifeInsuranceNeedsCalculatorRequest liquidAssets(BigDecimal liquidAssets) {
    this.liquidAssets = liquidAssets;
    return this;
  }

   /**
   * Get liquidAssets
   * minimum: 0
   * @return liquidAssets
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLiquidAssets() {
    return liquidAssets;
  }

  public void setLiquidAssets(BigDecimal liquidAssets) {
    this.liquidAssets = liquidAssets;
  }

  public LifeInsuranceNeedsCalculatorRequest taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * minimum: 0
   * maximum: 1
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public LifeInsuranceNeedsCalculatorRequest otherDebt(BigDecimal otherDebt) {
    this.otherDebt = otherDebt;
    return this;
  }

   /**
   * Get otherDebt
   * minimum: 0
   * @return otherDebt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOtherDebt() {
    return otherDebt;
  }

  public void setOtherDebt(BigDecimal otherDebt) {
    this.otherDebt = otherDebt;
  }

  public LifeInsuranceNeedsCalculatorRequest endOfLifeExpenses(BigDecimal endOfLifeExpenses) {
    this.endOfLifeExpenses = endOfLifeExpenses;
    return this;
  }

   /**
   * Get endOfLifeExpenses
   * minimum: 0
   * @return endOfLifeExpenses
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEndOfLifeExpenses() {
    return endOfLifeExpenses;
  }

  public void setEndOfLifeExpenses(BigDecimal endOfLifeExpenses) {
    this.endOfLifeExpenses = endOfLifeExpenses;
  }

  public LifeInsuranceNeedsCalculatorRequest existingLifeInsurance(BigDecimal existingLifeInsurance) {
    this.existingLifeInsurance = existingLifeInsurance;
    return this;
  }

   /**
   * Get existingLifeInsurance
   * minimum: 0
   * @return existingLifeInsurance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExistingLifeInsurance() {
    return existingLifeInsurance;
  }

  public void setExistingLifeInsurance(BigDecimal existingLifeInsurance) {
    this.existingLifeInsurance = existingLifeInsurance;
  }

  public LifeInsuranceNeedsCalculatorRequest incomeConfig(List<IncomeConfig> incomeConfig) {
    this.incomeConfig = incomeConfig;
    return this;
  }

  public LifeInsuranceNeedsCalculatorRequest addIncomeConfigItem(IncomeConfig incomeConfigItem) {
    if (this.incomeConfig == null) {
      this.incomeConfig = new ArrayList<IncomeConfig>();
    }
    this.incomeConfig.add(incomeConfigItem);
    return this;
  }

   /**
   * Get incomeConfig
   * @return incomeConfig
  **/
  @ApiModelProperty(value = "")
  public List<IncomeConfig> getIncomeConfig() {
    return incomeConfig;
  }

  public void setIncomeConfig(List<IncomeConfig> incomeConfig) {
    this.incomeConfig = incomeConfig;
  }

  public LifeInsuranceNeedsCalculatorRequest mortgageBalance(BigDecimal mortgageBalance) {
    this.mortgageBalance = mortgageBalance;
    return this;
  }

   /**
   * Get mortgageBalance
   * minimum: 0
   * @return mortgageBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMortgageBalance() {
    return mortgageBalance;
  }

  public void setMortgageBalance(BigDecimal mortgageBalance) {
    this.mortgageBalance = mortgageBalance;
  }

  public LifeInsuranceNeedsCalculatorRequest benefitAmountRounding(Integer benefitAmountRounding) {
    this.benefitAmountRounding = benefitAmountRounding;
    return this;
  }

   /**
   * Get benefitAmountRounding
   * minimum: 0
   * maximum: 12
   * @return benefitAmountRounding
  **/
  @ApiModelProperty(value = "")
  public Integer getBenefitAmountRounding() {
    return benefitAmountRounding;
  }

  public void setBenefitAmountRounding(Integer benefitAmountRounding) {
    this.benefitAmountRounding = benefitAmountRounding;
  }

  public LifeInsuranceNeedsCalculatorRequest interestRate(Float interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * minimum: -1
   * @return interestRate
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Float interestRate) {
    this.interestRate = interestRate;
  }

  public LifeInsuranceNeedsCalculatorRequest childrenEducationConfig(List<ChildrenEducationConfig> childrenEducationConfig) {
    this.childrenEducationConfig = childrenEducationConfig;
    return this;
  }

  public LifeInsuranceNeedsCalculatorRequest addChildrenEducationConfigItem(ChildrenEducationConfig childrenEducationConfigItem) {
    if (this.childrenEducationConfig == null) {
      this.childrenEducationConfig = new ArrayList<ChildrenEducationConfig>();
    }
    this.childrenEducationConfig.add(childrenEducationConfigItem);
    return this;
  }

   /**
   * Get childrenEducationConfig
   * @return childrenEducationConfig
  **/
  @ApiModelProperty(value = "")
  public List<ChildrenEducationConfig> getChildrenEducationConfig() {
    return childrenEducationConfig;
  }

  public void setChildrenEducationConfig(List<ChildrenEducationConfig> childrenEducationConfig) {
    this.childrenEducationConfig = childrenEducationConfig;
  }

  public LifeInsuranceNeedsCalculatorRequest generalInflationRate(Float generalInflationRate) {
    this.generalInflationRate = generalInflationRate;
    return this;
  }

   /**
   * Get generalInflationRate
   * minimum: -1
   * @return generalInflationRate
  **/
  @ApiModelProperty(value = "")
  public Float getGeneralInflationRate() {
    return generalInflationRate;
  }

  public void setGeneralInflationRate(Float generalInflationRate) {
    this.generalInflationRate = generalInflationRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest = (LifeInsuranceNeedsCalculatorRequest) o;
    return Objects.equals(this.clientId, lifeInsuranceNeedsCalculatorRequest.clientId) &&
        Objects.equals(this.beneficiaryBequestConfig, lifeInsuranceNeedsCalculatorRequest.beneficiaryBequestConfig) &&
        Objects.equals(this.educationInflationRate, lifeInsuranceNeedsCalculatorRequest.educationInflationRate) &&
        Objects.equals(this.marginOfError, lifeInsuranceNeedsCalculatorRequest.marginOfError) &&
        Objects.equals(this.liquidAssets, lifeInsuranceNeedsCalculatorRequest.liquidAssets) &&
        Objects.equals(this.taxRate, lifeInsuranceNeedsCalculatorRequest.taxRate) &&
        Objects.equals(this.otherDebt, lifeInsuranceNeedsCalculatorRequest.otherDebt) &&
        Objects.equals(this.endOfLifeExpenses, lifeInsuranceNeedsCalculatorRequest.endOfLifeExpenses) &&
        Objects.equals(this.existingLifeInsurance, lifeInsuranceNeedsCalculatorRequest.existingLifeInsurance) &&
        Objects.equals(this.incomeConfig, lifeInsuranceNeedsCalculatorRequest.incomeConfig) &&
        Objects.equals(this.mortgageBalance, lifeInsuranceNeedsCalculatorRequest.mortgageBalance) &&
        Objects.equals(this.benefitAmountRounding, lifeInsuranceNeedsCalculatorRequest.benefitAmountRounding) &&
        Objects.equals(this.interestRate, lifeInsuranceNeedsCalculatorRequest.interestRate) &&
        Objects.equals(this.childrenEducationConfig, lifeInsuranceNeedsCalculatorRequest.childrenEducationConfig) &&
        Objects.equals(this.generalInflationRate, lifeInsuranceNeedsCalculatorRequest.generalInflationRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, beneficiaryBequestConfig, educationInflationRate, marginOfError, liquidAssets, taxRate, otherDebt, endOfLifeExpenses, existingLifeInsurance, incomeConfig, mortgageBalance, benefitAmountRounding, interestRate, childrenEducationConfig, generalInflationRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifeInsuranceNeedsCalculatorRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    beneficiaryBequestConfig: ").append(toIndentedString(beneficiaryBequestConfig)).append("\n");
    sb.append("    educationInflationRate: ").append(toIndentedString(educationInflationRate)).append("\n");
    sb.append("    marginOfError: ").append(toIndentedString(marginOfError)).append("\n");
    sb.append("    liquidAssets: ").append(toIndentedString(liquidAssets)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    otherDebt: ").append(toIndentedString(otherDebt)).append("\n");
    sb.append("    endOfLifeExpenses: ").append(toIndentedString(endOfLifeExpenses)).append("\n");
    sb.append("    existingLifeInsurance: ").append(toIndentedString(existingLifeInsurance)).append("\n");
    sb.append("    incomeConfig: ").append(toIndentedString(incomeConfig)).append("\n");
    sb.append("    mortgageBalance: ").append(toIndentedString(mortgageBalance)).append("\n");
    sb.append("    benefitAmountRounding: ").append(toIndentedString(benefitAmountRounding)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    childrenEducationConfig: ").append(toIndentedString(childrenEducationConfig)).append("\n");
    sb.append("    generalInflationRate: ").append(toIndentedString(generalInflationRate)).append("\n");
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

