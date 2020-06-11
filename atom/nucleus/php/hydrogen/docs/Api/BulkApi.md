# com\hydrogen\BulkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkUsingPost**](BulkApi.md#createBulkUsingPost) | **POST** /bulk/{entity_uri} | Create a bulk data
[**deleteBulkUsingDelete**](BulkApi.md#deleteBulkUsingDelete) | **DELETE** /bulk/{entity_uri} | Delete a bulk data
[**getBulkStatusUsingGet**](BulkApi.md#getBulkStatusUsingGet) | **GET** /bulk/status/{id} | Status of bulk transaction
[**updateBulkUsingPut**](BulkApi.md#updateBulkUsingPut) | **PUT** /bulk/{entity_uri} | Update a bulk data


# **createBulkUsingPost**
> \com\hydrogen\Model\BulkTransaction createBulkUsingPost($data, $entity_uri)

Create a bulk data

Create a new bulk data for your firm.

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
$apiInstance = new com\hydrogen\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$data = new \com\hydrogen\Model\JsonNode(); // \com\hydrogen\Model\JsonNode | data
$entity_uri = "entity_uri_example"; // string | UUID entity_uri

try {
    $result = $apiInstance->createBulkUsingPost($data, $entity_uri);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->createBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**\com\hydrogen\Model\JsonNode**](../Model/JsonNode.md)| data |
 **entity_uri** | [**string**](../Model/.md)| UUID entity_uri |

### Return type

[**\com\hydrogen\Model\BulkTransaction**](../Model/BulkTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBulkUsingDelete**
> \com\hydrogen\Model\BulkTransaction deleteBulkUsingDelete($data, $entity_uri)

Delete a bulk data

Delete a bulk data for your firm.

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
$apiInstance = new com\hydrogen\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$data = new \com\hydrogen\Model\JsonNode(); // \com\hydrogen\Model\JsonNode | data
$entity_uri = "entity_uri_example"; // string | UUID entity_uri

try {
    $result = $apiInstance->deleteBulkUsingDelete($data, $entity_uri);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->deleteBulkUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**\com\hydrogen\Model\JsonNode**](../Model/JsonNode.md)| data |
 **entity_uri** | [**string**](../Model/.md)| UUID entity_uri |

### Return type

[**\com\hydrogen\Model\BulkTransaction**](../Model/BulkTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBulkStatusUsingGet**
> \com\hydrogen\Model\BulkTransactionVO getBulkStatusUsingGet($id)

Status of bulk transaction

Get the status of bulk transaction.

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
$apiInstance = new com\hydrogen\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | UUID Bulk Transaction Id

try {
    $result = $apiInstance->getBulkStatusUsingGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->getBulkStatusUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| UUID Bulk Transaction Id |

### Return type

[**\com\hydrogen\Model\BulkTransactionVO**](../Model/BulkTransactionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBulkUsingPut**
> \com\hydrogen\Model\BulkTransaction updateBulkUsingPut($data, $entity_uri)

Update a bulk data

Update a bulk data for your firm.

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
$apiInstance = new com\hydrogen\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$data = new \com\hydrogen\Model\JsonNode(); // \com\hydrogen\Model\JsonNode | data
$entity_uri = "entity_uri_example"; // string | UUID entity_uri

try {
    $result = $apiInstance->updateBulkUsingPut($data, $entity_uri);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->updateBulkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**\com\hydrogen\Model\JsonNode**](../Model/JsonNode.md)| data |
 **entity_uri** | [**string**](../Model/.md)| UUID entity_uri |

### Return type

[**\com\hydrogen\Model\BulkTransaction**](../Model/BulkTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

