
# RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optConfig** | [**OptConfig**](OptConfig.md) |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) |  | 
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



