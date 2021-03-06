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
import org.threeten.bp.OffsetDateTime;

/**
 * Identification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T07:03:53.789Z")
public class Identification {
  @SerializedName("country_of_issue")
  private String countryOfIssue = null;

  @SerializedName("doc_number")
  private String docNumber = null;

  @SerializedName("doc_type")
  private String docType = null;

  @SerializedName("expiry_date")
  private OffsetDateTime expiryDate = null;

  @SerializedName("issue_date")
  private OffsetDateTime issueDate = null;

  @SerializedName("issuing_authority")
  private String issuingAuthority = null;

  @SerializedName("state_of_issue")
  private String stateOfIssue = null;

  public Identification countryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
    return this;
  }

   /**
   * Get countryOfIssue
   * @return countryOfIssue
  **/
  @ApiModelProperty(value = "")
  public String getCountryOfIssue() {
    return countryOfIssue;
  }

  public void setCountryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
  }

  public Identification docNumber(String docNumber) {
    this.docNumber = docNumber;
    return this;
  }

   /**
   * Get docNumber
   * @return docNumber
  **/
  @ApiModelProperty(value = "")
  public String getDocNumber() {
    return docNumber;
  }

  public void setDocNumber(String docNumber) {
    this.docNumber = docNumber;
  }

  public Identification docType(String docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @ApiModelProperty(value = "")
  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public Identification expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Identification issueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
  }

  public Identification issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

   /**
   * Get issuingAuthority
   * @return issuingAuthority
  **/
  @ApiModelProperty(value = "")
  public String getIssuingAuthority() {
    return issuingAuthority;
  }

  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  public Identification stateOfIssue(String stateOfIssue) {
    this.stateOfIssue = stateOfIssue;
    return this;
  }

   /**
   * Get stateOfIssue
   * @return stateOfIssue
  **/
  @ApiModelProperty(value = "")
  public String getStateOfIssue() {
    return stateOfIssue;
  }

  public void setStateOfIssue(String stateOfIssue) {
    this.stateOfIssue = stateOfIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.countryOfIssue, identification.countryOfIssue) &&
        Objects.equals(this.docNumber, identification.docNumber) &&
        Objects.equals(this.docType, identification.docType) &&
        Objects.equals(this.expiryDate, identification.expiryDate) &&
        Objects.equals(this.issueDate, identification.issueDate) &&
        Objects.equals(this.issuingAuthority, identification.issuingAuthority) &&
        Objects.equals(this.stateOfIssue, identification.stateOfIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfIssue, docNumber, docType, expiryDate, issueDate, issuingAuthority, stateOfIssue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    countryOfIssue: ").append(toIndentedString(countryOfIssue)).append("\n");
    sb.append("    docNumber: ").append(toIndentedString(docNumber)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    stateOfIssue: ").append(toIndentedString(stateOfIssue)).append("\n");
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

