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
 * MortgageSchedulePeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class MortgageSchedulePeriod {
  @SerializedName("Payment")
  private BigDecimal payment = null;

  @SerializedName("Principal")
  private BigDecimal principal = null;

  @SerializedName("Interest")
  private BigDecimal interest = null;

  @SerializedName("Cumulative_Payment")
  private BigDecimal cumulativePayment = null;

  @SerializedName("Cumulative_Principal")
  private BigDecimal cumulativePrincipal = null;

  @SerializedName("Cumulative_Interest")
  private BigDecimal cumulativeInterest = null;

  @SerializedName("Balance")
  private BigDecimal balance = null;

  public MortgageSchedulePeriod payment(BigDecimal payment) {
    this.payment = payment;
    return this;
  }

   /**
   * The total payment made for this period, consisting of interest and principal.
   * minimum: 0
   * @return payment
  **/
  @ApiModelProperty(required = true, value = "The total payment made for this period, consisting of interest and principal.")
  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  public MortgageSchedulePeriod principal(BigDecimal principal) {
    this.principal = principal;
    return this;
  }

   /**
   * The principal payment made for this period.
   * minimum: 0
   * @return principal
  **/
  @ApiModelProperty(required = true, value = "The principal payment made for this period.")
  public BigDecimal getPrincipal() {
    return principal;
  }

  public void setPrincipal(BigDecimal principal) {
    this.principal = principal;
  }

  public MortgageSchedulePeriod interest(BigDecimal interest) {
    this.interest = interest;
    return this;
  }

   /**
   * The interest payment made for this period.
   * minimum: 0
   * @return interest
  **/
  @ApiModelProperty(required = true, value = "The interest payment made for this period.")
  public BigDecimal getInterest() {
    return interest;
  }

  public void setInterest(BigDecimal interest) {
    this.interest = interest;
  }

  public MortgageSchedulePeriod cumulativePayment(BigDecimal cumulativePayment) {
    this.cumulativePayment = cumulativePayment;
    return this;
  }

   /**
   * The cumulative total payment made up to and including this period.
   * minimum: 0
   * @return cumulativePayment
  **/
  @ApiModelProperty(required = true, value = "The cumulative total payment made up to and including this period.")
  public BigDecimal getCumulativePayment() {
    return cumulativePayment;
  }

  public void setCumulativePayment(BigDecimal cumulativePayment) {
    this.cumulativePayment = cumulativePayment;
  }

  public MortgageSchedulePeriod cumulativePrincipal(BigDecimal cumulativePrincipal) {
    this.cumulativePrincipal = cumulativePrincipal;
    return this;
  }

   /**
   * The cumulative principal payment made up to and including this period.
   * minimum: 0
   * @return cumulativePrincipal
  **/
  @ApiModelProperty(required = true, value = "The cumulative principal payment made up to and including this period.")
  public BigDecimal getCumulativePrincipal() {
    return cumulativePrincipal;
  }

  public void setCumulativePrincipal(BigDecimal cumulativePrincipal) {
    this.cumulativePrincipal = cumulativePrincipal;
  }

  public MortgageSchedulePeriod cumulativeInterest(BigDecimal cumulativeInterest) {
    this.cumulativeInterest = cumulativeInterest;
    return this;
  }

   /**
   * The cumulative interest payment made up to and including this period.
   * minimum: 0
   * @return cumulativeInterest
  **/
  @ApiModelProperty(required = true, value = "The cumulative interest payment made up to and including this period.")
  public BigDecimal getCumulativeInterest() {
    return cumulativeInterest;
  }

  public void setCumulativeInterest(BigDecimal cumulativeInterest) {
    this.cumulativeInterest = cumulativeInterest;
  }

  public MortgageSchedulePeriod balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The remaining mortgage balance at the end of the period.
   * minimum: 0
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "The remaining mortgage balance at the end of the period.")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MortgageSchedulePeriod mortgageSchedulePeriod = (MortgageSchedulePeriod) o;
    return Objects.equals(this.payment, mortgageSchedulePeriod.payment) &&
        Objects.equals(this.principal, mortgageSchedulePeriod.principal) &&
        Objects.equals(this.interest, mortgageSchedulePeriod.interest) &&
        Objects.equals(this.cumulativePayment, mortgageSchedulePeriod.cumulativePayment) &&
        Objects.equals(this.cumulativePrincipal, mortgageSchedulePeriod.cumulativePrincipal) &&
        Objects.equals(this.cumulativeInterest, mortgageSchedulePeriod.cumulativeInterest) &&
        Objects.equals(this.balance, mortgageSchedulePeriod.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, principal, interest, cumulativePayment, cumulativePrincipal, cumulativeInterest, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageSchedulePeriod {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    cumulativePayment: ").append(toIndentedString(cumulativePayment)).append("\n");
    sb.append("    cumulativePrincipal: ").append(toIndentedString(cumulativePrincipal)).append("\n");
    sb.append("    cumulativeInterest: ").append(toIndentedString(cumulativeInterest)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

