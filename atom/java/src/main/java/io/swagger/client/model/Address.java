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
import java.io.IOException;

/**
 * Address details for the client
 */
@ApiModel(description = "Address details for the client")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class Address {
  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("postalcode")
  private String postalcode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("type")
  private String type = null;

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Primary information for the street address, such as the street and building number
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "Primary information for the street address, such as the street and building number")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Secondary information for the street address, such as a suite or apartment number
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Secondary information for the street address, such as a suite or apartment number")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City for the address
   * @return city
  **/
  @ApiModelProperty(value = "City for the address")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State, province, or sub-country region for the address
   * @return state
  **/
  @ApiModelProperty(required = true, value = "State, province, or sub-country region for the address")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

   /**
   * Alphanumeric postal code or zip code for the address
   * @return postalcode
  **/
  @ApiModelProperty(value = "Alphanumeric postal code or zip code for the address")
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country for the address using the ISO ALPHA-2 Code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country for the address using the ISO ALPHA-2 Code")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of address such as “home”, “work”, “billing”, “mailing”, etc. This is used to differentiate between multiple addresses provided
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of address such as “home”, “work”, “billing”, “mailing”, etc. This is used to differentiate between multiple addresses provided")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalcode, address.postalcode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.type, address.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, state, postalcode, country, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

