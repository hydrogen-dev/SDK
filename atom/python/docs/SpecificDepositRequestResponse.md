# SpecificDepositRequestResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the deposit request | [optional] 
**create_date** | **str** | Datetime the deposit request was last updated | [optional] 
**account_id** | **str** | The ID for the account that is the destination of the deposit | 
**amount** | **float** | Amount that is being deposited | 
**funding_id** | **str** | The ID of the funding record that maps to this deposit | 
**invested_date** | **str** | Date and time that the funds should be pulled from the funding request to be invested | 
**account_number** | **str** | Bank account number that is the source of the deposit | [optional] 
**comments** | **str** | Comment for the deposit such as “Funded” | [optional] 
**direction** | **str** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” | [optional] 
**last_request_date** | **str** | In the case of recurring deposits, the last date and time that the deposit was last requested | [optional] 
**received_date** | **str** | Date and time that the deposit was received into the account | [optional] 
**status** | **str** | Status of the deposit transaction such as “Processing”. Use this field to track the status of the individual deposit if it is associated with a recurring Funding request | [optional] 
**status_time_stamp** | **str** | Date and time that the record was last updated | [optional] 
**type** | **str** | Indicates the payment type such as “check, “wire”, etc. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the deposit request was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


