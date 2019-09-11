/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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

/**
 * PfloDiversificationScoreResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class PfloDiversificationScoreResponse {
  @SerializedName("portfolio_standard_deviation")
  private BigDecimal portfolioStandardDeviation = null;

  @SerializedName("holdings_standard_deviation")
  private Map<String, BigDecimal> holdingsStandardDeviation = null;

  @SerializedName("diversification_score")
  private Integer diversificationScore = null;

  public PfloDiversificationScoreResponse portfolioStandardDeviation(BigDecimal portfolioStandardDeviation) {
    this.portfolioStandardDeviation = portfolioStandardDeviation;
    return this;
  }

   /**
   * The annualized standard deviation of the overall portfolio.
   * minimum: 0
   * @return portfolioStandardDeviation
  **/
  @ApiModelProperty(value = "The annualized standard deviation of the overall portfolio.")
  public BigDecimal getPortfolioStandardDeviation() {
    return portfolioStandardDeviation;
  }

  public void setPortfolioStandardDeviation(BigDecimal portfolioStandardDeviation) {
    this.portfolioStandardDeviation = portfolioStandardDeviation;
  }

  public PfloDiversificationScoreResponse holdingsStandardDeviation(Map<String, BigDecimal> holdingsStandardDeviation) {
    this.holdingsStandardDeviation = holdingsStandardDeviation;
    return this;
  }

  public PfloDiversificationScoreResponse putHoldingsStandardDeviationItem(String key, BigDecimal holdingsStandardDeviationItem) {
    if (this.holdingsStandardDeviation == null) {
      this.holdingsStandardDeviation = new HashMap<String, BigDecimal>();
    }
    this.holdingsStandardDeviation.put(key, holdingsStandardDeviationItem);
    return this;
  }

   /**
   * Get holdingsStandardDeviation
   * @return holdingsStandardDeviation
  **/
  @ApiModelProperty(value = "")
  public Map<String, BigDecimal> getHoldingsStandardDeviation() {
    return holdingsStandardDeviation;
  }

  public void setHoldingsStandardDeviation(Map<String, BigDecimal> holdingsStandardDeviation) {
    this.holdingsStandardDeviation = holdingsStandardDeviation;
  }

  public PfloDiversificationScoreResponse diversificationScore(Integer diversificationScore) {
    this.diversificationScore = diversificationScore;
    return this;
  }

   /**
   * A score from 0 to 100, in which 0 indicates no diversification and 100 indicates the maximum theoretical diversification level.
   * minimum: 0
   * maximum: 100
   * @return diversificationScore
  **/
  @ApiModelProperty(value = "A score from 0 to 100, in which 0 indicates no diversification and 100 indicates the maximum theoretical diversification level.")
  public Integer getDiversificationScore() {
    return diversificationScore;
  }

  public void setDiversificationScore(Integer diversificationScore) {
    this.diversificationScore = diversificationScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfloDiversificationScoreResponse pfloDiversificationScoreResponse = (PfloDiversificationScoreResponse) o;
    return Objects.equals(this.portfolioStandardDeviation, pfloDiversificationScoreResponse.portfolioStandardDeviation) &&
        Objects.equals(this.holdingsStandardDeviation, pfloDiversificationScoreResponse.holdingsStandardDeviation) &&
        Objects.equals(this.diversificationScore, pfloDiversificationScoreResponse.diversificationScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioStandardDeviation, holdingsStandardDeviation, diversificationScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfloDiversificationScoreResponse {\n");
    
    sb.append("    portfolioStandardDeviation: ").append(toIndentedString(portfolioStandardDeviation)).append("\n");
    sb.append("    holdingsStandardDeviation: ").append(toIndentedString(holdingsStandardDeviation)).append("\n");
    sb.append("    diversificationScore: ").append(toIndentedString(diversificationScore)).append("\n");
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
