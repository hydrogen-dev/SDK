# HydrogenProtonApi.CardTransactionAuthorizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** |  | [optional] [default to 'null']
**partialAuth** | **Boolean** |  | [optional] [default to false]
**_date** | **Date** |  | 
**merchantCategoryCode** | **Number** |  | [optional] 
**cleanseData** | **Boolean** |  | [optional] [default to false]
**authType** | **[String]** |  | 
**amount** | **Number** |  | 
**transactionType** | **String** |  | 
**currencyCode** | **String** |  | 
**description** | **String** |  | [optional] [default to 'null']
**cardId** | **String** |  | 
**merchantCategory** | **String** |  | [optional] [default to 'null']


<a name="[AuthTypeEnum]"></a>
## Enum: [AuthTypeEnum]


* `balance` (value: `"balance"`)

* `spendingControl` (value: `"spending_control"`)




<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum


* `atmWithdrawal` (value: `"atm_withdrawal"`)

* `purchase` (value: `"purchase"`)




