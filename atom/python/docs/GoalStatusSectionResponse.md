# GoalStatusSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**on_track** | **bool** | If true, the goal is on track. | 
**progress** | **float** | The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon. | 
**goal_probability** | **float** | The probability of achieving the goal with the given portfolio. | 
**goal_achievement_score** | **int** | A ratio of goal_probability to the conf_tgt on a scale from 0 to 100. | 
**return_details** | [**dict(str, GoalReturnDetailsPeriodResponse)**](GoalReturnDetailsPeriodResponse.md) | Portfolio return information over the length of the horizon, broken down by period. | 
**adjusted_goal_amount** | **float** | The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


