
# MortgageCalculatorPeriodicpaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodicPayment** | [**BigDecimal**](BigDecimal.md) | The periodic monthly payment for the mortgage, given the other inputs provided by the user. | 
**totalPayment** | [**BigDecimal**](BigDecimal.md) | The total mortgage payments made over mortgage_term. | 
**totalPrincipal** | [**BigDecimal**](BigDecimal.md) | The total amount that went toward the mortgage principal. | 
**totalInterest** | [**BigDecimal**](BigDecimal.md) | The total amount that went toward the mortgage interest. | 
**totalHomeCost** | [**BigDecimal**](BigDecimal.md) | The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0. | 
**schedule** | [**Map&lt;String, MortgageSchedulePeriod&gt;**](MortgageSchedulePeriod.md) |  | 



