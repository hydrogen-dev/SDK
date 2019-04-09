
# SpecificQuestionnaireResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the questionnaire |  [optional]
**createDate** | **String** | Datetime the questionnaire was created |  [optional]
**name** | **String** | Name for the questionnaire | 
**description** | **String** | Descriptions for additional information on the questionnaire |  [optional]
**decisionTreeId** | [**UUID**](UUID.md) | The ID of the decision tree that corresponds to the questionnaire |  [optional]
**type** | **String** | Type of questionnaire such as “retirement plan” |  [optional]
**questions** | [**List&lt;QuestionnairePayloadQuestions&gt;**](QuestionnairePayloadQuestions.md) | List of questions to be answered as well as their respective answers and weights within the questionnaire |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the questionnaire was last updated |  [optional]



