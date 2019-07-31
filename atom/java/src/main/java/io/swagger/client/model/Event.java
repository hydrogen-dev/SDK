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
import io.swagger.client.model.StatsDetail;
import java.io.IOException;

/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-31T19:17:39.885-04:00")
public class Event {
  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("stats")
  private StatsDetail stats = null;

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event stats(StatsDetail stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(required = true, value = "")
  public StatsDetail getStats() {
    return stats;
  }

  public void setStats(StatsDetail stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventName, event.eventName) &&
        Objects.equals(this.stats, event.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

