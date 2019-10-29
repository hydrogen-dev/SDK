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
 * TokenWhitelistPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-29T11:55:11.320-04:00")
public class TokenWhitelistPayload {
  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("wallet_id")
  private UUID walletId = null;

  public TokenWhitelistPayload tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The uuid of the specified token.
   * @return tokenId
  **/
  @ApiModelProperty(required = true, value = "The uuid of the specified token.")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public TokenWhitelistPayload walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The uuid of wallet to be whitelisted.
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The uuid of wallet to be whitelisted.")
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenWhitelistPayload tokenWhitelistPayload = (TokenWhitelistPayload) o;
    return Objects.equals(this.tokenId, tokenWhitelistPayload.tokenId) &&
        Objects.equals(this.walletId, tokenWhitelistPayload.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenWhitelistPayload {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

