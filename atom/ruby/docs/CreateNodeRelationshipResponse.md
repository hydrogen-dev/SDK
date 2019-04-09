# AtomApi::CreateNodeRelationshipResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer_id** | **String** | The ID of the answer to a question_id that corresponds to the node relationship | 
**value** | **String** | Value of the answer | 
**decision_tree_id** | **String** | The ID of the decision tree to which the node relationship belongs | 
**node_parent_id** | **String** | The ID for the parent node. | 
**node_child_id** | **String** | The ID for the child node. | [optional] 
**is_leaf** | **BOOLEAN** | Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the node relationship | [optional] 
**create_date** | **String** | Datetime the node relationship was created | [optional] 


