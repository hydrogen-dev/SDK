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
import java.math.BigDecimal;

/**
 * The array of security token offering settings applied on this token
 */
@ApiModel(description = "The array of security token offering settings applied on this token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-11T18:23:25.119-04:00")
public class TokenCreatePayloadOfferingSettings {
  @SerializedName("rate")
  private BigDecimal rate = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  public TokenCreatePayloadOfferingSettings rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The exchange rate of the token during the token offering.
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The exchange rate of the token during the token offering.")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public TokenCreatePayloadOfferingSettings startDate(String startDate) {
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

  public TokenCreatePayloadOfferingSettings endDate(String endDate) {
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
    TokenCreatePayloadOfferingSettings tokenCreatePayloadOfferingSettings = (TokenCreatePayloadOfferingSettings) o;
    return Objects.equals(this.rate, tokenCreatePayloadOfferingSettings.rate) &&
        Objects.equals(this.startDate, tokenCreatePayloadOfferingSettings.startDate) &&
        Objects.equals(this.endDate, tokenCreatePayloadOfferingSettings.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCreatePayloadOfferingSettings {\n");
    
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
