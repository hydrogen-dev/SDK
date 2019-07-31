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
import io.swagger.client.model.HoldingsDetail;
import io.swagger.client.model.RebalanceSignal;
import io.swagger.client.model.StatsDetail;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BacktestResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class BacktestResponse {
  @SerializedName("asset_sizes")
  private Map<String, BigDecimal> assetSizes = new HashMap<String, BigDecimal>();

  @SerializedName("trades")
  private List<RebalanceSignal> trades = new ArrayList<RebalanceSignal>();

  @SerializedName("holdings")
  private List<HoldingsDetail> holdings = new ArrayList<HoldingsDetail>();

  @SerializedName("stats")
  private StatsDetail stats = null;

  public BacktestResponse assetSizes(Map<String, BigDecimal> assetSizes) {
    this.assetSizes = assetSizes;
    return this;
  }

  public BacktestResponse putAssetSizesItem(String key, BigDecimal assetSizesItem) {
    this.assetSizes.put(key, assetSizesItem);
    return this;
  }

   /**
   * Get assetSizes
   * @return assetSizes
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, BigDecimal> getAssetSizes() {
    return assetSizes;
  }

  public void setAssetSizes(Map<String, BigDecimal> assetSizes) {
    this.assetSizes = assetSizes;
  }

  public BacktestResponse trades(List<RebalanceSignal> trades) {
    this.trades = trades;
    return this;
  }

  public BacktestResponse addTradesItem(RebalanceSignal tradesItem) {
    this.trades.add(tradesItem);
    return this;
  }

   /**
   * Get trades
   * @return trades
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RebalanceSignal> getTrades() {
    return trades;
  }

  public void setTrades(List<RebalanceSignal> trades) {
    this.trades = trades;
  }

  public BacktestResponse holdings(List<HoldingsDetail> holdings) {
    this.holdings = holdings;
    return this;
  }

  public BacktestResponse addHoldingsItem(HoldingsDetail holdingsItem) {
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(required = true, value = "")
  public List<HoldingsDetail> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<HoldingsDetail> holdings) {
    this.holdings = holdings;
  }

  public BacktestResponse stats(StatsDetail stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(required = true, value = "")
  public StatsDetail getStats() {
    return stats;
  }

  public void setStats(StatsDetail stats) {
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
    BacktestResponse backtestResponse = (BacktestResponse) o;
    return Objects.equals(this.assetSizes, backtestResponse.assetSizes) &&
        Objects.equals(this.trades, backtestResponse.trades) &&
        Objects.equals(this.holdings, backtestResponse.holdings) &&
        Objects.equals(this.stats, backtestResponse.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetSizes, trades, holdings, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BacktestResponse {\n");
    
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

