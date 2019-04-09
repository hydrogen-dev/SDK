# atom_api.ScenarioAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** | A list of symbols for securities in the portfolio | 
**portfolioWeights** | **[Number]** |  | 
**frequencyInterval** | **String** | Frequency interval for returns, change_duration, and lag | 
**scenario** | [**[SensitivityFactor]**](SensitivityFactor.md) |  | 
**startDate** | **Date** | Start date of data | [optional] 
**endDate** | **Date** | End date of data | [optional] 
**tradingDaysPerYear** | **Number** | Number of trading days per year, used in calculations | [optional] 


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




