/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.hydrogen.nucleus.model.CheckImages;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Check Object
 */
@ApiModel(description = "Check Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Check {
  @SerializedName("check_amount")
  private Double checkAmount = null;

  @SerializedName("check_images")
  private List<CheckImages> checkImages = null;

  @SerializedName("check_number")
  private String checkNumber = null;

  public Check checkAmount(Double checkAmount) {
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * checkAmount
   * @return checkAmount
  **/
  @ApiModelProperty(example = "20000.0", value = "checkAmount")
  public Double getCheckAmount() {
    return checkAmount;
  }

  public void setCheckAmount(Double checkAmount) {
    this.checkAmount = checkAmount;
  }

  public Check checkImages(List<CheckImages> checkImages) {
    this.checkImages = checkImages;
    return this;
  }

  public Check addCheckImagesItem(CheckImages checkImagesItem) {
    if (this.checkImages == null) {
      this.checkImages = new ArrayList<CheckImages>();
    }
    this.checkImages.add(checkImagesItem);
    return this;
  }

   /**
   * checkImages
   * @return checkImages
  **/
  @ApiModelProperty(example = "[]", value = "checkImages")
  public List<CheckImages> getCheckImages() {
    return checkImages;
  }

  public void setCheckImages(List<CheckImages> checkImages) {
    this.checkImages = checkImages;
  }

  public Check checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * checkNumber
   * @return checkNumber
  **/
  @ApiModelProperty(example = "123456", required = true, value = "checkNumber")
  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.checkAmount, check.checkAmount) &&
        Objects.equals(this.checkImages, check.checkImages) &&
        Objects.equals(this.checkNumber, check.checkNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkAmount, checkImages, checkNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
    sb.append("    checkImages: ").append(toIndentedString(checkImages)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
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

