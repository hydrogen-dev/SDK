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
 * MortgageCalculatorHomepriceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class MortgageCalculatorHomepriceResponse {
  @SerializedName("home_price")
  private BigDecimal homePrice = null;

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

  public MortgageCalculatorHomepriceResponse homePrice(BigDecimal homePrice) {
    this.homePrice = homePrice;
    return this;
  }

   /**
   * The total cost of the home that can be afforded, given the other inputs provided by the user.
   * minimum: 0
   * @return homePrice
  **/
  @ApiModelProperty(required = true, value = "The total cost of the home that can be afforded, given the other inputs provided by the user.")
  public BigDecimal getHomePrice() {
    return homePrice;
  }

  public void setHomePrice(BigDecimal homePrice) {
    this.homePrice = homePrice;
  }

  public MortgageCalculatorHomepriceResponse totalPayment(BigDecimal totalPayment) {
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

  public MortgageCalculatorHomepriceResponse totalPrincipal(BigDecimal totalPrincipal) {
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

  public MortgageCalculatorHomepriceResponse totalInterest(BigDecimal totalInterest) {
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

  public MortgageCalculatorHomepriceResponse totalHomeCost(BigDecimal totalHomeCost) {
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

  public MortgageCalculatorHomepriceResponse schedule(Map<String, MortgageSchedulePeriod> schedule) {
    this.schedule = schedule;
    return this;
  }

  public MortgageCalculatorHomepriceResponse putScheduleItem(String key, MortgageSchedulePeriod scheduleItem) {
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
    MortgageCalculatorHomepriceResponse mortgageCalculatorHomepriceResponse = (MortgageCalculatorHomepriceResponse) o;
    return Objects.equals(this.homePrice, mortgageCalculatorHomepriceResponse.homePrice) &&
        Objects.equals(this.totalPayment, mortgageCalculatorHomepriceResponse.totalPayment) &&
        Objects.equals(this.totalPrincipal, mortgageCalculatorHomepriceResponse.totalPrincipal) &&
        Objects.equals(this.totalInterest, mortgageCalculatorHomepriceResponse.totalInterest) &&
        Objects.equals(this.totalHomeCost, mortgageCalculatorHomepriceResponse.totalHomeCost) &&
        Objects.equals(this.schedule, mortgageCalculatorHomepriceResponse.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePrice, totalPayment, totalPrincipal, totalInterest, totalHomeCost, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageCalculatorHomepriceResponse {\n");
    
    sb.append("    homePrice: ").append(toIndentedString(homePrice)).append("\n");
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

