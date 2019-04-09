# AtomApi::GoalStatusSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**on_track** | **BOOLEAN** | If true, the goal is on track. | 
**progress** | **Float** | The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon. | 
**goal_probability** | **Float** | The probability of achieving the goal with the given portfolio. | 
**goal_achievement_score** | **Integer** | A ratio of goal_probability to the conf_tgt on a scale from 0 to 100. | 
**return_details** | [**Hash&lt;String, GoalReturnDetailsPeriodResponse&gt;**](GoalReturnDetailsPeriodResponse.md) | Portfolio return information over the length of the horizon, broken down by period. | 
**adjusted_goal_amount** | **Float** | The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold. | 


