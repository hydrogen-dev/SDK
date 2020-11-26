# com\hydrogen\proton\GoalsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goalAccumulationAllocation**](GoalsApi.md#goalAccumulationAllocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
[**goalAccumulationRecommendation**](GoalsApi.md#goalAccumulationRecommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
[**goalAccumulationStatus**](GoalsApi.md#goalAccumulationStatus) | **POST** /goal_accumulation/status | Goal Accumulation Status
[**goalDecumulationAllocation**](GoalsApi.md#goalDecumulationAllocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
[**goalDecumulationRecommendation**](GoalsApi.md#goalDecumulationRecommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
[**goalDecumulationStatus**](GoalsApi.md#goalDecumulationStatus) | **POST** /goal_decumulation/status | Goal Decumulation Status


# **goalAccumulationAllocation**
> map[string,object] goalAccumulationAllocation($goal_accumulation_allocation_request)

Goal Accumulation Allocation

Allocate based on an accumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_accumulation_allocation_request = new \com\hydrogen\proton\Model\GoalAccumulationAllocationRequest(); // \com\hydrogen\proton\Model\GoalAccumulationAllocationRequest | Request payload for Goal Accumulation Allocation

try {
    $result = $apiInstance->goalAccumulationAllocation($goal_accumulation_allocation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalAccumulationAllocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_allocation_request** | [**\com\hydrogen\proton\Model\GoalAccumulationAllocationRequest**](../Model/GoalAccumulationAllocationRequest.md)| Request payload for Goal Accumulation Allocation |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **goalAccumulationRecommendation**
> map[string,object] goalAccumulationRecommendation($goal_accumulation_recommendation_request)

Goal Accumulation Recommendation

Generate recommendations to achieve an accumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_accumulation_recommendation_request = new \com\hydrogen\proton\Model\GoalAccumulationRecommendationRequest(); // \com\hydrogen\proton\Model\GoalAccumulationRecommendationRequest | Request payload for Goal Accumulation Recommendation

try {
    $result = $apiInstance->goalAccumulationRecommendation($goal_accumulation_recommendation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalAccumulationRecommendation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_recommendation_request** | [**\com\hydrogen\proton\Model\GoalAccumulationRecommendationRequest**](../Model/GoalAccumulationRecommendationRequest.md)| Request payload for Goal Accumulation Recommendation |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **goalAccumulationStatus**
> map[string,object] goalAccumulationStatus($goal_accumulation_status_request)

Goal Accumulation Status

Track the status of an accumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_accumulation_status_request = new \com\hydrogen\proton\Model\GoalAccumulationStatusRequest(); // \com\hydrogen\proton\Model\GoalAccumulationStatusRequest | Request payload for Goal Accumulation Status

try {
    $result = $apiInstance->goalAccumulationStatus($goal_accumulation_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalAccumulationStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_status_request** | [**\com\hydrogen\proton\Model\GoalAccumulationStatusRequest**](../Model/GoalAccumulationStatusRequest.md)| Request payload for Goal Accumulation Status |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **goalDecumulationAllocation**
> map[string,object] goalDecumulationAllocation($goal_decumulation_allocation_request)

Goal Decumulation Allocation

Allocate based on a decumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_decumulation_allocation_request = new \com\hydrogen\proton\Model\GoalDecumulationAllocationRequest(); // \com\hydrogen\proton\Model\GoalDecumulationAllocationRequest | Request payload for Goal Decumulation Allocation

try {
    $result = $apiInstance->goalDecumulationAllocation($goal_decumulation_allocation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalDecumulationAllocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_allocation_request** | [**\com\hydrogen\proton\Model\GoalDecumulationAllocationRequest**](../Model/GoalDecumulationAllocationRequest.md)| Request payload for Goal Decumulation Allocation |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **goalDecumulationRecommendation**
> map[string,object] goalDecumulationRecommendation($goal_decumulation_recommendation_request)

Goal Decumulation Recommendation

Generate recommendations to achieve a decumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_decumulation_recommendation_request = new \com\hydrogen\proton\Model\GoalDecumulationRecommendationRequest(); // \com\hydrogen\proton\Model\GoalDecumulationRecommendationRequest | Request payload for Goal Decumulation Recommendation

try {
    $result = $apiInstance->goalDecumulationRecommendation($goal_decumulation_recommendation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalDecumulationRecommendation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_recommendation_request** | [**\com\hydrogen\proton\Model\GoalDecumulationRecommendationRequest**](../Model/GoalDecumulationRecommendationRequest.md)| Request payload for Goal Decumulation Recommendation |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **goalDecumulationStatus**
> map[string,object] goalDecumulationStatus($goal_decumulation_status_request)

Goal Decumulation Status

Track the status of a decumulation goal

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}$apiInstance = new com\hydrogen\proton\Api\GoalsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_decumulation_status_request = new \com\hydrogen\proton\Model\GoalDecumulationStatusRequest(); // \com\hydrogen\proton\Model\GoalDecumulationStatusRequest | Request payload for Goal Decumulation Status

try {
    $result = $apiInstance->goalDecumulationStatus($goal_decumulation_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalsApi->goalDecumulationStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_status_request** | [**\com\hydrogen\proton\Model\GoalDecumulationStatusRequest**](../Model/GoalDecumulationStatusRequest.md)| Request payload for Goal Decumulation Status |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

