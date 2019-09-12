# HealthCheckResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ratio_result** | **float** | The ratio value | 
**_pass** | **bool** | A boolean indicating if ratio_result is sufficiently high. If ratio_result is greater than or equal to the corresponding value from ratio_targets, then pass is true. | 
**percentile_grade** | **int** | A linear percentile score for ratio_result on a scale from 0 to 100, where 100 represents the relevant value in ratio_targets. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


