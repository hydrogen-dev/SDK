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
import io.swagger.client.model.BudgetPayload;
import io.swagger.client.model.BudgetPayloadBudget;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateBudgetResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class CreateBudgetResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("budget")
  private List<BudgetPayloadBudget> budget = new ArrayList<BudgetPayloadBudget>();

  /**
   * Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually
   */
  @JsonAdapter(FrequencyUnitEnum.Adapter.class)
  public enum FrequencyUnitEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    BI_WEEKLY("bi-weekly"),
    
    MONTHLY("monthly"),
    
    SEMI_MONTHLY("semi-monthly"),
    
    QUARTERLY("quarterly"),
    
    ANNUALLY("annually");

    private String value;

    FrequencyUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyUnitEnum fromValue(String text) {
      for (FrequencyUnitEnum b : FrequencyUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency_unit")
  private FrequencyUnitEnum frequencyUnit = null;

  @SerializedName("frequency")
  private BigDecimal frequency = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end date")
  private LocalDate endDate = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateBudgetResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the budget
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the budget")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateBudgetResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client the budget belongs to
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the client the budget belongs to")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public CreateBudgetResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Alphabetic currency code for the base currency of the budget, limited to 3 characters.
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "Alphabetic currency code for the base currency of the budget, limited to 3 characters.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CreateBudgetResponse budget(List<BudgetPayloadBudget> budget) {
    this.budget = budget;
    return this;
  }

  public CreateBudgetResponse addBudgetItem(BudgetPayloadBudget budgetItem) {
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BudgetPayloadBudget> getBudget() {
    return budget;
  }

  public void setBudget(List<BudgetPayloadBudget> budget) {
    this.budget = budget;
  }

  public CreateBudgetResponse frequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually
   * @return frequencyUnit
  **/
  @ApiModelProperty(required = true, value = "Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually")
  public FrequencyUnitEnum getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public CreateBudgetResponse frequency(BigDecimal frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1
   * @return frequency
  **/
  @ApiModelProperty(value = "Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1")
  public BigDecimal getFrequency() {
    return frequency;
  }

  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }

  public CreateBudgetResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account the budget belongs to
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the account the budget belongs to")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public CreateBudgetResponse goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * The ID of a goal mapped to the budget
   * @return goalId
  **/
  @ApiModelProperty(value = "The ID of a goal mapped to the budget")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public CreateBudgetResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the budget
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date for the budget")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CreateBudgetResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the budget
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date for the budget")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CreateBudgetResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the budget in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the budget in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateBudgetResponse secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public CreateBudgetResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the budget
   * @return id
  **/
  @ApiModelProperty(value = "ID of the budget")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateBudgetResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the budget was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the budget was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBudgetResponse createBudgetResponse = (CreateBudgetResponse) o;
    return Objects.equals(this.name, createBudgetResponse.name) &&
        Objects.equals(this.clientId, createBudgetResponse.clientId) &&
        Objects.equals(this.currencyCode, createBudgetResponse.currencyCode) &&
        Objects.equals(this.budget, createBudgetResponse.budget) &&
        Objects.equals(this.frequencyUnit, createBudgetResponse.frequencyUnit) &&
        Objects.equals(this.frequency, createBudgetResponse.frequency) &&
        Objects.equals(this.accountId, createBudgetResponse.accountId) &&
        Objects.equals(this.goalId, createBudgetResponse.goalId) &&
        Objects.equals(this.startDate, createBudgetResponse.startDate) &&
        Objects.equals(this.endDate, createBudgetResponse.endDate) &&
        Objects.equals(this.metadata, createBudgetResponse.metadata) &&
        Objects.equals(this.secondaryId, createBudgetResponse.secondaryId) &&
        Objects.equals(this.id, createBudgetResponse.id) &&
        Objects.equals(this.createDate, createBudgetResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clientId, currencyCode, budget, frequencyUnit, frequency, accountId, goalId, startDate, endDate, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBudgetResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

