# com\hydrogen\integration\CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoReloadUsingPost**](CardApi.md#createAutoReloadUsingPost) | **POST** /card/auto_reload | Card auto reload
[**createCardActivateUsingPost**](CardApi.md#createCardActivateUsingPost) | **POST** /card/activate | Activate card
[**createCardBusinessUsingPost**](CardApi.md#createCardBusinessUsingPost) | **POST** /card/business | Create a card business
[**createCardCloseUsingPost**](CardApi.md#createCardCloseUsingPost) | **POST** /card/close | close a card
[**createCardIssueUsingPost**](CardApi.md#createCardIssueUsingPost) | **POST** /card/issue | issue a card
[**createCardLoadUsingPost**](CardApi.md#createCardLoadUsingPost) | **POST** /card/load | Create a card load
[**createCardPinUsingPost**](CardApi.md#createCardPinUsingPost) | **POST** /card/pin | pin card
[**createCardReactivateUsingPost**](CardApi.md#createCardReactivateUsingPost) | **POST** /card/reactivate | reactivate card
[**createCardReissueUsingPost**](CardApi.md#createCardReissueUsingPost) | **POST** /card/reissue | Reissue a card
[**createCardReplaceUsingPost**](CardApi.md#createCardReplaceUsingPost) | **POST** /card/replace | Create card replace
[**createCardSpendingControlUsingPost**](CardApi.md#createCardSpendingControlUsingPost) | **POST** /card/spending_control | Create card spending control
[**createCardSuspendUsingPost**](CardApi.md#createCardSuspendUsingPost) | **POST** /card/suspend | suspend card
[**createCardTokenUsingPost**](CardApi.md#createCardTokenUsingPost) | **POST** /card/token | token card
[**createCardUnloadUsingPost**](CardApi.md#createCardUnloadUsingPost) | **POST** /card/unload | Create a card upload
[**createClientCardUsingPost**](CardApi.md#createClientCardUsingPost) | **POST** /card/client | Create a card client
[**getCardBalanceUsingGet**](CardApi.md#getCardBalanceUsingGet) | **GET** /card/balance/{id} | Get a Card Balance
[**getCardImage**](CardApi.md#getCardImage) | **GET** /card/image/{card_id} | Get card image
[**getCardPciDetails**](CardApi.md#getCardPciDetails) | **GET** /card/pci_details/{card_id} | Get card pci details
[**getCardReserveAccountDetailsUsingGet**](CardApi.md#getCardReserveAccountDetailsUsingGet) | **GET** /card/reserve | Card reserve account
[**getCardStatementUsingGet**](CardApi.md#getCardStatementUsingGet) | **GET** /card/statement/{card_id} | Get card statement
[**getCardTokenUsingToken**](CardApi.md#getCardTokenUsingToken) | **GET** /card/token/{id} | Get a card token
[**getCardTransactionUsingGet**](CardApi.md#getCardTransactionUsingGet) | **GET** /card/transaction/{id} | Get a card transaction
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{id} | Get a card information
[**updateCardBusinessUsingPut**](CardApi.md#updateCardBusinessUsingPut) | **PUT** /card/business/{nucleus_business_id} | Update a card business
[**updateCardPinUsingPost**](CardApi.md#updateCardPinUsingPost) | **PUT** /card/pin/{id} | update a pin card
[**updateCardSpendingControlUsingPut**](CardApi.md#updateCardSpendingControlUsingPut) | **PUT** /card/spending_control/{nucleus_spending_control_id} | Update a card spending control
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{id} | Update a card information
[**updateClientCardUsingPut**](CardApi.md#updateClientCardUsingPut) | **PUT** /card/client/{id} | Update a card client
[**verifyCardPinUsingPost**](CardApi.md#verifyCardPinUsingPost) | **POST** /card/pin/verify | verify card pin


# **createAutoReloadUsingPost**
> \com\hydrogen\integration\Model\CardAutoReloadResponseVO createAutoReloadUsingPost($request)

Card auto reload

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
$request = new \com\hydrogen\integration\Model\CardAutoReloadRequestCO(); // \com\hydrogen\integration\Model\CardAutoReloadRequestCO | request

try {
    $result = $apiInstance->createAutoReloadUsingPost($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createAutoReloadUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\com\hydrogen\integration\Model\CardAutoReloadRequestCO**](../Model/CardAutoReloadRequestCO.md)| request |

### Return type

[**\com\hydrogen\integration\Model\CardAutoReloadResponseVO**](../Model/CardAutoReloadResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

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

# **createCardBusinessUsingPost**
> \com\hydrogen\integration\Model\CreateBusinessResponseVO createCardBusinessUsingPost($card_business_request_co)

Create a card business

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
$card_business_request_co = new \com\hydrogen\integration\Model\CardBusinessRequestCO(); // \com\hydrogen\integration\Model\CardBusinessRequestCO | cardBusinessRequestCO

try {
    $result = $apiInstance->createCardBusinessUsingPost($card_business_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardBusinessUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_business_request_co** | [**\com\hydrogen\integration\Model\CardBusinessRequestCO**](../Model/CardBusinessRequestCO.md)| cardBusinessRequestCO |

### Return type

[**\com\hydrogen\integration\Model\CreateBusinessResponseVO**](../Model/CreateBusinessResponseVO.md)

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

# **createCardLoadUsingPost**
> \com\hydrogen\integration\Model\CardLoadUnloadResponseVO createCardLoadUsingPost($load_request)

Create a card load

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
$load_request = new \com\hydrogen\integration\Model\CardLoadRequestCO(); // \com\hydrogen\integration\Model\CardLoadRequestCO | loadRequest

try {
    $result = $apiInstance->createCardLoadUsingPost($load_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardLoadUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_request** | [**\com\hydrogen\integration\Model\CardLoadRequestCO**](../Model/CardLoadRequestCO.md)| loadRequest |

### Return type

[**\com\hydrogen\integration\Model\CardLoadUnloadResponseVO**](../Model/CardLoadUnloadResponseVO.md)

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

# **createCardReplaceUsingPost**
> \com\hydrogen\integration\Model\CardReplaceResponseVO createCardReplaceUsingPost($request)

Create card replace

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
    $result = $apiInstance->createCardReplaceUsingPost($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardReplaceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\com\hydrogen\integration\Model\CardBaseRequestCO**](../Model/CardBaseRequestCO.md)| request |

### Return type

[**\com\hydrogen\integration\Model\CardReplaceResponseVO**](../Model/CardReplaceResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardSpendingControlUsingPost**
> \com\hydrogen\integration\Model\CardSpendingControlResponseVO createCardSpendingControlUsingPost($request)

Create card spending control

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
$request = new \com\hydrogen\integration\Model\CardSpendingControlRequestCO(); // \com\hydrogen\integration\Model\CardSpendingControlRequestCO | request

try {
    $result = $apiInstance->createCardSpendingControlUsingPost($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardSpendingControlUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\com\hydrogen\integration\Model\CardSpendingControlRequestCO**](../Model/CardSpendingControlRequestCO.md)| request |

### Return type

[**\com\hydrogen\integration\Model\CardSpendingControlResponseVO**](../Model/CardSpendingControlResponseVO.md)

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

# **createCardUnloadUsingPost**
> \com\hydrogen\integration\Model\CardLoadUnloadResponseVO createCardUnloadUsingPost($reload_request)

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

[**\com\hydrogen\integration\Model\CardLoadUnloadResponseVO**](../Model/CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientCardUsingPost**
> \com\hydrogen\integration\Model\CreateCardClientResponseVO createClientCardUsingPost($card_client_request_co)

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

[**\com\hydrogen\integration\Model\CreateCardClientResponseVO**](../Model/CreateCardClientResponseVO.md)

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

# **getCardImage**
> \com\hydrogen\integration\Model\GetCardImageResponseVO getCardImage($card_id)

Get card image

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
$card_id = "card_id_example"; // string | card_id

try {
    $result = $apiInstance->getCardImage($card_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardImage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| card_id |

### Return type

[**\com\hydrogen\integration\Model\GetCardImageResponseVO**](../Model/GetCardImageResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardPciDetails**
> \com\hydrogen\integration\Model\GetCardPciDetailsResponseVO getCardPciDetails($card_id)

Get card pci details

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
$card_id = "card_id_example"; // string | card_id

try {
    $result = $apiInstance->getCardPciDetails($card_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardPciDetails: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| card_id |

### Return type

[**\com\hydrogen\integration\Model\GetCardPciDetailsResponseVO**](../Model/GetCardPciDetailsResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardReserveAccountDetailsUsingGet**
> \com\hydrogen\integration\Model\CardReserveAccountResponseVO getCardReserveAccountDetailsUsingGet()

Card reserve account

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

try {
    $result = $apiInstance->getCardReserveAccountDetailsUsingGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardReserveAccountDetailsUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\com\hydrogen\integration\Model\CardReserveAccountResponseVO**](../Model/CardReserveAccountResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardStatementUsingGet**
> \com\hydrogen\integration\Model\GetCardStatementResponseVO getCardStatementUsingGet($card_id, $end_date, $start_date)

Get card statement

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
$card_id = "card_id_example"; // string | card_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getCardStatementUsingGet($card_id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardStatementUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| card_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\GetCardStatementResponseVO**](../Model/GetCardStatementResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardTokenUsingToken**
> \com\hydrogen\integration\Model\GetCardTokenResponseVO[] getCardTokenUsingToken($id, $device_id, $device_type, $wallet)

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
$device_id = "device_id_example"; // string | device_id
$device_type = "device_type_example"; // string | device_type
$wallet = "wallet_example"; // string | wallet

try {
    $result = $apiInstance->getCardTokenUsingToken($id, $device_id, $device_type, $wallet);
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
 **device_id** | **string**| device_id | [optional]
 **device_type** | **string**| device_type | [optional]
 **wallet** | **string**| wallet | [optional]

### Return type

[**\com\hydrogen\integration\Model\GetCardTokenResponseVO[]**](../Model/GetCardTokenResponseVO.md)

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

# **updateCardBusinessUsingPut**
> \com\hydrogen\integration\Model\UpdateBusinessResponseVO updateCardBusinessUsingPut($nucleus_business_id)

Update a card business

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
$nucleus_business_id = "nucleus_business_id_example"; // string | nucleus_business_id

try {
    $result = $apiInstance->updateCardBusinessUsingPut($nucleus_business_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardBusinessUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_business_id** | [**string**](../Model/.md)| nucleus_business_id |

### Return type

[**\com\hydrogen\integration\Model\UpdateBusinessResponseVO**](../Model/UpdateBusinessResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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
$card_pin_request_co = new \com\hydrogen\integration\Model\CardUpdatePinRequestCO(); // \com\hydrogen\integration\Model\CardUpdatePinRequestCO | cardPinRequestCO
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
 **card_pin_request_co** | [**\com\hydrogen\integration\Model\CardUpdatePinRequestCO**](../Model/CardUpdatePinRequestCO.md)| cardPinRequestCO |
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\BaseResponseVO**](../Model/BaseResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCardSpendingControlUsingPut**
> \com\hydrogen\integration\Model\CardSpendingControlResponseVO updateCardSpendingControlUsingPut($nucleus_spending_control_id)

Update a card spending control

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
$nucleus_spending_control_id = "nucleus_spending_control_id_example"; // string | nucleus_spending_control_id

try {
    $result = $apiInstance->updateCardSpendingControlUsingPut($nucleus_spending_control_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardSpendingControlUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_spending_control_id** | [**string**](../Model/.md)| nucleus_spending_control_id |

### Return type

[**\com\hydrogen\integration\Model\CardSpendingControlResponseVO**](../Model/CardSpendingControlResponseVO.md)

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

# **updateClientCardUsingPut**
> \com\hydrogen\integration\Model\UpdateCardClientResponseVO updateClientCardUsingPut($id)

Update a card client

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
    $result = $apiInstance->updateClientCardUsingPut($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateClientCardUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |

### Return type

[**\com\hydrogen\integration\Model\UpdateCardClientResponseVO**](../Model/UpdateCardClientResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **verifyCardPinUsingPost**
> \com\hydrogen\integration\Model\BaseResponseVO verifyCardPinUsingPost($card_pin_request_co)

verify card pin

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
    $result = $apiInstance->verifyCardPinUsingPost($card_pin_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->verifyCardPinUsingPost: ', $e->getMessage(), PHP_EOL;
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

