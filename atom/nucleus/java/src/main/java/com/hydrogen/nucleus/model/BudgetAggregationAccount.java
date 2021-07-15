/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

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
import java.util.UUID;

/**
 * BudgetAggregationAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class BudgetAggregationAccount {
  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  public BudgetAggregationAccount aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * node_id
   * @return aggregationAccountId
  **/
  @ApiModelProperty(example = "6e14259a-9a68-4593-9e6d-8fcd0d05cf44", required = true, value = "node_id")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAggregationAccount budgetAggregationAccount = (BudgetAggregationAccount) o;
    return Objects.equals(this.aggregationAccountId, budgetAggregationAccount.aggregationAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAggregationAccount {\n");
    
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

