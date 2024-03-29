/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * SecurityExclusion Object
 */
@ApiModel(description = "SecurityExclusion Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class SecurityExclusion {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_restrict_buy")
  private Boolean isRestrictBuy = null;

  @SerializedName("is_restrict_sell")
  private Boolean isRestrictSell = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public SecurityExclusion accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * account id
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "account id")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SecurityExclusion clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client id
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", required = true, value = "Client id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public SecurityExclusion createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public SecurityExclusion id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SecurityExclusion isRestrictBuy(Boolean isRestrictBuy) {
    this.isRestrictBuy = isRestrictBuy;
    return this;
  }

   /**
   * restrict buy
   * @return isRestrictBuy
  **/
  @ApiModelProperty(example = "false", required = true, value = "restrict buy")
  public Boolean isIsRestrictBuy() {
    return isRestrictBuy;
  }

  public void setIsRestrictBuy(Boolean isRestrictBuy) {
    this.isRestrictBuy = isRestrictBuy;
  }

  public SecurityExclusion isRestrictSell(Boolean isRestrictSell) {
    this.isRestrictSell = isRestrictSell;
    return this;
  }

   /**
   * restrict sell
   * @return isRestrictSell
  **/
  @ApiModelProperty(example = "false", required = true, value = "restrict sell")
  public Boolean isIsRestrictSell() {
    return isRestrictSell;
  }

  public void setIsRestrictSell(Boolean isRestrictSell) {
    this.isRestrictSell = isRestrictSell;
  }

  public SecurityExclusion metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SecurityExclusion putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public SecurityExclusion portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolio id
   * @return portfolioId
  **/
  @ApiModelProperty(example = "c34794e9-f927-468b-b47e-ea17c3d533c5", value = "portfolio id")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public SecurityExclusion secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public SecurityExclusion securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * Security id
   * @return securityId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", required = true, value = "Security id")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public SecurityExclusion updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityExclusion securityExclusion = (SecurityExclusion) o;
    return Objects.equals(this.accountId, securityExclusion.accountId) &&
        Objects.equals(this.clientId, securityExclusion.clientId) &&
        Objects.equals(this.createDate, securityExclusion.createDate) &&
        Objects.equals(this.id, securityExclusion.id) &&
        Objects.equals(this.isRestrictBuy, securityExclusion.isRestrictBuy) &&
        Objects.equals(this.isRestrictSell, securityExclusion.isRestrictSell) &&
        Objects.equals(this.metadata, securityExclusion.metadata) &&
        Objects.equals(this.portfolioId, securityExclusion.portfolioId) &&
        Objects.equals(this.secondaryId, securityExclusion.secondaryId) &&
        Objects.equals(this.securityId, securityExclusion.securityId) &&
        Objects.equals(this.updateDate, securityExclusion.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clientId, createDate, id, isRestrictBuy, isRestrictSell, metadata, portfolioId, secondaryId, securityId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityExclusion {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRestrictBuy: ").append(toIndentedString(isRestrictBuy)).append("\n");
    sb.append("    isRestrictSell: ").append(toIndentedString(isRestrictSell)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

