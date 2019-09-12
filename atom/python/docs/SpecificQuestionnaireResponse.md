# SpecificQuestionnaireResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the questionnaire | [optional] 
**create_date** | **str** | Datetime the questionnaire was created | [optional] 
**name** | **str** | Name for the questionnaire | 
**description** | **str** | Descriptions for additional information on the questionnaire | [optional] 
**decision_tree_id** | **str** | The ID of the decision tree that corresponds to the questionnaire | [optional] 
**type** | **str** | Type of questionnaire such as “retirement plan” | [optional] 
**questions** | [**list[QuestionnairePayloadQuestions]**](QuestionnairePayloadQuestions.md) | List of questions to be answered as well as their respective answers and weights within the questionnaire | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the questionnaire was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


