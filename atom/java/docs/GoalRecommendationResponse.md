
# GoalRecommendationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onTrack** | **Boolean** | If true, the goal is on track. | 
**progress** | [**BigDecimal**](BigDecimal.md) | The goal progress percentage, defined as the current invested amount divided by the total target withdrawal amount over d_horizon. | 
**goalProbability** | [**BigDecimal**](BigDecimal.md) | The probability of achieving the goal with the given portfolio. | 
**goalAchievementScore** | **Integer** | A ratio of goal_probability to the conf_tgt on a scale from 0 to 100. | 
**action** | [**List&lt;GoalRecommendationResponseAction&gt;**](GoalRecommendationResponseAction.md) |  | 
**returnDetails** | [**Map&lt;String, GoalReturnDetailsPeriodResponse&gt;**](GoalReturnDetailsPeriodResponse.md) | Portfolio return information over the length of the horizon, broken down by period. | 
**adjustedGoalAmount** | [**BigDecimal**](BigDecimal.md) | The effective goal target amount, adjusted for taxes, inflation, and goal deviation threshold. | 



