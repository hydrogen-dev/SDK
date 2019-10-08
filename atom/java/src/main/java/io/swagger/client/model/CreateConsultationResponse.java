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
import io.swagger.client.model.ConsultationPayload;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * CreateConsultationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class CreateConsultationResponse {
  @SerializedName("account_type_id")
  private UUID accountTypeId = null;

  @SerializedName("additional_questions")
  private String additionalQuestions = null;

  @SerializedName("assets")
  private String assets = null;

  @SerializedName("assigned")
  private String assigned = null;

  @SerializedName("calendar")
  private Boolean calendar = false;

  @SerializedName("category")
  private String category = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("time")
  private LocalDate time = null;

  @SerializedName("close_time")
  private LocalDate closeTime = null;

  @SerializedName("closed_by")
  private String closedBy = null;

  @SerializedName("completed")
  private Boolean completed = false;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firmname")
  private String firmname = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("investment_allocation")
  private String investmentAllocation = null;

  @SerializedName("investment_location")
  private String investmentLocation = null;

  @SerializedName("investment_objectives")
  private String investmentObjectives = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("reminded")
  private Boolean reminded = false;

  @SerializedName("source")
  private String source = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateConsultationResponse accountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
    return this;
  }

   /**
   * The ID of the account type for the account of the client who submitted the request
   * @return accountTypeId
  **/
  @ApiModelProperty(value = "The ID of the account type for the account of the client who submitted the request")
  public UUID getAccountTypeId() {
    return accountTypeId;
  }

  public void setAccountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
  }

  public CreateConsultationResponse additionalQuestions(String additionalQuestions) {
    this.additionalQuestions = additionalQuestions;
    return this;
  }

   /**
   * Any additional questions to be answered during the consultation
   * @return additionalQuestions
  **/
  @ApiModelProperty(value = "Any additional questions to be answered during the consultation")
  public String getAdditionalQuestions() {
    return additionalQuestions;
  }

  public void setAdditionalQuestions(String additionalQuestions) {
    this.additionalQuestions = additionalQuestions;
  }

  public CreateConsultationResponse assets(String assets) {
    this.assets = assets;
    return this;
  }

   /**
   * Asset value for a client’s account
   * @return assets
  **/
  @ApiModelProperty(value = "Asset value for a client’s account")
  public String getAssets() {
    return assets;
  }

  public void setAssets(String assets) {
    this.assets = assets;
  }

  public CreateConsultationResponse assigned(String assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Internal user to whom the request is assigned
   * @return assigned
  **/
  @ApiModelProperty(value = "Internal user to whom the request is assigned")
  public String getAssigned() {
    return assigned;
  }

  public void setAssigned(String assigned) {
    this.assigned = assigned;
  }

  public CreateConsultationResponse calendar(Boolean calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled
   * @return calendar
  **/
  @ApiModelProperty(value = "Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled")
  public Boolean isCalendar() {
    return calendar;
  }

  public void setCalendar(Boolean calendar) {
    this.calendar = calendar;
  }

  public CreateConsultationResponse category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category for the purpose of the request such as “New Account”
   * @return category
  **/
  @ApiModelProperty(value = "Category for the purpose of the request such as “New Account”")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CreateConsultationResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Additional information on the purpose of the request such as “Would like to open a new account”
   * @return comments
  **/
  @ApiModelProperty(value = "Additional information on the purpose of the request such as “Would like to open a new account”")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public CreateConsultationResponse clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID for the client that submitted the request
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID for the client that submitted the request")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public CreateConsultationResponse time(LocalDate time) {
    this.time = time;
    return this;
  }

   /**
   * Date that the consultation is scheduled
   * @return time
  **/
  @ApiModelProperty(value = "Date that the consultation is scheduled")
  public LocalDate getTime() {
    return time;
  }

  public void setTime(LocalDate time) {
    this.time = time;
  }

  public CreateConsultationResponse closeTime(LocalDate closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * Date that the consultation request has been resolved and closed
   * @return closeTime
  **/
  @ApiModelProperty(value = "Date that the consultation request has been resolved and closed")
  public LocalDate getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(LocalDate closeTime) {
    this.closeTime = closeTime;
  }

  public CreateConsultationResponse closedBy(String closedBy) {
    this.closedBy = closedBy;
    return this;
  }

   /**
   * Internal user that has resolved and closed the consultation request
   * @return closedBy
  **/
  @ApiModelProperty(value = "Internal user that has resolved and closed the consultation request")
  public String getClosedBy() {
    return closedBy;
  }

  public void setClosedBy(String closedBy) {
    this.closedBy = closedBy;
  }

  public CreateConsultationResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed
   * @return completed
  **/
  @ApiModelProperty(value = "Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed")
  public Boolean isCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public CreateConsultationResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the client that submitted the request
   * @return name
  **/
  @ApiModelProperty(value = "Name of the client that submitted the request")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateConsultationResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email or the client in the format sample@example.com
   * @return email
  **/
  @ApiModelProperty(value = "Contact email or the client in the format sample@example.com")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateConsultationResponse firmname(String firmname) {
    this.firmname = firmname;
    return this;
  }

   /**
   * Firm name for the client’s firm
   * @return firmname
  **/
  @ApiModelProperty(value = "Firm name for the client’s firm")
  public String getFirmname() {
    return firmname;
  }

  public void setFirmname(String firmname) {
    this.firmname = firmname;
  }

  public CreateConsultationResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Contact phone number for the client
   * @return phone
  **/
  @ApiModelProperty(value = "Contact phone number for the client")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateConsultationResponse investmentAllocation(String investmentAllocation) {
    this.investmentAllocation = investmentAllocation;
    return this;
  }

   /**
   * The type of investment allocation with which the client is associated
   * @return investmentAllocation
  **/
  @ApiModelProperty(value = "The type of investment allocation with which the client is associated")
  public String getInvestmentAllocation() {
    return investmentAllocation;
  }

  public void setInvestmentAllocation(String investmentAllocation) {
    this.investmentAllocation = investmentAllocation;
  }

  public CreateConsultationResponse investmentLocation(String investmentLocation) {
    this.investmentLocation = investmentLocation;
    return this;
  }

   /**
   * Description of the location of the client’s investments
   * @return investmentLocation
  **/
  @ApiModelProperty(value = "Description of the location of the client’s investments")
  public String getInvestmentLocation() {
    return investmentLocation;
  }

  public void setInvestmentLocation(String investmentLocation) {
    this.investmentLocation = investmentLocation;
  }

  public CreateConsultationResponse investmentObjectives(String investmentObjectives) {
    this.investmentObjectives = investmentObjectives;
    return this;
  }

   /**
   * Brief information on the client’s investment objectives
   * @return investmentObjectives
  **/
  @ApiModelProperty(value = "Brief information on the client’s investment objectives")
  public String getInvestmentObjectives() {
    return investmentObjectives;
  }

  public void setInvestmentObjectives(String investmentObjectives) {
    this.investmentObjectives = investmentObjectives;
  }

  public CreateConsultationResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the consultation request is active. Defaults to true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the consultation request is active. Defaults to true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CreateConsultationResponse reminded(Boolean reminded) {
    this.reminded = reminded;
    return this;
  }

   /**
   * Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent
   * @return reminded
  **/
  @ApiModelProperty(value = "Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent")
  public Boolean isReminded() {
    return reminded;
  }

  public void setReminded(Boolean reminded) {
    this.reminded = reminded;
  }

  public CreateConsultationResponse source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Information on how the client has requested the consultation
   * @return source
  **/
  @ApiModelProperty(value = "Information on how the client has requested the consultation")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CreateConsultationResponse secondaryId(String secondaryId) {
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

  public CreateConsultationResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the consultation in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the consultation in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateConsultationResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the consultation request
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the consultation request")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateConsultationResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the consultation request was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the consultation request was created")
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
    CreateConsultationResponse createConsultationResponse = (CreateConsultationResponse) o;
    return Objects.equals(this.accountTypeId, createConsultationResponse.accountTypeId) &&
        Objects.equals(this.additionalQuestions, createConsultationResponse.additionalQuestions) &&
        Objects.equals(this.assets, createConsultationResponse.assets) &&
        Objects.equals(this.assigned, createConsultationResponse.assigned) &&
        Objects.equals(this.calendar, createConsultationResponse.calendar) &&
        Objects.equals(this.category, createConsultationResponse.category) &&
        Objects.equals(this.comments, createConsultationResponse.comments) &&
        Objects.equals(this.clientId, createConsultationResponse.clientId) &&
        Objects.equals(this.time, createConsultationResponse.time) &&
        Objects.equals(this.closeTime, createConsultationResponse.closeTime) &&
        Objects.equals(this.closedBy, createConsultationResponse.closedBy) &&
        Objects.equals(this.completed, createConsultationResponse.completed) &&
        Objects.equals(this.name, createConsultationResponse.name) &&
        Objects.equals(this.email, createConsultationResponse.email) &&
        Objects.equals(this.firmname, createConsultationResponse.firmname) &&
        Objects.equals(this.phone, createConsultationResponse.phone) &&
        Objects.equals(this.investmentAllocation, createConsultationResponse.investmentAllocation) &&
        Objects.equals(this.investmentLocation, createConsultationResponse.investmentLocation) &&
        Objects.equals(this.investmentObjectives, createConsultationResponse.investmentObjectives) &&
        Objects.equals(this.isActive, createConsultationResponse.isActive) &&
        Objects.equals(this.reminded, createConsultationResponse.reminded) &&
        Objects.equals(this.source, createConsultationResponse.source) &&
        Objects.equals(this.secondaryId, createConsultationResponse.secondaryId) &&
        Objects.equals(this.metadata, createConsultationResponse.metadata) &&
        Objects.equals(this.id, createConsultationResponse.id) &&
        Objects.equals(this.createDate, createConsultationResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTypeId, additionalQuestions, assets, assigned, calendar, category, comments, clientId, time, closeTime, closedBy, completed, name, email, firmname, phone, investmentAllocation, investmentLocation, investmentObjectives, isActive, reminded, source, secondaryId, metadata, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsultationResponse {\n");
    
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    additionalQuestions: ").append(toIndentedString(additionalQuestions)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firmname: ").append(toIndentedString(firmname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    investmentAllocation: ").append(toIndentedString(investmentAllocation)).append("\n");
    sb.append("    investmentLocation: ").append(toIndentedString(investmentLocation)).append("\n");
    sb.append("    investmentObjectives: ").append(toIndentedString(investmentObjectives)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    reminded: ").append(toIndentedString(reminded)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

