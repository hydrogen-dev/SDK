
# MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wAssetConfig** | **Object** |  |  [optional]
**tgtType** | [**TgtTypeEnum**](#TgtTypeEnum) |  |  [optional]
**tgtVal** | **Float** |  |  [optional]
**minAssets** | **Integer** |  | 
**secTypes** | [**List&lt;SecTypesEnum&gt;**](#List&lt;SecTypesEnum&gt;) |  | 
**wConfig** | [**WConfig**](WConfig.md) |  | 
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**tickers** | **List&lt;String&gt;** |  | 
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum
Name | Value
---- | -----
RISK | &quot;risk&quot;
RETURN | &quot;return&quot;


<a name="List<SecTypesEnum>"></a>
## Enum: List&lt;SecTypesEnum&gt;
Name | Value
---- | -----
MAJOR | &quot;major&quot;
MINOR | &quot;minor&quot;
CASH | &quot;cash&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



