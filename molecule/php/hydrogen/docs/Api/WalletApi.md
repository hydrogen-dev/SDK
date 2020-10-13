# com\hydrogen\molecule\WalletApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletUsingPost**](WalletApi.md#createWalletUsingPost) | **POST** /wallet | Creates a new Wallet
[**getWalletAllUsingGet**](WalletApi.md#getWalletAllUsingGet) | **GET** /wallet | Fetch Wallet list
[**getWalletByWalletKeyUsingGet**](WalletApi.md#getWalletByWalletKeyUsingGet) | **GET** /wallet/wallet_key/{wallet_key_id} | Fetch Wallet details by Wallet Key ID
[**getWalletUsingGet**](WalletApi.md#getWalletUsingGet) | **GET** /wallet/{wallet_id} | Fetch Wallet details
[**updateWalletUsingPut**](WalletApi.md#updateWalletUsingPut) | **PUT** /wallet/{wallet_id} | Update Wallet details


# **createWalletUsingPost**
> \com\hydrogen\molecule\Model\WalletResponse createWalletUsingPost($wallet_params)

Creates a new Wallet

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

$apiInstance = new com\hydrogen\molecule\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_params = new \com\hydrogen\molecule\Model\WalletParams(); // \com\hydrogen\molecule\Model\WalletParams | It enables a user to create a Wallet

try {
    $result = $apiInstance->createWalletUsingPost($wallet_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->createWalletUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_params** | [**\com\hydrogen\molecule\Model\WalletParams**](../Model/WalletParams.md)| It enables a user to create a Wallet |

### Return type

[**\com\hydrogen\molecule\Model\WalletResponse**](../Model/WalletResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletAllUsingGet**
> \com\hydrogen\molecule\Model\PageWalletResponse_ getWalletAllUsingGet($nucleus_client_id, $is_primary, $page, $size, $order_by, $ascending, $get_latest)

Fetch Wallet list

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

$apiInstance = new com\hydrogen\molecule\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | To filter response wallet list by client's ID
$is_primary = true; // bool | To filter response for primary wallets
$page = 56; // int | To filter response wallet list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getWalletAllUsingGet($nucleus_client_id, $is_primary, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->getWalletAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| To filter response wallet list by client&#39;s ID | [optional]
 **is_primary** | **bool**| To filter response for primary wallets | [optional]
 **page** | **int**| To filter response wallet list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageWalletResponse_**](../Model/PageWalletResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletByWalletKeyUsingGet**
> \com\hydrogen\molecule\Model\WalletResponse getWalletByWalletKeyUsingGet($wallet_key_id)

Fetch Wallet details by Wallet Key ID

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

$apiInstance = new com\hydrogen\molecule\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_key_id = "wallet_key_id_example"; // string | Wallet Key ID

try {
    $result = $apiInstance->getWalletByWalletKeyUsingGet($wallet_key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->getWalletByWalletKeyUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**string**](../Model/.md)| Wallet Key ID |

### Return type

[**\com\hydrogen\molecule\Model\WalletResponse**](../Model/WalletResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletUsingGet**
> \com\hydrogen\molecule\Model\WalletResponse getWalletUsingGet($wallet_id)

Fetch Wallet details

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

$apiInstance = new com\hydrogen\molecule\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | Wallet ID

try {
    $result = $apiInstance->getWalletUsingGet($wallet_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->getWalletUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| Wallet ID |

### Return type

[**\com\hydrogen\molecule\Model\WalletResponse**](../Model/WalletResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateWalletUsingPut**
> \com\hydrogen\molecule\Model\WalletResponse updateWalletUsingPut($wallet_id, $wallet_update_params)

Update Wallet details

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

$apiInstance = new com\hydrogen\molecule\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_id = "wallet_id_example"; // string | Wallet ID
$wallet_update_params = new \com\hydrogen\molecule\Model\WalletParams(); // \com\hydrogen\molecule\Model\WalletParams | Wallet details to be updated

try {
    $result = $apiInstance->updateWalletUsingPut($wallet_id, $wallet_update_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->updateWalletUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**string**](../Model/.md)| Wallet ID |
 **wallet_update_params** | [**\com\hydrogen\molecule\Model\WalletParams**](../Model/WalletParams.md)| Wallet details to be updated | [optional]

### Return type

[**\com\hydrogen\molecule\Model\WalletResponse**](../Model/WalletResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

