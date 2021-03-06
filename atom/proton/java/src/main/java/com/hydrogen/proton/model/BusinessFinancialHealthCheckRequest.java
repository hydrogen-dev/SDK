/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.8.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.UUID;

/**
 * BusinessFinancialHealthCheckRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class BusinessFinancialHealthCheckRequest {
  @SerializedName("period_month")
  private Integer periodMonth = null;

  @SerializedName("period_quarter")
  private Integer periodQuarter = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("total_liabilities")
  private Float totalLiabilities = null;

  @SerializedName("total_revenue")
  private Float totalRevenue = null;

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

  @SerializedName("ratio_targets")
  private RatioTargets1 ratioTargets = null;

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

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

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

  @SerializedName("period_year")
  private Integer periodYear = null;

  @SerializedName("total_assets")
  private Float totalAssets = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("net_income")
  private Float netIncome = null;

  @SerializedName("total_equity")
  private Float totalEquity = null;

  public BusinessFinancialHealthCheckRequest periodMonth(Integer periodMonth) {
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

  public BusinessFinancialHealthCheckRequest periodQuarter(Integer periodQuarter) {
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

  public BusinessFinancialHealthCheckRequest clientId(UUID clientId) {
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

  public BusinessFinancialHealthCheckRequest totalLiabilities(Float totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Get totalLiabilities
   * minimum: 0
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "")
  public Float getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(Float totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public BusinessFinancialHealthCheckRequest totalRevenue(Float totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Get totalRevenue
   * minimum: 0
   * @return totalRevenue
  **/
  @ApiModelProperty(value = "")
  public Float getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Float totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public BusinessFinancialHealthCheckRequest accountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
    return this;
  }

   /**
   * Get accountingMethod
   * @return accountingMethod
  **/
  @ApiModelProperty(value = "")
  public AccountingMethodEnum getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(AccountingMethodEnum accountingMethod) {
    this.accountingMethod = accountingMethod;
  }

  public BusinessFinancialHealthCheckRequest ratioTargets(RatioTargets1 ratioTargets) {
    this.ratioTargets = ratioTargets;
    return this;
  }

   /**
   * Get ratioTargets
   * @return ratioTargets
  **/
  @ApiModelProperty(value = "")
  public RatioTargets1 getRatioTargets() {
    return ratioTargets;
  }

  public void setRatioTargets(RatioTargets1 ratioTargets) {
    this.ratioTargets = ratioTargets;
  }

  public BusinessFinancialHealthCheckRequest periodLength(PeriodLengthEnum periodLength) {
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

  public BusinessFinancialHealthCheckRequest currencyConversion(String currencyConversion) {
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

  public BusinessFinancialHealthCheckRequest periodType(PeriodTypeEnum periodType) {
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

  public BusinessFinancialHealthCheckRequest periodYear(Integer periodYear) {
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

  public BusinessFinancialHealthCheckRequest totalAssets(Float totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * minimum: 0
   * @return totalAssets
  **/
  @ApiModelProperty(value = "")
  public Float getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(Float totalAssets) {
    this.totalAssets = totalAssets;
  }

  public BusinessFinancialHealthCheckRequest currencyCode(String currencyCode) {
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

  public BusinessFinancialHealthCheckRequest netIncome(Float netIncome) {
    this.netIncome = netIncome;
    return this;
  }

   /**
   * Get netIncome
   * @return netIncome
  **/
  @ApiModelProperty(value = "")
  public Float getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(Float netIncome) {
    this.netIncome = netIncome;
  }

  public BusinessFinancialHealthCheckRequest totalEquity(Float totalEquity) {
    this.totalEquity = totalEquity;
    return this;
  }

   /**
   * Get totalEquity
   * minimum: 0
   * @return totalEquity
  **/
  @ApiModelProperty(value = "")
  public Float getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(Float totalEquity) {
    this.totalEquity = totalEquity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessFinancialHealthCheckRequest businessFinancialHealthCheckRequest = (BusinessFinancialHealthCheckRequest) o;
    return Objects.equals(this.periodMonth, businessFinancialHealthCheckRequest.periodMonth) &&
        Objects.equals(this.periodQuarter, businessFinancialHealthCheckRequest.periodQuarter) &&
        Objects.equals(this.clientId, businessFinancialHealthCheckRequest.clientId) &&
        Objects.equals(this.totalLiabilities, businessFinancialHealthCheckRequest.totalLiabilities) &&
        Objects.equals(this.totalRevenue, businessFinancialHealthCheckRequest.totalRevenue) &&
        Objects.equals(this.accountingMethod, businessFinancialHealthCheckRequest.accountingMethod) &&
        Objects.equals(this.ratioTargets, businessFinancialHealthCheckRequest.ratioTargets) &&
        Objects.equals(this.periodLength, businessFinancialHealthCheckRequest.periodLength) &&
        Objects.equals(this.currencyConversion, businessFinancialHealthCheckRequest.currencyConversion) &&
        Objects.equals(this.periodType, businessFinancialHealthCheckRequest.periodType) &&
        Objects.equals(this.periodYear, businessFinancialHealthCheckRequest.periodYear) &&
        Objects.equals(this.totalAssets, businessFinancialHealthCheckRequest.totalAssets) &&
        Objects.equals(this.currencyCode, businessFinancialHealthCheckRequest.currencyCode) &&
        Objects.equals(this.netIncome, businessFinancialHealthCheckRequest.netIncome) &&
        Objects.equals(this.totalEquity, businessFinancialHealthCheckRequest.totalEquity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodMonth, periodQuarter, clientId, totalLiabilities, totalRevenue, accountingMethod, ratioTargets, periodLength, currencyConversion, periodType, periodYear, totalAssets, currencyCode, netIncome, totalEquity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessFinancialHealthCheckRequest {\n");
    
    sb.append("    periodMonth: ").append(toIndentedString(periodMonth)).append("\n");
    sb.append("    periodQuarter: ").append(toIndentedString(periodQuarter)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    ratioTargets: ").append(toIndentedString(ratioTargets)).append("\n");
    sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodYear: ").append(toIndentedString(periodYear)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    totalEquity: ").append(toIndentedString(totalEquity)).append("\n");
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

