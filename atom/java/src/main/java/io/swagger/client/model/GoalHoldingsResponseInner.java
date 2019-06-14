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
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * GoalHoldingsResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class GoalHoldingsResponseInner {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("shares")
  private Double shares = null;

  public GoalHoldingsResponseInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for the security holding
   * @return date
  **/
  @ApiModelProperty(value = "Date for the security holding")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GoalHoldingsResponseInner securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID for the security included in the holding record
   * @return securityId
  **/
  @ApiModelProperty(value = "The ID for the security included in the holding record")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public GoalHoldingsResponseInner weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the security as a percentage of the client goal’s total monetary value; ex. 20 representing 20%
   * @return weight
  **/
  @ApiModelProperty(value = "The weight of the security as a percentage of the client goal’s total monetary value; ex. 20 representing 20%")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public GoalHoldingsResponseInner amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monetary value of the shares in the holding record
   * @return amount
  **/
  @ApiModelProperty(value = "Monetary value of the shares in the holding record")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public GoalHoldingsResponseInner shares(Double shares) {
    this.shares = shares;
    return this;
  }

   /**
   * Number of shares in the holding record
   * @return shares
  **/
  @ApiModelProperty(value = "Number of shares in the holding record")
  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalHoldingsResponseInner goalHoldingsResponseInner = (GoalHoldingsResponseInner) o;
    return Objects.equals(this.date, goalHoldingsResponseInner.date) &&
        Objects.equals(this.securityId, goalHoldingsResponseInner.securityId) &&
        Objects.equals(this.weight, goalHoldingsResponseInner.weight) &&
        Objects.equals(this.amount, goalHoldingsResponseInner.amount) &&
        Objects.equals(this.shares, goalHoldingsResponseInner.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, securityId, weight, amount, shares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalHoldingsResponseInner {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

