
# Score

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**UUID**](UUID.md) | accountId |  [optional]
**allocationId** | [**UUID**](UUID.md) | allocationId |  [optional]
**benchmarkId** | [**UUID**](UUID.md) | benchmarkId |  [optional]
**clientId** | [**UUID**](UUID.md) | clientId |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**goalId** | [**UUID**](UUID.md) | goalId |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | metadata |  [optional]
**modelId** | [**UUID**](UUID.md) | modelId |  [optional]
**portfolioId** | [**UUID**](UUID.md) | portfolioId |  [optional]
**scoreTimeStamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**scoreType** | [**ScoreTypeEnum**](#ScoreTypeEnum) | scoreType | 
**scoreValue** | **String** | scoreValue | 
**secondaryId** | **String** |  |  [optional]
**securityId** | [**UUID**](UUID.md) | securityId |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="ScoreTypeEnum"></a>
## Enum: ScoreTypeEnum
Name | Value
---- | -----
GOAL_ACHIEVEMENT_SCORE | &quot;goal_achievement_score&quot;
PORTFOLIO_OPTIMIZATION_SCORE | &quot;portfolio_optimization_score&quot;
CREDIT_SCORE | &quot;credit_score&quot;
DIMENSIONAL_RISK_SCORE | &quot;dimensional_risk_score&quot;
DIVERSIFICATION_SCORE | &quot;diversification_score&quot;
RISK_SCORE | &quot;risk_score&quot;
RISK_PROFILE | &quot;risk_profile&quot;



