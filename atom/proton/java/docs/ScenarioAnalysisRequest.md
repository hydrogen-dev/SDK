
# ScenarioAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradingDaysPerYear** | **Integer** |  |  [optional]
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  | 
**createLog** | **Boolean** |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**scenario** | [**List&lt;SensitivityFactor&gt;**](SensitivityFactor.md) |  | 
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



