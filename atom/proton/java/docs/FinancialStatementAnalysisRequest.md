
# FinancialStatementAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodQuarter** | **Integer** |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) |  | 
**periodLength** | [**PeriodLengthEnum**](#PeriodLengthEnum) |  |  [optional]
**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional]
**periodYear** | **Integer** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**statNames** | [**List&lt;StatNamesEnum&gt;**](#List&lt;StatNamesEnum&gt;) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**statementType** | [**StatementTypeEnum**](#StatementTypeEnum) |  |  [optional]
**historyFrequencyInterval** | [**HistoryFrequencyIntervalEnum**](#HistoryFrequencyIntervalEnum) |  |  [optional]
**periodMonth** | **Integer** |  |  [optional]


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


<a name="List<StatNamesEnum>"></a>
## Enum: List&lt;StatNamesEnum&gt;
Name | Value
---- | -----
CASH | &quot;cash&quot;
ACCOUNTS_RECEIVABLE | &quot;accounts_receivable&quot;
TOTAL_ASSETS | &quot;total_assets&quot;
ACCOUNTS_PAYABLE | &quot;accounts_payable&quot;
TOTAL_LIABILITIES | &quot;total_liabilities&quot;
TOTAL_EQUITY | &quot;total_equity&quot;
TOTAL_REVENUE | &quot;total_revenue&quot;
COGS | &quot;cogs&quot;
TOTAL_EXPENSES | &quot;total_expenses&quot;
OPERATING_INCOME | &quot;operating_income&quot;
GROSS_PROFIT | &quot;gross_profit&quot;
NET_INCOME | &quot;net_income&quot;
EBITDA | &quot;ebitda&quot;


<a name="StatementTypeEnum"></a>
## Enum: StatementTypeEnum
Name | Value
---- | -----
INCOME_STATEMENT | &quot;income_statement&quot;
BALANCE_SHEET | &quot;balance_sheet&quot;
ALL | &quot;all&quot;


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
YEAR | &quot;year&quot;



