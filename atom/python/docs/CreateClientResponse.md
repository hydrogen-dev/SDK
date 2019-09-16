# CreateClientResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** | Username for the client used on the firm’s platform | 
**client_type** | **str** |  | 
**email** | **str** | Contact email for the client in the format sample@example.com | [optional] 
**title** | **str** | The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc. | [optional] 
**first_name** | **str** | First name or given name of the client | [optional] 
**middle_name** | **str** | Middle name of the client | [optional] 
**last_name** | **str** | Last name or surname of the client | [optional] 
**phone_number** | **str** | Phone number associated with the client | [optional] 
**date_of_birth** | **date** | Date of birth of the client in the ISO 8601 format YYYY-MM-DD | [optional] 
**identification_number** | **str** | National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**country_of_residence** | **str** | The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes | [optional] 
**income** | **int** | The total income for the client | [optional] 
**is_verified** | **bool** | Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified | [optional] [default to False]
**hydro_id** | **str** | The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity | [optional] 
**is_active** | **bool** | Indicates if the client is currently active. Defaults to true which indicates it is active | [optional] [default to True]
**address** | [**list[Address]**](Address.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the client in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the client record | [optional] 
**create_date** | **str** | Datetime the client record was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


