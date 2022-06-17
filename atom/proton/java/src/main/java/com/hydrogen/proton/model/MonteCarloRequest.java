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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MonteCarloRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class MonteCarloRequest {
  @SerializedName("min_bal")
  private List<BigDecimal> minBal = null;

  @SerializedName("max_bal")
  private List<BigDecimal> maxBal = null;

  @SerializedName("p")
  private List<BigDecimal> p = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("init_bal")
  private BigDecimal initBal = null;

  @SerializedName("max_sample")
  private List<Float> maxSample = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("cf")
  private List<List<BigDecimal>> cf = new ArrayList<List<BigDecimal>>();

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("n")
  private Integer n = 1000;

  @SerializedName("remove_outliers")
  private Boolean removeOutliers = false;

  @SerializedName("sigma")
  private List<Float> sigma = null;

  @SerializedName("mu")
  private List<Float> mu = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  /**
   * Gets or Sets resultType
   */
  @JsonAdapter(ResultTypeEnum.Adapter.class)
  public enum ResultTypeEnum {
    RAW("raw"),
    
    CUSTOM("custom"),
    
    MEDIAN("median"),
    
    MEAN("mean"),
    
    TENS("tens");

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
  private ResultTypeEnum resultType = ResultTypeEnum.RAW;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

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

  @SerializedName("ret_mod")
  private List<Float> retMod = null;

  /**
   * Gets or Sets frequencyInterval
   */
  @JsonAdapter(FrequencyIntervalEnum.Adapter.class)
  public enum FrequencyIntervalEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
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

  @SerializedName("min_sample")
  private List<Float> minSample = null;

  public MonteCarloRequest minBal(List<BigDecimal> minBal) {
    this.minBal = minBal;
    return this;
  }

  public MonteCarloRequest addMinBalItem(BigDecimal minBalItem) {
    if (this.minBal == null) {
      this.minBal = new ArrayList<BigDecimal>();
    }
    this.minBal.add(minBalItem);
    return this;
  }

   /**
   * Get minBal
   * @return minBal
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getMinBal() {
    return minBal;
  }

  public void setMinBal(List<BigDecimal> minBal) {
    this.minBal = minBal;
  }

  public MonteCarloRequest maxBal(List<BigDecimal> maxBal) {
    this.maxBal = maxBal;
    return this;
  }

  public MonteCarloRequest addMaxBalItem(BigDecimal maxBalItem) {
    if (this.maxBal == null) {
      this.maxBal = new ArrayList<BigDecimal>();
    }
    this.maxBal.add(maxBalItem);
    return this;
  }

   /**
   * Get maxBal
   * @return maxBal
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getMaxBal() {
    return maxBal;
  }

  public void setMaxBal(List<BigDecimal> maxBal) {
    this.maxBal = maxBal;
  }

  public MonteCarloRequest p(List<BigDecimal> p) {
    this.p = p;
    return this;
  }

  public MonteCarloRequest addPItem(BigDecimal pItem) {
    if (this.p == null) {
      this.p = new ArrayList<BigDecimal>();
    }
    this.p.add(pItem);
    return this;
  }

   /**
   * Get p
   * @return p
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getP() {
    return p;
  }

  public void setP(List<BigDecimal> p) {
    this.p = p;
  }

  public MonteCarloRequest allocationId(UUID allocationId) {
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

  public MonteCarloRequest initBal(BigDecimal initBal) {
    this.initBal = initBal;
    return this;
  }

   /**
   * Get initBal
   * minimum: 0
   * @return initBal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInitBal() {
    return initBal;
  }

  public void setInitBal(BigDecimal initBal) {
    this.initBal = initBal;
  }

  public MonteCarloRequest maxSample(List<Float> maxSample) {
    this.maxSample = maxSample;
    return this;
  }

  public MonteCarloRequest addMaxSampleItem(Float maxSampleItem) {
    if (this.maxSample == null) {
      this.maxSample = new ArrayList<Float>();
    }
    this.maxSample.add(maxSampleItem);
    return this;
  }

   /**
   * Get maxSample
   * @return maxSample
  **/
  @ApiModelProperty(value = "")
  public List<Float> getMaxSample() {
    return maxSample;
  }

  public void setMaxSample(List<Float> maxSample) {
    this.maxSample = maxSample;
  }

  public MonteCarloRequest modelId(UUID modelId) {
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

  public MonteCarloRequest cf(List<List<BigDecimal>> cf) {
    this.cf = cf;
    return this;
  }

  public MonteCarloRequest addCfItem(List<BigDecimal> cfItem) {
    this.cf.add(cfItem);
    return this;
  }

   /**
   * Get cf
   * @return cf
  **/
  @ApiModelProperty(required = true, value = "")
  public List<List<BigDecimal>> getCf() {
    return cf;
  }

  public void setCf(List<List<BigDecimal>> cf) {
    this.cf = cf;
  }

  public MonteCarloRequest createLog(Boolean createLog) {
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

  public MonteCarloRequest aggregationAccountId(UUID aggregationAccountId) {
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

  public MonteCarloRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * minimum: 1
   * maximum: 10000
   * @return n
  **/
  @ApiModelProperty(value = "")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public MonteCarloRequest removeOutliers(Boolean removeOutliers) {
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

  public MonteCarloRequest sigma(List<Float> sigma) {
    this.sigma = sigma;
    return this;
  }

  public MonteCarloRequest addSigmaItem(Float sigmaItem) {
    if (this.sigma == null) {
      this.sigma = new ArrayList<Float>();
    }
    this.sigma.add(sigmaItem);
    return this;
  }

   /**
   * Get sigma
   * @return sigma
  **/
  @ApiModelProperty(value = "")
  public List<Float> getSigma() {
    return sigma;
  }

  public void setSigma(List<Float> sigma) {
    this.sigma = sigma;
  }

  public MonteCarloRequest mu(List<Float> mu) {
    this.mu = mu;
    return this;
  }

  public MonteCarloRequest addMuItem(Float muItem) {
    if (this.mu == null) {
      this.mu = new ArrayList<Float>();
    }
    this.mu.add(muItem);
    return this;
  }

   /**
   * Get mu
   * @return mu
  **/
  @ApiModelProperty(value = "")
  public List<Float> getMu() {
    return mu;
  }

  public void setMu(List<Float> mu) {
    this.mu = mu;
  }

  public MonteCarloRequest portfolioId(UUID portfolioId) {
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

  public MonteCarloRequest resultType(ResultTypeEnum resultType) {
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

  public MonteCarloRequest accountId(UUID accountId) {
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

  public MonteCarloRequest useProxyData(Boolean useProxyData) {
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

  public MonteCarloRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
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

  public MonteCarloRequest retMod(List<Float> retMod) {
    this.retMod = retMod;
    return this;
  }

  public MonteCarloRequest addRetModItem(Float retModItem) {
    if (this.retMod == null) {
      this.retMod = new ArrayList<Float>();
    }
    this.retMod.add(retModItem);
    return this;
  }

   /**
   * Get retMod
   * @return retMod
  **/
  @ApiModelProperty(value = "")
  public List<Float> getRetMod() {
    return retMod;
  }

  public void setRetMod(List<Float> retMod) {
    this.retMod = retMod;
  }

  public MonteCarloRequest frequencyInterval(FrequencyIntervalEnum frequencyInterval) {
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

  public MonteCarloRequest minSample(List<Float> minSample) {
    this.minSample = minSample;
    return this;
  }

  public MonteCarloRequest addMinSampleItem(Float minSampleItem) {
    if (this.minSample == null) {
      this.minSample = new ArrayList<Float>();
    }
    this.minSample.add(minSampleItem);
    return this;
  }

   /**
   * Get minSample
   * @return minSample
  **/
  @ApiModelProperty(value = "")
  public List<Float> getMinSample() {
    return minSample;
  }

  public void setMinSample(List<Float> minSample) {
    this.minSample = minSample;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonteCarloRequest monteCarloRequest = (MonteCarloRequest) o;
    return Objects.equals(this.minBal, monteCarloRequest.minBal) &&
        Objects.equals(this.maxBal, monteCarloRequest.maxBal) &&
        Objects.equals(this.p, monteCarloRequest.p) &&
        Objects.equals(this.allocationId, monteCarloRequest.allocationId) &&
        Objects.equals(this.initBal, monteCarloRequest.initBal) &&
        Objects.equals(this.maxSample, monteCarloRequest.maxSample) &&
        Objects.equals(this.modelId, monteCarloRequest.modelId) &&
        Objects.equals(this.cf, monteCarloRequest.cf) &&
        Objects.equals(this.createLog, monteCarloRequest.createLog) &&
        Objects.equals(this.aggregationAccountId, monteCarloRequest.aggregationAccountId) &&
        Objects.equals(this.n, monteCarloRequest.n) &&
        Objects.equals(this.removeOutliers, monteCarloRequest.removeOutliers) &&
        Objects.equals(this.sigma, monteCarloRequest.sigma) &&
        Objects.equals(this.mu, monteCarloRequest.mu) &&
        Objects.equals(this.portfolioId, monteCarloRequest.portfolioId) &&
        Objects.equals(this.resultType, monteCarloRequest.resultType) &&
        Objects.equals(this.accountId, monteCarloRequest.accountId) &&
        Objects.equals(this.useProxyData, monteCarloRequest.useProxyData) &&
        Objects.equals(this.marketDataSource, monteCarloRequest.marketDataSource) &&
        Objects.equals(this.retMod, monteCarloRequest.retMod) &&
        Objects.equals(this.frequencyInterval, monteCarloRequest.frequencyInterval) &&
        Objects.equals(this.minSample, monteCarloRequest.minSample);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBal, maxBal, p, allocationId, initBal, maxSample, modelId, cf, createLog, aggregationAccountId, n, removeOutliers, sigma, mu, portfolioId, resultType, accountId, useProxyData, marketDataSource, retMod, frequencyInterval, minSample);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonteCarloRequest {\n");
    
    sb.append("    minBal: ").append(toIndentedString(minBal)).append("\n");
    sb.append("    maxBal: ").append(toIndentedString(maxBal)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    initBal: ").append(toIndentedString(initBal)).append("\n");
    sb.append("    maxSample: ").append(toIndentedString(maxSample)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    cf: ").append(toIndentedString(cf)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    removeOutliers: ").append(toIndentedString(removeOutliers)).append("\n");
    sb.append("    sigma: ").append(toIndentedString(sigma)).append("\n");
    sb.append("    mu: ").append(toIndentedString(mu)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    retMod: ").append(toIndentedString(retMod)).append("\n");
    sb.append("    frequencyInterval: ").append(toIndentedString(frequencyInterval)).append("\n");
    sb.append("    minSample: ").append(toIndentedString(minSample)).append("\n");
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

