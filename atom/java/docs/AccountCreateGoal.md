
# AccountCreateGoal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | [**UUID**](UUID.md) | The ID of a goal mapped to the account | 
**goalAmount** | **Double** | Monetary amount provided by the client as the target amount to be reached within the goal horizon. May be used in conjunction with the Proton API. Option to also store under the goal entity |  [optional]
**accumulationHorizon** | **Double** | Time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. Option to also store under the goal entity |  [optional]
**decumulationHorizon** | **Double** | Time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. Option to also store under the goal entity |  [optional]


