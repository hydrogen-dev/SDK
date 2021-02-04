# HydrogenProtonApi.MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secTypes** | **[String]** |  | 
**endDate** | **Date** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**tgtVal** | **Number** |  | [optional] [default to 0.0]
**tgtType** | **String** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**wConfig** | [**WConfig**](WConfig.md) |  | 
**startDate** | **Date** |  | [optional] 
**tickers** | **[String]** |  | 
**minAssets** | **Number** |  | 
**wAssetConfig** | **Object** |  | [optional] 


<a name="[SecTypesEnum]"></a>
## Enum: [SecTypesEnum]


* `major` (value: `"major"`)

* `minor` (value: `"minor"`)

* `cash` (value: `"cash"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




