# com\hydrogen\integration\CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardActivateUsingPost**](CardApi.md#createCardActivateUsingPost) | **POST** /card/activate | Activate card
[**createCardCloseUsingPost**](CardApi.md#createCardCloseUsingPost) | **POST** /card/close | close a card
[**createCardIssueUsingPost**](CardApi.md#createCardIssueUsingPost) | **POST** /card/issue | issue a card
[**createCardPinUsingPost**](CardApi.md#createCardPinUsingPost) | **POST** /card/pin | pin card
[**createCardReactivateUsingPost**](CardApi.md#createCardReactivateUsingPost) | **POST** /card/reactivate | reactivate card
[**createCardReissueUsingPost**](CardApi.md#createCardReissueUsingPost) | **POST** /card/reissue | Reissue a card
[**createCardReloadUsingPost**](CardApi.md#createCardReloadUsingPost) | **POST** /card/reload | Create a card reload
[**createCardSuspendUsingPost**](CardApi.md#createCardSuspendUsingPost) | **POST** /card/suspend | suspend card
[**createCardTokenUsingPost**](CardApi.md#createCardTokenUsingPost) | **POST** /card/token | token card
[**createCardTransferUsingPost**](CardApi.md#createCardTransferUsingPost) | **POST** /card/transfer | Create Card transfer
[**createCardUnloadUsingPost**](CardApi.md#createCardUnloadUsingPost) | **POST** /card/unload | Create a card upload
[**createClientCardUsingPost**](CardApi.md#createClientCardUsingPost) | **POST** /card/client | Create a card client
[**getCardBalanceUsingGet**](CardApi.md#getCardBalanceUsingGet) | **GET** /card/balance/{id} | Get a Card Balance
[**getCardTokenUsingToken**](CardApi.md#getCardTokenUsingToken) | **GET** /card/token/{id} | Get a card token
[**getCardTransactionUsingGet**](CardApi.md#getCardTransactionUsingGet) | **GET** /card/transaction/{id} | Get a card transaction
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{id} | Get a card information
[**updateCardPinUsingPost**](CardApi.md#updateCardPinUsingPost) | **PUT** /card/pin/{id} | update a pin card
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{id} | Update a card information


# **createCardActivateUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardActivateUsingPost($activate_request)

Activate card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$activate_request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | activateRequest

try {
    $result = $apiInstance->createCardActivateUsingPost($activate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardActivateUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activate_request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| activateRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardCloseUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardCloseUsingPost($close_request)

close a card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$close_request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | closeRequest

try {
    $result = $apiInstance->createCardCloseUsingPost($close_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardCloseUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **close_request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| closeRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardIssueUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardIssueUsingPost($issue_request)

issue a card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$issue_request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | issueRequest

try {
    $result = $apiInstance->createCardIssueUsingPost($issue_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardIssueUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| issueRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardPinUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardPinUsingPost($card_pin_request_co)

pin card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_pin_request_co = new \com\hydrogen\integration\Model\CardPinRequestCO(); // \com\hydrogen\integration\Model\CardPinRequestCO | cardPinRequestCO

try {
    $result = $apiInstance->createCardPinUsingPost($card_pin_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardPinUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**\com\hydrogen\integration\Model\CardPinRequestCO**](../Model/CardPinRequestCO.md)| cardPinRequestCO |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardReactivateUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardReactivateUsingPost($reactivate_request)

reactivate card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$reactivate_request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | reactivateRequest

try {
    $result = $apiInstance->createCardReactivateUsingPost($reactivate_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardReactivateUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reactivate_request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| reactivateRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardReissueUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardReissueUsingPost($request)

Reissue a card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | request

try {
    $result = $apiInstance->createCardReissueUsingPost($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardReissueUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| request |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardReloadUsingPost**
> \com\hydrogen\integration\Model\CardReloadUnloadResponseVO createCardReloadUsingPost($reload_request)

Create a card reload

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$reload_request = new \com\hydrogen\integration\Model\CardReloadRequestCO(); // \com\hydrogen\integration\Model\CardReloadRequestCO | reloadRequest

try {
    $result = $apiInstance->createCardReloadUsingPost($reload_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardReloadUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**\com\hydrogen\integration\Model\CardReloadRequestCO**](../Model/CardReloadRequestCO.md)| reloadRequest |

### Return type

[**\com\hydrogen\integration\Model\CardReloadUnloadResponseVO**](../Model/CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardSuspendUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO createCardSuspendUsingPost($suspend_request)

suspend card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$suspend_request = new \com\hydrogen\integration\Model\CardBaseRequestCO(); // \com\hydrogen\integration\Model\CardBaseRequestCO | suspendRequest

try {
    $result = $apiInstance->createCardSuspendUsingPost($suspend_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardSuspendUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suspend_request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| suspendRequest |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardTokenUsingPost**
> \com\hydrogen\integration\Model\CardTokenResponseVO createCardTokenUsingPost($tokenize_request)

token card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tokenize_request = new \com\hydrogen\integration\Model\CardTokenRequestCO(); // \com\hydrogen\integration\Model\CardTokenRequestCO | tokenizeRequest

try {
    $result = $apiInstance->createCardTokenUsingPost($tokenize_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardTokenUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenize_request** | [**\com\hydrogen\integration\Model\CardTokenRequestCO**](../Model/CardTokenRequestCO.md)| tokenizeRequest |

### Return type

[**\com\hydrogen\integration\Model\CardTokenResponseVO**](../Model/CardTokenResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardTransferUsingPost**
> \com\hydrogen\integration\Model\CardTransferResponseVO createCardTransferUsingPost($transfer_request)

Create Card transfer

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transfer_request = new \com\hydrogen\integration\Model\CardTransferRequestCO(); // \com\hydrogen\integration\Model\CardTransferRequestCO | transferRequest

try {
    $result = $apiInstance->createCardTransferUsingPost($transfer_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**\com\hydrogen\integration\Model\CardTransferRequestCO**](../Model/CardTransferRequestCO.md)| transferRequest |

### Return type

[**\com\hydrogen\integration\Model\CardTransferResponseVO**](../Model/CardTransferResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardUnloadUsingPost**
> \com\hydrogen\integration\Model\CardReloadUnloadResponseVO createCardUnloadUsingPost($reload_request)

Create a card upload

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$reload_request = new \com\hydrogen\integration\Model\CardUnloadRequestCO(); // \com\hydrogen\integration\Model\CardUnloadRequestCO | reloadRequest

try {
    $result = $apiInstance->createCardUnloadUsingPost($reload_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardUnloadUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**\com\hydrogen\integration\Model\CardUnloadRequestCO**](../Model/CardUnloadRequestCO.md)| reloadRequest |

### Return type

[**\com\hydrogen\integration\Model\CardReloadUnloadResponseVO**](../Model/CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientCardUsingPost**
> \com\hydrogen\integration\Model\CardClientResponseVO createClientCardUsingPost($card_client_request_co)

Create a card client

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_client_request_co = new \com\hydrogen\integration\Model\CardClientRequestCO(); // \com\hydrogen\integration\Model\CardClientRequestCO | cardClientRequestCO

try {
    $result = $apiInstance->createClientCardUsingPost($card_client_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createClientCardUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_client_request_co** | [**\com\hydrogen\integration\Model\CardClientRequestCO**](../Model/CardClientRequestCO.md)| cardClientRequestCO |

### Return type

[**\com\hydrogen\integration\Model\CardClientResponseVO**](../Model/CardClientResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardBalanceUsingGet**
> \com\hydrogen\integration\Model\CardBalanceResponseVO getCardBalanceUsingGet($id, $end_date, $start_date)

Get a Card Balance

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getCardBalanceUsingGet($id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\CardBalanceResponseVO**](../Model/CardBalanceResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardTokenUsingToken**
> \com\hydrogen\integration\Model\GetCardTokenResponseVO getCardTokenUsingToken($id)

Get a card token

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id

try {
    $result = $apiInstance->getCardTokenUsingToken($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardTokenUsingToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\GetCardTokenResponseVO**](../Model/GetCardTokenResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardTransactionUsingGet**
> \com\hydrogen\integration\Model\CardTransactionResponseVO getCardTransactionUsingGet($id, $end_date, $start_date)

Get a card transaction

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getCardTransactionUsingGet($id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\CardTransactionResponseVO**](../Model/CardTransactionResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardUsingGet**
> \com\hydrogen\integration\Model\BaseResponseVO getCardUsingGet($id)

Get a card information

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id

try {
    $result = $apiInstance->getCardUsingGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCardPinUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO updateCardPinUsingPost($card_pin_request_co, $id)

update a pin card

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_pin_request_co = new \com\hydrogen\integration\Model\CardPinRequestCO(); // \com\hydrogen\integration\Model\CardPinRequestCO | cardPinRequestCO
$id = "id_example"; // string | id

try {
    $result = $apiInstance->updateCardPinUsingPost($card_pin_request_co, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardPinUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**\com\hydrogen\integration\Model\CardPinRequestCO**](../Model/CardPinRequestCO.md)| cardPinRequestCO |
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCardUsingPut**
> \com\hydrogen\integration\Model\BaseResponseVO updateCardUsingPut($id)

Update a card information

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
$apiInstance = new com\hydrogen\integration\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id

try {
    $result = $apiInstance->updateCardUsingPut($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

