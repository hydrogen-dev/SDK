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
import io.swagger.client.model.FinancialPictureResponseByCategory;
import io.swagger.client.model.FinancialPictureResponseNetWorth;
import io.swagger.client.model.FinancialPictureResponseTotalAssets;
import io.swagger.client.model.FinancialPictureResponseTotalLiabilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FinancialPictureResponseSnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialPictureResponseSnapshot {
  @SerializedName("total_assets")
  private FinancialPictureResponseTotalAssets totalAssets = null;

  @SerializedName("total_liabilities")
  private FinancialPictureResponseTotalLiabilities totalLiabilities = null;

  @SerializedName("net_worth")
  private FinancialPictureResponseNetWorth netWorth = null;

  @SerializedName("by_category")
  private List<FinancialPictureResponseByCategory> byCategory = null;

  public FinancialPictureResponseSnapshot totalAssets(FinancialPictureResponseTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Get totalAssets
   * @return totalAssets
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseTotalAssets getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(FinancialPictureResponseTotalAssets totalAssets) {
    this.totalAssets = totalAssets;
  }

  public FinancialPictureResponseSnapshot totalLiabilities(FinancialPictureResponseTotalLiabilities totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * Get totalLiabilities
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseTotalLiabilities getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(FinancialPictureResponseTotalLiabilities totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public FinancialPictureResponseSnapshot netWorth(FinancialPictureResponseNetWorth netWorth) {
    this.netWorth = netWorth;
    return this;
  }

   /**
   * Get netWorth
   * @return netWorth
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseNetWorth getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(FinancialPictureResponseNetWorth netWorth) {
    this.netWorth = netWorth;
  }

  public FinancialPictureResponseSnapshot byCategory(List<FinancialPictureResponseByCategory> byCategory) {
    this.byCategory = byCategory;
    return this;
  }

  public FinancialPictureResponseSnapshot addByCategoryItem(FinancialPictureResponseByCategory byCategoryItem) {
    if (this.byCategory == null) {
      this.byCategory = new ArrayList<FinancialPictureResponseByCategory>();
    }
    this.byCategory.add(byCategoryItem);
    return this;
  }

   /**
   * Get byCategory
   * @return byCategory
  **/
  @ApiModelProperty(value = "")
  public List<FinancialPictureResponseByCategory> getByCategory() {
    return byCategory;
  }

  public void setByCategory(List<FinancialPictureResponseByCategory> byCategory) {
    this.byCategory = byCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseSnapshot financialPictureResponseSnapshot = (FinancialPictureResponseSnapshot) o;
    return Objects.equals(this.totalAssets, financialPictureResponseSnapshot.totalAssets) &&
        Objects.equals(this.totalLiabilities, financialPictureResponseSnapshot.totalLiabilities) &&
        Objects.equals(this.netWorth, financialPictureResponseSnapshot.netWorth) &&
        Objects.equals(this.byCategory, financialPictureResponseSnapshot.byCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAssets, totalLiabilities, netWorth, byCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseSnapshot {\n");
    
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    netWorth: ").append(toIndentedString(netWorth)).append("\n");
    sb.append("    byCategory: ").append(toIndentedString(byCategory)).append("\n");
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

