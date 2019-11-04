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
 * WalletCreateClient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-04T15:24:43.843-05:00")
public class WalletCreateClient {
  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  @SerializedName("client_wallet_association_type")
  private String clientWalletAssociationType = null;

  public WalletCreateClient nucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
    return this;
  }

   /**
   * The ID of a nucleus client associated with the wallet
   * @return nucleusClientId
  **/
  @ApiModelProperty(required = true, value = "The ID of a nucleus client associated with the wallet")
  public UUID getNucleusClientId() {
    return nucleusClientId;
  }

  public void setNucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
  }

  public WalletCreateClient clientWalletAssociationType(String clientWalletAssociationType) {
    this.clientWalletAssociationType = clientWalletAssociationType;
    return this;
  }

   /**
   * The role of the client as it relates to the wallet defined by your firm. Roles may be joint, owner, trustee, viewer, or admin.
   * @return clientWalletAssociationType
  **/
  @ApiModelProperty(required = true, value = "The role of the client as it relates to the wallet defined by your firm. Roles may be joint, owner, trustee, viewer, or admin.")
  public String getClientWalletAssociationType() {
    return clientWalletAssociationType;
  }

  public void setClientWalletAssociationType(String clientWalletAssociationType) {
    this.clientWalletAssociationType = clientWalletAssociationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateClient walletCreateClient = (WalletCreateClient) o;
    return Objects.equals(this.nucleusClientId, walletCreateClient.nucleusClientId) &&
        Objects.equals(this.clientWalletAssociationType, walletCreateClient.clientWalletAssociationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusClientId, clientWalletAssociationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateClient {\n");
    
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    clientWalletAssociationType: ").append(toIndentedString(clientWalletAssociationType)).append("\n");
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

