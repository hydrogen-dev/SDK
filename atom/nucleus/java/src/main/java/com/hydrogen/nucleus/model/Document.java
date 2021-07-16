/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
 * Document Object
 */
@ApiModel(description = "Document Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Document {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("country_of_issue")
  private String countryOfIssue = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("doc_file")
  private String docFile = null;

  @SerializedName("doc_image_back")
  private String docImageBack = null;

  @SerializedName("doc_image_front")
  private String docImageFront = null;

  @SerializedName("doc_name")
  private String docName = null;

  @SerializedName("doc_number")
  private String docNumber = null;

  @SerializedName("doc_size")
  private Long docSize = null;

  @SerializedName("doc_type")
  private String docType = null;

  @SerializedName("expiry_date")
  private LocalDate expiryDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_sensitive")
  private Boolean isSensitive = null;

  @SerializedName("is_verified")
  private Boolean isVerified = null;

  @SerializedName("issue_date")
  private LocalDate issueDate = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("state_of_issue")
  private String stateOfIssue = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("url_path")
  private String urlPath = null;

  public Document accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Document businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "businessId")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public Document clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Document countryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
    return this;
  }

   /**
   * country_of_issue
   * @return countryOfIssue
  **/
  @ApiModelProperty(example = "qwerwerewq==", value = "country_of_issue")
  public String getCountryOfIssue() {
    return countryOfIssue;
  }

  public void setCountryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
  }

  public Document createDate(OffsetDateTime createDate) {
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

  public Document docFile(String docFile) {
    this.docFile = docFile;
    return this;
  }

   /**
   * doc_file
   * @return docFile
  **/
  @ApiModelProperty(example = "qwerwerewq==", value = "doc_file")
  public String getDocFile() {
    return docFile;
  }

  public void setDocFile(String docFile) {
    this.docFile = docFile;
  }

  public Document docImageBack(String docImageBack) {
    this.docImageBack = docImageBack;
    return this;
  }

   /**
   * doc_image_back
   * @return docImageBack
  **/
  @ApiModelProperty(example = "qwerwerewq==", value = "doc_image_back")
  public String getDocImageBack() {
    return docImageBack;
  }

  public void setDocImageBack(String docImageBack) {
    this.docImageBack = docImageBack;
  }

  public Document docImageFront(String docImageFront) {
    this.docImageFront = docImageFront;
    return this;
  }

   /**
   * doc_image_front
   * @return docImageFront
  **/
  @ApiModelProperty(example = "qwerwerewq==", value = "doc_image_front")
  public String getDocImageFront() {
    return docImageFront;
  }

  public void setDocImageFront(String docImageFront) {
    this.docImageFront = docImageFront;
  }

  public Document docName(String docName) {
    this.docName = docName;
    return this;
  }

   /**
   * doc_name
   * @return docName
  **/
  @ApiModelProperty(example = "Social Security Card", required = true, value = "doc_name")
  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public Document docNumber(String docNumber) {
    this.docNumber = docNumber;
    return this;
  }

   /**
   * doc_number
   * @return docNumber
  **/
  @ApiModelProperty(example = "123456ffds", value = "doc_number")
  public String getDocNumber() {
    return docNumber;
  }

  public void setDocNumber(String docNumber) {
    this.docNumber = docNumber;
  }

  public Document docSize(Long docSize) {
    this.docSize = docSize;
    return this;
  }

   /**
   * doc_size
   * @return docSize
  **/
  @ApiModelProperty(example = "1516", value = "doc_size")
  public Long getDocSize() {
    return docSize;
  }

  public void setDocSize(Long docSize) {
    this.docSize = docSize;
  }

  public Document docType(String docType) {
    this.docType = docType;
    return this;
  }

   /**
   * doc_type
   * @return docType
  **/
  @ApiModelProperty(example = "client_document", value = "doc_type")
  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public Document expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * expiry_date
   * @return expiryDate
  **/
  @ApiModelProperty(example = "2018-01-09", value = "expiry_date")
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Document id(UUID id) {
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

  public Document isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * is_active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "is_active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Document isSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
    return this;
  }

   /**
   * is_sensitive
   * @return isSensitive
  **/
  @ApiModelProperty(example = "true", value = "is_sensitive")
  public Boolean isIsSensitive() {
    return isSensitive;
  }

  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public Document isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * is_verified
   * @return isVerified
  **/
  @ApiModelProperty(example = "false", value = "is_verified")
  public Boolean isIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public Document issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * issue_date
   * @return issueDate
  **/
  @ApiModelProperty(example = "2018-01-09", value = "issue_date")
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public Document metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Document putMetadataItem(String key, String metadataItem) {
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

  public Document secondaryId(String secondaryId) {
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

  public Document stateOfIssue(String stateOfIssue) {
    this.stateOfIssue = stateOfIssue;
    return this;
  }

   /**
   * state_of_issue
   * @return stateOfIssue
  **/
  @ApiModelProperty(example = "qwerwerewq==", value = "state_of_issue")
  public String getStateOfIssue() {
    return stateOfIssue;
  }

  public void setStateOfIssue(String stateOfIssue) {
    this.stateOfIssue = stateOfIssue;
  }

  public Document updateDate(OffsetDateTime updateDate) {
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

  public Document urlPath(String urlPath) {
    this.urlPath = urlPath;
    return this;
  }

   /**
   * url_path
   * @return urlPath
  **/
  @ApiModelProperty(example = "/sample.pdf", value = "url_path")
  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.accountId, document.accountId) &&
        Objects.equals(this.businessId, document.businessId) &&
        Objects.equals(this.clientId, document.clientId) &&
        Objects.equals(this.countryOfIssue, document.countryOfIssue) &&
        Objects.equals(this.createDate, document.createDate) &&
        Objects.equals(this.docFile, document.docFile) &&
        Objects.equals(this.docImageBack, document.docImageBack) &&
        Objects.equals(this.docImageFront, document.docImageFront) &&
        Objects.equals(this.docName, document.docName) &&
        Objects.equals(this.docNumber, document.docNumber) &&
        Objects.equals(this.docSize, document.docSize) &&
        Objects.equals(this.docType, document.docType) &&
        Objects.equals(this.expiryDate, document.expiryDate) &&
        Objects.equals(this.id, document.id) &&
        Objects.equals(this.isActive, document.isActive) &&
        Objects.equals(this.isSensitive, document.isSensitive) &&
        Objects.equals(this.isVerified, document.isVerified) &&
        Objects.equals(this.issueDate, document.issueDate) &&
        Objects.equals(this.metadata, document.metadata) &&
        Objects.equals(this.secondaryId, document.secondaryId) &&
        Objects.equals(this.stateOfIssue, document.stateOfIssue) &&
        Objects.equals(this.updateDate, document.updateDate) &&
        Objects.equals(this.urlPath, document.urlPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, businessId, clientId, countryOfIssue, createDate, docFile, docImageBack, docImageFront, docName, docNumber, docSize, docType, expiryDate, id, isActive, isSensitive, isVerified, issueDate, metadata, secondaryId, stateOfIssue, updateDate, urlPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    countryOfIssue: ").append(toIndentedString(countryOfIssue)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    docFile: ").append(toIndentedString(docFile)).append("\n");
    sb.append("    docImageBack: ").append(toIndentedString(docImageBack)).append("\n");
    sb.append("    docImageFront: ").append(toIndentedString(docImageFront)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docNumber: ").append(toIndentedString(docNumber)).append("\n");
    sb.append("    docSize: ").append(toIndentedString(docSize)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    stateOfIssue: ").append(toIndentedString(stateOfIssue)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
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

