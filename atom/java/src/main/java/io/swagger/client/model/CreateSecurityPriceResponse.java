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
import io.swagger.client.model.SecurityPricePayload;
import java.io.IOException;
import java.util.UUID;

/**
 * CreateSecurityPriceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class CreateSecurityPriceResponse {
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

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateSecurityPriceResponse securityId(UUID securityId) {
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

  public CreateSecurityPriceResponse price(Double price) {
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

  public CreateSecurityPriceResponse date(String date) {
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

  public CreateSecurityPriceResponse adjustedPrice(Double adjustedPrice) {
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

  public CreateSecurityPriceResponse secondaryId(String secondaryId) {
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

  public CreateSecurityPriceResponse id(UUID id) {
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

  public CreateSecurityPriceResponse createDate(String createDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSecurityPriceResponse createSecurityPriceResponse = (CreateSecurityPriceResponse) o;
    return Objects.equals(this.securityId, createSecurityPriceResponse.securityId) &&
        Objects.equals(this.price, createSecurityPriceResponse.price) &&
        Objects.equals(this.date, createSecurityPriceResponse.date) &&
        Objects.equals(this.adjustedPrice, createSecurityPriceResponse.adjustedPrice) &&
        Objects.equals(this.secondaryId, createSecurityPriceResponse.secondaryId) &&
        Objects.equals(this.id, createSecurityPriceResponse.id) &&
        Objects.equals(this.createDate, createSecurityPriceResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, price, date, adjustedPrice, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSecurityPriceResponse {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    adjustedPrice: ").append(toIndentedString(adjustedPrice)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

