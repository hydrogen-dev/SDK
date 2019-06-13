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
import io.swagger.client.model.SalesPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateSalesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class CreateSalesResponse {
  @SerializedName("questions")
  private String questions = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("assigned")
  private String assigned = null;

  @SerializedName("open_time")
  private LocalDate openTime = null;

  @SerializedName("close_time")
  private LocalDate closeTime = null;

  @SerializedName("closed_by")
  private String closedBy = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("contacted")
  private Boolean contacted = false;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firm_name")
  private String firmName = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("solution")
  private String solution = null;

  @SerializedName("referral_source")
  private String referralSource = null;

  @SerializedName("notification")
  private Boolean notification = true;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateSalesResponse questions(String questions) {
    this.questions = questions;
    return this;
  }

   /**
   * Details on the questions received within the inquiry
   * @return questions
  **/
  @ApiModelProperty(required = true, value = "Details on the questions received within the inquiry")
  public String getQuestions() {
    return questions;
  }

  public void setQuestions(String questions) {
    this.questions = questions;
  }

  public CreateSalesResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Short title for the subject of the inquiry
   * @return subject
  **/
  @ApiModelProperty(value = "Short title for the subject of the inquiry")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CreateSalesResponse assigned(String assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * The ID of the internal user assigned to the sales inquiry
   * @return assigned
  **/
  @ApiModelProperty(value = "The ID of the internal user assigned to the sales inquiry")
  public String getAssigned() {
    return assigned;
  }

  public void setAssigned(String assigned) {
    this.assigned = assigned;
  }

  public CreateSalesResponse openTime(LocalDate openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * Date that the inquiry was opened
   * @return openTime
  **/
  @ApiModelProperty(value = "Date that the inquiry was opened")
  public LocalDate getOpenTime() {
    return openTime;
  }

  public void setOpenTime(LocalDate openTime) {
    this.openTime = openTime;
  }

  public CreateSalesResponse closeTime(LocalDate closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * Date that the inquiry was closed
   * @return closeTime
  **/
  @ApiModelProperty(value = "Date that the inquiry was closed")
  public LocalDate getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(LocalDate closeTime) {
    this.closeTime = closeTime;
  }

  public CreateSalesResponse closedBy(String closedBy) {
    this.closedBy = closedBy;
    return this;
  }

   /**
   * The ID for the internal user that closed the inquiry
   * @return closedBy
  **/
  @ApiModelProperty(value = "The ID for the internal user that closed the inquiry")
  public String getClosedBy() {
    return closedBy;
  }

  public void setClosedBy(String closedBy) {
    this.closedBy = closedBy;
  }

  public CreateSalesResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Any comments associated with the sales inquiry for background
   * @return comments
  **/
  @ApiModelProperty(value = "Any comments associated with the sales inquiry for background")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public CreateSalesResponse contacted(Boolean contacted) {
    this.contacted = contacted;
    return this;
  }

   /**
   * Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted
   * @return contacted
  **/
  @ApiModelProperty(value = "Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted")
  public Boolean isContacted() {
    return contacted;
  }

  public void setContacted(Boolean contacted) {
    this.contacted = contacted;
  }

  public CreateSalesResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email for the individual associated with the inquiry such as sample@example.com
   * @return email
  **/
  @ApiModelProperty(value = "Contact email for the individual associated with the inquiry such as sample@example.com")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateSalesResponse firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * Name of the firm associated with the inquiry
   * @return firmName
  **/
  @ApiModelProperty(value = "Name of the firm associated with the inquiry")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public CreateSalesResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the individual associated with the inquiry
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the individual associated with the inquiry")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateSalesResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the individual associated with the inquiry
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the individual associated with the inquiry")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateSalesResponse ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address for the individual associated with the inquiry
   * @return ip
  **/
  @ApiModelProperty(value = "IP address for the individual associated with the inquiry")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public CreateSalesResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Method with which the inquiry was received such as “email” or “phone”
   * @return method
  **/
  @ApiModelProperty(value = "Method with which the inquiry was received such as “email” or “phone”")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public CreateSalesResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number for the individual associated with the inquiry
   * @return phone
  **/
  @ApiModelProperty(value = "Phone number for the individual associated with the inquiry")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateSalesResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the individual associated with the inquiry
   * @return title
  **/
  @ApiModelProperty(value = "Title of the individual associated with the inquiry")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateSalesResponse solution(String solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Details on the resolution of the inquiry
   * @return solution
  **/
  @ApiModelProperty(value = "Details on the resolution of the inquiry")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public CreateSalesResponse referralSource(String referralSource) {
    this.referralSource = referralSource;
    return this;
  }

   /**
   * Details on how the individual associated with the inquiry was referred
   * @return referralSource
  **/
  @ApiModelProperty(value = "Details on how the individual associated with the inquiry was referred")
  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

  public CreateSalesResponse notification(Boolean notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification
   * @return notification
  **/
  @ApiModelProperty(value = "Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification")
  public Boolean isNotification() {
    return notification;
  }

  public void setNotification(Boolean notification) {
    this.notification = notification;
  }

  public CreateSalesResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the sales inquiry in the format key:value. See Metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the sales inquiry in the format key:value. See Metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateSalesResponse secondaryId(String secondaryId) {
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

  public CreateSalesResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the sales inquiry
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the sales inquiry")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateSalesResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the sales inquiry was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the sales inquiry was created")
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
    CreateSalesResponse createSalesResponse = (CreateSalesResponse) o;
    return Objects.equals(this.questions, createSalesResponse.questions) &&
        Objects.equals(this.subject, createSalesResponse.subject) &&
        Objects.equals(this.assigned, createSalesResponse.assigned) &&
        Objects.equals(this.openTime, createSalesResponse.openTime) &&
        Objects.equals(this.closeTime, createSalesResponse.closeTime) &&
        Objects.equals(this.closedBy, createSalesResponse.closedBy) &&
        Objects.equals(this.comments, createSalesResponse.comments) &&
        Objects.equals(this.contacted, createSalesResponse.contacted) &&
        Objects.equals(this.email, createSalesResponse.email) &&
        Objects.equals(this.firmName, createSalesResponse.firmName) &&
        Objects.equals(this.firstName, createSalesResponse.firstName) &&
        Objects.equals(this.lastName, createSalesResponse.lastName) &&
        Objects.equals(this.ip, createSalesResponse.ip) &&
        Objects.equals(this.method, createSalesResponse.method) &&
        Objects.equals(this.phone, createSalesResponse.phone) &&
        Objects.equals(this.title, createSalesResponse.title) &&
        Objects.equals(this.solution, createSalesResponse.solution) &&
        Objects.equals(this.referralSource, createSalesResponse.referralSource) &&
        Objects.equals(this.notification, createSalesResponse.notification) &&
        Objects.equals(this.metadata, createSalesResponse.metadata) &&
        Objects.equals(this.secondaryId, createSalesResponse.secondaryId) &&
        Objects.equals(this.id, createSalesResponse.id) &&
        Objects.equals(this.createDate, createSalesResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, subject, assigned, openTime, closeTime, closedBy, comments, contacted, email, firmName, firstName, lastName, ip, method, phone, title, solution, referralSource, notification, metadata, secondaryId, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSalesResponse {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contacted: ").append(toIndentedString(contacted)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

