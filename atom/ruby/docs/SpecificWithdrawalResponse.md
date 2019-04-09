# AtomApi::SpecificWithdrawalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the withdrawal request | [optional] 
**create_date** | **String** | Datetime of the withdrawal request | [optional] 
**account_id** | **String** | The ID for the account that is the destination of the withdrawal | 
**amount** | **Float** | Amount that is being withdrawn from the account | 
**funding_id** | **String** | The ID of the funding record that maps to this withdrawal | 
**withdrawal_date** | **String** | Date and time that the withdrawal was made | 
**account_number** | **String** | Bank account number that is the destination of the withdrawal | [optional] 
**comments** | **String** | Comment for the withdrawal such as “Funded” | [optional] 
**direction** | **String** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” | [optional] 
**fees** | **String** | Any fees associated with the withdrawal, especially for an investment account | [optional] 
**last_request_date** | **String** | In the case of recurring withdrawals, the date and time that the withdrawal was last requested | [optional] 
**received_date** | **String** | Date and time that the withdrawal was received | [optional] 
**status** | **String** | Status of the transaction such as “Processing” | [optional] 
**status_time_stamp** | **String** | Date and time that the status of the record was last updated | [optional] 
**type** | **String** | Indicates the payment type such as “check, “wire”, etc. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the withdrawal request was last updated | [optional] 


