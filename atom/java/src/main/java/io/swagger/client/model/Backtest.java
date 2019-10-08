/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.LocalDate;

/**
 * Backtest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class Backtest {
  @SerializedName("model_id")
  private String modelId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("initial_weights")
  private Map<String, BigDecimal> initialWeights = null;

  @SerializedName("asset_size")
  private BigDecimal assetSize = null;

  @SerializedName("asset_sizes")
  private Boolean assetSizes = true;

  @SerializedName("trades")
  private Boolean trades = true;

  @SerializedName("holdings")
  private Boolean holdings = true;

  @SerializedName("stats")
  private Boolean stats = true;

  public Backtest modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Identifier of the model to rebalance
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the model to rebalance")
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public Backtest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * tart date for analysis
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "tart date for analysis")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Backtest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for analysis
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "End date for analysis")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Backtest initialWeights(Map<String, BigDecimal> initialWeights) {
    this.initialWeights = initialWeights;
    return this;
  }

  public Backtest putInitialWeightsItem(String key, BigDecimal initialWeightsItem) {
    if (this.initialWeights == null) {
      this.initialWeights = new HashMap<String, BigDecimal>();
    }
    this.initialWeights.put(key, initialWeightsItem);
    return this;
  }

   /**
   * Initial weights for model holdings
   * @return initialWeights
  **/
  @ApiModelProperty(value = "Initial weights for model holdings")
  public Map<String, BigDecimal> getInitialWeights() {
    return initialWeights;
  }

  public void setInitialWeights(Map<String, BigDecimal> initialWeights) {
    this.initialWeights = initialWeights;
  }

  public Backtest assetSize(BigDecimal assetSize) {
    this.assetSize = assetSize;
    return this;
  }

   /**
   * The initial asset size
   * minimum: 0
   * @return assetSize
  **/
  @ApiModelProperty(value = "The initial asset size")
  public BigDecimal getAssetSize() {
    return assetSize;
  }

  public void setAssetSize(BigDecimal assetSize) {
    this.assetSize = assetSize;
  }

  public Backtest assetSizes(Boolean assetSizes) {
    this.assetSizes = assetSizes;
    return this;
  }

   /**
   * Get asset sizes
   * @return assetSizes
  **/
  @ApiModelProperty(value = "Get asset sizes")
  public Boolean isAssetSizes() {
    return assetSizes;
  }

  public void setAssetSizes(Boolean assetSizes) {
    this.assetSizes = assetSizes;
  }

  public Backtest trades(Boolean trades) {
    this.trades = trades;
    return this;
  }

   /**
   * Get trades
   * @return trades
  **/
  @ApiModelProperty(value = "Get trades")
  public Boolean isTrades() {
    return trades;
  }

  public void setTrades(Boolean trades) {
    this.trades = trades;
  }

  public Backtest holdings(Boolean holdings) {
    this.holdings = holdings;
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(value = "Get holdings")
  public Boolean isHoldings() {
    return holdings;
  }

  public void setHoldings(Boolean holdings) {
    this.holdings = holdings;
  }

  public Backtest stats(Boolean stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get portfolio statistics
   * @return stats
  **/
  @ApiModelProperty(value = "Get portfolio statistics")
  public Boolean isStats() {
    return stats;
  }

  public void setStats(Boolean stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backtest backtest = (Backtest) o;
    return Objects.equals(this.modelId, backtest.modelId) &&
        Objects.equals(this.startDate, backtest.startDate) &&
        Objects.equals(this.endDate, backtest.endDate) &&
        Objects.equals(this.initialWeights, backtest.initialWeights) &&
        Objects.equals(this.assetSize, backtest.assetSize) &&
        Objects.equals(this.assetSizes, backtest.assetSizes) &&
        Objects.equals(this.trades, backtest.trades) &&
        Objects.equals(this.holdings, backtest.holdings) &&
        Objects.equals(this.stats, backtest.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, startDate, endDate, initialWeights, assetSize, assetSizes, trades, holdings, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backtest {\n");
    
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    initialWeights: ").append(toIndentedString(initialWeights)).append("\n");
    sb.append("    assetSize: ").append(toIndentedString(assetSize)).append("\n");
    sb.append("    assetSizes: ").append(toIndentedString(assetSizes)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

