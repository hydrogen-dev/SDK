/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
import com.hydrogen.nucleus.model.SecurityCountryVO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * SecurityCompositionVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class SecurityCompositionVO {
  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("security_asset_class")
  private String securityAssetClass = null;

  @SerializedName("security_countries")
  private List<SecurityCountryVO> securityCountries = null;

  @SerializedName("security_create_date")
  private OffsetDateTime securityCreateDate = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("security_industry")
  private String securityIndustry = null;

  @SerializedName("security_name")
  private String securityName = null;

  @SerializedName("security_secondary_id")
  private String securitySecondaryId = null;

  @SerializedName("security_sector")
  private String securitySector = null;

  @SerializedName("security_security_class")
  private String securitySecurityClass = null;

  @SerializedName("security_ticker")
  private String securityTicker = null;

  @SerializedName("security_update_date")
  private OffsetDateTime securityUpdateDate = null;

  @SerializedName("security_weight")
  private Double securityWeight = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  public SecurityCompositionVO endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SecurityCompositionVO securityAssetClass(String securityAssetClass) {
    this.securityAssetClass = securityAssetClass;
    return this;
  }

   /**
   * Get securityAssetClass
   * @return securityAssetClass
  **/
  @ApiModelProperty(value = "")
  public String getSecurityAssetClass() {
    return securityAssetClass;
  }

  public void setSecurityAssetClass(String securityAssetClass) {
    this.securityAssetClass = securityAssetClass;
  }

  public SecurityCompositionVO securityCountries(List<SecurityCountryVO> securityCountries) {
    this.securityCountries = securityCountries;
    return this;
  }

  public SecurityCompositionVO addSecurityCountriesItem(SecurityCountryVO securityCountriesItem) {
    if (this.securityCountries == null) {
      this.securityCountries = new ArrayList<SecurityCountryVO>();
    }
    this.securityCountries.add(securityCountriesItem);
    return this;
  }

   /**
   * Get securityCountries
   * @return securityCountries
  **/
  @ApiModelProperty(value = "")
  public List<SecurityCountryVO> getSecurityCountries() {
    return securityCountries;
  }

  public void setSecurityCountries(List<SecurityCountryVO> securityCountries) {
    this.securityCountries = securityCountries;
  }

  public SecurityCompositionVO securityCreateDate(OffsetDateTime securityCreateDate) {
    this.securityCreateDate = securityCreateDate;
    return this;
  }

   /**
   * Get securityCreateDate
   * @return securityCreateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSecurityCreateDate() {
    return securityCreateDate;
  }

  public void setSecurityCreateDate(OffsetDateTime securityCreateDate) {
    this.securityCreateDate = securityCreateDate;
  }

  public SecurityCompositionVO securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * Get securityId
   * @return securityId
  **/
  @ApiModelProperty(value = "")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public SecurityCompositionVO securityIndustry(String securityIndustry) {
    this.securityIndustry = securityIndustry;
    return this;
  }

   /**
   * Get securityIndustry
   * @return securityIndustry
  **/
  @ApiModelProperty(value = "")
  public String getSecurityIndustry() {
    return securityIndustry;
  }

  public void setSecurityIndustry(String securityIndustry) {
    this.securityIndustry = securityIndustry;
  }

  public SecurityCompositionVO securityName(String securityName) {
    this.securityName = securityName;
    return this;
  }

   /**
   * Get securityName
   * @return securityName
  **/
  @ApiModelProperty(value = "")
  public String getSecurityName() {
    return securityName;
  }

  public void setSecurityName(String securityName) {
    this.securityName = securityName;
  }

  public SecurityCompositionVO securitySecondaryId(String securitySecondaryId) {
    this.securitySecondaryId = securitySecondaryId;
    return this;
  }

   /**
   * Get securitySecondaryId
   * @return securitySecondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecuritySecondaryId() {
    return securitySecondaryId;
  }

  public void setSecuritySecondaryId(String securitySecondaryId) {
    this.securitySecondaryId = securitySecondaryId;
  }

  public SecurityCompositionVO securitySector(String securitySector) {
    this.securitySector = securitySector;
    return this;
  }

   /**
   * Get securitySector
   * @return securitySector
  **/
  @ApiModelProperty(value = "")
  public String getSecuritySector() {
    return securitySector;
  }

  public void setSecuritySector(String securitySector) {
    this.securitySector = securitySector;
  }

  public SecurityCompositionVO securitySecurityClass(String securitySecurityClass) {
    this.securitySecurityClass = securitySecurityClass;
    return this;
  }

   /**
   * Get securitySecurityClass
   * @return securitySecurityClass
  **/
  @ApiModelProperty(value = "")
  public String getSecuritySecurityClass() {
    return securitySecurityClass;
  }

  public void setSecuritySecurityClass(String securitySecurityClass) {
    this.securitySecurityClass = securitySecurityClass;
  }

  public SecurityCompositionVO securityTicker(String securityTicker) {
    this.securityTicker = securityTicker;
    return this;
  }

   /**
   * Get securityTicker
   * @return securityTicker
  **/
  @ApiModelProperty(value = "")
  public String getSecurityTicker() {
    return securityTicker;
  }

  public void setSecurityTicker(String securityTicker) {
    this.securityTicker = securityTicker;
  }

  public SecurityCompositionVO securityUpdateDate(OffsetDateTime securityUpdateDate) {
    this.securityUpdateDate = securityUpdateDate;
    return this;
  }

   /**
   * Get securityUpdateDate
   * @return securityUpdateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSecurityUpdateDate() {
    return securityUpdateDate;
  }

  public void setSecurityUpdateDate(OffsetDateTime securityUpdateDate) {
    this.securityUpdateDate = securityUpdateDate;
  }

  public SecurityCompositionVO securityWeight(Double securityWeight) {
    this.securityWeight = securityWeight;
    return this;
  }

   /**
   * Get securityWeight
   * @return securityWeight
  **/
  @ApiModelProperty(value = "")
  public Double getSecurityWeight() {
    return securityWeight;
  }

  public void setSecurityWeight(Double securityWeight) {
    this.securityWeight = securityWeight;
  }

  public SecurityCompositionVO startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityCompositionVO securityCompositionVO = (SecurityCompositionVO) o;
    return Objects.equals(this.endDate, securityCompositionVO.endDate) &&
        Objects.equals(this.securityAssetClass, securityCompositionVO.securityAssetClass) &&
        Objects.equals(this.securityCountries, securityCompositionVO.securityCountries) &&
        Objects.equals(this.securityCreateDate, securityCompositionVO.securityCreateDate) &&
        Objects.equals(this.securityId, securityCompositionVO.securityId) &&
        Objects.equals(this.securityIndustry, securityCompositionVO.securityIndustry) &&
        Objects.equals(this.securityName, securityCompositionVO.securityName) &&
        Objects.equals(this.securitySecondaryId, securityCompositionVO.securitySecondaryId) &&
        Objects.equals(this.securitySector, securityCompositionVO.securitySector) &&
        Objects.equals(this.securitySecurityClass, securityCompositionVO.securitySecurityClass) &&
        Objects.equals(this.securityTicker, securityCompositionVO.securityTicker) &&
        Objects.equals(this.securityUpdateDate, securityCompositionVO.securityUpdateDate) &&
        Objects.equals(this.securityWeight, securityCompositionVO.securityWeight) &&
        Objects.equals(this.startDate, securityCompositionVO.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, securityAssetClass, securityCountries, securityCreateDate, securityId, securityIndustry, securityName, securitySecondaryId, securitySector, securitySecurityClass, securityTicker, securityUpdateDate, securityWeight, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityCompositionVO {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    securityAssetClass: ").append(toIndentedString(securityAssetClass)).append("\n");
    sb.append("    securityCountries: ").append(toIndentedString(securityCountries)).append("\n");
    sb.append("    securityCreateDate: ").append(toIndentedString(securityCreateDate)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    securityIndustry: ").append(toIndentedString(securityIndustry)).append("\n");
    sb.append("    securityName: ").append(toIndentedString(securityName)).append("\n");
    sb.append("    securitySecondaryId: ").append(toIndentedString(securitySecondaryId)).append("\n");
    sb.append("    securitySector: ").append(toIndentedString(securitySector)).append("\n");
    sb.append("    securitySecurityClass: ").append(toIndentedString(securitySecurityClass)).append("\n");
    sb.append("    securityTicker: ").append(toIndentedString(securityTicker)).append("\n");
    sb.append("    securityUpdateDate: ").append(toIndentedString(securityUpdateDate)).append("\n");
    sb.append("    securityWeight: ").append(toIndentedString(securityWeight)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

