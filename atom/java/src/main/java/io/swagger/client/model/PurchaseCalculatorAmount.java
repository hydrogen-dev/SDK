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
import io.swagger.client.model.DepositScheduleMajorPurchaseDepAmt;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PurchaseCalculatorAmount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class PurchaseCalculatorAmount {
  @SerializedName("purchase_horizon")
  private Integer purchaseHorizon = null;

  @SerializedName("portfolio_return")
  private BigDecimal portfolioReturn = null;

  /**
   * The horizon frequency interval
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

  @SerializedName("current_savings")
  private BigDecimal currentSavings = null;

  @SerializedName("deposit_schedule")
  private DepositScheduleMajorPurchaseDepAmt depositSchedule = null;

  @SerializedName("inflation_rate")
  private BigDecimal inflationRate = null;

  @SerializedName("investment_tax")
  private BigDecimal investmentTax = null;

  public PurchaseCalculatorAmount purchaseHorizon(Integer purchaseHorizon) {
    this.purchaseHorizon = purchaseHorizon;
    return this;
  }

   /**
   * The purchase horizon, in years
   * minimum: 0
   * @return purchaseHorizon
  **/
  @ApiModelProperty(required = true, value = "The purchase horizon, in years")
  public Integer getPurchaseHorizon() {
    return purchaseHorizon;
  }

  public void setPurchaseHorizon(Integer purchaseHorizon) {
    this.purchaseHorizon = purchaseHorizon;
  }

  public PurchaseCalculatorAmount portfolioReturn(BigDecimal portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
    return this;
  }

   /**
   * The annualized portfolio return
   * minimum: -1
   * @return portfolioReturn
  **/
  @ApiModelProperty(required = true, value = "The annualized portfolio return")
  public BigDecimal getPortfolioReturn() {
    return portfolioReturn;
  }

  public void setPortfolioReturn(BigDecimal portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
  }

  public PurchaseCalculatorAmount horizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
    return this;
  }

   /**
   * The horizon frequency interval
   * @return horizonFrequencyInterval
  **/
  @ApiModelProperty(value = "The horizon frequency interval")
  public HorizonFrequencyIntervalEnum getHorizonFrequencyInterval() {
    return horizonFrequencyInterval;
  }

  public void setHorizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
  }

  public PurchaseCalculatorAmount currentSavings(BigDecimal currentSavings) {
    this.currentSavings = currentSavings;
    return this;
  }

   /**
   * The current savings amount
   * minimum: 0
   * @return currentSavings
  **/
  @ApiModelProperty(value = "The current savings amount")
  public BigDecimal getCurrentSavings() {
    return currentSavings;
  }

  public void setCurrentSavings(BigDecimal currentSavings) {
    this.currentSavings = currentSavings;
  }

  public PurchaseCalculatorAmount depositSchedule(DepositScheduleMajorPurchaseDepAmt depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public DepositScheduleMajorPurchaseDepAmt getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(DepositScheduleMajorPurchaseDepAmt depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public PurchaseCalculatorAmount inflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * The inflation rate
   * minimum: -1
   * @return inflationRate
  **/
  @ApiModelProperty(value = "The inflation rate")
  public BigDecimal getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
  }

  public PurchaseCalculatorAmount investmentTax(BigDecimal investmentTax) {
    this.investmentTax = investmentTax;
    return this;
  }

   /**
   * The tax on investments used for the major purchase
   * minimum: 0
   * maximum: 1
   * @return investmentTax
  **/
  @ApiModelProperty(value = "The tax on investments used for the major purchase")
  public BigDecimal getInvestmentTax() {
    return investmentTax;
  }

  public void setInvestmentTax(BigDecimal investmentTax) {
    this.investmentTax = investmentTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseCalculatorAmount purchaseCalculatorAmount = (PurchaseCalculatorAmount) o;
    return Objects.equals(this.purchaseHorizon, purchaseCalculatorAmount.purchaseHorizon) &&
        Objects.equals(this.portfolioReturn, purchaseCalculatorAmount.portfolioReturn) &&
        Objects.equals(this.horizonFrequencyInterval, purchaseCalculatorAmount.horizonFrequencyInterval) &&
        Objects.equals(this.currentSavings, purchaseCalculatorAmount.currentSavings) &&
        Objects.equals(this.depositSchedule, purchaseCalculatorAmount.depositSchedule) &&
        Objects.equals(this.inflationRate, purchaseCalculatorAmount.inflationRate) &&
        Objects.equals(this.investmentTax, purchaseCalculatorAmount.investmentTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseHorizon, portfolioReturn, horizonFrequencyInterval, currentSavings, depositSchedule, inflationRate, investmentTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCalculatorAmount {\n");
    
    sb.append("    purchaseHorizon: ").append(toIndentedString(purchaseHorizon)).append("\n");
    sb.append("    portfolioReturn: ").append(toIndentedString(portfolioReturn)).append("\n");
    sb.append("    horizonFrequencyInterval: ").append(toIndentedString(horizonFrequencyInterval)).append("\n");
    sb.append("    currentSavings: ").append(toIndentedString(currentSavings)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    investmentTax: ").append(toIndentedString(investmentTax)).append("\n");
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

