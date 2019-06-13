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
import io.swagger.client.model.MortgageSchedulePeriod;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MortgageCalculatorDownpaymentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class MortgageCalculatorDownpaymentResponse {
  @SerializedName("down_payment")
  private BigDecimal downPayment = null;

  @SerializedName("total_payment")
  private BigDecimal totalPayment = null;

  @SerializedName("total_principal")
  private BigDecimal totalPrincipal = null;

  @SerializedName("total_interest")
  private BigDecimal totalInterest = null;

  @SerializedName("total_home_cost")
  private BigDecimal totalHomeCost = null;

  @SerializedName("schedule")
  private Map<String, MortgageSchedulePeriod> schedule = new HashMap<String, MortgageSchedulePeriod>();

  public MortgageCalculatorDownpaymentResponse downPayment(BigDecimal downPayment) {
    this.downPayment = downPayment;
    return this;
  }

   /**
   * The payment due upfront when buying a home, given the other inputs provided by the user.
   * minimum: 0
   * @return downPayment
  **/
  @ApiModelProperty(required = true, value = "The payment due upfront when buying a home, given the other inputs provided by the user.")
  public BigDecimal getDownPayment() {
    return downPayment;
  }

  public void setDownPayment(BigDecimal downPayment) {
    this.downPayment = downPayment;
  }

  public MortgageCalculatorDownpaymentResponse totalPayment(BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

   /**
   * The total mortgage payments made over mortgage_term.
   * @return totalPayment
  **/
  @ApiModelProperty(required = true, value = "The total mortgage payments made over mortgage_term.")
  public BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }

  public MortgageCalculatorDownpaymentResponse totalPrincipal(BigDecimal totalPrincipal) {
    this.totalPrincipal = totalPrincipal;
    return this;
  }

   /**
   * The total amount that went toward the mortgage principal.
   * @return totalPrincipal
  **/
  @ApiModelProperty(required = true, value = "The total amount that went toward the mortgage principal.")
  public BigDecimal getTotalPrincipal() {
    return totalPrincipal;
  }

  public void setTotalPrincipal(BigDecimal totalPrincipal) {
    this.totalPrincipal = totalPrincipal;
  }

  public MortgageCalculatorDownpaymentResponse totalInterest(BigDecimal totalInterest) {
    this.totalInterest = totalInterest;
    return this;
  }

   /**
   * The total amount that went toward the mortgage interest.
   * @return totalInterest
  **/
  @ApiModelProperty(required = true, value = "The total amount that went toward the mortgage interest.")
  public BigDecimal getTotalInterest() {
    return totalInterest;
  }

  public void setTotalInterest(BigDecimal totalInterest) {
    this.totalInterest = totalInterest;
  }

  public MortgageCalculatorDownpaymentResponse totalHomeCost(BigDecimal totalHomeCost) {
    this.totalHomeCost = totalHomeCost;
    return this;
  }

   /**
   * The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0.
   * @return totalHomeCost
  **/
  @ApiModelProperty(required = true, value = "The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0.")
  public BigDecimal getTotalHomeCost() {
    return totalHomeCost;
  }

  public void setTotalHomeCost(BigDecimal totalHomeCost) {
    this.totalHomeCost = totalHomeCost;
  }

  public MortgageCalculatorDownpaymentResponse schedule(Map<String, MortgageSchedulePeriod> schedule) {
    this.schedule = schedule;
    return this;
  }

  public MortgageCalculatorDownpaymentResponse putScheduleItem(String key, MortgageSchedulePeriod scheduleItem) {
    this.schedule.put(key, scheduleItem);
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, MortgageSchedulePeriod> getSchedule() {
    return schedule;
  }

  public void setSchedule(Map<String, MortgageSchedulePeriod> schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MortgageCalculatorDownpaymentResponse mortgageCalculatorDownpaymentResponse = (MortgageCalculatorDownpaymentResponse) o;
    return Objects.equals(this.downPayment, mortgageCalculatorDownpaymentResponse.downPayment) &&
        Objects.equals(this.totalPayment, mortgageCalculatorDownpaymentResponse.totalPayment) &&
        Objects.equals(this.totalPrincipal, mortgageCalculatorDownpaymentResponse.totalPrincipal) &&
        Objects.equals(this.totalInterest, mortgageCalculatorDownpaymentResponse.totalInterest) &&
        Objects.equals(this.totalHomeCost, mortgageCalculatorDownpaymentResponse.totalHomeCost) &&
        Objects.equals(this.schedule, mortgageCalculatorDownpaymentResponse.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downPayment, totalPayment, totalPrincipal, totalInterest, totalHomeCost, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageCalculatorDownpaymentResponse {\n");
    
    sb.append("    downPayment: ").append(toIndentedString(downPayment)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
    sb.append("    totalPrincipal: ").append(toIndentedString(totalPrincipal)).append("\n");
    sb.append("    totalInterest: ").append(toIndentedString(totalInterest)).append("\n");
    sb.append("    totalHomeCost: ").append(toIndentedString(totalHomeCost)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

