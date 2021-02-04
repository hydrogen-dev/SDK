/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

/**
 * BrokerageWithdrawalCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-12T07:38:36.822Z")
public class BrokerageWithdrawalCO {
  @SerializedName("nucleus_funding_id")
  private UUID nucleusFundingId = null;

  public BrokerageWithdrawalCO nucleusFundingId(UUID nucleusFundingId) {
    this.nucleusFundingId = nucleusFundingId;
    return this;
  }

   /**
   * Get nucleusFundingId
   * @return nucleusFundingId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusFundingId() {
    return nucleusFundingId;
  }

  public void setNucleusFundingId(UUID nucleusFundingId) {
    this.nucleusFundingId = nucleusFundingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrokerageWithdrawalCO brokerageWithdrawalCO = (BrokerageWithdrawalCO) o;
    return Objects.equals(this.nucleusFundingId, brokerageWithdrawalCO.nucleusFundingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusFundingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerageWithdrawalCO {\n");
    
    sb.append("    nucleusFundingId: ").append(toIndentedString(nucleusFundingId)).append("\n");
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
