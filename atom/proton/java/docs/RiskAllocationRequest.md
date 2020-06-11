
# RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**optConfig** | **Object** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) |  | 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;



