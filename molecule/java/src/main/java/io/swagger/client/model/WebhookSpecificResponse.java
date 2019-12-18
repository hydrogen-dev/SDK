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
import io.swagger.client.model.WebhookCreateResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * WebhookSpecificResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:21:57.070-05:00")
public class WebhookSpecificResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("molecule_service")
  private List<String> moleculeService = new ArrayList<String>();

  @SerializedName("url")
  private String url = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public WebhookSpecificResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the webhook record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the webhook record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WebhookSpecificResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the webhook record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the webhook record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public WebhookSpecificResponse moleculeService(List<String> moleculeService) {
    this.moleculeService = moleculeService;
    return this;
  }

  public WebhookSpecificResponse addMoleculeServiceItem(String moleculeServiceItem) {
    this.moleculeService.add(moleculeServiceItem);
    return this;
  }

   /**
   * The array of molecule services for a webhook to notify.
   * @return moleculeService
  **/
  @ApiModelProperty(required = true, value = "The array of molecule services for a webhook to notify.")
  public List<String> getMoleculeService() {
    return moleculeService;
  }

  public void setMoleculeService(List<String> moleculeService) {
    this.moleculeService = moleculeService;
  }

  public WebhookSpecificResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url you want to receive the payloads to.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url you want to receive the payloads to.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookSpecificResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if this webhook is active.
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if this webhook is active.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public WebhookSpecificResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the webhook record was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the webhook record was updated")
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
    WebhookSpecificResponse webhookSpecificResponse = (WebhookSpecificResponse) o;
    return Objects.equals(this.id, webhookSpecificResponse.id) &&
        Objects.equals(this.createDate, webhookSpecificResponse.createDate) &&
        Objects.equals(this.moleculeService, webhookSpecificResponse.moleculeService) &&
        Objects.equals(this.url, webhookSpecificResponse.url) &&
        Objects.equals(this.isActive, webhookSpecificResponse.isActive) &&
        Objects.equals(this.updateDate, webhookSpecificResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, moleculeService, url, isActive, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSpecificResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    moleculeService: ").append(toIndentedString(moleculeService)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

