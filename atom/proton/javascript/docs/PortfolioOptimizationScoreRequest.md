# HydrogenProtonApi.PortfolioOptimizationScoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**portfolioTickers** | **[String]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**modelId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**accountId** | **String** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 
**tgtType** | **String** |  | [optional] [default to 'return']
**aggregationAccountId** | **String** |  | [optional] 
**optConfig** | **Object** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




