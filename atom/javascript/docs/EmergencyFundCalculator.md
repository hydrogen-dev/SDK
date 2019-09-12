# atom_api.EmergencyFundCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emergencyFundDuration** | **Number** | Number of periods the fund will last | 
**housingCost** | **Number** | The user&#39;s housing costs, such as rent or mortgage payments | [optional] 
**utilityPayments** | **Number** | Utility payments such as electricity or water | [optional] 
**telecomPayments** | **Number** | Telecom payments such as internet or cell phone payments | [optional] 
**insurancePayments** | **Number** | Insurance payments such as auto or home insurance | [optional] 
**debtPayments** | **Number** | Debt payments such as credit cards or loans | [optional] 
**transportationCosts** | **Number** | Transportation costs such as gasoline or car payments | [optional] 
**foodCosts** | **Number** | Food costs such as groceries or restaurants | [optional] 
**otherExpenses** | **{String: Number}** | Other expenses to cover in the emergency fund | [optional] 
**currentEmergencyFundBalance** | **Number** | The user&#39;s current emergency fund balance | [optional] 
**interestRate** | **Number** | Annualized interest rate earned on the current fund balance | [optional] 
**savingsHorizon** | **[Number]** | Periods in the savings horizon to be used in the recommendation schedule | [optional] 
**frequencyUnit** | **String** | Frequency unit used for all time intervals | [optional] [default to &#39;month&#39;]


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum


* `year` (value: `"year"`)

* `six_months` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `two_weeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)




