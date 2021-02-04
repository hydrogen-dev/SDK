
# EventStudyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
DOT_COM_BUBBLE | &quot;dot_com_bubble&quot;
_2008_FINANCIAL_CRISIS | &quot;2008_financial_crisis&quot;
BREXIT | &quot;brexit&quot;
_2011_BLACK_MONDAY | &quot;2011_black_monday&quot;
SEPTEMBER_ELEVENTH | &quot;september_eleventh&quot;
_1987_BLACK_MONDAY | &quot;1987_black_monday&quot;
_1992_BLACK_WEDNESDAY | &quot;1992_black_wednesday&quot;
_1997_ASIAN_FINANCIAL_CRISIS | &quot;1997_asian_financial_crisis&quot;



