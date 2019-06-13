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
import io.swagger.client.model.RiskScoreOptConfigModelWConfig;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * RiskScoreOptConfigModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class RiskScoreOptConfigModel {
  @SerializedName("tickers")
  private List<String> tickers = new ArrayList<String>();

  @SerializedName("min_assets")
  private Integer minAssets = null;

  @SerializedName("w_config")
  private RiskScoreOptConfigModelWConfig wConfig = null;

  @SerializedName("w_asset_config")
  private Map<String, BigDecimal> wAssetConfig = null;

  @SerializedName("sec_types")
  private List<String> secTypes = new ArrayList<String>();

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  @SerializedName("end_date")
  private OffsetDateTime endDate = null;

  public RiskScoreOptConfigModel tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public RiskScoreOptConfigModel addTickersItem(String tickersItem) {
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * List of symbols for securities to be included in the portfolio
   * @return tickers
  **/
  @ApiModelProperty(required = true, value = "List of symbols for securities to be included in the portfolio")
  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }

  public RiskScoreOptConfigModel minAssets(Integer minAssets) {
    this.minAssets = minAssets;
    return this;
  }

   /**
   * The minimum number of portfolio assets
   * @return minAssets
  **/
  @ApiModelProperty(required = true, value = "The minimum number of portfolio assets")
  public Integer getMinAssets() {
    return minAssets;
  }

  public void setMinAssets(Integer minAssets) {
    this.minAssets = minAssets;
  }

  public RiskScoreOptConfigModel wConfig(RiskScoreOptConfigModelWConfig wConfig) {
    this.wConfig = wConfig;
    return this;
  }

   /**
   * Get wConfig
   * @return wConfig
  **/
  @ApiModelProperty(required = true, value = "")
  public RiskScoreOptConfigModelWConfig getWConfig() {
    return wConfig;
  }

  public void setWConfig(RiskScoreOptConfigModelWConfig wConfig) {
    this.wConfig = wConfig;
  }

  public RiskScoreOptConfigModel wAssetConfig(Map<String, BigDecimal> wAssetConfig) {
    this.wAssetConfig = wAssetConfig;
    return this;
  }

  public RiskScoreOptConfigModel putWAssetConfigItem(String key, BigDecimal wAssetConfigItem) {
    if (this.wAssetConfig == null) {
      this.wAssetConfig = new HashMap<String, BigDecimal>();
    }
    this.wAssetConfig.put(key, wAssetConfigItem);
    return this;
  }

   /**
   * Get wAssetConfig
   * @return wAssetConfig
  **/
  @ApiModelProperty(value = "")
  public Map<String, BigDecimal> getWAssetConfig() {
    return wAssetConfig;
  }

  public void setWAssetConfig(Map<String, BigDecimal> wAssetConfig) {
    this.wAssetConfig = wAssetConfig;
  }

  public RiskScoreOptConfigModel secTypes(List<String> secTypes) {
    this.secTypes = secTypes;
    return this;
  }

  public RiskScoreOptConfigModel addSecTypesItem(String secTypesItem) {
    this.secTypes.add(secTypesItem);
    return this;
  }

   /**
   * Types corresponding to each security
   * @return secTypes
  **/
  @ApiModelProperty(required = true, value = "Types corresponding to each security")
  public List<String> getSecTypes() {
    return secTypes;
  }

  public void setSecTypes(List<String> secTypes) {
    this.secTypes = secTypes;
  }

  public RiskScoreOptConfigModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public RiskScoreOptConfigModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScoreOptConfigModel riskScoreOptConfigModel = (RiskScoreOptConfigModel) o;
    return Objects.equals(this.tickers, riskScoreOptConfigModel.tickers) &&
        Objects.equals(this.minAssets, riskScoreOptConfigModel.minAssets) &&
        Objects.equals(this.wConfig, riskScoreOptConfigModel.wConfig) &&
        Objects.equals(this.wAssetConfig, riskScoreOptConfigModel.wAssetConfig) &&
        Objects.equals(this.secTypes, riskScoreOptConfigModel.secTypes) &&
        Objects.equals(this.startDate, riskScoreOptConfigModel.startDate) &&
        Objects.equals(this.endDate, riskScoreOptConfigModel.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickers, minAssets, wConfig, wAssetConfig, secTypes, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScoreOptConfigModel {\n");
    
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    minAssets: ").append(toIndentedString(minAssets)).append("\n");
    sb.append("    wConfig: ").append(toIndentedString(wConfig)).append("\n");
    sb.append("    wAssetConfig: ").append(toIndentedString(wAssetConfig)).append("\n");
    sb.append("    secTypes: ").append(toIndentedString(secTypes)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

