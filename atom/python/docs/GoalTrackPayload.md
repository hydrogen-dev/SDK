# GoalTrackPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **str** | The ID of a goal to which the goal track record pertains | 
**client_id** | **str** | The ID of a client to whom the goal for the goal track record belongs | [optional] 
**goal_amount** | **float** | Target amount for the goal | [optional] 
**accumulation_horizon** | **float** | The time horizon of the goal during the accumulation phase, in years | [optional] 
**decumulation_horizon** | **float** | The time horizon of the goal during the decumulation phase, in years | [optional] 
**accounts** | **list[str]** | List of accounts linked to the goal | [optional] 
**current_investment** | **float** | The current amount invested toward the goal | [optional] 
**on_track** | **bool** | Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default) | [optional] 
**progress** | **float** | The goal progress percentage as a decimal | [optional] 
**goal_probability** | **float** | The probability of achieving the goal with the client’s given investments | [optional] 
**goal_achievement_score** | **float** | Probability of achieving the goal in relation to the confidence target of a simulation | [optional] 
**projection_balance** | **float** | The projected balance of the goal | [optional] 
**projection_date** | **date** | The date of the projected balance of the goal | [optional] 
**status_time_stamp** | **str** | Date and time to which this goal track record applies, defaults to the current timestamp | [optional] 
**metadata** | **object** | Custom information associated with the goal track record in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


