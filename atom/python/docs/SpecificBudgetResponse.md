# SpecificBudgetResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the budget | [optional] 
**create_date** | **str** | Datetime the budget was created | [optional] 
**name** | **str** | Name of the budget | 
**client_id** | **str** | The ID of the client the budget belongs to | 
**currency_code** | **str** | Alphabetic currency code for the base currency of the budget, limited to 3 characters. | 
**budget** | [**list[BudgetPayloadBudget]**](BudgetPayloadBudget.md) |  | 
**frequency_unit** | **str** | Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually | 
**frequency** | **float** | Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1 | [optional] 
**account_id** | **str** | The ID of the account the budget belongs to | [optional] 
**goal_id** | **str** | The ID of a goal mapped to the budget | [optional] 
**aggregation_accounts** | [**list[BudgetPayloadAggregationAccounts]**](BudgetPayloadAggregationAccounts.md) |  | [optional] 
**start_date** | **date** | The start date for the budget | [optional] 
**end_date** | **date** | The end date for the budget | [optional] 
**metadata** | **object** | Custom information associated with the budget in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the budget was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


