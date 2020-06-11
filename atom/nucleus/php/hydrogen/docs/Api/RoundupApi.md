# com\hydrogen\RoundupApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoundupSettingsUsingPost**](RoundupApi.md#createRoundupSettingsUsingPost) | **POST** /roundup_setting | Create a Roundup Settings
[**createRoundupUsingPost**](RoundupApi.md#createRoundupUsingPost) | **POST** /roundup | Create a roundup
[**deleteRoundupSettingsUsingDelete**](RoundupApi.md#deleteRoundupSettingsUsingDelete) | **DELETE** /roundup_setting/{roundup_setting_id} | Delete a roundup settings
[**getRoundupAllUsingGet**](RoundupApi.md#getRoundupAllUsingGet) | **GET** /roundup | List all roundups
[**getRoundupSettingsAllUsingGet**](RoundupApi.md#getRoundupSettingsAllUsingGet) | **GET** /roundup_setting | List all roundup settings
[**getRoundupSettingsUsingGet**](RoundupApi.md#getRoundupSettingsUsingGet) | **GET** /roundup_setting/{roundup_setting_id} | Retrieve a Roundup Setting
[**getRoundupUsingGet**](RoundupApi.md#getRoundupUsingGet) | **GET** /roundup/{roundup_id} | Retrieve a Roundup
[**updateRoundupSettingsUsingPut**](RoundupApi.md#updateRoundupSettingsUsingPut) | **PUT** /roundup_setting/{roundup_setting_id} | Update a roundup settings


# **createRoundupSettingsUsingPost**
> \com\hydrogen\Model\RoundupSettings createRoundupSettingsUsingPost($roundup_settings)

Create a Roundup Settings

Create a Roundup Settings for Roundup amount with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_settings = new \com\hydrogen\Model\RoundupSettings(); // \com\hydrogen\Model\RoundupSettings | roundupSettings

try {
    $result = $apiInstance->createRoundupSettingsUsingPost($roundup_settings);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->createRoundupSettingsUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_settings** | [**\com\hydrogen\Model\RoundupSettings**](../Model/RoundupSettings.md)| roundupSettings |

### Return type

[**\com\hydrogen\Model\RoundupSettings**](../Model/RoundupSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createRoundupUsingPost**
> \com\hydrogen\Model\Roundup createRoundupUsingPost($roundup_co)

Create a roundup

Create a new roundup with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_co = new \com\hydrogen\Model\RoundupCO(); // \com\hydrogen\Model\RoundupCO | roundupCO

try {
    $result = $apiInstance->createRoundupUsingPost($roundup_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->createRoundupUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_co** | [**\com\hydrogen\Model\RoundupCO**](../Model/RoundupCO.md)| roundupCO |

### Return type

[**\com\hydrogen\Model\Roundup**](../Model/Roundup.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteRoundupSettingsUsingDelete**
> deleteRoundupSettingsUsingDelete($roundup_setting_id)

Delete a roundup settings

Permanently delete a  roundup settings registered with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_setting_id = "roundup_setting_id_example"; // string | UUID roundup_setting_id

try {
    $apiInstance->deleteRoundupSettingsUsingDelete($roundup_setting_id);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->deleteRoundupSettingsUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**string**](../Model/.md)| UUID roundup_setting_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRoundupAllUsingGet**
> \com\hydrogen\Model\PageRoundup_ getRoundupAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all roundups

Get details for all roundups.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
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
    $result = $apiInstance->getRoundupAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->getRoundupAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageRoundup_**](../Model/PageRoundup_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRoundupSettingsAllUsingGet**
> \com\hydrogen\Model\PageRoundupSettings_ getRoundupSettingsAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all roundup settings

Get details for all roundup setting with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
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
    $result = $apiInstance->getRoundupSettingsAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->getRoundupSettingsAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageRoundupSettings_**](../Model/PageRoundupSettings_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRoundupSettingsUsingGet**
> \com\hydrogen\Model\RoundupSettings getRoundupSettingsUsingGet($roundup_setting_id)

Retrieve a Roundup Setting

Retrieve the information for a Roundup Settings with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_setting_id = "roundup_setting_id_example"; // string | UUID roundup_setting_id

try {
    $result = $apiInstance->getRoundupSettingsUsingGet($roundup_setting_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->getRoundupSettingsUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**string**](../Model/.md)| UUID roundup_setting_id |

### Return type

[**\com\hydrogen\Model\RoundupSettings**](../Model/RoundupSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRoundupUsingGet**
> \com\hydrogen\Model\Roundup getRoundupUsingGet($roundup_id)

Retrieve a Roundup

Retrieve the information for a Roundup.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_id = "roundup_id_example"; // string | UUID roundup_id

try {
    $result = $apiInstance->getRoundupUsingGet($roundup_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->getRoundupUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_id** | [**string**](../Model/.md)| UUID roundup_id |

### Return type

[**\com\hydrogen\Model\Roundup**](../Model/Roundup.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateRoundupSettingsUsingPut**
> \com\hydrogen\Model\RoundupSettings updateRoundupSettingsUsingPut($roundup_setting, $roundup_setting_id)

Update a roundup settings

Update the information for a roundup setting registered with your firm.

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
$apiInstance = new com\hydrogen\Api\RoundupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$roundup_setting = new \com\hydrogen\Model\RoundupSettings(); // \com\hydrogen\Model\RoundupSettings | roundup_setting
$roundup_setting_id = "roundup_setting_id_example"; // string | UUID roundup_setting_id

try {
    $result = $apiInstance->updateRoundupSettingsUsingPut($roundup_setting, $roundup_setting_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoundupApi->updateRoundupSettingsUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting** | [**\com\hydrogen\Model\RoundupSettings**](../Model/RoundupSettings.md)| roundup_setting |
 **roundup_setting_id** | [**string**](../Model/.md)| UUID roundup_setting_id |

### Return type

[**\com\hydrogen\Model\RoundupSettings**](../Model/RoundupSettings.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

