# AtomApi::AggregationAccountBalancePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_id** | **String** | The ID of the aggregation account to which the balance record belongs | 
**currency_code** | **String** | Alphabetic currency code for the currency of the balance, limited to 3 characters | 
**balance** | **String** | Balance of the aggregation account | [optional] 
**available_balance** | **String** | Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft | [optional] 
**balance_time_stamp** | **String** | Date and time for when the balance above applies, defaults to current timestamp | [optional] 
**is_active** | **BOOLEAN** | Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active | [optional] [default to true]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


