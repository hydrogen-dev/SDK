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
import io.swagger.client.model.NodePayload;
import java.io.IOException;
import java.util.UUID;

/**
 * CreateNodeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class CreateNodeResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("question_id")
  private UUID questionId = null;

  @SerializedName("is_first")
  private Boolean isFirst = false;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateNodeResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the node
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the node")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateNodeResponse questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * The ID of the question that corresponds to this node
   * @return questionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the question that corresponds to this node")
  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public CreateNodeResponse isFirst(Boolean isFirst) {
    this.isFirst = isFirst;
    return this;
  }

   /**
   * Indicates if this is the first node of the decision tree. Defaults to false meaning it is not the first node
   * @return isFirst
  **/
  @ApiModelProperty(value = "Indicates if this is the first node of the decision tree. Defaults to false meaning it is not the first node")
  public Boolean isIsFirst() {
    return isFirst;
  }

  public void setIsFirst(Boolean isFirst) {
    this.isFirst = isFirst;
  }

  public CreateNodeResponse secondaryId(String secondaryId) {
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

  public CreateNodeResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the node in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the node in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateNodeResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the node
   * @return id
  **/
  @ApiModelProperty(value = "ID of the node")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateNodeResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the node was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the node was created")
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
    CreateNodeResponse createNodeResponse = (CreateNodeResponse) o;
    return Objects.equals(this.name, createNodeResponse.name) &&
        Objects.equals(this.questionId, createNodeResponse.questionId) &&
        Objects.equals(this.isFirst, createNodeResponse.isFirst) &&
        Objects.equals(this.secondaryId, createNodeResponse.secondaryId) &&
        Objects.equals(this.metadata, createNodeResponse.metadata) &&
        Objects.equals(this.id, createNodeResponse.id) &&
        Objects.equals(this.createDate, createNodeResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, questionId, isFirst, secondaryId, metadata, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNodeResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    isFirst: ").append(toIndentedString(isFirst)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

