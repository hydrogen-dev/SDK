
# EducationCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The deposit amount to meet the education goal. | 
**depositFrequencyInterval** | [**DepositFrequencyIntervalEnum**](#DepositFrequencyIntervalEnum) | The period interval to be used in relation to deposit_duration. | 
**projectedAccumulationSavings** | [**BigDecimal**](BigDecimal.md) | The projected balance at the end of accumulation_horizon. | 
**totalEarnings** | [**BigDecimal**](BigDecimal.md) | The total earnings generated over the horizon. | 
**totalContributions** | [**BigDecimal**](BigDecimal.md) | The total contributions added over the horizon. | 
**totalCost** | [**BigDecimal**](BigDecimal.md) | The total cost of education over the decumulation horizon, represented in future dollars. | 
**totalTaxes** | [**BigDecimal**](BigDecimal.md) | The total taxes paid on withdrawals over decumulation_horizon. | 
**returnDetails** | [**Map&lt;String, EducationCalculatorReturnDetail&gt;**](EducationCalculatorReturnDetail.md) |  | 


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



