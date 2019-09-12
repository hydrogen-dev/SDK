# atom_api.PortfolioCommentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | **String** | The ID of the portfolio that the comment falls under | 
**modelCommentId** | **String** | The ID of the corresponding model comment | 
**modelId** | **String** | The ID of the model to which the portfolio subscribes. Derived from the portfolio | 
**accountId** | **String** | The ID of the account to which the portfolio belongs. Derived from the portfolio | 
**isRead** | **Boolean** | Indicates if the comment has been read. Defaults to false which indicates it has not been read | [optional] [default to false]
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


