# AtomApi::CreateDepositRequestResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **String** | The ID for the account that is the destination of the deposit | 
**amount** | **Float** | Amount that is being deposited | 
**funding_id** | **String** | The ID of the funding record that maps to this deposit | 
**invested_date** | **String** | Date and time that the funds should be pulled from the funding request to be invested | 
**account_number** | **String** | Bank account number that is the source of the deposit | [optional] 
**comments** | **String** | Comment for the deposit such as “Funded” | [optional] 
**direction** | **String** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” | [optional] 
**last_request_date** | **String** | In the case of recurring deposits, the last date and time that the deposit was last requested | [optional] 
**received_date** | **String** | Date and time that the deposit was received into the account | [optional] 
**status** | **String** | Status of the deposit transaction such as “Processing”. Use this field to track the status of the individual deposit if it is associated with a recurring Funding request | [optional] 
**status_time_stamp** | **String** | Date and time that the record was last updated | [optional] 
**type** | **String** | Indicates the payment type such as “check, “wire”, etc. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the deposit in the format key:value | [optional] 
**id** | **String** | ID of the deposit request | [optional] 
**create_date** | **String** | Datetime the deposit request was last updated | [optional] 


