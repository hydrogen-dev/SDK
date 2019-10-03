/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
 * The array of security token offering settings applied on this token
 */
@ApiModel(description = "The array of security token offering settings applied on this token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-03T13:50:03.983-04:00")
public class OfferingSettingsUpdatePayload {
  @SerializedName("rate")
  private Integer rate = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  public OfferingSettingsUpdatePayload rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The exchange rate of the token during the token offering.
   * @return rate
  **/
  @ApiModelProperty(value = "The exchange rate of the token during the token offering.")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public OfferingSettingsUpdatePayload startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the security token offering will go live
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the security token offering will go live")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public OfferingSettingsUpdatePayload endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the security token offering will end
   * @return endDate
  **/
  @ApiModelProperty(value = "The date the security token offering will end")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferingSettingsUpdatePayload offeringSettingsUpdatePayload = (OfferingSettingsUpdatePayload) o;
    return Objects.equals(this.rate, offeringSettingsUpdatePayload.rate) &&
        Objects.equals(this.startDate, offeringSettingsUpdatePayload.startDate) &&
        Objects.equals(this.endDate, offeringSettingsUpdatePayload.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferingSettingsUpdatePayload {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

