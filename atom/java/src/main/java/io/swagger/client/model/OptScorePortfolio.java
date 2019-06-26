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
import java.util.ArrayList;
import java.util.List;

/**
 * OptScorePortfolio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class OptScorePortfolio {
  @SerializedName("tickers")
  private List<String> tickers = new ArrayList<String>();

  @SerializedName("weights")
  private List<BigDecimal> weights = new ArrayList<BigDecimal>();

  @SerializedName("return")
  private BigDecimal _return = null;

  @SerializedName("risk")
  private BigDecimal risk = null;

  public OptScorePortfolio tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public OptScorePortfolio addTickersItem(String tickersItem) {
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * Tickers in the portfolio.
   * @return tickers
  **/
  @ApiModelProperty(required = true, value = "Tickers in the portfolio.")
  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }

  public OptScorePortfolio weights(List<BigDecimal> weights) {
    this.weights = weights;
    return this;
  }

  public OptScorePortfolio addWeightsItem(BigDecimal weightsItem) {
    this.weights.add(weightsItem);
    return this;
  }

   /**
   * Weights in the current portfolio, corresponding to tickers.
   * @return weights
  **/
  @ApiModelProperty(required = true, value = "Weights in the current portfolio, corresponding to tickers.")
  public List<BigDecimal> getWeights() {
    return weights;
  }

  public void setWeights(List<BigDecimal> weights) {
    this.weights = weights;
  }

  public OptScorePortfolio _return(BigDecimal _return) {
    this._return = _return;
    return this;
  }

   /**
   * The annualized mean return.
   * @return _return
  **/
  @ApiModelProperty(required = true, value = "The annualized mean return.")
  public BigDecimal getReturn() {
    return _return;
  }

  public void setReturn(BigDecimal _return) {
    this._return = _return;
  }

  public OptScorePortfolio risk(BigDecimal risk) {
    this.risk = risk;
    return this;
  }

   /**
   * The annualized standard deviation of returns.
   * minimum: 0
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "The annualized standard deviation of returns.")
  public BigDecimal getRisk() {
    return risk;
  }

  public void setRisk(BigDecimal risk) {
    this.risk = risk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptScorePortfolio optScorePortfolio = (OptScorePortfolio) o;
    return Objects.equals(this.tickers, optScorePortfolio.tickers) &&
        Objects.equals(this.weights, optScorePortfolio.weights) &&
        Objects.equals(this._return, optScorePortfolio._return) &&
        Objects.equals(this.risk, optScorePortfolio.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickers, weights, _return, risk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptScorePortfolio {\n");
    
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

