# atom_api.SpendingAnalysisResponseOutlierTransactions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id for the aggregation account transaction record | [optional] 
**transactionDate** | **String** | The date the transaction took place | [optional] 
**transactionType** | **String** | Type of the transaction. Value may be Debit or Credit. | [optional] 
**amount** | **Number** | Amount of the transaction | [optional] 
**merchant** | **String** | The merchant for the transaction such as the merchant posted for a credit card charge | [optional] 
**category** | **String** | Category of the transaction | [optional] 
**subcategory** | **String** | Subcategory of the transaction | [optional] 
**description** | **String** | Description of the transaction | [optional] 
**memo** | **String** | Memo attached to the transaction | [optional] 


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum


* `Debit` (value: `"Debit"`)

* `Credit` (value: `"Credit"`)



