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
 * SecurityExclusionPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class SecurityExclusionPayload {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("is_restrict_buy")
  private Boolean isRestrictBuy = null;

  @SerializedName("is_restrict_sell")
  private Boolean isRestrictSell = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public SecurityExclusionPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client to which the security exclusion applies
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the client to which the security exclusion applies")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SecurityExclusionPayload securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security that is subject to the exclusion
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security that is subject to the exclusion")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public SecurityExclusionPayload isRestrictBuy(Boolean isRestrictBuy) {
    this.isRestrictBuy = isRestrictBuy;
    return this;
  }

   /**
   * Indicates if the exclusion applies to buy transactions
   * @return isRestrictBuy
  **/
  @ApiModelProperty(required = true, value = "Indicates if the exclusion applies to buy transactions")
  public Boolean isIsRestrictBuy() {
    return isRestrictBuy;
  }

  public void setIsRestrictBuy(Boolean isRestrictBuy) {
    this.isRestrictBuy = isRestrictBuy;
  }

  public SecurityExclusionPayload isRestrictSell(Boolean isRestrictSell) {
    this.isRestrictSell = isRestrictSell;
    return this;
  }

   /**
   * Indicates if the exclusion applies to sell transactions
   * @return isRestrictSell
  **/
  @ApiModelProperty(required = true, value = "Indicates if the exclusion applies to sell transactions")
  public Boolean isIsRestrictSell() {
    return isRestrictSell;
  }

  public void setIsRestrictSell(Boolean isRestrictSell) {
    this.isRestrictSell = isRestrictSell;
  }

  public SecurityExclusionPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the security exclusion applies (if account-specific)
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the account to which the security exclusion applies (if account-specific)")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SecurityExclusionPayload portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The ID of the portfolio to which the security exclusion applies (if portfolio-specific)
   * @return portfolioId
  **/
  @ApiModelProperty(value = "The ID of the portfolio to which the security exclusion applies (if portfolio-specific)")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public SecurityExclusionPayload secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityExclusionPayload securityExclusionPayload = (SecurityExclusionPayload) o;
    return Objects.equals(this.clientId, securityExclusionPayload.clientId) &&
        Objects.equals(this.securityId, securityExclusionPayload.securityId) &&
        Objects.equals(this.isRestrictBuy, securityExclusionPayload.isRestrictBuy) &&
        Objects.equals(this.isRestrictSell, securityExclusionPayload.isRestrictSell) &&
        Objects.equals(this.accountId, securityExclusionPayload.accountId) &&
        Objects.equals(this.portfolioId, securityExclusionPayload.portfolioId) &&
        Objects.equals(this.secondaryId, securityExclusionPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, securityId, isRestrictBuy, isRestrictSell, accountId, portfolioId, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityExclusionPayload {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    isRestrictBuy: ").append(toIndentedString(isRestrictBuy)).append("\n");
    sb.append("    isRestrictSell: ").append(toIndentedString(isRestrictSell)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

