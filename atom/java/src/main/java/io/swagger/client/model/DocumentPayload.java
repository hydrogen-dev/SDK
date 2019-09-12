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
 * DocumentPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class DocumentPayload {
  @SerializedName("doc_size")
  private Integer docSize = null;

  @SerializedName("doc_name")
  private String docName = null;

  @SerializedName("doc_type")
  private String docType = null;

  @SerializedName("doc_file")
  private String docFile = null;

  @SerializedName("url_path")
  private String urlPath = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public DocumentPayload docSize(Integer docSize) {
    this.docSize = docSize;
    return this;
  }

   /**
   * Size of the document. Must be a whole number
   * @return docSize
  **/
  @ApiModelProperty(required = true, value = "Size of the document. Must be a whole number")
  public Integer getDocSize() {
    return docSize;
  }

  public void setDocSize(Integer docSize) {
    this.docSize = docSize;
  }

  public DocumentPayload docName(String docName) {
    this.docName = docName;
    return this;
  }

   /**
   * Name or title of the document
   * @return docName
  **/
  @ApiModelProperty(value = "Name or title of the document")
  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public DocumentPayload docType(String docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Type of document such as “Compliance” or “Registration”
   * @return docType
  **/
  @ApiModelProperty(value = "Type of document such as “Compliance” or “Registration”")
  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public DocumentPayload docFile(String docFile) {
    this.docFile = docFile;
    return this;
  }

   /**
   * File path or content for the document
   * @return docFile
  **/
  @ApiModelProperty(value = "File path or content for the document")
  public String getDocFile() {
    return docFile;
  }

  public void setDocFile(String docFile) {
    this.docFile = docFile;
  }

  public DocumentPayload urlPath(String urlPath) {
    this.urlPath = urlPath;
    return this;
  }

   /**
   * URL path for the document such as http://domain.com/sample.pdf
   * @return urlPath
  **/
  @ApiModelProperty(value = "URL path for the document such as http://domain.com/sample.pdf")
  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }

  public DocumentPayload clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * In the case that the document relates to a specific Client, the ID of the client
   * @return clientId
  **/
  @ApiModelProperty(value = "In the case that the document relates to a specific Client, the ID of the client")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public DocumentPayload accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * In the case that the document relates to a specific Account, the ID of the account
   * @return accountId
  **/
  @ApiModelProperty(value = "In the case that the document relates to a specific Account, the ID of the account")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public DocumentPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the document in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the document in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public DocumentPayload secondaryId(String secondaryId) {
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
    DocumentPayload documentPayload = (DocumentPayload) o;
    return Objects.equals(this.docSize, documentPayload.docSize) &&
        Objects.equals(this.docName, documentPayload.docName) &&
        Objects.equals(this.docType, documentPayload.docType) &&
        Objects.equals(this.docFile, documentPayload.docFile) &&
        Objects.equals(this.urlPath, documentPayload.urlPath) &&
        Objects.equals(this.clientId, documentPayload.clientId) &&
        Objects.equals(this.accountId, documentPayload.accountId) &&
        Objects.equals(this.metadata, documentPayload.metadata) &&
        Objects.equals(this.secondaryId, documentPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docSize, docName, docType, docFile, urlPath, clientId, accountId, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPayload {\n");
    
    sb.append("    docSize: ").append(toIndentedString(docSize)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docFile: ").append(toIndentedString(docFile)).append("\n");
    sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

