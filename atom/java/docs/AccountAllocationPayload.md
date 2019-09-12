
# AccountAllocationPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationId** | [**UUID**](UUID.md) | The ID of the allocation that is part of the account-allocation mapping | 
**currentWeight** | **Double** | Current percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The current weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**strategicWeight** | **Double** | Strategic percentage of the account’s total value that should be directed towards the allocation; ex. 20 representing 20%. The strategic weights for all allocations below an account must add up to 100. If the allocation is the only one, enter 100 | 
**accountId** | [**UUID**](UUID.md) | The ID of the account that is part of the account-allocation mapping | 
**date** | [**LocalDate**](LocalDate.md) | Date of the account-allocation mapping used for historical tracking | 
**goalId** | [**UUID**](UUID.md) | The ID of the goal that is associated with this account-allocation mapping |  [optional]



