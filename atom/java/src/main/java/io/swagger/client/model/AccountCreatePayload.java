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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * AccountCreatePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class AccountCreatePayload {
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

  public AccountCreatePayload name(String name) {
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

  public AccountCreatePayload accountTypeId(UUID accountTypeId) {
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

  public AccountCreatePayload managed(Boolean managed) {
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

  public AccountCreatePayload clients(List<AccountCreateClient> clients) {
    this.clients = clients;
    return this;
  }

  public AccountCreatePayload addClientsItem(AccountCreateClient clientsItem) {
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

  public AccountCreatePayload goals(List<AccountCreateGoal> goals) {
    this.goals = goals;
    return this;
  }

  public AccountCreatePayload addGoalsItem(AccountCreateGoal goalsItem) {
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

  public AccountCreatePayload metadata(Object metadata) {
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

  public AccountCreatePayload secondaryId(String secondaryId) {
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
    AccountCreatePayload accountCreatePayload = (AccountCreatePayload) o;
    return Objects.equals(this.name, accountCreatePayload.name) &&
        Objects.equals(this.accountTypeId, accountCreatePayload.accountTypeId) &&
        Objects.equals(this.managed, accountCreatePayload.managed) &&
        Objects.equals(this.clients, accountCreatePayload.clients) &&
        Objects.equals(this.goals, accountCreatePayload.goals) &&
        Objects.equals(this.metadata, accountCreatePayload.metadata) &&
        Objects.equals(this.secondaryId, accountCreatePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountTypeId, managed, clients, goals, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreatePayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
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

