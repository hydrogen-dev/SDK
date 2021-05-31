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
import com.hydrogen.integration.model.AggregationAccountTransaction;
import java.io.IOException;

/**
 * AggregationAccountTransactionResponseInternalObjectVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class AggregationAccountTransactionResponseInternalObjectVO {
  @SerializedName("body")
  private AggregationAccountTransaction body = null;

  @SerializedName("status_code")
  private Integer statusCode = null;

  public AggregationAccountTransactionResponseInternalObjectVO body(AggregationAccountTransaction body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public AggregationAccountTransaction getBody() {
    return body;
  }

  public void setBody(AggregationAccountTransaction body) {
    this.body = body;
  }

  public AggregationAccountTransactionResponseInternalObjectVO statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationAccountTransactionResponseInternalObjectVO aggregationAccountTransactionResponseInternalObjectVO = (AggregationAccountTransactionResponseInternalObjectVO) o;
    return Objects.equals(this.body, aggregationAccountTransactionResponseInternalObjectVO.body) &&
        Objects.equals(this.statusCode, aggregationAccountTransactionResponseInternalObjectVO.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationAccountTransactionResponseInternalObjectVO {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

