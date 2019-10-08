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
 * BenchmarkAssetSizeResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class BenchmarkAssetSizeResponseInner {
  @SerializedName("date")
  private String date = null;

  @SerializedName("value")
  private Double value = null;

  public BenchmarkAssetSizeResponseInner date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date for this asset size record
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date for this asset size record")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BenchmarkAssetSizeResponseInner value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * “Growth of a dollar” within the benchmark on the particular date
   * @return value
  **/
  @ApiModelProperty(required = true, value = "“Growth of a dollar” within the benchmark on the particular date")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkAssetSizeResponseInner benchmarkAssetSizeResponseInner = (BenchmarkAssetSizeResponseInner) o;
    return Objects.equals(this.date, benchmarkAssetSizeResponseInner.date) &&
        Objects.equals(this.value, benchmarkAssetSizeResponseInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkAssetSizeResponseInner {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

