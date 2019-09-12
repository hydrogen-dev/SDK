# atom_api.CreateAggregationAccountBalanceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for the aggregation account balance record | [optional] 
**aggregationAccountId** | **String** | The ID of the aggregation account to which the balance record belongs | [optional] 
**currencyCode** | **String** | Alphabetic currency code for the currency of the balance, limited to 3 characters | [optional] 
**balance** | **String** | Current balance of the aggregation account | [optional] 
**availableBalance** | **String** | Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft | [optional] 
**balanceTimeStamp** | **String** | Date and time for when the balance above applies, defaults to current timestamp | [optional] 
**isActive** | **Boolean** | Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**createDate** | **String** | Timestamp for the date and time that the record was created | [optional] 


