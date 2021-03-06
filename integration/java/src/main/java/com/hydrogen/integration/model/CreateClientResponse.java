/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * CreateClientResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T07:03:53.789Z")
public class CreateClientResponse {
  @SerializedName("created_when")
  private OffsetDateTime createdWhen = null;

  @SerializedName("documents")
  private List<Object> documents = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("parent_ib")
  private ParentIB parentIb = null;

  @SerializedName("referral_code")
  private String referralCode = null;

  @SerializedName("status")
  private ExpandedProperty status = null;

  @SerializedName("updated_when")
  private OffsetDateTime updatedWhen = null;

  @SerializedName("user_type")
  private ExpandedProperty userType = null;

  @SerializedName("wlp_id")
  private String wlpId = null;

  public CreateClientResponse createdWhen(OffsetDateTime createdWhen) {
    this.createdWhen = createdWhen;
    return this;
  }

   /**
   * Get createdWhen
   * @return createdWhen
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedWhen() {
    return createdWhen;
  }

  public void setCreatedWhen(OffsetDateTime createdWhen) {
    this.createdWhen = createdWhen;
  }

  public CreateClientResponse documents(List<Object> documents) {
    this.documents = documents;
    return this;
  }

  public CreateClientResponse addDocumentsItem(Object documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Object>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public List<Object> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Object> documents) {
    this.documents = documents;
  }

  public CreateClientResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateClientResponse parentIb(ParentIB parentIb) {
    this.parentIb = parentIb;
    return this;
  }

   /**
   * Get parentIb
   * @return parentIb
  **/
  @ApiModelProperty(value = "")
  public ParentIB getParentIb() {
    return parentIb;
  }

  public void setParentIb(ParentIB parentIb) {
    this.parentIb = parentIb;
  }

  public CreateClientResponse referralCode(String referralCode) {
    this.referralCode = referralCode;
    return this;
  }

   /**
   * Get referralCode
   * @return referralCode
  **/
  @ApiModelProperty(value = "")
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  public CreateClientResponse status(ExpandedProperty status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ExpandedProperty getStatus() {
    return status;
  }

  public void setStatus(ExpandedProperty status) {
    this.status = status;
  }

  public CreateClientResponse updatedWhen(OffsetDateTime updatedWhen) {
    this.updatedWhen = updatedWhen;
    return this;
  }

   /**
   * Get updatedWhen
   * @return updatedWhen
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedWhen() {
    return updatedWhen;
  }

  public void setUpdatedWhen(OffsetDateTime updatedWhen) {
    this.updatedWhen = updatedWhen;
  }

  public CreateClientResponse userType(ExpandedProperty userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @ApiModelProperty(value = "")
  public ExpandedProperty getUserType() {
    return userType;
  }

  public void setUserType(ExpandedProperty userType) {
    this.userType = userType;
  }

  public CreateClientResponse wlpId(String wlpId) {
    this.wlpId = wlpId;
    return this;
  }

   /**
   * Get wlpId
   * @return wlpId
  **/
  @ApiModelProperty(value = "")
  public String getWlpId() {
    return wlpId;
  }

  public void setWlpId(String wlpId) {
    this.wlpId = wlpId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClientResponse createClientResponse = (CreateClientResponse) o;
    return Objects.equals(this.createdWhen, createClientResponse.createdWhen) &&
        Objects.equals(this.documents, createClientResponse.documents) &&
        Objects.equals(this.id, createClientResponse.id) &&
        Objects.equals(this.parentIb, createClientResponse.parentIb) &&
        Objects.equals(this.referralCode, createClientResponse.referralCode) &&
        Objects.equals(this.status, createClientResponse.status) &&
        Objects.equals(this.updatedWhen, createClientResponse.updatedWhen) &&
        Objects.equals(this.userType, createClientResponse.userType) &&
        Objects.equals(this.wlpId, createClientResponse.wlpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdWhen, documents, id, parentIb, referralCode, status, updatedWhen, userType, wlpId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClientResponse {\n");
    
    sb.append("    createdWhen: ").append(toIndentedString(createdWhen)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentIb: ").append(toIndentedString(parentIb)).append("\n");
    sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedWhen: ").append(toIndentedString(updatedWhen)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    wlpId: ").append(toIndentedString(wlpId)).append("\n");
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

