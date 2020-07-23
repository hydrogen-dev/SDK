# com\hydrogen\molecule\TokenBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenBalanceAllUsingGet**](TokenBalanceApi.md#getTokenBalanceAllUsingGet) | **GET** /token_balance | Fetch Token Balance list
[**getTokenBalanceUsingGet**](TokenBalanceApi.md#getTokenBalanceUsingGet) | **GET** /token_balance/{token_balance_id} | Fetch Token Balance details


# **getTokenBalanceAllUsingGet**
> \com\hydrogen\molecule\Model\PageTokenBalanceResponse_ getTokenBalanceAllUsingGet($wallet_id, $token_id, $page, $size, $order_by, $ascending, $get_latest)

Fetch Token Balance list

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
$apiInstance = new com\hydrogen\molecule\Api\TokenBalanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | To filter response Token Balance list by wallet ID
$token_id = "token_id_example"; // string | To filter response Token Balance list by Token ID
$page = 56; // int | To filter response Token Balance list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getTokenBalanceAllUsingGet($wallet_id, $token_id, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenBalanceApi->getTokenBalanceAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| To filter response Token Balance list by wallet ID | [optional]
 **token_id** | [**string**](../Model/.md)| To filter response Token Balance list by Token ID | [optional]
 **page** | **int**| To filter response Token Balance list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageTokenBalanceResponse_**](../Model/PageTokenBalanceResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenBalanceUsingGet**
> \com\hydrogen\molecule\Model\TokenBalanceResponse getTokenBalanceUsingGet($token_balance_id)

Fetch Token Balance details

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
$apiInstance = new com\hydrogen\molecule\Api\TokenBalanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_balance_id = "token_balance_id_example"; // string | Token Balance ID

try {
    $result = $apiInstance->getTokenBalanceUsingGet($token_balance_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenBalanceApi->getTokenBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_balance_id** | [**string**](../Model/.md)| Token Balance ID |

### Return type

[**\com\hydrogen\molecule\Model\TokenBalanceResponse**](../Model/TokenBalanceResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

