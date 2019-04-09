# atom_api.SubscribeAccountResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the portfolio | [optional] 
**name** | **String** | Name of the portfolio such as “Stock” | [optional] 
**accountId** | **String** | The ID of the account to which the portfolio belongs | [optional] 
**modelId** | **String** | The ID of the model to which the portfolio subscribes | [optional] 
**percentage** | **Number** | Weight of the portfolio as a percentage of an account based on the weight of the portfolio’s model within the account’s allocation; ex. 20 representing 20%. If the account only has one portfolio input 100 | [optional] 
**description** | **String** | Description for the portfolio such as “Stock Portfolio” | [optional] 
**metadata** | **Object** | Custom information associated with the portfolio in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**createDate** | **String** | Timestamp for the date and time that the record was created | [optional] 
**updateDate** | **String** | Timestamp for the date and time that the record was last updated | [optional] 


