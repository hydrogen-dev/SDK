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
 * CreateAccountStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class CreateAccountStatusResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("stage_id")
  private UUID stageId = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateAccountStatusResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID for the specific account status record for the account_id provided
   * @return id
  **/
  @ApiModelProperty(value = "The ID for the specific account status record for the account_id provided")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateAccountStatusResponse accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the status belongs
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the account to which the status belongs")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public CreateAccountStatusResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the account such as “Signed Up” or “Awaiting Payment”
   * @return status
  **/
  @ApiModelProperty(value = "Status of the account such as “Signed Up” or “Awaiting Payment”")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreateAccountStatusResponse stageId(UUID stageId) {
    this.stageId = stageId;
    return this;
  }

   /**
   * Refers to the stage the client is in. Useful for sign-up funnels
   * @return stageId
  **/
  @ApiModelProperty(value = "Refers to the stage the client is in. Useful for sign-up funnels")
  public UUID getStageId() {
    return stageId;
  }

  public void setStageId(UUID stageId) {
    this.stageId = stageId;
  }

  public CreateAccountStatusResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments for the client regarding the status of their account
   * @return comments
  **/
  @ApiModelProperty(value = "Comments for the client regarding the status of their account")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public CreateAccountStatusResponse secondaryId(String secondaryId) {
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

  public CreateAccountStatusResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the account status record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the account status record was created")
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
    CreateAccountStatusResponse createAccountStatusResponse = (CreateAccountStatusResponse) o;
    return Objects.equals(this.id, createAccountStatusResponse.id) &&
        Objects.equals(this.accountId, createAccountStatusResponse.accountId) &&
        Objects.equals(this.status, createAccountStatusResponse.status) &&
        Objects.equals(this.stageId, createAccountStatusResponse.stageId) &&
        Objects.equals(this.comments, createAccountStatusResponse.comments) &&
        Objects.equals(this.secondaryId, createAccountStatusResponse.secondaryId) &&
        Objects.equals(this.createDate, createAccountStatusResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, status, stageId, comments, secondaryId, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountStatusResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

