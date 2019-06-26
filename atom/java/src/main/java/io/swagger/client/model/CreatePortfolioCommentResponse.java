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
import io.swagger.client.model.PortfolioCommentPayload;
import java.io.IOException;
import java.util.UUID;

/**
 * CreatePortfolioCommentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class CreatePortfolioCommentResponse {
  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("model_comment_id")
  private UUID modelCommentId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("is_read")
  private Boolean isRead = false;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreatePortfolioCommentResponse portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The ID of the portfolio that the comment falls under
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "The ID of the portfolio that the comment falls under")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public CreatePortfolioCommentResponse modelCommentId(UUID modelCommentId) {
    this.modelCommentId = modelCommentId;
    return this;
  }

   /**
   * The ID of the corresponding model comment
   * @return modelCommentId
  **/
  @ApiModelProperty(required = true, value = "The ID of the corresponding model comment")
  public UUID getModelCommentId() {
    return modelCommentId;
  }

  public void setModelCommentId(UUID modelCommentId) {
    this.modelCommentId = modelCommentId;
  }

  public CreatePortfolioCommentResponse modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * The ID of the model to which the portfolio subscribes. Derived from the portfolio
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "The ID of the model to which the portfolio subscribes. Derived from the portfolio")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public CreatePortfolioCommentResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the portfolio belongs. Derived from the portfolio
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account to which the portfolio belongs. Derived from the portfolio")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public CreatePortfolioCommentResponse isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Indicates if the comment has been read. Defaults to false which indicates it has not been read
   * @return isRead
  **/
  @ApiModelProperty(value = "Indicates if the comment has been read. Defaults to false which indicates it has not been read")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public CreatePortfolioCommentResponse secondaryId(String secondaryId) {
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

  public CreatePortfolioCommentResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the portfolio comment
   * @return id
  **/
  @ApiModelProperty(value = "ID of the portfolio comment")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreatePortfolioCommentResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the portfolio comment was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the portfolio comment was created")
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
    CreatePortfolioCommentResponse createPortfolioCommentResponse = (CreatePortfolioCommentResponse) o;
    return Objects.equals(this.portfolioId, createPortfolioCommentResponse.portfolioId) &&
        Objects.equals(this.modelCommentId, createPortfolioCommentResponse.modelCommentId) &&
        Objects.equals(this.modelId, createPortfolioCommentResponse.modelId) &&
        Objects.equals(this.accountId, createPortfolioCommentResponse.accountId) &&
        Objects.equals(this.isRead, createPortfolioCommentResponse.isRead) &&
        Objects.equals(this.secondaryId, createPortfolioCommentResponse.secondaryId) &&
        Objects.equals(this.id, createPortfolioCommentResponse.id) &&
        Objects.equals(this.createDate, createPortfolioCommentResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, modelCommentId, modelId, accountId, isRead, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePortfolioCommentResponse {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    modelCommentId: ").append(toIndentedString(modelCommentId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
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

