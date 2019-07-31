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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * GoalTrackPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class GoalTrackPayload {
  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  @SerializedName("accounts")
  private List<UUID> accounts = null;

  @SerializedName("current_investment")
  private Double currentInvestment = null;

  @SerializedName("on_track")
  private Boolean onTrack = null;

  @SerializedName("progress")
  private Double progress = null;

  @SerializedName("goal_probability")
  private Double goalProbability = null;

  @SerializedName("goal_achievement_score")
  private Double goalAchievementScore = null;

  @SerializedName("projection_balance")
  private Double projectionBalance = null;

  @SerializedName("projection_date")
  private LocalDate projectionDate = null;

  @SerializedName("status_time_stamp")
  private String statusTimeStamp = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public GoalTrackPayload goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * The ID of a goal to which the goal track record pertains
   * @return goalId
  **/
  @ApiModelProperty(required = true, value = "The ID of a goal to which the goal track record pertains")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public GoalTrackPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of a client to whom the goal for the goal track record belongs
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID of a client to whom the goal for the goal track record belongs")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public GoalTrackPayload goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * Target amount for the goal
   * @return goalAmount
  **/
  @ApiModelProperty(value = "Target amount for the goal")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public GoalTrackPayload accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * The time horizon of the goal during the accumulation phase, in years
   * @return accumulationHorizon
  **/
  @ApiModelProperty(value = "The time horizon of the goal during the accumulation phase, in years")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public GoalTrackPayload decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * The time horizon of the goal during the decumulation phase, in years
   * @return decumulationHorizon
  **/
  @ApiModelProperty(value = "The time horizon of the goal during the decumulation phase, in years")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public GoalTrackPayload accounts(List<UUID> accounts) {
    this.accounts = accounts;
    return this;
  }

  public GoalTrackPayload addAccountsItem(UUID accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<UUID>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * List of accounts linked to the goal
   * @return accounts
  **/
  @ApiModelProperty(value = "List of accounts linked to the goal")
  public List<UUID> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<UUID> accounts) {
    this.accounts = accounts;
  }

  public GoalTrackPayload currentInvestment(Double currentInvestment) {
    this.currentInvestment = currentInvestment;
    return this;
  }

   /**
   * The current amount invested toward the goal
   * @return currentInvestment
  **/
  @ApiModelProperty(value = "The current amount invested toward the goal")
  public Double getCurrentInvestment() {
    return currentInvestment;
  }

  public void setCurrentInvestment(Double currentInvestment) {
    this.currentInvestment = currentInvestment;
  }

  public GoalTrackPayload onTrack(Boolean onTrack) {
    this.onTrack = onTrack;
    return this;
  }

   /**
   * Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default)
   * @return onTrack
  **/
  @ApiModelProperty(value = "Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default)")
  public Boolean isOnTrack() {
    return onTrack;
  }

  public void setOnTrack(Boolean onTrack) {
    this.onTrack = onTrack;
  }

  public GoalTrackPayload progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The goal progress percentage as a decimal
   * @return progress
  **/
  @ApiModelProperty(value = "The goal progress percentage as a decimal")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public GoalTrackPayload goalProbability(Double goalProbability) {
    this.goalProbability = goalProbability;
    return this;
  }

   /**
   * The probability of achieving the goal with the client’s given investments
   * @return goalProbability
  **/
  @ApiModelProperty(value = "The probability of achieving the goal with the client’s given investments")
  public Double getGoalProbability() {
    return goalProbability;
  }

  public void setGoalProbability(Double goalProbability) {
    this.goalProbability = goalProbability;
  }

  public GoalTrackPayload goalAchievementScore(Double goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
    return this;
  }

   /**
   * Probability of achieving the goal in relation to the confidence target of a simulation
   * @return goalAchievementScore
  **/
  @ApiModelProperty(value = "Probability of achieving the goal in relation to the confidence target of a simulation")
  public Double getGoalAchievementScore() {
    return goalAchievementScore;
  }

  public void setGoalAchievementScore(Double goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
  }

  public GoalTrackPayload projectionBalance(Double projectionBalance) {
    this.projectionBalance = projectionBalance;
    return this;
  }

   /**
   * The projected balance of the goal
   * @return projectionBalance
  **/
  @ApiModelProperty(value = "The projected balance of the goal")
  public Double getProjectionBalance() {
    return projectionBalance;
  }

  public void setProjectionBalance(Double projectionBalance) {
    this.projectionBalance = projectionBalance;
  }

  public GoalTrackPayload projectionDate(LocalDate projectionDate) {
    this.projectionDate = projectionDate;
    return this;
  }

   /**
   * The date of the projected balance of the goal
   * @return projectionDate
  **/
  @ApiModelProperty(value = "The date of the projected balance of the goal")
  public LocalDate getProjectionDate() {
    return projectionDate;
  }

  public void setProjectionDate(LocalDate projectionDate) {
    this.projectionDate = projectionDate;
  }

  public GoalTrackPayload statusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
    return this;
  }

   /**
   * Date and time to which this goal track record applies, defaults to the current timestamp
   * @return statusTimeStamp
  **/
  @ApiModelProperty(value = "Date and time to which this goal track record applies, defaults to the current timestamp")
  public String getStatusTimeStamp() {
    return statusTimeStamp;
  }

  public void setStatusTimeStamp(String statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
  }

  public GoalTrackPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the goal track record in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the goal track record in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public GoalTrackPayload secondaryId(String secondaryId) {
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
    GoalTrackPayload goalTrackPayload = (GoalTrackPayload) o;
    return Objects.equals(this.goalId, goalTrackPayload.goalId) &&
        Objects.equals(this.clientId, goalTrackPayload.clientId) &&
        Objects.equals(this.goalAmount, goalTrackPayload.goalAmount) &&
        Objects.equals(this.accumulationHorizon, goalTrackPayload.accumulationHorizon) &&
        Objects.equals(this.decumulationHorizon, goalTrackPayload.decumulationHorizon) &&
        Objects.equals(this.accounts, goalTrackPayload.accounts) &&
        Objects.equals(this.currentInvestment, goalTrackPayload.currentInvestment) &&
        Objects.equals(this.onTrack, goalTrackPayload.onTrack) &&
        Objects.equals(this.progress, goalTrackPayload.progress) &&
        Objects.equals(this.goalProbability, goalTrackPayload.goalProbability) &&
        Objects.equals(this.goalAchievementScore, goalTrackPayload.goalAchievementScore) &&
        Objects.equals(this.projectionBalance, goalTrackPayload.projectionBalance) &&
        Objects.equals(this.projectionDate, goalTrackPayload.projectionDate) &&
        Objects.equals(this.statusTimeStamp, goalTrackPayload.statusTimeStamp) &&
        Objects.equals(this.metadata, goalTrackPayload.metadata) &&
        Objects.equals(this.secondaryId, goalTrackPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, clientId, goalAmount, accumulationHorizon, decumulationHorizon, accounts, currentInvestment, onTrack, progress, goalProbability, goalAchievementScore, projectionBalance, projectionDate, statusTimeStamp, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalTrackPayload {\n");
    
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    currentInvestment: ").append(toIndentedString(currentInvestment)).append("\n");
    sb.append("    onTrack: ").append(toIndentedString(onTrack)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    goalProbability: ").append(toIndentedString(goalProbability)).append("\n");
    sb.append("    goalAchievementScore: ").append(toIndentedString(goalAchievementScore)).append("\n");
    sb.append("    projectionBalance: ").append(toIndentedString(projectionBalance)).append("\n");
    sb.append("    projectionDate: ").append(toIndentedString(projectionDate)).append("\n");
    sb.append("    statusTimeStamp: ").append(toIndentedString(statusTimeStamp)).append("\n");
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

