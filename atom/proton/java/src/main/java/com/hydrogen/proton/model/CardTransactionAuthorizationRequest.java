/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * CardTransactionAuthorizationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-28T09:20:08.129Z")
public class CardTransactionAuthorizationRequest {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("memo")
  private String memo = "null";

  @SerializedName("partial_auth")
  private Boolean partialAuth = false;

  /**
   * Gets or Sets transactionType
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    ATM_WITHDRAWAL("atm_withdrawal"),
    
    PURCHASE("purchase"),
    
    OTHER("other");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String text) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transaction_type")
  private TransactionTypeEnum transactionType = null;

  @SerializedName("description")
  private String description = "null";

  @SerializedName("transaction_category_id")
  private UUID transactionCategoryId = null;

  @SerializedName("use_audit_log")
  private Boolean useAuditLog = false;

  @SerializedName("merchant_category_code")
  private Integer merchantCategoryCode = null;

  @SerializedName("card_id")
  private UUID cardId = null;

  @SerializedName("transaction_category")
  private String transactionCategory = "null";

  @SerializedName("cleanse_data")
  private Boolean cleanseData = false;

  /**
   * Gets or Sets authType
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    SPENDING_CONTROL("spending_control");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("auth_type")
  private List<AuthTypeEnum> authType = null;

  @SerializedName("mid")
  private String mid = "null";

  @SerializedName("transaction_status_scope")
  private List<String> transactionStatusScope = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("merchant")
  private String merchant = "null";

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("merchant_id")
  private UUID merchantId = null;

  public CardTransactionAuthorizationRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CardTransactionAuthorizationRequest memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public CardTransactionAuthorizationRequest partialAuth(Boolean partialAuth) {
    this.partialAuth = partialAuth;
    return this;
  }

   /**
   * Get partialAuth
   * @return partialAuth
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartialAuth() {
    return partialAuth;
  }

  public void setPartialAuth(Boolean partialAuth) {
    this.partialAuth = partialAuth;
  }

  public CardTransactionAuthorizationRequest transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public CardTransactionAuthorizationRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CardTransactionAuthorizationRequest transactionCategoryId(UUID transactionCategoryId) {
    this.transactionCategoryId = transactionCategoryId;
    return this;
  }

   /**
   * Get transactionCategoryId
   * @return transactionCategoryId
  **/
  @ApiModelProperty(value = "")
  public UUID getTransactionCategoryId() {
    return transactionCategoryId;
  }

  public void setTransactionCategoryId(UUID transactionCategoryId) {
    this.transactionCategoryId = transactionCategoryId;
  }

  public CardTransactionAuthorizationRequest useAuditLog(Boolean useAuditLog) {
    this.useAuditLog = useAuditLog;
    return this;
  }

   /**
   * Get useAuditLog
   * @return useAuditLog
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseAuditLog() {
    return useAuditLog;
  }

  public void setUseAuditLog(Boolean useAuditLog) {
    this.useAuditLog = useAuditLog;
  }

  public CardTransactionAuthorizationRequest merchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "")
  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public CardTransactionAuthorizationRequest cardId(UUID cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getCardId() {
    return cardId;
  }

  public void setCardId(UUID cardId) {
    this.cardId = cardId;
  }

  public CardTransactionAuthorizationRequest transactionCategory(String transactionCategory) {
    this.transactionCategory = transactionCategory;
    return this;
  }

   /**
   * Get transactionCategory
   * @return transactionCategory
  **/
  @ApiModelProperty(value = "")
  public String getTransactionCategory() {
    return transactionCategory;
  }

  public void setTransactionCategory(String transactionCategory) {
    this.transactionCategory = transactionCategory;
  }

  public CardTransactionAuthorizationRequest cleanseData(Boolean cleanseData) {
    this.cleanseData = cleanseData;
    return this;
  }

   /**
   * Get cleanseData
   * @return cleanseData
  **/
  @ApiModelProperty(value = "")
  public Boolean isCleanseData() {
    return cleanseData;
  }

  public void setCleanseData(Boolean cleanseData) {
    this.cleanseData = cleanseData;
  }

  public CardTransactionAuthorizationRequest authType(List<AuthTypeEnum> authType) {
    this.authType = authType;
    return this;
  }

