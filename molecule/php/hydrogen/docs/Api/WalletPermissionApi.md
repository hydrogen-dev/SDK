# com\hydrogen\molecule\WalletPermissionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletPermissionAllUsingGet**](WalletPermissionApi.md#getWalletPermissionAllUsingGet) | **GET** /wallet_permission | Fetch Wallet list with client&#39;s permissions
[**getWalletPermissionUsingGet**](WalletPermissionApi.md#getWalletPermissionUsingGet) | **GET** /wallet_permission/{wallet_id} | Fetch Wallet&#39;s client permissions details
[**updateWalletPermissionUsingPut**](WalletPermissionApi.md#updateWalletPermissionUsingPut) | **PUT** /wallet_permission/{wallet_id} | Update client&#39;s permission for provided Wallet


# **getWalletPermissionAllUsingGet**
> \com\hydrogen\molecule\Model\PageWalletPermissionResponse_ getWalletPermissionAllUsingGet($nucleus_client_id, $is_active, $page, $size, $order_by, $ascending, $get_latest)

Fetch Wallet list with client's permissions

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

$apiInstance = new com\hydrogen\molecule\Api\WalletPermissionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | To filter response wallet list by client's ID
$is_active = true; // bool | To filter response for active wallets
$page = 56; // int | To filter response wallet list page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getWalletPermissionAllUsingGet($nucleus_client_id, $is_active, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletPermissionApi->getWalletPermissionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| To filter response wallet list by client&#39;s ID | [optional]
 **is_active** | **bool**| To filter response for active wallets | [optional]
 **page** | **int**| To filter response wallet list page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageWalletPermissionResponse_**](../Model/PageWalletPermissionResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletPermissionUsingGet**
> \com\hydrogen\molecule\Model\WalletPermissionResponse getWalletPermissionUsingGet($wallet_id)

Fetch Wallet's client permissions details

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

$apiInstance = new com\hydrogen\molecule\Api\WalletPermissionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | Wallet ID

try {
    $result = $apiInstance->getWalletPermissionUsingGet($wallet_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletPermissionApi->getWalletPermissionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| Wallet ID |

### Return type

[**\com\hydrogen\molecule\Model\WalletPermissionResponse**](../Model/WalletPermissionResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateWalletPermissionUsingPut**
> \com\hydrogen\molecule\Model\WalletPermissionResponse updateWalletPermissionUsingPut($wallet_id, $client_permissions)

Update client's permission for provided Wallet

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

$apiInstance = new com\hydrogen\molecule\Api\WalletPermissionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | Wallet ID
$client_permissions = new \com\hydrogen\molecule\Model\WalletPermissionUpdateParams(); // \com\hydrogen\molecule\Model\WalletPermissionUpdateParams | Client's permission to be updated

try {
    $result = $apiInstance->updateWalletPermissionUsingPut($wallet_id, $client_permissions);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletPermissionApi->updateWalletPermissionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| Wallet ID |
 **client_permissions** | [**\com\hydrogen\molecule\Model\WalletPermissionUpdateParams**](../Model/WalletPermissionUpdateParams.md)| Client&#39;s permission to be updated |

### Return type

[**\com\hydrogen\molecule\Model\WalletPermissionResponse**](../Model/WalletPermissionResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

