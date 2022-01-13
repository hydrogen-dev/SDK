/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Funding Object
 */
@ApiModel(description = "Funding Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-07T05:31:28.153Z")
public class Funding {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("bank_link_id")
  private UUID bankLinkId = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("card_id")
  private UUID cardId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("frequency_unit")
  private String frequencyUnit = null;

  @SerializedName("funding_status")
  private String fundingStatus = null;

  @SerializedName("funding_type")
  private String fundingType = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_deposit")
  private Boolean isDeposit = null;

  @SerializedName("last_request_date")
  private LocalDate lastRequestDate = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("next_request_date")
  private LocalDate nextRequestDate = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("receiving_account_id")
  private UUID receivingAccountId = null;

  @SerializedName("receiving_bank_link_id")
  private UUID receivingBankLinkId = null;

  @SerializedName("receiving_portfolio_id")
  private UUID receivingPortfolioId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("support_ticket_id")
  private UUID supportTicketId = null;

  @SerializedName("threshold_amount")
  private Double thresholdAmount = null;

  @SerializedName("transfer_id")
  private UUID transferId = null;

  @SerializedName("transfer_speed")
  private String transferSpeed = null;

  @SerializedName("transfer_type")
  private String transferType = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Funding accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Funding amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", value = "amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Funding bankLinkId(UUID bankLinkId) {
    this.bankLinkId = bankLinkId;
    return this;
  }

   /**
   * bankLinkId
   * @return bankLinkId
  **/
  @ApiModelProperty(example = "02ec7d90-02fc-46c7-b201-def9b16ef65a", value = "bankLinkId")
  public UUID getBankLinkId() {
    return bankLinkId;
  }

  public void setBankLinkId(UUID bankLinkId) {
    this.bankLinkId = bankLinkId;
  }

