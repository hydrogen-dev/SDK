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
 * AllocationHoldingsResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class AllocationHoldingsResponseInner {
  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("current_weight")
  private Double currentWeight = null;

  @SerializedName("strategic_weight")
  private Double strategicWeight = null;

  @SerializedName("date")
  private LocalDate date = null;

  public AllocationHoldingsResponseInner securityId(UUID securityId) {
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

  public AllocationHoldingsResponseInner currentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
    return this;
  }

   /**
   * Current weight of the security as a percentage of the model’s total monetary value; ex. 20 representing 20%
   * @return currentWeight
  **/
  @ApiModelProperty(value = "Current weight of the security as a percentage of the model’s total monetary value; ex. 20 representing 20%")
  public Double getCurrentWeight() {
    return currentWeight;
  }

  public void setCurrentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
  }

  public AllocationHoldingsResponseInner strategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
    return this;
  }

   /**
   * Strategic weight of the security as a percentage of the model’s total monetary value; ex. 20 representing 20%
   * @return strategicWeight
  **/
  @ApiModelProperty(value = "Strategic weight of the security as a percentage of the model’s total monetary value; ex. 20 representing 20%")
  public Double getStrategicWeight() {
    return strategicWeight;
  }

  public void setStrategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
  }

  public AllocationHoldingsResponseInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the holding record
   * @return date
  **/
  @ApiModelProperty(value = "Date of the holding record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationHoldingsResponseInner allocationHoldingsResponseInner = (AllocationHoldingsResponseInner) o;
    return Objects.equals(this.securityId, allocationHoldingsResponseInner.securityId) &&
        Objects.equals(this.currentWeight, allocationHoldingsResponseInner.currentWeight) &&
        Objects.equals(this.strategicWeight, allocationHoldingsResponseInner.strategicWeight) &&
        Objects.equals(this.date, allocationHoldingsResponseInner.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, currentWeight, strategicWeight, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationHoldingsResponseInner {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    currentWeight: ").append(toIndentedString(currentWeight)).append("\n");
    sb.append("    strategicWeight: ").append(toIndentedString(strategicWeight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

