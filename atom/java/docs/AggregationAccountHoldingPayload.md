
# AggregationAccountHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountId** | [**UUID**](UUID.md) | The unique identifier of the aggregation account the holding belongs | 
**currencyCode** | **String** | Alphabetic currency code for the currency of the holding, limited to 3 characters. |  [optional]
**ticker** | **String** | Ticker of the security holding | 
**tickerName** | **String** | Ticker name of the security holding | 
**shares** | **Double** | Number of shares of the security holding | 
**amount** | **Double** | Monetary amount of the security holding |  [optional]
**holdingType** | **String** | Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund” |  [optional]
**assetClass** | **String** | Asset class of the holding such as “US Equity” or “Fixed Income” |  [optional]
**price** | **Double** | Price of the security holding |  [optional]
**costBasis** | **Double** | The original value of the asset used for tax purposes, usually the purchase price |  [optional]
**exchange** | **String** | Financial exchange the security holding is traded on such as “NYSE or “NASDAQ” |  [optional]
**cusip** | **String** | The CUSIP of the security holding |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the aggregation account transaction in the format key:value |  [optional]



