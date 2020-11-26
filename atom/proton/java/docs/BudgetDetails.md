
# BudgetDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccounts** | [**List&lt;BudgetAggregationAccount&gt;**](BudgetAggregationAccount.md) |  |  [optional]
**totalValue** | **Float** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**budget** | [**List&lt;BudgetComponent&gt;**](BudgetComponent.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**frequency** | **Integer** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  | 


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



