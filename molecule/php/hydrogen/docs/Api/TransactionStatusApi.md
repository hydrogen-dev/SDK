# com\hydrogen\molecule\TransactionStatusApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionStatusAllUsingGet**](TransactionStatusApi.md#getTransactionStatusAllUsingGet) | **GET** /transaction_status | Fetch Transaction Status list
[**getTransactionStatusUsingGet**](TransactionStatusApi.md#getTransactionStatusUsingGet) | **GET** /transaction_status/{transaction_id} | Fetch Transaction record details


# **getTransactionStatusAllUsingGet**
> \com\hydrogen\molecule\Model\PageTransactionSuccessResponse_ getTransactionStatusAllUsingGet($hash, $wallet_id, $status, $page, $size, $order_by, $ascending, $get_latest)

Fetch Transaction Status list

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

$apiInstance = new com\hydrogen\molecule\Api\TransactionStatusApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$hash = "hash_example"; // string | To filter response Transaction record list by Transaction's hash
$wallet_id = "wallet_id_example"; // string | To filter response Transaction record list by Wallet ID
$status = "status_example"; // string | To filter response Transaction record list by Transaction's status
$page = 56; // int | To filter response Transaction record list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getTransactionStatusAllUsingGet($hash, $wallet_id, $status, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TransactionStatusApi->getTransactionStatusAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **string**| To filter response Transaction record list by Transaction&#39;s hash | [optional]
 **wallet_id** | [**string**](../Model/.md)| To filter response Transaction record list by Wallet ID | [optional]
 **status** | **string**| To filter response Transaction record list by Transaction&#39;s status | [optional]
 **page** | **int**| To filter response Transaction record list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageTransactionSuccessResponse_**](../Model/PageTransactionSuccessResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransactionStatusUsingGet**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse getTransactionStatusUsingGet($transaction_id)

Fetch Transaction record details

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

$apiInstance = new com\hydrogen\molecule\Api\TransactionStatusApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transaction_id = "transaction_id_example"; // string | Transaction ID

try {
    $result = $apiInstance->getTransactionStatusUsingGet($transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TransactionStatusApi->getTransactionStatusUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_id** | [**string**](../Model/.md)| Transaction ID |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

