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

/**
 * QuestionnairePayloadAnswers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class QuestionnairePayloadAnswers {
  @SerializedName("value")
  private String value = null;

  @SerializedName("order_index")
  private String orderIndex = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public QuestionnairePayloadAnswers value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value for the answer option
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value for the answer option")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public QuestionnairePayloadAnswers orderIndex(String orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

   /**
   * The order of the answer option within the question or category such as “1”, “2”, “3”
   * @return orderIndex
  **/
  @ApiModelProperty(value = "The order of the answer option within the question or category such as “1”, “2”, “3”")
  public String getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(String orderIndex) {
    this.orderIndex = orderIndex;
  }

  public QuestionnairePayloadAnswers label(String label) {
    this.label = label;
    return this;
  }

   /**
   * A label to be assigned to the answer option for data labeling purposes
   * @return label
  **/
  @ApiModelProperty(value = "A label to be assigned to the answer option for data labeling purposes")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public QuestionnairePayloadAnswers image(String image) {
    this.image = image;
    return this;
  }

   /**
   * A reference link to an image associated with the answer option
   * @return image
  **/
  @ApiModelProperty(value = "A reference link to an image associated with the answer option")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public QuestionnairePayloadAnswers weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the answer option as a percentage of the total questionnaire score if each answer does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the answers for a question must add up to 100
   * @return weight
  **/
  @ApiModelProperty(value = "The weight of the answer option as a percentage of the total questionnaire score if each answer does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the answers for a question must add up to 100")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public QuestionnairePayloadAnswers isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Indicates the default answer to a question in a questionnaire when the UI is displayed to a user. Defaults to false
   * @return isDefault
  **/
  @ApiModelProperty(value = "Indicates the default answer to a question in a questionnaire when the UI is displayed to a user. Defaults to false")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public QuestionnairePayloadAnswers metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the answer option in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the answer option in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionnairePayloadAnswers questionnairePayloadAnswers = (QuestionnairePayloadAnswers) o;
    return Objects.equals(this.value, questionnairePayloadAnswers.value) &&
        Objects.equals(this.orderIndex, questionnairePayloadAnswers.orderIndex) &&
        Objects.equals(this.label, questionnairePayloadAnswers.label) &&
        Objects.equals(this.image, questionnairePayloadAnswers.image) &&
        Objects.equals(this.weight, questionnairePayloadAnswers.weight) &&
        Objects.equals(this.isDefault, questionnairePayloadAnswers.isDefault) &&
        Objects.equals(this.metadata, questionnairePayloadAnswers.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, orderIndex, label, image, weight, isDefault, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnairePayloadAnswers {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

