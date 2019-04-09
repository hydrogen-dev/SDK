# QuestionnairePayloadQuestions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | A category for the question such as “Onboarding” or “Risk Profile” | [optional] 
**subcategory** | **str** | A subcategory for the question such as “Income-related” | [optional] 
**title** | **str** | Title for the question such as the body of the question or a header. Pairs with the description field | [optional] 
**description** | **str** | Description for the question such as additioonal question content. Pairs with the title field | [optional] 
**question_type** | **str** | The type of question structure such as “multiple_choice” or “free_form” | [optional] 
**order_index** | **str** | The order of the question within the questionnaire or category such as “1”, “2”, “3” | [optional] 
**document** | **str** | A reference link to a document related to the question | [optional] 
**image** | **str** | A reference link to an image associated with the question | [optional] 
**weight** | **float** | The weight of the question as a percentage of the total questionnaire if each question does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the questions must add up to 100 | [optional] 
**is_account** | **bool** | Indicates if the question is answered at an account-level | [optional] 
**metadata** | **object** | Custom information associated with the question in the format key:value | [optional] 
**answers** | [**list[QuestionnairePayloadAnswers]**](QuestionnairePayloadAnswers.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


