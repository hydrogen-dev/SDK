# atom_api.BudgetPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the budget | 
**clientId** | **String** | The ID of the client the budget belongs to | 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the budget, limited to 3 characters. | 
**budget** | [**[BudgetPayloadBudget]**](BudgetPayloadBudget.md) |  | 
**frequencyUnit** | **String** | Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually | 
**frequency** | **Number** | Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1 | [optional] 
**accountId** | **String** | The ID of the account the budget belongs to | [optional] 
**goalId** | **String** | The ID of a goal mapped to the budget | [optional] 
**startDate** | **Date** | The start date for the budget | [optional] 
**endDate** | **Date** | The end date for the budget | [optional] 
**metadata** | **Object** | Custom information associated with the budget in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum


* `daily` (value: `"daily"`)

* `weekly` (value: `"weekly"`)

* `bi-weekly` (value: `"bi-weekly"`)

* `monthly` (value: `"monthly"`)

* `semi-monthly` (value: `"semi-monthly"`)

* `quarterly` (value: `"quarterly"`)

* `annually` (value: `"annually"`)




