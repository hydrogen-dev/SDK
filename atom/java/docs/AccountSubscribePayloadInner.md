
# AccountSubscribePayloadInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentWeight** | **Double** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategicWeight** | **Double** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**date** | [**LocalDate**](LocalDate.md) | Date of the account-allocation mapping used for historical tracking | 
**allocationId** | [**UUID**](UUID.md) | The ID of the allocation that is part of the account-allocation mapping | 
**goalId** | [**UUID**](UUID.md) | The ID of the goal that is associated with this account-allocation mapping |  [optional]



