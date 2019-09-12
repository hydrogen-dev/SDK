
# EventStudy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** | Tickers of portfolio holdings | 
**portfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Weights of portfolio holdings | 
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Historical events to analyze |  [optional]
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. |  [optional]


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



