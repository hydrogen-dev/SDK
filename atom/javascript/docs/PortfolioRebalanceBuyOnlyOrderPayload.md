# atom_api.PortfolioRebalanceBuyOnlyOrderPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyTransactionCodeId** | **String** | The ID of the transaction code to denote a buy transaction | 
**sellTransactionCodeId** | **String** | The ID of the transaction code to denote a sell transaction | [optional] 
**buyThreshold** | **Number** | Buying threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**cashSecId** | **String** | The ID of the cash security for the portfolio | [optional] 
**commitOrders** | **Boolean** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to true]
**nonFractional** | **Boolean** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to false]
**portThreshold** | **Number** | Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0 | [optional] [default to 0.0]
**restrictionsOn** | **Boolean** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to false]
**sellThreshold** | **Number** | Selling threshold for the account as the number of shares. Defaults to 0 | [optional] [default to 0.0]
**useStrategic** | **Boolean** | Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not | [optional] [default to false]


