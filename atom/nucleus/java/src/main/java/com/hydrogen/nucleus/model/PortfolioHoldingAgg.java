/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

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
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * PortfolioHoldingAgg Object
 */
@ApiModel(description = "PortfolioHoldingAgg Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class PortfolioHoldingAgg {
  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("cost_basis")
  private Double costBasis = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("shares")
  private Double shares = null;

  @SerializedName("weight")
  private Double weight = null;

  public PortfolioHoldingAgg amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", value = "amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PortfolioHoldingAgg costBasis(Double costBasis) {
    this.costBasis = costBasis;
    return this;
  }

   /**
   * costBasis
   * @return costBasis
  **/
  @ApiModelProperty(example = "60.0", value = "costBasis")
  public Double getCostBasis() {
    return costBasis;
  }

  public void setCostBasis(Double costBasis) {
    this.costBasis = costBasis;
  }

  public PortfolioHoldingAgg currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PortfolioHoldingAgg date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2017-01-20", value = "date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public PortfolioHoldingAgg securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * securityId
   * @return securityId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", value = "securityId")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public PortfolioHoldingAgg shares(Double shares) {
    this.shares = shares;
    return this;
  }

   /**
   * shares
   * @return shares
  **/
  @ApiModelProperty(example = "60.0", value = "shares")
  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public PortfolioHoldingAgg weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * weight
   * @return weight
  **/
  @ApiModelProperty(example = "68.75", value = "weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioHoldingAgg portfolioHoldingAgg = (PortfolioHoldingAgg) o;
    return Objects.equals(this.amount, portfolioHoldingAgg.amount) &&
        Objects.equals(this.costBasis, portfolioHoldingAgg.costBasis) &&
        Objects.equals(this.currencyCode, portfolioHoldingAgg.currencyCode) &&
        Objects.equals(this.date, portfolioHoldingAgg.date) &&
        Objects.equals(this.securityId, portfolioHoldingAgg.securityId) &&
        Objects.equals(this.shares, portfolioHoldingAgg.shares) &&
        Objects.equals(this.weight, portfolioHoldingAgg.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, costBasis, currencyCode, date, securityId, shares, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioHoldingAgg {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

