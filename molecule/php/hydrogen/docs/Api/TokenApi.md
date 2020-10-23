# com\hydrogen\molecule\TokenApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**burnTokenUsingPost**](TokenApi.md#burnTokenUsingPost) | **POST** /token/burn | Burn tokens
[**createTokenUsingPost**](TokenApi.md#createTokenUsingPost) | **POST** /token | Creates a new Token
[**deleteTokenUsingDelete**](TokenApi.md#deleteTokenUsingDelete) | **DELETE** /token/{token_id} | Delete Token
[**deployTokenUsingPost**](TokenApi.md#deployTokenUsingPost) | **POST** /token/deploy | Deploys provided Token to network
[**getTokenAllUsingGet**](TokenApi.md#getTokenAllUsingGet) | **GET** /token | Fetch Token list
[**getTokenUsingGet**](TokenApi.md#getTokenUsingGet) | **GET** /token/{token_id} | Fetch Token details
[**mintTokenUsingPost**](TokenApi.md#mintTokenUsingPost) | **POST** /token/mint | Mint new tokens
[**updateTokenUsingPut**](TokenApi.md#updateTokenUsingPut) | **PUT** /token/{token_id} | Update Token details
[**whitelistTokenUsingPost**](TokenApi.md#whitelistTokenUsingPost) | **POST** /token/whitelist | Whitelist token for provided wallet


# **burnTokenUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse burnTokenUsingPost($token_burn_params)

Burn tokens

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_burn_params = new \com\hydrogen\molecule\Model\TokenBurnParams(); // \com\hydrogen\molecule\Model\TokenBurnParams | Burns provided amount of existing tokens

try {
    $result = $apiInstance->burnTokenUsingPost($token_burn_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->burnTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_burn_params** | [**\com\hydrogen\molecule\Model\TokenBurnParams**](../Model/TokenBurnParams.md)| Burns provided amount of existing tokens |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createTokenUsingPost**
> \com\hydrogen\molecule\Model\TokenResponse createTokenUsingPost($token_params)

Creates a new Token

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_params = new \com\hydrogen\molecule\Model\TokenParams(); // \com\hydrogen\molecule\Model\TokenParams | It enables a user to create a Token

try {
    $result = $apiInstance->createTokenUsingPost($token_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->createTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_params** | [**\com\hydrogen\molecule\Model\TokenParams**](../Model/TokenParams.md)| It enables a user to create a Token |

### Return type

[**\com\hydrogen\molecule\Model\TokenResponse**](../Model/TokenResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteTokenUsingDelete**
> deleteTokenUsingDelete($token_id)

Delete Token

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = "token_id_example"; // string | Token ID

try {
    $apiInstance->deleteTokenUsingDelete($token_id);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->deleteTokenUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**string**](../Model/.md)| Token ID |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deployTokenUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse deployTokenUsingPost($token_deploy_params)

Deploys provided Token to network

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_deploy_params = new \com\hydrogen\molecule\Model\TokenDeployParams(); // \com\hydrogen\molecule\Model\TokenDeployParams | Deploys provided Token to network

try {
    $result = $apiInstance->deployTokenUsingPost($token_deploy_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->deployTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_deploy_params** | [**\com\hydrogen\molecule\Model\TokenDeployParams**](../Model/TokenDeployParams.md)| Deploys provided Token to network |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenAllUsingGet**
> \com\hydrogen\molecule\Model\PageTokenResponse_ getTokenAllUsingGet($page, $size, $order_by, $ascending, $get_latest)

Fetch Token list

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | To filter response Token list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getTokenAllUsingGet($page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->getTokenAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Token list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageTokenResponse_**](../Model/PageTokenResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenUsingGet**
> \com\hydrogen\molecule\Model\TokenResponse getTokenUsingGet($token_id)

Fetch Token details

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = "token_id_example"; // string | Token ID

try {
    $result = $apiInstance->getTokenUsingGet($token_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->getTokenUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**string**](../Model/.md)| Token ID |

### Return type

[**\com\hydrogen\molecule\Model\TokenResponse**](../Model/TokenResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **mintTokenUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse mintTokenUsingPost($token_mint_params)

Mint new tokens

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_mint_params = new \com\hydrogen\molecule\Model\TokenMintParams(); // \com\hydrogen\molecule\Model\TokenMintParams | Mint new tokens

try {
    $result = $apiInstance->mintTokenUsingPost($token_mint_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->mintTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_mint_params** | [**\com\hydrogen\molecule\Model\TokenMintParams**](../Model/TokenMintParams.md)| Mint new tokens |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateTokenUsingPut**
> \com\hydrogen\molecule\Model\TokenResponse updateTokenUsingPut($token_id, $token_update_params)

Update Token details

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = "token_id_example"; // string | Token ID
$token_update_params = new \com\hydrogen\molecule\Model\TokenUpdateParams(); // \com\hydrogen\molecule\Model\TokenUpdateParams | Token details to be updated

try {
    $result = $apiInstance->updateTokenUsingPut($token_id, $token_update_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->updateTokenUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**string**](../Model/.md)| Token ID |
 **token_update_params** | [**\com\hydrogen\molecule\Model\TokenUpdateParams**](../Model/TokenUpdateParams.md)| Token details to be updated | [optional]

### Return type

[**\com\hydrogen\molecule\Model\TokenResponse**](../Model/TokenResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **whitelistTokenUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse whitelistTokenUsingPost($token_whitelist_params)

Whitelist token for provided wallet

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

$apiInstance = new com\hydrogen\molecule\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_whitelist_params = new \com\hydrogen\molecule\Model\TokenWhitelistParams(); // \com\hydrogen\molecule\Model\TokenWhitelistParams | Whitelist token for provided wallet

try {
    $result = $apiInstance->whitelistTokenUsingPost($token_whitelist_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->whitelistTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_whitelist_params** | [**\com\hydrogen\molecule\Model\TokenWhitelistParams**](../Model/TokenWhitelistParams.md)| Whitelist token for provided wallet |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

