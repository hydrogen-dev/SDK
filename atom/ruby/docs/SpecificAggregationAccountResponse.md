# AtomApi::SpecificAggregationAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the aggregation account | [optional] 
**create_date** | **String** | Datetime the aggregation account was created | [optional] 
**client_id** | **String** | The ID of a client to which the aggregation account belongs | 
**account_name** | **String** | The name of the held-away account for this aggregation account record | 
**institution_name** | **String** | The name of the institution holding the held-away account for this aggregation account record | 
**category** | **String** | Category for the held-away account such as “Bank Account” | [optional] 
**subcategory** | **String** | Subcategory for the held-away account such as “Checking Account” | [optional] 
**account_number** | **String** | The account number of the held-away account for this aggregation account record | [optional] 
**account_holder** | **String** | The owner of the held-away account | [optional] 
**mask** | **String** | The masked version of the account number of the held-away account for this aggregation account record | [optional] 
**currency_code** | **String** | Alphabetic currency code for the base currency of the account linked, limited to 3 characters | [optional] 
**is_asset** | **BOOLEAN** | A flag to represent if this account is an asset or liability. Defaults to true which indicates it is an asset. If false this account is categorized as a liability | [optional] 
**financial_offer_id** | **String** | ID of the financial offer this account matches. Useful so you don’t show clients offers for accounts they already have | [optional] 
**is_active** | **BOOLEAN** | Indicates if the aggregation account record is active. Defaults to true which indicates it is active | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the aggregation account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Latest datetime the aggregatino account was updated | [optional] 


