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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DimRiskScoreResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class DimRiskScoreResponse {
  @SerializedName("risk_score")
  private Integer riskScore = null;

  @SerializedName("dim_scores")
  private Map<String, Integer> dimScores = new HashMap<String, Integer>();

  public DimRiskScoreResponse riskScore(Integer riskScore) {
    this.riskScore = riskScore;
    return this;
  }

   /**
   * A multi-dimensional risk score from 0 to 100.
   * minimum: 0
   * maximum: 100
   * @return riskScore
  **/
  @ApiModelProperty(required = true, value = "A multi-dimensional risk score from 0 to 100.")
  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public DimRiskScoreResponse dimScores(Map<String, Integer> dimScores) {
    this.dimScores = dimScores;
    return this;
  }

  public DimRiskScoreResponse putDimScoresItem(String key, Integer dimScoresItem) {
    this.dimScores.put(key, dimScoresItem);
    return this;
  }

   /**
   * Get dimScores
   * @return dimScores
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, Integer> getDimScores() {
    return dimScores;
  }

  public void setDimScores(Map<String, Integer> dimScores) {
    this.dimScores = dimScores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimRiskScoreResponse dimRiskScoreResponse = (DimRiskScoreResponse) o;
    return Objects.equals(this.riskScore, dimRiskScoreResponse.riskScore) &&
        Objects.equals(this.dimScores, dimRiskScoreResponse.dimScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskScore, dimScores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimRiskScoreResponse {\n");
    
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    dimScores: ").append(toIndentedString(dimScores)).append("\n");
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

