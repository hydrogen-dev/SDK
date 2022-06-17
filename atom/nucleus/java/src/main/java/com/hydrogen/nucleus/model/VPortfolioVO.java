/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
import org.threeten.bp.LocalDate;

/**
 * VPortfolioVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class VPortfolioVO {
  @SerializedName("goal_asset_size_by_portfolio")
  private Double goalAssetSizeByPortfolio = null;

  @SerializedName("goal_asset_size_by_portfolio_date")
  private LocalDate goalAssetSizeByPortfolioDate = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("portfolio_name")
  private String portfolioName = null;

  public VPortfolioVO goalAssetSizeByPortfolio(Double goalAssetSizeByPortfolio) {
    this.goalAssetSizeByPortfolio = goalAssetSizeByPortfolio;
    return this;
  }

   /**
   * Get goalAssetSizeByPortfolio
   * @return goalAssetSizeByPortfolio
  **/
  @ApiModelProperty(value = "")
  public Double getGoalAssetSizeByPortfolio() {
    return goalAssetSizeByPortfolio;
  }

  public void setGoalAssetSizeByPortfolio(Double goalAssetSizeByPortfolio) {
    this.goalAssetSizeByPortfolio = goalAssetSizeByPortfolio;
  }

  public VPortfolioVO goalAssetSizeByPortfolioDate(LocalDate goalAssetSizeByPortfolioDate) {
    this.goalAssetSizeByPortfolioDate = goalAssetSizeByPortfolioDate;
    return this;
  }

   /**
   * Get goalAssetSizeByPortfolioDate
   * @return goalAssetSizeByPortfolioDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getGoalAssetSizeByPortfolioDate() {
    return goalAssetSizeByPortfolioDate;
  }

  public void setGoalAssetSizeByPortfolioDate(LocalDate goalAssetSizeByPortfolioDate) {
    this.goalAssetSizeByPortfolioDate = goalAssetSizeByPortfolioDate;
  }

  public VPortfolioVO portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public VPortfolioVO portfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
    return this;
  }

   /**
   * Get portfolioName
   * @return portfolioName
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioName() {
    return portfolioName;
  }

  public void setPortfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPortfolioVO vportfolioVO = (VPortfolioVO) o;
    return Objects.equals(this.goalAssetSizeByPortfolio, vportfolioVO.goalAssetSizeByPortfolio) &&
        Objects.equals(this.goalAssetSizeByPortfolioDate, vportfolioVO.goalAssetSizeByPortfolioDate) &&
        Objects.equals(this.portfolioId, vportfolioVO.portfolioId) &&
        Objects.equals(this.portfolioName, vportfolioVO.portfolioName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalAssetSizeByPortfolio, goalAssetSizeByPortfolioDate, portfolioId, portfolioName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPortfolioVO {\n");
    
    sb.append("    goalAssetSizeByPortfolio: ").append(toIndentedString(goalAssetSizeByPortfolio)).append("\n");
    sb.append("    goalAssetSizeByPortfolioDate: ").append(toIndentedString(goalAssetSizeByPortfolioDate)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    portfolioName: ").append(toIndentedString(portfolioName)).append("\n");
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

