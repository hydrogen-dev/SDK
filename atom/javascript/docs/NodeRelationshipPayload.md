# atom_api.NodeRelationshipPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerId** | **String** | The ID of the answer to a question_id that corresponds to the node relationship | 
**value** | **String** | Value of the answer | 
**decisionTreeId** | **String** | The ID of the decision tree to which the node relationship belongs | 
**nodeParentId** | **String** | The ID for the parent node. | 
**nodeChildId** | **String** | The ID for the child node. | [optional] 
**isLeaf** | **Boolean** | Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the node relationship in the format key:value | [optional] 


