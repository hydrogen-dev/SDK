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
import org.threeten.bp.LocalDate;

/**
 * AccountAllocationPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class AccountAllocationPayload {
  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("current_weight")
  private Double currentWeight = null;

  @SerializedName("strategic_weight")
  private Double strategicWeight = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  public AccountAllocationPayload allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * The ID of the allocation that is part of the account-allocation mapping
   * @return allocationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the allocation that is part of the account-allocation mapping")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public AccountAllocationPayload currentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
    return this;
  }

   /**
   * Current percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The current weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100
   * @return currentWeight
  **/
  @ApiModelProperty(required = true, value = "Current percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The current weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100")
  public Double getCurrentWeight() {
    return currentWeight;
  }

  public void setCurrentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
  }

  public AccountAllocationPayload strategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
    return this;
  }

   /**
   * Strategic percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The strategic weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100
   * @return strategicWeight
  **/
  @ApiModelProperty(required = true, value = "Strategic percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The strategic weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100")
  public Double getStrategicWeight() {
    return strategicWeight;
  }

  public void setStrategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
  }

  public AccountAllocationPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that is part of the account-allocation mapping
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that is part of the account-allocation mapping")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public AccountAllocationPayload date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the account-allocation mapping used for historical tracking
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of the account-allocation mapping used for historical tracking")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public AccountAllocationPayload goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * The ID of the goal that is associated with this account-allocation mapping
   * @return goalId
  **/
  @ApiModelProperty(value = "The ID of the goal that is associated with this account-allocation mapping")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAllocationPayload accountAllocationPayload = (AccountAllocationPayload) o;
    return Objects.equals(this.allocationId, accountAllocationPayload.allocationId) &&
        Objects.equals(this.currentWeight, accountAllocationPayload.currentWeight) &&
        Objects.equals(this.strategicWeight, accountAllocationPayload.strategicWeight) &&
        Objects.equals(this.accountId, accountAllocationPayload.accountId) &&
        Objects.equals(this.date, accountAllocationPayload.date) &&
        Objects.equals(this.goalId, accountAllocationPayload.goalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, currentWeight, strategicWeight, accountId, date, goalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAllocationPayload {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    currentWeight: ").append(toIndentedString(currentWeight)).append("\n");
    sb.append("    strategicWeight: ").append(toIndentedString(strategicWeight)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
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

