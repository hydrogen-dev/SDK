# AtomApi::AnnuityAmountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annuity_amount** | **Float** | The periodic annuity amount. | 
**annuity_frequency_interval** | **String** | The frequency at which annuity_amount is drawn from the portfolio. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributinos added over the horizon. | 
**cumulative_annuity_amount** | **Float** | The total amount received from the annuity over the course of the plan. | 
**total_taxes** | **Float** | The total taxes paid on annuity payments over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, AnnuityReturnDetail&gt;**](AnnuityReturnDetail.md) |  | 