  public CardTransactionAuthorizationRequest addAuthTypeItem(AuthTypeEnum authTypeItem) {
    if (this.authType == null) {
      this.authType = new ArrayList<AuthTypeEnum>();
    }
    this.authType.add(authTypeItem);
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @ApiModelProperty(value = "")
  public List<AuthTypeEnum> getAuthType() {
    return authType;
  }

  public void setAuthType(List<AuthTypeEnum> authType) {
    this.authType = authType;
  }

  public CardTransactionAuthorizationRequest mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(value = "")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public CardTransactionAuthorizationRequest transactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
    return this;
  }

  public CardTransactionAuthorizationRequest addTransactionStatusScopeItem(String transactionStatusScopeItem) {
    if (this.transactionStatusScope == null) {
      this.transactionStatusScope = new ArrayList<String>();
    }
    this.transactionStatusScope.add(transactionStatusScopeItem);
    return this;
  }

   /**
   * Get transactionStatusScope
   * @return transactionStatusScope
  **/
  @ApiModelProperty(value = "")
  public List<String> getTransactionStatusScope() {
    return transactionStatusScope;
  }

  public void setTransactionStatusScope(List<String> transactionStatusScope) {
    this.transactionStatusScope = transactionStatusScope;
  }

  public CardTransactionAuthorizationRequest location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public CardTransactionAuthorizationRequest merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(value = "")
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public CardTransactionAuthorizationRequest amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public CardTransactionAuthorizationRequest date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public CardTransactionAuthorizationRequest merchantId(UUID merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public UUID getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(UUID merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTransactionAuthorizationRequest cardTransactionAuthorizationRequest = (CardTransactionAuthorizationRequest) o;
    return Objects.equals(this.currencyCode, cardTransactionAuthorizationRequest.currencyCode) &&
        Objects.equals(this.memo, cardTransactionAuthorizationRequest.memo) &&
        Objects.equals(this.partialAuth, cardTransactionAuthorizationRequest.partialAuth) &&
        Objects.equals(this.transactionType, cardTransactionAuthorizationRequest.transactionType) &&
        Objects.equals(this.description, cardTransactionAuthorizationRequest.description) &&
        Objects.equals(this.transactionCategoryId, cardTransactionAuthorizationRequest.transactionCategoryId) &&
        Objects.equals(this.useAuditLog, cardTransactionAuthorizationRequest.useAuditLog) &&
        Objects.equals(this.merchantCategoryCode, cardTransactionAuthorizationRequest.merchantCategoryCode) &&
        Objects.equals(this.cardId, cardTransactionAuthorizationRequest.cardId) &&
        Objects.equals(this.transactionCategory, cardTransactionAuthorizationRequest.transactionCategory) &&
        Objects.equals(this.cleanseData, cardTransactionAuthorizationRequest.cleanseData) &&
        Objects.equals(this.authType, cardTransactionAuthorizationRequest.authType) &&
        Objects.equals(this.mid, cardTransactionAuthorizationRequest.mid) &&
        Objects.equals(this.transactionStatusScope, cardTransactionAuthorizationRequest.transactionStatusScope) &&
        Objects.equals(this.location, cardTransactionAuthorizationRequest.location) &&
        Objects.equals(this.merchant, cardTransactionAuthorizationRequest.merchant) &&
        Objects.equals(this.amount, cardTransactionAuthorizationRequest.amount) &&
        Objects.equals(this.date, cardTransactionAuthorizationRequest.date) &&
        Objects.equals(this.merchantId, cardTransactionAuthorizationRequest.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, memo, partialAuth, transactionType, description, transactionCategoryId, useAuditLog, merchantCategoryCode, cardId, transactionCategory, cleanseData, authType, mid, transactionStatusScope, location, merchant, amount, date, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTransactionAuthorizationRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    partialAuth: ").append(toIndentedString(partialAuth)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionCategoryId: ").append(toIndentedString(transactionCategoryId)).append("\n");
    sb.append("    useAuditLog: ").append(toIndentedString(useAuditLog)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    transactionCategory: ").append(toIndentedString(transactionCategory)).append("\n");
    sb.append("    cleanseData: ").append(toIndentedString(cleanseData)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    transactionStatusScope: ").append(toIndentedString(transactionStatusScope)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

