/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CreateSecurityPriceResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * SpecificSecurityPriceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class SpecificSecurityPriceResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("adjusted_price")
  private Double adjustedPrice = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificSecurityPriceResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the security price
   * @return id
  **/
  @ApiModelProperty(value = "ID of the security price")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificSecurityPriceResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the security price was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the security price was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificSecurityPriceResponse securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public SpecificSecurityPriceResponse price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Value for the price of the security
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Value for the price of the security")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public SpecificSecurityPriceResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date and for when the particular price was applicable for this security
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date and for when the particular price was applicable for this security")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public SpecificSecurityPriceResponse adjustedPrice(Double adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
    return this;
  }

   /**
   * Value for the adjusted price of the security
   * @return adjustedPrice
  **/
  @ApiModelProperty(value = "Value for the adjusted price of the security")
  public Double getAdjustedPrice() {
    return adjustedPrice;
  }

  public void setAdjustedPrice(Double adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
  }

  public SpecificSecurityPriceResponse secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public SpecificSecurityPriceResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the security price was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the security price was last updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificSecurityPriceResponse specificSecurityPriceResponse = (SpecificSecurityPriceResponse) o;
    return Objects.equals(this.id, specificSecurityPriceResponse.id) &&
        Objects.equals(this.createDate, specificSecurityPriceResponse.createDate) &&
        Objects.equals(this.securityId, specificSecurityPriceResponse.securityId) &&
        Objects.equals(this.price, specificSecurityPriceResponse.price) &&
        Objects.equals(this.date, specificSecurityPriceResponse.date) &&
        Objects.equals(this.adjustedPrice, specificSecurityPriceResponse.adjustedPrice) &&
        Objects.equals(this.secondaryId, specificSecurityPriceResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificSecurityPriceResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, securityId, price, date, adjustedPrice, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificSecurityPriceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    adjustedPrice: ").append(toIndentedString(adjustedPrice)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

