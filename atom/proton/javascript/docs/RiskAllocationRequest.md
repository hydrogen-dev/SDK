# HydrogenProtonApi.RiskAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | **[String]** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**clientId** | **String** |  | [optional] 
**riskScore** | **Number** |  | [optional] 
**optConfig** | **Object** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**allocationMethod** | **String** |  | 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




