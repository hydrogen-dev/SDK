/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

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
 * BrokerageUpdateClientCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class BrokerageUpdateClientCO {
  @SerializedName("nucleus_document_ids")
  private List<UUID> nucleusDocumentIds = null;

  public BrokerageUpdateClientCO nucleusDocumentIds(List<UUID> nucleusDocumentIds) {
    this.nucleusDocumentIds = nucleusDocumentIds;
    return this;
  }

  public BrokerageUpdateClientCO addNucleusDocumentIdsItem(UUID nucleusDocumentIdsItem) {
    if (this.nucleusDocumentIds == null) {
      this.nucleusDocumentIds = new ArrayList<UUID>();
    }
    this.nucleusDocumentIds.add(nucleusDocumentIdsItem);
    return this;
  }

   /**
   * Get nucleusDocumentIds
   * @return nucleusDocumentIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getNucleusDocumentIds() {
    return nucleusDocumentIds;
  }

  public void setNucleusDocumentIds(List<UUID> nucleusDocumentIds) {
    this.nucleusDocumentIds = nucleusDocumentIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrokerageUpdateClientCO brokerageUpdateClientCO = (BrokerageUpdateClientCO) o;
    return Objects.equals(this.nucleusDocumentIds, brokerageUpdateClientCO.nucleusDocumentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusDocumentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerageUpdateClientCO {\n");
    
    sb.append("    nucleusDocumentIds: ").append(toIndentedString(nucleusDocumentIds)).append("\n");
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

