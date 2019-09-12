# AtomApi::CreatePortfolioCommentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **String** | The ID of the portfolio that the comment falls under | 
**model_comment_id** | **String** | The ID of the corresponding model comment | 
**model_id** | **String** | The ID of the model to which the portfolio subscribes. Derived from the portfolio | 
**account_id** | **String** | The ID of the account to which the portfolio belongs. Derived from the portfolio | 
**is_read** | **BOOLEAN** | Indicates if the comment has been read. Defaults to false which indicates it has not been read | [optional] [default to false]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the portfolio comment | [optional] 
**create_date** | **String** | Datetime the portfolio comment was created | [optional] 


