# AtomApi::SpecificAggregationAccountTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the aggregation account transaction | [optional] 
**create_date** | **String** | Datetime the aggregation account transaction was created | [optional] 
**aggregation_account_id** | **String** | The ID of the aggregation account to which the transaction record belongs | 
**currency_code** | **String** | Alphabetic currency code for the currency of the transaction, limited to 3 characters | 
**transaction_date** | **String** | The date the transaction took place | 
**bank_credit** | [**AggregationAccountTransactionPayloadBankCredit**](AggregationAccountTransactionPayloadBankCredit.md) |  | [optional] 
**investment** | [**AggregationAccountTransactionPayloadInvestment**](AggregationAccountTransactionPayloadInvestment.md) |  | [optional] 
**is_excluded_analysis** | **BOOLEAN** | Indicates if this transaction will be excluded from any spending or income analysis done in Proton tools. Defaults to “false” which indicates it will not be excluded from Proton analyses | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the aggregation account transaction in the format key:value | [optional] 
**update_date** | **String** | Datetime the aggregation account transaction was last updated | [optional] 


