
# GoalOptConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **List&lt;String&gt;** | List of symbols for securities included in the portfolio | 
**minAssets** | **Integer** | Minimum number of portfolio assets, excluding cash | 
**wConfig** | [**GoalWeightConfig**](GoalWeightConfig.md) |  |  [optional]
**wAssetConfig** | [**ERRORUNKNOWN**](ERRORUNKNOWN.md) | Weight constraints for asset classes |  [optional]
**secTypes** | [**List&lt;SecTypesEnum&gt;**](#List&lt;SecTypesEnum&gt;) | List of each security&#39;s type | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date for historical prices | 
**endDate** | [**LocalDate**](LocalDate.md) | End date for historical prices | 


<a name="List<SecTypesEnum>"></a>
## Enum: List&lt;SecTypesEnum&gt;
Name | Value
---- | -----
MAJOR | &quot;major&quot;
MINOR | &quot;minor&quot;
CASH | &quot;Cash&quot;



