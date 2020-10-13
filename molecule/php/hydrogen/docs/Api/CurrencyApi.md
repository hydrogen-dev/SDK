# com\hydrogen\molecule\CurrencyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyUsingPost**](CurrencyApi.md#createCurrencyUsingPost) | **POST** /currency | Creates a new Currency
[**getCurrencyAllUsingGet**](CurrencyApi.md#getCurrencyAllUsingGet) | **GET** /currency | Fetch Currency list
[**getCurrencyUsingGet**](CurrencyApi.md#getCurrencyUsingGet) | **GET** /currency/{currency_id} | Fetch Currency details
[**updateCurrencyUsingPut**](CurrencyApi.md#updateCurrencyUsingPut) | **PUT** /currency/{currency_id} | Update Currency details


# **createCurrencyUsingPost**
> \com\hydrogen\molecule\Model\CurrencyResponse createCurrencyUsingPost($currency_params)

Creates a new Currency

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\CurrencyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_params = new \com\hydrogen\molecule\Model\CurrencyParams(); // \com\hydrogen\molecule\Model\CurrencyParams | It enables a user to create a Currency

try {
    $result = $apiInstance->createCurrencyUsingPost($currency_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyApi->createCurrencyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_params** | [**\com\hydrogen\molecule\Model\CurrencyParams**](../Model/CurrencyParams.md)| It enables a user to create a Currency |

### Return type

[**\com\hydrogen\molecule\Model\CurrencyResponse**](../Model/CurrencyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCurrencyAllUsingGet**
> \com\hydrogen\molecule\Model\PageCurrencyResponse_ getCurrencyAllUsingGet($symbol, $is_allowed, $page, $size, $order_by, $ascending, $get_latest)

Fetch Currency list

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\CurrencyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = "symbol_example"; // string | To filter response Currency list by Symbol name
$is_allowed = true; // bool | To filter response Currency list
$page = 56; // int | To filter response Currency list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getCurrencyAllUsingGet($symbol, $is_allowed, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyApi->getCurrencyAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| To filter response Currency list by Symbol name | [optional]
 **is_allowed** | **bool**| To filter response Currency list | [optional]
 **page** | **int**| To filter response Currency list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageCurrencyResponse_**](../Model/PageCurrencyResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCurrencyUsingGet**
> \com\hydrogen\molecule\Model\CurrencyResponse getCurrencyUsingGet($currency_id)

Fetch Currency details

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\CurrencyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_id = "currency_id_example"; // string | Currency ID

try {
    $result = $apiInstance->getCurrencyUsingGet($currency_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyApi->getCurrencyUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**string**](../Model/.md)| Currency ID |

### Return type

[**\com\hydrogen\molecule\Model\CurrencyResponse**](../Model/CurrencyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCurrencyUsingPut**
> \com\hydrogen\molecule\Model\CurrencyResponse updateCurrencyUsingPut($currency_id, $currency_update_params)

Update Currency details

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\CurrencyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_id = "currency_id_example"; // string | Currency ID
$currency_update_params = new \com\hydrogen\molecule\Model\CurrencyUpdateParams(); // \com\hydrogen\molecule\Model\CurrencyUpdateParams | Currency details to be updated

try {
    $result = $apiInstance->updateCurrencyUsingPut($currency_id, $currency_update_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyApi->updateCurrencyUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**string**](../Model/.md)| Currency ID |
 **currency_update_params** | [**\com\hydrogen\molecule\Model\CurrencyUpdateParams**](../Model/CurrencyUpdateParams.md)| Currency details to be updated | [optional]

### Return type

[**\com\hydrogen\molecule\Model\CurrencyResponse**](../Model/CurrencyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

