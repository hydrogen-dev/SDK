# HydrogenProtonApi.MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**tgtVal** | **Number** |  | [optional] [default to 0.0]
**endDate** | **Date** |  | [optional] 
**wConfig** | [**WConfig**](WConfig.md) |  | 
**secTypes** | **[String]** |  | 
**tgtType** | **String** |  | [optional] [default to 'null']
**minAssets** | **Number** |  | 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**wAssetConfig** | **Object** |  | [optional] 
**tickers** | **[String]** |  | 


<a name="[SecTypesEnum]"></a>
## Enum: [SecTypesEnum]


* `major` (value: `"major"`)

* `minor` (value: `"minor"`)

* `cash` (value: `"cash"`)




<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




