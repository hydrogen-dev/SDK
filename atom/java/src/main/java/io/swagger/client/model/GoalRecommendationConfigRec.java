/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
 * GoalRecommendationConfigRec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class GoalRecommendationConfigRec {
  @SerializedName("inv_min")
  private BigDecimal invMin = null;

  @SerializedName("inv_max")
  private BigDecimal invMax = null;

  @SerializedName("dep_min")
  private BigDecimal depMin = null;

  @SerializedName("dep_max")
  private BigDecimal depMax = null;

  @SerializedName("horizon_min")
  private Integer horizonMin = null;

  @SerializedName("horizon_max")
  private Integer horizonMax = null;

  @SerializedName("recommended_inflation")
  private BigDecimal recommendedInflation = null;

  public GoalRecommendationConfigRec invMin(BigDecimal invMin) {
    this.invMin = invMin;
    return this;
  }

   /**
   * The minimum initial investment amount
   * minimum: 0
   * @return invMin
  **/
  @ApiModelProperty(value = "The minimum initial investment amount")
  public BigDecimal getInvMin() {
    return invMin;
  }

  public void setInvMin(BigDecimal invMin) {
    this.invMin = invMin;
  }

  public GoalRecommendationConfigRec invMax(BigDecimal invMax) {
    this.invMax = invMax;
    return this;
  }

   /**
   * The maximum initial investment amount
   * @return invMax
  **/
  @ApiModelProperty(value = "The maximum initial investment amount")
  public BigDecimal getInvMax() {
    return invMax;
  }

  public void setInvMax(BigDecimal invMax) {
    this.invMax = invMax;
  }

  public GoalRecommendationConfigRec depMin(BigDecimal depMin) {
    this.depMin = depMin;
    return this;
  }

   /**
   * The minimum recurring deposit amount
   * minimum: 0
   * @return depMin
  **/
  @ApiModelProperty(value = "The minimum recurring deposit amount")
  public BigDecimal getDepMin() {
    return depMin;
  }

  public void setDepMin(BigDecimal depMin) {
    this.depMin = depMin;
  }

  public GoalRecommendationConfigRec depMax(BigDecimal depMax) {
    this.depMax = depMax;
    return this;
  }

   /**
   * The maximum recurring deposit amount
   * minimum: 0
   * @return depMax
  **/
  @ApiModelProperty(value = "The maximum recurring deposit amount")
  public BigDecimal getDepMax() {
    return depMax;
  }

  public void setDepMax(BigDecimal depMax) {
    this.depMax = depMax;
  }

  public GoalRecommendationConfigRec horizonMin(Integer horizonMin) {
    this.horizonMin = horizonMin;
    return this;
  }

   /**
   * The minimum number of periods that decumulation could be delayed
   * minimum: 0
   * @return horizonMin
  **/
  @ApiModelProperty(value = "The minimum number of periods that decumulation could be delayed")
  public Integer getHorizonMin() {
    return horizonMin;
  }

  public void setHorizonMin(Integer horizonMin) {
    this.horizonMin = horizonMin;
  }

  public GoalRecommendationConfigRec horizonMax(Integer horizonMax) {
    this.horizonMax = horizonMax;
    return this;
  }

   /**
   * The maximum number of periods that decumulation could be delayed
   * @return horizonMax
  **/
  @ApiModelProperty(value = "The maximum number of periods that decumulation could be delayed")
  public Integer getHorizonMax() {
    return horizonMax;
  }

  public void setHorizonMax(Integer horizonMax) {
    this.horizonMax = horizonMax;
  }

  public GoalRecommendationConfigRec recommendedInflation(BigDecimal recommendedInflation) {
    this.recommendedInflation = recommendedInflation;
    return this;
  }

   /**
   * The annualized inflation rate for the recommendation
   * minimum: -1
   * maximum: 20
   * @return recommendedInflation
  **/
  @ApiModelProperty(value = "The annualized inflation rate for the recommendation")
  public BigDecimal getRecommendedInflation() {
    return recommendedInflation;
  }

  public void setRecommendedInflation(BigDecimal recommendedInflation) {
    this.recommendedInflation = recommendedInflation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalRecommendationConfigRec goalRecommendationConfigRec = (GoalRecommendationConfigRec) o;
    return Objects.equals(this.invMin, goalRecommendationConfigRec.invMin) &&
        Objects.equals(this.invMax, goalRecommendationConfigRec.invMax) &&
        Objects.equals(this.depMin, goalRecommendationConfigRec.depMin) &&
        Objects.equals(this.depMax, goalRecommendationConfigRec.depMax) &&
        Objects.equals(this.horizonMin, goalRecommendationConfigRec.horizonMin) &&
        Objects.equals(this.horizonMax, goalRecommendationConfigRec.horizonMax) &&
        Objects.equals(this.recommendedInflation, goalRecommendationConfigRec.recommendedInflation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invMin, invMax, depMin, depMax, horizonMin, horizonMax, recommendedInflation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRecommendationConfigRec {\n");
    
    sb.append("    invMin: ").append(toIndentedString(invMin)).append("\n");
    sb.append("    invMax: ").append(toIndentedString(invMax)).append("\n");
    sb.append("    depMin: ").append(toIndentedString(depMin)).append("\n");
    sb.append("    depMax: ").append(toIndentedString(depMax)).append("\n");
    sb.append("    horizonMin: ").append(toIndentedString(horizonMin)).append("\n");
    sb.append("    horizonMax: ").append(toIndentedString(horizonMax)).append("\n");
    sb.append("    recommendedInflation: ").append(toIndentedString(recommendedInflation)).append("\n");
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
