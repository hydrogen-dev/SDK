# HydrogenProtonApi.RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**allocations** | **[String]** |  | [optional] 
**clientId** | **String** |  | [optional] 
**optConfig** | [**OptConfig**](OptConfig.md) |  | [optional] 
**riskScore** | **Number** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**allocationMethod** | **String** |  | 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




