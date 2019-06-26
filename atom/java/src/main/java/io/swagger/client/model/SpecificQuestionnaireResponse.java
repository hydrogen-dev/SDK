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
import io.swagger.client.model.CreateQuestionnaireResponse;
import io.swagger.client.model.QuestionnairePayloadQuestions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SpecificQuestionnaireResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class SpecificQuestionnaireResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("decision_tree_id")
  private UUID decisionTreeId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("questions")
  private List<QuestionnairePayloadQuestions> questions = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificQuestionnaireResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the questionnaire
   * @return id
  **/
  @ApiModelProperty(value = "ID of the questionnaire")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificQuestionnaireResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the questionnaire was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the questionnaire was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificQuestionnaireResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name for the questionnaire
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the questionnaire")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpecificQuestionnaireResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descriptions for additional information on the questionnaire
   * @return description
  **/
  @ApiModelProperty(value = "Descriptions for additional information on the questionnaire")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SpecificQuestionnaireResponse decisionTreeId(UUID decisionTreeId) {
    this.decisionTreeId = decisionTreeId;
    return this;
  }

   /**
   * The ID of the decision tree that corresponds to the questionnaire
   * @return decisionTreeId
  **/
  @ApiModelProperty(value = "The ID of the decision tree that corresponds to the questionnaire")
  public UUID getDecisionTreeId() {
    return decisionTreeId;
  }

  public void setDecisionTreeId(UUID decisionTreeId) {
    this.decisionTreeId = decisionTreeId;
  }

  public SpecificQuestionnaireResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of questionnaire such as “retirement plan”
   * @return type
  **/
  @ApiModelProperty(value = "Type of questionnaire such as “retirement plan”")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SpecificQuestionnaireResponse questions(List<QuestionnairePayloadQuestions> questions) {
    this.questions = questions;
    return this;
  }

  public SpecificQuestionnaireResponse addQuestionsItem(QuestionnairePayloadQuestions questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<QuestionnairePayloadQuestions>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * List of questions to be answered as well as their respective answers and weights within the questionnaire
   * @return questions
  **/
  @ApiModelProperty(value = "List of questions to be answered as well as their respective answers and weights within the questionnaire")
  public List<QuestionnairePayloadQuestions> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionnairePayloadQuestions> questions) {
    this.questions = questions;
  }

  public SpecificQuestionnaireResponse secondaryId(String secondaryId) {
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

  public SpecificQuestionnaireResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the questionnaire was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the questionnaire was last updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificQuestionnaireResponse specificQuestionnaireResponse = (SpecificQuestionnaireResponse) o;
    return Objects.equals(this.id, specificQuestionnaireResponse.id) &&
        Objects.equals(this.createDate, specificQuestionnaireResponse.createDate) &&
        Objects.equals(this.name, specificQuestionnaireResponse.name) &&
        Objects.equals(this.description, specificQuestionnaireResponse.description) &&
        Objects.equals(this.decisionTreeId, specificQuestionnaireResponse.decisionTreeId) &&
        Objects.equals(this.type, specificQuestionnaireResponse.type) &&
        Objects.equals(this.questions, specificQuestionnaireResponse.questions) &&
        Objects.equals(this.secondaryId, specificQuestionnaireResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificQuestionnaireResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, name, description, decisionTreeId, type, questions, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificQuestionnaireResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    decisionTreeId: ").append(toIndentedString(decisionTreeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

