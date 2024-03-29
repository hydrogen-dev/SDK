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
 * CashFlowAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class CashFlowAnalysisRequest {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("show_history")
  private Boolean showHistory = false;

  @SerializedName("benchmark_start_date")
  private LocalDate benchmarkStartDate = null;

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    ALL("all"),
    
    EXTERNAL("external"),
    
    INTERNAL("internal");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = ScopeEnum.ALL;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  @SerializedName("benchmark_end_date")
  private LocalDate benchmarkEndDate = null;

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("transaction_status_scope")
  private List<String> transactionStatusScope = null;

  @SerializedName("show_income_details")
  private Boolean showIncomeDetails = false;

  @SerializedName("only_cleansed")
  private Boolean onlyCleansed = false;

  @SerializedName("household_id")
  private UUID householdId = null;

  @SerializedName("show_spending_details")
  private Boolean showSpendingDetails = false;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  public CashFlowAnalysisRequest currencyCode(String currencyCode) {
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

  public CashFlowAnalysisRequest clientId(UUID clientId) {
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

  public CashFlowAnalysisRequest showHistory(Boolean showHistory) {
    this.showHistory = showHistory;
    return this;
  }

   /**
   * Get showHistory
   * @return showHistory
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowHistory() {
    return showHistory;
  }

  public void setShowHistory(Boolean showHistory) {
    this.showHistory = showHistory;
  }

  public CashFlowAnalysisRequest benchmarkStartDate(LocalDate benchmarkStartDate) {
    this.benchmarkStartDate = benchmarkStartDate;
    return this;
  }

   /**
   * Get benchmarkStartDate
   * @return benchmarkStartDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getBenchmarkStartDate() {
    return benchmarkStartDate;
  }

  public void setBenchmarkStartDate(LocalDate benchmarkStartDate) {
    this.benchmarkStartDate = benchmarkStartDate;
  }

  public CashFlowAnalysisRequest scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public CashFlowAnalysisRequest endDate(LocalDate endDate) {
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

  public CashFlowAnalysisRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public CashFlowAnalysisRequest addAccountIdsItem(UUID accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<UUID>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
  }

  public CashFlowAnalysisRequest benchmarkEndDate(LocalDate benchmarkEndDate) {
    this.benchmarkEndDate = benchmarkEndDate;
    return this;
  }

   /**
   * Get benchmarkEndDate
   * @return benchmarkEndDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getBenchmarkEndDate() {
    return benchmarkEndDate;
  }

  public void setBenchmarkEndDate(LocalDate benchmarkEndDate) {
    this.benchmarkEndDate = benchmarkEndDate;
  }

  public CashFlowAnalysisRequest currencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public CashFlowAnalysisRequest startDate(LocalDate startDate) {
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

  public CashFlowAnalysisRequest transactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
    return this;
  }

  public CashFlowAnalysisRequest addTransactionStatusScopeItem(String transactionStatusScopeItem) {
    if (this.transactionStatusScope == null) {
      this.transactionStatusScope = new ArrayList<String>();
    }
    this.transactionStatusScope.add(transactionStatusScopeItem);
    return this;
  }

   /**
   * Get transactionStatusScope
   * @return transactionStatusScope
  **/
  @ApiModelProperty(value = "")
  public List<String> getTransactionStatusScope() {
    return transactionStatusScope;
  }

  public void setTransactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
  }

  public CashFlowAnalysisRequest showIncomeDetails(Boolean showIncomeDetails) {
    this.showIncomeDetails = showIncomeDetails;
    return this;
  }

   /**
   * Get showIncomeDetails
   * @return showIncomeDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowIncomeDetails() {
    return showIncomeDetails;
  }

  public void setShowIncomeDetails(Boolean showIncomeDetails) {
    this.showIncomeDetails = showIncomeDetails;
  }

  public CashFlowAnalysisRequest onlyCleansed(Boolean onlyCleansed) {
    this.onlyCleansed = onlyCleansed;
    return this;
  }

   /**
   * Get onlyCleansed
   * @return onlyCleansed
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnlyCleansed() {
    return onlyCleansed;
  }

  public void setOnlyCleansed(Boolean onlyCleansed) {
    this.onlyCleansed = onlyCleansed;
  }

  public CashFlowAnalysisRequest householdId(UUID householdId) {
    this.householdId = householdId;
    return this;
  }

   /**
   * Get householdId
   * @return householdId
  **/
  @ApiModelProperty(value = "")
  public UUID getHouseholdId() {
    return householdId;
  }

  public void setHouseholdId(UUID householdId) {
    this.householdId = householdId;
  }

  public CashFlowAnalysisRequest showSpendingDetails(Boolean showSpendingDetails) {
    this.showSpendingDetails = showSpendingDetails;
    return this;
  }

   /**
   * Get showSpendingDetails
   * @return showSpendingDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowSpendingDetails() {
    return showSpendingDetails;
  }

  public void setShowSpendingDetails(Boolean showSpendingDetails) {
    this.showSpendingDetails = showSpendingDetails;
  }

  public CashFlowAnalysisRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public CashFlowAnalysisRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
    if (this.aggregationAccountIds == null) {
      this.aggregationAccountIds = new ArrayList<UUID>();
    }
    this.aggregationAccountIds.add(aggregationAccountIdsItem);
    return this;
  }

   /**
   * Get aggregationAccountIds
   * @return aggregationAccountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAggregationAccountIds() {
    return aggregationAccountIds;
  }

  public void setAggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowAnalysisRequest cashFlowAnalysisRequest = (CashFlowAnalysisRequest) o;
    return Objects.equals(this.currencyCode, cashFlowAnalysisRequest.currencyCode) &&
        Objects.equals(this.clientId, cashFlowAnalysisRequest.clientId) &&
        Objects.equals(this.showHistory, cashFlowAnalysisRequest.showHistory) &&
        Objects.equals(this.benchmarkStartDate, cashFlowAnalysisRequest.benchmarkStartDate) &&
        Objects.equals(this.scope, cashFlowAnalysisRequest.scope) &&
        Objects.equals(this.endDate, cashFlowAnalysisRequest.endDate) &&
        Objects.equals(this.accountIds, cashFlowAnalysisRequest.accountIds) &&
        Objects.equals(this.benchmarkEndDate, cashFlowAnalysisRequest.benchmarkEndDate) &&
        Objects.equals(this.currencyConversion, cashFlowAnalysisRequest.currencyConversion) &&
        Objects.equals(this.startDate, cashFlowAnalysisRequest.startDate) &&
        Objects.equals(this.transactionStatusScope, cashFlowAnalysisRequest.transactionStatusScope) &&
        Objects.equals(this.showIncomeDetails, cashFlowAnalysisRequest.showIncomeDetails) &&
        Objects.equals(this.onlyCleansed, cashFlowAnalysisRequest.onlyCleansed) &&
        Objects.equals(this.householdId, cashFlowAnalysisRequest.householdId) &&
        Objects.equals(this.showSpendingDetails, cashFlowAnalysisRequest.showSpendingDetails) &&
        Objects.equals(this.aggregationAccountIds, cashFlowAnalysisRequest.aggregationAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, clientId, showHistory, benchmarkStartDate, scope, endDate, accountIds, benchmarkEndDate, currencyConversion, startDate, transactionStatusScope, showIncomeDetails, onlyCleansed, householdId, showSpendingDetails, aggregationAccountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowAnalysisRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    showHistory: ").append(toIndentedString(showHistory)).append("\n");
    sb.append("    benchmarkStartDate: ").append(toIndentedString(benchmarkStartDate)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    benchmarkEndDate: ").append(toIndentedString(benchmarkEndDate)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    transactionStatusScope: ").append(toIndentedString(transactionStatusScope)).append("\n");
    sb.append("    showIncomeDetails: ").append(toIndentedString(showIncomeDetails)).append("\n");
    sb.append("    onlyCleansed: ").append(toIndentedString(onlyCleansed)).append("\n");
    sb.append("    householdId: ").append(toIndentedString(householdId)).append("\n");
    sb.append("    showSpendingDetails: ").append(toIndentedString(showSpendingDetails)).append("\n");
    sb.append("    aggregationAccountIds: ").append(toIndentedString(aggregationAccountIds)).append("\n");
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

