
# TransactionCode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | category |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**isBuy** | [**IsBuyEnum**](#IsBuyEnum) |  |  [optional]
**isFee** | [**IsFeeEnum**](#IsFeeEnum) |  |  [optional]
**isTransfer** | [**IsTransferEnum**](#IsTransferEnum) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**secondaryId** | **String** |  |  [optional]
**subcategory** | **String** | subcategory |  [optional]
**transactionCode** | **String** | transactionCode | 
**transactionCodeDescription** | **String** | transactionCodeDescription |  [optional]
**transactionType** | **String** | transactionType |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="IsBuyEnum"></a>
## Enum: IsBuyEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;
NULL | &quot;null&quot;


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



