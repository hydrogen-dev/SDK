/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
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
import java.util.ArrayList;
import java.util.List;

/**
 * EmergencyFundCalculator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class EmergencyFundCalculator {
  @SerializedName("emergency_fund_duration")
  private Integer emergencyFundDuration = null;

  @SerializedName("housing_cost")
  private BigDecimal housingCost = null;

  @SerializedName("utility_payments")
  private BigDecimal utilityPayments = null;

  @SerializedName("telecom_payments")
  private BigDecimal telecomPayments = null;

  @SerializedName("insurance_payments")
  private BigDecimal insurancePayments = null;

  @SerializedName("debt_payments")
  private BigDecimal debtPayments = null;

  @SerializedName("transportation_costs")
  private BigDecimal transportationCosts = null;

  @SerializedName("food_costs")
  private BigDecimal foodCosts = null;

  @SerializedName("other_expenses")
  private Object otherExpenses = null;

  @SerializedName("current_emergency_fund_balance")
  private BigDecimal currentEmergencyFundBalance = null;

  @SerializedName("interest_rate")
  private BigDecimal interestRate = null;

  @SerializedName("savings_horizon")
  private List<Integer> savingsHorizon = null;

  /**
   * Frequency unit used for all time intervals
   */
  @JsonAdapter(FrequencyUnitEnum.Adapter.class)
  public enum FrequencyUnitEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week");

    private String value;

    FrequencyUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyUnitEnum fromValue(String text) {
      for (FrequencyUnitEnum b : FrequencyUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency_unit")
  private FrequencyUnitEnum frequencyUnit = FrequencyUnitEnum.MONTH;

  public EmergencyFundCalculator emergencyFundDuration(Integer emergencyFundDuration) {
    this.emergencyFundDuration = emergencyFundDuration;
    return this;
  }

   /**
   * Number of periods the fund will last
   * minimum: 1
   * @return emergencyFundDuration
  **/
  @ApiModelProperty(required = true, value = "Number of periods the fund will last")
  public Integer getEmergencyFundDuration() {
    return emergencyFundDuration;
  }

  public void setEmergencyFundDuration(Integer emergencyFundDuration) {
    this.emergencyFundDuration = emergencyFundDuration;
  }

  public EmergencyFundCalculator housingCost(BigDecimal housingCost) {
    this.housingCost = housingCost;
    return this;
  }

   /**
   * The user&#39;s housing costs, such as rent or mortgage payments
   * minimum: 0
   * @return housingCost
  **/
  @ApiModelProperty(value = "The user's housing costs, such as rent or mortgage payments")
  public BigDecimal getHousingCost() {
    return housingCost;
  }

  public void setHousingCost(BigDecimal housingCost) {
    this.housingCost = housingCost;
  }

  public EmergencyFundCalculator utilityPayments(BigDecimal utilityPayments) {
    this.utilityPayments = utilityPayments;
    return this;
  }

   /**
   * Utility payments such as electricity or water
   * minimum: 0
   * @return utilityPayments
  **/
  @ApiModelProperty(value = "Utility payments such as electricity or water")
  public BigDecimal getUtilityPayments() {
    return utilityPayments;
  }

  public void setUtilityPayments(BigDecimal utilityPayments) {
    this.utilityPayments = utilityPayments;
  }

  public EmergencyFundCalculator telecomPayments(BigDecimal telecomPayments) {
    this.telecomPayments = telecomPayments;
    return this;
  }

   /**
   * Telecom payments such as internet or cell phone payments
   * minimum: 0
   * @return telecomPayments
  **/
  @ApiModelProperty(value = "Telecom payments such as internet or cell phone payments")
  public BigDecimal getTelecomPayments() {
    return telecomPayments;
  }

  public void setTelecomPayments(BigDecimal telecomPayments) {
    this.telecomPayments = telecomPayments;
  }

  public EmergencyFundCalculator insurancePayments(BigDecimal insurancePayments) {
    this.insurancePayments = insurancePayments;
    return this;
  }

   /**
   * Insurance payments such as auto or home insurance
   * minimum: 0
   * @return insurancePayments
  **/
  @ApiModelProperty(value = "Insurance payments such as auto or home insurance")
  public BigDecimal getInsurancePayments() {
    return insurancePayments;
  }

  public void setInsurancePayments(BigDecimal insurancePayments) {
    this.insurancePayments = insurancePayments;
  }

  public EmergencyFundCalculator debtPayments(BigDecimal debtPayments) {
    this.debtPayments = debtPayments;
    return this;
  }

   /**
   * Debt payments such as credit cards or loans
   * minimum: 0
   * @return debtPayments
  **/
  @ApiModelProperty(value = "Debt payments such as credit cards or loans")
  public BigDecimal getDebtPayments() {
    return debtPayments;
  }

  public void setDebtPayments(BigDecimal debtPayments) {
    this.debtPayments = debtPayments;
  }

  public EmergencyFundCalculator transportationCosts(BigDecimal transportationCosts) {
    this.transportationCosts = transportationCosts;
    return this;
  }

   /**
   * Transportation costs such as gasoline or car payments
   * minimum: 0
   * @return transportationCosts
  **/
  @ApiModelProperty(value = "Transportation costs such as gasoline or car payments")
  public BigDecimal getTransportationCosts() {
    return transportationCosts;
  }

  public void setTransportationCosts(BigDecimal transportationCosts) {
    this.transportationCosts = transportationCosts;
  }

  public EmergencyFundCalculator foodCosts(BigDecimal foodCosts) {
    this.foodCosts = foodCosts;
    return this;
  }

   /**
   * Food costs such as groceries or restaurants
   * minimum: 0
   * @return foodCosts
  **/
  @ApiModelProperty(value = "Food costs such as groceries or restaurants")
  public BigDecimal getFoodCosts() {
    return foodCosts;
  }

  public void setFoodCosts(BigDecimal foodCosts) {
    this.foodCosts = foodCosts;
  }

  public EmergencyFundCalculator otherExpenses(Object otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

   /**
   * Other expenses to cover in the emergency fund
   * @return otherExpenses
  **/
  @ApiModelProperty(value = "Other expenses to cover in the emergency fund")
  public Object getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(Object otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public EmergencyFundCalculator currentEmergencyFundBalance(BigDecimal currentEmergencyFundBalance) {
    this.currentEmergencyFundBalance = currentEmergencyFundBalance;
    return this;
  }

   /**
   * The user&#39;s current emergency fund balance
   * minimum: 0
   * @return currentEmergencyFundBalance
  **/
  @ApiModelProperty(value = "The user's current emergency fund balance")
  public BigDecimal getCurrentEmergencyFundBalance() {
    return currentEmergencyFundBalance;
  }

  public void setCurrentEmergencyFundBalance(BigDecimal currentEmergencyFundBalance) {
    this.currentEmergencyFundBalance = currentEmergencyFundBalance;
  }

  public EmergencyFundCalculator interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Annualized interest rate earned on the current fund balance
   * minimum: 0
   * maximum: 0.1
   * @return interestRate
  **/
  @ApiModelProperty(value = "Annualized interest rate earned on the current fund balance")
  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public EmergencyFundCalculator savingsHorizon(List<Integer> savingsHorizon) {
    this.savingsHorizon = savingsHorizon;
    return this;
  }

  public EmergencyFundCalculator addSavingsHorizonItem(Integer savingsHorizonItem) {
    if (this.savingsHorizon == null) {
      this.savingsHorizon = new ArrayList<Integer>();
    }
    this.savingsHorizon.add(savingsHorizonItem);
    return this;
  }

   /**
   * Periods in the savings horizon to be used in the recommendation schedule
   * @return savingsHorizon
  **/
  @ApiModelProperty(value = "Periods in the savings horizon to be used in the recommendation schedule")
  public List<Integer> getSavingsHorizon() {
    return savingsHorizon;
  }

  public void setSavingsHorizon(List<Integer> savingsHorizon) {
    this.savingsHorizon = savingsHorizon;
  }

  public EmergencyFundCalculator frequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * Frequency unit used for all time intervals
   * @return frequencyUnit
  **/
  @ApiModelProperty(value = "Frequency unit used for all time intervals")
  public FrequencyUnitEnum getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyFundCalculator emergencyFundCalculator = (EmergencyFundCalculator) o;
    return Objects.equals(this.emergencyFundDuration, emergencyFundCalculator.emergencyFundDuration) &&
        Objects.equals(this.housingCost, emergencyFundCalculator.housingCost) &&
        Objects.equals(this.utilityPayments, emergencyFundCalculator.utilityPayments) &&
        Objects.equals(this.telecomPayments, emergencyFundCalculator.telecomPayments) &&
        Objects.equals(this.insurancePayments, emergencyFundCalculator.insurancePayments) &&
        Objects.equals(this.debtPayments, emergencyFundCalculator.debtPayments) &&
        Objects.equals(this.transportationCosts, emergencyFundCalculator.transportationCosts) &&
        Objects.equals(this.foodCosts, emergencyFundCalculator.foodCosts) &&
        Objects.equals(this.otherExpenses, emergencyFundCalculator.otherExpenses) &&
        Objects.equals(this.currentEmergencyFundBalance, emergencyFundCalculator.currentEmergencyFundBalance) &&
        Objects.equals(this.interestRate, emergencyFundCalculator.interestRate) &&
        Objects.equals(this.savingsHorizon, emergencyFundCalculator.savingsHorizon) &&
        Objects.equals(this.frequencyUnit, emergencyFundCalculator.frequencyUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emergencyFundDuration, housingCost, utilityPayments, telecomPayments, insurancePayments, debtPayments, transportationCosts, foodCosts, otherExpenses, currentEmergencyFundBalance, interestRate, savingsHorizon, frequencyUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyFundCalculator {\n");
    
    sb.append("    emergencyFundDuration: ").append(toIndentedString(emergencyFundDuration)).append("\n");
    sb.append("    housingCost: ").append(toIndentedString(housingCost)).append("\n");
    sb.append("    utilityPayments: ").append(toIndentedString(utilityPayments)).append("\n");
    sb.append("    telecomPayments: ").append(toIndentedString(telecomPayments)).append("\n");
    sb.append("    insurancePayments: ").append(toIndentedString(insurancePayments)).append("\n");
    sb.append("    debtPayments: ").append(toIndentedString(debtPayments)).append("\n");
    sb.append("    transportationCosts: ").append(toIndentedString(transportationCosts)).append("\n");
    sb.append("    foodCosts: ").append(toIndentedString(foodCosts)).append("\n");
    sb.append("    otherExpenses: ").append(toIndentedString(otherExpenses)).append("\n");
    sb.append("    currentEmergencyFundBalance: ").append(toIndentedString(currentEmergencyFundBalance)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    savingsHorizon: ").append(toIndentedString(savingsHorizon)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
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
