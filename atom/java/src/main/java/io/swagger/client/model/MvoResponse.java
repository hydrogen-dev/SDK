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
import io.swagger.client.model.TargetPortfolioResponse;
import java.io.IOException;

/**
 * MvoResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class MvoResponse {
  @SerializedName("target_portfolio")
  private TargetPortfolioResponse targetPortfolio = null;

  public MvoResponse targetPortfolio(TargetPortfolioResponse targetPortfolio) {
    this.targetPortfolio = targetPortfolio;
    return this;
  }

   /**
   * Get targetPortfolio
   * @return targetPortfolio
  **/
  @ApiModelProperty(required = true, value = "")
  public TargetPortfolioResponse getTargetPortfolio() {
    return targetPortfolio;
  }

  public void setTargetPortfolio(TargetPortfolioResponse targetPortfolio) {
    this.targetPortfolio = targetPortfolio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MvoResponse mvoResponse = (MvoResponse) o;
    return Objects.equals(this.targetPortfolio, mvoResponse.targetPortfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPortfolio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MvoResponse {\n");
    
    sb.append("    targetPortfolio: ").append(toIndentedString(targetPortfolio)).append("\n");
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

