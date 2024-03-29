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
import com.hydrogen.nucleus.model.GoalTrackAccounts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Goal Simulation Result Object
 */
@ApiModel(description = "Goal Simulation Result Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class GoalTrack {
  @SerializedName("accounts")
  private List<GoalTrackAccounts> accounts = null;

  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("current_investment")
  private Double currentInvestment = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  @SerializedName("goal_achievement_score")
  private Double goalAchievementScore = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("goal_probability")
  private Double goalProbability = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("on_track")
  private Boolean onTrack = null;

  @SerializedName("progress")
  private Double progress = null;

  @SerializedName("projection_balance")
  private Double projectionBalance = null;

  @SerializedName("projection_date")
  private LocalDate projectionDate = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("status_time_stamp")
  private OffsetDateTime statusTimeStamp = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public GoalTrack accounts(List<GoalTrackAccounts> accounts) {
    this.accounts = accounts;
    return this;
  }

  public GoalTrack addAccountsItem(GoalTrackAccounts accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<GoalTrackAccounts>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public List<GoalTrackAccounts> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<GoalTrackAccounts> accounts) {
    this.accounts = accounts;
  }

  public GoalTrack accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * accumulationHorizon
   * @return accumulationHorizon
  **/
  @ApiModelProperty(example = "10.2", value = "accumulationHorizon")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public GoalTrack clientId(UUID clientId) {
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

  public GoalTrack createDate(OffsetDateTime createDate) {
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

  public GoalTrack currentInvestment(Double currentInvestment) {
    this.currentInvestment = currentInvestment;
    return this;
  }

   /**
   * currentInvestment
   * @return currentInvestment
  **/
  @ApiModelProperty(example = "10.2", value = "currentInvestment")
  public Double getCurrentInvestment() {
    return currentInvestment;
  }

  public void setCurrentInvestment(Double currentInvestment) {
    this.currentInvestment = currentInvestment;
  }

  public GoalTrack decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * decumulationHorizon
   * @return decumulationHorizon
  **/
  @ApiModelProperty(example = "10.2", value = "decumulationHorizon")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public GoalTrack goalAchievementScore(Double goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
    return this;
  }

   /**
   * goalAchievementScore
   * @return goalAchievementScore
  **/
  @ApiModelProperty(example = "0.9", value = "goalAchievementScore")
  public Double getGoalAchievementScore() {
    return goalAchievementScore;
  }

  public void setGoalAchievementScore(Double goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
  }

  public GoalTrack goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * goalAmount
   * @return goalAmount
  **/
  @ApiModelProperty(example = "0.9", value = "goalAmount")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public GoalTrack goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * goalId
   * @return goalId
  **/
  @ApiModelProperty(example = "9a1c0a9f-c699-46a2-9710-8b2abe10526c", required = true, value = "goalId")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public GoalTrack goalProbability(Double goalProbability) {
    this.goalProbability = goalProbability;
    return this;
  }

   /**
   * goalProbability
   * @return goalProbability
  **/
  @ApiModelProperty(example = "0.9", value = "goalProbability")
  public Double getGoalProbability() {
    return goalProbability;
  }

  public void setGoalProbability(Double goalProbability) {
    this.goalProbability = goalProbability;
  }

  public GoalTrack id(UUID id) {
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

  public GoalTrack metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public GoalTrack putMetadataItem(String key, String metadataItem) {
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

  public GoalTrack onTrack(Boolean onTrack) {
    this.onTrack = onTrack;
    return this;
  }

   /**
   * onTrack
   * @return onTrack
  **/
  @ApiModelProperty(example = "true", value = "onTrack")
  public Boolean isOnTrack() {
    return onTrack;
  }

  public void setOnTrack(Boolean onTrack) {
    this.onTrack = onTrack;
  }

  public GoalTrack progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * progress
   * @return progress
  **/
  @ApiModelProperty(example = "10.2", value = "progress")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public GoalTrack projectionBalance(Double projectionBalance) {
    this.projectionBalance = projectionBalance;
    return this;
  }

   /**
   * projectionBalance
   * @return projectionBalance
  **/
  @ApiModelProperty(example = "0.9", value = "projectionBalance")
  public Double getProjectionBalance() {
    return projectionBalance;
  }

  public void setProjectionBalance(Double projectionBalance) {
    this.projectionBalance = projectionBalance;
  }

  public GoalTrack projectionDate(LocalDate projectionDate) {
    this.projectionDate = projectionDate;
    return this;
  }

   /**
   * projectionDate
   * @return projectionDate
  **/
  @ApiModelProperty(example = "2018-01-09", value = "projectionDate")
  public LocalDate getProjectionDate() {
    return projectionDate;
  }

  public void setProjectionDate(LocalDate projectionDate) {
    this.projectionDate = projectionDate;
  }

  public GoalTrack secondaryId(String secondaryId) {
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

  public GoalTrack statusTimeStamp(OffsetDateTime statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
    return this;
  }

   /**
   * statusTimeStamp
   * @return statusTimeStamp
  **/
  @ApiModelProperty(example = "2018-11-16T00:00:00.000+0000", required = true, value = "statusTimeStamp")
  public OffsetDateTime getStatusTimeStamp() {
    return statusTimeStamp;
  }

  public void setStatusTimeStamp(OffsetDateTime statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
  }

  public GoalTrack updateDate(OffsetDateTime updateDate) {
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
    GoalTrack goalTrack = (GoalTrack) o;
    return Objects.equals(this.accounts, goalTrack.accounts) &&
        Objects.equals(this.accumulationHorizon, goalTrack.accumulationHorizon) &&
        Objects.equals(this.clientId, goalTrack.clientId) &&
        Objects.equals(this.createDate, goalTrack.createDate) &&
        Objects.equals(this.currentInvestment, goalTrack.currentInvestment) &&
        Objects.equals(this.decumulationHorizon, goalTrack.decumulationHorizon) &&
        Objects.equals(this.goalAchievementScore, goalTrack.goalAchievementScore) &&
        Objects.equals(this.goalAmount, goalTrack.goalAmount) &&
        Objects.equals(this.goalId, goalTrack.goalId) &&
        Objects.equals(this.goalProbability, goalTrack.goalProbability) &&
        Objects.equals(this.id, goalTrack.id) &&
        Objects.equals(this.metadata, goalTrack.metadata) &&
        Objects.equals(this.onTrack, goalTrack.onTrack) &&
        Objects.equals(this.progress, goalTrack.progress) &&
        Objects.equals(this.projectionBalance, goalTrack.projectionBalance) &&
        Objects.equals(this.projectionDate, goalTrack.projectionDate) &&
        Objects.equals(this.secondaryId, goalTrack.secondaryId) &&
        Objects.equals(this.statusTimeStamp, goalTrack.statusTimeStamp) &&
        Objects.equals(this.updateDate, goalTrack.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, accumulationHorizon, clientId, createDate, currentInvestment, decumulationHorizon, goalAchievementScore, goalAmount, goalId, goalProbability, id, metadata, onTrack, progress, projectionBalance, projectionDate, secondaryId, statusTimeStamp, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalTrack {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currentInvestment: ").append(toIndentedString(currentInvestment)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    goalAchievementScore: ").append(toIndentedString(goalAchievementScore)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    goalProbability: ").append(toIndentedString(goalProbability)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onTrack: ").append(toIndentedString(onTrack)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    projectionBalance: ").append(toIndentedString(projectionBalance)).append("\n");
    sb.append("    projectionDate: ").append(toIndentedString(projectionDate)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    statusTimeStamp: ").append(toIndentedString(statusTimeStamp)).append("\n");
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

