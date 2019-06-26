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
import io.swagger.client.model.RebalanceSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RebalanceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class RebalanceResponse {
  @SerializedName("rebalance_signals")
  private List<RebalanceSignal> rebalanceSignals = new ArrayList<RebalanceSignal>();

  public RebalanceResponse rebalanceSignals(List<RebalanceSignal> rebalanceSignals) {
    this.rebalanceSignals = rebalanceSignals;
    return this;
  }

  public RebalanceResponse addRebalanceSignalsItem(RebalanceSignal rebalanceSignalsItem) {
    this.rebalanceSignals.add(rebalanceSignalsItem);
    return this;
  }

   /**
   * Get rebalanceSignals
   * @return rebalanceSignals
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RebalanceSignal> getRebalanceSignals() {
    return rebalanceSignals;
  }

  public void setRebalanceSignals(List<RebalanceSignal> rebalanceSignals) {
    this.rebalanceSignals = rebalanceSignals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebalanceResponse rebalanceResponse = (RebalanceResponse) o;
    return Objects.equals(this.rebalanceSignals, rebalanceResponse.rebalanceSignals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebalanceSignals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebalanceResponse {\n");
    
    sb.append("    rebalanceSignals: ").append(toIndentedString(rebalanceSignals)).append("\n");
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

