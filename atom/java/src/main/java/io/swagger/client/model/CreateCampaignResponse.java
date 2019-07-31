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
import io.swagger.client.model.CampaignManagementPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateCampaignResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class CreateCampaignResponse {
  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("is_acquisition")
  private Boolean isAcquisition = false;

  @SerializedName("campaign_category")
  private String campaignCategory = null;

  @SerializedName("campaign_plan_id")
  private UUID campaignPlanId = null;

  @SerializedName("cookie_code")
  private String cookieCode = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("landing_page")
  private String landingPage = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("utm_campaign")
  private String utmCampaign = null;

  @SerializedName("utm_content")
  private String utmContent = null;

  @SerializedName("utm_medium")
  private String utmMedium = null;

  @SerializedName("utm_source")
  private String utmSource = null;

  @SerializedName("utm_term")
  private String utmTerm = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateCampaignResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the campaign
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of the campaign")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateCampaignResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the campaign such as its purpose
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the campaign such as its purpose")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCampaignResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date that the marketing campaign begins
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Date that the marketing campaign begins")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CreateCampaignResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date that the marketing campaign ends
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Date that the marketing campaign ends")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CreateCampaignResponse isAcquisition(Boolean isAcquisition) {
    this.isAcquisition = isAcquisition;
    return this;
  }

   /**
   * Indicates if the campaign is an acquisition campaign, such as affiliate. Defaults to false meaning it is not an acquisition campaign
   * @return isAcquisition
  **/
  @ApiModelProperty(value = "Indicates if the campaign is an acquisition campaign, such as affiliate. Defaults to false meaning it is not an acquisition campaign")
  public Boolean isIsAcquisition() {
    return isAcquisition;
  }

  public void setIsAcquisition(Boolean isAcquisition) {
    this.isAcquisition = isAcquisition;
  }

  public CreateCampaignResponse campaignCategory(String campaignCategory) {
    this.campaignCategory = campaignCategory;
    return this;
  }

   /**
   * The category assigned to the campaign
   * @return campaignCategory
  **/
  @ApiModelProperty(value = "The category assigned to the campaign")
  public String getCampaignCategory() {
    return campaignCategory;
  }

  public void setCampaignCategory(String campaignCategory) {
    this.campaignCategory = campaignCategory;
  }

  public CreateCampaignResponse campaignPlanId(UUID campaignPlanId) {
    this.campaignPlanId = campaignPlanId;
    return this;
  }

   /**
   * The ID of a campaign plan associated with a campaign
   * @return campaignPlanId
  **/
  @ApiModelProperty(value = "The ID of a campaign plan associated with a campaign")
  public UUID getCampaignPlanId() {
    return campaignPlanId;
  }

  public void setCampaignPlanId(UUID campaignPlanId) {
    this.campaignPlanId = campaignPlanId;
  }

  public CreateCampaignResponse cookieCode(String cookieCode) {
    this.cookieCode = cookieCode;
    return this;
  }

   /**
   * Cookie code associated with the campaign used for tracking purposes
   * @return cookieCode
  **/
  @ApiModelProperty(value = "Cookie code associated with the campaign used for tracking purposes")
  public String getCookieCode() {
    return cookieCode;
  }

  public void setCookieCode(String cookieCode) {
    this.cookieCode = cookieCode;
  }

  public CreateCampaignResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the campaign is currently active. Defaults to true which indicates that it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the campaign is currently active. Defaults to true which indicates that it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CreateCampaignResponse landingPage(String landingPage) {
    this.landingPage = landingPage;
    return this;
  }

   /**
   * Name for the landing page of the campaign
   * @return landingPage
  **/
  @ApiModelProperty(value = "Name for the landing page of the campaign")
  public String getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(String landingPage) {
    this.landingPage = landingPage;
  }

  public CreateCampaignResponse rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Rate of client/user registration for the campaign
   * @return rate
  **/
  @ApiModelProperty(value = "Rate of client/user registration for the campaign")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public CreateCampaignResponse utmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
    return this;
  }

   /**
   * Name of an Urchin Tracking Module (UTM) for a marketing feature used in the campaign
   * @return utmCampaign
  **/
  @ApiModelProperty(value = "Name of an Urchin Tracking Module (UTM) for a marketing feature used in the campaign")
  public String getUtmCampaign() {
    return utmCampaign;
  }

  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }

  public CreateCampaignResponse utmContent(String utmContent) {
    this.utmContent = utmContent;
    return this;
  }

   /**
   * Content of an Urchin Tracking Module (UTM) for a marketing campaign feature used in the campaign. For example, content in a site banner
   * @return utmContent
  **/
  @ApiModelProperty(value = "Content of an Urchin Tracking Module (UTM) for a marketing campaign feature used in the campaign. For example, content in a site banner")
  public String getUtmContent() {
    return utmContent;
  }

  public void setUtmContent(String utmContent) {
    this.utmContent = utmContent;
  }

  public CreateCampaignResponse utmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
    return this;
  }

   /**
   * Platform of an Urchin Tracking Module (UTM) for a marketing campaign feature such as Social Media
   * @return utmMedium
  **/
  @ApiModelProperty(value = "Platform of an Urchin Tracking Module (UTM) for a marketing campaign feature such as Social Media")
  public String getUtmMedium() {
    return utmMedium;
  }

  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }

  public CreateCampaignResponse utmSource(String utmSource) {
    this.utmSource = utmSource;
    return this;
  }

   /**
   * Feature Urchin Tracking Module (UTM) for a marketing campaign such as a banner advertisement
   * @return utmSource
  **/
  @ApiModelProperty(value = "Feature Urchin Tracking Module (UTM) for a marketing campaign such as a banner advertisement")
  public String getUtmSource() {
    return utmSource;
  }

  public void setUtmSource(String utmSource) {
    this.utmSource = utmSource;
  }

  public CreateCampaignResponse utmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
    return this;
  }

   /**
   * Term of an Urchin Tracking Module (UTM) for a marketing campaign
   * @return utmTerm
  **/
  @ApiModelProperty(value = "Term of an Urchin Tracking Module (UTM) for a marketing campaign")
  public String getUtmTerm() {
    return utmTerm;
  }

  public void setUtmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
  }

  public CreateCampaignResponse secondaryId(String secondaryId) {
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

  public CreateCampaignResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the marketing campaign
   * @return id
  **/
  @ApiModelProperty(value = "ID of the marketing campaign")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateCampaignResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the marketing campaign was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the marketing campaign was created")
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
    CreateCampaignResponse createCampaignResponse = (CreateCampaignResponse) o;
    return Objects.equals(this.title, createCampaignResponse.title) &&
        Objects.equals(this.description, createCampaignResponse.description) &&
        Objects.equals(this.startDate, createCampaignResponse.startDate) &&
        Objects.equals(this.endDate, createCampaignResponse.endDate) &&
        Objects.equals(this.isAcquisition, createCampaignResponse.isAcquisition) &&
        Objects.equals(this.campaignCategory, createCampaignResponse.campaignCategory) &&
        Objects.equals(this.campaignPlanId, createCampaignResponse.campaignPlanId) &&
        Objects.equals(this.cookieCode, createCampaignResponse.cookieCode) &&
        Objects.equals(this.isActive, createCampaignResponse.isActive) &&
        Objects.equals(this.landingPage, createCampaignResponse.landingPage) &&
        Objects.equals(this.rate, createCampaignResponse.rate) &&
        Objects.equals(this.utmCampaign, createCampaignResponse.utmCampaign) &&
        Objects.equals(this.utmContent, createCampaignResponse.utmContent) &&
        Objects.equals(this.utmMedium, createCampaignResponse.utmMedium) &&
        Objects.equals(this.utmSource, createCampaignResponse.utmSource) &&
        Objects.equals(this.utmTerm, createCampaignResponse.utmTerm) &&
        Objects.equals(this.secondaryId, createCampaignResponse.secondaryId) &&
        Objects.equals(this.id, createCampaignResponse.id) &&
        Objects.equals(this.createDate, createCampaignResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, startDate, endDate, isAcquisition, campaignCategory, campaignPlanId, cookieCode, isActive, landingPage, rate, utmCampaign, utmContent, utmMedium, utmSource, utmTerm, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCampaignResponse {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isAcquisition: ").append(toIndentedString(isAcquisition)).append("\n");
    sb.append("    campaignCategory: ").append(toIndentedString(campaignCategory)).append("\n");
    sb.append("    campaignPlanId: ").append(toIndentedString(campaignPlanId)).append("\n");
    sb.append("    cookieCode: ").append(toIndentedString(cookieCode)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    utmCampaign: ").append(toIndentedString(utmCampaign)).append("\n");
    sb.append("    utmContent: ").append(toIndentedString(utmContent)).append("\n");
    sb.append("    utmMedium: ").append(toIndentedString(utmMedium)).append("\n");
    sb.append("    utmSource: ").append(toIndentedString(utmSource)).append("\n");
    sb.append("    utmTerm: ").append(toIndentedString(utmTerm)).append("\n");
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

