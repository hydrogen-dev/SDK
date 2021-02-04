
# BudgetDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  | 
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**budget** | [**List&lt;BudgetComponent&gt;**](BudgetComponent.md) |  |  [optional]
**totalValue** | **Float** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccounts** | [**List&lt;BudgetAggregationAccount&gt;**](BudgetAggregationAccount.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**frequency** | **Integer** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum
Name | Value
---- | -----
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
BI_WEEKLY | &quot;bi-weekly&quot;
MONTHLY | &quot;monthly&quot;
QUARTERLY | &quot;quarterly&quot;
ANNUALLY | &quot;annually&quot;



