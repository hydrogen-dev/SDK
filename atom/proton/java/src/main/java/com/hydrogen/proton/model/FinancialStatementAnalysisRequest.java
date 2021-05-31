/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
 * FinancialStatementAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class FinancialStatementAnalysisRequest {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("show_history")
  private Boolean showHistory = false;

  /**
   * Gets or Sets accountingMethod
   */
  @JsonAdapter(AccountingMethodEnum.Adapter.class)
  public enum AccountingMethodEnum {
    ACCRUAL("accrual"),
    
    CASH("cash");

    private String value;

    AccountingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountingMethodEnum fromValue(String text) {
      for (AccountingMethodEnum b : AccountingMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountingMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accounting_method")
  private AccountingMethodEnum accountingMethod = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  /**
   * Gets or Sets historyFrequencyInterval
   */
  @JsonAdapter(HistoryFrequencyIntervalEnum.Adapter.class)
  public enum HistoryFrequencyIntervalEnum {
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    QUARTER("quarter"),
    
    YEAR("year");

    private String value;

    HistoryFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HistoryFrequencyIntervalEnum fromValue(String text) {
      for (HistoryFrequencyIntervalEnum b : HistoryFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HistoryFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HistoryFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HistoryFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HistoryFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("history_frequency_interval")
  private HistoryFrequencyIntervalEnum historyFrequencyInterval = HistoryFrequencyIntervalEnum.MONTH;

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

  @SerializedName("period_quarter")
  private Integer periodQuarter = null;

  /**
   * Gets or Sets statementType
   */
  @JsonAdapter(StatementTypeEnum.Adapter.class)
  public enum StatementTypeEnum {
    INCOME_STATEMENT("income_statement"),
    
    BALANCE_SHEET("balance_sheet"),
    
    ALL("all");

    private String value;

    StatementTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatementTypeEnum fromValue(String text) {
      for (StatementTypeEnum b : StatementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("statement_type")
  private StatementTypeEnum statementType = StatementTypeEnum.ALL;

  @SerializedName("period_month")
  private Integer periodMonth = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("period_year")
  private Integer periodYear = null;

  /**
   * Gets or Sets periodLength
   */
  @JsonAdapter(PeriodLengthEnum.Adapter.class)
  public enum PeriodLengthEnum {
    ANNUAL("annual"),
    
    QUARTERLY("quarterly"),
    
    MONTHLY("monthly"),
    
    YTD("ytd"),
    
    QTD("qtd"),
    
    MTD("mtd");

    private String value;

    PeriodLengthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodLengthEnum fromValue(String text) {
      for (PeriodLengthEnum b : PeriodLengthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodLengthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodLengthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodLengthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodLengthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period_length")
  private PeriodLengthEnum periodLength = PeriodLengthEnum.QUARTERLY;

  /**
   * Gets or Sets statNames
   */
  @JsonAdapter(StatNamesEnum.Adapter.class)
  public enum StatNamesEnum {
    CASH("cash"),
    
    ACCOUNTS_RECEIVABLE("accounts_receivable"),
    
    TOTAL_ASSETS("total_assets"),
    
    ACCOUNTS_PAYABLE("accounts_payable"),
    
    TOTAL_LIABILITIES("total_liabilities"),
    
    TOTAL_EQUITY("total_equity"),
    
    TOTAL_REVENUE("total_revenue"),
    
    COGS("cogs"),
    
    TOTAL_EXPENSES("total_expenses"),
    
    OPERATING_INCOME("operating_income"),
    
    GROSS_PROFIT("gross_profit"),
    
    NET_INCOME("net_income"),
    
    EBITDA("ebitda");

    private String value;

    StatNamesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatNamesEnum fromValue(String text) {
      for (StatNamesEnum b : StatNamesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatNamesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatNamesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatNamesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatNamesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stat_names")
  private List<StatNamesEnum> statNames = null;

  /**
   * Gets or Sets periodType
   */
  @JsonAdapter(PeriodTypeEnum.Adapter.class)
  public enum PeriodTypeEnum {
    CALENDAR("calendar"),
    
    FISCAL("fiscal");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodTypeEnum fromValue(String text) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period_type")
  private PeriodTypeEnum periodType = null;

  public FinancialStatementAnalysisRequest currencyCode(String currencyCode) {
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

  public FinancialStatementAnalysisRequest clientId(UUID clientId) {
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

  public FinancialStatementAnalysisRequest showHistory(Boolean showHistory) {
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

  public FinancialStatementAnalysisRequest accountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
    return this;
  }

   /**
   * Get accountingMethod
   * @return accountingMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public AccountingMethodEnum getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
  }

  public FinancialStatementAnalysisRequest endDate(LocalDate endDate) {
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

  public FinancialStatementAnalysisRequest historyFrequencyInterval(HistoryFrequencyIntervalEnum historyFrequencyInterval) {
    this.historyFrequencyInterval = historyFrequencyInterval;
    return this;
  }

   /**
   * Get historyFrequencyInterval
   * @return historyFrequencyInterval
  **/
  @ApiModelProperty(value = "")
  public HistoryFrequencyIntervalEnum getHistoryFrequencyInterval() {
    return historyFrequencyInterval;
  }

  public void setHistoryFrequencyInterval(HistoryFrequencyIntervalEnum historyFrequencyInterval) {
    this.historyFrequencyInterval = historyFrequencyInterval;
  }

  public FinancialStatementAnalysisRequest currencyConversion(String currencyConversion) {
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

  public FinancialStatementAnalysisRequest periodQuarter(Integer periodQuarter) {
    this.periodQuarter = periodQuarter;
    return this;
  }

   /**
   * Get periodQuarter
   * minimum: 1
   * maximum: 4
   * @return periodQuarter
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodQuarter() {
    return periodQuarter;
  }

  public void setPeriodQuarter(Integer periodQuarter) {
    this.periodQuarter = periodQuarter;
  }

  public FinancialStatementAnalysisRequest statementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   * Get statementType
   * @return statementType
  **/
  @ApiModelProperty(value = "")
  public StatementTypeEnum getStatementType() {
    return statementType;
  }

  public void setStatementType(StatementTypeEnum statementType) {
    this.statementType = statementType;
  }

  public FinancialStatementAnalysisRequest periodMonth(Integer periodMonth) {
    this.periodMonth = periodMonth;
    return this;
  }

   /**
   * Get periodMonth
   * minimum: 1
   * maximum: 12
   * @return periodMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodMonth() {
    return periodMonth;
  }

  public void setPeriodMonth(Integer periodMonth) {
    this.periodMonth = periodMonth;
  }

  public FinancialStatementAnalysisRequest startDate(LocalDate startDate) {
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

  public FinancialStatementAnalysisRequest businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @ApiModelProperty(value = "")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public FinancialStatementAnalysisRequest periodYear(Integer periodYear) {
    this.periodYear = periodYear;
    return this;
  }

   /**
   * Get periodYear
   * @return periodYear
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodYear() {
    return periodYear;
  }

  public void setPeriodYear(Integer periodYear) {
    this.periodYear = periodYear;
  }

  public FinancialStatementAnalysisRequest periodLength(PeriodLengthEnum periodLength) {
    this.periodLength = periodLength;
    return this;
  }

   /**
   * Get periodLength
   * @return periodLength
  **/
  @ApiModelProperty(value = "")
  public PeriodLengthEnum getPeriodLength() {
    return periodLength;
  }

  public void setPeriodLength(PeriodLengthEnum periodLength) {
    this.periodLength = periodLength;
  }

  public FinancialStatementAnalysisRequest statNames(List<StatNamesEnum> statNames) {
    this.statNames = statNames;
    return this;
  }

  public FinancialStatementAnalysisRequest addStatNamesItem(StatNamesEnum statNamesItem) {
    if (this.statNames == null) {
      this.statNames = new ArrayList<StatNamesEnum>();
    }
    this.statNames.add(statNamesItem);
    return this;
  }

   /**
   * Get statNames
   * @return statNames
  **/
  @ApiModelProperty(value = "")
  public List<StatNamesEnum> getStatNames() {
    return statNames;
  }

  public void setStatNames(List<StatNamesEnum> statNames) {
    this.statNames = statNames;
  }

  public FinancialStatementAnalysisRequest periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
    return this;
  }

   /**
   * Get periodType
   * @return periodType
  **/
  @ApiModelProperty(value = "")
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialStatementAnalysisRequest financialStatementAnalysisRequest = (FinancialStatementAnalysisRequest) o;
    return Objects.equals(this.currencyCode, financialStatementAnalysisRequest.currencyCode) &&
        Objects.equals(this.clientId, financialStatementAnalysisRequest.clientId) &&
        Objects.equals(this.showHistory, financialStatementAnalysisRequest.showHistory) &&
        Objects.equals(this.accountingMethod, financialStatementAnalysisRequest.accountingMethod) &&
        Objects.equals(this.endDate, financialStatementAnalysisRequest.endDate) &&
        Objects.equals(this.historyFrequencyInterval, financialStatementAnalysisRequest.historyFrequencyInterval) &&
        Objects.equals(this.currencyConversion, financialStatementAnalysisRequest.currencyConversion) &&
        Objects.equals(this.periodQuarter, financialStatementAnalysisRequest.periodQuarter) &&
        Objects.equals(this.statementType, financialStatementAnalysisRequest.statementType) &&
        Objects.equals(this.periodMonth, financialStatementAnalysisRequest.periodMonth) &&
        Objects.equals(this.startDate, financialStatementAnalysisRequest.startDate) &&
        Objects.equals(this.businessId, financialStatementAnalysisRequest.businessId) &&
        Objects.equals(this.periodYear, financialStatementAnalysisRequest.periodYear) &&
        Objects.equals(this.periodLength, financialStatementAnalysisRequest.periodLength) &&
        Objects.equals(this.statNames, financialStatementAnalysisRequest.statNames) &&
        Objects.equals(this.periodType, financialStatementAnalysisRequest.periodType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, clientId, showHistory, accountingMethod, endDate, historyFrequencyInterval, currencyConversion, periodQuarter, statementType, periodMonth, startDate, businessId, periodYear, periodLength, statNames, periodType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialStatementAnalysisRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    showHistory: ").append(toIndentedString(showHistory)).append("\n");
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    historyFrequencyInterval: ").append(toIndentedString(historyFrequencyInterval)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    periodQuarter: ").append(toIndentedString(periodQuarter)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    periodMonth: ").append(toIndentedString(periodMonth)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    periodYear: ").append(toIndentedString(periodYear)).append("\n");
    sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
    sb.append("    statNames: ").append(toIndentedString(statNames)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
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

