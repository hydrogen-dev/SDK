# AtomApi::HealthCheckResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ratio_result** | **Float** | The ratio value | 
**pass** | **BOOLEAN** | A boolean indicating if ratio_result is sufficiently high. If ratio_result is greater than or equal to the corresponding value from ratio_targets, then pass is true. | 
**percentile_grade** | **Integer** | A linear percentile score for ratio_result on a scale from 0 to 100, where 100 represents the relevant value in ratio_targets. | 


