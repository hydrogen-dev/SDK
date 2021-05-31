/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
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
 * Goal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Goal {
  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_decumulation")
  private Boolean isDecumulation = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent_goal_id")
  private UUID parentGoalId = null;

  @SerializedName("questionnaire_id")
  private UUID questionnaireId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Goal accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * Get accumulationHorizon
   * @return accumulationHorizon
  **/
  @ApiModelProperty(value = "")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public Goal category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category
   * @return category
  **/
  @ApiModelProperty(example = "retirement", value = "category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Goal clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Goal createDate(OffsetDateTime createDate) {
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

  public Goal decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * Get decumulationHorizon
   * @return decumulationHorizon
  **/
  @ApiModelProperty(value = "")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public Goal goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * Get goalAmount
   * @return goalAmount
  **/
  @ApiModelProperty(value = "")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public Goal id(UUID id) {
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

  public Goal image(String image) {
    this.image = image;
    return this;
  }

   /**
   * image
   * @return image
  **/
  @ApiModelProperty(example = "image", value = "image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Goal isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "false", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Goal isDecumulation(Boolean isDecumulation) {
    this.isDecumulation = isDecumulation;
    return this;
  }

   /**
   * isDecumulation
   * @return isDecumulation
  **/
  @ApiModelProperty(example = "true", value = "isDecumulation")
  public Boolean isIsDecumulation() {
    return isDecumulation;
  }

  public void setIsDecumulation(Boolean isDecumulation) {
    this.isDecumulation = isDecumulation;
  }

  public Goal metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Goal putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Goal name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Goal name
   * @return name
  **/
  @ApiModelProperty(example = "sample", required = true, value = "Goal name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Goal parentGoalId(UUID parentGoalId) {
    this.parentGoalId = parentGoalId;
    return this;
  }

   /**
   * Goal Parent Goal Id
   * @return parentGoalId
  **/
  @ApiModelProperty(example = "9a1c0a9f-c699-46a2-9710-8b2abe10526c", value = "Goal Parent Goal Id")
  public UUID getParentGoalId() {
    return parentGoalId;
  }

  public void setParentGoalId(UUID parentGoalId) {
    this.parentGoalId = parentGoalId;
  }

  public Goal questionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
    return this;
  }

   /**
   * questionnaire_id
   * @return questionnaireId
  **/
  @ApiModelProperty(example = "647c54c3-b649-477e-8cc7-eee56a120dd3", value = "questionnaire_id")
  public UUID getQuestionnaireId() {
    return questionnaireId;
  }

  public void setQuestionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
  }

  public Goal secondaryId(String secondaryId) {
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

  public Goal type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(example = "type", value = "type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Goal updateDate(OffsetDateTime updateDate) {
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
    Goal goal = (Goal) o;
    return Objects.equals(this.accumulationHorizon, goal.accumulationHorizon) &&
        Objects.equals(this.category, goal.category) &&
        Objects.equals(this.clientId, goal.clientId) &&
        Objects.equals(this.createDate, goal.createDate) &&
        Objects.equals(this.decumulationHorizon, goal.decumulationHorizon) &&
        Objects.equals(this.goalAmount, goal.goalAmount) &&
        Objects.equals(this.id, goal.id) &&
        Objects.equals(this.image, goal.image) &&
        Objects.equals(this.isActive, goal.isActive) &&
        Objects.equals(this.isDecumulation, goal.isDecumulation) &&
        Objects.equals(this.metadata, goal.metadata) &&
        Objects.equals(this.name, goal.name) &&
        Objects.equals(this.parentGoalId, goal.parentGoalId) &&
        Objects.equals(this.questionnaireId, goal.questionnaireId) &&
        Objects.equals(this.secondaryId, goal.secondaryId) &&
        Objects.equals(this.type, goal.type) &&
        Objects.equals(this.updateDate, goal.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulationHorizon, category, clientId, createDate, decumulationHorizon, goalAmount, id, image, isActive, isDecumulation, metadata, name, parentGoalId, questionnaireId, secondaryId, type, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Goal {\n");
    
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDecumulation: ").append(toIndentedString(isDecumulation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGoalId: ").append(toIndentedString(parentGoalId)).append("\n");
    sb.append("    questionnaireId: ").append(toIndentedString(questionnaireId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

