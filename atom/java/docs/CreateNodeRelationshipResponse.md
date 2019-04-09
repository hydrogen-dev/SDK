
# CreateNodeRelationshipResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerId** | [**UUID**](UUID.md) | The ID of the answer to a question_id that corresponds to the node relationship | 
**value** | **String** | Value of the answer | 
**decisionTreeId** | [**UUID**](UUID.md) | The ID of the decision tree to which the node relationship belongs | 
**nodeParentId** | [**UUID**](UUID.md) | The ID for the parent node. | 
**nodeChildId** | [**UUID**](UUID.md) | The ID for the child node. |  [optional]
**isLeaf** | **Boolean** | Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the node relationship |  [optional]
**createDate** | **String** | Datetime the node relationship was created |  [optional]


