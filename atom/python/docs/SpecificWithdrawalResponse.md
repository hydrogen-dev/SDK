# SpecificWithdrawalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the withdrawal request | [optional] 
**create_date** | **str** | Datetime of the withdrawal request | [optional] 
**account_id** | **str** | The ID for the account that is the destination of the withdrawal | 
**amount** | **float** | Amount that is being withdrawn from the account | 
**funding_id** | **str** | The ID of the funding record that maps to this withdrawal | 
**withdrawal_date** | **str** | Date and time that the withdrawal was made | 
**account_number** | **str** | Bank account number that is the destination of the withdrawal | [optional] 
**comments** | **str** | Comment for the withdrawal such as “Funded” | [optional] 
**direction** | **str** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” | [optional] 
**fees** | **str** | Any fees associated with the withdrawal, especially for an investment account | [optional] 
**last_request_date** | **str** | In the case of recurring withdrawals, the date and time that the withdrawal was last requested | [optional] 
**received_date** | **str** | Date and time that the withdrawal was received | [optional] 
**status** | **str** | Status of the transaction such as “Processing” | [optional] 
**status_time_stamp** | **str** | Date and time that the status of the record was last updated | [optional] 
**type** | **str** | Indicates the payment type such as “check, “wire”, etc. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the withdrawal request was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


