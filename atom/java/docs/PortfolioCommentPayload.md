
# PortfolioCommentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the comment falls under | 
**modelCommentId** | [**UUID**](UUID.md) | The ID of the corresponding model comment | 
**modelId** | [**UUID**](UUID.md) | The ID of the model to which the portfolio subscribes. Derived from the portfolio | 
**accountId** | [**UUID**](UUID.md) | The ID of the account to which the portfolio belongs. Derived from the portfolio | 
**isRead** | **Boolean** | Indicates if the comment has been read. Defaults to false which indicates it has not been read |  [optional]
**secondaryId** | **String** |  |  [optional]



