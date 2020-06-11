# com\hydrogen\RiskScoringApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensionalRiskScore**](RiskScoringApi.md#dimensionalRiskScore) | **POST** /dimensional_risk_score | Dimensional Risk Score
[**riskAllocation**](RiskScoringApi.md#riskAllocation) | **POST** /risk_allocation | Risk Allocation
[**riskScore**](RiskScoringApi.md#riskScore) | **POST** /risk_score | Risk Score


# **dimensionalRiskScore**
> map[string,object] dimensionalRiskScore($dimensional_risk_score_request)

Dimensional Risk Score

Calculate a dimensional risk score based on questionnaire responses

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\RiskScoringApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dimensional_risk_score_request = new \com\hydrogen\Model\DimensionalRiskScoreRequest(); // \com\hydrogen\Model\DimensionalRiskScoreRequest | Request payload for Dimensional Risk Score

try {
    $result = $apiInstance->dimensionalRiskScore($dimensional_risk_score_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RiskScoringApi->dimensionalRiskScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensional_risk_score_request** | [**\com\hydrogen\Model\DimensionalRiskScoreRequest**](../Model/DimensionalRiskScoreRequest.md)| Request payload for Dimensional Risk Score |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **riskAllocation**
> map[string,object] riskAllocation($risk_allocation_request)

Risk Allocation

Allocate based on a risk score

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\RiskScoringApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$risk_allocation_request = new \com\hydrogen\Model\RiskAllocationRequest(); // \com\hydrogen\Model\RiskAllocationRequest | Request payload for Risk Allocation

try {
    $result = $apiInstance->riskAllocation($risk_allocation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RiskScoringApi->riskAllocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_allocation_request** | [**\com\hydrogen\Model\RiskAllocationRequest**](../Model/RiskAllocationRequest.md)| Request payload for Risk Allocation |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **riskScore**
> map[string,object] riskScore($risk_score_request)

Risk Score

Calculate a risk score based on questionnaire responses

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\RiskScoringApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$risk_score_request = new \com\hydrogen\Model\RiskScoreRequest(); // \com\hydrogen\Model\RiskScoreRequest | Request payload for Risk Score

try {
    $result = $apiInstance->riskScore($risk_score_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RiskScoringApi->riskScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_score_request** | [**\com\hydrogen\Model\RiskScoreRequest**](../Model/RiskScoreRequest.md)| Request payload for Risk Score |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

