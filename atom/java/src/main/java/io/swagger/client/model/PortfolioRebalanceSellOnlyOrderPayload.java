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
import java.io.IOException;
import java.util.UUID;

/**
 * PortfolioRebalanceSellOnlyOrderPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class PortfolioRebalanceSellOnlyOrderPayload {
  @SerializedName("sell_transaction_code_id")
  private UUID sellTransactionCodeId = null;

  @SerializedName("buy_transaction_code_id")
  private UUID buyTransactionCodeId = null;

  @SerializedName("cash_sec_id")
  private UUID cashSecId = null;

  @SerializedName("commit_orders")
  private Boolean commitOrders = true;

  @SerializedName("non_fractional")
  private Boolean nonFractional = false;

  @SerializedName("port_threshold")
  private Double portThreshold = 0.0d;

  @SerializedName("restrictions_on")
  private Boolean restrictionsOn = false;

  @SerializedName("buy_threshold")
  private Double buyThreshold = 0.0d;

  @SerializedName("sell_threshold")
  private Double sellThreshold = 0.0d;

  @SerializedName("use_strategic")
  private Boolean useStrategic = false;

  public PortfolioRebalanceSellOnlyOrderPayload sellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
    return this;
  }

   /**
   * The ID of the transaction code to denote a sell transaction
   * @return sellTransactionCodeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction code to denote a sell transaction")
  public UUID getSellTransactionCodeId() {
    return sellTransactionCodeId;
  }

  public void setSellTransactionCodeId(UUID sellTransactionCodeId) {
    this.sellTransactionCodeId = sellTransactionCodeId;
  }

  public PortfolioRebalanceSellOnlyOrderPayload buyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
    return this;
  }

   /**
   * The ID of the transaction code to denote a buy transaction
   * @return buyTransactionCodeId
  **/
  @ApiModelProperty(value = "The ID of the transaction code to denote a buy transaction")
  public UUID getBuyTransactionCodeId() {
    return buyTransactionCodeId;
  }

  public void setBuyTransactionCodeId(UUID buyTransactionCodeId) {
    this.buyTransactionCodeId = buyTransactionCodeId;
  }

  public PortfolioRebalanceSellOnlyOrderPayload cashSecId(UUID cashSecId) {
    this.cashSecId = cashSecId;
    return this;
  }

   /**
   * The ID of the cash security for the portfolio
   * @return cashSecId
  **/
  @ApiModelProperty(value = "The ID of the cash security for the portfolio")
  public UUID getCashSecId() {
    return cashSecId;
  }

  public void setCashSecId(UUID cashSecId) {
    this.cashSecId = cashSecId;
  }

  public PortfolioRebalanceSellOnlyOrderPayload commitOrders(Boolean commitOrders) {
    this.commitOrders = commitOrders;
    return this;
  }

   /**
   * Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed
   * @return commitOrders
  **/
  @ApiModelProperty(value = "Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed")
  public Boolean isCommitOrders() {
    return commitOrders;
  }

  public void setCommitOrders(Boolean commitOrders) {
    this.commitOrders = commitOrders;
  }

  public PortfolioRebalanceSellOnlyOrderPayload nonFractional(Boolean nonFractional) {
    this.nonFractional = nonFractional;
    return this;
  }

   /**
   * Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed
   * @return nonFractional
  **/
  @ApiModelProperty(value = "Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed")
  public Boolean isNonFractional() {
    return nonFractional;
  }

  public void setNonFractional(Boolean nonFractional) {
    this.nonFractional = nonFractional;
  }

  public PortfolioRebalanceSellOnlyOrderPayload portThreshold(Double portThreshold) {
    this.portThreshold = portThreshold;
    return this;
  }

   /**
   * Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0
   * @return portThreshold
  **/
  @ApiModelProperty(value = "Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0")
  public Double getPortThreshold() {
    return portThreshold;
  }

  public void setPortThreshold(Double portThreshold) {
    this.portThreshold = portThreshold;
  }

  public PortfolioRebalanceSellOnlyOrderPayload restrictionsOn(Boolean restrictionsOn) {
    this.restrictionsOn = restrictionsOn;
    return this;
  }

   /**
   * Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not
   * @return restrictionsOn
  **/
  @ApiModelProperty(value = "Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not")
  public Boolean isRestrictionsOn() {
    return restrictionsOn;
  }

  public void setRestrictionsOn(Boolean restrictionsOn) {
    this.restrictionsOn = restrictionsOn;
  }

  public PortfolioRebalanceSellOnlyOrderPayload buyThreshold(Double buyThreshold) {
    this.buyThreshold = buyThreshold;
    return this;
  }

   /**
   * Buying threshold for the account as the number of shares. Defaults to 0
   * @return buyThreshold
  **/
  @ApiModelProperty(value = "Buying threshold for the account as the number of shares. Defaults to 0")
  public Double getBuyThreshold() {
    return buyThreshold;
  }

  public void setBuyThreshold(Double buyThreshold) {
    this.buyThreshold = buyThreshold;
  }

  public PortfolioRebalanceSellOnlyOrderPayload sellThreshold(Double sellThreshold) {
    this.sellThreshold = sellThreshold;
    return this;
  }

   /**
   * Selling threshold for the account as the number of shares. Defaults to 0
   * @return sellThreshold
  **/
  @ApiModelProperty(value = "Selling threshold for the account as the number of shares. Defaults to 0")
  public Double getSellThreshold() {
    return sellThreshold;
  }

  public void setSellThreshold(Double sellThreshold) {
    this.sellThreshold = sellThreshold;
  }

  public PortfolioRebalanceSellOnlyOrderPayload useStrategic(Boolean useStrategic) {
    this.useStrategic = useStrategic;
    return this;
  }

   /**
   * Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not
   * @return useStrategic
  **/
  @ApiModelProperty(value = "Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not")
  public Boolean isUseStrategic() {
    return useStrategic;
  }

  public void setUseStrategic(Boolean useStrategic) {
    this.useStrategic = useStrategic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioRebalanceSellOnlyOrderPayload portfolioRebalanceSellOnlyOrderPayload = (PortfolioRebalanceSellOnlyOrderPayload) o;
    return Objects.equals(this.sellTransactionCodeId, portfolioRebalanceSellOnlyOrderPayload.sellTransactionCodeId) &&
        Objects.equals(this.buyTransactionCodeId, portfolioRebalanceSellOnlyOrderPayload.buyTransactionCodeId) &&
        Objects.equals(this.cashSecId, portfolioRebalanceSellOnlyOrderPayload.cashSecId) &&
        Objects.equals(this.commitOrders, portfolioRebalanceSellOnlyOrderPayload.commitOrders) &&
        Objects.equals(this.nonFractional, portfolioRebalanceSellOnlyOrderPayload.nonFractional) &&
        Objects.equals(this.portThreshold, portfolioRebalanceSellOnlyOrderPayload.portThreshold) &&
        Objects.equals(this.restrictionsOn, portfolioRebalanceSellOnlyOrderPayload.restrictionsOn) &&
        Objects.equals(this.buyThreshold, portfolioRebalanceSellOnlyOrderPayload.buyThreshold) &&
        Objects.equals(this.sellThreshold, portfolioRebalanceSellOnlyOrderPayload.sellThreshold) &&
        Objects.equals(this.useStrategic, portfolioRebalanceSellOnlyOrderPayload.useStrategic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellTransactionCodeId, buyTransactionCodeId, cashSecId, commitOrders, nonFractional, portThreshold, restrictionsOn, buyThreshold, sellThreshold, useStrategic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioRebalanceSellOnlyOrderPayload {\n");
    
    sb.append("    sellTransactionCodeId: ").append(toIndentedString(sellTransactionCodeId)).append("\n");
    sb.append("    buyTransactionCodeId: ").append(toIndentedString(buyTransactionCodeId)).append("\n");
    sb.append("    cashSecId: ").append(toIndentedString(cashSecId)).append("\n");
    sb.append("    commitOrders: ").append(toIndentedString(commitOrders)).append("\n");
    sb.append("    nonFractional: ").append(toIndentedString(nonFractional)).append("\n");
    sb.append("    portThreshold: ").append(toIndentedString(portThreshold)).append("\n");
    sb.append("    restrictionsOn: ").append(toIndentedString(restrictionsOn)).append("\n");
    sb.append("    buyThreshold: ").append(toIndentedString(buyThreshold)).append("\n");
    sb.append("    sellThreshold: ").append(toIndentedString(sellThreshold)).append("\n");
    sb.append("    useStrategic: ").append(toIndentedString(useStrategic)).append("\n");
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

