# atom_api.ScorePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scoreType** | **String** | The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score | 
**scoreValue** | **String** | The value of the score, which may be a number, a label, etc. | 
**clientId** | **String** | The ID of a client to which the score applies (if client-specific) | [optional] 
**accountId** | **String** | The ID of an account to which the score applies (if account-specific) | [optional] 
**portfolioId** | **String** | The ID of a portfolio to which the score applies (if portfolio-specific) | [optional] 
**goalId** | **String** | The ID of a goal to which the score applies (if goal-specific) | [optional] 
**allocationId** | **String** | The ID of an allocation to which the score applies (if allocation-specific) | [optional] 
**modelId** | **String** | The ID of a model to which the score applies (if model-specific) | [optional] 
**benchmarkId** | **String** | The ID of a benchmark to which the score applies (if benchmark-specific) | [optional] 
**securityId** | **String** | The ID of a security to which the score applies (if security-specific) | [optional] 
**scoreTimeStamp** | **String** | Date and time for the score | [optional] 
**metadata** | **Object** | Custom information associated with the score in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


<a name="ScoreTypeEnum"></a>
## Enum: ScoreTypeEnum


* `risk_score` (value: `"risk_score"`)

* `dimensional_risk_score` (value: `"dimensional_risk_score"`)

* `diversification_score` (value: `"diversification_score"`)

* `portfolio_optimization_score` (value: `"portfolio_optimization_score"`)

* `goal_achievement_score` (value: `"goal_achievement_score"`)

* `credit_score` (value: `"credit_score"`)




