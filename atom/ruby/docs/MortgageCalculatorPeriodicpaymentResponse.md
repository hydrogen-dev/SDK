# AtomApi::MortgageCalculatorPeriodicpaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodic_payment** | **Float** | The periodic monthly payment for the mortgage, given the other inputs provided by the user. | 
**total_payment** | **Float** | The total mortgage payments made over mortgage_term. | 
**total_principal** | **Float** | The total amount that went toward the mortgage principal. | 
**total_interest** | **Float** | The total amount that went toward the mortgage interest. | 
**total_home_cost** | **Float** | The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0. | 
**schedule** | [**Hash&lt;String, MortgageSchedulePeriod&gt;**](MortgageSchedulePeriod.md) |  | 


