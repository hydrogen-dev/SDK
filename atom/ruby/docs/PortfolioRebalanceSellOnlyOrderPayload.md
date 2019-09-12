# AtomApi::PortfolioRebalanceSellOnlyOrderPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sell_transaction_code_id** | **String** | The ID of the transaction code to denote a sell transaction | 
**buy_transaction_code_id** | **String** | The ID of the transaction code to denote a buy transaction | [optional] 
**cash_sec_id** | **String** | The ID of the cash security for the portfolio | [optional] 
**commit_orders** | **BOOLEAN** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to true]
**non_fractional** | **BOOLEAN** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to false]
**port_threshold** | **Float** | Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0 | [optional] [default to 0.0]
**restrictions_on** | **BOOLEAN** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to false]
**buy_threshold** | **Float** | Buying threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**sell_threshold** | **Float** | Selling threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**use_strategic** | **BOOLEAN** | Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not | [optional] [default to false]


