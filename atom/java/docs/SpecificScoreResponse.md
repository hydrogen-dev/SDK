
# SpecificScoreResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the score |  [optional]
**createDate** | **String** | Datetime the score was created |  [optional]
**scoreType** | [**ScoreTypeEnum**](#ScoreTypeEnum) | The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score | 
**scoreValue** | **String** | The value of the score, which may be a number, a label, etc. | 
**clientId** | [**UUID**](UUID.md) | The ID of a client to which the score applies (if client-specific) |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID of an account to which the score applies (if account-specific) |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of a portfolio to which the score applies (if portfolio-specific) |  [optional]
**goalId** | [**UUID**](UUID.md) | The ID of a goal to which the score applies (if goal-specific) |  [optional]
**allocationId** | [**UUID**](UUID.md) | The ID of an allocation to which the score applies (if allocation-specific) |  [optional]
**modelId** | [**UUID**](UUID.md) | The ID of a model to which the score applies (if model-specific) |  [optional]
**benchmarkId** | [**UUID**](UUID.md) | The ID of a benchmark to which the score applies (if benchmark-specific) |  [optional]
**securityId** | [**UUID**](UUID.md) | The ID of a security to which the score applies (if security-specific) |  [optional]
**scoreTimeStamp** | **String** | Date and time for the score |  [optional]
**metadata** | **Object** | Custom information associated with the score in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the score was last updated |  [optional]


<a name="ScoreTypeEnum"></a>
## Enum: ScoreTypeEnum
Name | Value
---- | -----
RISK_SCORE | &quot;risk_score&quot;
DIMENSIONAL_RISK_SCORE | &quot;dimensional_risk_score&quot;
DIVERSIFICATION_SCORE | &quot;diversification_score&quot;
PORTFOLIO_OPTIMIZATION_SCORE | &quot;portfolio_optimization_score&quot;
GOAL_ACHIEVEMENT_SCORE | &quot;goal_achievement_score&quot;
CREDIT_SCORE | &quot;credit_score&quot;



