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
import java.util.UUID;

/**
 * TokenDeployPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T11:09:45.105-04:00")
public class TokenDeployPayload {
  @SerializedName("token_id")
  private UUID tokenId = null;

  public TokenDeployPayload tokenId(UUID tokenId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDeployPayload tokenDeployPayload = (TokenDeployPayload) o;
    return Objects.equals(this.tokenId, tokenDeployPayload.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDeployPayload {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

