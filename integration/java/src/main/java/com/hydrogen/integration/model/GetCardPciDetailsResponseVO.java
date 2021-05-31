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
 * GetCardPciDetailsResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class GetCardPciDetailsResponseVO {
  @SerializedName("cvv")
  private String cvv = null;

  @SerializedName("expiry_date")
  private String expiryDate = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_card_id")
  private UUID nucleusCardId = null;

  @SerializedName("pan")
  private String pan = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public GetCardPciDetailsResponseVO cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

   /**
   * Get cvv
   * @return cvv
  **/
  @ApiModelProperty(value = "")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public GetCardPciDetailsResponseVO expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public GetCardPciDetailsResponseVO message(String message) {
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

  public GetCardPciDetailsResponseVO nucleusCardId(UUID nucleusCardId) {
    this.nucleusCardId = nucleusCardId;
    return this;
  }

   /**
   * Get nucleusCardId
   * @return nucleusCardId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusCardId() {
    return nucleusCardId;
  }

  public void setNucleusCardId(UUID nucleusCardId) {
    this.nucleusCardId = nucleusCardId;
  }

  public GetCardPciDetailsResponseVO pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @ApiModelProperty(value = "")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public GetCardPciDetailsResponseVO vendorName(String vendorName) {
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

  public GetCardPciDetailsResponseVO vendorResponse(Object vendorResponse) {
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
    GetCardPciDetailsResponseVO getCardPciDetailsResponseVO = (GetCardPciDetailsResponseVO) o;
    return Objects.equals(this.cvv, getCardPciDetailsResponseVO.cvv) &&
        Objects.equals(this.expiryDate, getCardPciDetailsResponseVO.expiryDate) &&
        Objects.equals(this.message, getCardPciDetailsResponseVO.message) &&
        Objects.equals(this.nucleusCardId, getCardPciDetailsResponseVO.nucleusCardId) &&
        Objects.equals(this.pan, getCardPciDetailsResponseVO.pan) &&
        Objects.equals(this.vendorName, getCardPciDetailsResponseVO.vendorName) &&
        Objects.equals(this.vendorResponse, getCardPciDetailsResponseVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvv, expiryDate, message, nucleusCardId, pan, vendorName, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardPciDetailsResponseVO {\n");
    
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusCardId: ").append(toIndentedString(nucleusCardId)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

