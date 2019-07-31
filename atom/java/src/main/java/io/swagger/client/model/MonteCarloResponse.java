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
import java.util.ArrayList;
import java.util.List;

/**
 * MonteCarloResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class MonteCarloResponse {
  @SerializedName("sims")
  private List<List<BigDecimal>> sims = new ArrayList<List<BigDecimal>>();

  public MonteCarloResponse sims(List<List<BigDecimal>> sims) {
    this.sims = sims;
    return this;
  }

  public MonteCarloResponse addSimsItem(List<BigDecimal> simsItem) {
    this.sims.add(simsItem);
    return this;
  }

   /**
   * A collection of Monte Carlo results. If result_type &#x3D; raw, this returns multiple sets of results, defined by n.
   * @return sims
  **/
  @ApiModelProperty(required = true, value = "A collection of Monte Carlo results. If result_type = raw, this returns multiple sets of results, defined by n.")
  public List<List<BigDecimal>> getSims() {
    return sims;
  }

  public void setSims(List<List<BigDecimal>> sims) {
    this.sims = sims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonteCarloResponse monteCarloResponse = (MonteCarloResponse) o;
    return Objects.equals(this.sims, monteCarloResponse.sims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonteCarloResponse {\n");
    
    sb.append("    sims: ").append(toIndentedString(sims)).append("\n");
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

