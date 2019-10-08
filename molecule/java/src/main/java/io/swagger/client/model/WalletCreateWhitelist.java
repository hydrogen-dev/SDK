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
 * WalletCreateWhitelist
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T11:09:45.105-04:00")
public class WalletCreateWhitelist {
  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("sell_restriction")
  private String sellRestriction = null;

  @SerializedName("buy_restriction")
  private String buyRestriction = null;

  public WalletCreateWhitelist tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The ID of the token whitelisted
   * @return tokenId
  **/
  @ApiModelProperty(required = true, value = "The ID of the token whitelisted")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public WalletCreateWhitelist role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the wallet over the token
   * @return role
  **/
  @ApiModelProperty(value = "The role of the wallet over the token")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public WalletCreateWhitelist sellRestriction(String sellRestriction) {
    this.sellRestriction = sellRestriction;
    return this;
  }

   /**
   * The date when resale restrictions should be lifted for the wallet
   * @return sellRestriction
  **/
  @ApiModelProperty(value = "The date when resale restrictions should be lifted for the wallet")
  public String getSellRestriction() {
    return sellRestriction;
  }

  public void setSellRestriction(String sellRestriction) {
    this.sellRestriction = sellRestriction;
  }

  public WalletCreateWhitelist buyRestriction(String buyRestriction) {
    this.buyRestriction = buyRestriction;
    return this;
  }

   /**
   * The date when the buy restrictions should be lifted for the wallet
   * @return buyRestriction
  **/
  @ApiModelProperty(value = "The date when the buy restrictions should be lifted for the wallet")
  public String getBuyRestriction() {
    return buyRestriction;
  }

  public void setBuyRestriction(String buyRestriction) {
    this.buyRestriction = buyRestriction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateWhitelist walletCreateWhitelist = (WalletCreateWhitelist) o;
    return Objects.equals(this.tokenId, walletCreateWhitelist.tokenId) &&
        Objects.equals(this.role, walletCreateWhitelist.role) &&
        Objects.equals(this.sellRestriction, walletCreateWhitelist.sellRestriction) &&
        Objects.equals(this.buyRestriction, walletCreateWhitelist.buyRestriction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, role, sellRestriction, buyRestriction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateWhitelist {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    sellRestriction: ").append(toIndentedString(sellRestriction)).append("\n");
    sb.append("    buyRestriction: ").append(toIndentedString(buyRestriction)).append("\n");
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

