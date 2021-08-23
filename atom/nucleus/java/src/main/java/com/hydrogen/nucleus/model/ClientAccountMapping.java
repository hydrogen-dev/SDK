/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
import java.util.UUID;

/**
 * ClientAccountMapping Object
 */
@ApiModel(description = "ClientAccountMapping Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class ClientAccountMapping {
  @SerializedName("client_account_association_type")
  private String clientAccountAssociationType = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("signature_data")
  private String signatureData = null;

  public ClientAccountMapping clientAccountAssociationType(String clientAccountAssociationType) {
    this.clientAccountAssociationType = clientAccountAssociationType;
    return this;
  }

   /**
   * clientAccountAssociationType
   * @return clientAccountAssociationType
  **/
  @ApiModelProperty(example = "owner", required = true, value = "clientAccountAssociationType")
  public String getClientAccountAssociationType() {
    return clientAccountAssociationType;
  }

  public void setClientAccountAssociationType(String clientAccountAssociationType) {
    this.clientAccountAssociationType = clientAccountAssociationType;
  }

  public ClientAccountMapping clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", required = true, value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public ClientAccountMapping signatureData(String signatureData) {
    this.signatureData = signatureData;
    return this;
  }

   /**
   * Get signatureData
   * @return signatureData
  **/
  @ApiModelProperty(example = "_RtqHPsnMD", value = "")
  public String getSignatureData() {
    return signatureData;
  }

  public void setSignatureData(String signatureData) {
    this.signatureData = signatureData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAccountMapping clientAccountMapping = (ClientAccountMapping) o;
    return Objects.equals(this.clientAccountAssociationType, clientAccountMapping.clientAccountAssociationType) &&
        Objects.equals(this.clientId, clientAccountMapping.clientId) &&
        Objects.equals(this.signatureData, clientAccountMapping.signatureData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAccountAssociationType, clientId, signatureData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAccountMapping {\n");
    
    sb.append("    clientAccountAssociationType: ").append(toIndentedString(clientAccountAssociationType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    signatureData: ").append(toIndentedString(signatureData)).append("\n");
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

