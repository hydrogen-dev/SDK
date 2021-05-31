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
import com.hydrogen.nucleus.model.AllocationCompositionAggregatedVO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * AllocationAggregatedVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class AllocationAggregatedVO {
  @SerializedName("allocation_category")
  private String allocationCategory = null;

  @SerializedName("allocation_compositions")
  private List<AllocationCompositionAggregatedVO> allocationCompositions = null;

  @SerializedName("allocation_description")
  private String allocationDescription = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("allocation_name")
  private String allocationName = null;

  @SerializedName("allocation_secondary_id")
  private String allocationSecondaryId = null;

  public AllocationAggregatedVO allocationCategory(String allocationCategory) {
    this.allocationCategory = allocationCategory;
    return this;
  }

   /**
   * Get allocationCategory
   * @return allocationCategory
  **/
  @ApiModelProperty(value = "")
  public String getAllocationCategory() {
    return allocationCategory;
  }

  public void setAllocationCategory(String allocationCategory) {
    this.allocationCategory = allocationCategory;
  }

  public AllocationAggregatedVO allocationCompositions(List<AllocationCompositionAggregatedVO> allocationCompositions) {
    this.allocationCompositions = allocationCompositions;
    return this;
  }

  public AllocationAggregatedVO addAllocationCompositionsItem(AllocationCompositionAggregatedVO allocationCompositionsItem) {
    if (this.allocationCompositions == null) {
      this.allocationCompositions = new ArrayList<AllocationCompositionAggregatedVO>();
    }
    this.allocationCompositions.add(allocationCompositionsItem);
    return this;
  }

   /**
   * Get allocationCompositions
   * @return allocationCompositions
  **/
  @ApiModelProperty(value = "")
  public List<AllocationCompositionAggregatedVO> getAllocationCompositions() {
    return allocationCompositions;
  }

  public void setAllocationCompositions(List<AllocationCompositionAggregatedVO> allocationCompositions) {
    this.allocationCompositions = allocationCompositions;
  }

  public AllocationAggregatedVO allocationDescription(String allocationDescription) {
    this.allocationDescription = allocationDescription;
    return this;
  }

   /**
   * Get allocationDescription
   * @return allocationDescription
  **/
  @ApiModelProperty(value = "")
  public String getAllocationDescription() {
    return allocationDescription;
  }

  public void setAllocationDescription(String allocationDescription) {
    this.allocationDescription = allocationDescription;
  }

  public AllocationAggregatedVO allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @ApiModelProperty(value = "")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public AllocationAggregatedVO allocationName(String allocationName) {
    this.allocationName = allocationName;
    return this;
  }

   /**
   * Get allocationName
   * @return allocationName
  **/
  @ApiModelProperty(value = "")
  public String getAllocationName() {
    return allocationName;
  }

  public void setAllocationName(String allocationName) {
    this.allocationName = allocationName;
  }

  public AllocationAggregatedVO allocationSecondaryId(String allocationSecondaryId) {
    this.allocationSecondaryId = allocationSecondaryId;
    return this;
  }

   /**
   * Get allocationSecondaryId
   * @return allocationSecondaryId
  **/
  @ApiModelProperty(value = "")
  public String getAllocationSecondaryId() {
    return allocationSecondaryId;
  }

  public void setAllocationSecondaryId(String allocationSecondaryId) {
    this.allocationSecondaryId = allocationSecondaryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationAggregatedVO allocationAggregatedVO = (AllocationAggregatedVO) o;
    return Objects.equals(this.allocationCategory, allocationAggregatedVO.allocationCategory) &&
        Objects.equals(this.allocationCompositions, allocationAggregatedVO.allocationCompositions) &&
        Objects.equals(this.allocationDescription, allocationAggregatedVO.allocationDescription) &&
        Objects.equals(this.allocationId, allocationAggregatedVO.allocationId) &&
        Objects.equals(this.allocationName, allocationAggregatedVO.allocationName) &&
        Objects.equals(this.allocationSecondaryId, allocationAggregatedVO.allocationSecondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationCategory, allocationCompositions, allocationDescription, allocationId, allocationName, allocationSecondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationAggregatedVO {\n");
    
    sb.append("    allocationCategory: ").append(toIndentedString(allocationCategory)).append("\n");
    sb.append("    allocationCompositions: ").append(toIndentedString(allocationCompositions)).append("\n");
    sb.append("    allocationDescription: ").append(toIndentedString(allocationDescription)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    allocationName: ").append(toIndentedString(allocationName)).append("\n");
    sb.append("    allocationSecondaryId: ").append(toIndentedString(allocationSecondaryId)).append("\n");
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

