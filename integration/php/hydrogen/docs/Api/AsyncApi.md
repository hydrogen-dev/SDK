# com\hydrogen\integration\AsyncApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsyncData**](AsyncApi.md#getAsyncData) | **GET** /async/{integration_type}/{service} | Create async transaction for GET endpoints for bulk data
[**getAsyncData1**](AsyncApi.md#getAsyncData1) | **GET** /async/{integration_type}/{service}/{id} | Create async transaction for GET endpoints for bulk data
[**getAsyncData2**](AsyncApi.md#getAsyncData2) | **POST** /async/{integration_type}/{service} | Create async transaction for POST endpoints for bulk data
[**getAsyncStatus**](AsyncApi.md#getAsyncStatus) | **GET** /async/status/{id} | Get Status of async transaction created through GET/POST endpoints


# **getAsyncData**
> \com\hydrogen\integration\Model\AsyncTransaction getAsyncData($id, $integration_type, $service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AsyncApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | UUID id
$integration_type = "integration_type_example"; // string | String integration_type
$service = "service_example"; // string | String service

try {
    $result = $apiInstance->getAsyncData($id, $integration_type, $service);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AsyncApi->getAsyncData: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| UUID id |
 **integration_type** | **string**| String integration_type |
 **service** | **string**| String service |

### Return type

[**\com\hydrogen\integration\Model\AsyncTransaction**](../Model/AsyncTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAsyncData1**
> \com\hydrogen\integration\Model\AsyncTransaction getAsyncData1($id, $integration_type, $service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AsyncApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | UUID id
$integration_type = "integration_type_example"; // string | String integration_type
$service = "service_example"; // string | String service

try {
    $result = $apiInstance->getAsyncData1($id, $integration_type, $service);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AsyncApi->getAsyncData1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| UUID id |
 **integration_type** | **string**| String integration_type |
 **service** | **string**| String service |

### Return type

[**\com\hydrogen\integration\Model\AsyncTransaction**](../Model/AsyncTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAsyncData2**
> \com\hydrogen\integration\Model\AsyncTransaction getAsyncData2($data, $integration_type, $service)

Create async transaction for POST endpoints for bulk data

Create async transaction for POST endpoints for bulk data

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AsyncApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$data = new \com\hydrogen\integration\Model\JsonNode(); // \com\hydrogen\integration\Model\JsonNode | data
$integration_type = "integration_type_example"; // string | String integration_type
$service = "service_example"; // string | String service

try {
    $result = $apiInstance->getAsyncData2($data, $integration_type, $service);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AsyncApi->getAsyncData2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**\com\hydrogen\integration\Model\JsonNode**](../Model/JsonNode.md)| data |
 **integration_type** | **string**| String integration_type |
 **service** | **string**| String service |

### Return type

[**\com\hydrogen\integration\Model\AsyncTransaction**](../Model/AsyncTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAsyncStatus**
> \com\hydrogen\integration\Model\AsyncTransactionVO getAsyncStatus($id)

Get Status of async transaction created through GET/POST endpoints

Get Status of async transaction created through GET/POST endpoints

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AsyncApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | UUID Async Transaction Id

try {
    $result = $apiInstance->getAsyncStatus($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AsyncApi->getAsyncStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| UUID Async Transaction Id |

### Return type

[**\com\hydrogen\integration\Model\AsyncTransactionVO**](../Model/AsyncTransactionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

