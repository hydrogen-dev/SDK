# atom_api.RiskAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**riskScore** | **Number** | A risk score from 0 to 100 | 
**allocationMethod** | **String** | The portfolio standard deviation | 
**optConfig** | [**RiskScoreOptConfigModel**](RiskScoreOptConfigModel.md) |  | [optional] 
**allocations** | **[String]** | The portfolio standard deviation | [optional] 
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




