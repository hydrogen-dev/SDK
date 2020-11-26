
# BusinessFinancialHealthCheckRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodMonth** | **Integer** |  |  [optional]
**periodQuarter** | **Integer** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**totalLiabilities** | **Float** |  |  [optional]
**totalRevenue** | **Float** |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) |  |  [optional]
**ratioTargets** | [**RatioTargets1**](RatioTargets1.md) |  |  [optional]
**periodLength** | [**PeriodLengthEnum**](#PeriodLengthEnum) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional]
**periodYear** | **Integer** |  |  [optional]
**totalAssets** | **Float** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**netIncome** | **Float** |  |  [optional]
**totalEquity** | **Float** |  |  [optional]


<a name="AccountingMethodEnum"></a>
## Enum: AccountingMethodEnum
Name | Value
---- | -----
ACCRUAL | &quot;accrual&quot;
CASH | &quot;cash&quot;


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


<a name="PeriodTypeEnum"></a>
## Enum: PeriodTypeEnum
Name | Value
---- | -----
CALENDAR | &quot;calendar&quot;
FISCAL | &quot;fiscal&quot;



