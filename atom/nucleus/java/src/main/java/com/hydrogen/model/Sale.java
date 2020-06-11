/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;
import java.util.UUID;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Sale Object
 */
@ApiModel(description = "Sale Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class Sale {
  @SerializedName("assigned")
  private UUID assigned = null;

  @SerializedName("close_time")
  private LocalDate closeTime = null;

  @SerializedName("closed_by")
  private UUID closedBy = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("contacted")
  private Boolean contacted = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firm_name")
  private String firmName = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("notification")
  private Boolean notification = null;

  @SerializedName("open_time")
  private LocalDate openTime = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("questions")
  private String questions = null;

  @SerializedName("referral_source")
  private String referralSource = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("solution")
  private String solution = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Sale assigned(UUID assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * assigned
   * @return assigned
  **/
  @ApiModelProperty(example = "d31c694f-bcb5-427f-b081-91e64e90229a", value = "assigned")
  public UUID getAssigned() {
    return assigned;
  }

  public void setAssigned(UUID assigned) {
    this.assigned = assigned;
  }

  public Sale closeTime(LocalDate closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * closeTime
   * @return closeTime
  **/
  @ApiModelProperty(example = "2017-01-03", value = "closeTime")
  public LocalDate getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(LocalDate closeTime) {
    this.closeTime = closeTime;
  }

  public Sale closedBy(UUID closedBy) {
    this.closedBy = closedBy;
    return this;
  }

   /**
   * closedBy
   * @return closedBy
  **/
  @ApiModelProperty(example = "099961da-7f41-4309-950f-2b51689a0033", value = "closedBy")
  public UUID getClosedBy() {
    return closedBy;
  }

  public void setClosedBy(UUID closedBy) {
    this.closedBy = closedBy;
  }

  public Sale comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * comments
   * @return comments
  **/
  @ApiModelProperty(example = "sample comments", value = "comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Sale contacted(Boolean contacted) {
    this.contacted = contacted;
    return this;
  }

   /**
   * contacted
   * @return contacted
  **/
  @ApiModelProperty(example = "true", value = "contacted")
  public Boolean isContacted() {
    return contacted;
  }

  public void setContacted(Boolean contacted) {
    this.contacted = contacted;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public Sale email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email
   * @return email
  **/
  @ApiModelProperty(example = "sample@example.com", value = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Sale firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * firmName
   * @return firmName
  **/
  @ApiModelProperty(example = "xyz inc", value = "firmName")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public Sale firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public Sale ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * ip
   * @return ip
  **/
  @ApiModelProperty(example = "127.0.0.1", value = "ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Sale lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "smith", value = "lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public Sale method(String method) {
    this.method = method;
    return this;
  }

   /**
   * method
   * @return method
  **/
  @ApiModelProperty(example = "email", value = "method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Sale notification(Boolean notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotification() {
    return notification;
  }

  public void setNotification(Boolean notification) {
    this.notification = notification;
  }

  public Sale openTime(LocalDate openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * openTime
   * @return openTime
  **/
  @ApiModelProperty(example = "2017-08-01", value = "openTime")
  public LocalDate getOpenTime() {
    return openTime;
  }

  public void setOpenTime(LocalDate openTime) {
    this.openTime = openTime;
  }

  public Sale phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * phone
   * @return phone
  **/
  @ApiModelProperty(example = "11111111111", value = "phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Sale questions(String questions) {
    this.questions = questions;
    return this;
  }

   /**
   * questions
   * @return questions
  **/
  @ApiModelProperty(example = "Is it possible to organize a demo?", required = true, value = "questions")
  public String getQuestions() {
    return questions;
  }

  public void setQuestions(String questions) {
    this.questions = questions;
  }

  public Sale referralSource(String referralSource) {
    this.referralSource = referralSource;
    return this;
  }

   /**
   * referralSource
   * @return referralSource
  **/
  @ApiModelProperty(example = "N/A", value = "referralSource")
  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public Sale solution(String solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @ApiModelProperty(value = "")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public Sale subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject
   * @return subject
  **/
  @ApiModelProperty(example = "Example", value = "subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Sale title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title
   * @return title
  **/
  @ApiModelProperty(example = "title", value = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return Objects.equals(this.assigned, sale.assigned) &&
        Objects.equals(this.closeTime, sale.closeTime) &&
        Objects.equals(this.closedBy, sale.closedBy) &&
        Objects.equals(this.comments, sale.comments) &&
        Objects.equals(this.contacted, sale.contacted) &&
        Objects.equals(this.createDate, sale.createDate) &&
        Objects.equals(this.email, sale.email) &&
        Objects.equals(this.firmName, sale.firmName) &&
        Objects.equals(this.firstName, sale.firstName) &&
        Objects.equals(this.id, sale.id) &&
        Objects.equals(this.ip, sale.ip) &&
        Objects.equals(this.lastName, sale.lastName) &&
        Objects.equals(this.metadata, sale.metadata) &&
        Objects.equals(this.method, sale.method) &&
        Objects.equals(this.notification, sale.notification) &&
        Objects.equals(this.openTime, sale.openTime) &&
        Objects.equals(this.phone, sale.phone) &&
        Objects.equals(this.questions, sale.questions) &&
        Objects.equals(this.referralSource, sale.referralSource) &&
        Objects.equals(this.secondaryId, sale.secondaryId) &&
        Objects.equals(this.solution, sale.solution) &&
        Objects.equals(this.subject, sale.subject) &&
        Objects.equals(this.title, sale.title) &&
        Objects.equals(this.updateDate, sale.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, closeTime, closedBy, comments, contacted, createDate, email, firmName, firstName, id, ip, lastName, metadata, method, notification, openTime, phone, questions, referralSource, secondaryId, solution, subject, title, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contacted: ").append(toIndentedString(contacted)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
