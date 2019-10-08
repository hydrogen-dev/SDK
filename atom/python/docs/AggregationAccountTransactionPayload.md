# AggregationAccountTransactionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_id** | **str** | The ID of the aggregation account to which the transaction record belongs | 
**currency_code** | **str** | Alphabetic currency code for the currency of the transaction, limited to 3 characters | 
**transaction_date** | **str** | The date the transaction took place | 
**bank_credit** | [**AggregationAccountTransactionPayloadBankCredit**](AggregationAccountTransactionPayloadBankCredit.md) |  | [optional] 
**investment** | [**AggregationAccountTransactionPayloadInvestment**](AggregationAccountTransactionPayloadInvestment.md) |  | [optional] 
**is_excluded_analysis** | **bool** | Indicates if this transaction will be excluded from any spending or income analysis done in Proton tools. Defaults to “false” which indicates it will not be excluded from Proton analyses | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the aggregation account transaction in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


