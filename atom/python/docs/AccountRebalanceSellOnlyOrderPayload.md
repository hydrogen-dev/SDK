# AccountRebalanceSellOnlyOrderPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sell_transaction_code_id** | **str** | The ID of the transaction code to denote a sell transaction | 
**buy_transaction_code_id** | **str** | The ID of the transaction code to denote a buy transaction | [optional] 
**cash_portfolio_id** | **str** | The ID of the cash portfolio for the account | [optional] 
**commit_orders** | **bool** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to True]
**non_fractional** | **bool** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to False]
**port_threshold** | **float** | Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0 | [optional] [default to 0.0]
**restrictions_on** | **bool** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to False]
**buy_threshold** | **float** | Buying threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**sell_threshold** | **float** | Selling threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**use_strategic** | **bool** | Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


