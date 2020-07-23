# com\hydrogen\molecule\TokenTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenTransferUsingPost**](TokenTransferApi.md#createTokenTransferUsingPost) | **POST** /token_transfer | Creates Token Transfer record
[**getTokenTransferAllUsingGet**](TokenTransferApi.md#getTokenTransferAllUsingGet) | **GET** /token_transfer | Fetch Token Transfer record list
[**getTokenTransferUsingGet**](TokenTransferApi.md#getTokenTransferUsingGet) | **GET** /token_transfer/{token_transfer_id} | Fetch Token Transfer record details


# **createTokenTransferUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse createTokenTransferUsingPost($token_transfer_params)

Creates Token Transfer record

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
$apiInstance = new com\hydrogen\molecule\Api\TokenTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_transfer_params = new \com\hydrogen\molecule\Model\TokenTransferParams(); // \com\hydrogen\molecule\Model\TokenTransferParams | It enables a user to transfer Tokens

try {
    $result = $apiInstance->createTokenTransferUsingPost($token_transfer_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenTransferApi->createTokenTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_params** | [**\com\hydrogen\molecule\Model\TokenTransferParams**](../Model/TokenTransferParams.md)| It enables a user to transfer Tokens |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenTransferAllUsingGet**
> \com\hydrogen\molecule\Model\PageTokenTransferResponse_ getTokenTransferAllUsingGet($wallet_id, $page, $size, $order_by, $ascending, $get_latest)

Fetch Token Transfer record list

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
$apiInstance = new com\hydrogen\molecule\Api\TokenTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | To filter response Token Transfer list by Wallet ID
$page = 56; // int | To filter response Token Transfer list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getTokenTransferAllUsingGet($wallet_id, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenTransferApi->getTokenTransferAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| To filter response Token Transfer list by Wallet ID | [optional]
 **page** | **int**| To filter response Token Transfer list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageTokenTransferResponse_**](../Model/PageTokenTransferResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenTransferUsingGet**
> \com\hydrogen\molecule\Model\TokenTransferResponse getTokenTransferUsingGet($token_transfer_id)

Fetch Token Transfer record details

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
$apiInstance = new com\hydrogen\molecule\Api\TokenTransferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_transfer_id = "token_transfer_id_example"; // string | Token Transfer ID

try {
    $result = $apiInstance->getTokenTransferUsingGet($token_transfer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenTransferApi->getTokenTransferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_id** | [**string**](../Model/.md)| Token Transfer ID |

### Return type

[**\com\hydrogen\molecule\Model\TokenTransferResponse**](../Model/TokenTransferResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

