
# TransactionCode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | category |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**isBuy** | **Boolean** | isBuy |  [optional]
**isFee** | **Boolean** | isFee |  [optional]
**isTransfer** | [**IsTransferEnum**](#IsTransferEnum) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**secondaryId** | **String** |  |  [optional]
**subcategory** | **String** | subcategory |  [optional]
**transactionCode** | **String** | transactionCode | 
**transactionCodeDescription** | **String** | transactionCodeDescription |  [optional]
**transactionType** | **String** | transactionType |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="IsTransferEnum"></a>
## Enum: IsTransferEnum
Name | Value
---- | -----
FALSE | &quot;FALSE&quot;
TRUE | &quot;TRUE&quot;
NULL | &quot;NULL&quot;



