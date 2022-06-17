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
 * CardLoadRequestCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T10:53:10.172Z")
public class CardLoadRequestCO {
  @SerializedName("nucleus_funding_id")
  private UUID nucleusFundingId = null;

  @SerializedName("reason")
  private String reason = null;

  public CardLoadRequestCO nucleusFundingId(UUID nucleusFundingId) {
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

  public CardLoadRequestCO reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardLoadRequestCO cardLoadRequestCO = (CardLoadRequestCO) o;
    return Objects.equals(this.nucleusFundingId, cardLoadRequestCO.nucleusFundingId) &&
        Objects.equals(this.reason, cardLoadRequestCO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusFundingId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardLoadRequestCO {\n");
    
    sb.append("    nucleusFundingId: ").append(toIndentedString(nucleusFundingId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

