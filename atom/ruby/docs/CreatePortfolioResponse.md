# AtomApi::CreatePortfolioResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the portfolio such as “Stock” | 
**account_id** | **String** | The ID of the account to which the portfolio belongs | 
**model_id** | **String** | The ID of the model to which the portfolio subscribes | 
**percentage** | **Float** | Weight of the portfolio as a percentage of an account based on the weight of the portfolio’s model within the account’s allocation; ex. 20 representing 20%. If the account only has one portfolio input 100 | 
**description** | **String** | Description for the portfolio such as “Stock Portfolio” | [optional] 
**metadata** | **Object** | Custom information associated with the portfolio in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the portfolio | [optional] 
**create_date** | **String** | Datetime the portfolio was created | [optional] 


