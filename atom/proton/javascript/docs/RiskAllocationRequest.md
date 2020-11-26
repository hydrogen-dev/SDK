# HydrogenProtonApi.RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optConfig** | [**OptConfig**](OptConfig.md) |  | [optional] 
**allocations** | **[String]** |  | [optional] 
**clientId** | **String** |  | [optional] 
**allocationMethod** | **String** |  | 
**riskScore** | **Number** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




