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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Score Object
 */
@ApiModel(description = "Score Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Score {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("benchmark_id")
  private UUID benchmarkId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("score_time_stamp")
  private OffsetDateTime scoreTimeStamp = null;

  /**
   * scoreType
   */
  @JsonAdapter(ScoreTypeEnum.Adapter.class)
  public enum ScoreTypeEnum {
    GOAL_ACHIEVEMENT_SCORE("goal_achievement_score"),
    
    PORTFOLIO_OPTIMIZATION_SCORE("portfolio_optimization_score"),
    
    CREDIT_SCORE("credit_score"),
    
    DIMENSIONAL_RISK_SCORE("dimensional_risk_score"),
    
    DIVERSIFICATION_SCORE("diversification_score"),
    
    RISK_SCORE("risk_score"),
    
    RISK_PROFILE("risk_profile");

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

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Score accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Score allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * allocationId
   * @return allocationId
  **/
  @ApiModelProperty(example = "04907eaa-3f33-49be-a35b-378cdf639fba", value = "allocationId")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public Score benchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

   /**
   * benchmarkId
   * @return benchmarkId
  **/
  @ApiModelProperty(example = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf", value = "benchmarkId")
  public UUID getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public Score clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Score createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Score goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * goalId
   * @return goalId
  **/
  @ApiModelProperty(example = "739ecd39-e1ae-4a0b-b266-dd3ddc616163", value = "goalId")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public Score id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Score metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Score putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Score modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public Score portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "c34794e9-f927-468b-b47e-ea17c3d533c5", value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public Score scoreTimeStamp(OffsetDateTime scoreTimeStamp) {
    this.scoreTimeStamp = scoreTimeStamp;
    return this;
  }

   /**
   * Get scoreTimeStamp
   * @return scoreTimeStamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getScoreTimeStamp() {
    return scoreTimeStamp;
  }

  public void setScoreTimeStamp(OffsetDateTime scoreTimeStamp) {
    this.scoreTimeStamp = scoreTimeStamp;
  }

  public Score scoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
    return this;
  }

   /**
   * scoreType
   * @return scoreType
  **/
  @ApiModelProperty(example = "risk_score", required = true, value = "scoreType")
  public ScoreTypeEnum getScoreType() {
    return scoreType;
  }

  public void setScoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
  }

  public Score scoreValue(String scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

   /**
   * scoreValue
   * @return scoreValue
  **/
  @ApiModelProperty(example = "0", required = true, value = "scoreValue")
  public String getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(String scoreValue) {
    this.scoreValue = scoreValue;
  }

  public Score secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public Score securityId(UUID securityId) {
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

  public Score updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.accountId, score.accountId) &&
        Objects.equals(this.allocationId, score.allocationId) &&
        Objects.equals(this.benchmarkId, score.benchmarkId) &&
        Objects.equals(this.clientId, score.clientId) &&
        Objects.equals(this.createDate, score.createDate) &&
        Objects.equals(this.goalId, score.goalId) &&
        Objects.equals(this.id, score.id) &&
        Objects.equals(this.metadata, score.metadata) &&
        Objects.equals(this.modelId, score.modelId) &&
        Objects.equals(this.portfolioId, score.portfolioId) &&
        Objects.equals(this.scoreTimeStamp, score.scoreTimeStamp) &&
        Objects.equals(this.scoreType, score.scoreType) &&
        Objects.equals(this.scoreValue, score.scoreValue) &&
        Objects.equals(this.secondaryId, score.secondaryId) &&
        Objects.equals(this.securityId, score.securityId) &&
        Objects.equals(this.updateDate, score.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allocationId, benchmarkId, clientId, createDate, goalId, id, metadata, modelId, portfolioId, scoreTimeStamp, scoreType, scoreValue, secondaryId, securityId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    scoreTimeStamp: ").append(toIndentedString(scoreTimeStamp)).append("\n");
    sb.append("    scoreType: ").append(toIndentedString(scoreType)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

