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
 * WalletKeyCreatePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-23T14:48:32.517-04:00")
public class WalletKeyCreatePayload {
  @SerializedName("wallet_id")
  private UUID walletId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("private_key")
  private String privateKey = null;

  public WalletKeyCreatePayload walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the wallet the keys are generating for
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet the keys are generating for")
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }

  public WalletKeyCreatePayload address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Public address of the key pair getting stored
   * @return address
  **/
  @ApiModelProperty(required = true, value = "Public address of the key pair getting stored")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public WalletKeyCreatePayload privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Private key of the key pair getting stored
   * @return privateKey
  **/
  @ApiModelProperty(required = true, value = "Private key of the key pair getting stored")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletKeyCreatePayload walletKeyCreatePayload = (WalletKeyCreatePayload) o;
    return Objects.equals(this.walletId, walletKeyCreatePayload.walletId) &&
        Objects.equals(this.address, walletKeyCreatePayload.address) &&
        Objects.equals(this.privateKey, walletKeyCreatePayload.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, address, privateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletKeyCreatePayload {\n");
    
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

