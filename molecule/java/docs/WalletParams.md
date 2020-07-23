
# WalletParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletKeyId** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**isActive** | **Boolean** |  |  [optional]
**secondaryId** | **String** |  |  [optional]
**recordStatus** | **String** |  |  [optional]
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



