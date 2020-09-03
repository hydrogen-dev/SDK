/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.molecule.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * TokenWhitelists
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-21T09:54:56.296Z")
public class TokenWhitelists {
  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("sell_restriction_date")
  private OffsetDateTime sellRestrictionDate = null;

  @SerializedName("buy_restriction_date")
  private OffsetDateTime buyRestrictionDate = null;

  public TokenWhitelists tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public TokenWhitelists role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public TokenWhitelists sellRestrictionDate(OffsetDateTime sellRestrictionDate) {
    this.sellRestrictionDate = sellRestrictionDate;
    return this;
  }

   /**
   * Get sellRestrictionDate
   * @return sellRestrictionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSellRestrictionDate() {
    return sellRestrictionDate;
  }

  public void setSellRestrictionDate(OffsetDateTime sellRestrictionDate) {
    this.sellRestrictionDate = sellRestrictionDate;
  }

  public TokenWhitelists buyRestrictionDate(OffsetDateTime buyRestrictionDate) {
    this.buyRestrictionDate = buyRestrictionDate;
    return this;
  }

   /**
   * Get buyRestrictionDate
   * @return buyRestrictionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBuyRestrictionDate() {
    return buyRestrictionDate;
  }

  public void setBuyRestrictionDate(OffsetDateTime buyRestrictionDate) {
    this.buyRestrictionDate = buyRestrictionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenWhitelists tokenWhitelists = (TokenWhitelists) o;
    return Objects.equals(this.tokenId, tokenWhitelists.tokenId) &&
        Objects.equals(this.role, tokenWhitelists.role) &&
        Objects.equals(this.sellRestrictionDate, tokenWhitelists.sellRestrictionDate) &&
        Objects.equals(this.buyRestrictionDate, tokenWhitelists.buyRestrictionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, role, sellRestrictionDate, buyRestrictionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenWhitelists {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    sellRestrictionDate: ").append(toIndentedString(sellRestrictionDate)).append("\n");
    sb.append("    buyRestrictionDate: ").append(toIndentedString(buyRestrictionDate)).append("\n");
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
