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
import io.swagger.client.model.FinancialPictureResponseChange;
import io.swagger.client.model.FinancialPictureResponseHistory;
import io.swagger.client.model.FinancialPictureResponseSnapshot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FinancialPictureResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class FinancialPictureResponse {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("snapshot")
  private FinancialPictureResponseSnapshot snapshot = null;

  @SerializedName("change")
  private FinancialPictureResponseChange change = null;

  @SerializedName("history")
  private List<FinancialPictureResponseHistory> history = null;

  public FinancialPictureResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code associated with monetary response values
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "Currency code associated with monetary response values")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FinancialPictureResponse snapshot(FinancialPictureResponseSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(required = true, value = "")
  public FinancialPictureResponseSnapshot getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(FinancialPictureResponseSnapshot snapshot) {
    this.snapshot = snapshot;
  }

  public FinancialPictureResponse change(FinancialPictureResponseChange change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @ApiModelProperty(value = "")
  public FinancialPictureResponseChange getChange() {
    return change;
  }

  public void setChange(FinancialPictureResponseChange change) {
    this.change = change;
  }

  public FinancialPictureResponse history(List<FinancialPictureResponseHistory> history) {
    this.history = history;
    return this;
  }

  public FinancialPictureResponse addHistoryItem(FinancialPictureResponseHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<FinancialPictureResponseHistory>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * A historical record of the client’s financials for each date within the date range. This is an array of maps, with each map corresponding to a date.
   * @return history
  **/
  @ApiModelProperty(value = "A historical record of the client’s financials for each date within the date range. This is an array of maps, with each map corresponding to a date.")
  public List<FinancialPictureResponseHistory> getHistory() {
    return history;
  }

  public void setHistory(List<FinancialPictureResponseHistory> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPictureResponse financialPictureResponse = (FinancialPictureResponse) o;
    return Objects.equals(this.currencyCode, financialPictureResponse.currencyCode) &&
        Objects.equals(this.snapshot, financialPictureResponse.snapshot) &&
        Objects.equals(this.change, financialPictureResponse.change) &&
        Objects.equals(this.history, financialPictureResponse.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, snapshot, change, history);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPictureResponse {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

