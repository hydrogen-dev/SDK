# atom_api.ClientPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Username for the client used on the firm’s platform | 
**clientType** | **String** |  | 
**email** | **String** | Contact email for the client in the format sample@example.com | [optional] 
**title** | **String** | The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc. | [optional] 
**firstName** | **String** | First name or given name of the client | [optional] 
**middleName** | **String** | Middle name of the client | [optional] 
**lastName** | **String** | Last name or surname of the client | [optional] 
**phoneNumber** | **String** | Phone number associated with the client | [optional] 
**dateOfBirth** | **Date** | Date of birth of the client in the ISO 8601 format YYYY-MM-DD | [optional] 
**identificationNumber** | **String** | National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**countryOfResidence** | **String** | The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**isVerified** | **Boolean** | Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified | [optional] [default to false]
**hydroId** | **String** | The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity | [optional] 
**isActive** | **Boolean** | Indicates if the client is currently active. Defaults to true which indicates it is active | [optional] [default to true]
**address** | [**[Address]**](Address.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the client in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


<a name="ClientTypeEnum"></a>
## Enum: ClientTypeEnum


* `individual` (value: `"individual"`)

* `firm` (value: `"firm"`)

* `admin` (value: `"admin"`)

* `advisor` (value: `"advisor"`)




