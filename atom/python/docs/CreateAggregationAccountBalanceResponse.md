# CreateAggregationAccountBalanceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID for the aggregation account balance record | [optional] 
**aggregation_account_id** | **str** | The ID of the aggregation account to which the balance record belongs | [optional] 
**currency_code** | **str** | Alphabetic currency code for the currency of the balance, limited to 3 characters | [optional] 
**balance** | **str** | Current balance of the aggregation account | [optional] 
**available_balance** | **str** | Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft | [optional] 
**balance_time_stamp** | **str** | Date and time for when the balance above applies, defaults to current timestamp | [optional] 
**is_active** | **bool** | Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**create_date** | **str** | Timestamp for the date and time that the record was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


