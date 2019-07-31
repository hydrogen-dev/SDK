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
import io.swagger.client.model.ModelCommentPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateModelCommentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class CreateModelCommentResponse {
  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateModelCommentResponse modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model that the comment falls under
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model that the comment falls under")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public CreateModelCommentResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Body of the comment
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "Body of the comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CreateModelCommentResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for when the comment applies
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date for when the comment applies")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CreateModelCommentResponse secondaryId(String secondaryId) {
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

  public CreateModelCommentResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the model commentary
   * @return id
  **/
  @ApiModelProperty(value = "ID of the model commentary")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateModelCommentResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the model commentary was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the model commentary was created")
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
    CreateModelCommentResponse createModelCommentResponse = (CreateModelCommentResponse) o;
    return Objects.equals(this.modelId, createModelCommentResponse.modelId) &&
        Objects.equals(this.comment, createModelCommentResponse.comment) &&
        Objects.equals(this.date, createModelCommentResponse.date) &&
        Objects.equals(this.secondaryId, createModelCommentResponse.secondaryId) &&
        Objects.equals(this.id, createModelCommentResponse.id) &&
        Objects.equals(this.createDate, createModelCommentResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, comment, date, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModelCommentResponse {\n");
    
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

