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
import io.swagger.client.model.Pagination;
import io.swagger.client.model.PaginationSort;
import io.swagger.client.model.SpecificAccountStatusResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAccountStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T10:03:00.746-04:00")
public class GetAccountStatusResponse {
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

  @SerializedName("content")
  private List<SpecificAccountStatusResponse> content = null;

  public GetAccountStatusResponse last(Boolean last) {
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

  public GetAccountStatusResponse totalPages(Integer totalPages) {
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

  public GetAccountStatusResponse totalElements(Integer totalElements) {
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

  public GetAccountStatusResponse sort(List<PaginationSort> sort) {
    this.sort = sort;
    return this;
  }

  public GetAccountStatusResponse addSortItem(PaginationSort sortItem) {
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

  public GetAccountStatusResponse first(Boolean first) {
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

  public GetAccountStatusResponse numberOfElements(Integer numberOfElements) {
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

  public GetAccountStatusResponse size(Integer size) {
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

  public GetAccountStatusResponse number(Integer number) {
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

  public GetAccountStatusResponse content(List<SpecificAccountStatusResponse> content) {
    this.content = content;
    return this;
  }

  public GetAccountStatusResponse addContentItem(SpecificAccountStatusResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<SpecificAccountStatusResponse>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<SpecificAccountStatusResponse> getContent() {
    return content;
  }

  public void setContent(List<SpecificAccountStatusResponse> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountStatusResponse getAccountStatusResponse = (GetAccountStatusResponse) o;
    return Objects.equals(this.last, getAccountStatusResponse.last) &&
        Objects.equals(this.totalPages, getAccountStatusResponse.totalPages) &&
        Objects.equals(this.totalElements, getAccountStatusResponse.totalElements) &&
        Objects.equals(this.sort, getAccountStatusResponse.sort) &&
        Objects.equals(this.first, getAccountStatusResponse.first) &&
        Objects.equals(this.numberOfElements, getAccountStatusResponse.numberOfElements) &&
        Objects.equals(this.size, getAccountStatusResponse.size) &&
        Objects.equals(this.number, getAccountStatusResponse.number) &&
        Objects.equals(this.content, getAccountStatusResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, totalPages, totalElements, sort, first, numberOfElements, size, number, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountStatusResponse {\n");
    
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

