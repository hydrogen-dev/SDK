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
 * CrowdsalePurchasePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T11:23:05.622-05:00")
public class CrowdsalePurchasePayload {
  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("wallet_id")
  private UUID walletId = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  public CrowdsalePurchasePayload tokenId(UUID tokenId) {
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

  public CrowdsalePurchasePayload walletId(UUID walletId) {
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

  public CrowdsalePurchasePayload amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of tokens to be purchased.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount of tokens to be purchased.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdsalePurchasePayload crowdsalePurchasePayload = (CrowdsalePurchasePayload) o;
    return Objects.equals(this.tokenId, crowdsalePurchasePayload.tokenId) &&
        Objects.equals(this.walletId, crowdsalePurchasePayload.walletId) &&
        Objects.equals(this.amount, crowdsalePurchasePayload.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, walletId, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdsalePurchasePayload {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

