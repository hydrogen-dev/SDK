
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
**mask** | **String** | The masked version of the account number of the held-away account for this aggregation account record |  [optional]
**currencyCode** | **String** | Alphabetic currency code for the base currency of the account linked, limited to 3 characters |  [optional]
**isActive** | **Boolean** | Indicates if the aggregation account record is active. Defaults to true which indicates it is active |  [optional]
**metadata** | **Object** | Custom information associated with the aggregation account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]



