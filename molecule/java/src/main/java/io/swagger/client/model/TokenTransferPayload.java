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
 * TokenTransferPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-21T12:13:20.984-05:00")
public class TokenTransferPayload {
  @SerializedName("sender_wallet_id")
  private UUID senderWalletId = null;

  @SerializedName("receiver_wallet_id")
  private UUID receiverWalletId = null;

  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  public TokenTransferPayload senderWalletId(UUID senderWalletId) {
    this.senderWalletId = senderWalletId;
    return this;
  }

   /**
   * The uuid of the sender wallet.
   * @return senderWalletId
  **/
  @ApiModelProperty(required = true, value = "The uuid of the sender wallet.")
  public UUID getSenderWalletId() {
    return senderWalletId;
  }

  public void setSenderWalletId(UUID senderWalletId) {
    this.senderWalletId = senderWalletId;
  }

  public TokenTransferPayload receiverWalletId(UUID receiverWalletId) {
    this.receiverWalletId = receiverWalletId;
    return this;
  }

   /**
   * The uuid of the receiver wallet.
   * @return receiverWalletId
  **/
  @ApiModelProperty(required = true, value = "The uuid of the receiver wallet.")
  public UUID getReceiverWalletId() {
    return receiverWalletId;
  }

  public void setReceiverWalletId(UUID receiverWalletId) {
    this.receiverWalletId = receiverWalletId;
  }

  public TokenTransferPayload tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The uuid of the token being transferred.
   * @return tokenId
  **/
  @ApiModelProperty(required = true, value = "The uuid of the token being transferred.")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public TokenTransferPayload amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of tokens to be transferred.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount of tokens to be transferred.")
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
    TokenTransferPayload tokenTransferPayload = (TokenTransferPayload) o;
    return Objects.equals(this.senderWalletId, tokenTransferPayload.senderWalletId) &&
        Objects.equals(this.receiverWalletId, tokenTransferPayload.receiverWalletId) &&
        Objects.equals(this.tokenId, tokenTransferPayload.tokenId) &&
        Objects.equals(this.amount, tokenTransferPayload.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderWalletId, receiverWalletId, tokenId, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenTransferPayload {\n");
    
    sb.append("    senderWalletId: ").append(toIndentedString(senderWalletId)).append("\n");
    sb.append("    receiverWalletId: ").append(toIndentedString(receiverWalletId)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

