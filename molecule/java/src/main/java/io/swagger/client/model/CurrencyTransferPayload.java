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
 * CurrencyTransferPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T18:21:14.716-05:00")
public class CurrencyTransferPayload {
  @SerializedName("sender_wallet_id")
  private UUID senderWalletId = null;

  @SerializedName("receiver_wallet_id")
  private UUID receiverWalletId = null;

  @SerializedName("currency_symbol")
  private String currencySymbol = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  public CurrencyTransferPayload senderWalletId(UUID senderWalletId) {
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

  public CurrencyTransferPayload receiverWalletId(UUID receiverWalletId) {
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

  public CurrencyTransferPayload currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * The uuid of the token being transferred.
   * @return currencySymbol
  **/
  @ApiModelProperty(required = true, value = "The uuid of the token being transferred.")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CurrencyTransferPayload amount(BigDecimal amount) {
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
    CurrencyTransferPayload currencyTransferPayload = (CurrencyTransferPayload) o;
    return Objects.equals(this.senderWalletId, currencyTransferPayload.senderWalletId) &&
        Objects.equals(this.receiverWalletId, currencyTransferPayload.receiverWalletId) &&
        Objects.equals(this.currencySymbol, currencyTransferPayload.currencySymbol) &&
        Objects.equals(this.amount, currencyTransferPayload.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderWalletId, receiverWalletId, currencySymbol, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyTransferPayload {\n");
    
    sb.append("    senderWalletId: ").append(toIndentedString(senderWalletId)).append("\n");
    sb.append("    receiverWalletId: ").append(toIndentedString(receiverWalletId)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
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

