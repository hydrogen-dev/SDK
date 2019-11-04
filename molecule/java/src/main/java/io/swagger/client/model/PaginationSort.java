/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
 * PaginationSort
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-04T15:24:43.843-05:00")
public class PaginationSort {
  /**
   * ASC if ascending sort, DESC if descending sort
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("ignore_case")
  private Boolean ignoreCase = null;

  @SerializedName("null_handling")
  private String nullHandling = null;

  @SerializedName("descending")
  private Boolean descending = null;

  @SerializedName("ascending")
  private Boolean ascending = null;

  public PaginationSort direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * ASC if ascending sort, DESC if descending sort
   * @return direction
  **/
  @ApiModelProperty(value = "ASC if ascending sort, DESC if descending sort")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public PaginationSort property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Property on which the records are sorted
   * @return property
  **/
  @ApiModelProperty(value = "Property on which the records are sorted")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public PaginationSort ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * If true, ignore case when sorting
   * @return ignoreCase
  **/
  @ApiModelProperty(value = "If true, ignore case when sorting")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public PaginationSort nullHandling(String nullHandling) {
    this.nullHandling = nullHandling;
    return this;
  }

   /**
   * Type of null handling applied
   * @return nullHandling
  **/
  @ApiModelProperty(value = "Type of null handling applied")
  public String getNullHandling() {
    return nullHandling;
  }

  public void setNullHandling(String nullHandling) {
    this.nullHandling = nullHandling;
  }

  public PaginationSort descending(Boolean descending) {
    this.descending = descending;
    return this;
  }

   /**
   * If true, data is sorted in ascending order
   * @return descending
  **/
  @ApiModelProperty(value = "If true, data is sorted in ascending order")
  public Boolean isDescending() {
    return descending;
  }

  public void setDescending(Boolean descending) {
    this.descending = descending;
  }

  public PaginationSort ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

   /**
   * If true, data is sorted in descending order
   * @return ascending
  **/
  @ApiModelProperty(value = "If true, data is sorted in descending order")
  public Boolean isAscending() {
    return ascending;
  }

  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationSort paginationSort = (PaginationSort) o;
    return Objects.equals(this.direction, paginationSort.direction) &&
        Objects.equals(this.property, paginationSort.property) &&
        Objects.equals(this.ignoreCase, paginationSort.ignoreCase) &&
        Objects.equals(this.nullHandling, paginationSort.nullHandling) &&
        Objects.equals(this.descending, paginationSort.descending) &&
        Objects.equals(this.ascending, paginationSort.ascending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, property, ignoreCase, nullHandling, descending, ascending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationSort {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    nullHandling: ").append(toIndentedString(nullHandling)).append("\n");
    sb.append("    descending: ").append(toIndentedString(descending)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

