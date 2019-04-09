# atom_api.AccountAllocationPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationId** | **String** | The ID of the allocation that is part of the account-allocation mapping | 
**currentWeight** | **Number** | Current percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The current weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**strategicWeight** | **Number** | Strategic percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The strategic weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**accountId** | **String** | The ID of the account that is part of the account-allocation mapping | 
**_date** | **Date** | Date of the account-allocation mapping used for historical tracking | 
**goalId** | **String** | The ID of the goal that is associated with this account-allocation mapping | [optional] 


