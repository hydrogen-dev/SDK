# com\hydrogen\integration\BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankLinkUsingPost**](BrokerageApi.md#createBankLinkUsingPost) | **POST** /brokerage/bank_link | create a Bank Link
[**createBrokerageAccountUsingPost**](BrokerageApi.md#createBrokerageAccountUsingPost) | **POST** /brokerage/account | create a Brokerage account
[**createBrokerageClientUsingPost**](BrokerageApi.md#createBrokerageClientUsingPost) | **POST** /brokerage/client | Create a Brokerage Client
[**createOrderUsingPost**](BrokerageApi.md#createOrderUsingPost) | **POST** /brokerage/order | Create an Order
[**deleteBankLinkUsingDelete**](BrokerageApi.md#deleteBankLinkUsingDelete) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**deleteOrderUsingDelete**](BrokerageApi.md#deleteOrderUsingDelete) | **DELETE** /brokerage/order | Delete an Order
[**getBankLinkUsingGet**](BrokerageApi.md#getBankLinkUsingGet) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**getBrokerageAccountStatementUsingGet**](BrokerageApi.md#getBrokerageAccountStatementUsingGet) | **GET** /brokerage/{nucleus_account_id}/statement | Get a Brokerage account statement
[**getOrderUsingGet**](BrokerageApi.md#getOrderUsingGet) | **GET** /brokerage/order | Get an Order
[**updateBankLinkUsingPut**](BrokerageApi.md#updateBankLinkUsingPut) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**updateBrokerageClientUsingPut**](BrokerageApi.md#updateBrokerageClientUsingPut) | **PUT** /brokerage/client | Update a Brokerage client


# **createBankLinkUsingPost**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO createBankLinkUsingPost($brokerage_bank_link_co)

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
    $result = $apiInstance->createBankLinkUsingPost($brokerage_bank_link_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createBankLinkUsingPost: ', $e->getMessage(), PHP_EOL;
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

# **createOrderUsingPost**
> \com\hydrogen\integration\Model\CreateOrderResponse createOrderUsingPost($nucleus_order_id)

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
$nucleus_order_id = "nucleus_order_id_example"; // string | nucleus_order_id

try {
    $result = $apiInstance->createOrderUsingPost($nucleus_order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->createOrderUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**string**](../Model/.md)| nucleus_order_id |

### Return type

[**\com\hydrogen\integration\Model\CreateOrderResponse**](../Model/CreateOrderResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBankLinkUsingDelete**
> \com\hydrogen\integration\Model\ResponseEntity deleteBankLinkUsingDelete($nucleus_bank_link_id)

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
    $result = $apiInstance->deleteBankLinkUsingDelete($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->deleteBankLinkUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\ResponseEntity**](../Model/ResponseEntity.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOrderUsingDelete**
> deleteOrderUsingDelete($nucleus_order_id)

Delete an Order

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
    $apiInstance->deleteOrderUsingDelete($nucleus_order_id);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->deleteOrderUsingDelete: ', $e->getMessage(), PHP_EOL;
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

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkUsingGet**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO getBankLinkUsingGet($nucleus_bank_link_id)

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
    $result = $apiInstance->getBankLinkUsingGet($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->getBankLinkUsingGet: ', $e->getMessage(), PHP_EOL;
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

# **getOrderUsingGet**
> \com\hydrogen\integration\Model\GetOrderResponse getOrderUsingGet($nucleus_order_id)

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

[**\com\hydrogen\integration\Model\GetOrderResponse**](../Model/GetOrderResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkUsingPut**
> \com\hydrogen\integration\Model\BrokerageBankLinkVO updateBankLinkUsingPut($nucleus_bank_link_id)

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
    $result = $apiInstance->updateBankLinkUsingPut($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrokerageApi->updateBankLinkUsingPut: ', $e->getMessage(), PHP_EOL;
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

