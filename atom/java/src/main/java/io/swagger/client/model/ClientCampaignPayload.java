/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
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
 * ClientCampaignPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class ClientCampaignPayload {
  @SerializedName("campaign_id")
  private UUID campaignId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public ClientCampaignPayload campaignId(UUID campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign through which the client registered for your firm’s service
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign through which the client registered for your firm’s service")
  public UUID getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(UUID campaignId) {
    this.campaignId = campaignId;
  }

  public ClientCampaignPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public ClientCampaignPayload ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided
   * @return ip
  **/
  @ApiModelProperty(value = "The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public ClientCampaignPayload secondaryId(String secondaryId) {
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

  public ClientCampaignPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the client campaign in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the client campaign in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCampaignPayload clientCampaignPayload = (ClientCampaignPayload) o;
    return Objects.equals(this.campaignId, clientCampaignPayload.campaignId) &&
        Objects.equals(this.clientId, clientCampaignPayload.clientId) &&
        Objects.equals(this.ip, clientCampaignPayload.ip) &&
        Objects.equals(this.secondaryId, clientCampaignPayload.secondaryId) &&
        Objects.equals(this.metadata, clientCampaignPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, clientId, ip, secondaryId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCampaignPayload {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

