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
 * Change record over the entire analysis date range
 */
@ApiModel(description = "Change record over the entire analysis date range")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialPictureResponseChangeTotalAssetsTotal {
  @SerializedName("value")
  private Double value = null;

  @SerializedName("percentage")
  private Double percentage = null;

  public FinancialPictureResponseChangeTotalAssetsTotal value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Total value change over the entire analysis date range
   * @return value
  **/
  @ApiModelProperty(value = "Total value change over the entire analysis date range")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public FinancialPictureResponseChangeTotalAssetsTotal percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Total percentage change over the entire analysis date range
   * @return percentage
  **/
  @ApiModelProperty(value = "Total percentage change over the entire analysis date range")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseChangeTotalAssetsTotal financialPictureResponseChangeTotalAssetsTotal = (FinancialPictureResponseChangeTotalAssetsTotal) o;
    return Objects.equals(this.value, financialPictureResponseChangeTotalAssetsTotal.value) &&
        Objects.equals(this.percentage, financialPictureResponseChangeTotalAssetsTotal.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseChangeTotalAssetsTotal {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

