
# AggregationAccountPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | The ID of a client to which the aggregation account belongs | 
**accountName** | **String** | The name of the held-away account for this aggregation account record | 
**institutionName** | **String** | The name of the institution holding the held-away account for this aggregation account record | 
**category** | **String** | Category for the held-away account such as “Bank Account” |  [optional]
**subcategory** | **String** | Subcategory for the held-away account such as “Checking Account” |  [optional]
**accountNumber** | **String** | The account number of the held-away account for this aggregation account record |  [optional]
**accountHolder** | **String** | The owner of the held-away account |  [optional]
**mask** | **String** | The masked version of the account number of the held-away account for this aggregation account record |  [optional]
**currencyCode** | **String** | Alphabetic currency code for the base currency of the account linked, limited to 3 characters |  [optional]
**isAsset** | **Boolean** | A flag to represent if this account is an asset or liability. Defaults to true which indicates it is an asset. If false this account is categorized as a liability |  [optional]
**financialOfferId** | [**UUID**](UUID.md) | ID of the financial offer this account matches. Useful so you don’t show clients offers for accounts they already have |  [optional]
**isActive** | **Boolean** | Indicates if the aggregation account record is active. Defaults to true which indicates it is active |  [optional]
**metadata** | **Object** | Custom information associated with the aggregation account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]



