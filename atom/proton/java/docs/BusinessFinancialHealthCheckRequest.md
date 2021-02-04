
# BusinessFinancialHealthCheckRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodLength** | [**PeriodLengthEnum**](#PeriodLengthEnum) |  |  [optional]
**netIncome** | **Float** |  |  [optional]
**periodMonth** | **Integer** |  |  [optional]
**totalRevenue** | **Float** |  |  [optional]
**totalAssets** | **Float** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) |  |  [optional]
**periodYear** | **Integer** |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**totalLiabilities** | **Float** |  |  [optional]
**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**ratioTargets** | [**RatioTargets1**](RatioTargets1.md) |  |  [optional]
**totalEquity** | **Float** |  |  [optional]
**periodQuarter** | **Integer** |  |  [optional]


<a name="PeriodLengthEnum"></a>
## Enum: PeriodLengthEnum
Name | Value
---- | -----
ANNUAL | &quot;annual&quot;
QUARTERLY | &quot;quarterly&quot;
MONTHLY | &quot;monthly&quot;
YTD | &quot;ytd&quot;
QTD | &quot;qtd&quot;
MTD | &quot;mtd&quot;


<a name="AccountingMethodEnum"></a>
## Enum: AccountingMethodEnum
Name | Value
---- | -----
ACCRUAL | &quot;accrual&quot;
CASH | &quot;cash&quot;


<a name="PeriodTypeEnum"></a>
## Enum: PeriodTypeEnum
Name | Value
---- | -----
CALENDAR | &quot;calendar&quot;
FISCAL | &quot;fiscal&quot;



