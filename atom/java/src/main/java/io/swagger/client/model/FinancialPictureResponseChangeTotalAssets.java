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
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets180Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets1Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets30Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets365Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets7Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssets90Day;
import io.swagger.client.model.FinancialPictureResponseChangeTotalAssetsTotal;
import java.io.IOException;

/**
 * FinancialPictureResponseChangeTotalAssets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class FinancialPictureResponseChangeTotalAssets {
  @SerializedName("1_day")
  private FinancialPictureResponseChangeTotalAssets1Day _1Day = null;

  @SerializedName("7_day")
  private FinancialPictureResponseChangeTotalAssets7Day _7Day = null;

  @SerializedName("30_day")
  private FinancialPictureResponseChangeTotalAssets30Day _30Day = null;

  @SerializedName("90_day")
  private FinancialPictureResponseChangeTotalAssets90Day _90Day = null;

  @SerializedName("180_day")
  private FinancialPictureResponseChangeTotalAssets180Day _180Day = null;

  @SerializedName("365_day")
  private FinancialPictureResponseChangeTotalAssets365Day _365Day = null;

  @SerializedName("total")
  private FinancialPictureResponseChangeTotalAssetsTotal total = null;

  public FinancialPictureResponseChangeTotalAssets _1Day(FinancialPictureResponseChangeTotalAssets1Day _1Day) {
    this._1Day = _1Day;
    return this;
  }

   /**
   * Get _1Day
   * @return _1Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets1Day get1Day() {
    return _1Day;
  }

  public void set1Day(FinancialPictureResponseChangeTotalAssets1Day _1Day) {
    this._1Day = _1Day;
  }

  public FinancialPictureResponseChangeTotalAssets _7Day(FinancialPictureResponseChangeTotalAssets7Day _7Day) {
    this._7Day = _7Day;
    return this;
  }

   /**
   * Get _7Day
   * @return _7Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets7Day get7Day() {
    return _7Day;
  }

  public void set7Day(FinancialPictureResponseChangeTotalAssets7Day _7Day) {
    this._7Day = _7Day;
  }

  public FinancialPictureResponseChangeTotalAssets _30Day(FinancialPictureResponseChangeTotalAssets30Day _30Day) {
    this._30Day = _30Day;
    return this;
  }

   /**
   * Get _30Day
   * @return _30Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets30Day get30Day() {
    return _30Day;
  }

  public void set30Day(FinancialPictureResponseChangeTotalAssets30Day _30Day) {
    this._30Day = _30Day;
  }

  public FinancialPictureResponseChangeTotalAssets _90Day(FinancialPictureResponseChangeTotalAssets90Day _90Day) {
    this._90Day = _90Day;
    return this;
  }

   /**
   * Get _90Day
   * @return _90Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets90Day get90Day() {
    return _90Day;
  }

  public void set90Day(FinancialPictureResponseChangeTotalAssets90Day _90Day) {
    this._90Day = _90Day;
  }

  public FinancialPictureResponseChangeTotalAssets _180Day(FinancialPictureResponseChangeTotalAssets180Day _180Day) {
    this._180Day = _180Day;
    return this;
  }

   /**
   * Get _180Day
   * @return _180Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets180Day get180Day() {
    return _180Day;
  }

  public void set180Day(FinancialPictureResponseChangeTotalAssets180Day _180Day) {
    this._180Day = _180Day;
  }

  public FinancialPictureResponseChangeTotalAssets _365Day(FinancialPictureResponseChangeTotalAssets365Day _365Day) {
    this._365Day = _365Day;
    return this;
  }

   /**
   * Get _365Day
   * @return _365Day
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssets365Day get365Day() {
    return _365Day;
  }

  public void set365Day(FinancialPictureResponseChangeTotalAssets365Day _365Day) {
    this._365Day = _365Day;
  }

  public FinancialPictureResponseChangeTotalAssets total(FinancialPictureResponseChangeTotalAssetsTotal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChangeTotalAssetsTotal getTotal() {
    return total;
  }

  public void setTotal(FinancialPictureResponseChangeTotalAssetsTotal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponseChangeTotalAssets financialPictureResponseChangeTotalAssets = (FinancialPictureResponseChangeTotalAssets) o;
    return Objects.equals(this._1Day, financialPictureResponseChangeTotalAssets._1Day) &&
        Objects.equals(this._7Day, financialPictureResponseChangeTotalAssets._7Day) &&
        Objects.equals(this._30Day, financialPictureResponseChangeTotalAssets._30Day) &&
        Objects.equals(this._90Day, financialPictureResponseChangeTotalAssets._90Day) &&
        Objects.equals(this._180Day, financialPictureResponseChangeTotalAssets._180Day) &&
        Objects.equals(this._365Day, financialPictureResponseChangeTotalAssets._365Day) &&
        Objects.equals(this.total, financialPictureResponseChangeTotalAssets.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1Day, _7Day, _30Day, _90Day, _180Day, _365Day, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponseChangeTotalAssets {\n");
    
    sb.append("    _1Day: ").append(toIndentedString(_1Day)).append("\n");
    sb.append("    _7Day: ").append(toIndentedString(_7Day)).append("\n");
    sb.append("    _30Day: ").append(toIndentedString(_30Day)).append("\n");
    sb.append("    _90Day: ").append(toIndentedString(_90Day)).append("\n");
    sb.append("    _180Day: ").append(toIndentedString(_180Day)).append("\n");
    sb.append("    _365Day: ").append(toIndentedString(_365Day)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

