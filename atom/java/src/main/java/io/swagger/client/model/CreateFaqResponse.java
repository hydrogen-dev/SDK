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
import io.swagger.client.model.FaqPayload;
import io.swagger.client.model.FaqPayloadFaqKeywords;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CreateFaqResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class CreateFaqResponse {
  @SerializedName("question")
  private String question = null;

  @SerializedName("answer")
  private String answer = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("seo_name")
  private String seoName = null;

  @SerializedName("faq_keywords")
  private List<FaqPayloadFaqKeywords> faqKeywords = null;

  @SerializedName("is_featured")
  private Boolean isFeatured = false;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateFaqResponse question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Value for the question in the FAQ
   * @return question
  **/
  @ApiModelProperty(required = true, value = "Value for the question in the FAQ")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public CreateFaqResponse answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Value for the answer to the question in the FAQ
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "Value for the answer to the question in the FAQ")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public CreateFaqResponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category that the FAQ falls under
   * @return category
  **/
  @ApiModelProperty(value = "Category that the FAQ falls under")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CreateFaqResponse subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Subcategory that the FAQ falls under within a category
   * @return subcategory
  **/
  @ApiModelProperty(value = "Subcategory that the FAQ falls under within a category")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public CreateFaqResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CreateFaqResponse number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number
   * @return number
  **/
  @ApiModelProperty(value = "Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public CreateFaqResponse seoName(String seoName) {
    this.seoName = seoName;
    return this;
  }

   /**
   * File name used to optimize finding the FAQ in a search engine query
   * @return seoName
  **/
  @ApiModelProperty(value = "File name used to optimize finding the FAQ in a search engine query")
  public String getSeoName() {
    return seoName;
  }

  public void setSeoName(String seoName) {
    this.seoName = seoName;
  }

  public CreateFaqResponse faqKeywords(List<FaqPayloadFaqKeywords> faqKeywords) {
    this.faqKeywords = faqKeywords;
    return this;
  }

  public CreateFaqResponse addFaqKeywordsItem(FaqPayloadFaqKeywords faqKeywordsItem) {
    if (this.faqKeywords == null) {
      this.faqKeywords = new ArrayList<FaqPayloadFaqKeywords>();
    }
    this.faqKeywords.add(faqKeywordsItem);
    return this;
  }

   /**
   * Get faqKeywords
   * @return faqKeywords
  **/
  @ApiModelProperty(value = "")
  public List<FaqPayloadFaqKeywords> getFaqKeywords() {
    return faqKeywords;
  }

  public void setFaqKeywords(List<FaqPayloadFaqKeywords> faqKeywords) {
    this.faqKeywords = faqKeywords;
  }

  public CreateFaqResponse isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured
   * @return isFeatured
  **/
  @ApiModelProperty(value = "Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured")
  public Boolean isIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CreateFaqResponse secondaryId(String secondaryId) {
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

  public CreateFaqResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the FAQ in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the FAQ in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateFaqResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the FAQ
   * @return id
  **/
  @ApiModelProperty(value = "ID of the FAQ")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateFaqResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the FAQ was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the FAQ was created")
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
    CreateFaqResponse createFaqResponse = (CreateFaqResponse) o;
    return Objects.equals(this.question, createFaqResponse.question) &&
        Objects.equals(this.answer, createFaqResponse.answer) &&
        Objects.equals(this.category, createFaqResponse.category) &&
        Objects.equals(this.subcategory, createFaqResponse.subcategory) &&
        Objects.equals(this.isActive, createFaqResponse.isActive) &&
        Objects.equals(this.number, createFaqResponse.number) &&
        Objects.equals(this.seoName, createFaqResponse.seoName) &&
        Objects.equals(this.faqKeywords, createFaqResponse.faqKeywords) &&
        Objects.equals(this.isFeatured, createFaqResponse.isFeatured) &&
        Objects.equals(this.secondaryId, createFaqResponse.secondaryId) &&
        Objects.equals(this.metadata, createFaqResponse.metadata) &&
        Objects.equals(this.id, createFaqResponse.id) &&
        Objects.equals(this.createDate, createFaqResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer, category, subcategory, isActive, number, seoName, faqKeywords, isFeatured, secondaryId, metadata, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFaqResponse {\n");
    
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    seoName: ").append(toIndentedString(seoName)).append("\n");
    sb.append("    faqKeywords: ").append(toIndentedString(faqKeywords)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

