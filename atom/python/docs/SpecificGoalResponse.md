# SpecificGoalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the goal | [optional] 
**create_date** | **str** | Datetime the goal was created | [optional] 
**name** | **str** | Name of the goal | 
**parent_goal_id** | **str** | In the case that a goal is related to a broader goal, the ID of the broader goal | [optional] 
**questionnaire_id** | **str** | The ID of the group of questions that are used to customize a goal for a client | [optional] 
**is_decumulation** | **bool** | Indicator if the goal is a decumulation goal such as saving for retirement. Default is false, indicating that the goal is an accumulation goal. May be used in conjunction with the Proton API | [optional] [default to False]
**type** | **str** | Type of goal used to identify similar goals. Can be used to differentiate between goal templates and client-specific goals | [optional] 
**category** | **str** | Category of the goal used to group goals together. For example, different large purchase goals could have a type of ‘Major Purchase’ | [optional] 
**client_id** | **str** | If the goal is client-specific (not used by any other client), the ID of the client to which it belongs | [optional] 
**goal_amount** | **float** | If the goal is client-specific, the target monetary amount to be reached within the goal horizon. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity | [optional] 
**accumulation_horizon** | **float** | If the goal is client-specific, the time horizon of the goal during the accumulation phase, in years. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity | [optional] 
**decumulation_horizon** | **float** | If the goal is client-specific, the time horizon of the goal during the decumulation phase, in years. If the goal is an accumulation goal, then this can be 0 or omitted entirely. May be used in conjunction with the Proton API. If the goal is not client-specific, please store under the account entity | [optional] 
**is_active** | **bool** | Indicates if the goal is active. Defaults to true which indicates it is active | [optional] [default to True]
**metadata** | **object** | Custom information associated with the goal in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the goal was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


