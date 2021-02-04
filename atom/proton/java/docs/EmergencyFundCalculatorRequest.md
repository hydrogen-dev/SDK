
# EmergencyFundCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**foodCosts** | **Float** |  |  [optional]
**housingCost** | **Float** |  |  [optional]
**debtPayments** | **Float** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**utilityPayments** | **Float** |  |  [optional]
**insurancePayments** | **Float** |  |  [optional]
**transportationCosts** | **Float** |  |  [optional]
**lookbackPeriods** | **Integer** |  |  [optional]
**emergencyFundDuration** | **Integer** |  | 
**interestRate** | **Float** |  |  [optional]
**telecomPayments** | **Float** |  |  [optional]
**savingsHorizon** | **List&lt;Integer&gt;** |  |  [optional]
**otherExpenses** | **Object** |  |  [optional]
**currentEmergencyFundBalance** | **Float** |  |  [optional]


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



