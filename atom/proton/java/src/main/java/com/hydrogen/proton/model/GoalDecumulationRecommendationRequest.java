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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * GoalDecumulationRecommendationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class GoalDecumulationRecommendationRequest {
  @SerializedName("recommendation_config")
  private RecommendationConfig1 recommendationConfig = null;

  @SerializedName("compounding_rate")
  private Float compoundingRate = 0.0f;

  /**
   * Gets or Sets recommendType
   */
  @JsonAdapter(RecommendTypeEnum.Adapter.class)
  public enum RecommendTypeEnum {
    RECURRING("recurring"),
    
    ONE_TIME("one-time"),
    
    COMBO("combo"),
    
    HORIZON("horizon");

    private String value;

    RecommendTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecommendTypeEnum fromValue(String text) {
      for (RecommendTypeEnum b : RecommendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecommendTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecommendTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecommendTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecommendTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recommend_type")
  private RecommendTypeEnum recommendType = RecommendTypeEnum.HORIZON;

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("n")
  private Integer n = 1000;

  @SerializedName("a_horizon")
  private Integer aHorizon = null;

  @SerializedName("p_risk")
  private List<Float> pRisk = new ArrayList<Float>();

  @SerializedName("remove_outliers")
  private Boolean removeOutliers = true;

  @SerializedName("adjust_for_compounding")
  private Boolean adjustForCompounding = false;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("conf_tgt")
  private Float confTgt = 0.9f;

  @SerializedName("trading_days_per_year")
  private Integer tradingDaysPerYear = 252;

  @SerializedName("thresh")
  private BigDecimal thresh = null;

  @SerializedName("withdrawal_tax")
  private Float withdrawalTax = 0.0f;

  @SerializedName("d_horizon")
  private Integer dHorizon = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  /**
   * Gets or Sets threshType
   */
  @JsonAdapter(ThreshTypeEnum.Adapter.class)
  public enum ThreshTypeEnum {
    AMNT("amnt"),
    
    PERC("perc");

    private String value;

    ThreshTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThreshTypeEnum fromValue(String text) {
      for (ThreshTypeEnum b : ThreshTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ThreshTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThreshTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThreshTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ThreshTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("thresh_type")
  private ThreshTypeEnum threshType = ThreshTypeEnum.PERC;

  /**
   * Gets or Sets horizonFrequency
   */
  @JsonAdapter(HorizonFrequencyEnum.Adapter.class)
  public enum HorizonFrequencyEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    HorizonFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizonFrequencyEnum fromValue(String text) {
      for (HorizonFrequencyEnum b : HorizonFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizonFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizonFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizonFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizonFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("horizon_frequency")
  private HorizonFrequencyEnum horizonFrequency = HorizonFrequencyEnum.YEAR;

  @SerializedName("withdrawal_config")
  private List<GoalWithdrawalConfig> withdrawalConfig = null;

  @SerializedName("curr_inv")
  private BigDecimal currInv = null;

  @SerializedName("deposit_config")
  private List<DecumulationGoalDepositConfig> depositConfig = null;

  @SerializedName("p_ret")
  private List<Float> pRet = new ArrayList<Float>();

  public GoalDecumulationRecommendationRequest recommendationConfig(RecommendationConfig1 recommendationConfig) {
    this.recommendationConfig = recommendationConfig;
    return this;
  }

   /**
   * Get recommendationConfig
   * @return recommendationConfig
  **/
  @ApiModelProperty(value = "")
  public RecommendationConfig1 getRecommendationConfig() {
    return recommendationConfig;
  }

  public void setRecommendationConfig(RecommendationConfig1 recommendationConfig) {
    this.recommendationConfig = recommendationConfig;
  }

  public GoalDecumulationRecommendationRequest compoundingRate(Float compoundingRate) {
    this.compoundingRate = compoundingRate;
    return this;
  }

   /**
   * Get compoundingRate
   * minimum: -1
   * @return compoundingRate
  **/
  @ApiModelProperty(value = "")
  public Float getCompoundingRate() {
    return compoundingRate;
  }

  public void setCompoundingRate(Float compoundingRate) {
    this.compoundingRate = compoundingRate;
  }

  public GoalDecumulationRecommendationRequest recommendType(RecommendTypeEnum recommendType) {
    this.recommendType = recommendType;
    return this;
  }

   /**
   * Get recommendType
   * @return recommendType
  **/
  @ApiModelProperty(value = "")
  public RecommendTypeEnum getRecommendType() {
    return recommendType;
  }

  public void setRecommendType(RecommendTypeEnum recommendType) {
    this.recommendType = recommendType;
  }

  public GoalDecumulationRecommendationRequest createLog(Boolean createLog) {
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

  public GoalDecumulationRecommendationRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * minimum: 1
   * maximum: 10000
   * @return n
  **/
  @ApiModelProperty(value = "")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public GoalDecumulationRecommendationRequest aHorizon(Integer aHorizon) {
    this.aHorizon = aHorizon;
    return this;
  }

   /**
   * Get aHorizon
   * minimum: 0
   * maximum: 350
   * @return aHorizon
  **/
  @ApiModelProperty(value = "")
  public Integer getAHorizon() {
    return aHorizon;
  }

  public void setAHorizon(Integer aHorizon) {
    this.aHorizon = aHorizon;
  }

  public GoalDecumulationRecommendationRequest pRisk(List<Float> pRisk) {
    this.pRisk = pRisk;
    return this;
  }

  public GoalDecumulationRecommendationRequest addPRiskItem(Float pRiskItem) {
    this.pRisk.add(pRiskItem);
    return this;
  }

   /**
   * Get pRisk
   * @return pRisk
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Float> getPRisk() {
    return pRisk;
  }

  public void setPRisk(List<Float> pRisk) {
    this.pRisk = pRisk;
  }

  public GoalDecumulationRecommendationRequest removeOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
    return this;
  }

   /**
   * Get removeOutliers
   * @return removeOutliers
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoveOutliers() {
    return removeOutliers;
  }

  public void setRemoveOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
  }

  public GoalDecumulationRecommendationRequest adjustForCompounding(Boolean adjustForCompounding) {
    this.adjustForCompounding = adjustForCompounding;
    return this;
  }

   /**
   * Get adjustForCompounding
   * @return adjustForCompounding
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustForCompounding() {
    return adjustForCompounding;
  }

  public void setAdjustForCompounding(Boolean adjustForCompounding) {
    this.adjustForCompounding = adjustForCompounding;
  }

  public GoalDecumulationRecommendationRequest goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * Get goalId
   * @return goalId
  **/
  @ApiModelProperty(value = "")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public GoalDecumulationRecommendationRequest confTgt(Float confTgt) {
    this.confTgt = confTgt;
    return this;
  }

   /**
   * Get confTgt
   * minimum: 0
   * maximum: 1
   * @return confTgt
  **/
  @ApiModelProperty(value = "")
  public Float getConfTgt() {
    return confTgt;
  }

  public void setConfTgt(Float confTgt) {
    this.confTgt = confTgt;
  }

  public GoalDecumulationRecommendationRequest tradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
    return this;
  }

   /**
   * Get tradingDaysPerYear
   * minimum: 1
   * maximum: 365
   * @return tradingDaysPerYear
  **/
  @ApiModelProperty(value = "")
  public Integer getTradingDaysPerYear() {
    return tradingDaysPerYear;
  }

  public void setTradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
  }

  public GoalDecumulationRecommendationRequest thresh(BigDecimal thresh) {
    this.thresh = thresh;
    return this;
  }

   /**
   * Get thresh
   * minimum: 0
   * @return thresh
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getThresh() {
    return thresh;
  }

  public void setThresh(BigDecimal thresh) {
    this.thresh = thresh;
  }

  public GoalDecumulationRecommendationRequest withdrawalTax(Float withdrawalTax) {
    this.withdrawalTax = withdrawalTax;
    return this;
  }

   /**
   * Get withdrawalTax
   * minimum: 0
   * maximum: 1
   * @return withdrawalTax
  **/
  @ApiModelProperty(value = "")
  public Float getWithdrawalTax() {
    return withdrawalTax;
  }

  public void setWithdrawalTax(Float withdrawalTax) {
    this.withdrawalTax = withdrawalTax;
  }

  public GoalDecumulationRecommendationRequest dHorizon(Integer dHorizon) {
    this.dHorizon = dHorizon;
    return this;
  }

   /**
   * Get dHorizon
   * minimum: 0
   * maximum: 350
   * @return dHorizon
  **/
  @ApiModelProperty(value = "")
  public Integer getDHorizon() {
    return dHorizon;
  }

  public void setDHorizon(Integer dHorizon) {
    this.dHorizon = dHorizon;
  }

  public GoalDecumulationRecommendationRequest clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public GoalDecumulationRecommendationRequest threshType(ThreshTypeEnum threshType) {
    this.threshType = threshType;
    return this;
  }

   /**
   * Get threshType
   * @return threshType
  **/
  @ApiModelProperty(value = "")
  public ThreshTypeEnum getThreshType() {
    return threshType;
  }

  public void setThreshType(ThreshTypeEnum threshType) {
    this.threshType = threshType;
  }

  public GoalDecumulationRecommendationRequest horizonFrequency(HorizonFrequencyEnum horizonFrequency) {
    this.horizonFrequency = horizonFrequency;
    return this;
  }

   /**
   * Get horizonFrequency
   * @return horizonFrequency
  **/
  @ApiModelProperty(value = "")
  public HorizonFrequencyEnum getHorizonFrequency() {
    return horizonFrequency;
  }

  public void setHorizonFrequency(HorizonFrequencyEnum horizonFrequency) {
    this.horizonFrequency = horizonFrequency;
  }

  public GoalDecumulationRecommendationRequest withdrawalConfig(List<GoalWithdrawalConfig> withdrawalConfig) {
    this.withdrawalConfig = withdrawalConfig;
    return this;
  }

  public GoalDecumulationRecommendationRequest addWithdrawalConfigItem(GoalWithdrawalConfig withdrawalConfigItem) {
    if (this.withdrawalConfig == null) {
      this.withdrawalConfig = new ArrayList<GoalWithdrawalConfig>();
    }
    this.withdrawalConfig.add(withdrawalConfigItem);
    return this;
  }

   /**
   * Get withdrawalConfig
   * @return withdrawalConfig
  **/
  @ApiModelProperty(value = "")
  public List<GoalWithdrawalConfig> getWithdrawalConfig() {
    return withdrawalConfig;
  }

  public void setWithdrawalConfig(List<GoalWithdrawalConfig> withdrawalConfig) {
    this.withdrawalConfig = withdrawalConfig;
  }

  public GoalDecumulationRecommendationRequest currInv(BigDecimal currInv) {
    this.currInv = currInv;
    return this;
  }

   /**
   * Get currInv
   * minimum: 0
   * @return currInv
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrInv() {
    return currInv;
  }

  public void setCurrInv(BigDecimal currInv) {
    this.currInv = currInv;
  }

  public GoalDecumulationRecommendationRequest depositConfig(List<DecumulationGoalDepositConfig> depositConfig) {
    this.depositConfig = depositConfig;
    return this;
  }

  public GoalDecumulationRecommendationRequest addDepositConfigItem(DecumulationGoalDepositConfig depositConfigItem) {
    if (this.depositConfig == null) {
      this.depositConfig = new ArrayList<DecumulationGoalDepositConfig>();
    }
    this.depositConfig.add(depositConfigItem);
    return this;
  }

   /**
   * Get depositConfig
   * @return depositConfig
  **/
  @ApiModelProperty(value = "")
  public List<DecumulationGoalDepositConfig> getDepositConfig() {
    return depositConfig;
  }

  public void setDepositConfig(List<DecumulationGoalDepositConfig> depositConfig) {
    this.depositConfig = depositConfig;
  }

  public GoalDecumulationRecommendationRequest pRet(List<Float> pRet) {
    this.pRet = pRet;
    return this;
  }

  public GoalDecumulationRecommendationRequest addPRetItem(Float pRetItem) {
    this.pRet.add(pRetItem);
    return this;
  }

   /**
   * Get pRet
   * @return pRet
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Float> getPRet() {
    return pRet;
  }

  public void setPRet(List<Float> pRet) {
    this.pRet = pRet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalDecumulationRecommendationRequest goalDecumulationRecommendationRequest = (GoalDecumulationRecommendationRequest) o;
    return Objects.equals(this.recommendationConfig, goalDecumulationRecommendationRequest.recommendationConfig) &&
        Objects.equals(this.compoundingRate, goalDecumulationRecommendationRequest.compoundingRate) &&
        Objects.equals(this.recommendType, goalDecumulationRecommendationRequest.recommendType) &&
        Objects.equals(this.createLog, goalDecumulationRecommendationRequest.createLog) &&
        Objects.equals(this.n, goalDecumulationRecommendationRequest.n) &&
        Objects.equals(this.aHorizon, goalDecumulationRecommendationRequest.aHorizon) &&
        Objects.equals(this.pRisk, goalDecumulationRecommendationRequest.pRisk) &&
        Objects.equals(this.removeOutliers, goalDecumulationRecommendationRequest.removeOutliers) &&
        Objects.equals(this.adjustForCompounding, goalDecumulationRecommendationRequest.adjustForCompounding) &&
        Objects.equals(this.goalId, goalDecumulationRecommendationRequest.goalId) &&
        Objects.equals(this.confTgt, goalDecumulationRecommendationRequest.confTgt) &&
        Objects.equals(this.tradingDaysPerYear, goalDecumulationRecommendationRequest.tradingDaysPerYear) &&
        Objects.equals(this.thresh, goalDecumulationRecommendationRequest.thresh) &&
        Objects.equals(this.withdrawalTax, goalDecumulationRecommendationRequest.withdrawalTax) &&
        Objects.equals(this.dHorizon, goalDecumulationRecommendationRequest.dHorizon) &&
        Objects.equals(this.clientId, goalDecumulationRecommendationRequest.clientId) &&
        Objects.equals(this.threshType, goalDecumulationRecommendationRequest.threshType) &&
        Objects.equals(this.horizonFrequency, goalDecumulationRecommendationRequest.horizonFrequency) &&
        Objects.equals(this.withdrawalConfig, goalDecumulationRecommendationRequest.withdrawalConfig) &&
        Objects.equals(this.currInv, goalDecumulationRecommendationRequest.currInv) &&
        Objects.equals(this.depositConfig, goalDecumulationRecommendationRequest.depositConfig) &&
        Objects.equals(this.pRet, goalDecumulationRecommendationRequest.pRet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationConfig, compoundingRate, recommendType, createLog, n, aHorizon, pRisk, removeOutliers, adjustForCompounding, goalId, confTgt, tradingDaysPerYear, thresh, withdrawalTax, dHorizon, clientId, threshType, horizonFrequency, withdrawalConfig, currInv, depositConfig, pRet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalDecumulationRecommendationRequest {\n");
    
    sb.append("    recommendationConfig: ").append(toIndentedString(recommendationConfig)).append("\n");
    sb.append("    compoundingRate: ").append(toIndentedString(compoundingRate)).append("\n");
    sb.append("    recommendType: ").append(toIndentedString(recommendType)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    aHorizon: ").append(toIndentedString(aHorizon)).append("\n");
    sb.append("    pRisk: ").append(toIndentedString(pRisk)).append("\n");
    sb.append("    removeOutliers: ").append(toIndentedString(removeOutliers)).append("\n");
    sb.append("    adjustForCompounding: ").append(toIndentedString(adjustForCompounding)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    confTgt: ").append(toIndentedString(confTgt)).append("\n");
    sb.append("    tradingDaysPerYear: ").append(toIndentedString(tradingDaysPerYear)).append("\n");
    sb.append("    thresh: ").append(toIndentedString(thresh)).append("\n");
    sb.append("    withdrawalTax: ").append(toIndentedString(withdrawalTax)).append("\n");
    sb.append("    dHorizon: ").append(toIndentedString(dHorizon)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    threshType: ").append(toIndentedString(threshType)).append("\n");
    sb.append("    horizonFrequency: ").append(toIndentedString(horizonFrequency)).append("\n");
    sb.append("    withdrawalConfig: ").append(toIndentedString(withdrawalConfig)).append("\n");
    sb.append("    currInv: ").append(toIndentedString(currInv)).append("\n");
    sb.append("    depositConfig: ").append(toIndentedString(depositConfig)).append("\n");
    sb.append("    pRet: ").append(toIndentedString(pRet)).append("\n");
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

