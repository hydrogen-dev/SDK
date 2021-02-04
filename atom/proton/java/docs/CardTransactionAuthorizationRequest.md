
# CardTransactionAuthorizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** |  |  [optional]
**partialAuth** | **Boolean** |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**merchantCategoryCode** | **Integer** |  |  [optional]
**cleanseData** | **Boolean** |  |  [optional]
**authType** | [**List&lt;AuthTypeEnum&gt;**](#List&lt;AuthTypeEnum&gt;) |  | 
**amount** | **Float** |  | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  | 
**currencyCode** | **String** |  | 
**description** | **String** |  |  [optional]
**cardId** | [**UUID**](UUID.md) |  | 
**merchantCategory** | **String** |  |  [optional]


<a name="List<AuthTypeEnum>"></a>
## Enum: List&lt;AuthTypeEnum&gt;
Name | Value
---- | -----
BALANCE | &quot;balance&quot;
SPENDING_CONTROL | &quot;spending_control&quot;


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
ATM_WITHDRAWAL | &quot;atm_withdrawal&quot;
PURCHASE | &quot;purchase&quot;



