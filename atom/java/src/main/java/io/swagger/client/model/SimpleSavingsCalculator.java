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
import io.swagger.client.model.DepositSchedule;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SimpleSavingsCalculator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SimpleSavingsCalculator {
  @SerializedName("initial_balance")
  private BigDecimal initialBalance = null;

  @SerializedName("horizon")
  private Integer horizon = null;

  @SerializedName("return_schedule")
  private List<BigDecimal> returnSchedule = new ArrayList<BigDecimal>();

  /**
   * The frequency interval for the horizon
   */
  @JsonAdapter(HorizonFrequencyIntervalEnum.Adapter.class)
  public enum HorizonFrequencyIntervalEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week"),
    
    DAY("day");

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

  @SerializedName("deposit_schedule")
  private List<DepositSchedule> depositSchedule = null;

  @SerializedName("tax_rate")
  private BigDecimal taxRate = null;

  @SerializedName("inflation_rate")
  private BigDecimal inflationRate = null;

  public SimpleSavingsCalculator initialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * The initial savings balance
   * minimum: 0
   * @return initialBalance
  **/
  @ApiModelProperty(required = true, value = "The initial savings balance")
  public BigDecimal getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
  }

  public SimpleSavingsCalculator horizon(Integer horizon) {
    this.horizon = horizon;
    return this;
  }

   /**
   * The savings horizon
   * minimum: 0
   * @return horizon
  **/
  @ApiModelProperty(required = true, value = "The savings horizon")
  public Integer getHorizon() {
    return horizon;
  }

  public void setHorizon(Integer horizon) {
    this.horizon = horizon;
  }

  public SimpleSavingsCalculator returnSchedule(List<BigDecimal> returnSchedule) {
    this.returnSchedule = returnSchedule;
    return this;
  }

  public SimpleSavingsCalculator addReturnScheduleItem(BigDecimal returnScheduleItem) {
    this.returnSchedule.add(returnScheduleItem);
    return this;
  }

   /**
   * The return schedule for the given horizon
   * @return returnSchedule
  **/
  @ApiModelProperty(required = true, value = "The return schedule for the given horizon")
  public List<BigDecimal> getReturnSchedule() {
    return returnSchedule;
  }

  public void setReturnSchedule(List<BigDecimal> returnSchedule) {
    this.returnSchedule = returnSchedule;
  }

  public SimpleSavingsCalculator horizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
    return this;
  }

   /**
   * The frequency interval for the horizon
   * @return horizonFrequencyInterval
  **/
  @ApiModelProperty(value = "The frequency interval for the horizon")
  public HorizonFrequencyIntervalEnum getHorizonFrequencyInterval() {
    return horizonFrequencyInterval;
  }

  public void setHorizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
    this.horizonFrequencyInterval = horizonFrequencyInterval;
  }

  public SimpleSavingsCalculator depositSchedule(List<DepositSchedule> depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

  public SimpleSavingsCalculator addDepositScheduleItem(DepositSchedule depositScheduleItem) {
    if (this.depositSchedule == null) {
      this.depositSchedule = new ArrayList<DepositSchedule>();
    }
    this.depositSchedule.add(depositScheduleItem);
    return this;
  }

   /**
   * The deposit schedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "The deposit schedule")
  public List<DepositSchedule> getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(List<DepositSchedule> depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public SimpleSavingsCalculator taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The tax rate to be applied to investment earnings
   * minimum: 0
   * maximum: 1
   * @return taxRate
  **/
  @ApiModelProperty(value = "The tax rate to be applied to investment earnings")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public SimpleSavingsCalculator inflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * The inflation rate
   * minimum: -1
   * maximum: 20
   * @return inflationRate
  **/
  @ApiModelProperty(value = "The inflation rate")
  public BigDecimal getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(BigDecimal inflationRate) {
    this.inflationRate = inflationRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleSavingsCalculator simpleSavingsCalculator = (SimpleSavingsCalculator) o;
    return Objects.equals(this.initialBalance, simpleSavingsCalculator.initialBalance) &&
        Objects.equals(this.horizon, simpleSavingsCalculator.horizon) &&
        Objects.equals(this.returnSchedule, simpleSavingsCalculator.returnSchedule) &&
        Objects.equals(this.horizonFrequencyInterval, simpleSavingsCalculator.horizonFrequencyInterval) &&
        Objects.equals(this.depositSchedule, simpleSavingsCalculator.depositSchedule) &&
        Objects.equals(this.taxRate, simpleSavingsCalculator.taxRate) &&
        Objects.equals(this.inflationRate, simpleSavingsCalculator.inflationRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialBalance, horizon, returnSchedule, horizonFrequencyInterval, depositSchedule, taxRate, inflationRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleSavingsCalculator {\n");
    
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("    horizon: ").append(toIndentedString(horizon)).append("\n");
    sb.append("    returnSchedule: ").append(toIndentedString(returnSchedule)).append("\n");
    sb.append("    horizonFrequencyInterval: ").append(toIndentedString(horizonFrequencyInterval)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
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

