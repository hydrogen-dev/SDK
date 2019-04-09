/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
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
 * ClientHydroPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-08T13:59:38.361-04:00")
public class ClientHydroPayload {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("hydro_id")
  private String hydroId = null;

  @SerializedName("is_hydro_id_verified")
  private Boolean isHydroIdVerified = false;

  @SerializedName("is_client_raindrop_linked")
  private Boolean isClientRaindropLinked = false;

  @SerializedName("is_client_raindrop_enabled")
  private Boolean isClientRaindropEnabled = false;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public ClientHydroPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client to whom the Hydro ID belongs
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the client to whom the Hydro ID belongs")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public ClientHydroPayload hydroId(String hydroId) {
    this.hydroId = hydroId;
    return this;
  }

   /**
   * The hydro ID for the client. Also found under the client object
   * @return hydroId
  **/
  @ApiModelProperty(required = true, value = "The hydro ID for the client. Also found under the client object")
  public String getHydroId() {
    return hydroId;
  }

  public void setHydroId(String hydroId) {
    this.hydroId = hydroId;
  }

  public ClientHydroPayload isHydroIdVerified(Boolean isHydroIdVerified) {
    this.isHydroIdVerified = isHydroIdVerified;
    return this;
  }

   /**
   * Indicator if the client has verified ownership of the Hydro ID provided. Defaults to false which means ownership has not been verified
   * @return isHydroIdVerified
  **/
  @ApiModelProperty(value = "Indicator if the client has verified ownership of the Hydro ID provided. Defaults to false which means ownership has not been verified")
  public Boolean isIsHydroIdVerified() {
    return isHydroIdVerified;
  }

  public void setIsHydroIdVerified(Boolean isHydroIdVerified) {
    this.isHydroIdVerified = isHydroIdVerified;
  }

  public ClientHydroPayload isClientRaindropLinked(Boolean isClientRaindropLinked) {
    this.isClientRaindropLinked = isClientRaindropLinked;
    return this;
  }

   /**
   * Indicator for whether or not the client has successfully linked their Hydro ID to your Client-side Raindrop application. Defaults to false which indicates it has not been linked
   * @return isClientRaindropLinked
  **/
  @ApiModelProperty(value = "Indicator for whether or not the client has successfully linked their Hydro ID to your Client-side Raindrop application. Defaults to false which indicates it has not been linked")
  public Boolean isIsClientRaindropLinked() {
    return isClientRaindropLinked;
  }

  public void setIsClientRaindropLinked(Boolean isClientRaindropLinked) {
    this.isClientRaindropLinked = isClientRaindropLinked;
  }

  public ClientHydroPayload isClientRaindropEnabled(Boolean isClientRaindropEnabled) {
    this.isClientRaindropEnabled = isClientRaindropEnabled;
    return this;
  }

   /**
   * Indicator for whether or not the client has chosen to enable the Hydro Client-side Raindrop service on your application. Defaults to false which indicates the service is not enabled
   * @return isClientRaindropEnabled
  **/
  @ApiModelProperty(value = "Indicator for whether or not the client has chosen to enable the Hydro Client-side Raindrop service on your application. Defaults to false which indicates the service is not enabled")
  public Boolean isIsClientRaindropEnabled() {
    return isClientRaindropEnabled;
  }

  public void setIsClientRaindropEnabled(Boolean isClientRaindropEnabled) {
    this.isClientRaindropEnabled = isClientRaindropEnabled;
  }

  public ClientHydroPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the client-hydro relationship in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the client-hydro relationship in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ClientHydroPayload secondaryId(String secondaryId) {
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
    ClientHydroPayload clientHydroPayload = (ClientHydroPayload) o;
    return Objects.equals(this.clientId, clientHydroPayload.clientId) &&
        Objects.equals(this.hydroId, clientHydroPayload.hydroId) &&
        Objects.equals(this.isHydroIdVerified, clientHydroPayload.isHydroIdVerified) &&
        Objects.equals(this.isClientRaindropLinked, clientHydroPayload.isClientRaindropLinked) &&
        Objects.equals(this.isClientRaindropEnabled, clientHydroPayload.isClientRaindropEnabled) &&
        Objects.equals(this.metadata, clientHydroPayload.metadata) &&
        Objects.equals(this.secondaryId, clientHydroPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, hydroId, isHydroIdVerified, isClientRaindropLinked, isClientRaindropEnabled, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientHydroPayload {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    hydroId: ").append(toIndentedString(hydroId)).append("\n");
    sb.append("    isHydroIdVerified: ").append(toIndentedString(isHydroIdVerified)).append("\n");
    sb.append("    isClientRaindropLinked: ").append(toIndentedString(isClientRaindropLinked)).append("\n");
    sb.append("    isClientRaindropEnabled: ").append(toIndentedString(isClientRaindropEnabled)).append("\n");
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
