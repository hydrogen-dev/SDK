# AtomApi::SpecificScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the score | [optional] 
**create_date** | **String** | Datetime the score was created | [optional] 
**score_type** | **String** | The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score | 
**score_value** | **String** | The value of the score, which may be a number, a label, etc. | 
**client_id** | **String** | The ID of a client to which the score applies (if client-specific) | [optional] 
**account_id** | **String** | The ID of an account to which the score applies (if account-specific) | [optional] 
**portfolio_id** | **String** | The ID of a portfolio to which the score applies (if portfolio-specific) | [optional] 
**goal_id** | **String** | The ID of a goal to which the score applies (if goal-specific) | [optional] 
**allocation_id** | **String** | The ID of an allocation to which the score applies (if allocation-specific) | [optional] 
**model_id** | **String** | The ID of a model to which the score applies (if model-specific) | [optional] 
**benchmark_id** | **String** | The ID of a benchmark to which the score applies (if benchmark-specific) | [optional] 
**security_id** | **String** | The ID of a security to which the score applies (if security-specific) | [optional] 
**score_time_stamp** | **String** | Date and time for the score | [optional] 
**metadata** | **Object** | Custom information associated with the score in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the score was last updated | [optional] 


