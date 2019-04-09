
# PortfolioRebalanceSellOnlyOrderPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code to denote a sell transaction | 
**buyTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code to denote a buy transaction |  [optional]
**cashSecId** | [**UUID**](UUID.md) | The ID of the cash security for the portfolio |  [optional]
**commitOrders** | **Boolean** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed |  [optional]
**nonFractional** | **Boolean** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed |  [optional]
**portThreshold** | **Double** | Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0 |  [optional]
**restrictionsOn** | **Boolean** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not |  [optional]
**buyThreshold** | **Double** | Buying threshold for the account as the number of shares. Defaults to 0 |  [optional]
**sellThreshold** | **Double** | Selling threshold for the account as the number of shares. Defaults to 0 |  [optional]
**useStrategic** | **Boolean** | Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not |  [optional]



