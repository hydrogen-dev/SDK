# SpecificNodeRelationshipResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the node relationship | [optional] 
**create_date** | **str** | Datetime the node relationship was created | [optional] 
**answer_id** | **str** | The ID of the answer to a question_id that corresponds to the node relationship | 
**value** | **str** | Value of the answer | 
**decision_tree_id** | **str** | The ID of the decision tree to which the node relationship belongs | 
**node_parent_id** | **str** | The ID for the parent node. | 
**node_child_id** | **str** | The ID for the child node. | [optional] 
**is_leaf** | **bool** | Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the node relationship was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


