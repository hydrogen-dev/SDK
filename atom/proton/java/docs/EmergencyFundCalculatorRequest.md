
# EmergencyFundCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**telecomPayments** | **Float** |  |  [optional]
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  |  [optional]
**debtPayments** | **Float** |  |  [optional]
**lookbackPeriods** | **Integer** |  |  [optional]
**emergencyFundDuration** | **Integer** |  | 
**housingCost** | **Float** |  |  [optional]
**insurancePayments** | **Float** |  |  [optional]
**interestRate** | **Float** |  |  [optional]
**otherExpenses** | **Object** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**currentEmergencyFundBalance** | **Float** |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**utilityPayments** | **Float** |  |  [optional]
**savingsHorizon** | **List&lt;Integer&gt;** |  |  [optional]
**foodCosts** | **Float** |  |  [optional]
**transportationCosts** | **Float** |  |  [optional]


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



