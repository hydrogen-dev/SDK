# AtomApi::GoalRecommendationConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommend** | **BOOLEAN** | If True, generate a recommended action | [optional] [default to true]
**inv_min** | **Float** | The minimum initial investment amount | [optional] 
**inv_max** | **Float** | The maximum initial investment amount | [optional] 
**dep_min** | **Float** | The minimum recurring deposit amount | [optional] 
**dep_max** | **Float** | The maximum recurring deposit amount | [optional] 
**horizon_min** | **Integer** | The minimum number of periods that decumulation could be delayed | [optional] 
**horizon_max** | **Integer** | The maximum number of periods that decumulation could be delayed | [optional] 
**recommended_inflation** | **Float** | The annualized inflation rate for the recommendation | [optional] 


