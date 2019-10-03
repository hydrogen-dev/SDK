# SpecificPortfolioResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the portfolio | [optional] 
**create_date** | **str** | Datetime the portfolio was created | [optional] 
**name** | **str** | Name of the portfolio such as “Stock” | 
**account_id** | **str** | The ID of the account to which the portfolio belongs | 
**model_id** | **str** | The ID of the model to which the portfolio subscribes | 
**percentage** | **float** | Weight of the portfolio as a percentage of an account based on the weight of the portfolio’s model within the account’s allocation; ex. 20 representing 20%. If the account only has one portfolio input 100 | 
**description** | **str** | Description for the portfolio such as “Stock Portfolio” | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the portfolio, limited to 3 characters | [optional] 
**metadata** | **object** | Custom information associated with the portfolio in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the portfolio was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


