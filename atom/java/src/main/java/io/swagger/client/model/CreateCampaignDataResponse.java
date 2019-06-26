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
import io.swagger.client.model.CampaignDataPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateCampaignDataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class CreateCampaignDataResponse {
  @SerializedName("campaign_id")
  private UUID campaignId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("click_through_rate")
  private Double clickThroughRate = null;

  @SerializedName("line_item")
  private String lineItem = null;

  @SerializedName("publisher_campaign_name")
  private String publisherCampaignName = null;

  @SerializedName("total_clicks")
  private Integer totalClicks = null;

  @SerializedName("total_impressions")
  private Integer totalImpressions = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateCampaignDataResponse campaignId(UUID campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign to which the campaign data record belongs
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign to which the campaign data record belongs")
  public UUID getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(UUID campaignId) {
    this.campaignId = campaignId;
  }

  public CreateCampaignDataResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date for when the period being measured by the campaign data record began
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Date for when the period being measured by the campaign data record began")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CreateCampaignDataResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date for when the period being measured by the campaign data record ended
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Date for when the period being measured by the campaign data record ended")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CreateCampaignDataResponse clickThroughRate(Double clickThroughRate) {
    this.clickThroughRate = clickThroughRate;
    return this;
  }

   /**
   * Rate of clicks measured in the campaign data record for a specific feature as a whole number
   * @return clickThroughRate
  **/
  @ApiModelProperty(value = "Rate of clicks measured in the campaign data record for a specific feature as a whole number")
  public Double getClickThroughRate() {
    return clickThroughRate;
  }

  public void setClickThroughRate(Double clickThroughRate) {
    this.clickThroughRate = clickThroughRate;
  }

  public CreateCampaignDataResponse lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

   /**
   * Name of the campaign data record indicating the feature that it is measuring such as banner click through
   * @return lineItem
  **/
  @ApiModelProperty(value = "Name of the campaign data record indicating the feature that it is measuring such as banner click through")
  public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

  public CreateCampaignDataResponse publisherCampaignName(String publisherCampaignName) {
    this.publisherCampaignName = publisherCampaignName;
    return this;
  }

   /**
   * Name of the campaign publisher
   * @return publisherCampaignName
  **/
  @ApiModelProperty(value = "Name of the campaign publisher")
  public String getPublisherCampaignName() {
    return publisherCampaignName;
  }

  public void setPublisherCampaignName(String publisherCampaignName) {
    this.publisherCampaignName = publisherCampaignName;
  }

  public CreateCampaignDataResponse totalClicks(Integer totalClicks) {
    this.totalClicks = totalClicks;
    return this;
  }

   /**
   * Total number of clicks measured in the campaign data record for a specific feature as a whole number
   * @return totalClicks
  **/
  @ApiModelProperty(value = "Total number of clicks measured in the campaign data record for a specific feature as a whole number")
  public Integer getTotalClicks() {
    return totalClicks;
  }

  public void setTotalClicks(Integer totalClicks) {
    this.totalClicks = totalClicks;
  }

  public CreateCampaignDataResponse totalImpressions(Integer totalImpressions) {
    this.totalImpressions = totalImpressions;
    return this;
  }

   /**
   * Total number of impressions measured in the campaign data record for a specific feature as a whole number
   * @return totalImpressions
  **/
  @ApiModelProperty(value = "Total number of impressions measured in the campaign data record for a specific feature as a whole number")
  public Integer getTotalImpressions() {
    return totalImpressions;
  }

  public void setTotalImpressions(Integer totalImpressions) {
    this.totalImpressions = totalImpressions;
  }

  public CreateCampaignDataResponse secondaryId(String secondaryId) {
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

  public CreateCampaignDataResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the marketing campaign data record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the marketing campaign data record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateCampaignDataResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the marketing campaign data record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the marketing campaign data record was created")
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
    CreateCampaignDataResponse createCampaignDataResponse = (CreateCampaignDataResponse) o;
    return Objects.equals(this.campaignId, createCampaignDataResponse.campaignId) &&
        Objects.equals(this.startDate, createCampaignDataResponse.startDate) &&
        Objects.equals(this.endDate, createCampaignDataResponse.endDate) &&
        Objects.equals(this.clickThroughRate, createCampaignDataResponse.clickThroughRate) &&
        Objects.equals(this.lineItem, createCampaignDataResponse.lineItem) &&
        Objects.equals(this.publisherCampaignName, createCampaignDataResponse.publisherCampaignName) &&
        Objects.equals(this.totalClicks, createCampaignDataResponse.totalClicks) &&
        Objects.equals(this.totalImpressions, createCampaignDataResponse.totalImpressions) &&
        Objects.equals(this.secondaryId, createCampaignDataResponse.secondaryId) &&
        Objects.equals(this.id, createCampaignDataResponse.id) &&
        Objects.equals(this.createDate, createCampaignDataResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, startDate, endDate, clickThroughRate, lineItem, publisherCampaignName, totalClicks, totalImpressions, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCampaignDataResponse {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    clickThroughRate: ").append(toIndentedString(clickThroughRate)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    publisherCampaignName: ").append(toIndentedString(publisherCampaignName)).append("\n");
    sb.append("    totalClicks: ").append(toIndentedString(totalClicks)).append("\n");
    sb.append("    totalImpressions: ").append(toIndentedString(totalImpressions)).append("\n");
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

