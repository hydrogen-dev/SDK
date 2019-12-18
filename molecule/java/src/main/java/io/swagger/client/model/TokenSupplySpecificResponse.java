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
import java.math.BigDecimal;
import java.util.UUID;

/**
 * TokenSupplySpecificResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:21:57.070-05:00")
public class TokenSupplySpecificResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("available_supply")
  private BigDecimal availableSupply = null;

  @SerializedName("token_id")
  private UUID tokenId = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public TokenSupplySpecificResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the token supply
   * @return id
  **/
  @ApiModelProperty(value = "ID of the token supply")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TokenSupplySpecificResponse availableSupply(BigDecimal availableSupply) {
    this.availableSupply = availableSupply;
    return this;
  }

   /**
   * Available supply in a token&#39;s crowdsale contract
   * @return availableSupply
  **/
  @ApiModelProperty(value = "Available supply in a token's crowdsale contract")
  public BigDecimal getAvailableSupply() {
    return availableSupply;
  }

  public void setAvailableSupply(BigDecimal availableSupply) {
    this.availableSupply = availableSupply;
  }

  public TokenSupplySpecificResponse tokenId(UUID tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The ID of the associated token.
   * @return tokenId
  **/
  @ApiModelProperty(value = "The ID of the associated token.")
  public UUID getTokenId() {
    return tokenId;
  }

  public void setTokenId(UUID tokenId) {
    this.tokenId = tokenId;
  }

  public TokenSupplySpecificResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the token supply record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the token supply record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public TokenSupplySpecificResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the token supply record was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the token supply record was updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenSupplySpecificResponse tokenSupplySpecificResponse = (TokenSupplySpecificResponse) o;
    return Objects.equals(this.id, tokenSupplySpecificResponse.id) &&
        Objects.equals(this.availableSupply, tokenSupplySpecificResponse.availableSupply) &&
        Objects.equals(this.tokenId, tokenSupplySpecificResponse.tokenId) &&
        Objects.equals(this.createDate, tokenSupplySpecificResponse.createDate) &&
        Objects.equals(this.updateDate, tokenSupplySpecificResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, availableSupply, tokenId, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenSupplySpecificResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    availableSupply: ").append(toIndentedString(availableSupply)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

