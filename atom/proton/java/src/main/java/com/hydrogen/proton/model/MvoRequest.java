/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * MvoRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class MvoRequest {
  @SerializedName("tickers")
  private List<String> tickers = new ArrayList<String>();

  @SerializedName("w_config")
  private WConfig wConfig = null;

  @SerializedName("min_assets")
  private Integer minAssets = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  /**
   * Gets or Sets marketDataSource
   */
  @JsonAdapter(MarketDataSourceEnum.Adapter.class)
  public enum MarketDataSourceEnum {
    NUCLEUS("nucleus"),
    
    INTEGRATION("integration");

    private String value;

    MarketDataSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataSourceEnum fromValue(String text) {
      for (MarketDataSourceEnum b : MarketDataSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarketDataSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarketDataSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("market_data_source")
  private MarketDataSourceEnum marketDataSource = MarketDataSourceEnum.NUCLEUS;

  @SerializedName("w_asset_config")
  private Object wAssetConfig = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  /**
   * Gets or Sets tgtType
   */
  @JsonAdapter(TgtTypeEnum.Adapter.class)
  public enum TgtTypeEnum {
    RISK("risk"),
    
    RETURN("return");

    private String value;

    TgtTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TgtTypeEnum fromValue(String text) {
      for (TgtTypeEnum b : TgtTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TgtTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TgtTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TgtTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TgtTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tgt_type")
  private TgtTypeEnum tgtType = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  @SerializedName("tgt_val")
  private Float tgtVal = 0.0f;

  /**
   * Gets or Sets secTypes
   */
  @JsonAdapter(SecTypesEnum.Adapter.class)
  public enum SecTypesEnum {
    MAJOR("major"),
    
    MINOR("minor"),
    
    CASH("cash");

    private String value;

    SecTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecTypesEnum fromValue(String text) {
      for (SecTypesEnum b : SecTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SecTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SecTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sec_types")
  private List<SecTypesEnum> secTypes = new ArrayList<SecTypesEnum>();

  public MvoRequest tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public MvoRequest addTickersItem(String tickersItem) {
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * Get tickers
   * @return tickers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }

  public MvoRequest wConfig(WConfig wConfig) {
    this.wConfig = wConfig;
    return this;
  }

   /**
   * Get wConfig
   * @return wConfig
  **/
  @ApiModelProperty(required = true, value = "")
  public WConfig getWConfig() {
    return wConfig;
  }

  public void setWConfig(WConfig wConfig) {
    this.wConfig = wConfig;
  }

  public MvoRequest minAssets(Integer minAssets) {
    this.minAssets = minAssets;
    return this;
  }

   /**
   * Get minAssets
   * minimum: 1
   * @return minAssets
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMinAssets() {
    return minAssets;
  }

  public void setMinAssets(Integer minAssets) {
    this.minAssets = minAssets;
  }

  public MvoRequest endDate(LocalDate endDate) {
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

  public MvoRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
    return this;
  }

   /**
   * Get marketDataSource
   * @return marketDataSource
  **/
  @ApiModelProperty(value = "")
  public MarketDataSourceEnum getMarketDataSource() {
    return marketDataSource;
  }

  public void setMarketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
  }

  public MvoRequest wAssetConfig(Object wAssetConfig) {
    this.wAssetConfig = wAssetConfig;
    return this;
  }

   /**
   * Get wAssetConfig
   * @return wAssetConfig
  **/
  @ApiModelProperty(value = "")
  public Object getWAssetConfig() {
    return wAssetConfig;
  }

  public void setWAssetConfig(Object wAssetConfig) {
    this.wAssetConfig = wAssetConfig;
  }

  public MvoRequest startDate(LocalDate startDate) {
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

  public MvoRequest tgtType(TgtTypeEnum tgtType) {
    this.tgtType = tgtType;
    return this;
  }

   /**
   * Get tgtType
   * @return tgtType
  **/
  @ApiModelProperty(value = "")
  public TgtTypeEnum getTgtType() {
    return tgtType;
  }

  public void setTgtType(TgtTypeEnum tgtType) {
    this.tgtType = tgtType;
  }

  public MvoRequest useProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
    return this;
  }

   /**
   * Get useProxyData
   * @return useProxyData
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseProxyData() {
    return useProxyData;
  }

  public void setUseProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
  }

  public MvoRequest tgtVal(Float tgtVal) {
    this.tgtVal = tgtVal;
    return this;
  }

   /**
   * Get tgtVal
   * @return tgtVal
  **/
  @ApiModelProperty(value = "")
  public Float getTgtVal() {
    return tgtVal;
  }

  public void setTgtVal(Float tgtVal) {
    this.tgtVal = tgtVal;
  }

  public MvoRequest secTypes(List<SecTypesEnum> secTypes) {
    this.secTypes = secTypes;
    return this;
  }

  public MvoRequest addSecTypesItem(SecTypesEnum secTypesItem) {
    this.secTypes.add(secTypesItem);
    return this;
  }

   /**
   * Get secTypes
   * @return secTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SecTypesEnum> getSecTypes() {
    return secTypes;
  }

  public void setSecTypes(List<SecTypesEnum> secTypes) {
    this.secTypes = secTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MvoRequest mvoRequest = (MvoRequest) o;
    return Objects.equals(this.tickers, mvoRequest.tickers) &&
        Objects.equals(this.wConfig, mvoRequest.wConfig) &&
        Objects.equals(this.minAssets, mvoRequest.minAssets) &&
        Objects.equals(this.endDate, mvoRequest.endDate) &&
        Objects.equals(this.marketDataSource, mvoRequest.marketDataSource) &&
        Objects.equals(this.wAssetConfig, mvoRequest.wAssetConfig) &&
        Objects.equals(this.startDate, mvoRequest.startDate) &&
        Objects.equals(this.tgtType, mvoRequest.tgtType) &&
        Objects.equals(this.useProxyData, mvoRequest.useProxyData) &&
        Objects.equals(this.tgtVal, mvoRequest.tgtVal) &&
        Objects.equals(this.secTypes, mvoRequest.secTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickers, wConfig, minAssets, endDate, marketDataSource, wAssetConfig, startDate, tgtType, useProxyData, tgtVal, secTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MvoRequest {\n");
    
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    wConfig: ").append(toIndentedString(wConfig)).append("\n");
    sb.append("    minAssets: ").append(toIndentedString(minAssets)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    wAssetConfig: ").append(toIndentedString(wAssetConfig)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    tgtType: ").append(toIndentedString(tgtType)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    tgtVal: ").append(toIndentedString(tgtVal)).append("\n");
    sb.append("    secTypes: ").append(toIndentedString(secTypes)).append("\n");
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

