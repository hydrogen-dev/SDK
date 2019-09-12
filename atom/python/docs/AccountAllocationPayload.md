# AccountAllocationPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation_id** | **str** | The ID of the allocation that is part of the account-allocation mapping | 
**current_weight** | **float** | Current percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The current weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**strategic_weight** | **float** | Strategic percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The strategic weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**account_id** | **str** | The ID of the account that is part of the account-allocation mapping | 
**_date** | **date** | Date of the account-allocation mapping used for historical tracking | 
**goal_id** | **str** | The ID of the goal that is associated with this account-allocation mapping | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


