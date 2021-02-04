/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

/**
 * Ownership Object
 */
@ApiModel(description = "Ownership Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-28T16:21:02.928Z")



public class Ownership {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("is_beneficial")
  private Boolean isBeneficial = null;

  @SerializedName("is_primary")
  private Boolean isPrimary = null;

  @SerializedName("percent_ownership")
  private Double percentOwnership = null;

  @SerializedName("role")
  private String role = null;

  public Ownership clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "5cc48294-5f28-41f2-8eb4-898e83932327", required = true, value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Ownership isBeneficial(Boolean isBeneficial) {
    this.isBeneficial = isBeneficial;
    return this;
  }

   /**
   * is_beneficial
   * @return isBeneficial
  **/
  @ApiModelProperty(example = "false", value = "is_beneficial")
  public Boolean isIsBeneficial() {
    return isBeneficial;
  }

  public void setIsBeneficial(Boolean isBeneficial) {
    this.isBeneficial = isBeneficial;
  }

  public Ownership isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * is_primary
   * @return isPrimary
  **/
  @ApiModelProperty(example = "false", value = "is_primary")
  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public Ownership percentOwnership(Double percentOwnership) {
    this.percentOwnership = percentOwnership;
    return this;
  }

   /**
   * percent_ownership
   * @return percentOwnership
  **/
  @ApiModelProperty(example = "0.25", value = "percent_ownership")
  public Double getPercentOwnership() {
    return percentOwnership;
  }

  public void setPercentOwnership(Double percentOwnership) {
    this.percentOwnership = percentOwnership;
  }

  public Ownership role(String role) {
    this.role = role;
    return this;
  }

   /**
   * role
   * @return role
  **/
  @ApiModelProperty(example = "officer", required = true, value = "role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ownership ownership = (Ownership) o;
    return Objects.equals(this.clientId, ownership.clientId) &&
        Objects.equals(this.isBeneficial, ownership.isBeneficial) &&
        Objects.equals(this.isPrimary, ownership.isPrimary) &&
        Objects.equals(this.percentOwnership, ownership.percentOwnership) &&
        Objects.equals(this.role, ownership.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, isBeneficial, isPrimary, percentOwnership, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ownership {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    isBeneficial: ").append(toIndentedString(isBeneficial)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    percentOwnership: ").append(toIndentedString(percentOwnership)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
