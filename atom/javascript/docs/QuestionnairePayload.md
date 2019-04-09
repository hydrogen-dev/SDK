# atom_api.QuestionnairePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the questionnaire | 
**description** | **String** | Descriptions for additional information on the questionnaire | [optional] 
**decisionTreeId** | **String** | The ID of the decision tree that corresponds to the questionnaire | [optional] 
**type** | **String** | Type of questionnaire such as “retirement plan” | [optional] 
**questions** | [**[QuestionnairePayloadQuestions]**](QuestionnairePayloadQuestions.md) | List of questions to be answered as well as their respective answers and weights within the questionnaire | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


