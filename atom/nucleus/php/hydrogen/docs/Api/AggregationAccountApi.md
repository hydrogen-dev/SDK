# com\hydrogen\AggregationAccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountBalanceBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceBulkUsingPost) | **POST** /bulk_aggregation_account_balance | Create a bulk aggregation account balance
[**createAggregationAccountBalanceUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceUsingPost) | **POST** /aggregation_account_balance | Create an aggregation account balance
[**createAggregationAccountBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBulkUsingPost) | **POST** /bulk_aggregation_account | Create a bulk aggregation account
[**createAggregationAccountHoldingBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingBulkUsingPost) | **POST** /bulk_aggregation_account_holding | Create a bulk aggregation account holding
[**createAggregationAccountHoldingUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingUsingPost) | **POST** /aggregation_account_holding | Create an aggregation account holding
[**createAggregationAccountTransactionBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionBulkUsingPost) | **POST** /bulk_aggregation_account_transaction | Create a bulk aggregation account transaction
[**createAggregationAccountTransactionUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionUsingPost) | **POST** /aggregation_account_transaction | Create an aggregation account transaction
[**createAggregationAccountUsingPost**](AggregationAccountApi.md#createAggregationAccountUsingPost) | **POST** /aggregation_account | Create an aggregation account
[**deleteAggregationAccountBalanceUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountBalanceUsingDelete) | **DELETE** /aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**deleteAggregationAccountHoldingUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountHoldingUsingDelete) | **DELETE** /aggregation_account_holding/{aggregation_account_holding_id} | Delete an aggregation account holding
[**deleteAggregationAccountTransactionUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountTransactionUsingDelete) | **DELETE** /aggregation_account_transaction/{aggregation_account_transaction_id} | Delete an aggregation account transaction
[**deleteAggregationAccountUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**getAggregationAccountAggregateDataUsingGet**](AggregationAccountApi.md#getAggregationAccountAggregateDataUsingGet) | **GET** /aggregation_account/{aggregation_account_id}/aggregate_data | Retrieve an aggregation account aggregate data
[**getAggregationAccountAllUsingGet**](AggregationAccountApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation_account | List all aggregation accounts
[**getAggregationAccountBalanceAllUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation_account_balance | List all aggregation account balances
[**getAggregationAccountBalanceUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**getAggregationAccountHoldingAllUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation_account_holding | List all aggregation account holdings
[**getAggregationAccountHoldingUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation_account_holding/{aggregation_account_holding_id} | Retrieve an aggregation account holding
[**getAggregationAccountOverviewUsingGet**](AggregationAccountApi.md#getAggregationAccountOverviewUsingGet) | **GET** /client/{client_id}/aggregation_account_overview | Retrieve an aggregation account aggregate data
[**getAggregationAccountTransactionAllUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation_account_transaction | List all aggregation account transactions
[**getAggregationAccountTransactionUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation_account_transaction/{aggregation_account_transaction_id} | Retrieve an aggregation account transaction
[**getAggregationAccountUsingGet**](AggregationAccountApi.md#getAggregationAccountUsingGet) | **GET** /aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**updateAggregationAccountBalanceUsingPut**](AggregationAccountApi.md#updateAggregationAccountBalanceUsingPut) | **PUT** /aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**updateAggregationAccountBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountBulkUsingPut) | **PUT** /bulk_aggregation_account | Update a bulk aggregation account
[**updateAggregationAccountHoldingBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingBulkUsingPut) | **PUT** /bulk_aggregation_account_holding | Update an bulk aggregation account holding
[**updateAggregationAccountHoldingUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingUsingPut) | **PUT** /aggregation_account_holding/{aggregation_account_holding_id} | Update an aggregation account holding
[**updateAggregationAccountTransactionUsingPut**](AggregationAccountApi.md#updateAggregationAccountTransactionUsingPut) | **PUT** /aggregation_account_transaction/{aggregation_account_transaction_id} | Update an aggregation account transaction
[**updateAggregationAccountUsingPut**](AggregationAccountApi.md#updateAggregationAccountUsingPut) | **PUT** /aggregation_account/{aggregation_account_id} | Update an aggregation account


# **createAggregationAccountBalanceBulkUsingPost**
> \com\hydrogen\Model\AggregationAccountBalance[] createAggregationAccountBalanceBulkUsingPost($aggregation_account_balance)

Create a bulk aggregation account balance

Create a balance records under an aggregation accounts.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_balance = array(new \com\hydrogen\Model\AggregationAccountBalance()); // \com\hydrogen\Model\AggregationAccountBalance[] | aggregationAccountBalance

try {
    $result = $apiInstance->createAggregationAccountBalanceBulkUsingPost($aggregation_account_balance);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountBalanceBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**\com\hydrogen\Model\AggregationAccountBalance[]**](../Model/AggregationAccountBalance.md)| aggregationAccountBalance |

### Return type

[**\com\hydrogen\Model\AggregationAccountBalance[]**](../Model/AggregationAccountBalance.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountBalanceUsingPost**
> \com\hydrogen\Model\AggregationAccountBalance createAggregationAccountBalanceUsingPost($aggregation_account_balance)

Create an aggregation account balance

Create a balance record under an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_balance = new \com\hydrogen\Model\AggregationAccountBalance(); // \com\hydrogen\Model\AggregationAccountBalance | aggregationAccountBalance

try {
    $result = $apiInstance->createAggregationAccountBalanceUsingPost($aggregation_account_balance);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountBalanceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**\com\hydrogen\Model\AggregationAccountBalance**](../Model/AggregationAccountBalance.md)| aggregationAccountBalance |

### Return type

[**\com\hydrogen\Model\AggregationAccountBalance**](../Model/AggregationAccountBalance.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountBulkUsingPost**
> \com\hydrogen\Model\AggregationAccount[] createAggregationAccountBulkUsingPost($aggregation_account_list)

Create a bulk aggregation account

Create a bulk aggregation account under a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_list = array(new \com\hydrogen\Model\AggregationAccount()); // \com\hydrogen\Model\AggregationAccount[] | aggregationAccountList

try {
    $result = $apiInstance->createAggregationAccountBulkUsingPost($aggregation_account_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**\com\hydrogen\Model\AggregationAccount[]**](../Model/AggregationAccount.md)| aggregationAccountList |

### Return type

[**\com\hydrogen\Model\AggregationAccount[]**](../Model/AggregationAccount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountHoldingBulkUsingPost**
> \com\hydrogen\Model\AggregationAccountHolding[] createAggregationAccountHoldingBulkUsingPost($aggregation_transaction)

Create a bulk aggregation account holding

Create a bulk aggregation account holding.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_transaction = array(new \com\hydrogen\Model\AggregationAccountHolding()); // \com\hydrogen\Model\AggregationAccountHolding[] | aggregationTransaction

try {
    $result = $apiInstance->createAggregationAccountHoldingBulkUsingPost($aggregation_transaction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountHoldingBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_transaction** | [**\com\hydrogen\Model\AggregationAccountHolding[]**](../Model/AggregationAccountHolding.md)| aggregationTransaction |

### Return type

[**\com\hydrogen\Model\AggregationAccountHolding[]**](../Model/AggregationAccountHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountHoldingUsingPost**
> \com\hydrogen\Model\AggregationAccountHolding createAggregationAccountHoldingUsingPost($aggregation_account_holding)

Create an aggregation account holding

Create a holding record under an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_holding = new \com\hydrogen\Model\AggregationAccountHolding(); // \com\hydrogen\Model\AggregationAccountHolding | aggregationAccountHolding

try {
    $result = $apiInstance->createAggregationAccountHoldingUsingPost($aggregation_account_holding);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountHoldingUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**\com\hydrogen\Model\AggregationAccountHolding**](../Model/AggregationAccountHolding.md)| aggregationAccountHolding |

### Return type

[**\com\hydrogen\Model\AggregationAccountHolding**](../Model/AggregationAccountHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountTransactionBulkUsingPost**
> \com\hydrogen\Model\AggregationAccountTransaction[] createAggregationAccountTransactionBulkUsingPost($aggregation_account_transactions)

Create a bulk aggregation account transaction

Create a bulk transaction record under an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_transactions = array(new \com\hydrogen\Model\AggregationAccountTransaction()); // \com\hydrogen\Model\AggregationAccountTransaction[] | aggregationAccountTransactions

try {
    $result = $apiInstance->createAggregationAccountTransactionBulkUsingPost($aggregation_account_transactions);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountTransactionBulkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transactions** | [**\com\hydrogen\Model\AggregationAccountTransaction[]**](../Model/AggregationAccountTransaction.md)| aggregationAccountTransactions |

### Return type

[**\com\hydrogen\Model\AggregationAccountTransaction[]**](../Model/AggregationAccountTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountTransactionUsingPost**
> \com\hydrogen\Model\AggregationAccountTransaction createAggregationAccountTransactionUsingPost($aggregation_account_transaction)

Create an aggregation account transaction

Create a transaction record under an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_transaction = new \com\hydrogen\Model\AggregationAccountTransaction(); // \com\hydrogen\Model\AggregationAccountTransaction | aggregationAccountTransaction

try {
    $result = $apiInstance->createAggregationAccountTransactionUsingPost($aggregation_account_transaction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountTransactionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)| aggregationAccountTransaction |

### Return type

[**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAggregationAccountUsingPost**
> \com\hydrogen\Model\AggregationAccount createAggregationAccountUsingPost($aggregation_account)

Create an aggregation account

Create an aggregation account under a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account = new \com\hydrogen\Model\AggregationAccount(); // \com\hydrogen\Model\AggregationAccount | aggregationAccount

try {
    $result = $apiInstance->createAggregationAccountUsingPost($aggregation_account);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->createAggregationAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)| aggregationAccount |

### Return type

[**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAggregationAccountBalanceUsingDelete**
> deleteAggregationAccountBalanceUsingDelete($aggregation_account_balance_id)

Delete an aggregation account balance

Permanently delete a balance record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_balance_id = "aggregation_account_balance_id_example"; // string | UUID aggregation_account_balance_id

try {
    $apiInstance->deleteAggregationAccountBalanceUsingDelete($aggregation_account_balance_id);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->deleteAggregationAccountBalanceUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**string**](../Model/.md)| UUID aggregation_account_balance_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAggregationAccountHoldingUsingDelete**
> deleteAggregationAccountHoldingUsingDelete($aggregation_account_holding_id)

Delete an aggregation account holding

Permanently delete a holding record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_holding_id = "aggregation_account_holding_id_example"; // string | UUID aggregation_account_holding_id

try {
    $apiInstance->deleteAggregationAccountHoldingUsingDelete($aggregation_account_holding_id);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->deleteAggregationAccountHoldingUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**string**](../Model/.md)| UUID aggregation_account_holding_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAggregationAccountTransactionUsingDelete**
> \com\hydrogen\Model\AggregationAccountTransaction deleteAggregationAccountTransactionUsingDelete($aggregation_account_transaction_id)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_transaction_id = "aggregation_account_transaction_id_example"; // string | UUID aggregation_account_transaction_id

try {
    $result = $apiInstance->deleteAggregationAccountTransactionUsingDelete($aggregation_account_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->deleteAggregationAccountTransactionUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**string**](../Model/.md)| UUID aggregation_account_transaction_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete($aggregation_account_id)

Delete an aggregation account

Permanently delete an aggregation account under a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id = "aggregation_account_id_example"; // string | UUID aggregation_account_id

try {
    $apiInstance->deleteAggregationAccountUsingDelete($aggregation_account_id);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->deleteAggregationAccountUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**string**](../Model/.md)| UUID aggregation_account_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountAggregateDataUsingGet**
> \com\hydrogen\Model\AggregationAccountAggregateDataVO getAggregationAccountAggregateDataUsingGet($aggregation_account_id)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id = "aggregation_account_id_example"; // string | UUID aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountAggregateDataUsingGet($aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountAggregateDataUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**string**](../Model/.md)| UUID aggregation_account_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountAggregateDataVO**](../Model/AggregationAccountAggregateDataVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountAllUsingGet**
> \com\hydrogen\Model\PageAggregationAccount_ getAggregationAccountAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all aggregation accounts

Get information for all aggregation accounts for all clients defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
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
    $result = $apiInstance->getAggregationAccountAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAggregationAccount_**](../Model/PageAggregationAccount_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountBalanceAllUsingGet**
> \com\hydrogen\Model\PageAggregationAccountBalance_ getAggregationAccountBalanceAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all aggregation account balances

Get all of the balance records for all aggregation accounts defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
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
    $result = $apiInstance->getAggregationAccountBalanceAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountBalanceAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAggregationAccountBalance_**](../Model/PageAggregationAccountBalance_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountBalanceUsingGet**
> \com\hydrogen\Model\AggregationAccountBalance getAggregationAccountBalanceUsingGet($aggregation_account_balance_id)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_balance_id = "aggregation_account_balance_id_example"; // string | UUID aggregation_account_balance_id

try {
    $result = $apiInstance->getAggregationAccountBalanceUsingGet($aggregation_account_balance_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**string**](../Model/.md)| UUID aggregation_account_balance_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountBalance**](../Model/AggregationAccountBalance.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountHoldingAllUsingGet**
> \com\hydrogen\Model\PageAggregationAccountHolding_ getAggregationAccountHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all aggregation account holdings

Get all of the holding records for all aggregation accounts defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
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
    $result = $apiInstance->getAggregationAccountHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountHoldingAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAggregationAccountHolding_**](../Model/PageAggregationAccountHolding_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountHoldingUsingGet**
> \com\hydrogen\Model\AggregationAccountHolding getAggregationAccountHoldingUsingGet($aggregation_account_holding_id)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_holding_id = "aggregation_account_holding_id_example"; // string | UUID aggregation_account_holding_id

try {
    $result = $apiInstance->getAggregationAccountHoldingUsingGet($aggregation_account_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**string**](../Model/.md)| UUID aggregation_account_holding_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountHolding**](../Model/AggregationAccountHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountOverviewUsingGet**
> \com\hydrogen\Model\AggregationDataForClientParentResponseVO getAggregationAccountOverviewUsingGet($client_id)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | UUID client_id

try {
    $result = $apiInstance->getAggregationAccountOverviewUsingGet($client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountOverviewUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| UUID client_id |

### Return type

[**\com\hydrogen\Model\AggregationDataForClientParentResponseVO**](../Model/AggregationDataForClientParentResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountTransactionAllUsingGet**
> \com\hydrogen\Model\PageAggregationAccountTransaction_ getAggregationAccountTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all aggregation account transactions

Get all of the transaction records for all aggregation accounts defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
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
    $result = $apiInstance->getAggregationAccountTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAggregationAccountTransaction_**](../Model/PageAggregationAccountTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountTransactionUsingGet**
> \com\hydrogen\Model\AggregationAccountTransaction getAggregationAccountTransactionUsingGet($aggregation_account_transaction_id)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_transaction_id = "aggregation_account_transaction_id_example"; // string | UUID aggregation_account_transaction_id

try {
    $result = $apiInstance->getAggregationAccountTransactionUsingGet($aggregation_account_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**string**](../Model/.md)| UUID aggregation_account_transaction_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountUsingGet**
> \com\hydrogen\Model\AggregationAccount getAggregationAccountUsingGet($aggregation_account_id)

Retrieve an aggregation account

Retrieve the information for a specific aggregation account associated with a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id = "aggregation_account_id_example"; // string | UUID aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountUsingGet($aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->getAggregationAccountUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**string**](../Model/.md)| UUID aggregation_account_id |

### Return type

[**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountBalanceUsingPut**
> \com\hydrogen\Model\AggregationAccountBalance updateAggregationAccountBalanceUsingPut($aggregation_account_balance, $aggregation_account_balance_id)

Update an aggregation account balance

Update a balance record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_balance = new \com\hydrogen\Model\AggregationAccountBalance(); // \com\hydrogen\Model\AggregationAccountBalance | aggregation_account_balance
$aggregation_account_balance_id = "aggregation_account_balance_id_example"; // string | UUID aggregation_account_balance_id

try {
    $result = $apiInstance->updateAggregationAccountBalanceUsingPut($aggregation_account_balance, $aggregation_account_balance_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountBalanceUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**\com\hydrogen\Model\AggregationAccountBalance**](../Model/AggregationAccountBalance.md)| aggregation_account_balance |
 **aggregation_account_balance_id** | [**string**](../Model/.md)| UUID aggregation_account_balance_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountBalance**](../Model/AggregationAccountBalance.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountBulkUsingPut**
> \com\hydrogen\Model\AggregationAccount updateAggregationAccountBulkUsingPut($aggregation_account_list)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_list = array(new \com\hydrogen\Model\AggregationAccount()); // \com\hydrogen\Model\AggregationAccount[] | aggregationAccountList

try {
    $result = $apiInstance->updateAggregationAccountBulkUsingPut($aggregation_account_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountBulkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**\com\hydrogen\Model\AggregationAccount[]**](../Model/AggregationAccount.md)| aggregationAccountList |

### Return type

[**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountHoldingBulkUsingPut**
> \com\hydrogen\Model\AggregationAccountHolding[] updateAggregationAccountHoldingBulkUsingPut($aggregation_account_holding)

Update an bulk aggregation account holding

Update a bulk holding record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_holding = array(new \com\hydrogen\Model\AggregationAccountHolding()); // \com\hydrogen\Model\AggregationAccountHolding[] | aggregationAccountHolding

try {
    $result = $apiInstance->updateAggregationAccountHoldingBulkUsingPut($aggregation_account_holding);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountHoldingBulkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**\com\hydrogen\Model\AggregationAccountHolding[]**](../Model/AggregationAccountHolding.md)| aggregationAccountHolding |

### Return type

[**\com\hydrogen\Model\AggregationAccountHolding[]**](../Model/AggregationAccountHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountHoldingUsingPut**
> \com\hydrogen\Model\AggregationAccountHolding updateAggregationAccountHoldingUsingPut($aggregation_account_holding, $aggregation_account_holding_id)

Update an aggregation account holding

Update a holding record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_holding = new \com\hydrogen\Model\AggregationAccountHolding(); // \com\hydrogen\Model\AggregationAccountHolding | aggregation_account_holding
$aggregation_account_holding_id = "aggregation_account_holding_id_example"; // string | UUID aggregation_account_holding_id

try {
    $result = $apiInstance->updateAggregationAccountHoldingUsingPut($aggregation_account_holding, $aggregation_account_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountHoldingUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**\com\hydrogen\Model\AggregationAccountHolding**](../Model/AggregationAccountHolding.md)| aggregation_account_holding |
 **aggregation_account_holding_id** | [**string**](../Model/.md)| UUID aggregation_account_holding_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountHolding**](../Model/AggregationAccountHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountTransactionUsingPut**
> \com\hydrogen\Model\AggregationAccountTransaction updateAggregationAccountTransactionUsingPut($aggregation_account_transaction, $aggregation_account_transaction_id)

Update an aggregation account transaction

Update a transaction record for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_transaction = new \com\hydrogen\Model\AggregationAccountTransaction(); // \com\hydrogen\Model\AggregationAccountTransaction | aggregation_account_transaction
$aggregation_account_transaction_id = "aggregation_account_transaction_id_example"; // string | UUID aggregation_account_transaction_id

try {
    $result = $apiInstance->updateAggregationAccountTransactionUsingPut($aggregation_account_transaction, $aggregation_account_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountTransactionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)| aggregation_account_transaction |
 **aggregation_account_transaction_id** | [**string**](../Model/.md)| UUID aggregation_account_transaction_id |

### Return type

[**\com\hydrogen\Model\AggregationAccountTransaction**](../Model/AggregationAccountTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAggregationAccountUsingPut**
> \com\hydrogen\Model\AggregationAccount updateAggregationAccountUsingPut($aggregation_account, $aggregation_account_id)

Update an aggregation account

Update the information for an aggregation account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\AggregationAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account = new \com\hydrogen\Model\AggregationAccount(); // \com\hydrogen\Model\AggregationAccount | aggregation_account
$aggregation_account_id = "aggregation_account_id_example"; // string | UUID aggregation_account_id

try {
    $result = $apiInstance->updateAggregationAccountUsingPut($aggregation_account, $aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationAccountApi->updateAggregationAccountUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)| aggregation_account |
 **aggregation_account_id** | [**string**](../Model/.md)| UUID aggregation_account_id |

### Return type

[**\com\hydrogen\Model\AggregationAccount**](../Model/AggregationAccount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

