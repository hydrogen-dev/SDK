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
import io.swagger.client.model.CreateSupportTicketCommentResponse;
import io.swagger.client.model.SupportTicketCommentPayloadSupportTicketDocument;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SpecificSupportTicketCommentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class SpecificSupportTicketCommentResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("support_ticket_id")
  private UUID supportTicketId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("has_attachment")
  private Boolean hasAttachment = false;

  @SerializedName("is_admin")
  private Boolean isAdmin = false;

  @SerializedName("is_read")
  private Boolean isRead = false;

  @SerializedName("support_ticket_document")
  private List<SupportTicketCommentPayloadSupportTicketDocument> supportTicketDocument = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public SpecificSupportTicketCommentResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the support ticket comment
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the support ticket comment")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SpecificSupportTicketCommentResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the support ticket comment was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the support ticket comment was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public SpecificSupportTicketCommentResponse supportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
    return this;
  }

   /**
   * The ID of the support ticket to which the comment belongs
   * @return supportTicketId
  **/
  @ApiModelProperty(required = true, value = "The ID of the support ticket to which the comment belongs")
  public UUID getSupportTicketId() {
    return supportTicketId;
  }

  public void setSupportTicketId(UUID supportTicketId) {
    this.supportTicketId = supportTicketId;
  }

  public SpecificSupportTicketCommentResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Details and description of the information included in the support ticket comment
   * @return description
  **/
  @ApiModelProperty(value = "Details and description of the information included in the support ticket comment")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SpecificSupportTicketCommentResponse hasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
    return this;
  }

   /**
   * Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment
   * @return hasAttachment
  **/
  @ApiModelProperty(value = "Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment")
  public Boolean isHasAttachment() {
    return hasAttachment;
  }

  public void setHasAttachment(Boolean hasAttachment) {
    this.hasAttachment = hasAttachment;
  }

  public SpecificSupportTicketCommentResponse isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator
   * @return isAdmin
  **/
  @ApiModelProperty(value = "Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public SpecificSupportTicketCommentResponse isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read
   * @return isRead
  **/
  @ApiModelProperty(value = "Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public SpecificSupportTicketCommentResponse supportTicketDocument(List<SupportTicketCommentPayloadSupportTicketDocument> supportTicketDocument) {
    this.supportTicketDocument = supportTicketDocument;
    return this;
  }

  public SpecificSupportTicketCommentResponse addSupportTicketDocumentItem(SupportTicketCommentPayloadSupportTicketDocument supportTicketDocumentItem) {
    if (this.supportTicketDocument == null) {
      this.supportTicketDocument = new ArrayList<SupportTicketCommentPayloadSupportTicketDocument>();
    }
    this.supportTicketDocument.add(supportTicketDocumentItem);
    return this;
  }

   /**
   * Get supportTicketDocument
   * @return supportTicketDocument
  **/
  @ApiModelProperty(value = "")
  public List<SupportTicketCommentPayloadSupportTicketDocument> getSupportTicketDocument() {
    return supportTicketDocument;
  }

  public void setSupportTicketDocument(List<SupportTicketCommentPayloadSupportTicketDocument> supportTicketDocument) {
    this.supportTicketDocument = supportTicketDocument;
  }

  public SpecificSupportTicketCommentResponse secondaryId(String secondaryId) {
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

  public SpecificSupportTicketCommentResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the support ticket comment was last updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the support ticket comment was last updated")
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
    SpecificSupportTicketCommentResponse specificSupportTicketCommentResponse = (SpecificSupportTicketCommentResponse) o;
    return Objects.equals(this.id, specificSupportTicketCommentResponse.id) &&
        Objects.equals(this.createDate, specificSupportTicketCommentResponse.createDate) &&
        Objects.equals(this.supportTicketId, specificSupportTicketCommentResponse.supportTicketId) &&
        Objects.equals(this.description, specificSupportTicketCommentResponse.description) &&
        Objects.equals(this.hasAttachment, specificSupportTicketCommentResponse.hasAttachment) &&
        Objects.equals(this.isAdmin, specificSupportTicketCommentResponse.isAdmin) &&
        Objects.equals(this.isRead, specificSupportTicketCommentResponse.isRead) &&
        Objects.equals(this.supportTicketDocument, specificSupportTicketCommentResponse.supportTicketDocument) &&
        Objects.equals(this.secondaryId, specificSupportTicketCommentResponse.secondaryId) &&
        Objects.equals(this.updateDate, specificSupportTicketCommentResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, supportTicketId, description, hasAttachment, isAdmin, isRead, supportTicketDocument, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificSupportTicketCommentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    supportTicketId: ").append(toIndentedString(supportTicketId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasAttachment: ").append(toIndentedString(hasAttachment)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    supportTicketDocument: ").append(toIndentedString(supportTicketDocument)).append("\n");
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

