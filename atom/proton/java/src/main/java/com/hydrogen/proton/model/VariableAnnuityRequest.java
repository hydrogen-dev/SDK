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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * VariableAnnuityRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class VariableAnnuityRequest {
  @SerializedName("p")
  private BigDecimal p = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("decumulation_horizon")
  private Integer decumulationHorizon = null;

  @SerializedName("accumulation_horizon")
  private Integer accumulationHorizon = null;

  @SerializedName("annuitization_rate")
  private Float annuitizationRate = 0.0f;

  @SerializedName("guaranteed_rate_benefit")
  private List<GuaranteedRateBenefit> guaranteedRateBenefit = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("portfolio_tickers")
  private List<String> portfolioTickers = null;

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("inflation_rate")
  private Float inflationRate = 0.0f;

  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("n")
  private Integer n = 1000;

  @SerializedName("guaranteed_accumulation_benefit")
  private Float guaranteedAccumulationBenefit = 0.0f;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("tax_rate")
  private Float taxRate = 0.0f;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("remove_outliers")
  private Boolean removeOutliers = false;

  @SerializedName("portfolio_weights")
  private List<Float> portfolioWeights = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  /**
   * Gets or Sets resultType
   */
  @JsonAdapter(ResultTypeEnum.Adapter.class)
  public enum ResultTypeEnum {
    MEAN("mean"),
    
    MEDIAN("median"),
    
    CUSTOM("custom");

    private String value;

    ResultTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultTypeEnum fromValue(String text) {
      for (ResultTypeEnum b : ResultTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("result_type")
  private ResultTypeEnum resultType = ResultTypeEnum.MEDIAN;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("trading_days_per_year")
  private Integer tradingDaysPerYear = 252;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  @SerializedName("initial_balance")
  private Float initialBalance = 0.0f;

  /**
   * Gets or Sets marketDataSource
   */
  @JsonAdapter(MarketDataSourceEnum.Adapter.class)
  public enum MarketDataSourceEnum {
    NUCLEUS("nucleus"),
    
    INTEGRATION("integration");

    private String value;

    MarketDataSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataSourceEnum fromValue(String text) {
      for (MarketDataSourceEnum b : MarketDataSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarketDataSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarketDataSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("market_data_source")
  private MarketDataSourceEnum marketDataSource = MarketDataSourceEnum.NUCLEUS;

  /**
   * Gets or Sets frequencyInterval
   */
  @JsonAdapter(FrequencyIntervalEnum.Adapter.class)
  public enum FrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    FrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyIntervalEnum fromValue(String text) {
      for (FrequencyIntervalEnum b : FrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency_interval")
  private FrequencyIntervalEnum frequencyInterval = FrequencyIntervalEnum.YEAR;

  @SerializedName("deposit_schedule")
  private AnnuityDepositSchedule depositSchedule = null;

  public VariableAnnuityRequest p(BigDecimal p) {
    this.p = p;
    return this;
  }

   /**
   * Get p
   * minimum: 0
   * maximum: 100
   * @return p
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getP() {
    return p;
  }

  public void setP(BigDecimal p) {
    this.p = p;
  }

  public VariableAnnuityRequest allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @ApiModelProperty(value = "")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public VariableAnnuityRequest decumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * Get decumulationHorizon
   * minimum: 1
   * @return decumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public VariableAnnuityRequest accumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * Get accumulationHorizon
   * minimum: 0
   * @return accumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public VariableAnnuityRequest annuitizationRate(Float annuitizationRate) {
    this.annuitizationRate = annuitizationRate;
    return this;
  }

   /**
   * Get annuitizationRate
   * minimum: -1
   * @return annuitizationRate
  **/
  @ApiModelProperty(value = "")
  public Float getAnnuitizationRate() {
    return annuitizationRate;
  }

  public void setAnnuitizationRate(Float annuitizationRate) {
    this.annuitizationRate = annuitizationRate;
  }

  public VariableAnnuityRequest guaranteedRateBenefit(List<GuaranteedRateBenefit> guaranteedRateBenefit) {
    this.guaranteedRateBenefit = guaranteedRateBenefit;
    return this;
  }

  public VariableAnnuityRequest addGuaranteedRateBenefitItem(GuaranteedRateBenefit guaranteedRateBenefitItem) {
    if (this.guaranteedRateBenefit == null) {
      this.guaranteedRateBenefit = new ArrayList<GuaranteedRateBenefit>();
    }
    this.guaranteedRateBenefit.add(guaranteedRateBenefitItem);
    return this;
  }

   /**
   * Get guaranteedRateBenefit
   * @return guaranteedRateBenefit
  **/
  @ApiModelProperty(value = "")
  public List<GuaranteedRateBenefit> getGuaranteedRateBenefit() {
    return guaranteedRateBenefit;
  }

  public void setGuaranteedRateBenefit(List<GuaranteedRateBenefit> guaranteedRateBenefit) {
    this.guaranteedRateBenefit = guaranteedRateBenefit;
  }

  public VariableAnnuityRequest modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(value = "")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public VariableAnnuityRequest portfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
    return this;
  }

  public VariableAnnuityRequest addPortfolioTickersItem(String portfolioTickersItem) {
    if (this.portfolioTickers == null) {
      this.portfolioTickers = new ArrayList<String>();
    }
    this.portfolioTickers.add(portfolioTickersItem);
    return this;
  }

   /**
   * Get portfolioTickers
   * @return portfolioTickers
  **/
  @ApiModelProperty(value = "")
  public List<String> getPortfolioTickers() {
    return portfolioTickers;
  }

  public void setPortfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
  }

  public VariableAnnuityRequest createLog(Boolean createLog) {
    this.createLog = createLog;
    return this;
  }

   /**
   * Get createLog
   * @return createLog
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateLog() {
    return createLog;
  }

  public void setCreateLog(Boolean createLog) {
    this.createLog = createLog;
  }

  public VariableAnnuityRequest inflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * Get inflationRate
   * minimum: -1
   * maximum: 20
   * @return inflationRate
  **/
  @ApiModelProperty(value = "")
  public Float getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
  }

  public VariableAnnuityRequest aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * Get aggregationAccountId
   * @return aggregationAccountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }

  public VariableAnnuityRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * minimum: 1
   * @return n
  **/
  @ApiModelProperty(value = "")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public VariableAnnuityRequest guaranteedAccumulationBenefit(Float guaranteedAccumulationBenefit) {
    this.guaranteedAccumulationBenefit = guaranteedAccumulationBenefit;
    return this;
  }

   /**
   * Get guaranteedAccumulationBenefit
   * minimum: 0
   * @return guaranteedAccumulationBenefit
  **/
  @ApiModelProperty(value = "")
  public Float getGuaranteedAccumulationBenefit() {
    return guaranteedAccumulationBenefit;
  }

  public void setGuaranteedAccumulationBenefit(Float guaranteedAccumulationBenefit) {
    this.guaranteedAccumulationBenefit = guaranteedAccumulationBenefit;
  }

  public VariableAnnuityRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public VariableAnnuityRequest taxRate(Float taxRate) {
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

  public VariableAnnuityRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public VariableAnnuityRequest removeOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
    return this;
  }

   /**
   * Get removeOutliers
   * @return removeOutliers
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoveOutliers() {
    return removeOutliers;
  }

  public void setRemoveOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
  }

  public VariableAnnuityRequest portfolioWeights(List<Float> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
    return this;
  }

  public VariableAnnuityRequest addPortfolioWeightsItem(Float portfolioWeightsItem) {
    if (this.portfolioWeights == null) {
      this.portfolioWeights = new ArrayList<Float>();
    }
    this.portfolioWeights.add(portfolioWeightsItem);
    return this;
  }

   /**
   * Get portfolioWeights
   * @return portfolioWeights
  **/
  @ApiModelProperty(value = "")
  public List<Float> getPortfolioWeights() {
    return portfolioWeights;
  }

  public void setPortfolioWeights(List<Float> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
  }

  public VariableAnnuityRequest portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public VariableAnnuityRequest resultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
    return this;
  }

   /**
   * Get resultType
   * @return resultType
  **/
  @ApiModelProperty(value = "")
  public ResultTypeEnum getResultType() {
    return resultType;
  }

  public void setResultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
  }

  public VariableAnnuityRequest accountId(UUID accountId) {
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

  public VariableAnnuityRequest tradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
    return this;
  }

   /**
   * Get tradingDaysPerYear
   * minimum: 1
   * @return tradingDaysPerYear
  **/
  @ApiModelProperty(value = "")
  public Integer getTradingDaysPerYear() {
    return tradingDaysPerYear;
  }

  public void setTradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
  }

  public VariableAnnuityRequest useProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
    return this;
  }

   /**
   * Get useProxyData
   * @return useProxyData
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseProxyData() {
    return useProxyData;
  }

  public void setUseProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
  }

  public VariableAnnuityRequest initialBalance(Float initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * Get initialBalance
   * minimum: 0
   * @return initialBalance
  **/
  @ApiModelProperty(value = "")
  public Float getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(Float initialBalance) {
    this.initialBalance = initialBalance;
  }

  public VariableAnnuityRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
    return this;
  }

   /**
   * Get marketDataSource
   * @return marketDataSource
  **/
  @ApiModelProperty(value = "")
  public MarketDataSourceEnum getMarketDataSource() {
    return marketDataSource;
  }

  public void setMarketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
  }

  public VariableAnnuityRequest frequencyInterval(FrequencyIntervalEnum frequencyInterval) {
    this.frequencyInterval = frequencyInterval;
    return this;
  }

   /**
   * Get frequencyInterval
   * @return frequencyInterval
  **/
  @ApiModelProperty(value = "")
  public FrequencyIntervalEnum getFrequencyInterval() {
    return frequencyInterval;
  }

  public void setFrequencyInterval(FrequencyIntervalEnum frequencyInterval) {
    this.frequencyInterval = frequencyInterval;
  }

  public VariableAnnuityRequest depositSchedule(AnnuityDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public AnnuityDepositSchedule getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(AnnuityDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableAnnuityRequest variableAnnuityRequest = (VariableAnnuityRequest) o;
    return Objects.equals(this.p, variableAnnuityRequest.p) &&
        Objects.equals(this.allocationId, variableAnnuityRequest.allocationId) &&
        Objects.equals(this.decumulationHorizon, variableAnnuityRequest.decumulationHorizon) &&
        Objects.equals(this.accumulationHorizon, variableAnnuityRequest.accumulationHorizon) &&
        Objects.equals(this.annuitizationRate, variableAnnuityRequest.annuitizationRate) &&
        Objects.equals(this.guaranteedRateBenefit, variableAnnuityRequest.guaranteedRateBenefit) &&
        Objects.equals(this.modelId, variableAnnuityRequest.modelId) &&
        Objects.equals(this.portfolioTickers, variableAnnuityRequest.portfolioTickers) &&
        Objects.equals(this.createLog, variableAnnuityRequest.createLog) &&
        Objects.equals(this.inflationRate, variableAnnuityRequest.inflationRate) &&
        Objects.equals(this.aggregationAccountId, variableAnnuityRequest.aggregationAccountId) &&
        Objects.equals(this.n, variableAnnuityRequest.n) &&
        Objects.equals(this.guaranteedAccumulationBenefit, variableAnnuityRequest.guaranteedAccumulationBenefit) &&
        Objects.equals(this.endDate, variableAnnuityRequest.endDate) &&
        Objects.equals(this.taxRate, variableAnnuityRequest.taxRate) &&
        Objects.equals(this.startDate, variableAnnuityRequest.startDate) &&
        Objects.equals(this.removeOutliers, variableAnnuityRequest.removeOutliers) &&
        Objects.equals(this.portfolioWeights, variableAnnuityRequest.portfolioWeights) &&
        Objects.equals(this.portfolioId, variableAnnuityRequest.portfolioId) &&
        Objects.equals(this.resultType, variableAnnuityRequest.resultType) &&
        Objects.equals(this.accountId, variableAnnuityRequest.accountId) &&
        Objects.equals(this.tradingDaysPerYear, variableAnnuityRequest.tradingDaysPerYear) &&
        Objects.equals(this.useProxyData, variableAnnuityRequest.useProxyData) &&
        Objects.equals(this.initialBalance, variableAnnuityRequest.initialBalance) &&
        Objects.equals(this.marketDataSource, variableAnnuityRequest.marketDataSource) &&
        Objects.equals(this.frequencyInterval, variableAnnuityRequest.frequencyInterval) &&
        Objects.equals(this.depositSchedule, variableAnnuityRequest.depositSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(p, allocationId, decumulationHorizon, accumulationHorizon, annuitizationRate, guaranteedRateBenefit, modelId, portfolioTickers, createLog, inflationRate, aggregationAccountId, n, guaranteedAccumulationBenefit, endDate, taxRate, startDate, removeOutliers, portfolioWeights, portfolioId, resultType, accountId, tradingDaysPerYear, useProxyData, initialBalance, marketDataSource, frequencyInterval, depositSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableAnnuityRequest {\n");
    
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    annuitizationRate: ").append(toIndentedString(annuitizationRate)).append("\n");
    sb.append("    guaranteedRateBenefit: ").append(toIndentedString(guaranteedRateBenefit)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    portfolioTickers: ").append(toIndentedString(portfolioTickers)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    guaranteedAccumulationBenefit: ").append(toIndentedString(guaranteedAccumulationBenefit)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    removeOutliers: ").append(toIndentedString(removeOutliers)).append("\n");
    sb.append("    portfolioWeights: ").append(toIndentedString(portfolioWeights)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    tradingDaysPerYear: ").append(toIndentedString(tradingDaysPerYear)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    frequencyInterval: ").append(toIndentedString(frequencyInterval)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
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

