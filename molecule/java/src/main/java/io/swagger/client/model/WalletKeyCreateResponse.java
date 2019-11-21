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
 * WalletKeyCreateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-21T12:13:20.984-05:00")
public class WalletKeyCreateResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("key_id")
  private String keyId = null;

  @SerializedName("key_server")
  private String keyServer = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("private_key")
  private String privateKey = null;

  @SerializedName("create_date")
  private String createDate = null;

  public WalletKeyCreateResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the wallet key record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the wallet key record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WalletKeyCreateResponse keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * The ID of the associated key within the Key Server
   * @return keyId
  **/
  @ApiModelProperty(value = "The ID of the associated key within the Key Server")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public WalletKeyCreateResponse keyServer(String keyServer) {
    this.keyServer = keyServer;
    return this;
  }

   /**
   * Name of the Key Server in use by the client
   * @return keyServer
  **/
  @ApiModelProperty(value = "Name of the Key Server in use by the client")
  public String getKeyServer() {
    return keyServer;
  }

  public void setKeyServer(String keyServer) {
    this.keyServer = keyServer;
  }

  public WalletKeyCreateResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Public address of the key pair getting stored
   * @return address
  **/
  @ApiModelProperty(value = "Public address of the key pair getting stored")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public WalletKeyCreateResponse privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Private key of the key pair getting stored
   * @return privateKey
  **/
  @ApiModelProperty(value = "Private key of the key pair getting stored")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public WalletKeyCreateResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the wallet key record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the wallet key record was created")
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
    WalletKeyCreateResponse walletKeyCreateResponse = (WalletKeyCreateResponse) o;
    return Objects.equals(this.id, walletKeyCreateResponse.id) &&
        Objects.equals(this.keyId, walletKeyCreateResponse.keyId) &&
        Objects.equals(this.keyServer, walletKeyCreateResponse.keyServer) &&
        Objects.equals(this.address, walletKeyCreateResponse.address) &&
        Objects.equals(this.privateKey, walletKeyCreateResponse.privateKey) &&
        Objects.equals(this.createDate, walletKeyCreateResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyId, keyServer, address, privateKey, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletKeyCreateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    keyServer: ").append(toIndentedString(keyServer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

