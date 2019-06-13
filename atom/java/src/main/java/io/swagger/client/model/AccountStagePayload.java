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

/**
 * AccountStagePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T18:14:40.362-04:00")
public class AccountStagePayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("order_index")
  private Integer orderIndex = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public AccountStagePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name or label of the account stage such as “Pending Funding” or “Fully Funded”
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name or label of the account stage such as “Pending Funding” or “Fully Funded”")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountStagePayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of what the step along the registration process that the account stage represents
   * @return description
  **/
  @ApiModelProperty(value = "Description of what the step along the registration process that the account stage represents")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountStagePayload orderIndex(Integer orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

   /**
   * Indicator for where along the process the account stage falls. Generally, the higher the order index, the further along the process
   * @return orderIndex
  **/
  @ApiModelProperty(value = "Indicator for where along the process the account stage falls. Generally, the higher the order index, the further along the process")
  public Integer getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Integer orderIndex) {
    this.orderIndex = orderIndex;
  }

  public AccountStagePayload secondaryId(String secondaryId) {
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
    AccountStagePayload accountStagePayload = (AccountStagePayload) o;
    return Objects.equals(this.name, accountStagePayload.name) &&
        Objects.equals(this.description, accountStagePayload.description) &&
        Objects.equals(this.orderIndex, accountStagePayload.orderIndex) &&
        Objects.equals(this.secondaryId, accountStagePayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, orderIndex, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStagePayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
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

