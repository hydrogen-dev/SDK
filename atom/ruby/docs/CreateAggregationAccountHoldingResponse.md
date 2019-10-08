# AtomApi::CreateAggregationAccountHoldingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_id** | **String** | The unique identifier of the aggregation account the holding belongs | 
**currency_code** | **String** | Alphabetic currency code for the currency of the holding, limited to 3 characters. | [optional] 
**ticker** | **String** | Ticker of the security holding | 
**ticker_name** | **String** | Ticker name of the security holding | 
**shares** | **Float** | Number of shares of the security holding | 
**amount** | **Float** | Monetary amount of the security holding | [optional] 
**holding_type** | **String** | Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund” | [optional] 
**asset_class** | **String** | Asset class of the holding such as “US Equity” or “Fixed Income” | [optional] 
**price** | **Float** | Price of the security holding | [optional] 
**cost_basis** | **Float** | The original value of the asset used for tax purposes, usually the purchase price | [optional] 
**exchange** | **String** | Financial exchange the security holding is traded on such as “NYSE or “NASDAQ” | [optional] 
**cusip** | **String** | The CUSIP of the security holding | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the aggregation account transaction in the format key:value | [optional] 
**id** | **String** | ID of the aggregation account holding | [optional] 
**create_date** | **String** | Datetime the aggregation account holding was created | [optional] 


