# atom_api.MortgageCalculatorDownpaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downPayment** | **Number** | The payment due upfront when buying a home, given the other inputs provided by the user. | 
**totalPayment** | **Number** | The total mortgage payments made over mortgage_term. | 
**totalPrincipal** | **Number** | The total amount that went toward the mortgage principal. | 
**totalInterest** | **Number** | The total amount that went toward the mortgage interest. | 
**totalHomeCost** | **Number** | The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0. | 
**schedule** | [**{String: MortgageSchedulePeriod}**](MortgageSchedulePeriod.md) |  | 


