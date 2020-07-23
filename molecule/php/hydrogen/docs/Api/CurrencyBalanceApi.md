# com\hydrogen\molecule\CurrencyBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencyBalanceAllUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceAllUsingGet) | **GET** /currency_balance | Fetch Currency Balance list
[**getCurrencyBalanceUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceUsingGet) | **GET** /currency_balance/{currency_balance_id} | Fetch Currency Balance details
[**updateCurrencyBalanceUsingPost**](CurrencyBalanceApi.md#updateCurrencyBalanceUsingPost) | **POST** /currency_balance/update | Update(Fetch) latest Currency Balance


# **getCurrencyBalanceAllUsingGet**
> \com\hydrogen\molecule\Model\PageCurrencyBalanceResponse_ getCurrencyBalanceAllUsingGet($wallet_id, $currency_id, $page, $size, $order_by, $ascending, $get_latest)

Fetch Currency Balance list

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyBalanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | To filter response Currency Balance list by wallet ID
$currency_id = "currency_id_example"; // string | To filter response Currency Balance list by currency ID
$page = 56; // int | To filter response Currency Balance list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getCurrencyBalanceAllUsingGet($wallet_id, $currency_id, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyBalanceApi->getCurrencyBalanceAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| To filter response Currency Balance list by wallet ID | [optional]
 **currency_id** | [**string**](../Model/.md)| To filter response Currency Balance list by currency ID | [optional]
 **page** | **int**| To filter response Currency Balance list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageCurrencyBalanceResponse_**](../Model/PageCurrencyBalanceResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCurrencyBalanceUsingGet**
> \com\hydrogen\molecule\Model\CurrencyBalanceResponse getCurrencyBalanceUsingGet($currency_balance_id)

Fetch Currency Balance details

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyBalanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_balance_id = "currency_balance_id_example"; // string | Currency Balance ID

try {
    $result = $apiInstance->getCurrencyBalanceUsingGet($currency_balance_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyBalanceApi->getCurrencyBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_id** | [**string**](../Model/.md)| Currency Balance ID |

### Return type

[**\com\hydrogen\molecule\Model\CurrencyBalanceResponse**](../Model/CurrencyBalanceResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCurrencyBalanceUsingPost**
> \com\hydrogen\molecule\Model\CurrencyBalanceResponse updateCurrencyBalanceUsingPost($currency_balance_update_params)

Update(Fetch) latest Currency Balance

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
$apiInstance = new com\hydrogen\molecule\Api\CurrencyBalanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency_balance_update_params = new \com\hydrogen\molecule\Model\CurrencyBalanceUpdateParams(); // \com\hydrogen\molecule\Model\CurrencyBalanceUpdateParams | To fetch/update latest record

try {
    $result = $apiInstance->updateCurrencyBalanceUsingPost($currency_balance_update_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CurrencyBalanceApi->updateCurrencyBalanceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_update_params** | [**\com\hydrogen\molecule\Model\CurrencyBalanceUpdateParams**](../Model/CurrencyBalanceUpdateParams.md)| To fetch/update latest record |

### Return type

[**\com\hydrogen\molecule\Model\CurrencyBalanceResponse**](../Model/CurrencyBalanceResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

