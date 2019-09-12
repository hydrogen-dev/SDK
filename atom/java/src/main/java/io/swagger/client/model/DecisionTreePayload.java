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
 * DecisionTreePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class DecisionTreePayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public DecisionTreePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the decision tree
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the decision tree")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DecisionTreePayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the decision tree such as “Tree to allocate clients to taxable portfolios”
   * @return description
  **/
  @ApiModelProperty(value = "Description for the decision tree such as “Tree to allocate clients to taxable portfolios”")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DecisionTreePayload secondaryId(String secondaryId) {
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

  public DecisionTreePayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the decision tree in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the decision tree in the format key:value")
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
    DecisionTreePayload decisionTreePayload = (DecisionTreePayload) o;
    return Objects.equals(this.name, decisionTreePayload.name) &&
        Objects.equals(this.description, decisionTreePayload.description) &&
        Objects.equals(this.secondaryId, decisionTreePayload.secondaryId) &&
        Objects.equals(this.metadata, decisionTreePayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, secondaryId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTreePayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

