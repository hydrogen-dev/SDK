# com\hydrogen\integration\RTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRtpTransferUsingDelete**](RTPApi.md#cancelRtpTransferUsingDelete) | **DELETE** /rtp/{nucleus_funding_id} | Cancel the RTP transfer
[**createBankLinkUsingPost2**](RTPApi.md#createBankLinkUsingPost2) | **POST** /rtp/bank_link | Create bank link
[**deleteBankLinkUsingDelete2**](RTPApi.md#deleteBankLinkUsingDelete2) | **DELETE** /rtp/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getBankLinkUsingGet2**](RTPApi.md#getBankLinkUsingGet2) | **GET** /rtp/bank_link/{nucleus_bank_link_id} | Get bank link
[**getClientBankLinksUsingGet1**](RTPApi.md#getClientBankLinksUsingGet1) | **GET** /rtp/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfRtpTransfersUsingGet**](RTPApi.md#getListOfRtpTransfersUsingGet) | **GET** /rtp/client/{nucleus_client_id} | Get a list of Rtp transfers
[**getRtpTransferUsingGet**](RTPApi.md#getRtpTransferUsingGet) | **GET** /rtp/{nucleus_funding_id} | Get the RTP transfer
[**submitRtpTransferUsingPost**](RTPApi.md#submitRtpTransferUsingPost) | **POST** /rtp | Submit a RTP transfer
[**updateBankLinkUsingPut2**](RTPApi.md#updateBankLinkUsingPut2) | **PUT** /rtp/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancelRtpTransferUsingDelete**
> \com\hydrogen\integration\Model\RtpTransferResponseVO cancelRtpTransferUsingDelete($nucleus_funding_id)

Cancel the RTP transfer

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_funding_id = "nucleus_funding_id_example"; // string | nucleus_funding_id

try {
    $result = $apiInstance->cancelRtpTransferUsingDelete($nucleus_funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->cancelRtpTransferUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**string**](../Model/.md)| nucleus_funding_id |

### Return type

[**\com\hydrogen\integration\Model\RtpTransferResponseVO**](../Model/RtpTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBankLinkUsingPost2**
> \com\hydrogen\integration\Model\RtpBankLinkResponseVO createBankLinkUsingPost2($request)

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$request = new \com\hydrogen\integration\Model\RtpBankLinkRequestCO(); // \com\hydrogen\integration\Model\RtpBankLinkRequestCO | request

try {
    $result = $apiInstance->createBankLinkUsingPost2($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->createBankLinkUsingPost2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\com\hydrogen\integration\Model\RtpBankLinkRequestCO**](../Model/RtpBankLinkRequestCO.md)| request |

### Return type

[**\com\hydrogen\integration\Model\RtpBankLinkResponseVO**](../Model/RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBankLinkUsingDelete2**
> \com\hydrogen\integration\Model\RtpBankLinkResponseVO deleteBankLinkUsingDelete2($nucleus_bank_link_id)

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->deleteBankLinkUsingDelete2($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->deleteBankLinkUsingDelete2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\RtpBankLinkResponseVO**](../Model/RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkUsingGet2**
> \com\hydrogen\integration\Model\RtpBankLinkResponseVO getBankLinkUsingGet2($nucleus_bank_link_id)

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->getBankLinkUsingGet2($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->getBankLinkUsingGet2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\RtpBankLinkResponseVO**](../Model/RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientBankLinksUsingGet1**
> \com\hydrogen\integration\Model\RtpBankLinkResponseVO[] getClientBankLinksUsingGet1($nucleus_client_id)

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id

try {
    $result = $apiInstance->getClientBankLinksUsingGet1($nucleus_client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->getClientBankLinksUsingGet1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |

### Return type

[**\com\hydrogen\integration\Model\RtpBankLinkResponseVO[]**](../Model/RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getListOfRtpTransfersUsingGet**
> \com\hydrogen\integration\Model\RtpTransferResponseVO[] getListOfRtpTransfersUsingGet($nucleus_client_id)

Get a list of Rtp transfers

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id

try {
    $result = $apiInstance->getListOfRtpTransfersUsingGet($nucleus_client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->getListOfRtpTransfersUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |

### Return type

[**\com\hydrogen\integration\Model\RtpTransferResponseVO[]**](../Model/RtpTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRtpTransferUsingGet**
> \com\hydrogen\integration\Model\RtpTransferResponseVO getRtpTransferUsingGet($nucleus_funding_id)

Get the RTP transfer

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_funding_id = "nucleus_funding_id_example"; // string | nucleus_funding_id

try {
    $result = $apiInstance->getRtpTransferUsingGet($nucleus_funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->getRtpTransferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**string**](../Model/.md)| nucleus_funding_id |

### Return type

[**\com\hydrogen\integration\Model\RtpTransferResponseVO**](../Model/RtpTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **submitRtpTransferUsingPost**
> \com\hydrogen\integration\Model\RtpTransferResponseVO submitRtpTransferUsingPost($transfer_request)

Submit a RTP transfer

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transfer_request = new \com\hydrogen\integration\Model\RtpTransferRequestCO(); // \com\hydrogen\integration\Model\RtpTransferRequestCO | transferRequest

try {
    $result = $apiInstance->submitRtpTransferUsingPost($transfer_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->submitRtpTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**\com\hydrogen\integration\Model\RtpTransferRequestCO**](../Model/RtpTransferRequestCO.md)| transferRequest |

### Return type

[**\com\hydrogen\integration\Model\RtpTransferResponseVO**](../Model/RtpTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkUsingPut2**
> \com\hydrogen\integration\Model\RtpBankLinkResponseVO updateBankLinkUsingPut2($nucleus_bank_link_id)

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
$apiInstance = new com\hydrogen\integration\Api\RTPApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->updateBankLinkUsingPut2($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RTPApi->updateBankLinkUsingPut2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\RtpBankLinkResponseVO**](../Model/RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

