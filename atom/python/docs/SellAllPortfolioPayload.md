# SellAllPortfolioPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sell_transaction_code_id** | **str** | The ID of the transaction code to denote a sell transaction | 
**buy_transaction_code_id** | **str** | The ID of the transaction code to denote a buy transaction | [optional] 
**buy_threshold** | **float** | Buying threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**cash_sec_id** | **str** | The ID of the cash security for the portfolio | [optional] 
**commit_orders** | **bool** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to True]
**non_fractional** | **bool** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to False]
**port_threshold** | **float** | Threshold for the portfolio as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**restrictions_on** | **bool** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to False]
**sell_threshold** | **float** | Selling threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


