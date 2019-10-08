# atom_api.AccountStagePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name or label of the account stage such as “Pending Funding” or “Fully Funded” | 
**description** | **String** | Description of what the step along the registration process that the account stage represents | [optional] 
**orderIndex** | **Number** | Indicator for where along the process the account stage falls. Generally, the higher the order index, the further along the process | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the account stage in the format key:value | [optional] 


