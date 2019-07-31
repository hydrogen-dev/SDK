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

/**
 * FinancialOfferPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class FinancialOfferPayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("institution_name")
  private String institutionName = null;

  @SerializedName("offer_link")
  private String offerLink = null;

  /**
   * Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    CREDIT_CARD("credit_card"),
    
    SAVINGS("savings"),
    
    MORTGAGE("mortgage"),
    
    LOAN("loan"),
    
    INVESTMENT("investment"),
    
    TAX("tax"),
    
    REAL_ESTATE("real_estate"),
    
    BROKERAGE("brokerage"),
    
    OTHER("other");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("financial_rate")
  private Double financialRate = null;

  @SerializedName("financial_rate_type")
  private String financialRateType = null;

  @SerializedName("financial_rate_term")
  private Double financialRateTerm = null;

  /**
   * The term unit of the financial rate. Value may be year, quarter, month, week, day
   */
  @JsonAdapter(FinancialRateTermUnitEnum.Adapter.class)
  public enum FinancialRateTermUnitEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    FinancialRateTermUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinancialRateTermUnitEnum fromValue(String text) {
      for (FinancialRateTermUnitEnum b : FinancialRateTermUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FinancialRateTermUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinancialRateTermUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FinancialRateTermUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FinancialRateTermUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("financial_rate_term_unit")
  private FinancialRateTermUnitEnum financialRateTermUnit = null;

  @SerializedName("fee_amount")
  private Double feeAmount = null;

  @SerializedName("fee_type")
  private String feeType = null;

  @SerializedName("offer_term")
  private Double offerTerm = null;

  /**
   * The term unit of the offer term. Value may be year, quarter, month, week, day
   */
  @JsonAdapter(OfferTermUnitEnum.Adapter.class)
  public enum OfferTermUnitEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    OfferTermUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfferTermUnitEnum fromValue(String text) {
      for (OfferTermUnitEnum b : OfferTermUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OfferTermUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTermUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTermUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfferTermUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("offer_term_unit")
  private OfferTermUnitEnum offerTermUnit = null;

  @SerializedName("minimum_contribution")
  private Double minimumContribution = null;

  @SerializedName("minimum_contribution_term")
  private Double minimumContributionTerm = null;

  /**
   * The term unit of the minimum contribution. Value may be year, quarter, month, week, day
   */
  @JsonAdapter(MinimumContributionTermUnitEnum.Adapter.class)
  public enum MinimumContributionTermUnitEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    MinimumContributionTermUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MinimumContributionTermUnitEnum fromValue(String text) {
      for (MinimumContributionTermUnitEnum b : MinimumContributionTermUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MinimumContributionTermUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinimumContributionTermUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinimumContributionTermUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MinimumContributionTermUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("minimum_contribution_term_unit")
  private MinimumContributionTermUnitEnum minimumContributionTermUnit = null;

  @SerializedName("prerequisite")
  private String prerequisite = null;

  @SerializedName("prerequisite_type")
  private String prerequisiteType = null;

  @SerializedName("affiliate_rate")
  private Double affiliateRate = null;

  @SerializedName("client_review")
  private String clientReview = null;

  @SerializedName("rating")
  private String rating = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("campaign_id")
  private UUID campaignId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public FinancialOfferPayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the financial offer
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the financial offer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FinancialOfferPayload institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

   /**
   * Name of the financial institution
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "Name of the financial institution")
  public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public FinancialOfferPayload offerLink(String offerLink) {
    this.offerLink = offerLink;
    return this;
  }

   /**
   * Link to the associated financial offer
   * @return offerLink
  **/
  @ApiModelProperty(required = true, value = "Link to the associated financial offer")
  public String getOfferLink() {
    return offerLink;
  }

  public void setOfferLink(String offerLink) {
    this.offerLink = offerLink;
  }

  public FinancialOfferPayload category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other.
   * @return category
  **/
  @ApiModelProperty(value = "Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other.")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public FinancialOfferPayload subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Subcategory of the financial offer
   * @return subcategory
  **/
  @ApiModelProperty(value = "Subcategory of the financial offer")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public FinancialOfferPayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the financial offer
   * @return description
  **/
  @ApiModelProperty(value = "Description of the financial offer")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FinancialOfferPayload image(String image) {
    this.image = image;
    return this;
  }

   /**
   * An image associated with the financial offer
   * @return image
  **/
  @ApiModelProperty(value = "An image associated with the financial offer")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public FinancialOfferPayload currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Alphabetic currency code for the base currency of the entity, limited to 3 characters.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Alphabetic currency code for the base currency of the entity, limited to 3 characters.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FinancialOfferPayload financialRate(Double financialRate) {
    this.financialRate = financialRate;
    return this;
  }

   /**
   * The financial rate associated with the financial offer
   * @return financialRate
  **/
  @ApiModelProperty(value = "The financial rate associated with the financial offer")
  public Double getFinancialRate() {
    return financialRate;
  }

  public void setFinancialRate(Double financialRate) {
    this.financialRate = financialRate;
  }

  public FinancialOfferPayload financialRateType(String financialRateType) {
    this.financialRateType = financialRateType;
    return this;
  }

   /**
   * The financial rate type associated with the financial offer (i.e. percentage/ dollar amount)
   * @return financialRateType
  **/
  @ApiModelProperty(value = "The financial rate type associated with the financial offer (i.e. percentage/ dollar amount)")
  public String getFinancialRateType() {
    return financialRateType;
  }

  public void setFinancialRateType(String financialRateType) {
    this.financialRateType = financialRateType;
  }

  public FinancialOfferPayload financialRateTerm(Double financialRateTerm) {
    this.financialRateTerm = financialRateTerm;
    return this;
  }

   /**
   * The fixed time period of the financial rate associated with the financial offer (i.e. 90)
   * @return financialRateTerm
  **/
  @ApiModelProperty(value = "The fixed time period of the financial rate associated with the financial offer (i.e. 90)")
  public Double getFinancialRateTerm() {
    return financialRateTerm;
  }

  public void setFinancialRateTerm(Double financialRateTerm) {
    this.financialRateTerm = financialRateTerm;
  }

  public FinancialOfferPayload financialRateTermUnit(FinancialRateTermUnitEnum financialRateTermUnit) {
    this.financialRateTermUnit = financialRateTermUnit;
    return this;
  }

   /**
   * The term unit of the financial rate. Value may be year, quarter, month, week, day
   * @return financialRateTermUnit
  **/
  @ApiModelProperty(value = "The term unit of the financial rate. Value may be year, quarter, month, week, day")
  public FinancialRateTermUnitEnum getFinancialRateTermUnit() {
    return financialRateTermUnit;
  }

  public void setFinancialRateTermUnit(FinancialRateTermUnitEnum financialRateTermUnit) {
    this.financialRateTermUnit = financialRateTermUnit;
  }

  public FinancialOfferPayload feeAmount(Double feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Amount of the financial offer fee
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Amount of the financial offer fee")
  public Double getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(Double feeAmount) {
    this.feeAmount = feeAmount;
  }

  public FinancialOfferPayload feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Type of financial offer fee
   * @return feeType
  **/
  @ApiModelProperty(value = "Type of financial offer fee")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public FinancialOfferPayload offerTerm(Double offerTerm) {
    this.offerTerm = offerTerm;
    return this;
  }

   /**
   * The fixed time period for which the offer is intended to last, once it is accepted
   * @return offerTerm
  **/
  @ApiModelProperty(value = "The fixed time period for which the offer is intended to last, once it is accepted")
  public Double getOfferTerm() {
    return offerTerm;
  }

  public void setOfferTerm(Double offerTerm) {
    this.offerTerm = offerTerm;
  }

  public FinancialOfferPayload offerTermUnit(OfferTermUnitEnum offerTermUnit) {
    this.offerTermUnit = offerTermUnit;
    return this;
  }

   /**
   * The term unit of the offer term. Value may be year, quarter, month, week, day
   * @return offerTermUnit
  **/
  @ApiModelProperty(value = "The term unit of the offer term. Value may be year, quarter, month, week, day")
  public OfferTermUnitEnum getOfferTermUnit() {
    return offerTermUnit;
  }

  public void setOfferTermUnit(OfferTermUnitEnum offerTermUnit) {
    this.offerTermUnit = offerTermUnit;
  }

  public FinancialOfferPayload minimumContribution(Double minimumContribution) {
    this.minimumContribution = minimumContribution;
    return this;
  }

   /**
   * The minimum contribution amount in order to receive the financial_incentive associated with the financial offer
   * @return minimumContribution
  **/
  @ApiModelProperty(value = "The minimum contribution amount in order to receive the financial_incentive associated with the financial offer")
  public Double getMinimumContribution() {
    return minimumContribution;
  }

  public void setMinimumContribution(Double minimumContribution) {
    this.minimumContribution = minimumContribution;
  }

  public FinancialOfferPayload minimumContributionTerm(Double minimumContributionTerm) {
    this.minimumContributionTerm = minimumContributionTerm;
    return this;
  }

   /**
   * The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90)
   * @return minimumContributionTerm
  **/
  @ApiModelProperty(value = "The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90)")
  public Double getMinimumContributionTerm() {
    return minimumContributionTerm;
  }

  public void setMinimumContributionTerm(Double minimumContributionTerm) {
    this.minimumContributionTerm = minimumContributionTerm;
  }

  public FinancialOfferPayload minimumContributionTermUnit(MinimumContributionTermUnitEnum minimumContributionTermUnit) {
    this.minimumContributionTermUnit = minimumContributionTermUnit;
    return this;
  }

   /**
   * The term unit of the minimum contribution. Value may be year, quarter, month, week, day
   * @return minimumContributionTermUnit
  **/
  @ApiModelProperty(value = "The term unit of the minimum contribution. Value may be year, quarter, month, week, day")
  public MinimumContributionTermUnitEnum getMinimumContributionTermUnit() {
    return minimumContributionTermUnit;
  }

  public void setMinimumContributionTermUnit(MinimumContributionTermUnitEnum minimumContributionTermUnit) {
    this.minimumContributionTermUnit = minimumContributionTermUnit;
  }

  public FinancialOfferPayload prerequisite(String prerequisite) {
    this.prerequisite = prerequisite;
    return this;
  }

   /**
   * Prerequisite associated with the financial offer
   * @return prerequisite
  **/
  @ApiModelProperty(value = "Prerequisite associated with the financial offer")
  public String getPrerequisite() {
    return prerequisite;
  }

  public void setPrerequisite(String prerequisite) {
    this.prerequisite = prerequisite;
  }

  public FinancialOfferPayload prerequisiteType(String prerequisiteType) {
    this.prerequisiteType = prerequisiteType;
    return this;
  }

   /**
   * Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold)
   * @return prerequisiteType
  **/
  @ApiModelProperty(value = "Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold)")
  public String getPrerequisiteType() {
    return prerequisiteType;
  }

  public void setPrerequisiteType(String prerequisiteType) {
    this.prerequisiteType = prerequisiteType;
  }

  public FinancialOfferPayload affiliateRate(Double affiliateRate) {
    this.affiliateRate = affiliateRate;
    return this;
  }

   /**
   * The payment value which will be received from the affiliate when the user purchases the offer
   * @return affiliateRate
  **/
  @ApiModelProperty(value = "The payment value which will be received from the affiliate when the user purchases the offer")
  public Double getAffiliateRate() {
    return affiliateRate;
  }

  public void setAffiliateRate(Double affiliateRate) {
    this.affiliateRate = affiliateRate;
  }

  public FinancialOfferPayload clientReview(String clientReview) {
    this.clientReview = clientReview;
    return this;
  }

   /**
   * Average of client reviews of the product
   * @return clientReview
  **/
  @ApiModelProperty(value = "Average of client reviews of the product")
  public String getClientReview() {
    return clientReview;
  }

  public void setClientReview(String clientReview) {
    this.clientReview = clientReview;
  }

  public FinancialOfferPayload rating(String rating) {
    this.rating = rating;
    return this;
  }

   /**
   * The rating of the product by the site displaying the offer
   * @return rating
  **/
  @ApiModelProperty(value = "The rating of the product by the site displaying the offer")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public FinancialOfferPayload documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Unique ID of the document associated with the financial offer
   * @return documentId
  **/
  @ApiModelProperty(value = "Unique ID of the document associated with the financial offer")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public FinancialOfferPayload campaignId(UUID campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Unique ID of the marketing campaign associated with the financial offer
   * @return campaignId
  **/
  @ApiModelProperty(value = "Unique ID of the marketing campaign associated with the financial offer")
  public UUID getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(UUID campaignId) {
    this.campaignId = campaignId;
  }

  public FinancialOfferPayload metadata(Object metadata) {
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

  public FinancialOfferPayload secondaryId(String secondaryId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialOfferPayload financialOfferPayload = (FinancialOfferPayload) o;
    return Objects.equals(this.name, financialOfferPayload.name) &&
        Objects.equals(this.institutionName, financialOfferPayload.institutionName) &&
        Objects.equals(this.offerLink, financialOfferPayload.offerLink) &&
        Objects.equals(this.category, financialOfferPayload.category) &&
        Objects.equals(this.subcategory, financialOfferPayload.subcategory) &&
        Objects.equals(this.description, financialOfferPayload.description) &&
        Objects.equals(this.image, financialOfferPayload.image) &&
        Objects.equals(this.currencyCode, financialOfferPayload.currencyCode) &&
        Objects.equals(this.financialRate, financialOfferPayload.financialRate) &&
        Objects.equals(this.financialRateType, financialOfferPayload.financialRateType) &&
        Objects.equals(this.financialRateTerm, financialOfferPayload.financialRateTerm) &&
        Objects.equals(this.financialRateTermUnit, financialOfferPayload.financialRateTermUnit) &&
        Objects.equals(this.feeAmount, financialOfferPayload.feeAmount) &&
        Objects.equals(this.feeType, financialOfferPayload.feeType) &&
        Objects.equals(this.offerTerm, financialOfferPayload.offerTerm) &&
        Objects.equals(this.offerTermUnit, financialOfferPayload.offerTermUnit) &&
        Objects.equals(this.minimumContribution, financialOfferPayload.minimumContribution) &&
        Objects.equals(this.minimumContributionTerm, financialOfferPayload.minimumContributionTerm) &&
        Objects.equals(this.minimumContributionTermUnit, financialOfferPayload.minimumContributionTermUnit) &&
        Objects.equals(this.prerequisite, financialOfferPayload.prerequisite) &&
        Objects.equals(this.prerequisiteType, financialOfferPayload.prerequisiteType) &&
        Objects.equals(this.affiliateRate, financialOfferPayload.affiliateRate) &&
        Objects.equals(this.clientReview, financialOfferPayload.clientReview) &&
        Objects.equals(this.rating, financialOfferPayload.rating) &&
        Objects.equals(this.documentId, financialOfferPayload.documentId) &&
        Objects.equals(this.campaignId, financialOfferPayload.campaignId) &&
        Objects.equals(this.metadata, financialOfferPayload.metadata) &&
        Objects.equals(this.secondaryId, financialOfferPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, institutionName, offerLink, category, subcategory, description, image, currencyCode, financialRate, financialRateType, financialRateTerm, financialRateTermUnit, feeAmount, feeType, offerTerm, offerTermUnit, minimumContribution, minimumContributionTerm, minimumContributionTermUnit, prerequisite, prerequisiteType, affiliateRate, clientReview, rating, documentId, campaignId, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialOfferPayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    offerLink: ").append(toIndentedString(offerLink)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    financialRate: ").append(toIndentedString(financialRate)).append("\n");
    sb.append("    financialRateType: ").append(toIndentedString(financialRateType)).append("\n");
    sb.append("    financialRateTerm: ").append(toIndentedString(financialRateTerm)).append("\n");
    sb.append("    financialRateTermUnit: ").append(toIndentedString(financialRateTermUnit)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    offerTerm: ").append(toIndentedString(offerTerm)).append("\n");
    sb.append("    offerTermUnit: ").append(toIndentedString(offerTermUnit)).append("\n");
    sb.append("    minimumContribution: ").append(toIndentedString(minimumContribution)).append("\n");
    sb.append("    minimumContributionTerm: ").append(toIndentedString(minimumContributionTerm)).append("\n");
    sb.append("    minimumContributionTermUnit: ").append(toIndentedString(minimumContributionTermUnit)).append("\n");
    sb.append("    prerequisite: ").append(toIndentedString(prerequisite)).append("\n");
    sb.append("    prerequisiteType: ").append(toIndentedString(prerequisiteType)).append("\n");
    sb.append("    affiliateRate: ").append(toIndentedString(affiliateRate)).append("\n");
    sb.append("    clientReview: ").append(toIndentedString(clientReview)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

