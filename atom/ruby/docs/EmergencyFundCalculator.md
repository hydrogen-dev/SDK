# AtomApi::EmergencyFundCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emergency_fund_duration** | **Integer** | Number of periods the fund will last | 
**housing_cost** | **Float** | The user&#39;s housing costs, such as rent or mortgage payments | [optional] 
**utility_payments** | **Float** | Utility payments such as electricity or water | [optional] 
**telecom_payments** | **Float** | Telecom payments such as internet or cell phone payments | [optional] 
**insurance_payments** | **Float** | Insurance payments such as auto or home insurance | [optional] 
**debt_payments** | **Float** | Debt payments such as credit cards or loans | [optional] 
**transportation_costs** | **Float** | Transportation costs such as gasoline or car payments | [optional] 
**food_costs** | **Float** | Food costs such as groceries or restaurants | [optional] 
**other_expenses** | **Hash&lt;String, Float&gt;** | Other expenses to cover in the emergency fund | [optional] 
**current_emergency_fund_balance** | **Float** | The user&#39;s current emergency fund balance | [optional] 
**interest_rate** | **Float** | Annualized interest rate earned on the current fund balance | [optional] 
**savings_horizon** | **Array&lt;Integer&gt;** | Periods in the savings horizon to be used in the recommendation schedule | [optional] 
**frequency_unit** | **String** | Frequency unit used for all time intervals | [optional] [default to &#39;month&#39;]


