/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
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
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CashAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class CashAnalysisRequest {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("show_history")
  private Boolean showHistory = false;

  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    ALL("all"),
    
    EXTERNAL("external"),
    
    INTERNAL("internal");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = ScopeEnum.ALL;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  /**
   * Gets or Sets historyFrequencyInterval
   */
  @JsonAdapter(HistoryFrequencyIntervalEnum.Adapter.class)
  public enum HistoryFrequencyIntervalEnum {
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    QUARTER("quarter"),
    
    YEAR("year");

    private String value;

    HistoryFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HistoryFrequencyIntervalEnum fromValue(String text) {
      for (HistoryFrequencyIntervalEnum b : HistoryFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HistoryFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HistoryFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HistoryFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HistoryFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("history_frequency_interval")
  private HistoryFrequencyIntervalEnum historyFrequencyInterval = HistoryFrequencyIntervalEnum.MONTH;

  @SerializedName("show_inflow_details")
  private Boolean showInflowDetails = false;

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("transaction_status_scope")
  private List<String> transactionStatusScope = null;

  @SerializedName("show_outflow_details")
  private Boolean showOutflowDetails = false;

  @SerializedName("only_cleansed")
  private Boolean onlyCleansed = false;

  public CashAnalysisRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CashAnalysisRequest clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public CashAnalysisRequest showHistory(Boolean showHistory) {
    this.showHistory = showHistory;
    return this;
  }

   /**
   * Get showHistory
   * @return showHistory
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowHistory() {
    return showHistory;
  }

  public void setShowHistory(Boolean showHistory) {
    this.showHistory = showHistory;
  }

  public CashAnalysisRequest scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public CashAnalysisRequest endDate(LocalDate endDate) {
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

  public CashAnalysisRequest historyFrequencyInterval(HistoryFrequencyIntervalEnum historyFrequencyInterval) {
    this.historyFrequencyInterval = historyFrequencyInterval;
    return this;
  }

   /**
   * Get historyFrequencyInterval
   * @return historyFrequencyInterval
  **/
  @ApiModelProperty(value = "")
  public HistoryFrequencyIntervalEnum getHistoryFrequencyInterval() {
    return historyFrequencyInterval;
  }

  public void setHistoryFrequencyInterval(HistoryFrequencyIntervalEnum historyFrequencyInterval) {
    this.historyFrequencyInterval = historyFrequencyInterval;
  }

  public CashAnalysisRequest showInflowDetails(Boolean showInflowDetails) {
    this.showInflowDetails = showInflowDetails;
    return this;
  }

   /**
   * Get showInflowDetails
   * @return showInflowDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowInflowDetails() {
    return showInflowDetails;
  }

  public void setShowInflowDetails(Boolean showInflowDetails) {
    this.showInflowDetails = showInflowDetails;
  }

  public CashAnalysisRequest currencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public CashAnalysisRequest startDate(LocalDate startDate) {
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

  public CashAnalysisRequest transactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
    return this;
  }

  public CashAnalysisRequest addTransactionStatusScopeItem(String transactionStatusScopeItem) {
    if (this.transactionStatusScope == null) {
      this.transactionStatusScope = new ArrayList<String>();
    }
    this.transactionStatusScope.add(transactionStatusScopeItem);
    return this;
  }

   /**
   * Get transactionStatusScope
   * @return transactionStatusScope
  **/
  @ApiModelProperty(value = "")
  public List<String> getTransactionStatusScope() {
    return transactionStatusScope;
  }

  public void setTransactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
  }

  public CashAnalysisRequest showOutflowDetails(Boolean showOutflowDetails) {
    this.showOutflowDetails = showOutflowDetails;
    return this;
  }

   /**
   * Get showOutflowDetails
   * @return showOutflowDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowOutflowDetails() {
    return showOutflowDetails;
  }

  public void setShowOutflowDetails(Boolean showOutflowDetails) {
    this.showOutflowDetails = showOutflowDetails;
  }

  public CashAnalysisRequest onlyCleansed(Boolean onlyCleansed) {
    this.onlyCleansed = onlyCleansed;
    return this;
  }

   /**
   * Get onlyCleansed
   * @return onlyCleansed
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnlyCleansed() {
    return onlyCleansed;
  }

  public void setOnlyCleansed(Boolean onlyCleansed) {
    this.onlyCleansed = onlyCleansed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAnalysisRequest cashAnalysisRequest = (CashAnalysisRequest) o;
    return Objects.equals(this.currencyCode, cashAnalysisRequest.currencyCode) &&
        Objects.equals(this.clientId, cashAnalysisRequest.clientId) &&
        Objects.equals(this.showHistory, cashAnalysisRequest.showHistory) &&
        Objects.equals(this.scope, cashAnalysisRequest.scope) &&
        Objects.equals(this.endDate, cashAnalysisRequest.endDate) &&
        Objects.equals(this.historyFrequencyInterval, cashAnalysisRequest.historyFrequencyInterval) &&
        Objects.equals(this.showInflowDetails, cashAnalysisRequest.showInflowDetails) &&
        Objects.equals(this.currencyConversion, cashAnalysisRequest.currencyConversion) &&
        Objects.equals(this.startDate, cashAnalysisRequest.startDate) &&
        Objects.equals(this.transactionStatusScope, cashAnalysisRequest.transactionStatusScope) &&
        Objects.equals(this.showOutflowDetails, cashAnalysisRequest.showOutflowDetails) &&
        Objects.equals(this.onlyCleansed, cashAnalysisRequest.onlyCleansed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, clientId, showHistory, scope, endDate, historyFrequencyInterval, showInflowDetails, currencyConversion, startDate, transactionStatusScope, showOutflowDetails, onlyCleansed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAnalysisRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    showHistory: ").append(toIndentedString(showHistory)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    historyFrequencyInterval: ").append(toIndentedString(historyFrequencyInterval)).append("\n");
    sb.append("    showInflowDetails: ").append(toIndentedString(showInflowDetails)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    transactionStatusScope: ").append(toIndentedString(transactionStatusScope)).append("\n");
    sb.append("    showOutflowDetails: ").append(toIndentedString(showOutflowDetails)).append("\n");
    sb.append("    onlyCleansed: ").append(toIndentedString(onlyCleansed)).append("\n");
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

