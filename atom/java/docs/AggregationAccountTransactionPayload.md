
# AggregationAccountTransactionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountId** | [**UUID**](UUID.md) | The ID of the aggregation account to which the transaction record belongs | 
**currencyCode** | **String** | Alphabetic currency code for the currency of the transaction, limited to 3 characters | 
**transactionDate** | **String** | The date the transaction took place | 
**bankCredit** | [**AggregationAccountTransactionPayloadBankCredit**](AggregationAccountTransactionPayloadBankCredit.md) |  |  [optional]
**investment** | [**AggregationAccountTransactionPayloadInvestment**](AggregationAccountTransactionPayloadInvestment.md) |  |  [optional]
**isExcludedAnalysis** | **Boolean** | Indicates if this transaction will be excluded from any spending or income analysis done in Proton tools. Defaults to “false” which indicates it will not be excluded from Proton analyses |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the aggregation account transaction in the format key:value |  [optional]



