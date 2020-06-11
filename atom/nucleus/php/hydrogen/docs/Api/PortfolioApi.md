# com\hydrogen\PortfolioApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortfolioAssetSizeUsingPost**](PortfolioApi.md#createPortfolioAssetSizeUsingPost) | **POST** /portfolio_asset_size | Create a portfolio asset size
[**createPortfolioCommentUsingPost**](PortfolioApi.md#createPortfolioCommentUsingPost) | **POST** /portfolio_comment | Create a portfolio commentary
[**createPortfolioGoalUsingPost**](PortfolioApi.md#createPortfolioGoalUsingPost) | **POST** /portfolio_goal | Create an portfolio goal
[**createPortfolioHoldingUsingPost**](PortfolioApi.md#createPortfolioHoldingUsingPost) | **POST** /portfolio_holding | Create a portfolio holding
[**createPortfolioTransactionUsingPost**](PortfolioApi.md#createPortfolioTransactionUsingPost) | **POST** /portfolio_transaction | Create a portfolio transaction
[**createPortfolioUsingPost**](PortfolioApi.md#createPortfolioUsingPost) | **POST** /portfolio | Create a portfolio
[**deletePortfolioAssetSizeUsingDelete**](PortfolioApi.md#deletePortfolioAssetSizeUsingDelete) | **DELETE** /portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**deletePortfolioCommentUsingDelete**](PortfolioApi.md#deletePortfolioCommentUsingDelete) | **DELETE** /portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**deletePortfolioGoalUsingDelete**](PortfolioApi.md#deletePortfolioGoalUsingDelete) | **DELETE** /portfolio_goal/{portfolio_goal_id} | Delete an portfolio goal
[**deletePortfolioHoldingUsingDelete**](PortfolioApi.md#deletePortfolioHoldingUsingDelete) | **DELETE** /portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**deletePortfolioTransactionUsingDelete**](PortfolioApi.md#deletePortfolioTransactionUsingDelete) | **DELETE** /portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**deletePortfolioUsingDelete**](PortfolioApi.md#deletePortfolioUsingDelete) | **DELETE** /portfolio/{portfolio_id} | Delete a portfolio
[**getPortfolioAggregatedDataUsingGet**](PortfolioApi.md#getPortfolioAggregatedDataUsingGet) | **GET** /portfolio/{portfolio_id}/aggregate_data | Retrieve an portfolio aggregate data
[**getPortfolioAllUsingGet**](PortfolioApi.md#getPortfolioAllUsingGet) | **GET** /portfolio | List all portfolios
[**getPortfolioAssetSizeAllUsingGet**](PortfolioApi.md#getPortfolioAssetSizeAllUsingGet) | **GET** /portfolio_asset_size | Retrieve a portfolio asset size
[**getPortfolioAssetSizeUsingGet**](PortfolioApi.md#getPortfolioAssetSizeUsingGet) | **GET** /portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**getPortfolioCommentAllUsingGet**](PortfolioApi.md#getPortfolioCommentAllUsingGet) | **GET** /portfolio_comment | List all portfolio commentary
[**getPortfolioCommentUsingGet**](PortfolioApi.md#getPortfolioCommentUsingGet) | **GET** /portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**getPortfolioGoalAllUsingGet**](PortfolioApi.md#getPortfolioGoalAllUsingGet) | **GET** /portfolio_goal | List all portfolio goals
[**getPortfolioGoalUsingGet**](PortfolioApi.md#getPortfolioGoalUsingGet) | **GET** /portfolio_goal/{portfolio_goal_id} | Retrieve an portfolio goal
[**getPortfolioHoldingAllUsingGet**](PortfolioApi.md#getPortfolioHoldingAllUsingGet) | **GET** /portfolio_holding | List all portfolio holdings
[**getPortfolioHoldingUsingGet**](PortfolioApi.md#getPortfolioHoldingUsingGet) | **GET** /portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**getPortfolioTransactionAllUsingGet**](PortfolioApi.md#getPortfolioTransactionAllUsingGet) | **GET** /portfolio_transaction | List all portfolio transactions
[**getPortfolioTransactionUsingGet**](PortfolioApi.md#getPortfolioTransactionUsingGet) | **GET** /portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**getPortfolioUsingGet**](PortfolioApi.md#getPortfolioUsingGet) | **GET** /portfolio/{portfolio_id} | Retrieve a portfolio
[**updatePortfolioAssetSizeUsingPut**](PortfolioApi.md#updatePortfolioAssetSizeUsingPut) | **PUT** /portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**updatePortfolioCommentUsingPut**](PortfolioApi.md#updatePortfolioCommentUsingPut) | **PUT** /portfolio_comment/{portfolio_comment_id} | Update a portfolio comment
[**updatePortfolioGoalUsingPut**](PortfolioApi.md#updatePortfolioGoalUsingPut) | **PUT** /portfolio_goal/{portfolio_goal_id} | Update an portfolio goal
[**updatePortfolioHoldingUsingPut**](PortfolioApi.md#updatePortfolioHoldingUsingPut) | **PUT** /portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**updatePortfolioTransactionUsingPut**](PortfolioApi.md#updatePortfolioTransactionUsingPut) | **PUT** /portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**updatePortfolioUsingPut**](PortfolioApi.md#updatePortfolioUsingPut) | **PUT** /portfolio/{portfolio_id} | Update a portfolio


# **createPortfolioAssetSizeUsingPost**
> \com\hydrogen\Model\PortfolioAssetSizeLog createPortfolioAssetSizeUsingPost($portfolio_asset_size_log_request)

Create a portfolio asset size

Create a new asset size record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_asset_size_log_request = new \com\hydrogen\Model\PortfolioAssetSizeLog(); // \com\hydrogen\Model\PortfolioAssetSizeLog | portfolioAssetSizeLogRequest

try {
    $result = $apiInstance->createPortfolioAssetSizeUsingPost($portfolio_asset_size_log_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioAssetSizeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_log_request** | [**\com\hydrogen\Model\PortfolioAssetSizeLog**](../Model/PortfolioAssetSizeLog.md)| portfolioAssetSizeLogRequest |

### Return type

[**\com\hydrogen\Model\PortfolioAssetSizeLog**](../Model/PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioCommentUsingPost**
> \com\hydrogen\Model\PortfolioComment createPortfolioCommentUsingPost($portfolio_comment)

Create a portfolio commentary

Create a new comment for a portfolio defined for your firm.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_comment = new \com\hydrogen\Model\PortfolioComment(); // \com\hydrogen\Model\PortfolioComment | portfolioComment

try {
    $result = $apiInstance->createPortfolioCommentUsingPost($portfolio_comment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioCommentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | [**\com\hydrogen\Model\PortfolioComment**](../Model/PortfolioComment.md)| portfolioComment |

### Return type

[**\com\hydrogen\Model\PortfolioComment**](../Model/PortfolioComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioGoalUsingPost**
> \com\hydrogen\Model\PortfolioGoal createPortfolioGoalUsingPost($portfolio_goal)

Create an portfolio goal

Create an portfolio goal.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_goal = new \com\hydrogen\Model\PortfolioGoal(); // \com\hydrogen\Model\PortfolioGoal | portfolioGoal

try {
    $result = $apiInstance->createPortfolioGoalUsingPost($portfolio_goal);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioGoalUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | [**\com\hydrogen\Model\PortfolioGoal**](../Model/PortfolioGoal.md)| portfolioGoal |

### Return type

[**\com\hydrogen\Model\PortfolioGoal**](../Model/PortfolioGoal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioHoldingUsingPost**
> \com\hydrogen\Model\PortfolioHoldingLog createPortfolioHoldingUsingPost($portfolio_holdin_log_request)

Create a portfolio holding

Create a new holding record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_holdin_log_request = new \com\hydrogen\Model\PortfolioHoldingLog(); // \com\hydrogen\Model\PortfolioHoldingLog | portfolioHoldinLogRequest

try {
    $result = $apiInstance->createPortfolioHoldingUsingPost($portfolio_holdin_log_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioHoldingUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holdin_log_request** | [**\com\hydrogen\Model\PortfolioHoldingLog**](../Model/PortfolioHoldingLog.md)| portfolioHoldinLogRequest |

### Return type

[**\com\hydrogen\Model\PortfolioHoldingLog**](../Model/PortfolioHoldingLog.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioTransactionUsingPost**
> \com\hydrogen\Model\PortfolioTransaction createPortfolioTransactionUsingPost($portfolio_transaction_request)

Create a portfolio transaction

Create a new transaction record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_transaction_request = new \com\hydrogen\Model\PortfolioTransaction(); // \com\hydrogen\Model\PortfolioTransaction | portfolioTransactionRequest

try {
    $result = $apiInstance->createPortfolioTransactionUsingPost($portfolio_transaction_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioTransactionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_request** | [**\com\hydrogen\Model\PortfolioTransaction**](../Model/PortfolioTransaction.md)| portfolioTransactionRequest |

### Return type

[**\com\hydrogen\Model\PortfolioTransaction**](../Model/PortfolioTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPortfolioUsingPost**
> \com\hydrogen\Model\Portfolio createPortfolioUsingPost($portfolio_request)

Create a portfolio

Create a new portfolio for an account.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_request = new \com\hydrogen\Model\Portfolio(); // \com\hydrogen\Model\Portfolio | portfolioRequest

try {
    $result = $apiInstance->createPortfolioUsingPost($portfolio_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->createPortfolioUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_request** | [**\com\hydrogen\Model\Portfolio**](../Model/Portfolio.md)| portfolioRequest |

### Return type

[**\com\hydrogen\Model\Portfolio**](../Model/Portfolio.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioAssetSizeUsingDelete**
> deletePortfolioAssetSizeUsingDelete($portfolio_asset_size_id)

Delete a portfolio asset size

Permanently delete a portfolio asset size record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_asset_size_id = "portfolio_asset_size_id_example"; // string | UUID portfolio_asset_size_id

try {
    $apiInstance->deletePortfolioAssetSizeUsingDelete($portfolio_asset_size_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioAssetSizeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**string**](../Model/.md)| UUID portfolio_asset_size_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioCommentUsingDelete**
> deletePortfolioCommentUsingDelete($portfolio_comment_id)

Delete a portfolio commentary

Permanently delete a portfolio comment for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_comment_id = "portfolio_comment_id_example"; // string | UUID portfolio_comment_id

try {
    $apiInstance->deletePortfolioCommentUsingDelete($portfolio_comment_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioCommentUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**string**](../Model/.md)| UUID portfolio_comment_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioGoalUsingDelete**
> deletePortfolioGoalUsingDelete($portfolio_goal_id)

Delete an portfolio goal

Permanently delete an portfolio-goal mapping.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_goal_id = "portfolio_goal_id_example"; // string | UUID portfolio_goal_id

try {
    $apiInstance->deletePortfolioGoalUsingDelete($portfolio_goal_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioGoalUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**string**](../Model/.md)| UUID portfolio_goal_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioHoldingUsingDelete**
> deletePortfolioHoldingUsingDelete($portfolio_holding_id)

Delete a portfolio holding

Permanently delete a portfolio holding record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_holding_id = "portfolio_holding_id_example"; // string | UUID portfolio_holding_id

try {
    $apiInstance->deletePortfolioHoldingUsingDelete($portfolio_holding_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioHoldingUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**string**](../Model/.md)| UUID portfolio_holding_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioTransactionUsingDelete**
> deletePortfolioTransactionUsingDelete($portfolio_transaction_id)

Delete a portfolio transaction

Permanently delete a portfolio transaction record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_transaction_id = "portfolio_transaction_id_example"; // string | UUID portfolio_transaction_id

try {
    $apiInstance->deletePortfolioTransactionUsingDelete($portfolio_transaction_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioTransactionUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**string**](../Model/.md)| UUID portfolio_transaction_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePortfolioUsingDelete**
> deletePortfolioUsingDelete($portfolio_id)

Delete a portfolio

Permanently delete a portfolio for an account.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | UUID portfolio_id

try {
    $apiInstance->deletePortfolioUsingDelete($portfolio_id);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->deletePortfolioUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| UUID portfolio_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioAggregatedDataUsingGet**
> \com\hydrogen\Model\PortfolioAggregatedVO getPortfolioAggregatedDataUsingGet($portfolio_id, $show_asset_class, $show_category, $show_industry, $show_sector, $show_security_class)

Retrieve an portfolio aggregate data

Retrieve the information for a securities associated with a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | Portfolio Id
$show_asset_class = true; // bool | true or false
$show_category = true; // bool | true or false
$show_industry = true; // bool | true or false
$show_sector = true; // bool | true or false
$show_security_class = true; // bool | true or false

try {
    $result = $apiInstance->getPortfolioAggregatedDataUsingGet($portfolio_id, $show_asset_class, $show_category, $show_industry, $show_sector, $show_security_class);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioAggregatedDataUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| Portfolio Id |
 **show_asset_class** | **bool**| true or false | [optional] [default to true]
 **show_category** | **bool**| true or false | [optional] [default to true]
 **show_industry** | **bool**| true or false | [optional] [default to true]
 **show_sector** | **bool**| true or false | [optional] [default to true]
 **show_security_class** | **bool**| true or false | [optional] [default to true]

### Return type

[**\com\hydrogen\Model\PortfolioAggregatedVO**](../Model/PortfolioAggregatedVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioAllUsingGet**
> \com\hydrogen\Model\PagePortfolio_ getPortfolioAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all portfolios

Get the information for all portfolios assigned to all of your firm’s accounts.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PagePortfolio_**](../Model/PagePortfolio_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioAssetSizeAllUsingGet**
> \com\hydrogen\Model\PagePortfolioAssetSizeLog_ getPortfolioAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioAssetSizeAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PagePortfolioAssetSizeLog_**](../Model/PagePortfolioAssetSizeLog_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioAssetSizeUsingGet**
> \com\hydrogen\Model\PortfolioAssetSize getPortfolioAssetSizeUsingGet($portfolio_asset_size_id)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_asset_size_id = "portfolio_asset_size_id_example"; // string | portfolio_asset_size_id

try {
    $result = $apiInstance->getPortfolioAssetSizeUsingGet($portfolio_asset_size_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioAssetSizeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**string**](../Model/.md)| portfolio_asset_size_id |

### Return type

[**\com\hydrogen\Model\PortfolioAssetSize**](../Model/PortfolioAssetSize.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioCommentAllUsingGet**
> \com\hydrogen\Model\PagePortfolioComment_ getPortfolioCommentAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all portfolio commentary

List all comments for all portfolios defined for your firm.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioCommentAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioCommentAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PagePortfolioComment_**](../Model/PagePortfolioComment_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioCommentUsingGet**
> \com\hydrogen\Model\PortfolioComment getPortfolioCommentUsingGet($portfolio_comment_id)

Retrieve a portfolio commentary

Retrieve the information for a portfolio comment for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_comment_id = "portfolio_comment_id_example"; // string | UUID portfolio_comment_id

try {
    $result = $apiInstance->getPortfolioCommentUsingGet($portfolio_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioCommentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**string**](../Model/.md)| UUID portfolio_comment_id |

### Return type

[**\com\hydrogen\Model\PortfolioComment**](../Model/PortfolioComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioGoalAllUsingGet**
> \com\hydrogen\Model\PagePortfolioGoal_ getPortfolioGoalAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all portfolio goals

Get information for all portfolio-goal mappings defined for your firm.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioGoalAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioGoalAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PagePortfolioGoal_**](../Model/PagePortfolioGoal_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioGoalUsingGet**
> \com\hydrogen\Model\PortfolioGoal getPortfolioGoalUsingGet($portfolio_goal_id)

Retrieve an portfolio goal

Retrieve the information for a specific portfolio-goal mapping.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_goal_id = "portfolio_goal_id_example"; // string | UUID portfolio_goal_id

try {
    $result = $apiInstance->getPortfolioGoalUsingGet($portfolio_goal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioGoalUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**string**](../Model/.md)| UUID portfolio_goal_id |

### Return type

[**\com\hydrogen\Model\PortfolioGoal**](../Model/PortfolioGoal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioHoldingAllUsingGet**
> \com\hydrogen\Model\PortfolioHolding getPortfolioHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all portfolio holdings

Get the information for all holding records for all portfolios defined for your firm.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioHoldingAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PortfolioHolding**](../Model/PortfolioHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioHoldingUsingGet**
> \com\hydrogen\Model\PortfolioHolding getPortfolioHoldingUsingGet($portfolio_holding_id)

Retrieve a portfolio holding

Retrieve the information for a portfolio holding record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_holding_id = "portfolio_holding_id_example"; // string | UUID portfolio_holding_id

try {
    $result = $apiInstance->getPortfolioHoldingUsingGet($portfolio_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**string**](../Model/.md)| UUID portfolio_holding_id |

### Return type

[**\com\hydrogen\Model\PortfolioHolding**](../Model/PortfolioHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioTransactionAllUsingGet**
> \com\hydrogen\Model\PagePortfolioTransaction_ getPortfolioTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all portfolio transactions

Get the information for all transaction records for all portfolios defined for your firm.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
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
    $result = $apiInstance->getPortfolioTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PagePortfolioTransaction_**](../Model/PagePortfolioTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioTransactionUsingGet**
> \com\hydrogen\Model\PortfolioTransaction getPortfolioTransactionUsingGet($portfolio_transaction_id)

Retrieve a portfolio transaction

Retrieve the information for a portfolio transaction record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_transaction_id = "portfolio_transaction_id_example"; // string | UUID portfolio_transaction_id

try {
    $result = $apiInstance->getPortfolioTransactionUsingGet($portfolio_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**string**](../Model/.md)| UUID portfolio_transaction_id |

### Return type

[**\com\hydrogen\Model\PortfolioTransaction**](../Model/PortfolioTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioUsingGet**
> \com\hydrogen\Model\Portfolio getPortfolioUsingGet($portfolio_id)

Retrieve a portfolio

Retrieve a portfolio for an account.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | UUID portfolio_id

try {
    $result = $apiInstance->getPortfolioUsingGet($portfolio_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->getPortfolioUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| UUID portfolio_id |

### Return type

[**\com\hydrogen\Model\Portfolio**](../Model/Portfolio.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioAssetSizeUsingPut**
> \com\hydrogen\Model\PortfolioAssetSize updatePortfolioAssetSizeUsingPut($portfolio_asset_size, $portfolio_asset_size_id)

Update a portfolio asset size

Update the information for a portfolio asset size record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_asset_size = new \com\hydrogen\Model\PortfolioAssetSizeLog(); // \com\hydrogen\Model\PortfolioAssetSizeLog | portfolio_asset_size
$portfolio_asset_size_id = "portfolio_asset_size_id_example"; // string | UUID portfolio_asset_size_id

try {
    $result = $apiInstance->updatePortfolioAssetSizeUsingPut($portfolio_asset_size, $portfolio_asset_size_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioAssetSizeUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size** | [**\com\hydrogen\Model\PortfolioAssetSizeLog**](../Model/PortfolioAssetSizeLog.md)| portfolio_asset_size |
 **portfolio_asset_size_id** | [**string**](../Model/.md)| UUID portfolio_asset_size_id |

### Return type

[**\com\hydrogen\Model\PortfolioAssetSize**](../Model/PortfolioAssetSize.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioCommentUsingPut**
> \com\hydrogen\Model\PortfolioComment updatePortfolioCommentUsingPut($portfolio_comment, $portfolio_comment_id)

Update a portfolio comment

Update the information for a portfolio comment for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_comment = new \com\hydrogen\Model\PortfolioComment(); // \com\hydrogen\Model\PortfolioComment | portfolio_comment
$portfolio_comment_id = "portfolio_comment_id_example"; // string | UUID portfolio_comment_id

try {
    $result = $apiInstance->updatePortfolioCommentUsingPut($portfolio_comment, $portfolio_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioCommentUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | [**\com\hydrogen\Model\PortfolioComment**](../Model/PortfolioComment.md)| portfolio_comment |
 **portfolio_comment_id** | [**string**](../Model/.md)| UUID portfolio_comment_id |

### Return type

[**\com\hydrogen\Model\PortfolioComment**](../Model/PortfolioComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioGoalUsingPut**
> \com\hydrogen\Model\PortfolioGoal updatePortfolioGoalUsingPut($portfolio_goal, $portfolio_goal_id)

Update an portfolio goal

Update the information for an portfolio-goal mapping.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_goal = new \com\hydrogen\Model\PortfolioGoal(); // \com\hydrogen\Model\PortfolioGoal | portfolio_goal
$portfolio_goal_id = "portfolio_goal_id_example"; // string | UUID portfolio_goal_id

try {
    $result = $apiInstance->updatePortfolioGoalUsingPut($portfolio_goal, $portfolio_goal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioGoalUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | [**\com\hydrogen\Model\PortfolioGoal**](../Model/PortfolioGoal.md)| portfolio_goal |
 **portfolio_goal_id** | [**string**](../Model/.md)| UUID portfolio_goal_id |

### Return type

[**\com\hydrogen\Model\PortfolioGoal**](../Model/PortfolioGoal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioHoldingUsingPut**
> \com\hydrogen\Model\PortfolioHolding updatePortfolioHoldingUsingPut($portfolio_holding, $portfolio_holding_id)

Update a portfolio holding

Update the information for a portfolio holding record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_holding = new \com\hydrogen\Model\PortfolioHoldingLog(); // \com\hydrogen\Model\PortfolioHoldingLog | portfolio_holding
$portfolio_holding_id = "portfolio_holding_id_example"; // string | UUID portfolio_holding_id

try {
    $result = $apiInstance->updatePortfolioHoldingUsingPut($portfolio_holding, $portfolio_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioHoldingUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding** | [**\com\hydrogen\Model\PortfolioHoldingLog**](../Model/PortfolioHoldingLog.md)| portfolio_holding |
 **portfolio_holding_id** | [**string**](../Model/.md)| UUID portfolio_holding_id |

### Return type

[**\com\hydrogen\Model\PortfolioHolding**](../Model/PortfolioHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioTransactionUsingPut**
> \com\hydrogen\Model\PortfolioTransaction updatePortfolioTransactionUsingPut($portfolio_transaction, $portfolio_transaction_id)

Update a portfolio transaction

Update the information for a portfolio transaction record for a portfolio.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_transaction = new \com\hydrogen\Model\PortfolioTransaction(); // \com\hydrogen\Model\PortfolioTransaction | portfolio_transaction
$portfolio_transaction_id = "portfolio_transaction_id_example"; // string | UUID portfolio_transaction_id

try {
    $result = $apiInstance->updatePortfolioTransactionUsingPut($portfolio_transaction, $portfolio_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioTransactionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction** | [**\com\hydrogen\Model\PortfolioTransaction**](../Model/PortfolioTransaction.md)| portfolio_transaction |
 **portfolio_transaction_id** | [**string**](../Model/.md)| UUID portfolio_transaction_id |

### Return type

[**\com\hydrogen\Model\PortfolioTransaction**](../Model/PortfolioTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updatePortfolioUsingPut**
> \com\hydrogen\Model\Portfolio updatePortfolioUsingPut($portfolio, $portfolio_id)

Update a portfolio

Update a portfolio for an account.

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
$apiInstance = new com\hydrogen\Api\PortfolioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio = new \com\hydrogen\Model\Portfolio(); // \com\hydrogen\Model\Portfolio | portfolio
$portfolio_id = "portfolio_id_example"; // string | UUID portfolio_id

try {
    $result = $apiInstance->updatePortfolioUsingPut($portfolio, $portfolio_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioApi->updatePortfolioUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | [**\com\hydrogen\Model\Portfolio**](../Model/Portfolio.md)| portfolio |
 **portfolio_id** | [**string**](../Model/.md)| UUID portfolio_id |

### Return type

[**\com\hydrogen\Model\Portfolio**](../Model/Portfolio.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

