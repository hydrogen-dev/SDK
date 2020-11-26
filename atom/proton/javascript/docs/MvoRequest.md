# HydrogenProtonApi.MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wAssetConfig** | **Object** |  | [optional] 
**tgtType** | **String** |  | [optional] 
**tgtVal** | **Number** |  | [optional] [default to 0.0]
**minAssets** | **Number** |  | 
**secTypes** | **[String]** |  | 
**wConfig** | [**WConfig**](WConfig.md) |  | 
**endDate** | **Date** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**tickers** | **[String]** |  | 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `_return` (value: `"return"`)




<a name="[SecTypesEnum]"></a>
## Enum: [SecTypesEnum]


* `major` (value: `"major"`)

* `minor` (value: `"minor"`)

* `cash` (value: `"cash"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




