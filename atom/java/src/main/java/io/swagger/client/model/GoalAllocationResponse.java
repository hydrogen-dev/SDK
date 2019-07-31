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
import io.swagger.client.model.GoalAllocationSectionResponse;
import io.swagger.client.model.GoalRecommendationResponse;
import io.swagger.client.model.GoalStatusSectionResponse;
import java.io.IOException;

/**
 * GoalAllocationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class GoalAllocationResponse {
  @SerializedName("current_status")
  private GoalStatusSectionResponse currentStatus = null;

  @SerializedName("recommended_status")
  private GoalRecommendationResponse recommendedStatus = null;

  @SerializedName("allocation")
  private GoalAllocationSectionResponse allocation = null;

  public GoalAllocationResponse currentStatus(GoalStatusSectionResponse currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  @ApiModelProperty(value = "")
  public GoalStatusSectionResponse getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(GoalStatusSectionResponse currentStatus) {
    this.currentStatus = currentStatus;
  }

  public GoalAllocationResponse recommendedStatus(GoalRecommendationResponse recommendedStatus) {
    this.recommendedStatus = recommendedStatus;
    return this;
  }

   /**
   * Get recommendedStatus
   * @return recommendedStatus
  **/
  @ApiModelProperty(value = "")
  public GoalRecommendationResponse getRecommendedStatus() {
    return recommendedStatus;
  }

  public void setRecommendedStatus(GoalRecommendationResponse recommendedStatus) {
    this.recommendedStatus = recommendedStatus;
  }

  public GoalAllocationResponse allocation(GoalAllocationSectionResponse allocation) {
    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @ApiModelProperty(value = "")
  public GoalAllocationSectionResponse getAllocation() {
    return allocation;
  }

  public void setAllocation(GoalAllocationSectionResponse allocation) {
    this.allocation = allocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAllocationResponse goalAllocationResponse = (GoalAllocationResponse) o;
    return Objects.equals(this.currentStatus, goalAllocationResponse.currentStatus) &&
        Objects.equals(this.recommendedStatus, goalAllocationResponse.recommendedStatus) &&
        Objects.equals(this.allocation, goalAllocationResponse.allocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentStatus, recommendedStatus, allocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAllocationResponse {\n");
    
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    recommendedStatus: ").append(toIndentedString(recommendedStatus)).append("\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
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

