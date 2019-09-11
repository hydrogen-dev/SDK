# AtomApi::SensitivityAnalysisResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_impact** | **Float** | Expected impact of sensitivity_factor on the portfolio&#39;s return. The associated unit of time is the base unit indicated by frequency_interval (for example, week &#x3D; 1 week). | 
**t_statistic** | **Float** | Raw t-statistic from the regression analysis, typically used to determine statistical significance of the regression coefficient. | 
**margin_of_error** | **Float** | Estimated margin of error pertaining to portfolio_impact at a 95% confidence level. | 

