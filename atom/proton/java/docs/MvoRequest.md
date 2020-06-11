
# MvoRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**tgtVal** | **Float** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**wConfig** | [**WConfig**](WConfig.md) |  | 
**secTypes** | [**List&lt;SecTypesEnum&gt;**](#List&lt;SecTypesEnum&gt;) |  | 
**tgtType** | [**TgtTypeEnum**](#TgtTypeEnum) |  |  [optional]
**minAssets** | **Integer** |  | 
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**wAssetConfig** | **Object** |  |  [optional]
**tickers** | **List&lt;String&gt;** |  | 


<a name="List<SecTypesEnum>"></a>
## Enum: List&lt;SecTypesEnum&gt;
Name | Value
---- | -----
MAJOR | &quot;major&quot;
MINOR | &quot;minor&quot;
CASH | &quot;cash&quot;


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum
Name | Value
---- | -----
RISK | &quot;risk&quot;
RETURN | &quot;return&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



