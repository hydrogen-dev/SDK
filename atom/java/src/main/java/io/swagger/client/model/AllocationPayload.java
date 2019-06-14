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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * AllocationPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class AllocationPayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("benchmark_id")
  private UUID benchmarkId = null;

  @SerializedName("inception_date")
  private LocalDate inceptionDate = null;

  @SerializedName("node_map")
  private List<Map<String, UUID>> nodeMap = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public AllocationPayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the allocation
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the allocation")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AllocationPayload category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Description of the allocation
   * @return category
  **/
  @ApiModelProperty(value = "Description of the allocation")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AllocationPayload clientId(UUID clientId) {
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

  public AllocationPayload benchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

   /**
   * The ID for the benchmark that the allocation should be compared to
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The ID for the benchmark that the allocation should be compared to")
  public UUID getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(UUID benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public AllocationPayload inceptionDate(LocalDate inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

   /**
   * Date that the allocation first was managed
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "Date that the allocation first was managed")
  public LocalDate getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(LocalDate inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public AllocationPayload nodeMap(List<Map<String, UUID>> nodeMap) {
    this.nodeMap = nodeMap;
    return this;
  }

  public AllocationPayload addNodeMapItem(Map<String, UUID> nodeMapItem) {
    if (this.nodeMap == null) {
      this.nodeMap = new ArrayList<Map<String, UUID>>();
    }
    this.nodeMap.add(nodeMapItem);
    return this;
  }

   /**
   * List of nodes in a decision tree that map to the allocation
   * @return nodeMap
  **/
  @ApiModelProperty(value = "List of nodes in a decision tree that map to the allocation")
  public List<Map<String, UUID>> getNodeMap() {
    return nodeMap;
  }

  public void setNodeMap(List<Map<String, UUID>> nodeMap) {
    this.nodeMap = nodeMap;
  }

  public AllocationPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the allocation in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the allocation in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public AllocationPayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicator if this allocation is active. Default is true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicator if this allocation is active. Default is true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AllocationPayload secondaryId(String secondaryId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationPayload allocationPayload = (AllocationPayload) o;
    return Objects.equals(this.name, allocationPayload.name) &&
        Objects.equals(this.category, allocationPayload.category) &&
        Objects.equals(this.clientId, allocationPayload.clientId) &&
        Objects.equals(this.benchmarkId, allocationPayload.benchmarkId) &&
        Objects.equals(this.inceptionDate, allocationPayload.inceptionDate) &&
        Objects.equals(this.nodeMap, allocationPayload.nodeMap) &&
        Objects.equals(this.metadata, allocationPayload.metadata) &&
        Objects.equals(this.isActive, allocationPayload.isActive) &&
        Objects.equals(this.secondaryId, allocationPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, clientId, benchmarkId, inceptionDate, nodeMap, metadata, isActive, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationPayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    nodeMap: ").append(toIndentedString(nodeMap)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

