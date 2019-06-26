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
 * PortfolioWhatIfStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class PortfolioWhatIfStat {
  @SerializedName("current_portfolio")
  private BigDecimal currentPortfolio = null;

  @SerializedName("altered_portfolio")
  private BigDecimal alteredPortfolio = null;

  @SerializedName("delta")
  private BigDecimal delta = null;

  public PortfolioWhatIfStat currentPortfolio(BigDecimal currentPortfolio) {
    this.currentPortfolio = currentPortfolio;
    return this;
  }

   /**
   * Get currentPortfolio
   * @return currentPortfolio
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCurrentPortfolio() {
    return currentPortfolio;
  }

  public void setCurrentPortfolio(BigDecimal currentPortfolio) {
    this.currentPortfolio = currentPortfolio;
  }

  public PortfolioWhatIfStat alteredPortfolio(BigDecimal alteredPortfolio) {
    this.alteredPortfolio = alteredPortfolio;
    return this;
  }

   /**
   * Get alteredPortfolio
   * @return alteredPortfolio
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAlteredPortfolio() {
    return alteredPortfolio;
  }

  public void setAlteredPortfolio(BigDecimal alteredPortfolio) {
    this.alteredPortfolio = alteredPortfolio;
  }

  public PortfolioWhatIfStat delta(BigDecimal delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getDelta() {
    return delta;
  }

  public void setDelta(BigDecimal delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioWhatIfStat portfolioWhatIfStat = (PortfolioWhatIfStat) o;
    return Objects.equals(this.currentPortfolio, portfolioWhatIfStat.currentPortfolio) &&
        Objects.equals(this.alteredPortfolio, portfolioWhatIfStat.alteredPortfolio) &&
        Objects.equals(this.delta, portfolioWhatIfStat.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPortfolio, alteredPortfolio, delta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioWhatIfStat {\n");
    
    sb.append("    currentPortfolio: ").append(toIndentedString(currentPortfolio)).append("\n");
    sb.append("    alteredPortfolio: ").append(toIndentedString(alteredPortfolio)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

