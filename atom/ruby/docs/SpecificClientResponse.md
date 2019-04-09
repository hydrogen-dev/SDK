# AtomApi::SpecificClientResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Username for the client used on the firm’s platform | 
**client_type** | **String** |  | 
**email** | **String** | Contact email for the client in the format sample@example.com | [optional] 
**title** | **String** | The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc. | [optional] 
**first_name** | **String** | First name or given name of the client | [optional] 
**middle_name** | **String** | Middle name of the client | [optional] 
**last_name** | **String** | Last name or surname of the client | [optional] 
**phone_number** | **String** | Phone number associated with the client | [optional] 
**date_of_birth** | **Date** | Date of birth of the client in the ISO 8601 format YYYY-MM-DD | [optional] 
**identification_number** | **String** | National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**country_of_residence** | **String** | The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**is_verified** | **BOOLEAN** | Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified | [optional] [default to false]
**hydro_id** | **String** | The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity | [optional] 
**is_active** | **BOOLEAN** | Indicates if the client is currently active. Defaults to true which indicates it is active | [optional] [default to true]
**address** | [**Array&lt;Address&gt;**](Address.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the client in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the client record | [optional] 
**create_date** | **String** | Datetime the client record was created | [optional] 
**update_date** | **String** | Latest datetime the client record was updated | [optional] 


