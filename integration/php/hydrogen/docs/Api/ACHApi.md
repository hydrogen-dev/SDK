# com\hydrogen\integration\ACHApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelAchTransferUsingDelete**](ACHApi.md#cancelAchTransferUsingDelete) | **DELETE** /ach/{nucleus_funding_id} | Cancel the ACH transfer
[**createAchCardLinkUsingPost**](ACHApi.md#createAchCardLinkUsingPost) | **POST** /ach/card_link | Create an ACH card link
[**createBankLinkUsingPost**](ACHApi.md#createBankLinkUsingPost) | **POST** /ach/bank_link | Create bank link
[**createBusinessUsingPost**](ACHApi.md#createBusinessUsingPost) | **POST** /ach/business | Create a business
[**createClientUsingPost**](ACHApi.md#createClientUsingPost) | **POST** /ach/client | Create a client
[**deleteBankLinkUsingDelete**](ACHApi.md#deleteBankLinkUsingDelete) | **DELETE** /ach/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getAchTransferUsingGet**](ACHApi.md#getAchTransferUsingGet) | **GET** /ach/{nucleus_funding_id} | Get the ACH transfer
[**getBalanceUsingGet**](ACHApi.md#getBalanceUsingGet) | **GET** /ach/balance/{portfolio_id} | Get balance
[**getBankLinkUsingGet**](ACHApi.md#getBankLinkUsingGet) | **GET** /ach/bank_link/{nucleus_bank_link_id} | Get bank link
[**getBankLinksForReserveAccountUsingGet**](ACHApi.md#getBankLinksForReserveAccountUsingGet) | **GET** /ach/bank_link/reserve | Get bank links for a reserve account
[**getClientBankLinksUsingGet**](ACHApi.md#getClientBankLinksUsingGet) | **GET** /ach/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfClientAchTransfersUsingGet**](ACHApi.md#getListOfClientAchTransfersUsingGet) | **GET** /ach/client/{nucleus_client_id} | Get a list of client&#39;s ACH transfers
[**getListOfTenantAchTransfersUsingGet**](ACHApi.md#getListOfTenantAchTransfersUsingGet) | **GET** /ach | Get a list of tenant&#39;s ACH transfers
[**submitAchTransferUsingPost**](ACHApi.md#submitAchTransferUsingPost) | **POST** /ach | Submit an ACH transfer
[**updateBankLinkUsingPut**](ACHApi.md#updateBankLinkUsingPut) | **PUT** /ach/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancelAchTransferUsingDelete**
> \com\hydrogen\integration\Model\AchTransferResponseVO cancelAchTransferUsingDelete($nucleus_funding_id)

Cancel the ACH transfer

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_funding_id = "nucleus_funding_id_example"; // string | nucleus_funding_id

try {
    $result = $apiInstance->cancelAchTransferUsingDelete($nucleus_funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->cancelAchTransferUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**string**](../Model/.md)| nucleus_funding_id |

### Return type

[**\com\hydrogen\integration\Model\AchTransferResponseVO**](../Model/AchTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAchCardLinkUsingPost**
> \com\hydrogen\integration\Model\AchCardLinkResponseVO createAchCardLinkUsingPost($card_link_request_co)

Create an ACH card link

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_link_request_co = new \com\hydrogen\integration\Model\AchCardLinkRequestCO(); // \com\hydrogen\integration\Model\AchCardLinkRequestCO | cardLinkRequestCO

try {
    $result = $apiInstance->createAchCardLinkUsingPost($card_link_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->createAchCardLinkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_link_request_co** | [**\com\hydrogen\integration\Model\AchCardLinkRequestCO**](../Model/AchCardLinkRequestCO.md)| cardLinkRequestCO |

### Return type

[**\com\hydrogen\integration\Model\AchCardLinkResponseVO**](../Model/AchCardLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBankLinkUsingPost**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO createBankLinkUsingPost($ach_bank_link_request_co)

Create bank link

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ach_bank_link_request_co = new \com\hydrogen\integration\Model\AchBankLinkRequestCO(); // \com\hydrogen\integration\Model\AchBankLinkRequestCO | achBankLinkRequestCO

try {
    $result = $apiInstance->createBankLinkUsingPost($ach_bank_link_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->createBankLinkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ach_bank_link_request_co** | [**\com\hydrogen\integration\Model\AchBankLinkRequestCO**](../Model/AchBankLinkRequestCO.md)| achBankLinkRequestCO |

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBusinessUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createBusinessUsingPost($business_request)

Create a business

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_request = new \com\hydrogen\integration\Model\AchBusinessRequestCO(); // \com\hydrogen\integration\Model\AchBusinessRequestCO | businessRequest

try {
    $result = $apiInstance->createBusinessUsingPost($business_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->createBusinessUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**\com\hydrogen\integration\Model\AchBusinessRequestCO**](../Model/AchBusinessRequestCO.md)| businessRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientUsingPost**
> \com\hydrogen\integration\Model\AchClientResponseVO createClientUsingPost($client_request)

Create a client

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_request = new \com\hydrogen\integration\Model\AchClientRequestCO(); // \com\hydrogen\integration\Model\AchClientRequestCO | clientRequest

try {
    $result = $apiInstance->createClientUsingPost($client_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->createClientUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_request** | [**\com\hydrogen\integration\Model\AchClientRequestCO**](../Model/AchClientRequestCO.md)| clientRequest |

### Return type

[**\com\hydrogen\integration\Model\AchClientResponseVO**](../Model/AchClientResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBankLinkUsingDelete**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO deleteBankLinkUsingDelete($nucleus_bank_link_id)

Delete bank link

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->deleteBankLinkUsingDelete($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->deleteBankLinkUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAchTransferUsingGet**
> \com\hydrogen\integration\Model\AchTransferResponseVO getAchTransferUsingGet($nucleus_funding_id)

Get the ACH transfer

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_funding_id = "nucleus_funding_id_example"; // string | nucleus_funding_id

try {
    $result = $apiInstance->getAchTransferUsingGet($nucleus_funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getAchTransferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**string**](../Model/.md)| nucleus_funding_id |

### Return type

[**\com\hydrogen\integration\Model\AchTransferResponseVO**](../Model/AchTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBalanceUsingGet**
> \com\hydrogen\integration\Model\AchBalanceResponseVO getBalanceUsingGet($portfolio_id, $end_date, $start_date)

Get balance

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getBalanceUsingGet($portfolio_id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\AchBalanceResponseVO**](../Model/AchBalanceResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkUsingGet**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO getBankLinkUsingGet($nucleus_bank_link_id)

Get bank link

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->getBankLinkUsingGet($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getBankLinkUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinksForReserveAccountUsingGet**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO[] getBankLinksForReserveAccountUsingGet()

Get bank links for a reserve account

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getBankLinksForReserveAccountUsingGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getBankLinksForReserveAccountUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO[]**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientBankLinksUsingGet**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO[] getClientBankLinksUsingGet($nucleus_client_id)

Get client bank links

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id

try {
    $result = $apiInstance->getClientBankLinksUsingGet($nucleus_client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getClientBankLinksUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO[]**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getListOfClientAchTransfersUsingGet**
> \com\hydrogen\integration\Model\PageAchTransferResponseVO_ getListOfClientAchTransfersUsingGet($nucleus_client_id, $page, $size)

Get a list of client's ACH transfers

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getListOfClientAchTransfersUsingGet($nucleus_client_id, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getListOfClientAchTransfersUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\integration\Model\PageAchTransferResponseVO_**](../Model/PageAchTransferResponseVO_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getListOfTenantAchTransfersUsingGet**
> \com\hydrogen\integration\Model\PageAchTransferResponseVO_ getListOfTenantAchTransfersUsingGet($end_date, $page, $size, $start_date, $status)

Get a list of tenant's ACH transfers

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date
$status = "status_example"; // string | status

try {
    $result = $apiInstance->getListOfTenantAchTransfersUsingGet($end_date, $page, $size, $start_date, $status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->getListOfTenantAchTransfersUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **\DateTime**| end_date | [optional]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start_date | [optional]
 **status** | **string**| status | [optional]

### Return type

[**\com\hydrogen\integration\Model\PageAchTransferResponseVO_**](../Model/PageAchTransferResponseVO_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **submitAchTransferUsingPost**
> \com\hydrogen\integration\Model\AchTransferResponseVO submitAchTransferUsingPost($transfer_request)

Submit an ACH transfer

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transfer_request = new \com\hydrogen\integration\Model\AchTransferRequestCO(); // \com\hydrogen\integration\Model\AchTransferRequestCO | transferRequest

try {
    $result = $apiInstance->submitAchTransferUsingPost($transfer_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->submitAchTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**\com\hydrogen\integration\Model\AchTransferRequestCO**](../Model/AchTransferRequestCO.md)| transferRequest |

### Return type

[**\com\hydrogen\integration\Model\AchTransferResponseVO**](../Model/AchTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkUsingPut**
> \com\hydrogen\integration\Model\AchBankLinkResponseVO updateBankLinkUsingPut($nucleus_bank_link_id)

Update bank link

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->updateBankLinkUsingPut($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->updateBankLinkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\AchBankLinkResponseVO**](../Model/AchBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

