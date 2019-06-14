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
import org.threeten.bp.LocalDate;

/**
 * ClientAssetSizeResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class ClientAssetSizeResponseInner {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("additions")
  private Double additions = null;

  public ClientAssetSizeResponseInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for this asset size record
   * @return date
  **/
  @ApiModelProperty(value = "Date for this asset size record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ClientAssetSizeResponseInner value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Monetary value of all the client’s accounts on the particular date
   * @return value
  **/
  @ApiModelProperty(value = "Monetary value of all the client’s accounts on the particular date")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public ClientAssetSizeResponseInner additions(Double additions) {
    this.additions = additions;
    return this;
  }

   /**
   * Amount added to all of the client’s accounts on the particular date, usually via deposits
   * @return additions
  **/
  @ApiModelProperty(value = "Amount added to all of the client’s accounts on the particular date, usually via deposits")
  public Double getAdditions() {
    return additions;
  }

  public void setAdditions(Double additions) {
    this.additions = additions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAssetSizeResponseInner clientAssetSizeResponseInner = (ClientAssetSizeResponseInner) o;
    return Objects.equals(this.date, clientAssetSizeResponseInner.date) &&
        Objects.equals(this.value, clientAssetSizeResponseInner.value) &&
        Objects.equals(this.additions, clientAssetSizeResponseInner.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAssetSizeResponseInner {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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

