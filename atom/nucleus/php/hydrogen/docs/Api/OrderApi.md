# com\hydrogen\nucleus\OrderApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountOrderBulkUsingPost**](OrderApi.md#createAccountOrderBulkUsingPost) | **POST** /account/{account_id}/order_bulk | Bulk orders for an account
[**createAccountOrderBuyOnlyUsingPost**](OrderApi.md#createAccountOrderBuyOnlyUsingPost) | **POST** /account/{account_id}/order_buy_only | Create buy-only account rebalance orders
[**createAccountOrderRebalanceUsingPost**](OrderApi.md#createAccountOrderRebalanceUsingPost) | **POST** /account/{account_id}/order_rebalance | Create account rebalance orders
[**createAccountOrderReconciliation**](OrderApi.md#createAccountOrderReconciliation) | **POST** /account/{account_id}/order_reconciliation | Create account reconciliation order
[**createAccountOrderSellAllUsingPost**](OrderApi.md#createAccountOrderSellAllUsingPost) | **POST** /account/{account_id}/order_sell_all | Sell all account order
[**createAccountOrderSellOnlyUsingPost**](OrderApi.md#createAccountOrderSellOnlyUsingPost) | **POST** /account/{account_id}/order_sell_only | Create sell-only account rebalance orders
[**createClientOrderBulkUsingPost**](OrderApi.md#createClientOrderBulkUsingPost) | **POST** /client/{client_id}/order_bulk | Bulk orders for a client
[**createOrderBulkUsingPost**](OrderApi.md#createOrderBulkUsingPost) | **POST** /order_bulk | Bulk orders for your firm
[**createOrderStatusUsingPost**](OrderApi.md#createOrderStatusUsingPost) | **POST** /order_status | Create an order status
[**createOrderTrackUsingPost**](OrderApi.md#createOrderTrackUsingPost) | **POST** /order_track | Create an order tracking record
[**createPortfolioOrderBuyOnlyUsingPost**](OrderApi.md#createPortfolioOrderBuyOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**createPortfolioOrderRebalanceUsingPost**](OrderApi.md#createPortfolioOrderRebalanceUsingPost) | **POST** /portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**createPortfolioOrderReconciliation**](OrderApi.md#createPortfolioOrderReconciliation) | **POST** /portfolio/{portfolio_id}/order_reconciliation | Create portfolio reconciliation order
[**createPortfolioOrderSellAllUsingPost**](OrderApi.md#createPortfolioOrderSellAllUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**createPortfolioOrderSellOnlyUsingPost**](OrderApi.md#createPortfolioOrderSellOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**deleteOrderStatusUsingDelete**](OrderApi.md#deleteOrderStatusUsingDelete) | **DELETE** /order_status/{order_status_id} | Delete an order status
[**deleteOrderTrackUsingDelete**](OrderApi.md#deleteOrderTrackUsingDelete) | **DELETE** /order_track/{order_track_id} | Delete an order tracking record
[**deleteOrderUsingDelete**](OrderApi.md#deleteOrderUsingDelete) | **DELETE** /order/{order_id} | Delete an order record
[**getOrderAllUsingGet**](OrderApi.md#getOrderAllUsingGet) | **POST** /order | Create an order record
[**getOrderAllUsingGet1**](OrderApi.md#getOrderAllUsingGet1) | **GET** /order | List all order records
[**getOrderBulkAllUsingGet**](OrderApi.md#getOrderBulkAllUsingGet) | **GET** /order_bulk | List all bulk orders
[**getOrderStatusAllUsingGet**](OrderApi.md#getOrderStatusAllUsingGet) | **GET** /order_status | List all order statuses
[**getOrderStatusUsingGet**](OrderApi.md#getOrderStatusUsingGet) | **GET** /order_status/{order_status_id} | Retrieve an order status
[**getOrderTrackAllUsingGet**](OrderApi.md#getOrderTrackAllUsingGet) | **GET** /order_track | List all order tracking records
[**getOrderTrackUsingGet**](OrderApi.md#getOrderTrackUsingGet) | **GET** /order_track/{order_track_id} | Retrieve an order tracking record
[**getOrderUsingGet**](OrderApi.md#getOrderUsingGet) | **GET** /order/{order_id} | Retrieve an order record
[**updateOrderStatusUsingPut**](OrderApi.md#updateOrderStatusUsingPut) | **PUT** /order_status/{order_status_id} | Update an order status
[**updateOrderTrackUsingPut**](OrderApi.md#updateOrderTrackUsingPut) | **PUT** /order_track/{order_track_id} | Update an order tracking record
[**updateOrderUsingPut**](OrderApi.md#updateOrderUsingPut) | **PUT** /order/{order_id} | Update an order record


# **createAccountOrderBulkUsingPost**
> \com\hydrogen\nucleus\Model\Order[] createAccountOrderBulkUsingPost($account_id, $req)

Bulk orders for an account

Aggregates all orders on a given date for an account.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\TokenDateRequest(); // \com\hydrogen\nucleus\Model\TokenDateRequest | req

try {
    $result = $apiInstance->createAccountOrderBulkUsingPost($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\TokenDateRequest**](../Model/TokenDateRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\Order[]**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountOrderBuyOnlyUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createAccountOrderBuyOnlyUsingPost($account_id, $req)

Create buy-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createAccountOrderBuyOnlyUsingPost($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderBuyOnlyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountOrderRebalanceUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createAccountOrderRebalanceUsingPost($account_id, $req)

Create account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createAccountOrderRebalanceUsingPost($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderRebalanceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountOrderReconciliation**
> \com\hydrogen\nucleus\Model\OrderReconcileReturnObject createAccountOrderReconciliation($account_id, $req)

Create account reconciliation order

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\OrderReconcileRequest(); // \com\hydrogen\nucleus\Model\OrderReconcileRequest | req

try {
    $result = $apiInstance->createAccountOrderReconciliation($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderReconciliation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\OrderReconcileRequest**](../Model/OrderReconcileRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderReconcileReturnObject**](../Model/OrderReconcileReturnObject.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountOrderSellAllUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createAccountOrderSellAllUsingPost($account_id, $req)

Sell all account order

Create order records necessary to entirely sell all the holdings within an account.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createAccountOrderSellAllUsingPost($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderSellAllUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountOrderSellOnlyUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createAccountOrderSellOnlyUsingPost($account_id, $req)

Create sell-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createAccountOrderSellOnlyUsingPost($account_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createAccountOrderSellOnlyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientOrderBulkUsingPost**
> \com\hydrogen\nucleus\Model\Order[] createClientOrderBulkUsingPost($client_id, $req)

Bulk orders for a client

Aggregates all orders on a given date for a client

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | client_id
$req = new \com\hydrogen\nucleus\Model\TokenDateRequest(); // \com\hydrogen\nucleus\Model\TokenDateRequest | req

try {
    $result = $apiInstance->createClientOrderBulkUsingPost($client_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createClientOrderBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| client_id |
 **req** | [**\com\hydrogen\nucleus\Model\TokenDateRequest**](../Model/TokenDateRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\Order[]**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrderBulkUsingPost**
> \com\hydrogen\nucleus\Model\Order[] createOrderBulkUsingPost($req)

Bulk orders for your firm

Aggregates all orders on a given date for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$req = new \com\hydrogen\nucleus\Model\TokenDateRequest(); // \com\hydrogen\nucleus\Model\TokenDateRequest | req

try {
    $result = $apiInstance->createOrderBulkUsingPost($req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createOrderBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**\com\hydrogen\nucleus\Model\TokenDateRequest**](../Model/TokenDateRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\Order[]**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrderStatusUsingPost**
> \com\hydrogen\nucleus\Model\OrderStatus createOrderStatusUsingPost($order_status_request)

Create an order status

Create an order status for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_status_request = new \com\hydrogen\nucleus\Model\OrderStatus(); // \com\hydrogen\nucleus\Model\OrderStatus | orderStatusRequest

try {
    $result = $apiInstance->createOrderStatusUsingPost($order_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createOrderStatusUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_request** | [**\com\hydrogen\nucleus\Model\OrderStatus**](../Model/OrderStatus.md)| orderStatusRequest |

### Return type

[**\com\hydrogen\nucleus\Model\OrderStatus**](../Model/OrderStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrderTrackUsingPost**
> \com\hydrogen\nucleus\Model\OrderTrack createOrderTrackUsingPost($order_track_request)

Create an order tracking record

Create a new order tracking record for an order.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_track_request = new \com\hydrogen\nucleus\Model\OrderTrack(); // \com\hydrogen\nucleus\Model\OrderTrack | orderTrackRequest

try {
    $result = $apiInstance->createOrderTrackUsingPost($order_track_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createOrderTrackUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_request** | [**\com\hydrogen\nucleus\Model\OrderTrack**](../Model/OrderTrack.md)| orderTrackRequest |

### Return type

[**\com\hydrogen\nucleus\Model\OrderTrack**](../Model/OrderTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioOrderBuyOnlyUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createPortfolioOrderBuyOnlyUsingPost($portfolio_id, $req)

Create buy-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes. However, these will only be buy transactions, and no securities will be sold.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createPortfolioOrderBuyOnlyUsingPost($portfolio_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createPortfolioOrderBuyOnlyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioOrderRebalanceUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createPortfolioOrderRebalanceUsingPost($portfolio_id, $req)

Create portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createPortfolioOrderRebalanceUsingPost($portfolio_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createPortfolioOrderRebalanceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioOrderReconciliation**
> \com\hydrogen\nucleus\Model\OrderReconcileReturnObject createPortfolioOrderReconciliation($portfolio_id, $req)

Create portfolio reconciliation order

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$req = new \com\hydrogen\nucleus\Model\OrderReconcileRequest(); // \com\hydrogen\nucleus\Model\OrderReconcileRequest | req

try {
    $result = $apiInstance->createPortfolioOrderReconciliation($portfolio_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createPortfolioOrderReconciliation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **req** | [**\com\hydrogen\nucleus\Model\OrderReconcileRequest**](../Model/OrderReconcileRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderReconcileReturnObject**](../Model/OrderReconcileReturnObject.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioOrderSellAllUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createPortfolioOrderSellAllUsingPost($portfolio_id, $req)

Sell all portfolio order

Create order records necessary to entirely sell all the holdings within a portfolio.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createPortfolioOrderSellAllUsingPost($portfolio_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createPortfolioOrderSellAllUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioOrderSellOnlyUsingPost**
> \com\hydrogen\nucleus\Model\OrderVoClone[] createPortfolioOrderSellOnlyUsingPost($portfolio_id, $req)

Create sell-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | portfolio_id
$req = new \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest(); // \com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest | req

try {
    $result = $apiInstance->createPortfolioOrderSellOnlyUsingPost($portfolio_id, $req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->createPortfolioOrderSellOnlyUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| portfolio_id |
 **req** | [**\com\hydrogen\nucleus\Model\AccountPortfolioRebalanceRequest**](../Model/AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**\com\hydrogen\nucleus\Model\OrderVoClone[]**](../Model/OrderVoClone.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOrderStatusUsingDelete**
> deleteOrderStatusUsingDelete($order_status_id)

Delete an order status

Permanently delete an order status defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_status_id = "order_status_id_example"; // string | UUID order_status_id

try {
    $apiInstance->deleteOrderStatusUsingDelete($order_status_id);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->deleteOrderStatusUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**string**](../Model/.md)| UUID order_status_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOrderTrackUsingDelete**
> deleteOrderTrackUsingDelete($order_track_id)

Delete an order tracking record

Permanently delete an order tracking record for an order.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_track_id = "order_track_id_example"; // string | UUID order_track_id

try {
    $apiInstance->deleteOrderTrackUsingDelete($order_track_id);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->deleteOrderTrackUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**string**](../Model/.md)| UUID order_track_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOrderUsingDelete**
> deleteOrderUsingDelete($order_id)

Delete an order record

Permanently delete an order record.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = "order_id_example"; // string | UUID order_id

try {
    $apiInstance->deleteOrderUsingDelete($order_id);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->deleteOrderUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**string**](../Model/.md)| UUID order_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderAllUsingGet**
> \com\hydrogen\nucleus\Model\Order getOrderAllUsingGet($order_info_request)

Create an order record

Create an order record defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_info_request = new \com\hydrogen\nucleus\Model\Order(); // \com\hydrogen\nucleus\Model\Order | orderInfoRequest

try {
    $result = $apiInstance->getOrderAllUsingGet($order_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_info_request** | [**\com\hydrogen\nucleus\Model\Order**](../Model/Order.md)| orderInfoRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Order**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderAllUsingGet1**
> \com\hydrogen\nucleus\Model\PageOrder_ getOrderAllUsingGet1($ascending, $filter, $order_by, $page, $size)

List all order records

Get the information for all order records defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOrderAllUsingGet1($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderAllUsingGet1: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageOrder_**](../Model/PageOrder_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderBulkAllUsingGet**
> \com\hydrogen\nucleus\Model\PageOrderBulk_ getOrderBulkAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all bulk orders

Get the information for all bulk order records.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOrderBulkAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderBulkAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageOrderBulk_**](../Model/PageOrderBulk_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderStatusAllUsingGet**
> \com\hydrogen\nucleus\Model\PageOrderStatus_ getOrderStatusAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all order statuses

Get the information for all order statuses defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOrderStatusAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderStatusAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageOrderStatus_**](../Model/PageOrderStatus_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderStatusUsingGet**
> \com\hydrogen\nucleus\Model\OrderStatus getOrderStatusUsingGet($order_status_id)

Retrieve an order status

Retrieve the information for an order status defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_status_id = "order_status_id_example"; // string | UUID order_status_id

try {
    $result = $apiInstance->getOrderStatusUsingGet($order_status_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderStatusUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**string**](../Model/.md)| UUID order_status_id |

### Return type

[**\com\hydrogen\nucleus\Model\OrderStatus**](../Model/OrderStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderTrackAllUsingGet**
> \com\hydrogen\nucleus\Model\PageOrderTrack_ getOrderTrackAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all order tracking records

Get the information for all order tracking record for all order records.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getOrderTrackAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderTrackAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageOrderTrack_**](../Model/PageOrderTrack_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderTrackUsingGet**
> \com\hydrogen\nucleus\Model\OrderTrack getOrderTrackUsingGet($order_track_id)

Retrieve an order tracking record

Retrieve the information for an order tracking record for an order.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_track_id = "order_track_id_example"; // string | UUID order_track_id

try {
    $result = $apiInstance->getOrderTrackUsingGet($order_track_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderTrackUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**string**](../Model/.md)| UUID order_track_id |

### Return type

[**\com\hydrogen\nucleus\Model\OrderTrack**](../Model/OrderTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrderUsingGet**
> \com\hydrogen\nucleus\Model\Order getOrderUsingGet($order_id)

Retrieve an order record

Retrieve the information for an order record.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = "order_id_example"; // string | UUID order_id

try {
    $result = $apiInstance->getOrderUsingGet($order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->getOrderUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**string**](../Model/.md)| UUID order_id |

### Return type

[**\com\hydrogen\nucleus\Model\Order**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOrderStatusUsingPut**
> \com\hydrogen\nucleus\Model\OrderStatus updateOrderStatusUsingPut($order_status, $order_status_id)

Update an order status

Update the information for an order status defined for your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_status = new \com\hydrogen\nucleus\Model\OrderStatus(); // \com\hydrogen\nucleus\Model\OrderStatus | order_status
$order_status_id = "order_status_id_example"; // string | UUID order_status_id

try {
    $result = $apiInstance->updateOrderStatusUsingPut($order_status, $order_status_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->updateOrderStatusUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status** | [**\com\hydrogen\nucleus\Model\OrderStatus**](../Model/OrderStatus.md)| order_status |
 **order_status_id** | [**string**](../Model/.md)| UUID order_status_id |

### Return type

[**\com\hydrogen\nucleus\Model\OrderStatus**](../Model/OrderStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOrderTrackUsingPut**
> \com\hydrogen\nucleus\Model\OrderTrack updateOrderTrackUsingPut($order_track, $order_track_id)

Update an order tracking record

Update the information for an order tracking record for an order.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_track = new \com\hydrogen\nucleus\Model\OrderTrack(); // \com\hydrogen\nucleus\Model\OrderTrack | order_track
$order_track_id = "order_track_id_example"; // string | UUID order_track_id

try {
    $result = $apiInstance->updateOrderTrackUsingPut($order_track, $order_track_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->updateOrderTrackUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track** | [**\com\hydrogen\nucleus\Model\OrderTrack**](../Model/OrderTrack.md)| order_track |
 **order_track_id** | [**string**](../Model/.md)| UUID order_track_id |

### Return type

[**\com\hydrogen\nucleus\Model\OrderTrack**](../Model/OrderTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOrderUsingPut**
> \com\hydrogen\nucleus\Model\Order updateOrderUsingPut($order, $order_id)

Update an order record

Update the information for an order record.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order = new \com\hydrogen\nucleus\Model\Order(); // \com\hydrogen\nucleus\Model\Order | order
$order_id = "order_id_example"; // string | UUID order_id

try {
    $result = $apiInstance->updateOrderUsingPut($order, $order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->updateOrderUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**\com\hydrogen\nucleus\Model\Order**](../Model/Order.md)| order |
 **order_id** | [**string**](../Model/.md)| UUID order_id |

### Return type

[**\com\hydrogen\nucleus\Model\Order**](../Model/Order.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

