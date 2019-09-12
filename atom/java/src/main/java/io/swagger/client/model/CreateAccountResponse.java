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
import io.swagger.client.model.AccountCreateClient;
import io.swagger.client.model.AccountCreateGoal;
import io.swagger.client.model.AccountCreatePayload;
import io.swagger.client.model.Pagination;
import io.swagger.client.model.PaginationSort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CreateAccountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class CreateAccountResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("account_type_id")
  private UUID accountTypeId = null;

  @SerializedName("managed")
  private Boolean managed = true;

  @SerializedName("clients")
  private List<AccountCreateClient> clients = null;

  @SerializedName("goals")
  private List<AccountCreateGoal> goals = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("last")
  private Boolean last = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  @SerializedName("total_elements")
  private Integer totalElements = null;

  @SerializedName("sort")
  private List<PaginationSort> sort = null;

  @SerializedName("first")
  private Boolean first = null;

  @SerializedName("number_of_elements")
  private Integer numberOfElements = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateAccountResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateAccountResponse accountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
    return this;
  }

   /**
   * The ID of the account type for the account. Account types are defined by your firm
   * @return accountTypeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account type for the account. Account types are defined by your firm")
  public UUID getAccountTypeId() {
    return accountTypeId;
  }

  public void setAccountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
  }

  public CreateAccountResponse managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Indicates if the account is managed or self directed. Defaults to true, or that it’s managed
   * @return managed
  **/
  @ApiModelProperty(value = "Indicates if the account is managed or self directed. Defaults to true, or that it’s managed")
  public Boolean isManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  public CreateAccountResponse clients(List<AccountCreateClient> clients) {
    this.clients = clients;
    return this;
  }

  public CreateAccountResponse addClientsItem(AccountCreateClient clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<AccountCreateClient>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of clients associated with the account and their association type as well as signature data
   * @return clients
  **/
  @ApiModelProperty(value = "List of clients associated with the account and their association type as well as signature data")
  public List<AccountCreateClient> getClients() {
    return clients;
  }

  public void setClients(List<AccountCreateClient> clients) {
    this.clients = clients;
  }

  public CreateAccountResponse goals(List<AccountCreateGoal> goals) {
    this.goals = goals;
    return this;
  }

  public CreateAccountResponse addGoalsItem(AccountCreateGoal goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<AccountCreateGoal>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * List of goals mapped to the account with information such as goal amount and horizon
   * @return goals
  **/
  @ApiModelProperty(value = "List of goals mapped to the account with information such as goal amount and horizon")
  public List<AccountCreateGoal> getGoals() {
    return goals;
  }

  public void setGoals(List<AccountCreateGoal> goals) {
    this.goals = goals;
  }

  public CreateAccountResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the account in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the account in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateAccountResponse secondaryId(String secondaryId) {
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

  public CreateAccountResponse last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * If true, the last record in the result set is shown
   * @return last
  **/
  @ApiModelProperty(value = "If true, the last record in the result set is shown")
  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public CreateAccountResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages in the result set
   * @return totalPages
  **/
  @ApiModelProperty(value = "Total number of pages in the result set")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public CreateAccountResponse totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Total number of elements in the result set
   * @return totalElements
  **/
  @ApiModelProperty(value = "Total number of elements in the result set")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public CreateAccountResponse sort(List<PaginationSort> sort) {
    this.sort = sort;
    return this;
  }

  public CreateAccountResponse addSortItem(PaginationSort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<PaginationSort>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Details of the sort
   * @return sort
  **/
  @ApiModelProperty(value = "Details of the sort")
  public List<PaginationSort> getSort() {
    return sort;
  }

  public void setSort(List<PaginationSort> sort) {
    this.sort = sort;
  }

  public CreateAccountResponse first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * If true, the first record in the result set is shown
   * @return first
  **/
  @ApiModelProperty(value = "If true, the first record in the result set is shown")
  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public CreateAccountResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Number of elements per page
   * @return numberOfElements
  **/
  @ApiModelProperty(value = "Number of elements per page")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public CreateAccountResponse size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The number or records to be included per page. The default is 25. There is no max value.
   * @return size
  **/
  @ApiModelProperty(value = "The number or records to be included per page. The default is 25. There is no max value.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public CreateAccountResponse number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Number of the first result shown
   * @return number
  **/
  @ApiModelProperty(value = "Number of the first result shown")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public CreateAccountResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the account record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the account record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateAccountResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the account record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the account record was created")
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
    CreateAccountResponse createAccountResponse = (CreateAccountResponse) o;
    return Objects.equals(this.name, createAccountResponse.name) &&
        Objects.equals(this.accountTypeId, createAccountResponse.accountTypeId) &&
        Objects.equals(this.managed, createAccountResponse.managed) &&
        Objects.equals(this.clients, createAccountResponse.clients) &&
        Objects.equals(this.goals, createAccountResponse.goals) &&
        Objects.equals(this.metadata, createAccountResponse.metadata) &&
        Objects.equals(this.secondaryId, createAccountResponse.secondaryId) &&
        Objects.equals(this.last, createAccountResponse.last) &&
        Objects.equals(this.totalPages, createAccountResponse.totalPages) &&
        Objects.equals(this.totalElements, createAccountResponse.totalElements) &&
        Objects.equals(this.sort, createAccountResponse.sort) &&
        Objects.equals(this.first, createAccountResponse.first) &&
        Objects.equals(this.numberOfElements, createAccountResponse.numberOfElements) &&
        Objects.equals(this.size, createAccountResponse.size) &&
        Objects.equals(this.number, createAccountResponse.number) &&
        Objects.equals(this.id, createAccountResponse.id) &&
        Objects.equals(this.createDate, createAccountResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountTypeId, managed, clients, goals, metadata, secondaryId, last, totalPages, totalElements, sort, first, numberOfElements, size, number, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

