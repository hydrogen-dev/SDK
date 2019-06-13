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
import io.swagger.client.model.GoalPayload;
import java.io.IOException;
import java.util.UUID;

/**
 * CreateGoalResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class CreateGoalResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("parent_goal_id")
  private UUID parentGoalId = null;

  @SerializedName("questionnaire_id")
  private UUID questionnaireId = null;

  @SerializedName("is_decumulation")
  private Boolean isDecumulation = false;

  @SerializedName("type")
  private String type = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateGoalResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the goal
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the goal")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateGoalResponse parentGoalId(UUID parentGoalId) {
    this.parentGoalId = parentGoalId;
    return this;
  }

   /**
   * In the case that a goal is related to a broader goal, the ID of the broader goal
   * @return parentGoalId
  **/
  @ApiModelProperty(value = "In the case that a goal is related to a broader goal, the ID of the broader goal")
  public UUID getParentGoalId() {
    return parentGoalId;
  }

  public void setParentGoalId(UUID parentGoalId) {
    this.parentGoalId = parentGoalId;
  }

  public CreateGoalResponse questionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
    return this;
  }

   /**
   * The ID of the group of questions that are used to customize a goal for a client
   * @return questionnaireId
  **/
  @ApiModelProperty(value = "The ID of the group of questions that are used to customize a goal for a client")
  public UUID getQuestionnaireId() {
    return questionnaireId;
  }

  public void setQuestionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
  }

  public CreateGoalResponse isDecumulation(Boolean isDecumulation) {
    this.isDecumulation = isDecumulation;
    return this;
  }

   /**
   * Indicator if the goal is a decumulation goal such as saving for retirement. Default is false, indicating that the goal is an accumulation goal. May be used in conjunction with the Proton API
   * @return isDecumulation
  **/
  @ApiModelProperty(value = "Indicator if the goal is a decumulation goal such as saving for retirement. Default is false, indicating that the goal is an accumulation goal. May be used in conjunction with the Proton API")
  public Boolean isIsDecumulation() {
    return isDecumulation;
  }

  public void setIsDecumulation(Boolean isDecumulation) {
    this.isDecumulation = isDecumulation;
  }

  public CreateGoalResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of goal used to identify similar goals. Can be used to differentiate between goal templates and client-specific goals
   * @return type
  **/
  @ApiModelProperty(value = "Type of goal used to identify similar goals. Can be used to differentiate between goal templates and client-specific goals")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateGoalResponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category of the goal used to group goals together. For example, different large purchase goals could have a type of ‘Major Purchase’
   * @return category
  **/
  @ApiModelProperty(value = "Category of the goal used to group goals together. For example, different large purchase goals could have a type of ‘Major Purchase’")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CreateGoalResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * If the goal is client-specific (not used by any other client), the ID of the client to which it belongs
   * @return clientId
  **/
  @ApiModelProperty(value = "If the goal is client-specific (not used by any other client), the ID of the client to which it belongs")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public CreateGoalResponse goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * If the goal is client-specific, the target monetary amount to be reached within the goal horizon. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity
   * @return goalAmount
  **/
  @ApiModelProperty(value = "If the goal is client-specific, the target monetary amount to be reached within the goal horizon. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public CreateGoalResponse accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * If the goal is client-specific, the time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity
   * @return accumulationHorizon
  **/
  @ApiModelProperty(value = "If the goal is client-specific, the time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public CreateGoalResponse decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * If the goal is client-specific, the time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity
   * @return decumulationHorizon
  **/
  @ApiModelProperty(value = "If the goal is client-specific, the time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public CreateGoalResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the goal is active. Defaults to true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the goal is active. Defaults to true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CreateGoalResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the goal in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the goal in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateGoalResponse secondaryId(String secondaryId) {
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

  public CreateGoalResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the goal
   * @return id
  **/
  @ApiModelProperty(value = "ID of the goal")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateGoalResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the goal was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the goal was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGoalResponse createGoalResponse = (CreateGoalResponse) o;
    return Objects.equals(this.name, createGoalResponse.name) &&
        Objects.equals(this.parentGoalId, createGoalResponse.parentGoalId) &&
        Objects.equals(this.questionnaireId, createGoalResponse.questionnaireId) &&
        Objects.equals(this.isDecumulation, createGoalResponse.isDecumulation) &&
        Objects.equals(this.type, createGoalResponse.type) &&
        Objects.equals(this.category, createGoalResponse.category) &&
        Objects.equals(this.clientId, createGoalResponse.clientId) &&
        Objects.equals(this.goalAmount, createGoalResponse.goalAmount) &&
        Objects.equals(this.accumulationHorizon, createGoalResponse.accumulationHorizon) &&
        Objects.equals(this.decumulationHorizon, createGoalResponse.decumulationHorizon) &&
        Objects.equals(this.isActive, createGoalResponse.isActive) &&
        Objects.equals(this.metadata, createGoalResponse.metadata) &&
        Objects.equals(this.secondaryId, createGoalResponse.secondaryId) &&
        Objects.equals(this.id, createGoalResponse.id) &&
        Objects.equals(this.createDate, createGoalResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentGoalId, questionnaireId, isDecumulation, type, category, clientId, goalAmount, accumulationHorizon, decumulationHorizon, isActive, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGoalResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGoalId: ").append(toIndentedString(parentGoalId)).append("\n");
    sb.append("    questionnaireId: ").append(toIndentedString(questionnaireId)).append("\n");
    sb.append("    isDecumulation: ").append(toIndentedString(isDecumulation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

