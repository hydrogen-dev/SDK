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
 * AccountStatusPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class AccountStatusPayload {
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

  public AccountStatusPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the status belongs
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account to which the status belongs")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public AccountStatusPayload status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the account such as “Signed Up” or “Awaiting Payment”
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the account such as “Signed Up” or “Awaiting Payment”")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AccountStatusPayload stageId(UUID stageId) {
    this.stageId = stageId;
    return this;
  }

   /**
   * Refers to the stage the client is in. Useful for sign-up funnels
   * @return stageId
  **/
  @ApiModelProperty(required = true, value = "Refers to the stage the client is in. Useful for sign-up funnels")
  public UUID getStageId() {
    return stageId;
  }

  public void setStageId(UUID stageId) {
    this.stageId = stageId;
  }

  public AccountStatusPayload comments(String comments) {
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

  public AccountStatusPayload secondaryId(String secondaryId) {
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
    AccountStatusPayload accountStatusPayload = (AccountStatusPayload) o;
    return Objects.equals(this.accountId, accountStatusPayload.accountId) &&
        Objects.equals(this.status, accountStatusPayload.status) &&
        Objects.equals(this.stageId, accountStatusPayload.stageId) &&
        Objects.equals(this.comments, accountStatusPayload.comments) &&
        Objects.equals(this.secondaryId, accountStatusPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, stageId, comments, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatusPayload {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

