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
import java.util.UUID;

/**
 * ScorePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class ScorePayload {
  /**
   * The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score
   */
  @JsonAdapter(ScoreTypeEnum.Adapter.class)
  public enum ScoreTypeEnum {
    RISK_SCORE("risk_score"),
    
    DIMENSIONAL_RISK_SCORE("dimensional_risk_score"),
    
    DIVERSIFICATION_SCORE("diversification_score"),
    
    PORTFOLIO_OPTIMIZATION_SCORE("portfolio_optimization_score"),
    
    GOAL_ACHIEVEMENT_SCORE("goal_achievement_score"),
    
    CREDIT_SCORE("credit_score");

    private String value;

    ScoreTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScoreTypeEnum fromValue(String text) {
      for (ScoreTypeEnum b : ScoreTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScoreTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScoreTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScoreTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScoreTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("score_type")
  private ScoreTypeEnum scoreType = null;

  @SerializedName("score_value")
  private String scoreValue = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("benchmark_id")
  private UUID benchmarkId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("score_time_stamp")
  private String scoreTimeStamp = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public ScorePayload scoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
    return this;
  }

   /**
   * The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score
   * @return scoreType
  **/
  @ApiModelProperty(required = true, value = "The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score")
  public ScoreTypeEnum getScoreType() {
    return scoreType;
  }

  public void setScoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
  }

  public ScorePayload scoreValue(String scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

   /**
   * The value of the score, which may be a number, a label, etc.
   * @return scoreValue
  **/
  @ApiModelProperty(required = true, value = "The value of the score, which may be a number, a label, etc.")
  public String getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(String scoreValue) {
    this.scoreValue = scoreValue;
  }

  public ScorePayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of a client to which the score applies (if client-specific)
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID of a client to which the score applies (if client-specific)")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public ScorePayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of an account to which the score applies (if account-specific)
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of an account to which the score applies (if account-specific)")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public ScorePayload portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The ID of a portfolio to which the score applies (if portfolio-specific)
   * @return portfolioId
  **/
  @ApiModelProperty(value = "The ID of a portfolio to which the score applies (if portfolio-specific)")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public ScorePayload goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * The ID of a goal to which the score applies (if goal-specific)
   * @return goalId
  **/
  @ApiModelProperty(value = "The ID of a goal to which the score applies (if goal-specific)")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public ScorePayload allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * The ID of an allocation to which the score applies (if allocation-specific)
   * @return allocationId
  **/
  @ApiModelProperty(value = "The ID of an allocation to which the score applies (if allocation-specific)")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public ScorePayload modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of a model to which the score applies (if model-specific)
   * @return modelId
  **/
  @ApiModelProperty(value = "The ID of a model to which the score applies (if model-specific)")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public ScorePayload benchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

   /**
   * The ID of a benchmark to which the score applies (if benchmark-specific)
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The ID of a benchmark to which the score applies (if benchmark-specific)")
  public UUID getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public ScorePayload securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of a security to which the score applies (if security-specific)
   * @return securityId
  **/
  @ApiModelProperty(value = "The ID of a security to which the score applies (if security-specific)")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public ScorePayload scoreTimeStamp(String scoreTimeStamp) {
    this.scoreTimeStamp = scoreTimeStamp;
    return this;
  }

   /**
   * Date and time for the score
   * @return scoreTimeStamp
  **/
  @ApiModelProperty(value = "Date and time for the score")
  public String getScoreTimeStamp() {
    return scoreTimeStamp;
  }

  public void setScoreTimeStamp(String scoreTimeStamp) {
    this.scoreTimeStamp = scoreTimeStamp;
  }

  public ScorePayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the score in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the score in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ScorePayload secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorePayload scorePayload = (ScorePayload) o;
    return Objects.equals(this.scoreType, scorePayload.scoreType) &&
        Objects.equals(this.scoreValue, scorePayload.scoreValue) &&
        Objects.equals(this.clientId, scorePayload.clientId) &&
        Objects.equals(this.accountId, scorePayload.accountId) &&
        Objects.equals(this.portfolioId, scorePayload.portfolioId) &&
        Objects.equals(this.goalId, scorePayload.goalId) &&
        Objects.equals(this.allocationId, scorePayload.allocationId) &&
        Objects.equals(this.modelId, scorePayload.modelId) &&
        Objects.equals(this.benchmarkId, scorePayload.benchmarkId) &&
        Objects.equals(this.securityId, scorePayload.securityId) &&
        Objects.equals(this.scoreTimeStamp, scorePayload.scoreTimeStamp) &&
        Objects.equals(this.metadata, scorePayload.metadata) &&
        Objects.equals(this.secondaryId, scorePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoreType, scoreValue, clientId, accountId, portfolioId, goalId, allocationId, modelId, benchmarkId, securityId, scoreTimeStamp, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorePayload {\n");
    
    sb.append("    scoreType: ").append(toIndentedString(scoreType)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    scoreTimeStamp: ").append(toIndentedString(scoreTimeStamp)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

