# com\hydrogen\integration\KMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKMSUsingPost**](KMSApi.md#createKMSUsingPost) | **POST** /kms | Create an secret key
[**deleteKMSUsingDelete**](KMSApi.md#deleteKMSUsingDelete) | **DELETE** /kms/{kms_id} | Delete an secret key value
[**getKMSAllUsingGet**](KMSApi.md#getKMSAllUsingGet) | **GET** /kms | List all KMS Clients
[**getKMSUsingGet**](KMSApi.md#getKMSUsingGet) | **GET** /kms/{kms_id} | Retrieve an secret key value
[**updateKMSUsingPut**](KMSApi.md#updateKMSUsingPut) | **PUT** /kms/{kms_id} | Update an Key Value


# **createKMSUsingPost**
> \com\hydrogen\integration\Model\KmsConfig createKMSUsingPost($kms_config)

Create an secret key

Create an secret key.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kms_config = new \com\hydrogen\integration\Model\KmsConfig(); // \com\hydrogen\integration\Model\KmsConfig | kmsConfig

try {
    $result = $apiInstance->createKMSUsingPost($kms_config);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KMSApi->createKMSUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**\com\hydrogen\integration\Model\KmsConfig**](../Model/KmsConfig.md)| kmsConfig |

### Return type

[**\com\hydrogen\integration\Model\KmsConfig**](../Model/KmsConfig.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteKMSUsingDelete**
> deleteKMSUsingDelete($kms_id)

Delete an secret key value

Permanently delete an secret key value under a tenant.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kms_id = "kms_id_example"; // string | KMS Id

try {
    $apiInstance->deleteKMSUsingDelete($kms_id);
} catch (Exception $e) {
    echo 'Exception when calling KMSApi->deleteKMSUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**string**](../Model/.md)| KMS Id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getKMSAllUsingGet**
> \com\hydrogen\integration\Model\PageKmsConfig_ getKMSAllUsingGet($ascending, $order_by, $page, $size)

List all KMS Clients

Get details for all clients registered with your firm.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getKMSAllUsingGet($ascending, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KMSApi->getKMSAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\integration\Model\PageKmsConfig_**](../Model/PageKmsConfig_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getKMSUsingGet**
> \com\hydrogen\integration\Model\KmsConfig getKMSUsingGet($kms_id)

Retrieve an secret key value

Retrieve the information for a specific value associated with a Secret key.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kms_id = "kms_id_example"; // string | KMS Id

try {
    $result = $apiInstance->getKMSUsingGet($kms_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KMSApi->getKMSUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**string**](../Model/.md)| KMS Id |

### Return type

[**\com\hydrogen\integration\Model\KmsConfig**](../Model/KmsConfig.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateKMSUsingPut**
> \com\hydrogen\integration\Model\KmsConfig updateKMSUsingPut($kms_config, $kms_id)

Update an Key Value

Update the information for an key value.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KMSApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kms_config = new \com\hydrogen\integration\Model\KmsConfig(); // \com\hydrogen\integration\Model\KmsConfig | kmsConfig
$kms_id = "kms_id_example"; // string | kms_id

try {
    $result = $apiInstance->updateKMSUsingPut($kms_config, $kms_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KMSApi->updateKMSUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**\com\hydrogen\integration\Model\KmsConfig**](../Model/KmsConfig.md)| kmsConfig |
 **kms_id** | [**string**](../Model/.md)| kms_id |

### Return type

[**\com\hydrogen\integration\Model\KmsConfig**](../Model/KmsConfig.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

