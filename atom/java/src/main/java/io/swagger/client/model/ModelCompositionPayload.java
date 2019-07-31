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
import io.swagger.client.model.ModelCompositionPayloadHoldings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ModelCompositionPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class ModelCompositionPayload {
  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("holdings")
  private List<ModelCompositionPayloadHoldings> holdings = new ArrayList<ModelCompositionPayloadHoldings>();

  @SerializedName("sell_transaction_code_id")
  private UUID sellTransactionCodeId = null;

  @SerializedName("buy_transaction_code_id")
  private UUID buyTransactionCodeId = null;

  public ModelCompositionPayload modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model whose holdings are to be updated
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model whose holdings are to be updated")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public ModelCompositionPayload holdings(List<ModelCompositionPayloadHoldings> holdings) {
    this.holdings = holdings;
    return this;
  }

  public ModelCompositionPayload addHoldingsItem(ModelCompositionPayloadHoldings holdingsItem) {
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * The information for the new holding records to be created
   * @return holdings
  **/
  @ApiModelProperty(required = true, value = "The information for the new holding records to be created")
  public List<ModelCompositionPayloadHoldings> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<ModelCompositionPayloadHoldings> holdings) {
    this.holdings = holdings;
  }

  public ModelCompositionPayload sellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
    return this;
  }

   /**
   * The transaction_code_id to be populated in any model transaction to sell securities
   * @return sellTransactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The transaction_code_id to be populated in any model transaction to sell securities")
  public UUID getSellTransactionCodeId() {
    return sellTransactionCodeId;
  }

  public void setSellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
  }

  public ModelCompositionPayload buyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
    return this;
  }

   /**
   * The transaction_code_id to be populated in any model transaction to buy securities
   * @return buyTransactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The transaction_code_id to be populated in any model transaction to buy securities")
  public UUID getBuyTransactionCodeId() {
    return buyTransactionCodeId;
  }

  public void setBuyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCompositionPayload modelCompositionPayload = (ModelCompositionPayload) o;
    return Objects.equals(this.modelId, modelCompositionPayload.modelId) &&
        Objects.equals(this.holdings, modelCompositionPayload.holdings) &&
        Objects.equals(this.sellTransactionCodeId, modelCompositionPayload.sellTransactionCodeId) &&
        Objects.equals(this.buyTransactionCodeId, modelCompositionPayload.buyTransactionCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, holdings, sellTransactionCodeId, buyTransactionCodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCompositionPayload {\n");
    
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    sellTransactionCodeId: ").append(toIndentedString(sellTransactionCodeId)).append("\n");
    sb.append("    buyTransactionCodeId: ").append(toIndentedString(buyTransactionCodeId)).append("\n");
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

