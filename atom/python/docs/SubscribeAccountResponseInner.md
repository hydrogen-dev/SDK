# SubscribeAccountResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the portfolio | [optional] 
**name** | **str** | Name of the portfolio such as “Stock” | [optional] 
**account_id** | **str** | The ID of the account to which the portfolio belongs | [optional] 
**model_id** | **str** | The ID of the model to which the portfolio subscribes | [optional] 
**percentage** | **float** | Weight of the portfolio as a percentage of an account based on the weight of the portfolio’s model within the account’s allocation; ex. 20 representing 20%. If the account only has one portfolio input 100 | [optional] 
**description** | **str** | Description for the portfolio such as “Stock Portfolio” | [optional] 
**metadata** | **object** | Custom information associated with the portfolio in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**create_date** | **str** | Timestamp for the date and time that the record was created | [optional] 
**update_date** | **str** | Timestamp for the date and time that the record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


