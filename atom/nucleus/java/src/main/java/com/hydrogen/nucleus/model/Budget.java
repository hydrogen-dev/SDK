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
import com.hydrogen.nucleus.model.BudgetAggregationAccount;
import com.hydrogen.nucleus.model.BudgetObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Budget Object
 */
@ApiModel(description = "Budget Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Budget {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("aggregation_accounts")
  private List<BudgetAggregationAccount> aggregationAccounts = null;

  @SerializedName("budget")
  private List<BudgetObject> budget = null;

  @SerializedName("card_id")
  private UUID cardId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("frequency_unit")
  private String frequencyUnit = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("total_value")
  private Double totalValue = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Budget accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Budget aggregationAccounts(List<BudgetAggregationAccount> aggregationAccounts) {
    this.aggregationAccounts = aggregationAccounts;
    return this;
  }

  public Budget addAggregationAccountsItem(BudgetAggregationAccount aggregationAccountsItem) {
    if (this.aggregationAccounts == null) {
      this.aggregationAccounts = new ArrayList<BudgetAggregationAccount>();
    }
    this.aggregationAccounts.add(aggregationAccountsItem);
    return this;
  }

   /**
   * Get aggregationAccounts
   * @return aggregationAccounts
  **/
  @ApiModelProperty(example = "{}", value = "")
  public List<BudgetAggregationAccount> getAggregationAccounts() {
    return aggregationAccounts;
  }

  public void setAggregationAccounts(List<BudgetAggregationAccount> aggregationAccounts) {
    this.aggregationAccounts = aggregationAccounts;
  }

  public Budget budget(List<BudgetObject> budget) {
    this.budget = budget;
    return this;
  }

  public Budget addBudgetItem(BudgetObject budgetItem) {
    if (this.budget == null) {
      this.budget = new ArrayList<BudgetObject>();
    }
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @ApiModelProperty(value = "")
  public List<BudgetObject> getBudget() {
    return budget;
  }

  public void setBudget(List<BudgetObject> budget) {
    this.budget = budget;
  }

  public Budget cardId(UUID cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * cardId
   * @return cardId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "cardId")
  public UUID getCardId() {
    return cardId;
  }

  public void setCardId(UUID cardId) {
    this.cardId = cardId;
  }

  public Budget clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", required = true, value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Budget createDate(OffsetDateTime createDate) {
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

  public Budget currencyCode(String currencyCode) {
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

  public Budget endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-06-28", value = "endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Budget frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * frequency
   * @return frequency
  **/
  @ApiModelProperty(example = "1", value = "frequency")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Budget frequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * frequencyUnit
   * @return frequencyUnit
  **/
  @ApiModelProperty(example = "daily", required = true, value = "frequencyUnit")
  public String getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public Budget goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * goalId
   * @return goalId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "goalId")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public Budget id(UUID id) {
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

  public Budget isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * is_active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "is_active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Budget metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Budget putMetadataItem(String key, String metadataItem) {
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

  public Budget name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(example = "Name", required = true, value = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Budget secondaryId(String secondaryId) {
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

  public Budget startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-06-28", value = "startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Budget totalValue(Double totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * totalValue
   * @return totalValue
  **/
  @ApiModelProperty(example = "10000.0", value = "totalValue")
  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  public Budget updateDate(OffsetDateTime updateDate) {
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
    Budget budget = (Budget) o;
    return Objects.equals(this.accountId, budget.accountId) &&
        Objects.equals(this.aggregationAccounts, budget.aggregationAccounts) &&
        Objects.equals(this.budget, budget.budget) &&
        Objects.equals(this.cardId, budget.cardId) &&
        Objects.equals(this.clientId, budget.clientId) &&
        Objects.equals(this.createDate, budget.createDate) &&
        Objects.equals(this.currencyCode, budget.currencyCode) &&
        Objects.equals(this.endDate, budget.endDate) &&
        Objects.equals(this.frequency, budget.frequency) &&
        Objects.equals(this.frequencyUnit, budget.frequencyUnit) &&
        Objects.equals(this.goalId, budget.goalId) &&
        Objects.equals(this.id, budget.id) &&
        Objects.equals(this.isActive, budget.isActive) &&
        Objects.equals(this.metadata, budget.metadata) &&
        Objects.equals(this.name, budget.name) &&
        Objects.equals(this.secondaryId, budget.secondaryId) &&
        Objects.equals(this.startDate, budget.startDate) &&
        Objects.equals(this.totalValue, budget.totalValue) &&
        Objects.equals(this.updateDate, budget.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, aggregationAccounts, budget, cardId, clientId, createDate, currencyCode, endDate, frequency, frequencyUnit, goalId, id, isActive, metadata, name, secondaryId, startDate, totalValue, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Budget {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    aggregationAccounts: ").append(toIndentedString(aggregationAccounts)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

