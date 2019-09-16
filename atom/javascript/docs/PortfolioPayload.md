# atom_api.PortfolioPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the portfolio such as “Stock” | 
**accountId** | **String** | The ID of the account to which the portfolio belongs | 
**modelId** | **String** | The ID of the model to which the portfolio subscribes | 
**percentage** | **Number** | Weight of the portfolio as a percentage of an account based on the weight of the portfolio’s model within the account’s allocation; ex. 20 representing 20%. If the account only has one portfolio input 100 | 
**description** | **String** | Description for the portfolio such as “Stock Portfolio” | [optional] 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the portfolio, limited to 3 characters | [optional] 
**metadata** | **Object** | Custom information associated with the portfolio in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


