# AccountCreateGoal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **str** | The ID of a goal mapped to the account | 
**goal_amount** | **float** | Monetary amount provided by the client as the target amount to be reached within the goal horizon. May be used in conjunction with the Proton API. Option to also store under the goal entity | [optional] 
**accumulation_horizon** | **float** | Time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. Option to also store under the goal entity | [optional] 
**decumulation_horizon** | **float** | Time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. Option to also store under the goal entity | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


