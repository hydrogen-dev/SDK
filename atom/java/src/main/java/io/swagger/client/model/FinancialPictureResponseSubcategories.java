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
 * FinancialPictureResponseSubcategories
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialPictureResponseSubcategories {
  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("latest_balance_time_stamp")
  private String latestBalanceTimeStamp = null;

  public FinancialPictureResponseSubcategories subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Subcategory of the aggregation accounts. These accounts are dependent on the &#x60;subcategory&#x60; fields within the Nucleus Aggregation Account.
   * @return subcategory
  **/
  @ApiModelProperty(value = "Subcategory of the aggregation accounts. These accounts are dependent on the `subcategory` fields within the Nucleus Aggregation Account.")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public FinancialPictureResponseSubcategories balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Total balance for this subcategory
   * @return balance
  **/
  @ApiModelProperty(value = "Total balance for this subcategory")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public FinancialPictureResponseSubcategories latestBalanceTimeStamp(String latestBalanceTimeStamp) {
    this.latestBalanceTimeStamp = latestBalanceTimeStamp;
    return this;
  }

   /**
   * Date and time of the balance record for this subcategory
   * @return latestBalanceTimeStamp
  **/
  @ApiModelProperty(value = "Date and time of the balance record for this subcategory")
  public String getLatestBalanceTimeStamp() {
    return latestBalanceTimeStamp;
  }

  public void setLatestBalanceTimeStamp(String latestBalanceTimeStamp) {
    this.latestBalanceTimeStamp = latestBalanceTimeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseSubcategories financialPictureResponseSubcategories = (FinancialPictureResponseSubcategories) o;
    return Objects.equals(this.subcategory, financialPictureResponseSubcategories.subcategory) &&
        Objects.equals(this.balance, financialPictureResponseSubcategories.balance) &&
        Objects.equals(this.latestBalanceTimeStamp, financialPictureResponseSubcategories.latestBalanceTimeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subcategory, balance, latestBalanceTimeStamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseSubcategories {\n");
    
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    latestBalanceTimeStamp: ").append(toIndentedString(latestBalanceTimeStamp)).append("\n");
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

