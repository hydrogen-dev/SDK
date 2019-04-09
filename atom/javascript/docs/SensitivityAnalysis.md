# atom_api.SensitivityAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** | A list of symbols for securities in the portfolio | 
**portfolioWeights** | **[Number]** |  | 
**frequencyInterval** | **String** | Frequency interval for returns, change_duration, and lag | 
**sensitivityFactor** | **Object** |  | 
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




