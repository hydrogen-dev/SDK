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

/**
 * GoalDepositConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class GoalDepositConfig {
  /**
   * The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start.
   */
  @JsonAdapter(DepStartReferenceEnum.Adapter.class)
  public enum DepStartReferenceEnum {
    START("a_start"),
    
    END("a_end");

    private String value;

    DepStartReferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepStartReferenceEnum fromValue(String text) {
      for (DepStartReferenceEnum b : DepStartReferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepStartReferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepStartReferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepStartReferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepStartReferenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_start_reference")
  private DepStartReferenceEnum depStartReference = DepStartReferenceEnum.START;

  @SerializedName("dep_start_period")
  private Integer depStartPeriod = null;

  /**
   * The reference for the ending point of the deposit
   */
  @JsonAdapter(DepEndReferenceEnum.Adapter.class)
  public enum DepEndReferenceEnum {
    A_START("a_start"),
    
    A_END("a_end"),
    
    D_END("d_end");

    private String value;

    DepEndReferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepEndReferenceEnum fromValue(String text) {
      for (DepEndReferenceEnum b : DepEndReferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepEndReferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepEndReferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepEndReferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepEndReferenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_end_reference")
  private DepEndReferenceEnum depEndReference = DepEndReferenceEnum.A_END;

  @SerializedName("dep_end_period")
  private Integer depEndPeriod = null;

  @SerializedName("dep_amount")
  private BigDecimal depAmount = null;

  /**
   * The frequency of the deposit
   */
  @JsonAdapter(DepFrequencyEnum.Adapter.class)
  public enum DepFrequencyEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    DepFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepFrequencyEnum fromValue(String text) {
      for (DepFrequencyEnum b : DepFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_frequency")
  private DepFrequencyEnum depFrequency = DepFrequencyEnum.YEAR;

  @SerializedName("dep_inflation")
  private BigDecimal depInflation = null;

  public GoalDepositConfig depStartReference(DepStartReferenceEnum depStartReference) {
    this.depStartReference = depStartReference;
    return this;
  }

   /**
   * The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start.
   * @return depStartReference
  **/
  @ApiModelProperty(value = "The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start.")
  public DepStartReferenceEnum getDepStartReference() {
    return depStartReference;
  }

  public void setDepStartReference(DepStartReferenceEnum depStartReference) {
    this.depStartReference = depStartReference;
  }

  public GoalDepositConfig depStartPeriod(Integer depStartPeriod) {
    this.depStartPeriod = depStartPeriod;
    return this;
  }

   /**
   * The starting period for the deposit
   * @return depStartPeriod
  **/
  @ApiModelProperty(value = "The starting period for the deposit")
  public Integer getDepStartPeriod() {
    return depStartPeriod;
  }

  public void setDepStartPeriod(Integer depStartPeriod) {
    this.depStartPeriod = depStartPeriod;
  }

  public GoalDepositConfig depEndReference(DepEndReferenceEnum depEndReference) {
    this.depEndReference = depEndReference;
    return this;
  }

   /**
   * The reference for the ending point of the deposit
   * @return depEndReference
  **/
  @ApiModelProperty(value = "The reference for the ending point of the deposit")
  public DepEndReferenceEnum getDepEndReference() {
    return depEndReference;
  }

  public void setDepEndReference(DepEndReferenceEnum depEndReference) {
    this.depEndReference = depEndReference;
  }

  public GoalDepositConfig depEndPeriod(Integer depEndPeriod) {
    this.depEndPeriod = depEndPeriod;
    return this;
  }

   /**
   * The ending point for the deposit
   * @return depEndPeriod
  **/
  @ApiModelProperty(value = "The ending point for the deposit")
  public Integer getDepEndPeriod() {
    return depEndPeriod;
  }

  public void setDepEndPeriod(Integer depEndPeriod) {
    this.depEndPeriod = depEndPeriod;
  }

  public GoalDepositConfig depAmount(BigDecimal depAmount) {
    this.depAmount = depAmount;
    return this;
  }

   /**
   * The deposit amount in present dollars
   * minimum: 0
   * @return depAmount
  **/
  @ApiModelProperty(value = "The deposit amount in present dollars")
  public BigDecimal getDepAmount() {
    return depAmount;
  }

  public void setDepAmount(BigDecimal depAmount) {
    this.depAmount = depAmount;
  }

  public GoalDepositConfig depFrequency(DepFrequencyEnum depFrequency) {
    this.depFrequency = depFrequency;
    return this;
  }

   /**
   * The frequency of the deposit
   * @return depFrequency
  **/
  @ApiModelProperty(value = "The frequency of the deposit")
  public DepFrequencyEnum getDepFrequency() {
    return depFrequency;
  }

  public void setDepFrequency(DepFrequencyEnum depFrequency) {
    this.depFrequency = depFrequency;
  }

  public GoalDepositConfig depInflation(BigDecimal depInflation) {
    this.depInflation = depInflation;
    return this;
  }

   /**
   * The annualized inflation for the deposits
   * minimum: -1
   * maximum: 20
   * @return depInflation
  **/
  @ApiModelProperty(value = "The annualized inflation for the deposits")
  public BigDecimal getDepInflation() {
    return depInflation;
  }

  public void setDepInflation(BigDecimal depInflation) {
    this.depInflation = depInflation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalDepositConfig goalDepositConfig = (GoalDepositConfig) o;
    return Objects.equals(this.depStartReference, goalDepositConfig.depStartReference) &&
        Objects.equals(this.depStartPeriod, goalDepositConfig.depStartPeriod) &&
        Objects.equals(this.depEndReference, goalDepositConfig.depEndReference) &&
        Objects.equals(this.depEndPeriod, goalDepositConfig.depEndPeriod) &&
        Objects.equals(this.depAmount, goalDepositConfig.depAmount) &&
        Objects.equals(this.depFrequency, goalDepositConfig.depFrequency) &&
        Objects.equals(this.depInflation, goalDepositConfig.depInflation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depStartReference, depStartPeriod, depEndReference, depEndPeriod, depAmount, depFrequency, depInflation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalDepositConfig {\n");
    
    sb.append("    depStartReference: ").append(toIndentedString(depStartReference)).append("\n");
    sb.append("    depStartPeriod: ").append(toIndentedString(depStartPeriod)).append("\n");
    sb.append("    depEndReference: ").append(toIndentedString(depEndReference)).append("\n");
    sb.append("    depEndPeriod: ").append(toIndentedString(depEndPeriod)).append("\n");
    sb.append("    depAmount: ").append(toIndentedString(depAmount)).append("\n");
    sb.append("    depFrequency: ").append(toIndentedString(depFrequency)).append("\n");
    sb.append("    depInflation: ").append(toIndentedString(depInflation)).append("\n");
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

