# atom_api.GoalStatusSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onTrack** | **Boolean** | If true, the goal is on track. | 
**progress** | **Number** | The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon. | 
**goalProbability** | **Number** | The probability of achieving the goal with the given portfolio. | 
**goalAchievementScore** | **Number** | A ratio of goal_probability to the conf_tgt on a scale from 0 to 100. | 
**returnDetails** | [**{String: GoalReturnDetailsPeriodResponse}**](GoalReturnDetailsPeriodResponse.md) | Portfolio return information over the length of the horizon, broken down by period. | 
**adjustedGoalAmount** | **Number** | The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold. | 


