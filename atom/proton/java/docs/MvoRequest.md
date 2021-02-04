
# MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secTypes** | [**List&lt;SecTypesEnum&gt;**](#List&lt;SecTypesEnum&gt;) |  | 
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**tgtVal** | **Float** |  |  [optional]
**tgtType** | [**TgtTypeEnum**](#TgtTypeEnum) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**wConfig** | [**WConfig**](WConfig.md) |  | 
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**tickers** | **List&lt;String&gt;** |  | 
**minAssets** | **Integer** |  | 
**wAssetConfig** | **Object** |  |  [optional]


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


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum
Name | Value
---- | -----
RISK | &quot;risk&quot;
RETURN | &quot;return&quot;



