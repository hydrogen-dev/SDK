
# WalletResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**walletKeyId** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**isActive** | **Boolean** |  |  [optional]
**secondaryId** | **String** |  |  [optional]
**recordStatus** | **String** |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**clients** | [**List&lt;WalletClients&gt;**](WalletClients.md) |  |  [optional]
**metadata** | **Object** |  |  [optional]
**tokenWhitelists** | [**List&lt;TokenWhitelists&gt;**](TokenWhitelists.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INDIVIDUAL | &quot;individual&quot;
BUSINESS | &quot;business&quot;
TRUST | &quot;trust&quot;
CONTRACT | &quot;contract&quot;



