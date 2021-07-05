/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * BudgetDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class BudgetDetails {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("frequency")
  private Integer frequency = 1;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("total_value")
  private Float totalValue = null;

  @SerializedName("budget")
  private List<BudgetComponent> budget = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("aggregation_accounts")
  private List<BudgetAggregationAccount> aggregationAccounts = null;

  /**
   * Gets or Sets frequencyUnit
   */
  @JsonAdapter(FrequencyUnitEnum.Adapter.class)
  public enum FrequencyUnitEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    BI_WEEKLY("bi-weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    ANNUALLY("annually");

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
  private FrequencyUnitEnum frequencyUnit = null;

  public BudgetDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BudgetDetails clientId(UUID clientId) {
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

  public BudgetDetails frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * minimum: 1
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public BudgetDetails endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public BudgetDetails totalValue(Float totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * Get totalValue
   * minimum: 0
   * @return totalValue
  **/
  @ApiModelProperty(value = "")
  public Float getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Float totalValue) {
    this.totalValue = totalValue;
  }

  public BudgetDetails budget(List<BudgetComponent> budget) {
    this.budget = budget;
    return this;
  }

  public BudgetDetails addBudgetItem(BudgetComponent budgetItem) {
    if (this.budget == null) {
      this.budget = new ArrayList<BudgetComponent>();
    }
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @ApiModelProperty(value = "")
  public List<BudgetComponent> getBudget() {
    return budget;
  }

  public void setBudget(List<BudgetComponent> budget) {
    this.budget = budget;
  }

  public BudgetDetails accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public BudgetDetails startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public BudgetDetails aggregationAccounts(List<BudgetAggregationAccount> aggregationAccounts) {
    this.aggregationAccounts = aggregationAccounts;
    return this;
  }

  public BudgetDetails addAggregationAccountsItem(BudgetAggregationAccount aggregationAccountsItem) {
    if (this.aggregationAccounts == null) {
      this.aggregationAccounts = new ArrayList<BudgetAggregationAccount>();
    }
    this.aggregationAccounts.add(aggregationAccountsItem);
    return this;
  }

   /**
   * Get aggregationAccounts
   * @return aggregationAccounts
  **/
  @ApiModelProperty(value = "")
  public List<BudgetAggregationAccount> getAggregationAccounts() {
    return aggregationAccounts;
  }

  public void setAggregationAccounts(List<BudgetAggregationAccount> aggregationAccounts) {
    this.aggregationAccounts = aggregationAccounts;
  }

  public BudgetDetails frequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * Get frequencyUnit
   * @return frequencyUnit
  **/
  @ApiModelProperty(required = true, value = "")
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
    BudgetDetails budgetDetails = (BudgetDetails) o;
    return Objects.equals(this.currencyCode, budgetDetails.currencyCode) &&
        Objects.equals(this.clientId, budgetDetails.clientId) &&
        Objects.equals(this.frequency, budgetDetails.frequency) &&
        Objects.equals(this.endDate, budgetDetails.endDate) &&
        Objects.equals(this.totalValue, budgetDetails.totalValue) &&
        Objects.equals(this.budget, budgetDetails.budget) &&
        Objects.equals(this.accountId, budgetDetails.accountId) &&
        Objects.equals(this.startDate, budgetDetails.startDate) &&
        Objects.equals(this.aggregationAccounts, budgetDetails.aggregationAccounts) &&
        Objects.equals(this.frequencyUnit, budgetDetails.frequencyUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, clientId, frequency, endDate, totalValue, budget, accountId, startDate, aggregationAccounts, frequencyUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetDetails {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    aggregationAccounts: ").append(toIndentedString(aggregationAccounts)).append("\n");
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

