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
import io.swagger.client.model.TokenCreatePayload;
import io.swagger.client.model.TokenRestrictionsPayload;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * TokenCreateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-06T09:56:24.055-05:00")
public class TokenCreateResponse {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nucleus_model_id")
  private UUID nucleusModelId = null;

  @SerializedName("owner_wallet_id")
  private UUID ownerWalletId = null;

  @SerializedName("total_supply")
  private BigDecimal totalSupply = null;

  @SerializedName("circulating_supply")
  private BigDecimal circulatingSupply = null;

  @SerializedName("whitelist_address")
  private String whitelistAddress = null;

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

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public TokenCreateResponse symbol(String symbol) {
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

  public TokenCreateResponse name(String name) {
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

  public TokenCreateResponse nucleusModelId(UUID nucleusModelId) {
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

  public TokenCreateResponse ownerWalletId(UUID ownerWalletId) {
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

  public TokenCreateResponse totalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * The total supply of the security token
   * @return totalSupply
  **/
  @ApiModelProperty(required = true, value = "The total supply of the security token")
  public BigDecimal getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
  }

  public TokenCreateResponse circulatingSupply(BigDecimal circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
    return this;
  }

   /**
   * The amount of tokens in circulation. Defaults to 0
   * @return circulatingSupply
  **/
  @ApiModelProperty(value = "The amount of tokens in circulation. Defaults to 0")
  public BigDecimal getCirculatingSupply() {
    return circulatingSupply;
  }

  public void setCirculatingSupply(BigDecimal circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }

  public TokenCreateResponse whitelistAddress(String whitelistAddress) {
    this.whitelistAddress = whitelistAddress;
    return this;
  }

   /**
   * The whitelist address of the security token on the Ethereum blockchain
   * @return whitelistAddress
  **/
  @ApiModelProperty(value = "The whitelist address of the security token on the Ethereum blockchain")
  public String getWhitelistAddress() {
    return whitelistAddress;
  }

  public void setWhitelistAddress(String whitelistAddress) {
    this.whitelistAddress = whitelistAddress;
  }

  public TokenCreateResponse conractAddress(String conractAddress) {
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

  public TokenCreateResponse crowdsaleAddress(String crowdsaleAddress) {
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

  public TokenCreateResponse restrictions(TokenRestrictionsPayload restrictions) {
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

  public TokenCreateResponse offeringSettings(OfferingSettingsCreatePayload offeringSettings) {
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

  public TokenCreateResponse metadata(Object metadata) {
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

  public TokenCreateResponse secondaryId(String secondaryId) {
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

  public TokenCreateResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the token record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the token record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TokenCreateResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the token record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the token record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCreateResponse tokenCreateResponse = (TokenCreateResponse) o;
    return Objects.equals(this.symbol, tokenCreateResponse.symbol) &&
        Objects.equals(this.name, tokenCreateResponse.name) &&
        Objects.equals(this.nucleusModelId, tokenCreateResponse.nucleusModelId) &&
        Objects.equals(this.ownerWalletId, tokenCreateResponse.ownerWalletId) &&
        Objects.equals(this.totalSupply, tokenCreateResponse.totalSupply) &&
        Objects.equals(this.circulatingSupply, tokenCreateResponse.circulatingSupply) &&
        Objects.equals(this.whitelistAddress, tokenCreateResponse.whitelistAddress) &&
        Objects.equals(this.conractAddress, tokenCreateResponse.conractAddress) &&
        Objects.equals(this.crowdsaleAddress, tokenCreateResponse.crowdsaleAddress) &&
        Objects.equals(this.restrictions, tokenCreateResponse.restrictions) &&
        Objects.equals(this.offeringSettings, tokenCreateResponse.offeringSettings) &&
        Objects.equals(this.metadata, tokenCreateResponse.metadata) &&
        Objects.equals(this.secondaryId, tokenCreateResponse.secondaryId) &&
        Objects.equals(this.id, tokenCreateResponse.id) &&
        Objects.equals(this.createDate, tokenCreateResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, nucleusModelId, ownerWalletId, totalSupply, circulatingSupply, whitelistAddress, conractAddress, crowdsaleAddress, restrictions, offeringSettings, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCreateResponse {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nucleusModelId: ").append(toIndentedString(nucleusModelId)).append("\n");
    sb.append("    ownerWalletId: ").append(toIndentedString(ownerWalletId)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    circulatingSupply: ").append(toIndentedString(circulatingSupply)).append("\n");
    sb.append("    whitelistAddress: ").append(toIndentedString(whitelistAddress)).append("\n");
    sb.append("    conractAddress: ").append(toIndentedString(conractAddress)).append("\n");
    sb.append("    crowdsaleAddress: ").append(toIndentedString(crowdsaleAddress)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    offeringSettings: ").append(toIndentedString(offeringSettings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

