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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * PurchaseCalculatorDepositAmountRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class PurchaseCalculatorDepositAmountRequest {
  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  /**
   * Gets or Sets horizonFrequencyInterval
   */
  @JsonAdapter(HorizonFrequencyIntervalEnum.Adapter.class)
  public enum HorizonFrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week");

    private String value;

    HorizonFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizonFrequencyIntervalEnum fromValue(String text) {
      for (HorizonFrequencyIntervalEnum b : HorizonFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizonFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizonFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizonFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizonFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("horizon_frequency_interval")
  private HorizonFrequencyIntervalEnum horizonFrequencyInterval = HorizonFrequencyIntervalEnum.YEAR;

  @SerializedName("purchase_horizon")
  private Integer purchaseHorizon = null;

  @SerializedName("investment_tax")
  private Float investmentTax = 0.0f;

  @SerializedName("portfolio_return")
  private Float portfolioReturn = null;

  @SerializedName("deposit_schedule")
  private CalculatorDepositSchedule depositSchedule = null;

  @SerializedName("current_savings")
  private Float currentSavings = 0.0f;

  @SerializedName("purchase_amount")
  private Float purchaseAmount = null;

  @SerializedName("inflation_rate")
  private Float inflationRate = 0.0f;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  public PurchaseCalculatorDepositAmountRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public PurchaseCalculatorDepositAmountRequest addAccountIdsItem(UUID accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<UUID>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
  }

  public PurchaseCalculatorDepositAmountRequest horizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
    return this;
  }

   /**
   * Get horizonFrequencyInterval
   * @return horizonFrequencyInterval
  **/
  @ApiModelProperty(value = "")
  public HorizonFrequencyIntervalEnum getHorizonFrequencyInterval() {
    return horizonFrequencyInterval;
  }

  public void setHorizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
  }

  public PurchaseCalculatorDepositAmountRequest purchaseHorizon(Integer purchaseHorizon) {
    this.purchaseHorizon = purchaseHorizon;
    return this;
  }

   /**
   * Get purchaseHorizon
   * minimum: 0
   * @return purchaseHorizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPurchaseHorizon() {
    return purchaseHorizon;
  }

  public void setPurchaseHorizon(Integer purchaseHorizon) {
    this.purchaseHorizon = purchaseHorizon;
  }

  public PurchaseCalculatorDepositAmountRequest investmentTax(Float investmentTax) {
    this.investmentTax = investmentTax;
    return this;
  }

   /**
   * Get investmentTax
   * minimum: 0
   * maximum: 1
   * @return investmentTax
  **/
  @ApiModelProperty(value = "")
  public Float getInvestmentTax() {
    return investmentTax;
  }

  public void setInvestmentTax(Float investmentTax) {
    this.investmentTax = investmentTax;
  }

  public PurchaseCalculatorDepositAmountRequest portfolioReturn(Float portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
    return this;
  }

   /**
   * Get portfolioReturn
   * minimum: -1
   * @return portfolioReturn
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getPortfolioReturn() {
    return portfolioReturn;
  }

  public void setPortfolioReturn(Float portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
  }

  public PurchaseCalculatorDepositAmountRequest depositSchedule(CalculatorDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public CalculatorDepositSchedule getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(CalculatorDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public PurchaseCalculatorDepositAmountRequest currentSavings(Float currentSavings) {
    this.currentSavings = currentSavings;
    return this;
  }

   /**
   * Get currentSavings
   * minimum: 0
   * @return currentSavings
  **/
  @ApiModelProperty(value = "")
  public Float getCurrentSavings() {
    return currentSavings;
  }

  public void setCurrentSavings(Float currentSavings) {
    this.currentSavings = currentSavings;
  }

  public PurchaseCalculatorDepositAmountRequest purchaseAmount(Float purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * Get purchaseAmount
   * minimum: 0
   * @return purchaseAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(Float purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public PurchaseCalculatorDepositAmountRequest inflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * Get inflationRate
   * minimum: -1
   * @return inflationRate
  **/
  @ApiModelProperty(value = "")
  public Float getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
  }

  public PurchaseCalculatorDepositAmountRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public PurchaseCalculatorDepositAmountRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
    if (this.aggregationAccountIds == null) {
      this.aggregationAccountIds = new ArrayList<UUID>();
    }
    this.aggregationAccountIds.add(aggregationAccountIdsItem);
    return this;
  }

   /**
   * Get aggregationAccountIds
   * @return aggregationAccountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAggregationAccountIds() {
    return aggregationAccountIds;
  }

  public void setAggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseCalculatorDepositAmountRequest purchaseCalculatorDepositAmountRequest = (PurchaseCalculatorDepositAmountRequest) o;
    return Objects.equals(this.accountIds, purchaseCalculatorDepositAmountRequest.accountIds) &&
        Objects.equals(this.horizonFrequencyInterval, purchaseCalculatorDepositAmountRequest.horizonFrequencyInterval) &&
        Objects.equals(this.purchaseHorizon, purchaseCalculatorDepositAmountRequest.purchaseHorizon) &&
        Objects.equals(this.investmentTax, purchaseCalculatorDepositAmountRequest.investmentTax) &&
        Objects.equals(this.portfolioReturn, purchaseCalculatorDepositAmountRequest.portfolioReturn) &&
        Objects.equals(this.depositSchedule, purchaseCalculatorDepositAmountRequest.depositSchedule) &&
        Objects.equals(this.currentSavings, purchaseCalculatorDepositAmountRequest.currentSavings) &&
        Objects.equals(this.purchaseAmount, purchaseCalculatorDepositAmountRequest.purchaseAmount) &&
        Objects.equals(this.inflationRate, purchaseCalculatorDepositAmountRequest.inflationRate) &&
        Objects.equals(this.aggregationAccountIds, purchaseCalculatorDepositAmountRequest.aggregationAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, horizonFrequencyInterval, purchaseHorizon, investmentTax, portfolioReturn, depositSchedule, currentSavings, purchaseAmount, inflationRate, aggregationAccountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCalculatorDepositAmountRequest {\n");
    
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    horizonFrequencyInterval: ").append(toIndentedString(horizonFrequencyInterval)).append("\n");
    sb.append("    purchaseHorizon: ").append(toIndentedString(purchaseHorizon)).append("\n");
    sb.append("    investmentTax: ").append(toIndentedString(investmentTax)).append("\n");
    sb.append("    portfolioReturn: ").append(toIndentedString(portfolioReturn)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    currentSavings: ").append(toIndentedString(currentSavings)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    aggregationAccountIds: ").append(toIndentedString(aggregationAccountIds)).append("\n");
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

