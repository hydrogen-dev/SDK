
# EmergencyFundCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**telecomPayments** | **Float** |  |  [optional]
**savingsHorizon** | **List&lt;Integer&gt;** |  |  [optional]
**insurancePayments** | **Float** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**interestRate** | **Float** |  |  [optional]
**otherExpenses** | **Object** |  |  [optional]
**emergencyFundDuration** | **Integer** |  | 
**debtPayments** | **Float** |  |  [optional]
**housingCost** | **Float** |  |  [optional]
**foodCosts** | **Float** |  |  [optional]
**utilityPayments** | **Float** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**transportationCosts** | **Float** |  |  [optional]
**lookbackPeriods** | **Integer** |  |  [optional]
**currentEmergencyFundBalance** | **Float** |  |  [optional]
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  |  [optional]


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



