/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

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
import org.threeten.bp.OffsetDateTime;

/**
 * RoundupCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class RoundupCO {
  @SerializedName("funding_start_date")
  private LocalDate fundingStartDate = null;

  @SerializedName("roundup_setting_id")
  private UUID roundupSettingId = null;

  @SerializedName("transaction_end_date")
  private OffsetDateTime transactionEndDate = null;

  @SerializedName("transaction_start_date")
  private OffsetDateTime transactionStartDate = null;

  @SerializedName("update_transactions")
  private Boolean updateTransactions = null;

  public RoundupCO fundingStartDate(LocalDate fundingStartDate) {
    this.fundingStartDate = fundingStartDate;
    return this;
  }

   /**
   * Get fundingStartDate
   * @return fundingStartDate
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getFundingStartDate() {
    return fundingStartDate;
  }

  public void setFundingStartDate(LocalDate fundingStartDate) {
    this.fundingStartDate = fundingStartDate;
  }

  public RoundupCO roundupSettingId(UUID roundupSettingId) {
    this.roundupSettingId = roundupSettingId;
    return this;
  }

   /**
   * Get roundupSettingId
   * @return roundupSettingId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getRoundupSettingId() {
    return roundupSettingId;
  }

  public void setRoundupSettingId(UUID roundupSettingId) {
    this.roundupSettingId = roundupSettingId;
  }

  public RoundupCO transactionEndDate(OffsetDateTime transactionEndDate) {
    this.transactionEndDate = transactionEndDate;
    return this;
  }

   /**
   * Get transactionEndDate
   * @return transactionEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTransactionEndDate() {
    return transactionEndDate;
  }

  public void setTransactionEndDate(OffsetDateTime transactionEndDate) {
    this.transactionEndDate = transactionEndDate;
  }

  public RoundupCO transactionStartDate(OffsetDateTime transactionStartDate) {
    this.transactionStartDate = transactionStartDate;
    return this;
  }

   /**
   * Get transactionStartDate
   * @return transactionStartDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTransactionStartDate() {
    return transactionStartDate;
  }

  public void setTransactionStartDate(OffsetDateTime transactionStartDate) {
    this.transactionStartDate = transactionStartDate;
  }

  public RoundupCO updateTransactions(Boolean updateTransactions) {
    this.updateTransactions = updateTransactions;
    return this;
  }

   /**
   * Get updateTransactions
   * @return updateTransactions
  **/
  @ApiModelProperty(value = "")
  public Boolean isUpdateTransactions() {
    return updateTransactions;
  }

  public void setUpdateTransactions(Boolean updateTransactions) {
    this.updateTransactions = updateTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoundupCO roundupCO = (RoundupCO) o;
    return Objects.equals(this.fundingStartDate, roundupCO.fundingStartDate) &&
        Objects.equals(this.roundupSettingId, roundupCO.roundupSettingId) &&
        Objects.equals(this.transactionEndDate, roundupCO.transactionEndDate) &&
        Objects.equals(this.transactionStartDate, roundupCO.transactionStartDate) &&
        Objects.equals(this.updateTransactions, roundupCO.updateTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingStartDate, roundupSettingId, transactionEndDate, transactionStartDate, updateTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoundupCO {\n");
    
    sb.append("    fundingStartDate: ").append(toIndentedString(fundingStartDate)).append("\n");
    sb.append("    roundupSettingId: ").append(toIndentedString(roundupSettingId)).append("\n");
    sb.append("    transactionEndDate: ").append(toIndentedString(transactionEndDate)).append("\n");
    sb.append("    transactionStartDate: ").append(toIndentedString(transactionStartDate)).append("\n");
    sb.append("    updateTransactions: ").append(toIndentedString(updateTransactions)).append("\n");
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

