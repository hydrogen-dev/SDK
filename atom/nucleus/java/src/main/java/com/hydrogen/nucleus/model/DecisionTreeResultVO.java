/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DecisionTreeResultVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class DecisionTreeResultVO {
  @SerializedName("entity_id")
  private List<UUID> entityId = null;

  @SerializedName("entity_type")
  private String entityType = null;

  public DecisionTreeResultVO entityId(List<UUID> entityId) {
    this.entityId = entityId;
    return this;
  }

  public DecisionTreeResultVO addEntityIdItem(UUID entityIdItem) {
    if (this.entityId == null) {
      this.entityId = new ArrayList<UUID>();
    }
    this.entityId.add(entityIdItem);
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getEntityId() {
    return entityId;
  }

  public void setEntityId(List<UUID> entityId) {
    this.entityId = entityId;
  }

  public DecisionTreeResultVO entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTreeResultVO decisionTreeResultVO = (DecisionTreeResultVO) o;
    return Objects.equals(this.entityId, decisionTreeResultVO.entityId) &&
        Objects.equals(this.entityType, decisionTreeResultVO.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTreeResultVO {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

