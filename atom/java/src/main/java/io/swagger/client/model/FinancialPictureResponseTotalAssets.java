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
 * FinancialPictureResponseTotalAssets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialPictureResponseTotalAssets {
  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("latest_balance_time_stamp")
  private String latestBalanceTimeStamp = null;

  public FinancialPictureResponseTotalAssets balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Value of the total assets
   * @return balance
  **/
  @ApiModelProperty(value = "Value of the total assets")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public FinancialPictureResponseTotalAssets latestBalanceTimeStamp(String latestBalanceTimeStamp) {
    this.latestBalanceTimeStamp = latestBalanceTimeStamp;
    return this;
  }

   /**
   * Date and time of the total assets record
   * @return latestBalanceTimeStamp
  **/
  @ApiModelProperty(value = "Date and time of the total assets record")
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
    FinancialPictureResponseTotalAssets financialPictureResponseTotalAssets = (FinancialPictureResponseTotalAssets) o;
    return Objects.equals(this.balance, financialPictureResponseTotalAssets.balance) &&
        Objects.equals(this.latestBalanceTimeStamp, financialPictureResponseTotalAssets.latestBalanceTimeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, latestBalanceTimeStamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseTotalAssets {\n");
    
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
