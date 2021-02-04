# HydrogenProtonApi.PortfolioOptimizationScoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**modelId** | **String** |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**optConfig** | [**OptConfig1**](OptConfig1.md) |  | [optional] 
**allocationId** | **String** |  | [optional] 
**tgtType** | **String** |  | [optional] [default to 'return']
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**accountId** | **String** |  | [optional] 
**aggregationAccountId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




