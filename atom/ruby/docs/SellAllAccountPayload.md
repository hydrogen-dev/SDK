# AtomApi::SellAllAccountPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sell_transaction_code_id** | **String** | The ID of the transaction code to denote a sell transaction | 
**buy_transaction_code_id** | **String** | The ID of the transaction code to denote a buy transaction | [optional] 
**buy_threshold** | **Float** | Buying threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**cash_portfolio_id** | **String** | The ID of the cash portfolio for the account | [optional] 
**commit_orders** | **BOOLEAN** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to true]
**non_fractional** | **BOOLEAN** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to false]
**port_threshold** | **Float** | Threshold for the portfolio as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**restrictions_on** | **BOOLEAN** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to false]
**sell_threshold** | **Float** | Selling threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]


