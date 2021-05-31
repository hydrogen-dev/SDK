/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

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
 * SamsungPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class SamsungPayload {
  @SerializedName("issuer_payload")
  private String issuerPayload = null;

  public SamsungPayload issuerPayload(String issuerPayload) {
    this.issuerPayload = issuerPayload;
    return this;
  }

   /**
   * Get issuerPayload
   * @return issuerPayload
  **/
  @ApiModelProperty(value = "")
  public String getIssuerPayload() {
    return issuerPayload;
  }

  public void setIssuerPayload(String issuerPayload) {
    this.issuerPayload = issuerPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPayload samsungPayload = (SamsungPayload) o;
    return Objects.equals(this.issuerPayload, samsungPayload.issuerPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamsungPayload {\n");
    
    sb.append("    issuerPayload: ").append(toIndentedString(issuerPayload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

