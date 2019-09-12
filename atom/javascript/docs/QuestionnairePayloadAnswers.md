# atom_api.QuestionnairePayloadAnswers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Value for the answer option | 
**orderIndex** | **String** | The order of the answer option within the question or category such as “1”, “2”, “3” | [optional] 
**label** | **String** | A label to be assigned to the answer option for data labeling purposes | [optional] 
**image** | **String** | A reference link to an image associated with the answer option | [optional] 
**weight** | **Number** | The weight of the answer option as a percentage of the total questionnaire score if each answer does not contribute equally when calculating the final “score”; ex. 20 representing 20%. Weights of all the answers for a question must add up to 100 | [optional] 
**metadata** | **Object** | Custom information associated with the answer option in the format key:value | [optional] 


