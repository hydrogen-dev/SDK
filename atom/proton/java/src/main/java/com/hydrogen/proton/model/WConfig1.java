/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * WConfig1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class WConfig1 {
  @SerializedName("w_min_minor")
  private Float wMinMinor = 0.05f;

  @SerializedName("w_min_major")
  private Float wMinMajor = 0.05f;

  @SerializedName("cash_amount")
  private Float cashAmount = 0.0f;

  @SerializedName("w_max_major")
  private Float wMaxMajor = 1.0f;

  @SerializedName("w_max_minor")
  private Float wMaxMinor = 1.0f;

  public WConfig1 wMinMinor(Float wMinMinor) {
    this.wMinMinor = wMinMinor;
    return this;
  }

   /**
   * Get wMinMinor
   * minimum: 0
   * maximum: 1
   * @return wMinMinor
  **/
  @ApiModelProperty(value = "")
  public Float getWMinMinor() {
    return wMinMinor;
  }

  public void setWMinMinor(Float wMinMinor) {
    this.wMinMinor = wMinMinor;
  }

  public WConfig1 wMinMajor(Float wMinMajor) {
    this.wMinMajor = wMinMajor;
    return this;
  }

   /**
   * Get wMinMajor
   * minimum: 0
   * maximum: 1
   * @return wMinMajor
  **/
  @ApiModelProperty(value = "")
  public Float getWMinMajor() {
    return wMinMajor;
  }

  public void setWMinMajor(Float wMinMajor) {
    this.wMinMajor = wMinMajor;
  }

  public WConfig1 cashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * Get cashAmount
   * minimum: 0
   * maximum: 1
   * @return cashAmount
  **/
  @ApiModelProperty(value = "")
  public Float getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
  }

  public WConfig1 wMaxMajor(Float wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
    return this;
  }

   /**
   * Get wMaxMajor
   * minimum: 0
   * maximum: 1
   * @return wMaxMajor
  **/
  @ApiModelProperty(value = "")
  public Float getWMaxMajor() {
    return wMaxMajor;
  }

  public void setWMaxMajor(Float wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
  }

  public WConfig1 wMaxMinor(Float wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
    return this;
  }

   /**
   * Get wMaxMinor
   * minimum: 0
   * maximum: 1
   * @return wMaxMinor
  **/
  @ApiModelProperty(value = "")
  public Float getWMaxMinor() {
    return wMaxMinor;
  }

  public void setWMaxMinor(Float wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WConfig1 wconfig1 = (WConfig1) o;
    return Objects.equals(this.wMinMinor, wconfig1.wMinMinor) &&
        Objects.equals(this.wMinMajor, wconfig1.wMinMajor) &&
        Objects.equals(this.cashAmount, wconfig1.cashAmount) &&
        Objects.equals(this.wMaxMajor, wconfig1.wMaxMajor) &&
        Objects.equals(this.wMaxMinor, wconfig1.wMaxMinor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wMinMinor, wMinMajor, cashAmount, wMaxMajor, wMaxMinor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WConfig1 {\n");
    
    sb.append("    wMinMinor: ").append(toIndentedString(wMinMinor)).append("\n");
    sb.append("    wMinMajor: ").append(toIndentedString(wMinMajor)).append("\n");
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
    sb.append("    wMaxMajor: ").append(toIndentedString(wMaxMajor)).append("\n");
    sb.append("    wMaxMinor: ").append(toIndentedString(wMaxMinor)).append("\n");
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

