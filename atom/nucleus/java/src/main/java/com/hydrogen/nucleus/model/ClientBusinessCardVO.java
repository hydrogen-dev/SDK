/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.1
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
import com.hydrogen.nucleus.model.BusinessDetailsVO;
import com.hydrogen.nucleus.model.CardDetailsVO;
import com.hydrogen.nucleus.model.ClientBusinessTotalCardBalanceVO;
import com.hydrogen.nucleus.model.ClientCardVO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Client/Business Card Mapping Object
 */
@ApiModel(description = "Client/Business Card Mapping Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class ClientBusinessCardVO {
  @SerializedName("business_details")
  private BusinessDetailsVO businessDetails = null;

  @SerializedName("card_details")
  private List<CardDetailsVO> cardDetails = null;

  @SerializedName("client_details")
  private ClientCardVO clientDetails = null;

  @SerializedName("total_balance")
  private List<ClientBusinessTotalCardBalanceVO> totalBalance = null;

  public ClientBusinessCardVO businessDetails(BusinessDetailsVO businessDetails) {
    this.businessDetails = businessDetails;
    return this;
  }

   /**
   * businessDetails
   * @return businessDetails
  **/
  @ApiModelProperty(value = "businessDetails")
  public BusinessDetailsVO getBusinessDetails() {
    return businessDetails;
  }

  public void setBusinessDetails(BusinessDetailsVO businessDetails) {
    this.businessDetails = businessDetails;
  }

  public ClientBusinessCardVO cardDetails(List<CardDetailsVO> cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

  public ClientBusinessCardVO addCardDetailsItem(CardDetailsVO cardDetailsItem) {
    if (this.cardDetails == null) {
      this.cardDetails = new ArrayList<CardDetailsVO>();
    }
    this.cardDetails.add(cardDetailsItem);
    return this;
  }

   /**
   * cardDetails
   * @return cardDetails
  **/
  @ApiModelProperty(example = "[]", value = "cardDetails")
  public List<CardDetailsVO> getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(List<CardDetailsVO> cardDetails) {
    this.cardDetails = cardDetails;
  }

  public ClientBusinessCardVO clientDetails(ClientCardVO clientDetails) {
    this.clientDetails = clientDetails;
    return this;
  }

   /**
   * clientDetails
   * @return clientDetails
  **/
  @ApiModelProperty(value = "clientDetails")
  public ClientCardVO getClientDetails() {
    return clientDetails;
  }

  public void setClientDetails(ClientCardVO clientDetails) {
    this.clientDetails = clientDetails;
  }

  public ClientBusinessCardVO totalBalance(List<ClientBusinessTotalCardBalanceVO> totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public ClientBusinessCardVO addTotalBalanceItem(ClientBusinessTotalCardBalanceVO totalBalanceItem) {
    if (this.totalBalance == null) {
      this.totalBalance = new ArrayList<ClientBusinessTotalCardBalanceVO>();
    }
    this.totalBalance.add(totalBalanceItem);
    return this;
  }

   /**
   * totalBalance
   * @return totalBalance
  **/
  @ApiModelProperty(example = "[]", value = "totalBalance")
  public List<ClientBusinessTotalCardBalanceVO> getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(List<ClientBusinessTotalCardBalanceVO> totalBalance) {
    this.totalBalance = totalBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientBusinessCardVO clientBusinessCardVO = (ClientBusinessCardVO) o;
    return Objects.equals(this.businessDetails, clientBusinessCardVO.businessDetails) &&
        Objects.equals(this.cardDetails, clientBusinessCardVO.cardDetails) &&
        Objects.equals(this.clientDetails, clientBusinessCardVO.clientDetails) &&
        Objects.equals(this.totalBalance, clientBusinessCardVO.totalBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessDetails, cardDetails, clientDetails, totalBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientBusinessCardVO {\n");
    
    sb.append("    businessDetails: ").append(toIndentedString(businessDetails)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    clientDetails: ").append(toIndentedString(clientDetails)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
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
