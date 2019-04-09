# atom_api.GoalTrackPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | **String** | The ID of a goal to which the goal track record pertains | 
**clientId** | **String** | The ID of a client to whom the goal for the goal track record belongs | [optional] 
**goalAmount** | **Number** | Target amount for the goal | [optional] 
**accumulationHorizon** | **Number** | The time horizon of the goal during the accumulation phase, in years | [optional] 
**decumulationHorizon** | **Number** | The time horizon of the goal during the decumulation phase, in years | [optional] 
**accounts** | **[String]** | List of accounts linked to the goal | [optional] 
**currentInvestment** | **Number** | The current amount invested toward the goal | [optional] 
**onTrack** | **Boolean** | Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default) | [optional] 
**progress** | **Number** | The goal progress percentage as a decimal | [optional] 
**goalProbability** | **Number** | The probability of achieving the goal with the client’s given investments | [optional] 
**goalAchievementScore** | **Number** | Probability of achieving the goal in relation to the confidence target of a simulation | [optional] 
**projectionBalance** | **Number** | The projected balance of the goal | [optional] 
**projectionDate** | **Date** | The date of the projected balance of the goal | [optional] 
**statusTimeStamp** | **String** | Date and time to which this goal track record applies, defaults to the current timestamp | [optional] 
**metadata** | **Object** | Custom information associated with the goal track record in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


