# com\hydrogen\molecule\WalletKeyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletKeyUsingPost**](WalletKeyApi.md#createWalletKeyUsingPost) | **POST** /wallet_key | Creates a new Wallet Key for provided Wallet ID
[**generateWalletKeyUsingPost**](WalletKeyApi.md#generateWalletKeyUsingPost) | **POST** /wallet_key/generator | Generates Wallet Key for provided Wallet ID
[**getWalletKeyAllUsingGet**](WalletKeyApi.md#getWalletKeyAllUsingGet) | **GET** /wallet_key | Fetch Wallet Key list
[**getWalletKeyUsingGet**](WalletKeyApi.md#getWalletKeyUsingGet) | **GET** /wallet_key/{wallet_key_id} | Fetch Wallet Key details


# **createWalletKeyUsingPost**
> \com\hydrogen\molecule\Model\WalletKeyResponse createWalletKeyUsingPost($wallet_key_params)

Creates a new Wallet Key for provided Wallet ID

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

$apiInstance = new com\hydrogen\molecule\Api\WalletKeyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_key_params = new \com\hydrogen\molecule\Model\WalletKeyParams(); // \com\hydrogen\molecule\Model\WalletKeyParams | It enables a user to create a Wallet Key record

try {
    $result = $apiInstance->createWalletKeyUsingPost($wallet_key_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletKeyApi->createWalletKeyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_params** | [**\com\hydrogen\molecule\Model\WalletKeyParams**](../Model/WalletKeyParams.md)| It enables a user to create a Wallet Key record |

### Return type

[**\com\hydrogen\molecule\Model\WalletKeyResponse**](../Model/WalletKeyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **generateWalletKeyUsingPost**
> \com\hydrogen\molecule\Model\WalletKeyResponse generateWalletKeyUsingPost($wallet_key_generate_params)

Generates Wallet Key for provided Wallet ID

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

$apiInstance = new com\hydrogen\molecule\Api\WalletKeyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_key_generate_params = new \com\hydrogen\molecule\Model\WalletKeyGenerateParams(); // \com\hydrogen\molecule\Model\WalletKeyGenerateParams | It enables a user to generate a Wallet Key record

try {
    $result = $apiInstance->generateWalletKeyUsingPost($wallet_key_generate_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletKeyApi->generateWalletKeyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_generate_params** | [**\com\hydrogen\molecule\Model\WalletKeyGenerateParams**](../Model/WalletKeyGenerateParams.md)| It enables a user to generate a Wallet Key record |

### Return type

[**\com\hydrogen\molecule\Model\WalletKeyResponse**](../Model/WalletKeyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletKeyAllUsingGet**
> \com\hydrogen\molecule\Model\PageWalletKeyResponse_ getWalletKeyAllUsingGet($page, $size, $order_by, $ascending, $get_latest)

Fetch Wallet Key list

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

$apiInstance = new com\hydrogen\molecule\Api\WalletKeyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | To filter response wallet list page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getWalletKeyAllUsingGet($page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletKeyApi->getWalletKeyAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response wallet list page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageWalletKeyResponse_**](../Model/PageWalletKeyResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWalletKeyUsingGet**
> \com\hydrogen\molecule\Model\WalletKeyResponse getWalletKeyUsingGet($wallet_key_id)

Fetch Wallet Key details

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

$apiInstance = new com\hydrogen\molecule\Api\WalletKeyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$wallet_key_id = "wallet_key_id_example"; // string | Wallet Key ID

try {
    $result = $apiInstance->getWalletKeyUsingGet($wallet_key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletKeyApi->getWalletKeyUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**string**](../Model/.md)| Wallet Key ID |

### Return type

[**\com\hydrogen\molecule\Model\WalletKeyResponse**](../Model/WalletKeyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

