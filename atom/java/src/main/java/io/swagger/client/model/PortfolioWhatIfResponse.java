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
import io.swagger.client.model.PortfolioWhatIfStat;
import java.io.IOException;

/**
 * PortfolioWhatIfResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class PortfolioWhatIfResponse {
  @SerializedName("annualized_return")
  private PortfolioWhatIfStat annualizedReturn = null;

  @SerializedName("annualized_volatility")
  private PortfolioWhatIfStat annualizedVolatility = null;

  public PortfolioWhatIfResponse annualizedReturn(PortfolioWhatIfStat annualizedReturn) {
    this.annualizedReturn = annualizedReturn;
    return this;
  }

   /**
   * Get annualizedReturn
   * @return annualizedReturn
  **/
  @ApiModelProperty(required = true, value = "")
  public PortfolioWhatIfStat getAnnualizedReturn() {
    return annualizedReturn;
  }

  public void setAnnualizedReturn(PortfolioWhatIfStat annualizedReturn) {
    this.annualizedReturn = annualizedReturn;
  }

  public PortfolioWhatIfResponse annualizedVolatility(PortfolioWhatIfStat annualizedVolatility) {
    this.annualizedVolatility = annualizedVolatility;
    return this;
  }

   /**
   * Get annualizedVolatility
   * @return annualizedVolatility
  **/
  @ApiModelProperty(required = true, value = "")
  public PortfolioWhatIfStat getAnnualizedVolatility() {
    return annualizedVolatility;
  }

  public void setAnnualizedVolatility(PortfolioWhatIfStat annualizedVolatility) {
    this.annualizedVolatility = annualizedVolatility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioWhatIfResponse portfolioWhatIfResponse = (PortfolioWhatIfResponse) o;
    return Objects.equals(this.annualizedReturn, portfolioWhatIfResponse.annualizedReturn) &&
        Objects.equals(this.annualizedVolatility, portfolioWhatIfResponse.annualizedVolatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualizedReturn, annualizedVolatility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioWhatIfResponse {\n");
    
    sb.append("    annualizedReturn: ").append(toIndentedString(annualizedReturn)).append("\n");
    sb.append("    annualizedVolatility: ").append(toIndentedString(annualizedVolatility)).append("\n");
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

