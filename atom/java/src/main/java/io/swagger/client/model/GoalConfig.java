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
import java.math.BigDecimal;

/**
 * GoalConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class GoalConfig {
  @SerializedName("goal_amount")
  private BigDecimal goalAmount = null;

  @SerializedName("goal_inflation")
  private BigDecimal goalInflation = null;

  public GoalConfig goalAmount(BigDecimal goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * The withdrawal amount in today&#39;s dollars
   * minimum: 0
   * @return goalAmount
  **/
  @ApiModelProperty(required = true, value = "The withdrawal amount in today's dollars")
  public BigDecimal getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(BigDecimal goalAmount) {
    this.goalAmount = goalAmount;
  }

  public GoalConfig goalInflation(BigDecimal goalInflation) {
    this.goalInflation = goalInflation;
    return this;
  }

   /**
   * The annualized inflation for goal_amount
   * minimum: -1
   * maximum: 20
   * @return goalInflation
  **/
  @ApiModelProperty(value = "The annualized inflation for goal_amount")
  public BigDecimal getGoalInflation() {
    return goalInflation;
  }

  public void setGoalInflation(BigDecimal goalInflation) {
    this.goalInflation = goalInflation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalConfig goalConfig = (GoalConfig) o;
    return Objects.equals(this.goalAmount, goalConfig.goalAmount) &&
        Objects.equals(this.goalInflation, goalConfig.goalInflation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalAmount, goalInflation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalConfig {\n");
    
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    goalInflation: ").append(toIndentedString(goalInflation)).append("\n");
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

