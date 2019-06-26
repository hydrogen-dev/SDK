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
import io.swagger.client.model.CampaignPlanPayloadPlanRates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CampaignPlanPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class CampaignPlanPayload {
  @SerializedName("description")
  private String description = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("plan_rates")
  private List<CampaignPlanPayloadPlanRates> planRates = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public CampaignPlanPayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the campaign plan
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description for the campaign plan")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignPlanPayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the campaign plan is currently active. Defaults to true which indicates that it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the campaign plan is currently active. Defaults to true which indicates that it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CampaignPlanPayload planRates(List<CampaignPlanPayloadPlanRates> planRates) {
    this.planRates = planRates;
    return this;
  }

  public CampaignPlanPayload addPlanRatesItem(CampaignPlanPayloadPlanRates planRatesItem) {
    if (this.planRates == null) {
      this.planRates = new ArrayList<CampaignPlanPayloadPlanRates>();
    }
    this.planRates.add(planRatesItem);
    return this;
  }

   /**
   * Get planRates
   * @return planRates
  **/
  @ApiModelProperty(value = "")
  public List<CampaignPlanPayloadPlanRates> getPlanRates() {
    return planRates;
  }

  public void setPlanRates(List<CampaignPlanPayloadPlanRates> planRates) {
    this.planRates = planRates;
  }

  public CampaignPlanPayload secondaryId(String secondaryId) {
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
    CampaignPlanPayload campaignPlanPayload = (CampaignPlanPayload) o;
    return Objects.equals(this.description, campaignPlanPayload.description) &&
        Objects.equals(this.isActive, campaignPlanPayload.isActive) &&
        Objects.equals(this.planRates, campaignPlanPayload.planRates) &&
        Objects.equals(this.secondaryId, campaignPlanPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isActive, planRates, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanPayload {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    planRates: ").append(toIndentedString(planRates)).append("\n");
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

