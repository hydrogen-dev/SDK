/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SavingsCalculatorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class SavingsCalculatorRequest {
  @SerializedName("inflation_rate")
  private Float inflationRate = 0.0f;

  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  @SerializedName("tax_rate")
  private Float taxRate = 0.0f;

  /**
   * Gets or Sets horizonFrequencyInterval
   */
  @JsonAdapter(HorizonFrequencyIntervalEnum.Adapter.class)
  public enum HorizonFrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
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
  private List<SavingsDepositSchedule> depositSchedule = null;

  @SerializedName("horizon")
  private Integer horizon = null;

  @SerializedName("return_schedule")
  private List<Float> returnSchedule = new ArrayList<Float>();

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("initial_balance")
  private BigDecimal initialBalance = null;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  public SavingsCalculatorRequest inflationRate(Float inflationRate) {
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

  public SavingsCalculatorRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public SavingsCalculatorRequest addAccountIdsItem(UUID accountIdsItem) {
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

  public SavingsCalculatorRequest taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * minimum: 0
   * maximum: 1
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public SavingsCalculatorRequest horizonFrequencyInterval(HorizonFrequencyIntervalEnum horizonFrequencyInterval) {
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

  public SavingsCalculatorRequest depositSchedule(List<SavingsDepositSchedule> depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

  public SavingsCalculatorRequest addDepositScheduleItem(SavingsDepositSchedule depositScheduleItem) {
    if (this.depositSchedule == null) {
      this.depositSchedule = new ArrayList<SavingsDepositSchedule>();
    }
    this.depositSchedule.add(depositScheduleItem);
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public List<SavingsDepositSchedule> getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(List<SavingsDepositSchedule> depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public SavingsCalculatorRequest horizon(Integer horizon) {
    this.horizon = horizon;
    return this;
  }

   /**
   * Get horizon
   * minimum: 0
   * @return horizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHorizon() {
    return horizon;
  }

  public void setHorizon(Integer horizon) {
    this.horizon = horizon;
  }

  public SavingsCalculatorRequest returnSchedule(List<Float> returnSchedule) {
    this.returnSchedule = returnSchedule;
    return this;
  }

  public SavingsCalculatorRequest addReturnScheduleItem(Float returnScheduleItem) {
    this.returnSchedule.add(returnScheduleItem);
    return this;
  }

   /**
   * Get returnSchedule
   * @return returnSchedule
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Float> getReturnSchedule() {
    return returnSchedule;
  }

  public void setReturnSchedule(List<Float> returnSchedule) {
    this.returnSchedule = returnSchedule;
  }

  public SavingsCalculatorRequest createLog(Boolean createLog) {
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

  public SavingsCalculatorRequest initialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * Get initialBalance
   * minimum: 0
   * @return initialBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
  }

  public SavingsCalculatorRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public SavingsCalculatorRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
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
    SavingsCalculatorRequest savingsCalculatorRequest = (SavingsCalculatorRequest) o;
    return Objects.equals(this.inflationRate, savingsCalculatorRequest.inflationRate) &&
        Objects.equals(this.accountIds, savingsCalculatorRequest.accountIds) &&
        Objects.equals(this.taxRate, savingsCalculatorRequest.taxRate) &&
        Objects.equals(this.horizonFrequencyInterval, savingsCalculatorRequest.horizonFrequencyInterval) &&
        Objects.equals(this.depositSchedule, savingsCalculatorRequest.depositSchedule) &&
        Objects.equals(this.horizon, savingsCalculatorRequest.horizon) &&
        Objects.equals(this.returnSchedule, savingsCalculatorRequest.returnSchedule) &&
        Objects.equals(this.createLog, savingsCalculatorRequest.createLog) &&
        Objects.equals(this.initialBalance, savingsCalculatorRequest.initialBalance) &&
        Objects.equals(this.aggregationAccountIds, savingsCalculatorRequest.aggregationAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflationRate, accountIds, taxRate, horizonFrequencyInterval, depositSchedule, horizon, returnSchedule, createLog, initialBalance, aggregationAccountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingsCalculatorRequest {\n");
    
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    horizonFrequencyInterval: ").append(toIndentedString(horizonFrequencyInterval)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    horizon: ").append(toIndentedString(horizon)).append("\n");
    sb.append("    returnSchedule: ").append(toIndentedString(returnSchedule)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
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

