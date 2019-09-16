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
import java.util.UUID;

/**
 * TokenCrowdsalePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T11:10:59.915-04:00")
public class TokenCrowdsalePayload {
  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("supply")
  private BigDecimal supply = null;

  public TokenCrowdsalePayload tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The uuid of the token being deployed.
   * @return tokenId
  **/
  @ApiModelProperty(required = true, value = "The uuid of the token being deployed.")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public TokenCrowdsalePayload supply(BigDecimal supply) {
    this.supply = supply;
    return this;
  }

   /**
   * Amount of token supply to be transfered to the crowdsale contract.
   * @return supply
  **/
  @ApiModelProperty(required = true, value = "Amount of token supply to be transfered to the crowdsale contract.")
  public BigDecimal getSupply() {
    return supply;
  }

  public void setSupply(BigDecimal supply) {
    this.supply = supply;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCrowdsalePayload tokenCrowdsalePayload = (TokenCrowdsalePayload) o;
    return Objects.equals(this.tokenId, tokenCrowdsalePayload.tokenId) &&
        Objects.equals(this.supply, tokenCrowdsalePayload.supply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, supply);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCrowdsalePayload {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
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

