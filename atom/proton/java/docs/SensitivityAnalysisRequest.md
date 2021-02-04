
# SensitivityAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  | 
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**sensitivityFactor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



