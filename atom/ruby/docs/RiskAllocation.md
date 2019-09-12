# AtomApi::RiskAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk_score** | **Float** | A risk score from 0 to 100 | 
**allocation_method** | **String** | The portfolio standard deviation | 
**opt_config** | [**RiskScoreOptConfigModel**](RiskScoreOptConfigModel.md) |  | [optional] 
**allocations** | **Array&lt;String&gt;** | The portfolio standard deviation | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


