# com\hydrogen\integration\BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrderUsingPut**](BrokerageApi.md#cancelOrderUsingPut) | **PUT** /brokerage/order/{nucleus_order_id} | Cancel an Order
[**createBankLinkUsingPost1**](BrokerageApi.md#createBankLinkUsingPost1) | **POST** /brokerage/bank_link | create a Bank Link
[**createBrokerageAccountUsingPost**](BrokerageApi.md#createBrokerageAccountUsingPost) | **POST** /brokerage/account | create a Brokerage account
[**createBrokerageClientUsingPost**](BrokerageApi.md#createBrokerageClientUsingPost) | **POST** /brokerage/client | Create a Brokerage Client
[**createDepositUsingPost**](BrokerageApi.md#createDepositUsingPost) | **POST** /brokerage/deposit | Create a deposit
[**createDocumentUsingPost**](BrokerageApi.md#createDocumentUsingPost) | **POST** /brokerage/document | Create a Brokerage document
[**createOrderUsingPost**](BrokerageApi.md#createOrderUsingPost) | **POST** /brokerage/order | Create an Order
[**createWithdrawalUsingPost**](BrokerageApi.md#createWithdrawalUsingPost) | **POST** /brokerage/withdrawal | Create a withdrawal
[**deleteBankLinkUsingDelete1**](BrokerageApi.md#deleteBankLinkUsingDelete1) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**getBalanceUsingGet1**](BrokerageApi.md#getBalanceUsingGet1) | **GET** /brokerage/balance/{nucleus_portfolio_id} | Get account balance
[**getBankLinkUsingGet1**](BrokerageApi.md#getBankLinkUsingGet1) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**getBrokerageAccountStatementUsingGet**](BrokerageApi.md#getBrokerageAccountStatementUsingGet) | **GET** /brokerage/statement/{nucleus_account_id} | Get a Brokerage account statement
[**getDocumentUsingGet**](BrokerageApi.md#getDocumentUsingGet) | **GET** /brokerage/document/{nucleus_document_id} | Get a Brokerage document
[**getHoldingPerformanceUsingGet**](BrokerageApi.md#getHoldingPerformanceUsingGet) | **GET** /brokerage/holding/performance/{nucleus_portfolio_id} | Get portfolio holding performance
[**getHoldingUsingGet**](BrokerageApi.md#getHoldingUsingGet) | **GET** /brokerage/holding/{nucleus_portfolio_id} | Get portfolio holdings
[**getOrderUsingGet**](BrokerageApi.md#getOrderUsingGet) | **GET** /brokerage/order/{nucleus_order_id} | Get an Order
[**getSecuritiesUsingGet**](BrokerageApi.md#getSecuritiesUsingGet) | **GET** /brokerage/securities | Get securities information
[**getTransactionsUsingGet**](BrokerageApi.md#getTransactionsUsingGet) | **GET** /brokerage/transaction/{nucleus_portfolio_id} | Get account transactions
[**updateBankLinkUsingPut1**](BrokerageApi.md#updateBankLinkUsingPut1) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**updateBrokerageClientUsingPut**](BrokerageApi.md#updateBrokerageClientUsingPut) | **PUT** /brokerage/client | Update a Brokerage client


# **cancelOrderUsingPut**
> cancelOrderUsingPut($nucleus_order_id)

Cancel an Order

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_order_id = "nucleus_order_id_example"; // string | nucleus_order_id

try {
    $apiInstance->cancelOrderUsingPut($nucleus_order_id);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->cancelOrderUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**string**](../Model/.md)| nucleus_order_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBankLinkUsingPost1**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO createBankLinkUsingPost1($brokerage_bank_link_co)

create a Bank Link

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$brokerage_bank_link_co = new \com\hydrogen\integration\Model\BrokerageBankLinkCO(); // \com\hydrogen\integration\Model\BrokerageBankLinkCO | brokerageBankLinkCO

try {
    $result = $apiInstance->createBankLinkUsingPost1($brokerage_bank_link_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createBankLinkUsingPost1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_bank_link_co** | [**\com\hydrogen\integration\Model\BrokerageBankLinkCO**](../Model/BrokerageBankLinkCO.md)| brokerageBankLinkCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageBankLinkVO**](../Model/BrokerageBankLinkVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBrokerageAccountUsingPost**
> \com\hydrogen\integration\Model\BrokerageAccountVO createBrokerageAccountUsingPost($brokerage_account_co)

create a Brokerage account

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$brokerage_account_co = new \com\hydrogen\integration\Model\BrokerageAccountCO(); // \com\hydrogen\integration\Model\BrokerageAccountCO | brokerageAccountCO

try {
    $result = $apiInstance->createBrokerageAccountUsingPost($brokerage_account_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createBrokerageAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_account_co** | [**\com\hydrogen\integration\Model\BrokerageAccountCO**](../Model/BrokerageAccountCO.md)| brokerageAccountCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageAccountVO**](../Model/BrokerageAccountVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBrokerageClientUsingPost**
> \com\hydrogen\integration\Model\BrokerageCreateClientVO createBrokerageClientUsingPost($client_co)

Create a Brokerage Client

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_co = new \com\hydrogen\integration\Model\BrokerageClientCO(); // \com\hydrogen\integration\Model\BrokerageClientCO | clientCO

try {
    $result = $apiInstance->createBrokerageClientUsingPost($client_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createBrokerageClientUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**\com\hydrogen\integration\Model\BrokerageClientCO**](../Model/BrokerageClientCO.md)| clientCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageCreateClientVO**](../Model/BrokerageCreateClientVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDepositUsingPost**
> \com\hydrogen\integration\Model\BrokerageDepositVO createDepositUsingPost($brokerage_deposit_co)

Create a deposit

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$brokerage_deposit_co = new \com\hydrogen\integration\Model\BrokerageDepositCO(); // \com\hydrogen\integration\Model\BrokerageDepositCO | brokerageDepositCO

try {
    $result = $apiInstance->createDepositUsingPost($brokerage_deposit_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createDepositUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_deposit_co** | [**\com\hydrogen\integration\Model\BrokerageDepositCO**](../Model/BrokerageDepositCO.md)| brokerageDepositCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageDepositVO**](../Model/BrokerageDepositVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDocumentUsingPost**
> \com\hydrogen\integration\Model\BrokerageDocumentVO createDocumentUsingPost($document_co)

Create a Brokerage document

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_co = new \com\hydrogen\integration\Model\BrokerageDocumentCO(); // \com\hydrogen\integration\Model\BrokerageDocumentCO | documentCO

try {
    $result = $apiInstance->createDocumentUsingPost($document_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createDocumentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_co** | [**\com\hydrogen\integration\Model\BrokerageDocumentCO**](../Model/BrokerageDocumentCO.md)| documentCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageDocumentVO**](../Model/BrokerageDocumentVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrderUsingPost**
> \com\hydrogen\integration\Model\BrokerageOrderVO createOrderUsingPost($brokerage_order_co)

Create an Order

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$brokerage_order_co = new \com\hydrogen\integration\Model\BrokerageOrderCO(); // \com\hydrogen\integration\Model\BrokerageOrderCO | brokerageOrderCO

try {
    $result = $apiInstance->createOrderUsingPost($brokerage_order_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createOrderUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_order_co** | [**\com\hydrogen\integration\Model\BrokerageOrderCO**](../Model/BrokerageOrderCO.md)| brokerageOrderCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageOrderVO**](../Model/BrokerageOrderVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createWithdrawalUsingPost**
> \com\hydrogen\integration\Model\BrokerageWithdrawalVO createWithdrawalUsingPost($brokerage_withdrawal_co)

Create a withdrawal

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$brokerage_withdrawal_co = new \com\hydrogen\integration\Model\BrokerageWithdrawalCO(); // \com\hydrogen\integration\Model\BrokerageWithdrawalCO | brokerageWithdrawalCO

try {
    $result = $apiInstance->createWithdrawalUsingPost($brokerage_withdrawal_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createWithdrawalUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_withdrawal_co** | [**\com\hydrogen\integration\Model\BrokerageWithdrawalCO**](../Model/BrokerageWithdrawalCO.md)| brokerageWithdrawalCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageWithdrawalVO**](../Model/BrokerageWithdrawalVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBankLinkUsingDelete1**
> deleteBankLinkUsingDelete1($nucleus_bank_link_id)

Delete a Bank Link

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $apiInstance->deleteBankLinkUsingDelete1($nucleus_bank_link_id);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->deleteBankLinkUsingDelete1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBalanceUsingGet1**
> \com\hydrogen\integration\Model\BrokerageBalanceVO getBalanceUsingGet1($nucleus_portfolio_id)

Get account balance

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id

try {
    $result = $apiInstance->getBalanceUsingGet1($nucleus_portfolio_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getBalanceUsingGet1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageBalanceVO**](../Model/BrokerageBalanceVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkUsingGet1**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO getBankLinkUsingGet1($nucleus_bank_link_id)

Get a Bank Link

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->getBankLinkUsingGet1($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getBankLinkUsingGet1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageBankLinkVO**](../Model/BrokerageBankLinkVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBrokerageAccountStatementUsingGet**
> \com\hydrogen\integration\Model\BrokerageStatementVO getBrokerageAccountStatementUsingGet($end_date, $nucleus_account_id, $start_date, $statement_type)

Get a Brokerage account statement

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | end_date
$nucleus_account_id = "nucleus_account_id_example"; // string | nucleus_account_id
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date
$statement_type = "statement_type_example"; // string | statement_type

try {
    $result = $apiInstance->getBrokerageAccountStatementUsingGet($end_date, $nucleus_account_id, $start_date, $statement_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getBrokerageAccountStatementUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **\DateTime**| end_date |
 **nucleus_account_id** | [**string**](../Model/.md)| nucleus_account_id |
 **start_date** | **\DateTime**| start_date |
 **statement_type** | **string**| statement_type |

### Return type

[**\com\hydrogen\integration\Model\BrokerageStatementVO**](../Model/BrokerageStatementVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDocumentUsingGet**
> \com\hydrogen\integration\Model\BrokerageDocumentVO getDocumentUsingGet($nucleus_document_id)

Get a Brokerage document

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_document_id = "nucleus_document_id_example"; // string | nucleus_document_id

try {
    $result = $apiInstance->getDocumentUsingGet($nucleus_document_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getDocumentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_document_id** | [**string**](../Model/.md)| nucleus_document_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageDocumentVO**](../Model/BrokerageDocumentVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHoldingPerformanceUsingGet**
> \com\hydrogen\integration\Model\BrokeragePerformanceVO getHoldingPerformanceUsingGet($nucleus_portfolio_id)

Get portfolio holding performance

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id

try {
    $result = $apiInstance->getHoldingPerformanceUsingGet($nucleus_portfolio_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getHoldingPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |

### Return type

[**\com\hydrogen\integration\Model\BrokeragePerformanceVO**](../Model/BrokeragePerformanceVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHoldingUsingGet**
> \com\hydrogen\integration\Model\BrokerageHoldingVO getHoldingUsingGet($nucleus_portfolio_id)

Get portfolio holdings

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id

try {
    $result = $apiInstance->getHoldingUsingGet($nucleus_portfolio_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageHoldingVO**](../Model/BrokerageHoldingVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderUsingGet**
> \com\hydrogen\integration\Model\BrokerageOrderVO getOrderUsingGet($nucleus_order_id)

Get an Order

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_order_id = "nucleus_order_id_example"; // string | nucleus_order_id

try {
    $result = $apiInstance->getOrderUsingGet($nucleus_order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getOrderUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**string**](../Model/.md)| nucleus_order_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageOrderVO**](../Model/BrokerageOrderVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSecuritiesUsingGet**
> \com\hydrogen\integration\Model\BrokerageSecuritiesVO getSecuritiesUsingGet($vendor_name, $get_fundamentals, $nucleus_security_id)

Get securities information

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$vendor_name = "vendor_name_example"; // string | vendor_name
$get_fundamentals = false; // bool | get_fundamentals
$nucleus_security_id = "nucleus_security_id_example"; // string | nucleus_security_id

try {
    $result = $apiInstance->getSecuritiesUsingGet($vendor_name, $get_fundamentals, $nucleus_security_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getSecuritiesUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_name** | **string**| vendor_name |
 **get_fundamentals** | **bool**| get_fundamentals | [optional] [default to false]
 **nucleus_security_id** | [**string**](../Model/.md)| nucleus_security_id | [optional]

### Return type

[**\com\hydrogen\integration\Model\BrokerageSecuritiesVO**](../Model/BrokerageSecuritiesVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransactionsUsingGet**
> \com\hydrogen\integration\Model\BrokerageTransactionVO getTransactionsUsingGet($drivewealth_response, $end_date, $nucleus_portfolio_id, $start_date)

Get account transactions

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$drivewealth_response = new \com\hydrogen\integration\Model\GetTransactionsResponse(); // \com\hydrogen\integration\Model\GetTransactionsResponse | drivewealthResponse
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getTransactionsUsingGet($drivewealth_response, $end_date, $nucleus_portfolio_id, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getTransactionsUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivewealth_response** | [**\com\hydrogen\integration\Model\GetTransactionsResponse**](../Model/GetTransactionsResponse.md)| drivewealthResponse |
 **end_date** | **\DateTime**| end_date |
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |
 **start_date** | **\DateTime**| start_date |

### Return type

[**\com\hydrogen\integration\Model\BrokerageTransactionVO**](../Model/BrokerageTransactionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkUsingPut1**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO updateBankLinkUsingPut1($nucleus_bank_link_id)

Update a Bank Link

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->updateBankLinkUsingPut1($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->updateBankLinkUsingPut1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\BrokerageBankLinkVO**](../Model/BrokerageBankLinkVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBrokerageClientUsingPut**
> \com\hydrogen\integration\Model\BrokerageUpdateClientVO updateBrokerageClientUsingPut($client_co)

Update a Brokerage client

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
$apiInstance = new com\hydrogen\integration\Api\BrokerageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_co = new \com\hydrogen\integration\Model\BrokerageClientCO(); // \com\hydrogen\integration\Model\BrokerageClientCO | clientCO

try {
    $result = $apiInstance->updateBrokerageClientUsingPut($client_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->updateBrokerageClientUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**\com\hydrogen\integration\Model\BrokerageClientCO**](../Model/BrokerageClientCO.md)| clientCO |

### Return type

[**\com\hydrogen\integration\Model\BrokerageUpdateClientVO**](../Model/BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

