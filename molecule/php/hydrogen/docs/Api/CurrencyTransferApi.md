# com\hydrogen\molecule\CurrencyTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyTransferUsingPost**](CurrencyTransferApi.md#createCurrencyTransferUsingPost) | **POST** /currency_transfer | Creates Currency Transfer record
[**getCurrencyTransferAllUsingGet**](CurrencyTransferApi.md#getCurrencyTransferAllUsingGet) | **GET** /currency_transfer | Fetch Currency Transfer record list
[**getCurrencyTransferUsingGet**](CurrencyTransferApi.md#getCurrencyTransferUsingGet) | **GET** /currency_transfer/{currency_transfer_id} | Fetch Currency Transfer record details


# **createCurrencyTransferUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse createCurrencyTransferUsingPost($currency_transfer_params)

Creates Currency Transfer record

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_transfer_params = new \com\hydrogen\molecule\Model\CurrencyTransferParams(); // \com\hydrogen\molecule\Model\CurrencyTransferParams | It enables a user to transfer Currency

try {
    $result = $apiInstance->createCurrencyTransferUsingPost($currency_transfer_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyTransferApi->createCurrencyTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_params** | [**\com\hydrogen\molecule\Model\CurrencyTransferParams**](../Model/CurrencyTransferParams.md)| It enables a user to transfer Currency |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCurrencyTransferAllUsingGet**
> \com\hydrogen\molecule\Model\PageCurrencyTransferResponse_ getCurrencyTransferAllUsingGet($wallet_id, $currency_id, $page, $size, $order_by, $ascending, $get_latest)

Fetch Currency Transfer record list

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | To filter response Currency Transfer list by Wallet ID
$currency_id = "currency_id_example"; // string | To filter response Currency Transfer list by Currency ID
$page = 56; // int | To filter response Currency Transfer list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getCurrencyTransferAllUsingGet($wallet_id, $currency_id, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyTransferApi->getCurrencyTransferAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| To filter response Currency Transfer list by Wallet ID | [optional]
 **currency_id** | [**string**](../Model/.md)| To filter response Currency Transfer list by Currency ID | [optional]
 **page** | **int**| To filter response Currency Transfer list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageCurrencyTransferResponse_**](../Model/PageCurrencyTransferResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCurrencyTransferUsingGet**
> \com\hydrogen\molecule\Model\CurrencyTransferResponse getCurrencyTransferUsingGet($currency_transfer_id)

Fetch Currency Transfer record details

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_transfer_id = "currency_transfer_id_example"; // string | Currency Transfer ID

try {
    $result = $apiInstance->getCurrencyTransferUsingGet($currency_transfer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyTransferApi->getCurrencyTransferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_id** | [**string**](../Model/.md)| Currency Transfer ID |

### Return type

[**\com\hydrogen\molecule\Model\CurrencyTransferResponse**](../Model/CurrencyTransferResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

