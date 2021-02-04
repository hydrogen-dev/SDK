# HydrogenProtonApi.BusinessFinancialHealthCheckRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodLength** | **String** |  | [optional] [default to 'quarterly']
**netIncome** | **Number** |  | [optional] 
**periodMonth** | **Number** |  | [optional] 
**totalRevenue** | **Number** |  | [optional] 
**totalAssets** | **Number** |  | [optional] 
**clientId** | **String** |  | [optional] 
**accountingMethod** | **String** |  | [optional] 
**periodYear** | **Number** |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**totalLiabilities** | **Number** |  | [optional] 
**periodType** | **String** |  | [optional] 
**currencyCode** | **String** |  | [optional] 
**ratioTargets** | [**RatioTargets1**](RatioTargets1.md) |  | [optional] 
**totalEquity** | **Number** |  | [optional] 
**periodQuarter** | **Number** |  | [optional] 


<a name="PeriodLengthEnum"></a>
## Enum: PeriodLengthEnum


* `annual` (value: `"annual"`)

* `quarterly` (value: `"quarterly"`)

* `monthly` (value: `"monthly"`)

* `ytd` (value: `"ytd"`)

* `qtd` (value: `"qtd"`)

* `mtd` (value: `"mtd"`)




<a name="AccountingMethodEnum"></a>
## Enum: AccountingMethodEnum


* `accrual` (value: `"accrual"`)

* `cash` (value: `"cash"`)




<a name="PeriodTypeEnum"></a>
## Enum: PeriodTypeEnum


* `calendar` (value: `"calendar"`)

* `fiscal` (value: `"fiscal"`)




