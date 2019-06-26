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
 * GoalAssetSizeResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class GoalAssetSizeResponseInner {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("additions")
  private Double additions = null;

  public GoalAssetSizeResponseInner date(LocalDate date) {
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

  public GoalAssetSizeResponseInner value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Monetary value of the goal on the particular date
   * @return value
  **/
  @ApiModelProperty(value = "Monetary value of the goal on the particular date")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public GoalAssetSizeResponseInner additions(Double additions) {
    this.additions = additions;
    return this;
  }

   /**
   * Amount added to the goal in all of the client’s accounts on the particular date
   * @return additions
  **/
  @ApiModelProperty(value = "Amount added to the goal in all of the client’s accounts on the particular date")
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
    GoalAssetSizeResponseInner goalAssetSizeResponseInner = (GoalAssetSizeResponseInner) o;
    return Objects.equals(this.date, goalAssetSizeResponseInner.date) &&
        Objects.equals(this.value, goalAssetSizeResponseInner.value) &&
        Objects.equals(this.additions, goalAssetSizeResponseInner.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAssetSizeResponseInner {\n");
    
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

