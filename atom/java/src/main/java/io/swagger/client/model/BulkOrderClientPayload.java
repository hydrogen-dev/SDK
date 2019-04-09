/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
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
import org.threeten.bp.LocalDate;

/**
 * BulkOrderClientPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class BulkOrderClientPayload {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("buy_transaction_code_id")
  private UUID buyTransactionCodeId = null;

  @SerializedName("sell_transaction_code_id")
  private UUID sellTransactionCodeId = null;

  public BulkOrderClientPayload date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for all the orders that should be aggregated together in the bulk order record
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date for all the orders that should be aggregated together in the bulk order record")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BulkOrderClientPayload buyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
    return this;
  }

   /**
   * The ID of the transaction code that will ultimately be used to denote the buy transactions
   * @return buyTransactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction code that will ultimately be used to denote the buy transactions")
  public UUID getBuyTransactionCodeId() {
    return buyTransactionCodeId;
  }

  public void setBuyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
  }

  public BulkOrderClientPayload sellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
    return this;
  }

   /**
   * The ID of the transaction code that will ultimately be used to denote the sell transactions
   * @return sellTransactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction code that will ultimately be used to denote the sell transactions")
  public UUID getSellTransactionCodeId() {
    return sellTransactionCodeId;
  }

  public void setSellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOrderClientPayload bulkOrderClientPayload = (BulkOrderClientPayload) o;
    return Objects.equals(this.date, bulkOrderClientPayload.date) &&
        Objects.equals(this.buyTransactionCodeId, bulkOrderClientPayload.buyTransactionCodeId) &&
        Objects.equals(this.sellTransactionCodeId, bulkOrderClientPayload.sellTransactionCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, buyTransactionCodeId, sellTransactionCodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOrderClientPayload {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    buyTransactionCodeId: ").append(toIndentedString(buyTransactionCodeId)).append("\n");
    sb.append("    sellTransactionCodeId: ").append(toIndentedString(sellTransactionCodeId)).append("\n");
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
