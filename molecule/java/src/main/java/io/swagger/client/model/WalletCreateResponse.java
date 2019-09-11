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
import io.swagger.client.model.WalletCreateClient;
import io.swagger.client.model.WalletCreatePayload;
import io.swagger.client.model.WalletCreateWhitelist;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * WalletCreateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-11T18:23:25.119-04:00")
public class WalletCreateResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("clients")
  private List<WalletCreateClient> clients = null;

  @SerializedName("token_whitelists")
  private List<WalletCreateWhitelist> tokenWhitelists = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public WalletCreateResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the wallet
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the wallet")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WalletCreateResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the wallet. Can be individual, business, trust, or contract
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the wallet. Can be individual, business, trust, or contract")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WalletCreateResponse clients(List<WalletCreateClient> clients) {
    this.clients = clients;
    return this;
  }

  public WalletCreateResponse addClientsItem(WalletCreateClient clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<WalletCreateClient>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of nucleus clients associated with the wallet and their association type
   * @return clients
  **/
  @ApiModelProperty(value = "List of nucleus clients associated with the wallet and their association type")
  public List<WalletCreateClient> getClients() {
    return clients;
  }

  public void setClients(List<WalletCreateClient> clients) {
    this.clients = clients;
  }

  public WalletCreateResponse tokenWhitelists(List<WalletCreateWhitelist> tokenWhitelists) {
    this.tokenWhitelists = tokenWhitelists;
    return this;
  }

  public WalletCreateResponse addTokenWhitelistsItem(WalletCreateWhitelist tokenWhitelistsItem) {
    if (this.tokenWhitelists == null) {
      this.tokenWhitelists = new ArrayList<WalletCreateWhitelist>();
    }
    this.tokenWhitelists.add(tokenWhitelistsItem);
    return this;
  }

   /**
   * List of tokens where the wallet is whitelisted
   * @return tokenWhitelists
  **/
  @ApiModelProperty(value = "List of tokens where the wallet is whitelisted")
  public List<WalletCreateWhitelist> getTokenWhitelists() {
    return tokenWhitelists;
  }

  public void setTokenWhitelists(List<WalletCreateWhitelist> tokenWhitelists) {
    this.tokenWhitelists = tokenWhitelists;
  }

  public WalletCreateResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public WalletCreateResponse metadata(Object metadata) {
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

  public WalletCreateResponse secondaryId(String secondaryId) {
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

  public WalletCreateResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the wallet record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the wallet record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WalletCreateResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the wallet record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the wallet record was created")
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
    WalletCreateResponse walletCreateResponse = (WalletCreateResponse) o;
    return Objects.equals(this.name, walletCreateResponse.name) &&
        Objects.equals(this.type, walletCreateResponse.type) &&
        Objects.equals(this.clients, walletCreateResponse.clients) &&
        Objects.equals(this.tokenWhitelists, walletCreateResponse.tokenWhitelists) &&
        Objects.equals(this.isActive, walletCreateResponse.isActive) &&
        Objects.equals(this.metadata, walletCreateResponse.metadata) &&
        Objects.equals(this.secondaryId, walletCreateResponse.secondaryId) &&
        Objects.equals(this.id, walletCreateResponse.id) &&
        Objects.equals(this.createDate, walletCreateResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, clients, tokenWhitelists, isActive, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    tokenWhitelists: ").append(toIndentedString(tokenWhitelists)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
