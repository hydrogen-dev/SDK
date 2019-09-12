
# CreateNodeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the node | 
**questionId** | [**UUID**](UUID.md) | The ID of the question that corresponds to this node | 
**isFirst** | **Boolean** | Indicates if this is the first node of the decision tree. Defaults to false meaning it is not the first node |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the node in the format key:value |  [optional]
**id** | [**UUID**](UUID.md) | ID of the node |  [optional]
**createDate** | **String** | Datetime the node was created |  [optional]



