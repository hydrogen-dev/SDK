
# ModelCompositionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelId** | [**UUID**](UUID.md) | The ID of the model whose holdings are to be updated | 
**holdings** | [**List&lt;ModelCompositionPayloadHoldings&gt;**](ModelCompositionPayloadHoldings.md) | The information for the new holding records to be created | 
**sellTransactionCodeId** | [**UUID**](UUID.md) | The transaction_code_id to be populated in any model transaction to sell securities | 
**buyTransactionCodeId** | [**UUID**](UUID.md) | The transaction_code_id to be populated in any model transaction to buy securities | 



