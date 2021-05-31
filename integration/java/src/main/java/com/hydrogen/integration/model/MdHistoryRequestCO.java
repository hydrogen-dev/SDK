/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * MdHistoryRequestCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class MdHistoryRequestCO {
  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("nucleus_security_id")
  private List<UUID> nucleusSecurityId = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("ticker")
  private List<String> ticker = null;

  public MdHistoryRequestCO endDate(LocalDate endDate) {
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

  public MdHistoryRequestCO nucleusSecurityId(List<UUID> nucleusSecurityId) {
    this.nucleusSecurityId = nucleusSecurityId;
    return this;
  }

  public MdHistoryRequestCO addNucleusSecurityIdItem(UUID nucleusSecurityIdItem) {
    if (this.nucleusSecurityId == null) {
      this.nucleusSecurityId = new ArrayList<UUID>();
    }
    this.nucleusSecurityId.add(nucleusSecurityIdItem);
    return this;
  }

   /**
   * Get nucleusSecurityId
   * @return nucleusSecurityId
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getNucleusSecurityId() {
    return nucleusSecurityId;
  }

  public void setNucleusSecurityId(List<UUID> nucleusSecurityId) {
    this.nucleusSecurityId = nucleusSecurityId;
  }

  public MdHistoryRequestCO product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public MdHistoryRequestCO startDate(LocalDate startDate) {
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

  public MdHistoryRequestCO ticker(List<String> ticker) {
    this.ticker = ticker;
    return this;
  }

  public MdHistoryRequestCO addTickerItem(String tickerItem) {
    if (this.ticker == null) {
      this.ticker = new ArrayList<String>();
    }
    this.ticker.add(tickerItem);
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "")
  public List<String> getTicker() {
    return ticker;
  }

  public void setTicker(List<String> ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdHistoryRequestCO mdHistoryRequestCO = (MdHistoryRequestCO) o;
    return Objects.equals(this.endDate, mdHistoryRequestCO.endDate) &&
        Objects.equals(this.nucleusSecurityId, mdHistoryRequestCO.nucleusSecurityId) &&
        Objects.equals(this.product, mdHistoryRequestCO.product) &&
        Objects.equals(this.startDate, mdHistoryRequestCO.startDate) &&
        Objects.equals(this.ticker, mdHistoryRequestCO.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, nucleusSecurityId, product, startDate, ticker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdHistoryRequestCO {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    nucleusSecurityId: ").append(toIndentedString(nucleusSecurityId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

