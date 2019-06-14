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
import io.swagger.client.model.Event;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventStudyResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-14T14:44:02.139-04:00")
public class EventStudyResponse {
  @SerializedName("event_summary")
  private List<Event> eventSummary = new ArrayList<Event>();

  public EventStudyResponse eventSummary(List<Event> eventSummary) {
    this.eventSummary = eventSummary;
    return this;
  }

  public EventStudyResponse addEventSummaryItem(Event eventSummaryItem) {
    this.eventSummary.add(eventSummaryItem);
    return this;
  }

   /**
   * Get eventSummary
   * @return eventSummary
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Event> getEventSummary() {
    return eventSummary;
  }

  public void setEventSummary(List<Event> eventSummary) {
    this.eventSummary = eventSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStudyResponse eventStudyResponse = (EventStudyResponse) o;
    return Objects.equals(this.eventSummary, eventStudyResponse.eventSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStudyResponse {\n");
    
    sb.append("    eventSummary: ").append(toIndentedString(eventSummary)).append("\n");
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

