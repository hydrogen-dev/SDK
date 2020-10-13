# com\hydrogen\molecule\EscrowTransactionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEscrowTransactionUsingPost**](EscrowTransactionApi.md#createEscrowTransactionUsingPost) | **POST** /escrow_transaction | Create a new Escrow Transaction
[**getEscrowTransactionAllUsingGet**](EscrowTransactionApi.md#getEscrowTransactionAllUsingGet) | **GET** /escrow_transaction | List all Escrow Transaction
[**getEscrowTransactionUsingGet**](EscrowTransactionApi.md#getEscrowTransactionUsingGet) | **GET** /escrow_transaction/{escrow_transaction_id} | Fetch Escrow Transaction
[**updateEscrowTransactionUsingPut**](EscrowTransactionApi.md#updateEscrowTransactionUsingPut) | **PUT** /escrow_transaction/{escrow_transaction_id} | Update Escrow Transaction


# **createEscrowTransactionUsingPost**
> \com\hydrogen\molecule\Model\EscrowTransactionResponse createEscrowTransactionUsingPost($escrow_deposit_params)

Create a new Escrow Transaction

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

$apiInstance = new com\hydrogen\molecule\Api\EscrowTransactionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$escrow_deposit_params = new \com\hydrogen\molecule\Model\EscrowDepositParams(); // \com\hydrogen\molecule\Model\EscrowDepositParams | It enables a user to create a escrow transaction

try {
    $result = $apiInstance->createEscrowTransactionUsingPost($escrow_deposit_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowTransactionApi->createEscrowTransactionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_deposit_params** | [**\com\hydrogen\molecule\Model\EscrowDepositParams**](../Model/EscrowDepositParams.md)| It enables a user to create a escrow transaction |

### Return type

[**\com\hydrogen\molecule\Model\EscrowTransactionResponse**](../Model/EscrowTransactionResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getEscrowTransactionAllUsingGet**
> \com\hydrogen\molecule\Model\PageEscrowTransactionResponse_ getEscrowTransactionAllUsingGet($page, $size, $order_by, $ascending, $get_latest)

List all Escrow Transaction

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

$apiInstance = new com\hydrogen\molecule\Api\EscrowTransactionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | To filter response Escrow Transaction list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getEscrowTransactionAllUsingGet($page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowTransactionApi->getEscrowTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Escrow Transaction list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageEscrowTransactionResponse_**](../Model/PageEscrowTransactionResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getEscrowTransactionUsingGet**
> \com\hydrogen\molecule\Model\EscrowTransactionResponse getEscrowTransactionUsingGet($escrow_transaction_id)

Fetch Escrow Transaction

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

$apiInstance = new com\hydrogen\molecule\Api\EscrowTransactionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$escrow_transaction_id = "escrow_transaction_id_example"; // string | Escrow Transaction ID

try {
    $result = $apiInstance->getEscrowTransactionUsingGet($escrow_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowTransactionApi->getEscrowTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**string**](../Model/.md)| Escrow Transaction ID |

### Return type

[**\com\hydrogen\molecule\Model\EscrowTransactionResponse**](../Model/EscrowTransactionResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateEscrowTransactionUsingPut**
> \com\hydrogen\molecule\Model\EscrowTransactionResponse updateEscrowTransactionUsingPut($escrow_transaction_id, $escrow_deposit_params)

Update Escrow Transaction

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

$apiInstance = new com\hydrogen\molecule\Api\EscrowTransactionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$escrow_transaction_id = "escrow_transaction_id_example"; // string | Escrow Transaction ID
$escrow_deposit_params = new \com\hydrogen\molecule\Model\EscrowDepositParams(); // \com\hydrogen\molecule\Model\EscrowDepositParams | It enables a user to create a escrow transaction

try {
    $result = $apiInstance->updateEscrowTransactionUsingPut($escrow_transaction_id, $escrow_deposit_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowTransactionApi->updateEscrowTransactionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**string**](../Model/.md)| Escrow Transaction ID |
 **escrow_deposit_params** | [**\com\hydrogen\molecule\Model\EscrowDepositParams**](../Model/EscrowDepositParams.md)| It enables a user to create a escrow transaction | [optional]

### Return type

[**\com\hydrogen\molecule\Model\EscrowTransactionResponse**](../Model/EscrowTransactionResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

