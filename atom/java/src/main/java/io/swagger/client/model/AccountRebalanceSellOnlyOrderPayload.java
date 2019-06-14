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
 * AccountRebalanceSellOnlyOrderPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class AccountRebalanceSellOnlyOrderPayload {
  @SerializedName("sell_transaction_code_id")
  private UUID sellTransactionCodeId = null;

  @SerializedName("buy_transaction_code_id")
  private UUID buyTransactionCodeId = null;

  @SerializedName("cash_portfolio_id")
  private UUID cashPortfolioId = null;

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

  public AccountRebalanceSellOnlyOrderPayload sellTransactionCodeId(UUID sellTransactionCodeId) {
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

  public AccountRebalanceSellOnlyOrderPayload buyTransactionCodeId(UUID buyTransactionCodeId) {
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

  public AccountRebalanceSellOnlyOrderPayload cashPortfolioId(UUID cashPortfolioId) {
    this.cashPortfolioId = cashPortfolioId;
    return this;
  }

   /**
   * The ID of the cash portfolio for the account
   * @return cashPortfolioId
  **/
  @ApiModelProperty(value = "The ID of the cash portfolio for the account")
  public UUID getCashPortfolioId() {
    return cashPortfolioId;
  }

  public void setCashPortfolioId(UUID cashPortfolioId) {
    this.cashPortfolioId = cashPortfolioId;
  }

  public AccountRebalanceSellOnlyOrderPayload commitOrders(Boolean commitOrders) {
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

  public AccountRebalanceSellOnlyOrderPayload nonFractional(Boolean nonFractional) {
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

  public AccountRebalanceSellOnlyOrderPayload portThreshold(Double portThreshold) {
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

  public AccountRebalanceSellOnlyOrderPayload restrictionsOn(Boolean restrictionsOn) {
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

  public AccountRebalanceSellOnlyOrderPayload buyThreshold(Double buyThreshold) {
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

  public AccountRebalanceSellOnlyOrderPayload sellThreshold(Double sellThreshold) {
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

  public AccountRebalanceSellOnlyOrderPayload useStrategic(Boolean useStrategic) {
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
    AccountRebalanceSellOnlyOrderPayload accountRebalanceSellOnlyOrderPayload = (AccountRebalanceSellOnlyOrderPayload) o;
    return Objects.equals(this.sellTransactionCodeId, accountRebalanceSellOnlyOrderPayload.sellTransactionCodeId) &&
        Objects.equals(this.buyTransactionCodeId, accountRebalanceSellOnlyOrderPayload.buyTransactionCodeId) &&
        Objects.equals(this.cashPortfolioId, accountRebalanceSellOnlyOrderPayload.cashPortfolioId) &&
        Objects.equals(this.commitOrders, accountRebalanceSellOnlyOrderPayload.commitOrders) &&
        Objects.equals(this.nonFractional, accountRebalanceSellOnlyOrderPayload.nonFractional) &&
        Objects.equals(this.portThreshold, accountRebalanceSellOnlyOrderPayload.portThreshold) &&
        Objects.equals(this.restrictionsOn, accountRebalanceSellOnlyOrderPayload.restrictionsOn) &&
        Objects.equals(this.buyThreshold, accountRebalanceSellOnlyOrderPayload.buyThreshold) &&
        Objects.equals(this.sellThreshold, accountRebalanceSellOnlyOrderPayload.sellThreshold) &&
        Objects.equals(this.useStrategic, accountRebalanceSellOnlyOrderPayload.useStrategic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellTransactionCodeId, buyTransactionCodeId, cashPortfolioId, commitOrders, nonFractional, portThreshold, restrictionsOn, buyThreshold, sellThreshold, useStrategic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRebalanceSellOnlyOrderPayload {\n");
    
    sb.append("    sellTransactionCodeId: ").append(toIndentedString(sellTransactionCodeId)).append("\n");
    sb.append("    buyTransactionCodeId: ").append(toIndentedString(buyTransactionCodeId)).append("\n");
    sb.append("    cashPortfolioId: ").append(toIndentedString(cashPortfolioId)).append("\n");
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

