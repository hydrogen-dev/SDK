# MortgageCalculatorDownpaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**down_payment** | **float** | The payment due upfront when buying a home, given the other inputs provided by the user. | 
**total_payment** | **float** | The total mortgage payments made over mortgage_term. | 
**total_principal** | **float** | The total amount that went toward the mortgage principal. | 
**total_interest** | **float** | The total amount that went toward the mortgage interest. | 
**total_home_cost** | **float** | The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0. | 
**schedule** | [**dict(str, MortgageSchedulePeriod)**](MortgageSchedulePeriod.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