  public Funding businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "8ac40bd2-84a7-4896-804d-b837ef1df5f5", value = "businessId")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public Funding cardId(UUID cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * cardId
   * @return cardId
  **/
  @ApiModelProperty(example = "8ac40bd2-84a7-4896-804d-b837ef1df5f5", value = "cardId")
  public UUID getCardId() {
    return cardId;
  }

  public void setCardId(UUID cardId) {
    this.cardId = cardId;
  }

  public Funding createDate(OffsetDateTime createDate) {
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

  public Funding currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Funding description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "Funding account", value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Funding endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-01-09", value = "endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Funding frequency(Integer frequency) {
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

  public Funding frequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * frequencyUnit
   * @return frequencyUnit
  **/
  @ApiModelProperty(example = "one_time", required = true, value = "frequencyUnit")
  public String getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(String frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public Funding fundingStatus(String fundingStatus) {
    this.fundingStatus = fundingStatus;
    return this;
  }

   /**
   * fundingStatus
   * @return fundingStatus
  **/
  @ApiModelProperty(example = "received", required = true, value = "fundingStatus")
  public String getFundingStatus() {
    return fundingStatus;
  }

  public void setFundingStatus(String fundingStatus) {
    this.fundingStatus = fundingStatus;
  }

  public Funding fundingType(String fundingType) {
    this.fundingType = fundingType;
    return this;
  }

   /**
   * fundingType
   * @return fundingType
  **/
  @ApiModelProperty(example = "bank_transfer", required = true, value = "fundingType")
  public String getFundingType() {
    return fundingType;
  }

  public void setFundingType(String fundingType) {
    this.fundingType = fundingType;
  }

  public Funding id(UUID id) {
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

  public Funding isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Funding isDeposit(Boolean isDeposit) {
    this.isDeposit = isDeposit;
    return this;
  }

   /**
   * isDeposit
   * @return isDeposit
  **/
  @ApiModelProperty(example = "true", required = true, value = "isDeposit")
  public Boolean isIsDeposit() {
    return isDeposit;
  }

  public void setIsDeposit(Boolean isDeposit) {
    this.isDeposit = isDeposit;
  }

  public Funding lastRequestDate(LocalDate lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
    return this;
  }

   /**
   * lastRequestDate
   * @return lastRequestDate
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", value = "lastRequestDate")
  public LocalDate getLastRequestDate() {
    return lastRequestDate;
  }

  public void setLastRequestDate(LocalDate lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
  }

  public Funding metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Funding putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Funding nextRequestDate(LocalDate nextRequestDate) {
    this.nextRequestDate = nextRequestDate;
    return this;
  }

   /**
   * nextRequestDate
   * @return nextRequestDate
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", value = "nextRequestDate")
  public LocalDate getNextRequestDate() {
    return nextRequestDate;
  }

  public void setNextRequestDate(LocalDate nextRequestDate) {
    this.nextRequestDate = nextRequestDate;
  }

  public Funding portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "ea30e8b7-3946-46ed-975a-4870a57d119s", value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public Funding receivingAccountId(UUID receivingAccountId) {
    this.receivingAccountId = receivingAccountId;
    return this;
  }

   /**
   * receivingAccountId
   * @return receivingAccountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "receivingAccountId")
  public UUID getReceivingAccountId() {
    return receivingAccountId;
  }

  public void setReceivingAccountId(UUID receivingAccountId) {
    this.receivingAccountId = receivingAccountId;
  }

  public Funding receivingBankLinkId(UUID receivingBankLinkId) {
    this.receivingBankLinkId = receivingBankLinkId;
    return this;
  }

   /**
   * receivingBankLinkId
   * @return receivingBankLinkId
  **/
  @ApiModelProperty(example = "02ec7d90-02fc-46c7-b201-def9b16ef65a", value = "receivingBankLinkId")
  public UUID getReceivingBankLinkId() {
    return receivingBankLinkId;
  }

  public void setReceivingBankLinkId(UUID receivingBankLinkId) {
    this.receivingBankLinkId = receivingBankLinkId;
  }

  public Funding receivingPortfolioId(UUID receivingPortfolioId) {
    this.receivingPortfolioId = receivingPortfolioId;
    return this;
  }

   /**
   * receivingPortfolioId
   * @return receivingPortfolioId
  **/
  @ApiModelProperty(example = "ea30e8b7-3946-46ed-975a-4870a57d119s", value = "receivingPortfolioId")
  public UUID getReceivingPortfolioId() {
    return receivingPortfolioId;
  }

  public void setReceivingPortfolioId(UUID receivingPortfolioId) {
    this.receivingPortfolioId = receivingPortfolioId;
  }

  public Funding secondaryId(String secondaryId) {
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

  public Funding startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-01-09", required = true, value = "startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Funding supportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
    return this;
  }

   /**
   * supportTicketId
   * @return supportTicketId
  **/
  @ApiModelProperty(example = "3551b26c-7080-4c4b-a8fc-9ce9360460ba", value = "supportTicketId")
  public UUID getSupportTicketId() {
    return supportTicketId;
  }

  public void setSupportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
  }

  public Funding thresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
    return this;
  }

   /**
   * thresholdAmount
   * @return thresholdAmount
  **/
  @ApiModelProperty(example = "100.0", value = "thresholdAmount")
  public Double getThresholdAmount() {
    return thresholdAmount;
  }

  public void setThresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }

  public Funding transferId(UUID transferId) {
    this.transferId = transferId;
    return this;
  }

   /**
   * transferId
   * @return transferId
  **/
  @ApiModelProperty(example = "8ac40bd2-84a7-4896-804d-b837ef1df5f5", value = "transferId")
  public UUID getTransferId() {
    return transferId;
  }

  public void setTransferId(UUID transferId) {
    this.transferId = transferId;
  }

  public Funding transferSpeed(String transferSpeed) {
    this.transferSpeed = transferSpeed;
    return this;
  }

   /**
   * transferSpeed
   * @return transferSpeed
  **/
  @ApiModelProperty(example = "standard", value = "transferSpeed")
  public String getTransferSpeed() {
    return transferSpeed;
  }

  public void setTransferSpeed(String transferSpeed) {
    this.transferSpeed = transferSpeed;
  }

  public Funding transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * transferType
   * @return transferType
  **/
  @ApiModelProperty(example = "push", value = "transferType")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public Funding updateDate(OffsetDateTime updateDate) {
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
    Funding funding = (Funding) o;
    return Objects.equals(this.accountId, funding.accountId) &&
        Objects.equals(this.amount, funding.amount) &&
        Objects.equals(this.bankLinkId, funding.bankLinkId) &&
        Objects.equals(this.businessId, funding.businessId) &&
        Objects.equals(this.cardId, funding.cardId) &&
        Objects.equals(this.createDate, funding.createDate) &&
        Objects.equals(this.currencyCode, funding.currencyCode) &&
        Objects.equals(this.description, funding.description) &&
        Objects.equals(this.endDate, funding.endDate) &&
        Objects.equals(this.frequency, funding.frequency) &&
        Objects.equals(this.frequencyUnit, funding.frequencyUnit) &&
        Objects.equals(this.fundingStatus, funding.fundingStatus) &&
        Objects.equals(this.fundingType, funding.fundingType) &&
        Objects.equals(this.id, funding.id) &&
        Objects.equals(this.isActive, funding.isActive) &&
        Objects.equals(this.isDeposit, funding.isDeposit) &&
        Objects.equals(this.lastRequestDate, funding.lastRequestDate) &&
        Objects.equals(this.metadata, funding.metadata) &&
        Objects.equals(this.nextRequestDate, funding.nextRequestDate) &&
        Objects.equals(this.portfolioId, funding.portfolioId) &&
        Objects.equals(this.receivingAccountId, funding.receivingAccountId) &&
        Objects.equals(this.receivingBankLinkId, funding.receivingBankLinkId) &&
        Objects.equals(this.receivingPortfolioId, funding.receivingPortfolioId) &&
        Objects.equals(this.secondaryId, funding.secondaryId) &&
        Objects.equals(this.startDate, funding.startDate) &&
        Objects.equals(this.supportTicketId, funding.supportTicketId) &&
        Objects.equals(this.thresholdAmount, funding.thresholdAmount) &&
        Objects.equals(this.transferId, funding.transferId) &&
        Objects.equals(this.transferSpeed, funding.transferSpeed) &&
        Objects.equals(this.transferType, funding.transferType) &&
        Objects.equals(this.updateDate, funding.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, bankLinkId, businessId, cardId, createDate, currencyCode, description, endDate, frequency, frequencyUnit, fundingStatus, fundingType, id, isActive, isDeposit, lastRequestDate, metadata, nextRequestDate, portfolioId, receivingAccountId, receivingBankLinkId, receivingPortfolioId, secondaryId, startDate, supportTicketId, thresholdAmount, transferId, transferSpeed, transferType, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Funding {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankLinkId: ").append(toIndentedString(bankLinkId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    fundingStatus: ").append(toIndentedString(fundingStatus)).append("\n");
    sb.append("    fundingType: ").append(toIndentedString(fundingType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDeposit: ").append(toIndentedString(isDeposit)).append("\n");
    sb.append("    lastRequestDate: ").append(toIndentedString(lastRequestDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nextRequestDate: ").append(toIndentedString(nextRequestDate)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    receivingAccountId: ").append(toIndentedString(receivingAccountId)).append("\n");
    sb.append("    receivingBankLinkId: ").append(toIndentedString(receivingBankLinkId)).append("\n");
    sb.append("    receivingPortfolioId: ").append(toIndentedString(receivingPortfolioId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    supportTicketId: ").append(toIndentedString(supportTicketId)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    transferSpeed: ").append(toIndentedString(transferSpeed)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

