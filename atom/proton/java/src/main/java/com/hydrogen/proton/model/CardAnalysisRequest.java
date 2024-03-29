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
 * CardAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class CardAnalysisRequest {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("show_history")
  private Boolean showHistory = false;

  @SerializedName("response_limit")
  private Integer responseLimit = 10;

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

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

  @SerializedName("show_top_cards")
  private Boolean showTopCards = false;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("transaction_status_scope")
  private List<String> transactionStatusScope = null;

  @SerializedName("card_status_scope")
  private List<String> cardStatusScope = null;

  @SerializedName("show_top_cardholders")
  private Boolean showTopCardholders = false;

  @SerializedName("card_program_id")
  private UUID cardProgramId = null;

  @SerializedName("show_top_businesses")
  private Boolean showTopBusinesses = false;

  public CardAnalysisRequest currencyCode(String currencyCode) {
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

  public CardAnalysisRequest clientId(UUID clientId) {
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

  public CardAnalysisRequest showHistory(Boolean showHistory) {
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

  public CardAnalysisRequest responseLimit(Integer responseLimit) {
    this.responseLimit = responseLimit;
    return this;
  }

   /**
   * Get responseLimit
   * minimum: 1
   * @return responseLimit
  **/
  @ApiModelProperty(value = "")
  public Integer getResponseLimit() {
    return responseLimit;
  }

  public void setResponseLimit(Integer responseLimit) {
    this.responseLimit = responseLimit;
  }

  public CardAnalysisRequest currencyConversion(String currencyConversion) {
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

  public CardAnalysisRequest endDate(LocalDate endDate) {
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

  public CardAnalysisRequest historyFrequencyInterval(HistoryFrequencyIntervalEnum historyFrequencyInterval) {
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

  public CardAnalysisRequest showTopCards(Boolean showTopCards) {
    this.showTopCards = showTopCards;
    return this;
  }

   /**
   * Get showTopCards
   * @return showTopCards
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowTopCards() {
    return showTopCards;
  }

  public void setShowTopCards(Boolean showTopCards) {
    this.showTopCards = showTopCards;
  }

  public CardAnalysisRequest startDate(LocalDate startDate) {
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

  public CardAnalysisRequest businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @ApiModelProperty(value = "")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public CardAnalysisRequest transactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
    return this;
  }

  public CardAnalysisRequest addTransactionStatusScopeItem(String transactionStatusScopeItem) {
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

  public CardAnalysisRequest cardStatusScope(List<String> cardStatusScope) {
    this.cardStatusScope = cardStatusScope;
    return this;
  }

  public CardAnalysisRequest addCardStatusScopeItem(String cardStatusScopeItem) {
    if (this.cardStatusScope == null) {
      this.cardStatusScope = new ArrayList<String>();
    }
    this.cardStatusScope.add(cardStatusScopeItem);
    return this;
  }

   /**
   * Get cardStatusScope
   * @return cardStatusScope
  **/
  @ApiModelProperty(value = "")
  public List<String> getCardStatusScope() {
    return cardStatusScope;
  }

  public void setCardStatusScope(List<String> cardStatusScope) {
    this.cardStatusScope = cardStatusScope;
  }

  public CardAnalysisRequest showTopCardholders(Boolean showTopCardholders) {
    this.showTopCardholders = showTopCardholders;
    return this;
  }

   /**
   * Get showTopCardholders
   * @return showTopCardholders
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowTopCardholders() {
    return showTopCardholders;
  }

  public void setShowTopCardholders(Boolean showTopCardholders) {
    this.showTopCardholders = showTopCardholders;
  }

  public CardAnalysisRequest cardProgramId(UUID cardProgramId) {
    this.cardProgramId = cardProgramId;
    return this;
  }

   /**
   * Get cardProgramId
   * @return cardProgramId
  **/
  @ApiModelProperty(value = "")
  public UUID getCardProgramId() {
    return cardProgramId;
  }

  public void setCardProgramId(UUID cardProgramId) {
    this.cardProgramId = cardProgramId;
  }

  public CardAnalysisRequest showTopBusinesses(Boolean showTopBusinesses) {
    this.showTopBusinesses = showTopBusinesses;
    return this;
  }

   /**
   * Get showTopBusinesses
   * @return showTopBusinesses
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowTopBusinesses() {
    return showTopBusinesses;
  }

  public void setShowTopBusinesses(Boolean showTopBusinesses) {
    this.showTopBusinesses = showTopBusinesses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAnalysisRequest cardAnalysisRequest = (CardAnalysisRequest) o;
    return Objects.equals(this.currencyCode, cardAnalysisRequest.currencyCode) &&
        Objects.equals(this.clientId, cardAnalysisRequest.clientId) &&
        Objects.equals(this.showHistory, cardAnalysisRequest.showHistory) &&
        Objects.equals(this.responseLimit, cardAnalysisRequest.responseLimit) &&
        Objects.equals(this.currencyConversion, cardAnalysisRequest.currencyConversion) &&
        Objects.equals(this.endDate, cardAnalysisRequest.endDate) &&
        Objects.equals(this.historyFrequencyInterval, cardAnalysisRequest.historyFrequencyInterval) &&
        Objects.equals(this.showTopCards, cardAnalysisRequest.showTopCards) &&
        Objects.equals(this.startDate, cardAnalysisRequest.startDate) &&
        Objects.equals(this.businessId, cardAnalysisRequest.businessId) &&
        Objects.equals(this.transactionStatusScope, cardAnalysisRequest.transactionStatusScope) &&
        Objects.equals(this.cardStatusScope, cardAnalysisRequest.cardStatusScope) &&
        Objects.equals(this.showTopCardholders, cardAnalysisRequest.showTopCardholders) &&
        Objects.equals(this.cardProgramId, cardAnalysisRequest.cardProgramId) &&
        Objects.equals(this.showTopBusinesses, cardAnalysisRequest.showTopBusinesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, clientId, showHistory, responseLimit, currencyConversion, endDate, historyFrequencyInterval, showTopCards, startDate, businessId, transactionStatusScope, cardStatusScope, showTopCardholders, cardProgramId, showTopBusinesses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAnalysisRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    showHistory: ").append(toIndentedString(showHistory)).append("\n");
    sb.append("    responseLimit: ").append(toIndentedString(responseLimit)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    historyFrequencyInterval: ").append(toIndentedString(historyFrequencyInterval)).append("\n");
    sb.append("    showTopCards: ").append(toIndentedString(showTopCards)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    transactionStatusScope: ").append(toIndentedString(transactionStatusScope)).append("\n");
    sb.append("    cardStatusScope: ").append(toIndentedString(cardStatusScope)).append("\n");
    sb.append("    showTopCardholders: ").append(toIndentedString(showTopCardholders)).append("\n");
    sb.append("    cardProgramId: ").append(toIndentedString(cardProgramId)).append("\n");
    sb.append("    showTopBusinesses: ").append(toIndentedString(showTopBusinesses)).append("\n");
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

