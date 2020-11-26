# HydrogenProtonApi.FinancialStatementAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodQuarter** | **Number** |  | [optional] 
**showHistory** | **Boolean** |  | [optional] [default to false]
**clientId** | **String** |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**accountingMethod** | **String** |  | 
**periodLength** | **String** |  | [optional] [default to 'quarterly']
**periodType** | **String** |  | [optional] 
**periodYear** | **Number** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**currencyCode** | **String** |  | [optional] 
**statNames** | **[String]** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**statementType** | **String** |  | [optional] [default to 'all']
**historyFrequencyInterval** | **String** |  | [optional] [default to 'month']
**periodMonth** | **Number** |  | [optional] 


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




<a name="[StatNamesEnum]"></a>
## Enum: [StatNamesEnum]


* `cash` (value: `"cash"`)

* `accountsReceivable` (value: `"accounts_receivable"`)

* `totalAssets` (value: `"total_assets"`)

* `accountsPayable` (value: `"accounts_payable"`)

* `totalLiabilities` (value: `"total_liabilities"`)

* `totalEquity` (value: `"total_equity"`)

* `totalRevenue` (value: `"total_revenue"`)

* `cogs` (value: `"cogs"`)

* `totalExpenses` (value: `"total_expenses"`)

* `operatingIncome` (value: `"operating_income"`)

* `grossProfit` (value: `"gross_profit"`)

* `netIncome` (value: `"net_income"`)

* `ebitda` (value: `"ebitda"`)




<a name="StatementTypeEnum"></a>
## Enum: StatementTypeEnum


* `incomeStatement` (value: `"income_statement"`)

* `balanceSheet` (value: `"balance_sheet"`)

* `all` (value: `"all"`)




<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum


* `day` (value: `"day"`)

* `week` (value: `"week"`)

* `month` (value: `"month"`)

* `quarter` (value: `"quarter"`)

* `year` (value: `"year"`)




