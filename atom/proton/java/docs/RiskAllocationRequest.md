
# RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**optConfig** | [**OptConfig**](OptConfig.md) |  |  [optional]
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
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



