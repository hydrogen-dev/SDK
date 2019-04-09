# SpecificPortfolioCommentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the portfolio comment | [optional] 
**create_date** | **str** | Datetime the portfolio comment was created | [optional] 
**portfolio_id** | **str** | The ID of the portfolio that the comment falls under | 
**model_comment_id** | **str** | The ID of the corresponding model comment | 
**model_id** | **str** | The ID of the model to which the portfolio subscribes. Derived from the portfolio | 
**account_id** | **str** | The ID of the account to which the portfolio belongs. Derived from the portfolio | 
**is_read** | **bool** | Indicates if the comment has been read. Defaults to false which indicates it has not been read | [optional] [default to False]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the portfolio comment was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


