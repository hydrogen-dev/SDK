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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * EventStudy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class EventStudy {
  @SerializedName("portfolio_tickers")
  private List<String> portfolioTickers = new ArrayList<String>();

  @SerializedName("portfolio_weights")
  private List<BigDecimal> portfolioWeights = new ArrayList<BigDecimal>();

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    DOT_COM_BUBBLE("dot_com_bubble"),
    
    _2008_FINANCIAL_CRISIS("2008_financial_crisis"),
    
    BREXIT("brexit"),
    
    _2011_BLACK_MONDAY("2011_black_monday"),
    
    SEPTEMBER_ELEVENTH("september_eleventh"),
    
    _1987_BLACK_MONDAY("1987_black_monday"),
    
    _1992_BLACK_WEDNESDAY("1992_black_wednesday"),
    
    _1997_ASIAN_FINANCIAL_CRISIS("1997_asian_financial_crisis");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String text) {
      for (EventsEnum b : EventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("events")
  private List<EventsEnum> events = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  public EventStudy portfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
    return this;
  }

  public EventStudy addPortfolioTickersItem(String portfolioTickersItem) {
    this.portfolioTickers.add(portfolioTickersItem);
    return this;
  }

   /**
   * Tickers of portfolio holdings
   * @return portfolioTickers
  **/
  @ApiModelProperty(required = true, value = "Tickers of portfolio holdings")
  public List<String> getPortfolioTickers() {
    return portfolioTickers;
  }

  public void setPortfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
  }

  public EventStudy portfolioWeights(List<BigDecimal> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
    return this;
  }

  public EventStudy addPortfolioWeightsItem(BigDecimal portfolioWeightsItem) {
    this.portfolioWeights.add(portfolioWeightsItem);
    return this;
  }

   /**
   * Weights of portfolio holdings
   * @return portfolioWeights
  **/
  @ApiModelProperty(required = true, value = "Weights of portfolio holdings")
  public List<BigDecimal> getPortfolioWeights() {
    return portfolioWeights;
  }

  public void setPortfolioWeights(List<BigDecimal> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
  }

  public EventStudy events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public EventStudy addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EventsEnum>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Historical events to analyze
   * @return events
  **/
  @ApiModelProperty(value = "Historical events to analyze")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public EventStudy useProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
    return this;
  }

   /**
   * If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.
   * @return useProxyData
  **/
  @ApiModelProperty(value = "If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.")
  public Boolean isUseProxyData() {
    return useProxyData;
  }

  public void setUseProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStudy eventStudy = (EventStudy) o;
    return Objects.equals(this.portfolioTickers, eventStudy.portfolioTickers) &&
        Objects.equals(this.portfolioWeights, eventStudy.portfolioWeights) &&
        Objects.equals(this.events, eventStudy.events) &&
        Objects.equals(this.useProxyData, eventStudy.useProxyData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioTickers, portfolioWeights, events, useProxyData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStudy {\n");
    
    sb.append("    portfolioTickers: ").append(toIndentedString(portfolioTickers)).append("\n");
    sb.append("    portfolioWeights: ").append(toIndentedString(portfolioWeights)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
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

