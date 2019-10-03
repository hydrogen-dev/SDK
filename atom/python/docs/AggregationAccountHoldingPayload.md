# AggregationAccountHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_id** | **str** | The unique identifier of the aggregation account the holding belongs | 
**currency_code** | **str** | Alphabetic currency code for the currency of the holding, limited to 3 characters. | [optional] 
**ticker** | **str** | Ticker of the security holding | 
**ticker_name** | **str** | Ticker name of the security holding | 
**shares** | **float** | Number of shares of the security holding | 
**amount** | **float** | Monetary amount of the security holding | [optional] 
**holding_type** | **str** | Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund” | [optional] 
**asset_class** | **str** | Asset class of the holding such as “US Equity” or “Fixed Income” | [optional] 
**price** | **float** | Price of the security holding | [optional] 
**cost_basis** | **float** | The original value of the asset used for tax purposes, usually the purchase price | [optional] 
**exchange** | **str** | Financial exchange the security holding is traded on such as “NYSE or “NASDAQ” | [optional] 
**cusip** | **str** | The CUSIP of the security holding | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the aggregation account transaction in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


