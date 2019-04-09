/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
 * SecurityPayloadSecurityCountry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class SecurityPayloadSecurityCountry {
  @SerializedName("country")
  private String country = null;

  @SerializedName("weight")
  private Double weight = null;

  public SecurityPayloadSecurityCountry country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the security is traded represented using their ISO ALPHA-2 Code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country where the security is traded represented using their ISO ALPHA-2 Code")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SecurityPayloadSecurityCountry weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the country as a percentage of the security; ex. 20 representing 20%. The weights of all the countries must add up to 100
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The weight of the country as a percentage of the security; ex. 20 representing 20%. The weights of all the countries must add up to 100")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPayloadSecurityCountry securityPayloadSecurityCountry = (SecurityPayloadSecurityCountry) o;
    return Objects.equals(this.country, securityPayloadSecurityCountry.country) &&
        Objects.equals(this.weight, securityPayloadSecurityCountry.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPayloadSecurityCountry {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
