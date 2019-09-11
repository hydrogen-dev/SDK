/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
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
import java.util.UUID;

/**
 * List of securities and their respective weights as a percentage of the benchmark’s total value. It is recommended to provide at least one security_id
 */
@ApiModel(description = "List of securities and their respective weights as a percentage of the benchmark’s total value. It is recommended to provide at least one security_id")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class BenchmarkPayloadComposition {
  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  public BenchmarkPayloadComposition weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the security as a percentage of the benchmark’s total value; ex. 20 representing 20%. The weights of all the securities must add up to 100
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The weight of the security as a percentage of the benchmark’s total value; ex. 20 representing 20%. The weights of all the securities must add up to 100")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public BenchmarkPayloadComposition securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security in the benchmark
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security in the benchmark")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkPayloadComposition benchmarkPayloadComposition = (BenchmarkPayloadComposition) o;
    return Objects.equals(this.weight, benchmarkPayloadComposition.weight) &&
        Objects.equals(this.securityId, benchmarkPayloadComposition.securityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, securityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkPayloadComposition {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
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
