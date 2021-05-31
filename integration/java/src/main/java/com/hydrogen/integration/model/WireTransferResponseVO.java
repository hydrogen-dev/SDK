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
 * WireTransferResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class WireTransferResponseVO {
  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_funding_id")
  private UUID nucleusFundingId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_request")
  private Object vendorRequest = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public WireTransferResponseVO message(String message) {
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

  public WireTransferResponseVO nucleusFundingId(UUID nucleusFundingId) {
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

  public WireTransferResponseVO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WireTransferResponseVO vendorName(String vendorName) {
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

  public WireTransferResponseVO vendorRequest(Object vendorRequest) {
    this.vendorRequest = vendorRequest;
    return this;
  }

   /**
   * Get vendorRequest
   * @return vendorRequest
  **/
  @ApiModelProperty(value = "")
  public Object getVendorRequest() {
    return vendorRequest;
  }

  public void setVendorRequest(Object vendorRequest) {
    this.vendorRequest = vendorRequest;
  }

  public WireTransferResponseVO vendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
    return this;
  }

   /**
   * Get vendorResponse
   * @return vendorResponse
  **/
  @ApiModelProperty(value = "")
  public Object getVendorResponse() {
    return vendorResponse;
  }

  public void setVendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransferResponseVO wireTransferResponseVO = (WireTransferResponseVO) o;
    return Objects.equals(this.message, wireTransferResponseVO.message) &&
        Objects.equals(this.nucleusFundingId, wireTransferResponseVO.nucleusFundingId) &&
        Objects.equals(this.status, wireTransferResponseVO.status) &&
        Objects.equals(this.vendorName, wireTransferResponseVO.vendorName) &&
        Objects.equals(this.vendorRequest, wireTransferResponseVO.vendorRequest) &&
        Objects.equals(this.vendorResponse, wireTransferResponseVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, nucleusFundingId, status, vendorName, vendorRequest, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransferResponseVO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusFundingId: ").append(toIndentedString(nucleusFundingId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorRequest: ").append(toIndentedString(vendorRequest)).append("\n");
    sb.append("    vendorResponse: ").append(toIndentedString(vendorResponse)).append("\n");
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

