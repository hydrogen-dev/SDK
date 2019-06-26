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
import io.swagger.client.model.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * ClientPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-26T19:23:27.650-04:00")
public class ClientPayload {
  @SerializedName("username")
  private String username = null;

  /**
   * Gets or Sets clientType
   */
  @JsonAdapter(ClientTypeEnum.Adapter.class)
  public enum ClientTypeEnum {
    INDIVIDUAL("individual"),
    
    FIRM("firm"),
    
    ADMIN("admin"),
    
    ADVISOR("advisor");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientTypeEnum fromValue(String text) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClientTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("client_type")
  private ClientTypeEnum clientType = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("date_of_birth")
  private LocalDate dateOfBirth = null;

  @SerializedName("identification_number")
  private String identificationNumber = null;

  @SerializedName("country_of_residence")
  private String countryOfResidence = null;

  @SerializedName("is_verified")
  private Boolean isVerified = false;

  @SerializedName("hydro_id")
  private String hydroId = null;

  @SerializedName("is_active")
  private Boolean isActive = true;

  @SerializedName("address")
  private List<Address> address = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  public ClientPayload username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for the client used on the firm’s platform
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username for the client used on the firm’s platform")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ClientPayload clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @ApiModelProperty(required = true, value = "")
  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public ClientPayload email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email for the client in the format sample@example.com
   * @return email
  **/
  @ApiModelProperty(value = "Contact email for the client in the format sample@example.com")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClientPayload title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ClientPayload firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name or given name of the client
   * @return firstName
  **/
  @ApiModelProperty(value = "First name or given name of the client")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientPayload middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of the client
   * @return middleName
  **/
  @ApiModelProperty(value = "Middle name of the client")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ClientPayload lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name or surname of the client
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name or surname of the client")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientPayload phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number associated with the client
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the client")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ClientPayload dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth of the client in the ISO 8601 format YYYY-MM-DD
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of birth of the client in the ISO 8601 format YYYY-MM-DD")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ClientPayload identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

   /**
   * National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes
   * @return identificationNumber
  **/
  @ApiModelProperty(value = "National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes")
  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public ClientPayload countryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
    return this;
  }

   /**
   * The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes
   * @return countryOfResidence
  **/
  @ApiModelProperty(value = "The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes")
  public String getCountryOfResidence() {
    return countryOfResidence;
  }

  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }

  public ClientPayload isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified
   * @return isVerified
  **/
  @ApiModelProperty(value = "Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified")
  public Boolean isIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public ClientPayload hydroId(String hydroId) {
    this.hydroId = hydroId;
    return this;
  }

   /**
   * The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity
   * @return hydroId
  **/
  @ApiModelProperty(value = "The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity")
  public String getHydroId() {
    return hydroId;
  }

  public void setHydroId(String hydroId) {
    this.hydroId = hydroId;
  }

  public ClientPayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if the client is currently active. Defaults to true which indicates it is active
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if the client is currently active. Defaults to true which indicates it is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ClientPayload address(List<Address> address) {
    this.address = address;
    return this;
  }

  public ClientPayload addAddressItem(Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<Address>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }

  public ClientPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Custom information associated with the client in the format key:value
   * @return metadata
  **/
  @ApiModelProperty(value = "Custom information associated with the client in the format key:value")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ClientPayload secondaryId(String secondaryId) {
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
    ClientPayload clientPayload = (ClientPayload) o;
    return Objects.equals(this.username, clientPayload.username) &&
        Objects.equals(this.clientType, clientPayload.clientType) &&
        Objects.equals(this.email, clientPayload.email) &&
        Objects.equals(this.title, clientPayload.title) &&
        Objects.equals(this.firstName, clientPayload.firstName) &&
        Objects.equals(this.middleName, clientPayload.middleName) &&
        Objects.equals(this.lastName, clientPayload.lastName) &&
        Objects.equals(this.phoneNumber, clientPayload.phoneNumber) &&
        Objects.equals(this.dateOfBirth, clientPayload.dateOfBirth) &&
        Objects.equals(this.identificationNumber, clientPayload.identificationNumber) &&
        Objects.equals(this.countryOfResidence, clientPayload.countryOfResidence) &&
        Objects.equals(this.isVerified, clientPayload.isVerified) &&
        Objects.equals(this.hydroId, clientPayload.hydroId) &&
        Objects.equals(this.isActive, clientPayload.isActive) &&
        Objects.equals(this.address, clientPayload.address) &&
        Objects.equals(this.metadata, clientPayload.metadata) &&
        Objects.equals(this.secondaryId, clientPayload.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, clientType, email, title, firstName, middleName, lastName, phoneNumber, dateOfBirth, identificationNumber, countryOfResidence, isVerified, hydroId, isActive, address, metadata, secondaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPayload {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    hydroId: ").append(toIndentedString(hydroId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

