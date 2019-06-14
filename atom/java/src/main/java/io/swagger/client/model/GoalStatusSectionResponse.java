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
import io.swagger.client.model.GoalReturnDetailsPeriodResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GoalStatusSectionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class GoalStatusSectionResponse {
  @SerializedName("on_track")
  private Boolean onTrack = null;

  @SerializedName("progress")
  private BigDecimal progress = null;

  @SerializedName("goal_probability")
  private BigDecimal goalProbability = null;

  @SerializedName("goal_achievement_score")
  private Integer goalAchievementScore = null;

  @SerializedName("return_details")
  private Map<String, GoalReturnDetailsPeriodResponse> returnDetails = new HashMap<String, GoalReturnDetailsPeriodResponse>();

  @SerializedName("adjusted_goal_amount")
  private BigDecimal adjustedGoalAmount = null;

  public GoalStatusSectionResponse onTrack(Boolean onTrack) {
    this.onTrack = onTrack;
    return this;
  }

   /**
   * If true, the goal is on track.
   * @return onTrack
  **/
  @ApiModelProperty(required = true, value = "If true, the goal is on track.")
  public Boolean isOnTrack() {
    return onTrack;
  }

  public void setOnTrack(Boolean onTrack) {
    this.onTrack = onTrack;
  }

  public GoalStatusSectionResponse progress(BigDecimal progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon.
   * minimum: 0
   * @return progress
  **/
  @ApiModelProperty(required = true, value = "The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon.")
  public BigDecimal getProgress() {
    return progress;
  }

  public void setProgress(BigDecimal progress) {
    this.progress = progress;
  }

  public GoalStatusSectionResponse goalProbability(BigDecimal goalProbability) {
    this.goalProbability = goalProbability;
    return this;
  }

   /**
   * The probability of achieving the goal with the given portfolio.
   * minimum: 0
   * maximum: 1
   * @return goalProbability
  **/
  @ApiModelProperty(required = true, value = "The probability of achieving the goal with the given portfolio.")
  public BigDecimal getGoalProbability() {
    return goalProbability;
  }

  public void setGoalProbability(BigDecimal goalProbability) {
    this.goalProbability = goalProbability;
  }

  public GoalStatusSectionResponse goalAchievementScore(Integer goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
    return this;
  }

   /**
   * A ratio of goal_probability to the conf_tgt on a scale from 0 to 100.
   * minimum: 0
   * maximum: 100
   * @return goalAchievementScore
  **/
  @ApiModelProperty(required = true, value = "A ratio of goal_probability to the conf_tgt on a scale from 0 to 100.")
  public Integer getGoalAchievementScore() {
    return goalAchievementScore;
  }

  public void setGoalAchievementScore(Integer goalAchievementScore) {
    this.goalAchievementScore = goalAchievementScore;
  }

  public GoalStatusSectionResponse returnDetails(Map<String, GoalReturnDetailsPeriodResponse> returnDetails) {
    this.returnDetails = returnDetails;
    return this;
  }

  public GoalStatusSectionResponse putReturnDetailsItem(String key, GoalReturnDetailsPeriodResponse returnDetailsItem) {
    this.returnDetails.put(key, returnDetailsItem);
    return this;
  }

   /**
   * Portfolio return information over the length of the horizon, broken down by period.
   * @return returnDetails
  **/
  @ApiModelProperty(required = true, value = "Portfolio return information over the length of the horizon, broken down by period.")
  public Map<String, GoalReturnDetailsPeriodResponse> getReturnDetails() {
    return returnDetails;
  }

  public void setReturnDetails(Map<String, GoalReturnDetailsPeriodResponse> returnDetails) {
    this.returnDetails = returnDetails;
  }

  public GoalStatusSectionResponse adjustedGoalAmount(BigDecimal adjustedGoalAmount) {
    this.adjustedGoalAmount = adjustedGoalAmount;
    return this;
  }

   /**
   * The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold.
   * @return adjustedGoalAmount
  **/
  @ApiModelProperty(required = true, value = "The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold.")
  public BigDecimal getAdjustedGoalAmount() {
    return adjustedGoalAmount;
  }

  public void setAdjustedGoalAmount(BigDecimal adjustedGoalAmount) {
    this.adjustedGoalAmount = adjustedGoalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalStatusSectionResponse goalStatusSectionResponse = (GoalStatusSectionResponse) o;
    return Objects.equals(this.onTrack, goalStatusSectionResponse.onTrack) &&
        Objects.equals(this.progress, goalStatusSectionResponse.progress) &&
        Objects.equals(this.goalProbability, goalStatusSectionResponse.goalProbability) &&
        Objects.equals(this.goalAchievementScore, goalStatusSectionResponse.goalAchievementScore) &&
        Objects.equals(this.returnDetails, goalStatusSectionResponse.returnDetails) &&
        Objects.equals(this.adjustedGoalAmount, goalStatusSectionResponse.adjustedGoalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onTrack, progress, goalProbability, goalAchievementScore, returnDetails, adjustedGoalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalStatusSectionResponse {\n");
    
    sb.append("    onTrack: ").append(toIndentedString(onTrack)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    goalProbability: ").append(toIndentedString(goalProbability)).append("\n");
    sb.append("    goalAchievementScore: ").append(toIndentedString(goalAchievementScore)).append("\n");
    sb.append("    returnDetails: ").append(toIndentedString(returnDetails)).append("\n");
    sb.append("    adjustedGoalAmount: ").append(toIndentedString(adjustedGoalAmount)).append("\n");
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

