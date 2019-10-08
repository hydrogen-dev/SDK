
# EmergencyFundCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emergencyFundDuration** | **Integer** | Number of periods the fund will last | 
**housingCost** | [**BigDecimal**](BigDecimal.md) | The user&#39;s housing costs, such as rent or mortgage payments |  [optional]
**utilityPayments** | [**BigDecimal**](BigDecimal.md) | Utility payments such as electricity or water |  [optional]
**telecomPayments** | [**BigDecimal**](BigDecimal.md) | Telecom payments such as internet or cell phone payments |  [optional]
**insurancePayments** | [**BigDecimal**](BigDecimal.md) | Insurance payments such as auto or home insurance |  [optional]
**debtPayments** | [**BigDecimal**](BigDecimal.md) | Debt payments such as credit cards or loans |  [optional]
**transportationCosts** | [**BigDecimal**](BigDecimal.md) | Transportation costs such as gasoline or car payments |  [optional]
**foodCosts** | [**BigDecimal**](BigDecimal.md) | Food costs such as groceries or restaurants |  [optional]
**otherExpenses** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | Other expenses to cover in the emergency fund |  [optional]
**currentEmergencyFundBalance** | [**BigDecimal**](BigDecimal.md) | The user&#39;s current emergency fund balance |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) | Annualized interest rate earned on the current fund balance |  [optional]
**savingsHorizon** | **List&lt;Integer&gt;** | Periods in the savings horizon to be used in the recommendation schedule |  [optional]
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) | Frequency unit used for all time intervals |  [optional]


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;



