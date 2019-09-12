# atom_api.SellAllPortfolioPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellTransactionCodeId** | **String** | The ID of the transaction code to denote a sell transaction | 
**buyTransactionCodeId** | **String** | The ID of the transaction code to denote a buy transaction | [optional] 
**buyThreshold** | **Number** | Buying threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**cashSecId** | **String** | The ID of the cash security for the portfolio | [optional] 
**commitOrders** | **Boolean** | Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed | [optional] [default to true]
**nonFractional** | **Boolean** | Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed | [optional] [default to false]
**portThreshold** | **Number** | Threshold for the portfolio as a monetary amount. Defaults to 0 | [optional] [default to 0.0]
**restrictionsOn** | **Boolean** | Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not | [optional] [default to false]
**sellThreshold** | **Number** | Selling threshold for the account as a monetary amount. Defaults to 0 | [optional] [default to 0.0]


