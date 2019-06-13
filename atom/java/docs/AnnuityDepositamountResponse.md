
# AnnuityDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The amount to be deposited per period. | 
**depositFrequencyInterval** | **String** | The period interval to be used in relation to the deposit_amount. Defaults to year. | 
**totalEarnings** | [**BigDecimal**](BigDecimal.md) | The total earnings generated over the horizon. | 
**totalContributions** | [**BigDecimal**](BigDecimal.md) | The total contributinos added over the horizon. | 
**cumulativeAnnuityAmount** | [**BigDecimal**](BigDecimal.md) | The total amount received from the annuity over the course of the plan. | 
**totalTaxes** | [**BigDecimal**](BigDecimal.md) | The total taxes paid on annuity payments over decumulation_horizon. | 
**returnDetails** | [**Map&lt;String, AnnuityReturnDetail&gt;**](AnnuityReturnDetail.md) |  | 



