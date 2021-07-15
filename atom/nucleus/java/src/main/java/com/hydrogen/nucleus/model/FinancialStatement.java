/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
import com.hydrogen.nucleus.model.Stat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * FinancialStatement Object
 */
@ApiModel(description = "FinancialStatement Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class FinancialStatement {
  @SerializedName("accounting_method")
  private String accountingMethod = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("period_length")
  private String periodLength = null;

  @SerializedName("period_month")
  private Integer periodMonth = null;

  @SerializedName("period_quarter")
  private Integer periodQuarter = null;

  @SerializedName("period_type")
  private String periodType = null;

  @SerializedName("period_year")
  private Integer periodYear = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("statement_date")
  private LocalDate statementDate = null;

  @SerializedName("statement_type")
  private String statementType = null;

  @SerializedName("stats")
  private List<Stat> stats = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public FinancialStatement accountingMethod(String accountingMethod) {
    this.accountingMethod = accountingMethod;
    return this;
  }

   /**
   * accounting_method
   * @return accountingMethod
  **/
  @ApiModelProperty(example = "cash", required = true, value = "accounting_method")
  public String getAccountingMethod() {
    return accountingMethod;
  }

  public void setAccountingMethod(String accountingMethod) {
    this.accountingMethod = accountingMethod;
  }

  public FinancialStatement businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "50d76212-0fcd-4d36-8633-e4a52cbcb79f", value = "businessId")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public FinancialStatement clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public FinancialStatement createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public FinancialStatement currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FinancialStatement id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FinancialStatement metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FinancialStatement putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public FinancialStatement periodLength(String periodLength) {
    this.periodLength = periodLength;
    return this;
  }

   /**
   * periodLength
   * @return periodLength
  **/
  @ApiModelProperty(example = "annual", value = "periodLength")
  public String getPeriodLength() {
    return periodLength;
  }

  public void setPeriodLength(String periodLength) {
    this.periodLength = periodLength;
  }

  public FinancialStatement periodMonth(Integer periodMonth) {
    this.periodMonth = periodMonth;
    return this;
  }

   /**
   * periodMonth
   * @return periodMonth
  **/
  @ApiModelProperty(example = "3", value = "periodMonth")
  public Integer getPeriodMonth() {
    return periodMonth;
  }

  public void setPeriodMonth(Integer periodMonth) {
    this.periodMonth = periodMonth;
  }

  public FinancialStatement periodQuarter(Integer periodQuarter) {
    this.periodQuarter = periodQuarter;
    return this;
  }

   /**
   * periodQuarter
   * @return periodQuarter
  **/
  @ApiModelProperty(example = "1", value = "periodQuarter")
  public Integer getPeriodQuarter() {
    return periodQuarter;
  }

  public void setPeriodQuarter(Integer periodQuarter) {
    this.periodQuarter = periodQuarter;
  }

  public FinancialStatement periodType(String periodType) {
    this.periodType = periodType;
    return this;
  }

   /**
   * periodType
   * @return periodType
  **/
  @ApiModelProperty(example = "calendar", value = "periodType")
  public String getPeriodType() {
    return periodType;
  }

  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }

  public FinancialStatement periodYear(Integer periodYear) {
    this.periodYear = periodYear;
    return this;
  }

   /**
   * periodYear
   * @return periodYear
  **/
  @ApiModelProperty(example = "2020", value = "periodYear")
  public Integer getPeriodYear() {
    return periodYear;
  }

  public void setPeriodYear(Integer periodYear) {
    this.periodYear = periodYear;
  }

  public FinancialStatement secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public FinancialStatement statementDate(LocalDate statementDate) {
    this.statementDate = statementDate;
    return this;
  }

   /**
   * statementDate
   * @return statementDate
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", required = true, value = "statementDate")
  public LocalDate getStatementDate() {
    return statementDate;
  }

  public void setStatementDate(LocalDate statementDate) {
    this.statementDate = statementDate;
  }

  public FinancialStatement statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   * statement_type
   * @return statementType
  **/
  @ApiModelProperty(example = "balance_sheet", required = true, value = "statement_type")
  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public FinancialStatement stats(List<Stat> stats) {
    this.stats = stats;
    return this;
  }

  public FinancialStatement addStatsItem(Stat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<Stat>();
    }
    this.stats.add(statsItem);
    return this;
  }

   /**
   * stats
   * @return stats
  **/
  @ApiModelProperty(example = "[]", value = "stats")
  public List<Stat> getStats() {
    return stats;
  }

  public void setStats(List<Stat> stats) {
    this.stats = stats;
  }

  public FinancialStatement updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialStatement financialStatement = (FinancialStatement) o;
    return Objects.equals(this.accountingMethod, financialStatement.accountingMethod) &&
        Objects.equals(this.businessId, financialStatement.businessId) &&
        Objects.equals(this.clientId, financialStatement.clientId) &&
        Objects.equals(this.createDate, financialStatement.createDate) &&
        Objects.equals(this.currencyCode, financialStatement.currencyCode) &&
        Objects.equals(this.id, financialStatement.id) &&
        Objects.equals(this.metadata, financialStatement.metadata) &&
        Objects.equals(this.periodLength, financialStatement.periodLength) &&
        Objects.equals(this.periodMonth, financialStatement.periodMonth) &&
        Objects.equals(this.periodQuarter, financialStatement.periodQuarter) &&
        Objects.equals(this.periodType, financialStatement.periodType) &&
        Objects.equals(this.periodYear, financialStatement.periodYear) &&
        Objects.equals(this.secondaryId, financialStatement.secondaryId) &&
        Objects.equals(this.statementDate, financialStatement.statementDate) &&
        Objects.equals(this.statementType, financialStatement.statementType) &&
        Objects.equals(this.stats, financialStatement.stats) &&
        Objects.equals(this.updateDate, financialStatement.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingMethod, businessId, clientId, createDate, currencyCode, id, metadata, periodLength, periodMonth, periodQuarter, periodType, periodYear, secondaryId, statementDate, statementType, stats, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialStatement {\n");
    
    sb.append("    accountingMethod: ").append(toIndentedString(accountingMethod)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
    sb.append("    periodMonth: ").append(toIndentedString(periodMonth)).append("\n");
    sb.append("    periodQuarter: ").append(toIndentedString(periodQuarter)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodYear: ").append(toIndentedString(periodYear)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

