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
import com.hydrogen.integration.model.AggregationAccountBalance;
import java.io.IOException;
import java.util.UUID;

/**
 * AggregationAccountBalanceResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class AggregationAccountBalanceResponseVO {
  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_aggregation_account_id")
  private UUID nucleusAggregationAccountId = null;

  @SerializedName("nucleus_balance_posted")
  private AggregationAccountBalance nucleusBalancePosted = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  public AggregationAccountBalanceResponseVO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AggregationAccountBalanceResponseVO nucleusAggregationAccountId(UUID nucleusAggregationAccountId) {
    this.nucleusAggregationAccountId = nucleusAggregationAccountId;
    return this;
  }

   /**
   * Get nucleusAggregationAccountId
   * @return nucleusAggregationAccountId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusAggregationAccountId() {
    return nucleusAggregationAccountId;
  }

  public void setNucleusAggregationAccountId(UUID nucleusAggregationAccountId) {
    this.nucleusAggregationAccountId = nucleusAggregationAccountId;
  }

  public AggregationAccountBalanceResponseVO nucleusBalancePosted(AggregationAccountBalance nucleusBalancePosted) {
    this.nucleusBalancePosted = nucleusBalancePosted;
    return this;
  }

   /**
   * Get nucleusBalancePosted
   * @return nucleusBalancePosted
  **/
  @ApiModelProperty(value = "")
  public AggregationAccountBalance getNucleusBalancePosted() {
    return nucleusBalancePosted;
  }

  public void setNucleusBalancePosted(AggregationAccountBalance nucleusBalancePosted) {
    this.nucleusBalancePosted = nucleusBalancePosted;
  }

  public AggregationAccountBalanceResponseVO vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationAccountBalanceResponseVO aggregationAccountBalanceResponseVO = (AggregationAccountBalanceResponseVO) o;
    return Objects.equals(this.message, aggregationAccountBalanceResponseVO.message) &&
        Objects.equals(this.nucleusAggregationAccountId, aggregationAccountBalanceResponseVO.nucleusAggregationAccountId) &&
        Objects.equals(this.nucleusBalancePosted, aggregationAccountBalanceResponseVO.nucleusBalancePosted) &&
        Objects.equals(this.vendorName, aggregationAccountBalanceResponseVO.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, nucleusAggregationAccountId, nucleusBalancePosted, vendorName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationAccountBalanceResponseVO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusAggregationAccountId: ").append(toIndentedString(nucleusAggregationAccountId)).append("\n");
    sb.append("    nucleusBalancePosted: ").append(toIndentedString(nucleusBalancePosted)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

