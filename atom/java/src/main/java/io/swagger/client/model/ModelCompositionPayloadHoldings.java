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
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * ModelCompositionPayloadHoldings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class ModelCompositionPayloadHoldings {
  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("current_weight")
  private Double currentWeight = null;

  @SerializedName("strategic_weight")
  private Double strategicWeight = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("is_safe_security")
  private Boolean isSafeSecurity = null;

  @SerializedName("is_initial_holding")
  private Boolean isInitialHolding = null;

  public ModelCompositionPayloadHoldings securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The ID of the security included in this holding record
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The ID of the security included in this holding record")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public ModelCompositionPayloadHoldings currentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
    return this;
  }

   /**
   * Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100
   * @return currentWeight
  **/
  @ApiModelProperty(required = true, value = "Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100")
  public Double getCurrentWeight() {
    return currentWeight;
  }

  public void setCurrentWeight(Double currentWeight) {
    this.currentWeight = currentWeight;
  }

  public ModelCompositionPayloadHoldings strategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
    return this;
  }

   /**
   * Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100
   * @return strategicWeight
  **/
  @ApiModelProperty(required = true, value = "Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100")
  public Double getStrategicWeight() {
    return strategicWeight;
  }

  public void setStrategicWeight(Double strategicWeight) {
    this.strategicWeight = strategicWeight;
  }

  public ModelCompositionPayloadHoldings date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the security weight
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of the security weight")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ModelCompositionPayloadHoldings isSafeSecurity(Boolean isSafeSecurity) {
    this.isSafeSecurity = isSafeSecurity;
    return this;
  }

   /**
   * If true, the security is classified as safe
   * @return isSafeSecurity
  **/
  @ApiModelProperty(value = "If true, the security is classified as safe")
  public Boolean isIsSafeSecurity() {
    return isSafeSecurity;
  }

  public void setIsSafeSecurity(Boolean isSafeSecurity) {
    this.isSafeSecurity = isSafeSecurity;
  }

  public ModelCompositionPayloadHoldings isInitialHolding(Boolean isInitialHolding) {
    this.isInitialHolding = isInitialHolding;
    return this;
  }

   /**
   * If true, the security is an initial holding in the model
   * @return isInitialHolding
  **/
  @ApiModelProperty(value = "If true, the security is an initial holding in the model")
  public Boolean isIsInitialHolding() {
    return isInitialHolding;
  }

  public void setIsInitialHolding(Boolean isInitialHolding) {
    this.isInitialHolding = isInitialHolding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCompositionPayloadHoldings modelCompositionPayloadHoldings = (ModelCompositionPayloadHoldings) o;
    return Objects.equals(this.securityId, modelCompositionPayloadHoldings.securityId) &&
        Objects.equals(this.currentWeight, modelCompositionPayloadHoldings.currentWeight) &&
        Objects.equals(this.strategicWeight, modelCompositionPayloadHoldings.strategicWeight) &&
        Objects.equals(this.date, modelCompositionPayloadHoldings.date) &&
        Objects.equals(this.isSafeSecurity, modelCompositionPayloadHoldings.isSafeSecurity) &&
        Objects.equals(this.isInitialHolding, modelCompositionPayloadHoldings.isInitialHolding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, currentWeight, strategicWeight, date, isSafeSecurity, isInitialHolding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCompositionPayloadHoldings {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    currentWeight: ").append(toIndentedString(currentWeight)).append("\n");
    sb.append("    strategicWeight: ").append(toIndentedString(strategicWeight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isSafeSecurity: ").append(toIndentedString(isSafeSecurity)).append("\n");
    sb.append("    isInitialHolding: ").append(toIndentedString(isInitialHolding)).append("\n");
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

