/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
import java.io.IOException;

/**
 * Balances Object
 */
@ApiModel(description = "Balances Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Balances {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("payable_outstanding")
  private Double payableOutstanding = null;

  @SerializedName("payable_overdue")
  private Double payableOverdue = null;

  @SerializedName("receivable_outstanding")
  private Double receivableOutstanding = null;

  @SerializedName("receivable_overdue")
  private Double receivableOverdue = null;

  public Balances currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Balances payableOutstanding(Double payableOutstanding) {
    this.payableOutstanding = payableOutstanding;
    return this;
  }

   /**
   * payableOutstanding
   * @return payableOutstanding
  **/
  @ApiModelProperty(example = "1233.0", value = "payableOutstanding")
  public Double getPayableOutstanding() {
    return payableOutstanding;
  }

  public void setPayableOutstanding(Double payableOutstanding) {
    this.payableOutstanding = payableOutstanding;
  }

  public Balances payableOverdue(Double payableOverdue) {
    this.payableOverdue = payableOverdue;
    return this;
  }

   /**
   * payableOverdue
   * @return payableOverdue
  **/
  @ApiModelProperty(example = "8752.0", value = "payableOverdue")
  public Double getPayableOverdue() {
    return payableOverdue;
  }

  public void setPayableOverdue(Double payableOverdue) {
    this.payableOverdue = payableOverdue;
  }

  public Balances receivableOutstanding(Double receivableOutstanding) {
    this.receivableOutstanding = receivableOutstanding;
    return this;
  }

   /**
   * receivableOutstanding
   * @return receivableOutstanding
  **/
  @ApiModelProperty(example = "1234.0", value = "receivableOutstanding")
  public Double getReceivableOutstanding() {
    return receivableOutstanding;
  }

  public void setReceivableOutstanding(Double receivableOutstanding) {
    this.receivableOutstanding = receivableOutstanding;
  }

  public Balances receivableOverdue(Double receivableOverdue) {
    this.receivableOverdue = receivableOverdue;
    return this;
  }

   /**
   * receivableOverdue
   * @return receivableOverdue
  **/
  @ApiModelProperty(example = "2587.0", value = "receivableOverdue")
  public Double getReceivableOverdue() {
    return receivableOverdue;
  }

  public void setReceivableOverdue(Double receivableOverdue) {
    this.receivableOverdue = receivableOverdue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balances balances = (Balances) o;
    return Objects.equals(this.currencyCode, balances.currencyCode) &&
        Objects.equals(this.payableOutstanding, balances.payableOutstanding) &&
        Objects.equals(this.payableOverdue, balances.payableOverdue) &&
        Objects.equals(this.receivableOutstanding, balances.receivableOutstanding) &&
        Objects.equals(this.receivableOverdue, balances.receivableOverdue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, payableOutstanding, payableOverdue, receivableOutstanding, receivableOverdue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    payableOutstanding: ").append(toIndentedString(payableOutstanding)).append("\n");
    sb.append("    payableOverdue: ").append(toIndentedString(payableOverdue)).append("\n");
    sb.append("    receivableOutstanding: ").append(toIndentedString(receivableOutstanding)).append("\n");
    sb.append("    receivableOverdue: ").append(toIndentedString(receivableOverdue)).append("\n");
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

