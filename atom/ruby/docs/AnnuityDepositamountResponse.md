# AtomApi::AnnuityDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_amount** | **Float** | The amount to be deposited per period. | 
**deposit_frequency_interval** | **String** | The period interval to be used in relation to the deposit_amount. Defaults to year. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributinos added over the horizon. | 
**cumulative_annuity_amount** | **Float** | The total amount received from the annuity over the course of the plan. | 
**total_taxes** | **Float** | The total taxes paid on annuity payments over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, AnnuityReturnDetail&gt;**](AnnuityReturnDetail.md) |  | 


