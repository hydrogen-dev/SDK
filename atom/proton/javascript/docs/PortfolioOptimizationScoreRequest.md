# HydrogenProtonApi.PortfolioOptimizationScoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optConfig** | [**OptConfig1**](OptConfig1.md) |  | [optional] 
**tgtType** | **String** |  | [optional] [default to 'return']
**portfolioTickers** | **[String]** |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**aggregationAccountId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**modelId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**accountId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**portfolioId** | **String** |  | [optional] 


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




