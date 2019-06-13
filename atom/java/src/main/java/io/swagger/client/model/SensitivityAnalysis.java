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
import io.swagger.client.model.SensitivityFactor;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * SensitivityAnalysis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class SensitivityAnalysis {
  @SerializedName("portfolio_tickers")
  private List<String> portfolioTickers = new ArrayList<String>();

  @SerializedName("portfolio_weights")
  private List<BigDecimal> portfolioWeights = new ArrayList<BigDecimal>();

  /**
   * Frequency interval for returns, change_duration, and lag
   */
  @JsonAdapter(FrequencyIntervalEnum.Adapter.class)
  public enum FrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    FrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyIntervalEnum fromValue(String text) {
      for (FrequencyIntervalEnum b : FrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency_interval")
  private FrequencyIntervalEnum frequencyInterval = null;

  @SerializedName("sensitivity_factor")
  private SensitivityFactor sensitivityFactor = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("trading_days_per_year")
  private Integer tradingDaysPerYear = null;

  public SensitivityAnalysis portfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
    return this;
  }

  public SensitivityAnalysis addPortfolioTickersItem(String portfolioTickersItem) {
    this.portfolioTickers.add(portfolioTickersItem);
    return this;
  }

   /**
   * A list of symbols for securities in the portfolio
   * @return portfolioTickers
  **/
  @ApiModelProperty(required = true, value = "A list of symbols for securities in the portfolio")
  public List<String> getPortfolioTickers() {
    return portfolioTickers;
  }

  public void setPortfolioTickers(List<String> portfolioTickers) {
    this.portfolioTickers = portfolioTickers;
  }

  public SensitivityAnalysis portfolioWeights(List<BigDecimal> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
    return this;
  }

  public SensitivityAnalysis addPortfolioWeightsItem(BigDecimal portfolioWeightsItem) {
    this.portfolioWeights.add(portfolioWeightsItem);
    return this;
  }

   /**
   * Get portfolioWeights
   * @return portfolioWeights
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BigDecimal> getPortfolioWeights() {
    return portfolioWeights;
  }

  public void setPortfolioWeights(List<BigDecimal> portfolioWeights) {
    this.portfolioWeights = portfolioWeights;
  }

  public SensitivityAnalysis frequencyInterval(FrequencyIntervalEnum frequencyInterval) {
    this.frequencyInterval = frequencyInterval;
    return this;
  }

   /**
   * Frequency interval for returns, change_duration, and lag
   * @return frequencyInterval
  **/
  @ApiModelProperty(required = true, value = "Frequency interval for returns, change_duration, and lag")
  public FrequencyIntervalEnum getFrequencyInterval() {
    return frequencyInterval;
  }

  public void setFrequencyInterval(FrequencyIntervalEnum frequencyInterval) {
    this.frequencyInterval = frequencyInterval;
  }

  public SensitivityAnalysis sensitivityFactor(SensitivityFactor sensitivityFactor) {
    this.sensitivityFactor = sensitivityFactor;
    return this;
  }

   /**
   * Get sensitivityFactor
   * @return sensitivityFactor
  **/
  @ApiModelProperty(required = true, value = "")
  public SensitivityFactor getSensitivityFactor() {
    return sensitivityFactor;
  }

  public void setSensitivityFactor(SensitivityFactor sensitivityFactor) {
    this.sensitivityFactor = sensitivityFactor;
  }

  public SensitivityAnalysis startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of data
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of data")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public SensitivityAnalysis endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of data
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of data")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SensitivityAnalysis tradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
    return this;
  }

   /**
   * Number of trading days per year, used in calculations
   * minimum: 1
   * @return tradingDaysPerYear
  **/
  @ApiModelProperty(value = "Number of trading days per year, used in calculations")
  public Integer getTradingDaysPerYear() {
    return tradingDaysPerYear;
  }

  public void setTradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitivityAnalysis sensitivityAnalysis = (SensitivityAnalysis) o;
    return Objects.equals(this.portfolioTickers, sensitivityAnalysis.portfolioTickers) &&
        Objects.equals(this.portfolioWeights, sensitivityAnalysis.portfolioWeights) &&
        Objects.equals(this.frequencyInterval, sensitivityAnalysis.frequencyInterval) &&
        Objects.equals(this.sensitivityFactor, sensitivityAnalysis.sensitivityFactor) &&
        Objects.equals(this.startDate, sensitivityAnalysis.startDate) &&
        Objects.equals(this.endDate, sensitivityAnalysis.endDate) &&
        Objects.equals(this.tradingDaysPerYear, sensitivityAnalysis.tradingDaysPerYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioTickers, portfolioWeights, frequencyInterval, sensitivityFactor, startDate, endDate, tradingDaysPerYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitivityAnalysis {\n");
    
    sb.append("    portfolioTickers: ").append(toIndentedString(portfolioTickers)).append("\n");
    sb.append("    portfolioWeights: ").append(toIndentedString(portfolioWeights)).append("\n");
    sb.append("    frequencyInterval: ").append(toIndentedString(frequencyInterval)).append("\n");
    sb.append("    sensitivityFactor: ").append(toIndentedString(sensitivityFactor)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    tradingDaysPerYear: ").append(toIndentedString(tradingDaysPerYear)).append("\n");
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

