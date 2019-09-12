# atom_api.QuestionnairePayloadQuestions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | A category for the question such as “Onboarding” or “Risk Profile” | [optional] 
**subcategory** | **String** | A subcategory for the question such as “Income-related” | [optional] 
**title** | **String** | Title for the question such as the body of the question or a header. Pairs with the description field | [optional] 
**description** | **String** | Description for the question such as additioonal question content. Pairs with the title field | [optional] 
**questionType** | **String** | The type of question structure such as “multiple_choice” or “free_form” | [optional] 
**orderIndex** | **String** | The order of the question within the questionnaire or category such as “1”, “2”, “3” | [optional] 
**document** | **String** | A reference link to a document related to the question | [optional] 
**image** | **String** | A reference link to an image associated with the question | [optional] 
**weight** | **Number** | The weight of the question as a percentage of the total questionnaire if each question does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the questions must add up to 100 | [optional] 
**isAccount** | **Boolean** | Indicates if the question is answered at an account-level | [optional] 
**metadata** | **Object** | Custom information associated with the question in the format key:value | [optional] 
**answers** | [**[QuestionnairePayloadAnswers]**](QuestionnairePayloadAnswers.md) |  | [optional] 


