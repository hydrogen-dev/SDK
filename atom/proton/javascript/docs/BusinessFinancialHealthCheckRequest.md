# HydrogenProtonApi.BusinessFinancialHealthCheckRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodMonth** | **Number** |  | [optional] 
**periodQuarter** | **Number** |  | [optional] 
**clientId** | **String** |  | [optional] 
**totalLiabilities** | **Number** |  | [optional] 
**totalRevenue** | **Number** |  | [optional] 
**accountingMethod** | **String** |  | [optional] 
**ratioTargets** | [**RatioTargets1**](RatioTargets1.md) |  | [optional] 
**periodLength** | **String** |  | [optional] [default to 'quarterly']
**currencyConversion** | **String** |  | [optional] 
**periodType** | **String** |  | [optional] 
**periodYear** | **Number** |  | [optional] 
**totalAssets** | **Number** |  | [optional] 
**currencyCode** | **String** |  | [optional] 
**netIncome** | **Number** |  | [optional] 
**totalEquity** | **Number** |  | [optional] 


<a name="AccountingMethodEnum"></a>
## Enum: AccountingMethodEnum


* `accrual` (value: `"accrual"`)

* `cash` (value: `"cash"`)




<a name="PeriodLengthEnum"></a>
## Enum: PeriodLengthEnum


* `annual` (value: `"annual"`)

* `quarterly` (value: `"quarterly"`)

* `monthly` (value: `"monthly"`)

* `ytd` (value: `"ytd"`)

* `qtd` (value: `"qtd"`)

* `mtd` (value: `"mtd"`)




<a name="PeriodTypeEnum"></a>
## Enum: PeriodTypeEnum


* `calendar` (value: `"calendar"`)

* `fiscal` (value: `"fiscal"`)




