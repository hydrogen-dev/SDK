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
import java.util.UUID;

/**
 * CardAutoReloadRequestCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class CardAutoReloadRequestCO {
  @SerializedName("nucleus_bank_link_id")
  private UUID nucleusBankLinkId = null;

  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  @SerializedName("reload_amount")
  private Double reloadAmount = null;

  @SerializedName("threshold_amount")
  private Double thresholdAmount = null;

  public CardAutoReloadRequestCO nucleusBankLinkId(UUID nucleusBankLinkId) {
    this.nucleusBankLinkId = nucleusBankLinkId;
    return this;
  }

   /**
   * Get nucleusBankLinkId
   * @return nucleusBankLinkId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusBankLinkId() {
    return nucleusBankLinkId;
  }

  public void setNucleusBankLinkId(UUID nucleusBankLinkId) {
    this.nucleusBankLinkId = nucleusBankLinkId;
  }

  public CardAutoReloadRequestCO nucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
    return this;
  }

   /**
   * Get nucleusClientId
   * @return nucleusClientId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusClientId() {
    return nucleusClientId;
  }

  public void setNucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
  }

  public CardAutoReloadRequestCO reloadAmount(Double reloadAmount) {
    this.reloadAmount = reloadAmount;
    return this;
  }

   /**
   * Get reloadAmount
   * @return reloadAmount
  **/
  @ApiModelProperty(value = "")
  public Double getReloadAmount() {
    return reloadAmount;
  }

  public void setReloadAmount(Double reloadAmount) {
    this.reloadAmount = reloadAmount;
  }

  public CardAutoReloadRequestCO thresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
    return this;
  }

   /**
   * Get thresholdAmount
   * @return thresholdAmount
  **/
  @ApiModelProperty(value = "")
  public Double getThresholdAmount() {
    return thresholdAmount;
  }

  public void setThresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAutoReloadRequestCO cardAutoReloadRequestCO = (CardAutoReloadRequestCO) o;
    return Objects.equals(this.nucleusBankLinkId, cardAutoReloadRequestCO.nucleusBankLinkId) &&
        Objects.equals(this.nucleusClientId, cardAutoReloadRequestCO.nucleusClientId) &&
        Objects.equals(this.reloadAmount, cardAutoReloadRequestCO.reloadAmount) &&
        Objects.equals(this.thresholdAmount, cardAutoReloadRequestCO.thresholdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusBankLinkId, nucleusClientId, reloadAmount, thresholdAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAutoReloadRequestCO {\n");
    
    sb.append("    nucleusBankLinkId: ").append(toIndentedString(nucleusBankLinkId)).append("\n");
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    reloadAmount: ").append(toIndentedString(reloadAmount)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
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

