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
import io.swagger.client.model.CreateFundingRequestResponse;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * SpecificFundingRequestResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class SpecificFundingRequestResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  /**
   * The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other
   */
  @JsonAdapter(FundingTypeEnum.Adapter.class)
  public enum FundingTypeEnum {
    BANK_TRANSFER("bank_transfer"),
    
    WIRE_TRANSFER("wire_transfer"),
    
    CASH("cash"),
    
    DEBIT_CARD("debit_card"),
    
    CREDIT_CARD("credit_card"),
    
    CHECK("check"),
    
    STOCK_CERTIFICATE("stock_certificate"),
    
    DIGITAL_WALLET("digital_wallet"),
    
    MONEY_ORDER("money_order"),
    
    ACCOUNT_TRANSFER("account_transfer"),
    
    OTHER("other");

    private String value;

    FundingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundingTypeEnum fromValue(String text) {
      for (FundingTypeEnum b : FundingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FundingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FundingTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("funding_type")
  private FundingTypeEnum fundingType = null;

  /**
   * Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request
   */
  @JsonAdapter(FundingStatusEnum.Adapter.class)
  public enum FundingStatusEnum {
    RECEIVED("request_received"),
    
    INITIATED("request_initiated"),
    
    CANCELLED("request_cancelled"),
    
    COMPLETED("request_completed");

    private String value;

    FundingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundingStatusEnum fromValue(String text) {
      for (FundingStatusEnum b : FundingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FundingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FundingStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("funding_status")
  private FundingStatusEnum fundingStatus = null;

  /**
   * Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually
   */
  @JsonAdapter(FrequencyUnitEnum.Adapter.class)
  public enum FrequencyUnitEnum {
    ONE_TIME("one_time"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
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

  @SerializedName("is_deposit")
  private Boolean isDeposit = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("bank_link_id")
  private UUID bankLinkId = null;

  @SerializedName("transfer_id")
  private UUID transferId = null;

  @SerializedName("support_ticket_id")
  private UUID supportTicketId = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificFundingRequestResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the funding request
   * @return id
  **/
  @ApiModelProperty(value = "ID of the funding request")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificFundingRequestResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the funding request was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the funding request was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificFundingRequestResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID for the account that will be receiving the funding request
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID for the account that will be receiving the funding request")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public SpecificFundingRequestResponse fundingType(FundingTypeEnum fundingType) {
    this.fundingType = fundingType;
    return this;
  }

   /**
   * The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other
   * @return fundingType
  **/
  @ApiModelProperty(required = true, value = "The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other")
  public FundingTypeEnum getFundingType() {
    return fundingType;
  }

  public void setFundingType(FundingTypeEnum fundingType) {
    this.fundingType = fundingType;
  }

  public SpecificFundingRequestResponse fundingStatus(FundingStatusEnum fundingStatus) {
    this.fundingStatus = fundingStatus;
    return this;
  }

   /**
   * Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request
   * @return fundingStatus
  **/
  @ApiModelProperty(required = true, value = "Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request")
  public FundingStatusEnum getFundingStatus() {
    return fundingStatus;
  }

  public void setFundingStatus(FundingStatusEnum fundingStatus) {
    this.fundingStatus = fundingStatus;
  }

  public SpecificFundingRequestResponse frequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually
   * @return frequencyUnit
  **/
  @ApiModelProperty(required = true, value = "Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually")
  public FrequencyUnitEnum getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public SpecificFundingRequestResponse isDeposit(Boolean isDeposit) {
    this.isDeposit = isDeposit;
    return this;
  }

   /**
   * Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal
   * @return isDeposit
  **/
  @ApiModelProperty(required = true, value = "Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal")
  public Boolean isIsDeposit() {
    return isDeposit;
  }

  public void setIsDeposit(Boolean isDeposit) {
    this.isDeposit = isDeposit;
  }

  public SpecificFundingRequestResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date that the funding request should start
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The date that the funding request should start")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public SpecificFundingRequestResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * In the case that the funding request is recurring, the date that the funding request should stop occurring
   * @return endDate
  **/
  @ApiModelProperty(value = "In the case that the funding request is recurring, the date that the funding request should stop occurring")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SpecificFundingRequestResponse frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1
   * @return frequency
  **/
  @ApiModelProperty(value = "Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public SpecificFundingRequestResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the request, such as “Initial Funding”
   * @return description
  **/
  @ApiModelProperty(value = "Description for the request, such as “Initial Funding”")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SpecificFundingRequestResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount that is included in the funding request
   * @return amount
  **/
  @ApiModelProperty(value = "Amount that is included in the funding request")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SpecificFundingRequestResponse bankLinkId(UUID bankLinkId) {
    this.bankLinkId = bankLinkId;
    return this;
  }

   /**
   * In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request
   * @return bankLinkId
  **/
  @ApiModelProperty(value = "In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request")
  public UUID getBankLinkId() {
    return bankLinkId;
  }

  public void setBankLinkId(UUID bankLinkId) {
    this.bankLinkId = bankLinkId;
  }

  public SpecificFundingRequestResponse transferId(UUID transferId) {
    this.transferId = transferId;
    return this;
  }

   /**
   * In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer
   * @return transferId
  **/
  @ApiModelProperty(value = "In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer")
  public UUID getTransferId() {
    return transferId;
  }

  public void setTransferId(UUID transferId) {
    this.transferId = transferId;
  }

  public SpecificFundingRequestResponse supportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
    return this;
  }

   /**
   * In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket
   * @return supportTicketId
  **/
  @ApiModelProperty(value = "In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket")
  public UUID getSupportTicketId() {
    return supportTicketId;
  }

  public void setSupportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
  }

  public SpecificFundingRequestResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the funding request is currently active. Defaults to true which indicates it is active.
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the funding request is currently active. Defaults to true which indicates it is active.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SpecificFundingRequestResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the funding request in the format key:value.
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the funding request in the format key:value.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public SpecificFundingRequestResponse secondaryId(String secondaryId) {
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

  public SpecificFundingRequestResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the funding request was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the funding request was last updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificFundingRequestResponse specificFundingRequestResponse = (SpecificFundingRequestResponse) o;
    return Objects.equals(this.id, specificFundingRequestResponse.id) &&
        Objects.equals(this.createDate, specificFundingRequestResponse.createDate) &&
        Objects.equals(this.accountId, specificFundingRequestResponse.accountId) &&
        Objects.equals(this.fundingType, specificFundingRequestResponse.fundingType) &&
        Objects.equals(this.fundingStatus, specificFundingRequestResponse.fundingStatus) &&
        Objects.equals(this.frequencyUnit, specificFundingRequestResponse.frequencyUnit) &&
        Objects.equals(this.isDeposit, specificFundingRequestResponse.isDeposit) &&
        Objects.equals(this.startDate, specificFundingRequestResponse.startDate) &&
        Objects.equals(this.endDate, specificFundingRequestResponse.endDate) &&
        Objects.equals(this.frequency, specificFundingRequestResponse.frequency) &&
        Objects.equals(this.description, specificFundingRequestResponse.description) &&
        Objects.equals(this.amount, specificFundingRequestResponse.amount) &&
        Objects.equals(this.bankLinkId, specificFundingRequestResponse.bankLinkId) &&
        Objects.equals(this.transferId, specificFundingRequestResponse.transferId) &&
        Objects.equals(this.supportTicketId, specificFundingRequestResponse.supportTicketId) &&
        Objects.equals(this.isActive, specificFundingRequestResponse.isActive) &&
        Objects.equals(this.metadata, specificFundingRequestResponse.metadata) &&
        Objects.equals(this.secondaryId, specificFundingRequestResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificFundingRequestResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, accountId, fundingType, fundingStatus, frequencyUnit, isDeposit, startDate, endDate, frequency, description, amount, bankLinkId, transferId, supportTicketId, isActive, metadata, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificFundingRequestResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundingType: ").append(toIndentedString(fundingType)).append("\n");
    sb.append("    fundingStatus: ").append(toIndentedString(fundingStatus)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    isDeposit: ").append(toIndentedString(isDeposit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankLinkId: ").append(toIndentedString(bankLinkId)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    supportTicketId: ").append(toIndentedString(supportTicketId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

