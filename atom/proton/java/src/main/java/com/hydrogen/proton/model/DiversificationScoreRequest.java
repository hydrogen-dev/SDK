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
 * DiversificationScoreRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class DiversificationScoreRequest {
  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

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

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  @SerializedName("portfolio_weights")
  private List<Float> portfolioWeights = null;

  @SerializedName("portfolio_tickers")
  private List<String> portfolioTickers = null;

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  public DiversificationScoreRequest allocationId(UUID allocationId) {
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

  public DiversificationScoreRequest endDate(LocalDate endDate) {
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

  public DiversificationScoreRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
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

  public DiversificationScoreRequest modelId(UUID modelId) {
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

  public DiversificationScoreRequest accountId(UUID accountId) {
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

  public DiversificationScoreRequest startDate(LocalDate startDate) {
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

  public DiversificationScoreRequest useProxyData(Boolean useProxyData) {
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

  public DiversificationScoreRequest portfolioWeights(List<Float> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
    return this;
  }

  public DiversificationScoreRequest addPortfolioWeightsItem(Float portfolioWeightsItem) {
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

  public DiversificationScoreRequest portfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
    return this;
  }

  public DiversificationScoreRequest addPortfolioTickersItem(String portfolioTickersItem) {
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

  public DiversificationScoreRequest createLog(Boolean createLog) {
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

  public DiversificationScoreRequest aggregationAccountId(UUID aggregationAccountId) {
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

  public DiversificationScoreRequest portfolioId(UUID portfolioId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiversificationScoreRequest diversificationScoreRequest = (DiversificationScoreRequest) o;
    return Objects.equals(this.allocationId, diversificationScoreRequest.allocationId) &&
        Objects.equals(this.endDate, diversificationScoreRequest.endDate) &&
        Objects.equals(this.marketDataSource, diversificationScoreRequest.marketDataSource) &&
        Objects.equals(this.modelId, diversificationScoreRequest.modelId) &&
        Objects.equals(this.accountId, diversificationScoreRequest.accountId) &&
        Objects.equals(this.startDate, diversificationScoreRequest.startDate) &&
        Objects.equals(this.useProxyData, diversificationScoreRequest.useProxyData) &&
        Objects.equals(this.portfolioWeights, diversificationScoreRequest.portfolioWeights) &&
        Objects.equals(this.portfolioTickers, diversificationScoreRequest.portfolioTickers) &&
        Objects.equals(this.createLog, diversificationScoreRequest.createLog) &&
        Objects.equals(this.aggregationAccountId, diversificationScoreRequest.aggregationAccountId) &&
        Objects.equals(this.portfolioId, diversificationScoreRequest.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, endDate, marketDataSource, modelId, accountId, startDate, useProxyData, portfolioWeights, portfolioTickers, createLog, aggregationAccountId, portfolioId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiversificationScoreRequest {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    portfolioWeights: ").append(toIndentedString(portfolioWeights)).append("\n");
    sb.append("    portfolioTickers: ").append(toIndentedString(portfolioTickers)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

