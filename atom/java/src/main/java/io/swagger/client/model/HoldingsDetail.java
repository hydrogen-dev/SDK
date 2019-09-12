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
 * HoldingsDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class HoldingsDetail {
  @SerializedName("date")
  private String date = null;

  @SerializedName("tickers")
  private List<String> tickers = new ArrayList<String>();

  @SerializedName("weights")
  private List<BigDecimal> weights = new ArrayList<BigDecimal>();

  @SerializedName("amount")
  private List<BigDecimal> amount = new ArrayList<BigDecimal>();

  public HoldingsDetail date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date for the holding details.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The date for the holding details.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public HoldingsDetail tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public HoldingsDetail addTickersItem(String tickersItem) {
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * The tickers of the holdings.
   * @return tickers
  **/
  @ApiModelProperty(required = true, value = "The tickers of the holdings.")
  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }

  public HoldingsDetail weights(List<BigDecimal> weights) {
    this.weights = weights;
    return this;
  }

  public HoldingsDetail addWeightsItem(BigDecimal weightsItem) {
    this.weights.add(weightsItem);
    return this;
  }

   /**
   * The weights of the holdings, represented on a percentage basis.
   * @return weights
  **/
  @ApiModelProperty(required = true, value = "The weights of the holdings, represented on a percentage basis.")
  public List<BigDecimal> getWeights() {
    return weights;
  }

  public void setWeights(List<BigDecimal> weights) {
    this.weights = weights;
  }

  public HoldingsDetail amount(List<BigDecimal> amount) {
    this.amount = amount;
    return this;
  }

  public HoldingsDetail addAmountItem(BigDecimal amountItem) {
    this.amount.add(amountItem);
    return this;
  }

   /**
   * The total value for each security.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The total value for each security.")
  public List<BigDecimal> getAmount() {
    return amount;
  }

  public void setAmount(List<BigDecimal> amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingsDetail holdingsDetail = (HoldingsDetail) o;
    return Objects.equals(this.date, holdingsDetail.date) &&
        Objects.equals(this.tickers, holdingsDetail.tickers) &&
        Objects.equals(this.weights, holdingsDetail.weights) &&
        Objects.equals(this.amount, holdingsDetail.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, tickers, weights, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingsDetail {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

