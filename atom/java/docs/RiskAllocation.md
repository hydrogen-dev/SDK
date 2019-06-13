
# RiskAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**riskScore** | [**BigDecimal**](BigDecimal.md) | A risk score from 0 to 100 | 
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) | The portfolio standard deviation | 
**optConfig** | [**RiskScoreOptConfigModel**](RiskScoreOptConfigModel.md) |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) | The portfolio standard deviation |  [optional]


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;



