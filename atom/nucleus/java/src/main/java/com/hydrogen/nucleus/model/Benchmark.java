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
import com.hydrogen.nucleus.model.BenchmarkComposition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Benchmark Object
 */
@ApiModel(description = "Benchmark Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Benchmark {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("composition")
  private List<BenchmarkComposition> composition = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Benchmark clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Benchmark composition(List<BenchmarkComposition> composition) {
    this.composition = composition;
    return this;
  }

  public Benchmark addCompositionItem(BenchmarkComposition compositionItem) {
    if (this.composition == null) {
      this.composition = new ArrayList<BenchmarkComposition>();
    }
    this.composition.add(compositionItem);
    return this;
  }

   /**
   * composition
   * @return composition
  **/
  @ApiModelProperty(example = "{}", value = "composition")
  public List<BenchmarkComposition> getComposition() {
    return composition;
  }

  public void setComposition(List<BenchmarkComposition> composition) {
    this.composition = composition;
  }

  public Benchmark createDate(OffsetDateTime createDate) {
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

  public Benchmark description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "sample", value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Benchmark id(UUID id) {
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

  public Benchmark isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Benchmark metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Benchmark putMetadataItem(String key, String metadataItem) {
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
  @ApiModelProperty(example = "{}", value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Benchmark name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(example = "XYZ", required = true, value = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Benchmark secondaryId(String secondaryId) {
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

  public Benchmark updateDate(OffsetDateTime updateDate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benchmark benchmark = (Benchmark) o;
    return Objects.equals(this.clientId, benchmark.clientId) &&
        Objects.equals(this.composition, benchmark.composition) &&
        Objects.equals(this.createDate, benchmark.createDate) &&
        Objects.equals(this.description, benchmark.description) &&
        Objects.equals(this.id, benchmark.id) &&
        Objects.equals(this.isActive, benchmark.isActive) &&
        Objects.equals(this.metadata, benchmark.metadata) &&
        Objects.equals(this.name, benchmark.name) &&
        Objects.equals(this.secondaryId, benchmark.secondaryId) &&
        Objects.equals(this.updateDate, benchmark.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, composition, createDate, description, id, isActive, metadata, name, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benchmark {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

