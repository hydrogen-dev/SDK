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
 * AccountCreateGoal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class AccountCreateGoal {
  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  public AccountCreateGoal goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * The ID of a goal mapped to the account
   * @return goalId
  **/
  @ApiModelProperty(required = true, value = "The ID of a goal mapped to the account")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public AccountCreateGoal goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * Monetary amount provided by the client as the target amount to be reached within the goal horizon. May be used in conjunction with the Proton API. Option to also store under the goal entity
   * @return goalAmount
  **/
  @ApiModelProperty(value = "Monetary amount provided by the client as the target amount to be reached within the goal horizon. May be used in conjunction with the Proton API. Option to also store under the goal entity")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public AccountCreateGoal accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * Time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. Option to also store under the goal entity
   * @return accumulationHorizon
  **/
  @ApiModelProperty(value = "Time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. Option to also store under the goal entity")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public AccountCreateGoal decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * Time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. Option to also store under the goal entity
   * @return decumulationHorizon
  **/
  @ApiModelProperty(value = "Time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. Option to also store under the goal entity")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateGoal accountCreateGoal = (AccountCreateGoal) o;
    return Objects.equals(this.goalId, accountCreateGoal.goalId) &&
        Objects.equals(this.goalAmount, accountCreateGoal.goalAmount) &&
        Objects.equals(this.accumulationHorizon, accountCreateGoal.accumulationHorizon) &&
        Objects.equals(this.decumulationHorizon, accountCreateGoal.decumulationHorizon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, goalAmount, accumulationHorizon, decumulationHorizon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateGoal {\n");
    
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
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

