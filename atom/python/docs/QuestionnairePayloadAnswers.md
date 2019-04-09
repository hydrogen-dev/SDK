# QuestionnairePayloadAnswers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Value for the answer option | 
**order_index** | **str** | The order of the answer option within the question or category such as “1”, “2”, “3” | [optional] 
**label** | **str** | A label to be assigned to the answer option for data labeling purposes | [optional] 
**image** | **str** | A reference link to an image associated with the answer option | [optional] 
**weight** | **float** | The weight of the answer option as a percentage of the total questionnaire score if each answer does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the answers for a question must add up to 100 | [optional] 
**metadata** | **object** | Custom information associated with the answer option in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


