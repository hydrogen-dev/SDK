/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
import io.swagger.client.model.CreateAllocationResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * SpecificAllocationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class SpecificAllocationResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

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
  private List<UUID> nodeMap = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificAllocationResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the allocation
   * @return id
  **/
  @ApiModelProperty(value = "ID of the allocation")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificAllocationResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the allocation was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the allocation was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificAllocationResponse name(String name) {
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

  public SpecificAllocationResponse category(String category) {
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

  public SpecificAllocationResponse clientId(UUID clientId) {
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

  public SpecificAllocationResponse benchmarkId(UUID benchmarkId) {
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

  public SpecificAllocationResponse inceptionDate(LocalDate inceptionDate) {
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

  public SpecificAllocationResponse nodeMap(List<UUID> nodeMap) {
    this.nodeMap = nodeMap;
    return this;
  }

  public SpecificAllocationResponse addNodeMapItem(UUID nodeMapItem) {
    if (this.nodeMap == null) {
      this.nodeMap = new ArrayList<UUID>();
    }
    this.nodeMap.add(nodeMapItem);
    return this;
  }

   /**
   * List of nodes in a decision tree that map to the allocation
   * @return nodeMap
  **/
  @ApiModelProperty(value = "List of nodes in a decision tree that map to the allocation")
  public List<UUID> getNodeMap() {
    return nodeMap;
  }

  public void setNodeMap(List<UUID> nodeMap) {
    this.nodeMap = nodeMap;
  }

  public SpecificAllocationResponse metadata(Object metadata) {
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

  public SpecificAllocationResponse isActive(Boolean isActive) {
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

  public SpecificAllocationResponse secondaryId(String secondaryId) {
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

  public SpecificAllocationResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Latest datetime the allocation was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Latest datetime the allocation was updated")
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
    SpecificAllocationResponse specificAllocationResponse = (SpecificAllocationResponse) o;
    return Objects.equals(this.id, specificAllocationResponse.id) &&
        Objects.equals(this.createDate, specificAllocationResponse.createDate) &&
        Objects.equals(this.name, specificAllocationResponse.name) &&
        Objects.equals(this.category, specificAllocationResponse.category) &&
        Objects.equals(this.clientId, specificAllocationResponse.clientId) &&
        Objects.equals(this.benchmarkId, specificAllocationResponse.benchmarkId) &&
        Objects.equals(this.inceptionDate, specificAllocationResponse.inceptionDate) &&
        Objects.equals(this.nodeMap, specificAllocationResponse.nodeMap) &&
        Objects.equals(this.metadata, specificAllocationResponse.metadata) &&
        Objects.equals(this.isActive, specificAllocationResponse.isActive) &&
        Objects.equals(this.secondaryId, specificAllocationResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificAllocationResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, name, category, clientId, benchmarkId, inceptionDate, nodeMap, metadata, isActive, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificAllocationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    nodeMap: ").append(toIndentedString(nodeMap)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
