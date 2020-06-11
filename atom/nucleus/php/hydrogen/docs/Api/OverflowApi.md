# com\hydrogen\OverflowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOverflowSettingsUsingPost**](OverflowApi.md#createOverflowSettingsUsingPost) | **POST** /overflow_setting | Create a Overflow Settings request
[**createOverflowUsingPost**](OverflowApi.md#createOverflowUsingPost) | **POST** /overflow | Create a Overflow request
[**deleteOverflowSettingsUsingDelete**](OverflowApi.md#deleteOverflowSettingsUsingDelete) | **DELETE** /overflow_setting/{overflow_settings_id} | Delete a overflow settings
[**getOverflowAllUsingGet**](OverflowApi.md#getOverflowAllUsingGet) | **GET** /overflow | List all overflow objects
[**getOverflowSettingsAllUsingGet**](OverflowApi.md#getOverflowSettingsAllUsingGet) | **GET** /overflow_setting | List all overflow settings
[**getOverflowSettingsUsingGet**](OverflowApi.md#getOverflowSettingsUsingGet) | **GET** /overflow_setting/{overflow_settings_id} | Retrieve a Overflow Setting
[**getOverflowUsingGet**](OverflowApi.md#getOverflowUsingGet) | **GET** /overflow/{overflow_id} | Retrieve a Overflow object
[**updateOverflowSettingsUsingPut**](OverflowApi.md#updateOverflowSettingsUsingPut) | **PUT** /overflow_setting/{overflow_settings_id} | Update a overflow settings


# **createOverflowSettingsUsingPost**
> \com\hydrogen\Model\OverflowSettings createOverflowSettingsUsingPost($overflow_settings)

Create a Overflow Settings request

Create a new Overflow Settings request.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_settings = new \com\hydrogen\Model\OverflowSettings(); // \com\hydrogen\Model\OverflowSettings | overflowSettings

try {
    $result = $apiInstance->createOverflowSettingsUsingPost($overflow_settings);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->createOverflowSettingsUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**\com\hydrogen\Model\OverflowSettings**](../Model/OverflowSettings.md)| overflowSettings |

### Return type

[**\com\hydrogen\Model\OverflowSettings**](../Model/OverflowSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOverflowUsingPost**
> \com\hydrogen\Model\Overflow createOverflowUsingPost($overflow_vo)

Create a Overflow request

Create a new Overflow request.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_vo = new \com\hydrogen\Model\Overflow(); // \com\hydrogen\Model\Overflow | overflowVO

try {
    $result = $apiInstance->createOverflowUsingPost($overflow_vo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->createOverflowUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_vo** | [**\com\hydrogen\Model\Overflow**](../Model/Overflow.md)| overflowVO |

### Return type

[**\com\hydrogen\Model\Overflow**](../Model/Overflow.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOverflowSettingsUsingDelete**
> deleteOverflowSettingsUsingDelete($overflow_settings_id)

Delete a overflow settings

Permanently delete a  overflow settings registered with your firm.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_settings_id = "overflow_settings_id_example"; // string | UUID overflow_settings_id

try {
    $apiInstance->deleteOverflowSettingsUsingDelete($overflow_settings_id);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->deleteOverflowSettingsUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**string**](../Model/.md)| UUID overflow_settings_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOverflowAllUsingGet**
> \com\hydrogen\Model\PageOverflow_ getOverflowAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all overflow objects

Get details for all overflow.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOverflowAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->getOverflowAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageOverflow_**](../Model/PageOverflow_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOverflowSettingsAllUsingGet**
> \com\hydrogen\Model\PageOverflowSettings_ getOverflowSettingsAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all overflow settings

Get details for all overflow setting.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOverflowSettingsAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->getOverflowSettingsAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageOverflowSettings_**](../Model/PageOverflowSettings_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOverflowSettingsUsingGet**
> \com\hydrogen\Model\OverflowSettings getOverflowSettingsUsingGet($overflow_settings_id)

Retrieve a Overflow Setting

Retrieve the information for a Overflow Settings.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_settings_id = "overflow_settings_id_example"; // string | UUID overflow_settings_id

try {
    $result = $apiInstance->getOverflowSettingsUsingGet($overflow_settings_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->getOverflowSettingsUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**string**](../Model/.md)| UUID overflow_settings_id |

### Return type

[**\com\hydrogen\Model\OverflowSettings**](../Model/OverflowSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOverflowUsingGet**
> \com\hydrogen\Model\Overflow getOverflowUsingGet($overflow_id)

Retrieve a Overflow object

Retrieve the information for a Overflow.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_id = "overflow_id_example"; // string | UUID overflow_id

try {
    $result = $apiInstance->getOverflowUsingGet($overflow_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->getOverflowUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_id** | [**string**](../Model/.md)| UUID overflow_id |

### Return type

[**\com\hydrogen\Model\Overflow**](../Model/Overflow.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOverflowSettingsUsingPut**
> \com\hydrogen\Model\OverflowSettings updateOverflowSettingsUsingPut($overflow_settings, $overflow_settings_id)

Update a overflow settings

Update the information for a overflow setting registered with your firm.

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
$apiInstance = new com\hydrogen\Api\OverflowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$overflow_settings = new \com\hydrogen\Model\OverflowSettings(); // \com\hydrogen\Model\OverflowSettings | overflow_settings
$overflow_settings_id = "overflow_settings_id_example"; // string | UUID overflow_settings_id

try {
    $result = $apiInstance->updateOverflowSettingsUsingPut($overflow_settings, $overflow_settings_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OverflowApi->updateOverflowSettingsUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**\com\hydrogen\Model\OverflowSettings**](../Model/OverflowSettings.md)| overflow_settings |
 **overflow_settings_id** | [**string**](../Model/.md)| UUID overflow_settings_id |

### Return type

[**\com\hydrogen\Model\OverflowSettings**](../Model/OverflowSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

