
# BudgetPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the budget | 
**clientId** | [**UUID**](UUID.md) | The ID of the client the budget belongs to | 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the budget, limited to 3 characters. | 
**budget** | [**List&lt;BudgetPayloadBudget&gt;**](BudgetPayloadBudget.md) |  | 
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) | Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually | 
**frequency** | [**BigDecimal**](BigDecimal.md) | Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1 |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID of the account the budget belongs to |  [optional]
**goalId** | [**UUID**](UUID.md) | The ID of a goal mapped to the budget |  [optional]
**aggregationAccounts** | [**List&lt;BudgetPayloadAggregationAccounts&gt;**](BudgetPayloadAggregationAccounts.md) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | The start date for the budget |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | The end date for the budget |  [optional]
**metadata** | **Object** | Custom information associated with the budget in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum
Name | Value
---- | -----
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
BI_WEEKLY | &quot;bi-weekly&quot;
MONTHLY | &quot;monthly&quot;
SEMI_MONTHLY | &quot;semi-monthly&quot;
QUARTERLY | &quot;quarterly&quot;
ANNUALLY | &quot;annually&quot;



