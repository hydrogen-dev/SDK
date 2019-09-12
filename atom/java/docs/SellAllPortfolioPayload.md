
# SellAllPortfolioPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code to denote a sell transaction | 
**buyTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code to denote a buy transaction |  [optional]
**buyThreshold** | **Double** | Buying threshold for the account as a monetary amount. Defaults to 0 |  [optional]
**cashSecId** | [**UUID**](UUID.md) | The ID of the cash security for the portfolio |  [optional]
**commitOrders** | **Boolean** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed |  [optional]
**nonFractional** | **Boolean** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed |  [optional]
**portThreshold** | **Double** | Threshold for the portfolio as a monetary amount. Defaults to 0 |  [optional]
**restrictionsOn** | **Boolean** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not |  [optional]
**sellThreshold** | **Double** | Selling threshold for the account as a monetary amount. Defaults to 0 |  [optional]



