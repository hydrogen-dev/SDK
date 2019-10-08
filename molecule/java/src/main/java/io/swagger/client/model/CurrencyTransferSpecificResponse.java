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
 * CurrencyTransferSpecificResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T11:09:45.105-04:00")
public class CurrencyTransferSpecificResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("sender_wallet_id")
  private UUID senderWalletId = null;

  @SerializedName("receiver_wallet_id")
  private UUID receiverWalletId = null;

  @SerializedName("currency_symbol")
  private String currencySymbol = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("tx_hash")
  private String txHash = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public CurrencyTransferSpecificResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the token supply
   * @return id
  **/
  @ApiModelProperty(value = "ID of the token supply")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CurrencyTransferSpecificResponse senderWalletId(UUID senderWalletId) {
    this.senderWalletId = senderWalletId;
    return this;
  }

   /**
   * ID of the sender wallet
   * @return senderWalletId
  **/
  @ApiModelProperty(value = "ID of the sender wallet")
  public UUID getSenderWalletId() {
    return senderWalletId;
  }

  public void setSenderWalletId(UUID senderWalletId) {
    this.senderWalletId = senderWalletId;
  }

  public CurrencyTransferSpecificResponse receiverWalletId(UUID receiverWalletId) {
    this.receiverWalletId = receiverWalletId;
    return this;
  }

   /**
   * ID of the receiver wallet
   * @return receiverWalletId
  **/
  @ApiModelProperty(value = "ID of the receiver wallet")
  public UUID getReceiverWalletId() {
    return receiverWalletId;
  }

  public void setReceiverWalletId(UUID receiverWalletId) {
    this.receiverWalletId = receiverWalletId;
  }

  public CurrencyTransferSpecificResponse currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Symbol of the currency being transferred
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "Symbol of the currency being transferred")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CurrencyTransferSpecificResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of currencies being transferred
   * @return amount
  **/
  @ApiModelProperty(value = "Amount of currencies being transferred")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CurrencyTransferSpecificResponse txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Hash of the transfer transaction
   * @return txHash
  **/
  @ApiModelProperty(value = "Hash of the transfer transaction")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public CurrencyTransferSpecificResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the currency transfer record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the currency transfer record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public CurrencyTransferSpecificResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the currency transfer record was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the currency transfer record was updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyTransferSpecificResponse currencyTransferSpecificResponse = (CurrencyTransferSpecificResponse) o;
    return Objects.equals(this.id, currencyTransferSpecificResponse.id) &&
        Objects.equals(this.senderWalletId, currencyTransferSpecificResponse.senderWalletId) &&
        Objects.equals(this.receiverWalletId, currencyTransferSpecificResponse.receiverWalletId) &&
        Objects.equals(this.currencySymbol, currencyTransferSpecificResponse.currencySymbol) &&
        Objects.equals(this.amount, currencyTransferSpecificResponse.amount) &&
        Objects.equals(this.txHash, currencyTransferSpecificResponse.txHash) &&
        Objects.equals(this.createDate, currencyTransferSpecificResponse.createDate) &&
        Objects.equals(this.updateDate, currencyTransferSpecificResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, senderWalletId, receiverWalletId, currencySymbol, amount, txHash, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyTransferSpecificResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    senderWalletId: ").append(toIndentedString(senderWalletId)).append("\n");
    sb.append("    receiverWalletId: ").append(toIndentedString(receiverWalletId)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

