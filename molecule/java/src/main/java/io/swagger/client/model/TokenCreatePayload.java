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
import io.swagger.client.model.OfferingSettingsCreatePayload;
import io.swagger.client.model.TokenRestrictionsPayload;
import java.io.IOException;
import java.util.UUID;

/**
 * TokenCreatePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-19T14:52:04.375-04:00")
public class TokenCreatePayload {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nucleus_model_id")
  private UUID nucleusModelId = null;

  @SerializedName("owner_wallet_id")
  private UUID ownerWalletId = null;

  @SerializedName("total_supply")
  private Integer totalSupply = null;

  @SerializedName("circulating_supply")
  private Integer circulatingSupply = null;

  @SerializedName("conract_address")
  private String conractAddress = null;

  @SerializedName("crowdsale_address")
  private String crowdsaleAddress = null;

  @SerializedName("restrictions")
  private TokenRestrictionsPayload restrictions = null;

  @SerializedName("offering_settings")
  private OfferingSettingsCreatePayload offeringSettings = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public TokenCreatePayload symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the security token. Could be 3 or 4 characters long.
   * @return symbol
  **/
  @ApiModelProperty(required = true, value = "The symbol of the security token. Could be 3 or 4 characters long.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public TokenCreatePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the security token.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the security token.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TokenCreatePayload nucleusModelId(UUID nucleusModelId) {
    this.nucleusModelId = nucleusModelId;
    return this;
  }

   /**
   * The id of the associated Nucleus model for this security token
   * @return nucleusModelId
  **/
  @ApiModelProperty(required = true, value = "The id of the associated Nucleus model for this security token")
  public UUID getNucleusModelId() {
    return nucleusModelId;
  }

  public void setNucleusModelId(UUID nucleusModelId) {
    this.nucleusModelId = nucleusModelId;
  }

  public TokenCreatePayload ownerWalletId(UUID ownerWalletId) {
    this.ownerWalletId = ownerWalletId;
    return this;
  }

   /**
   * The wallet id of the token owner. This wallet has the privileges to do on-chain modifications
   * @return ownerWalletId
  **/
  @ApiModelProperty(required = true, value = "The wallet id of the token owner. This wallet has the privileges to do on-chain modifications")
  public UUID getOwnerWalletId() {
    return ownerWalletId;
  }

  public void setOwnerWalletId(UUID ownerWalletId) {
    this.ownerWalletId = ownerWalletId;
  }

  public TokenCreatePayload totalSupply(Integer totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * The total supply of the security token
   * @return totalSupply
  **/
  @ApiModelProperty(required = true, value = "The total supply of the security token")
  public Integer getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(Integer totalSupply) {
    this.totalSupply = totalSupply;
  }

  public TokenCreatePayload circulatingSupply(Integer circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
    return this;
  }

   /**
   * The amount of tokens in circulation. Defaults to 0
   * @return circulatingSupply
  **/
  @ApiModelProperty(value = "The amount of tokens in circulation. Defaults to 0")
  public Integer getCirculatingSupply() {
    return circulatingSupply;
  }

  public void setCirculatingSupply(Integer circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }

  public TokenCreatePayload conractAddress(String conractAddress) {
    this.conractAddress = conractAddress;
    return this;
  }

   /**
   * The contract address of the security token on the Ethereum blockchain
   * @return conractAddress
  **/
  @ApiModelProperty(value = "The contract address of the security token on the Ethereum blockchain")
  public String getConractAddress() {
    return conractAddress;
  }

  public void setConractAddress(String conractAddress) {
    this.conractAddress = conractAddress;
  }

  public TokenCreatePayload crowdsaleAddress(String crowdsaleAddress) {
    this.crowdsaleAddress = crowdsaleAddress;
    return this;
  }

   /**
   * The crowdsale address of the security token on the Ethereum blockchain
   * @return crowdsaleAddress
  **/
  @ApiModelProperty(value = "The crowdsale address of the security token on the Ethereum blockchain")
  public String getCrowdsaleAddress() {
    return crowdsaleAddress;
  }

  public void setCrowdsaleAddress(String crowdsaleAddress) {
    this.crowdsaleAddress = crowdsaleAddress;
  }

  public TokenCreatePayload restrictions(TokenRestrictionsPayload restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @ApiModelProperty(value = "")
  public TokenRestrictionsPayload getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(TokenRestrictionsPayload restrictions) {
    this.restrictions = restrictions;
  }

  public TokenCreatePayload offeringSettings(OfferingSettingsCreatePayload offeringSettings) {
    this.offeringSettings = offeringSettings;
    return this;
  }

   /**
   * Get offeringSettings
   * @return offeringSettings
  **/
  @ApiModelProperty(value = "")
  public OfferingSettingsCreatePayload getOfferingSettings() {
    return offeringSettings;
  }

  public void setOfferingSettings(OfferingSettingsCreatePayload offeringSettings) {
    this.offeringSettings = offeringSettings;
  }

  public TokenCreatePayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the account in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the account in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public TokenCreatePayload secondaryId(String secondaryId) {
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
    TokenCreatePayload tokenCreatePayload = (TokenCreatePayload) o;
    return Objects.equals(this.symbol, tokenCreatePayload.symbol) &&
        Objects.equals(this.name, tokenCreatePayload.name) &&
        Objects.equals(this.nucleusModelId, tokenCreatePayload.nucleusModelId) &&
        Objects.equals(this.ownerWalletId, tokenCreatePayload.ownerWalletId) &&
        Objects.equals(this.totalSupply, tokenCreatePayload.totalSupply) &&
        Objects.equals(this.circulatingSupply, tokenCreatePayload.circulatingSupply) &&
        Objects.equals(this.conractAddress, tokenCreatePayload.conractAddress) &&
        Objects.equals(this.crowdsaleAddress, tokenCreatePayload.crowdsaleAddress) &&
        Objects.equals(this.restrictions, tokenCreatePayload.restrictions) &&
        Objects.equals(this.offeringSettings, tokenCreatePayload.offeringSettings) &&
        Objects.equals(this.metadata, tokenCreatePayload.metadata) &&
        Objects.equals(this.secondaryId, tokenCreatePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, nucleusModelId, ownerWalletId, totalSupply, circulatingSupply, conractAddress, crowdsaleAddress, restrictions, offeringSettings, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCreatePayload {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nucleusModelId: ").append(toIndentedString(nucleusModelId)).append("\n");
    sb.append("    ownerWalletId: ").append(toIndentedString(ownerWalletId)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    circulatingSupply: ").append(toIndentedString(circulatingSupply)).append("\n");
    sb.append("    conractAddress: ").append(toIndentedString(conractAddress)).append("\n");
    sb.append("    crowdsaleAddress: ").append(toIndentedString(crowdsaleAddress)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    offeringSettings: ").append(toIndentedString(offeringSettings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

