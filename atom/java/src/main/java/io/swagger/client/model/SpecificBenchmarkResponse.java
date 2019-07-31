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
import io.swagger.client.model.BenchmarkPayloadComposition;
import io.swagger.client.model.CreateBenchmarkResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SpecificBenchmarkResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SpecificBenchmarkResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("composition")
  private List<BenchmarkPayloadComposition> composition = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificBenchmarkResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the benchmark
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the benchmark")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpecificBenchmarkResponse composition(List<BenchmarkPayloadComposition> composition) {
    this.composition = composition;
    return this;
  }

  public SpecificBenchmarkResponse addCompositionItem(BenchmarkPayloadComposition compositionItem) {
    if (this.composition == null) {
      this.composition = new ArrayList<BenchmarkPayloadComposition>();
    }
    this.composition.add(compositionItem);
    return this;
  }

   /**
   * Get composition
   * @return composition
  **/
  @ApiModelProperty(value = "")
  public List<BenchmarkPayloadComposition> getComposition() {
    return composition;
  }

  public void setComposition(List<BenchmarkPayloadComposition> composition) {
    this.composition = composition;
  }

  public SpecificBenchmarkResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the benchmark such as the market segment that it represents
   * @return description
  **/
  @ApiModelProperty(value = "Description of the benchmark such as the market segment that it represents")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SpecificBenchmarkResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client to which the benchmark belongs, if any
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID of the client to which the benchmark belongs, if any")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SpecificBenchmarkResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the benchmark is active. Defaults to true which means it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the benchmark is active. Defaults to true which means it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SpecificBenchmarkResponse secondaryId(String secondaryId) {
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

  public SpecificBenchmarkResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the benchmark record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the benchmark record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificBenchmarkResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the benchmark was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the benchmark was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificBenchmarkResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Latest datetime the benchmark was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Latest datetime the benchmark was updated")
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
    SpecificBenchmarkResponse specificBenchmarkResponse = (SpecificBenchmarkResponse) o;
    return Objects.equals(this.name, specificBenchmarkResponse.name) &&
        Objects.equals(this.composition, specificBenchmarkResponse.composition) &&
        Objects.equals(this.description, specificBenchmarkResponse.description) &&
        Objects.equals(this.clientId, specificBenchmarkResponse.clientId) &&
        Objects.equals(this.isActive, specificBenchmarkResponse.isActive) &&
        Objects.equals(this.secondaryId, specificBenchmarkResponse.secondaryId) &&
        Objects.equals(this.id, specificBenchmarkResponse.id) &&
        Objects.equals(this.createDate, specificBenchmarkResponse.createDate) &&
        Objects.equals(this.updateDate, specificBenchmarkResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, composition, description, clientId, isActive, secondaryId, id, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificBenchmarkResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

