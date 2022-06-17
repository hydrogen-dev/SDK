/*
 * Hydrogen Electron API
 * The Hydrogen Electron API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.electron.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

/**
 * CardSpendingControlRequestCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T10:53:10.172Z")
public class CardSpendingControlRequestCO {
  @SerializedName("nucleus_spending_control_id")
  private UUID nucleusSpendingControlId = null;

  public CardSpendingControlRequestCO nucleusSpendingControlId(UUID nucleusSpendingControlId) {
    this.nucleusSpendingControlId = nucleusSpendingControlId;
    return this;
  }

   /**
   * Get nucleusSpendingControlId
   * @return nucleusSpendingControlId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusSpendingControlId() {
    return nucleusSpendingControlId;
  }

  public void setNucleusSpendingControlId(UUID nucleusSpendingControlId) {
    this.nucleusSpendingControlId = nucleusSpendingControlId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardSpendingControlRequestCO cardSpendingControlRequestCO = (CardSpendingControlRequestCO) o;
    return Objects.equals(this.nucleusSpendingControlId, cardSpendingControlRequestCO.nucleusSpendingControlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusSpendingControlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardSpendingControlRequestCO {\n");
    
    sb.append("    nucleusSpendingControlId: ").append(toIndentedString(nucleusSpendingControlId)).append("\n");
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

