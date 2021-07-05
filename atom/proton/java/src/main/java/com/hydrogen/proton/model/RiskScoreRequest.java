/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * RiskScoreRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class RiskScoreRequest {
  @SerializedName("questionnaire_id")
  private UUID questionnaireId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("post_score")
  private Boolean postScore = false;

  @SerializedName("max_answers")
  private List<BigDecimal> maxAnswers = new ArrayList<BigDecimal>();

  @SerializedName("weights")
  private List<Float> weights = null;

  @SerializedName("answers")
  private List<BigDecimal> answers = null;

  public RiskScoreRequest questionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
    return this;
  }

   /**
   * Get questionnaireId
   * @return questionnaireId
  **/
  @ApiModelProperty(value = "")
  public UUID getQuestionnaireId() {
    return questionnaireId;
  }

  public void setQuestionnaireId(UUID questionnaireId) {
    this.questionnaireId = questionnaireId;
  }

  public RiskScoreRequest clientId(UUID clientId) {
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

  public RiskScoreRequest postScore(Boolean postScore) {
    this.postScore = postScore;
    return this;
  }

   /**
   * Get postScore
   * @return postScore
  **/
  @ApiModelProperty(value = "")
  public Boolean isPostScore() {
    return postScore;
  }

  public void setPostScore(Boolean postScore) {
    this.postScore = postScore;
  }

  public RiskScoreRequest maxAnswers(List<BigDecimal> maxAnswers) {
    this.maxAnswers = maxAnswers;
    return this;
  }

  public RiskScoreRequest addMaxAnswersItem(BigDecimal maxAnswersItem) {
    this.maxAnswers.add(maxAnswersItem);
    return this;
  }

   /**
   * Get maxAnswers
   * @return maxAnswers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BigDecimal> getMaxAnswers() {
    return maxAnswers;
  }

  public void setMaxAnswers(List<BigDecimal> maxAnswers) {
    this.maxAnswers = maxAnswers;
  }

  public RiskScoreRequest weights(List<Float> weights) {
    this.weights = weights;
    return this;
  }

  public RiskScoreRequest addWeightsItem(Float weightsItem) {
    if (this.weights == null) {
      this.weights = new ArrayList<Float>();
    }
    this.weights.add(weightsItem);
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @ApiModelProperty(value = "")
  public List<Float> getWeights() {
    return weights;
  }

  public void setWeights(List<Float> weights) {
    this.weights = weights;
  }

  public RiskScoreRequest answers(List<BigDecimal> answers) {
    this.answers = answers;
    return this;
  }

  public RiskScoreRequest addAnswersItem(BigDecimal answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<BigDecimal>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getAnswers() {
    return answers;
  }

  public void setAnswers(List<BigDecimal> answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScoreRequest riskScoreRequest = (RiskScoreRequest) o;
    return Objects.equals(this.questionnaireId, riskScoreRequest.questionnaireId) &&
        Objects.equals(this.clientId, riskScoreRequest.clientId) &&
        Objects.equals(this.postScore, riskScoreRequest.postScore) &&
        Objects.equals(this.maxAnswers, riskScoreRequest.maxAnswers) &&
        Objects.equals(this.weights, riskScoreRequest.weights) &&
        Objects.equals(this.answers, riskScoreRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionnaireId, clientId, postScore, maxAnswers, weights, answers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScoreRequest {\n");
    
    sb.append("    questionnaireId: ").append(toIndentedString(questionnaireId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    postScore: ").append(toIndentedString(postScore)).append("\n");
    sb.append("    maxAnswers: ").append(toIndentedString(maxAnswers)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

