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
 * NodeRelationship Object
 */
@ApiModel(description = "NodeRelationship Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class NodeRelationship {
  @SerializedName("answer_id")
  private UUID answerId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("decision_tree_id")
  private UUID decisionTreeId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_leaf")
  private Boolean isLeaf = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("node_child_id")
  private UUID nodeChildId = null;

  @SerializedName("node_parent_id")
  private UUID nodeParentId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("value")
  private String value = null;

  public NodeRelationship answerId(UUID answerId) {
    this.answerId = answerId;
    return this;
  }

   /**
   * answer_id
   * @return answerId
  **/
  @ApiModelProperty(example = "3942c6b8-5107-4283-b7d4-7b24629fd12f", required = true, value = "answer_id")
  public UUID getAnswerId() {
    return answerId;
  }

  public void setAnswerId(UUID answerId) {
    this.answerId = answerId;
  }

  public NodeRelationship createDate(OffsetDateTime createDate) {
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

  public NodeRelationship decisionTreeId(UUID decisionTreeId) {
    this.decisionTreeId = decisionTreeId;
    return this;
  }

   /**
   * decision_tree_id
   * @return decisionTreeId
  **/
  @ApiModelProperty(example = "169b1e70-f321-4f56-883e-ec16bfc5017c", required = true, value = "decision_tree_id")
  public UUID getDecisionTreeId() {
    return decisionTreeId;
  }

  public void setDecisionTreeId(UUID decisionTreeId) {
    this.decisionTreeId = decisionTreeId;
  }

  public NodeRelationship id(UUID id) {
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

  public NodeRelationship isLeaf(Boolean isLeaf) {
    this.isLeaf = isLeaf;
    return this;
  }

   /**
   * is_leaf
   * @return isLeaf
  **/
  @ApiModelProperty(example = "true", value = "is_leaf")
  public Boolean isIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(Boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  public NodeRelationship metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public NodeRelationship putMetadataItem(String key, String metadataItem) {
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

  public NodeRelationship nodeChildId(UUID nodeChildId) {
    this.nodeChildId = nodeChildId;
    return this;
  }

   /**
   * nodeChildId
   * @return nodeChildId
  **/
  @ApiModelProperty(example = "e6fd4152-6d7a-4882-9f0b-9d0df6eb6d11", value = "nodeChildId")
  public UUID getNodeChildId() {
    return nodeChildId;
  }

  public void setNodeChildId(UUID nodeChildId) {
    this.nodeChildId = nodeChildId;
  }

  public NodeRelationship nodeParentId(UUID nodeParentId) {
    this.nodeParentId = nodeParentId;
    return this;
  }

   /**
   * nodeParentId
   * @return nodeParentId
  **/
  @ApiModelProperty(example = "6e14259a-9a68-4593-9e6d-8fcd0d05cf44", required = true, value = "nodeParentId")
  public UUID getNodeParentId() {
    return nodeParentId;
  }

  public void setNodeParentId(UUID nodeParentId) {
    this.nodeParentId = nodeParentId;
  }

  public NodeRelationship secondaryId(String secondaryId) {
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

  public NodeRelationship updateDate(OffsetDateTime updateDate) {
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

  public NodeRelationship value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(example = "29 Years", required = true, value = "value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRelationship nodeRelationship = (NodeRelationship) o;
    return Objects.equals(this.answerId, nodeRelationship.answerId) &&
        Objects.equals(this.createDate, nodeRelationship.createDate) &&
        Objects.equals(this.decisionTreeId, nodeRelationship.decisionTreeId) &&
        Objects.equals(this.id, nodeRelationship.id) &&
        Objects.equals(this.isLeaf, nodeRelationship.isLeaf) &&
        Objects.equals(this.metadata, nodeRelationship.metadata) &&
        Objects.equals(this.nodeChildId, nodeRelationship.nodeChildId) &&
        Objects.equals(this.nodeParentId, nodeRelationship.nodeParentId) &&
        Objects.equals(this.secondaryId, nodeRelationship.secondaryId) &&
        Objects.equals(this.updateDate, nodeRelationship.updateDate) &&
        Objects.equals(this.value, nodeRelationship.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, createDate, decisionTreeId, id, isLeaf, metadata, nodeChildId, nodeParentId, secondaryId, updateDate, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRelationship {\n");
    
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    decisionTreeId: ").append(toIndentedString(decisionTreeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLeaf: ").append(toIndentedString(isLeaf)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nodeChildId: ").append(toIndentedString(nodeChildId)).append("\n");
    sb.append("    nodeParentId: ").append(toIndentedString(nodeParentId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

