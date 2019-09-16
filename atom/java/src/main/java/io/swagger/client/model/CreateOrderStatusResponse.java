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
import io.swagger.client.model.OrderStatusPayload;
import java.io.IOException;
import java.util.UUID;

/**
 * CreateOrderStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-16T14:10:50.140-04:00")
public class CreateOrderStatusResponse {
  @SerializedName("status")
  private String status = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("create_date")
  private String createDate = null;

  public CreateOrderStatusResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Value of the order status such as “Passed to Agent”
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Value of the order status such as “Passed to Agent”")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreateOrderStatusResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Additional description of the order status
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Additional description of the order status")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateOrderStatusResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the order status in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the order status in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateOrderStatusResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the order status record
   * @return id
  **/
  @ApiModelProperty(value = "ID of the order status record")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateOrderStatusResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the order status record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the order status record was created")
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
    CreateOrderStatusResponse createOrderStatusResponse = (CreateOrderStatusResponse) o;
    return Objects.equals(this.status, createOrderStatusResponse.status) &&
        Objects.equals(this.description, createOrderStatusResponse.description) &&
        Objects.equals(this.metadata, createOrderStatusResponse.metadata) &&
        Objects.equals(this.id, createOrderStatusResponse.id) &&
        Objects.equals(this.createDate, createOrderStatusResponse.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, metadata, id, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderStatusResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

