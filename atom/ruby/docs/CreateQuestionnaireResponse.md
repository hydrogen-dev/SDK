# AtomApi::CreateQuestionnaireResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the questionnaire | 
**description** | **String** | Descriptions for additional information on the questionnaire | [optional] 
**decision_tree_id** | **String** | The ID of the decision tree that corresponds to the questionnaire | [optional] 
**type** | **String** | Type of questionnaire such as “retirement plan” | [optional] 
**questions** | [**Array&lt;QuestionnairePayloadQuestions&gt;**](QuestionnairePayloadQuestions.md) | List of questions to be answered as well as their respective answers and weights within the questionnaire | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the questionnaire | [optional] 
**create_date** | **String** | Datetime the questionnaire was created | [optional] 


