# RiskAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk_score** | **float** | A risk score from 0 to 100 | 
**allocation_method** | **str** | The portfolio standard deviation | 
**opt_config** | [**RiskScoreOptConfigModel**](RiskScoreOptConfigModel.md) |  | [optional] 
**allocations** | **list[str]** | The portfolio standard deviation | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


