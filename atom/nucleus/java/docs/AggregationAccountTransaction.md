
# AggregationAccountTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountId** | [**UUID**](UUID.md) | aggregationAccountId |  [optional]
**bankCredit** | [**BankCredit**](BankCredit.md) |  |  [optional]
**cash** | [**Cash**](Cash.md) |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**currencyCode** | **String** | currencyCode | 
**id** | [**UUID**](UUID.md) |  |  [optional]
**investment** | [**Investment**](Investment.md) |  |  [optional]
**isExcludedAnalysis** | **Boolean** |  |  [optional]
**isFee** | [**IsFeeEnum**](#IsFeeEnum) |  |  [optional]
**isRecurring** | **Boolean** |  |  [optional]
**isTransfer** | [**IsTransferEnum**](#IsTransferEnum) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**secondaryId** | **String** |  |  [optional]
**status** | **String** | status |  [optional]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | transactionDate | 
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="IsFeeEnum"></a>
## Enum: IsFeeEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;
NULL | &quot;null&quot;


<a name="IsTransferEnum"></a>
## Enum: IsTransferEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;
NULL | &quot;null&quot;



