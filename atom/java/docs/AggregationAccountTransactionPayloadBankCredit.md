
# AggregationAccountTransactionPayloadBankCredit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Type of the transaction. Value may be Debit or Credit | 
**amount** | **Double** | Amount of the transaction | 
**merchant** | **String** | The merchant for the transaction such as the merchant posted for a credit card charge | 
**category** | **String** | Category of the transaction |  [optional]
**subcategory** | **String** | Subcategory of the transaction |  [optional]
**description** | **String** | Description of the transaction |  [optional]
**memo** | **String** | Memo attached to the transaction |  [optional]


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
DEBIT | &quot;Debit&quot;
CREDIT | &quot;Credit&quot;



