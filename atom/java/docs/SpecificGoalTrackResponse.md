
# SpecificGoalTrackResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the goal track record |  [optional]
**createDate** | **String** | Datetime the goal track record was created |  [optional]
**goalId** | [**UUID**](UUID.md) | The ID of a goal to which the goal track record pertains | 
**clientId** | [**UUID**](UUID.md) | The ID of a client to whom the goal for the goal track record belongs |  [optional]
**goalAmount** | **Double** | Target amount for the goal |  [optional]
**accumulationHorizon** | **Double** | The time horizon of the goal during the accumulation phase, in years |  [optional]
**decumulationHorizon** | **Double** | The time horizon of the goal during the decumulation phase, in years |  [optional]
**accounts** | [**List&lt;UUID&gt;**](UUID.md) | List of accounts linked to the goal |  [optional]
**currentInvestment** | **Double** | The current amount invested toward the goal |  [optional]
**onTrack** | **Boolean** | Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default) |  [optional]
**progress** | **Double** | The goal progress percentage as a decimal |  [optional]
**goalProbability** | **Double** | The probability of achieving the goal with the client’s given investments |  [optional]
**goalAchievementScore** | **Double** | Probability of achieving the goal in relation to the confidence target of a simulation |  [optional]
**projectionBalance** | **Double** | The projected balance of the goal |  [optional]
**projectionDate** | [**LocalDate**](LocalDate.md) | The date of the projected balance of the goal |  [optional]
**statusTimeStamp** | **String** | Date and time to which this goal track record applies, defaults to the current timestamp |  [optional]
**metadata** | **Object** | Custom information associated with the goal track record in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the goal track record was last updated |  [optional]



