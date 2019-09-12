# AtomApi::BudgetPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the budget | 
**client_id** | **String** | The ID of the client the budget belongs to | 
**currency_code** | **String** | Alphabetic currency code for the base currency of the budget, limited to 3 characters. | 
**budget** | [**Array&lt;BudgetPayloadBudget&gt;**](BudgetPayloadBudget.md) |  | 
**frequency_unit** | **String** | Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually | 
**frequency** | **Float** | Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1 | [optional] 
**account_id** | **String** | The ID of the account the budget belongs to | [optional] 
**goal_id** | **String** | The ID of a goal mapped to the budget | [optional] 
**aggregation_accounts** | [**Array&lt;BudgetPayloadAggregationAccounts&gt;**](BudgetPayloadAggregationAccounts.md) |  | [optional] 
**start_date** | **Date** | The start date for the budget | [optional] 
**end_date** | **Date** | The end date for the budget | [optional] 
**metadata** | **Object** | Custom information associated with the budget in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


