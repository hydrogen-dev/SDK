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
import io.swagger.client.model.AccountPermissionClientsPayload;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountPermissionPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class AccountPermissionPayload {
  @SerializedName("clients")
  private List<AccountPermissionClientsPayload> clients = null;

  public AccountPermissionPayload clients(List<AccountPermissionClientsPayload> clients) {
    this.clients = clients;
    return this;
  }

  public AccountPermissionPayload addClientsItem(AccountPermissionClientsPayload clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<AccountPermissionClientsPayload>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of clients mapped to the account and their permission type
   * @return clients
  **/
  @ApiModelProperty(value = "List of clients mapped to the account and their permission type")
  public List<AccountPermissionClientsPayload> getClients() {
    return clients;
  }

  public void setClients(List<AccountPermissionClientsPayload> clients) {
    this.clients = clients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPermissionPayload accountPermissionPayload = (AccountPermissionPayload) o;
    return Objects.equals(this.clients, accountPermissionPayload.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPermissionPayload {\n");
    
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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

