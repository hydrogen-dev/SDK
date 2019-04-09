# AggregationAccountBalancePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_id** | **str** | The ID of the aggregation account to which the balance record belongs | 
**currency_code** | **str** | Alphabetic currency code for the currency of the balance, limited to 3 characters | 
**balance** | **str** | Balance of the aggregation account | [optional] 
**available_balance** | **str** | Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft | [optional] 
**balance_time_stamp** | **str** | Date and time for when the balance above applies, defaults to current timestamp | [optional] 
**is_active** | **bool** | Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active | [optional] [default to True]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


