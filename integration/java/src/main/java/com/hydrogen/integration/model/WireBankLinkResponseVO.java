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
import com.hydrogen.integration.model.BankLinkVendorDataVO;
import java.io.IOException;
import java.util.UUID;

/**
 * WireBankLinkResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class WireBankLinkResponseVO {
  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_bank_link_id")
  private UUID nucleusBankLinkId = null;

  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_request_data")
  private BankLinkVendorDataVO vendorRequestData = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public WireBankLinkResponseVO message(String message) {
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

  public WireBankLinkResponseVO nucleusBankLinkId(UUID nucleusBankLinkId) {
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

  public WireBankLinkResponseVO nucleusClientId(UUID nucleusClientId) {
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

  public WireBankLinkResponseVO status(String status) {
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

  public WireBankLinkResponseVO vendorName(String vendorName) {
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

  public WireBankLinkResponseVO vendorRequestData(BankLinkVendorDataVO vendorRequestData) {
    this.vendorRequestData = vendorRequestData;
    return this;
  }

   /**
   * Get vendorRequestData
   * @return vendorRequestData
  **/
  @ApiModelProperty(value = "")
  public BankLinkVendorDataVO getVendorRequestData() {
    return vendorRequestData;
  }

  public void setVendorRequestData(BankLinkVendorDataVO vendorRequestData) {
    this.vendorRequestData = vendorRequestData;
  }

  public WireBankLinkResponseVO vendorResponse(Object vendorResponse) {
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
    WireBankLinkResponseVO wireBankLinkResponseVO = (WireBankLinkResponseVO) o;
    return Objects.equals(this.message, wireBankLinkResponseVO.message) &&
        Objects.equals(this.nucleusBankLinkId, wireBankLinkResponseVO.nucleusBankLinkId) &&
        Objects.equals(this.nucleusClientId, wireBankLinkResponseVO.nucleusClientId) &&
        Objects.equals(this.status, wireBankLinkResponseVO.status) &&
        Objects.equals(this.vendorName, wireBankLinkResponseVO.vendorName) &&
        Objects.equals(this.vendorRequestData, wireBankLinkResponseVO.vendorRequestData) &&
        Objects.equals(this.vendorResponse, wireBankLinkResponseVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, nucleusBankLinkId, nucleusClientId, status, vendorName, vendorRequestData, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireBankLinkResponseVO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusBankLinkId: ").append(toIndentedString(nucleusBankLinkId)).append("\n");
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorRequestData: ").append(toIndentedString(vendorRequestData)).append("\n");
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

