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
import java.math.BigDecimal;

/**
 * WConfigPortfolio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class WConfigPortfolio {
  @SerializedName("w_min_major")
  private BigDecimal wMinMajor = null;

  @SerializedName("w_max_major")
  private BigDecimal wMaxMajor = null;

  @SerializedName("w_min_minor")
  private BigDecimal wMinMinor = null;

  @SerializedName("w_max_minor")
  private BigDecimal wMaxMinor = null;

  @SerializedName("cash_amount")
  private BigDecimal cashAmount = null;

  public WConfigPortfolio wMinMajor(BigDecimal wMinMajor) {
    this.wMinMajor = wMinMajor;
    return this;
  }

   /**
   * Minimum weight on major securities
   * minimum: 0
   * maximum: 1
   * @return wMinMajor
  **/
  @ApiModelProperty(value = "Minimum weight on major securities")
  public BigDecimal getWMinMajor() {
    return wMinMajor;
  }

  public void setWMinMajor(BigDecimal wMinMajor) {
    this.wMinMajor = wMinMajor;
  }

  public WConfigPortfolio wMaxMajor(BigDecimal wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
    return this;
  }

   /**
   * Maximum weight on major securities
   * minimum: 0
   * maximum: 1
   * @return wMaxMajor
  **/
  @ApiModelProperty(value = "Maximum weight on major securities")
  public BigDecimal getWMaxMajor() {
    return wMaxMajor;
  }

  public void setWMaxMajor(BigDecimal wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
  }

  public WConfigPortfolio wMinMinor(BigDecimal wMinMinor) {
    this.wMinMinor = wMinMinor;
    return this;
  }

   /**
   * Minimum weight on minor securities
   * minimum: 0
   * maximum: 1
   * @return wMinMinor
  **/
  @ApiModelProperty(value = "Minimum weight on minor securities")
  public BigDecimal getWMinMinor() {
    return wMinMinor;
  }

  public void setWMinMinor(BigDecimal wMinMinor) {
    this.wMinMinor = wMinMinor;
  }

  public WConfigPortfolio wMaxMinor(BigDecimal wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
    return this;
  }

   /**
   * Maximum weight on minor securities
   * minimum: 0
   * maximum: 1
   * @return wMaxMinor
  **/
  @ApiModelProperty(value = "Maximum weight on minor securities")
  public BigDecimal getWMaxMinor() {
    return wMaxMinor;
  }

  public void setWMaxMinor(BigDecimal wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
  }

  public WConfigPortfolio cashAmount(BigDecimal cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * Cash amount
   * minimum: 0
   * maximum: 1
   * @return cashAmount
  **/
  @ApiModelProperty(value = "Cash amount")
  public BigDecimal getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(BigDecimal cashAmount) {
    this.cashAmount = cashAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WConfigPortfolio wConfigPortfolio = (WConfigPortfolio) o;
    return Objects.equals(this.wMinMajor, wConfigPortfolio.wMinMajor) &&
        Objects.equals(this.wMaxMajor, wConfigPortfolio.wMaxMajor) &&
        Objects.equals(this.wMinMinor, wConfigPortfolio.wMinMinor) &&
        Objects.equals(this.wMaxMinor, wConfigPortfolio.wMaxMinor) &&
        Objects.equals(this.cashAmount, wConfigPortfolio.cashAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wMinMajor, wMaxMajor, wMinMinor, wMaxMinor, cashAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WConfigPortfolio {\n");
    
    sb.append("    wMinMajor: ").append(toIndentedString(wMinMajor)).append("\n");
    sb.append("    wMaxMajor: ").append(toIndentedString(wMaxMajor)).append("\n");
    sb.append("    wMinMinor: ").append(toIndentedString(wMinMinor)).append("\n");
    sb.append("    wMaxMinor: ").append(toIndentedString(wMaxMinor)).append("\n");
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
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

