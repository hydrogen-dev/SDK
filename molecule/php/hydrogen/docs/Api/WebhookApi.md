# com\hydrogen\molecule\WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookUsingPost**](WebhookApi.md#createWebhookUsingPost) | **POST** /webhook | Creates a new Webhook record
[**deleteWebhookUsingDelete**](WebhookApi.md#deleteWebhookUsingDelete) | **DELETE** /webhook/{webhook_id} | Delete Webhook
[**getWebhookAllUsingGet**](WebhookApi.md#getWebhookAllUsingGet) | **GET** /webhook | Fetch Webhook list
[**getWebhookUsingGet**](WebhookApi.md#getWebhookUsingGet) | **GET** /webhook/{webhook_id} | Fetch Webhook details
[**updateWebhookUsingPut**](WebhookApi.md#updateWebhookUsingPut) | **PUT** /webhook/{webhook_id} | Update Webhook details


# **createWebhookUsingPost**
> \com\hydrogen\molecule\Model\WebhookResponse createWebhookUsingPost($webhook_params)

Creates a new Webhook record

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\WebhookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_params = new \com\hydrogen\molecule\Model\WebhookParams(); // \com\hydrogen\molecule\Model\WebhookParams | It enables a user to create a Webhook record

try {
    $result = $apiInstance->createWebhookUsingPost($webhook_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhookApi->createWebhookUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_params** | [**\com\hydrogen\molecule\Model\WebhookParams**](../Model/WebhookParams.md)| It enables a user to create a Webhook record |

### Return type

[**\com\hydrogen\molecule\Model\WebhookResponse**](../Model/WebhookResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteWebhookUsingDelete**
> deleteWebhookUsingDelete($webhook_id)

Delete Webhook

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\WebhookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_id = "webhook_id_example"; // string | Webhook ID

try {
    $apiInstance->deleteWebhookUsingDelete($webhook_id);
} catch (Exception $e) {
    echo 'Exception when calling WebhookApi->deleteWebhookUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**string**](../Model/.md)| Webhook ID |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWebhookAllUsingGet**
> \com\hydrogen\molecule\Model\PageWebhookResponse_ getWebhookAllUsingGet($page, $size, $order_by, $ascending, $get_latest)

Fetch Webhook list

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\WebhookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | To filter response webhook list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getWebhookAllUsingGet($page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhookApi->getWebhookAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response webhook list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageWebhookResponse_**](../Model/PageWebhookResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWebhookUsingGet**
> \com\hydrogen\molecule\Model\WebhookResponse getWebhookUsingGet($webhook_id)

Fetch Webhook details

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\WebhookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_id = "webhook_id_example"; // string | Webhook ID

try {
    $result = $apiInstance->getWebhookUsingGet($webhook_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhookApi->getWebhookUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**string**](../Model/.md)| Webhook ID |

### Return type

[**\com\hydrogen\molecule\Model\WebhookResponse**](../Model/WebhookResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateWebhookUsingPut**
> \com\hydrogen\molecule\Model\WebhookResponse updateWebhookUsingPut($webhook_id, $webhook_update_params)

Update Webhook details

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\WebhookApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_id = "webhook_id_example"; // string | Webhook ID
$webhook_update_params = new \com\hydrogen\molecule\Model\WebhookParams(); // \com\hydrogen\molecule\Model\WebhookParams | Webhook details to be updated

try {
    $result = $apiInstance->updateWebhookUsingPut($webhook_id, $webhook_update_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhookApi->updateWebhookUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**string**](../Model/.md)| Webhook ID |
 **webhook_update_params** | [**\com\hydrogen\molecule\Model\WebhookParams**](../Model/WebhookParams.md)| Webhook details to be updated |

### Return type

[**\com\hydrogen\molecule\Model\WebhookResponse**](../Model/WebhookResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

