# com\hydrogen\nucleus\FinancialStatementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialStatementUsingPost**](FinancialStatementApi.md#createFinancialStatementUsingPost) | **POST** /financial_statement | Create an financialStatement
[**deleteFinancialStatementUsingDelete**](FinancialStatementApi.md#deleteFinancialStatementUsingDelete) | **DELETE** /financial_statement/{financial_statement_id} | Delete an financialStatement
[**getFinancialStatementAllUsingGet**](FinancialStatementApi.md#getFinancialStatementAllUsingGet) | **GET** /financial_statement | List all financialStatement
[**getFinancialStatementUsingGet**](FinancialStatementApi.md#getFinancialStatementUsingGet) | **GET** /financial_statement/{financial_statement_id} | Retrieve an financialStatement
[**updateFinancialStatementUsingPut**](FinancialStatementApi.md#updateFinancialStatementUsingPut) | **PUT** /financial_statement/{financial_statement_id} | Update an financialStatement


# **createFinancialStatementUsingPost**
> \com\hydrogen\nucleus\Model\FinancialStatement createFinancialStatementUsingPost($financial_statement)

Create an financialStatement

Store stats pulled from financialStatement vendors.

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
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\FinancialStatementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_statement = new \com\hydrogen\nucleus\Model\FinancialStatement(); // \com\hydrogen\nucleus\Model\FinancialStatement | financialStatement

try {
    $result = $apiInstance->createFinancialStatementUsingPost($financial_statement);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialStatementApi->createFinancialStatementUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | [**\com\hydrogen\nucleus\Model\FinancialStatement**](../Model/FinancialStatement.md)| financialStatement |

### Return type

[**\com\hydrogen\nucleus\Model\FinancialStatement**](../Model/FinancialStatement.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteFinancialStatementUsingDelete**
> deleteFinancialStatementUsingDelete($financial_statement_id)

Delete an financialStatement

Permanently delete an financialStatement.

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
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\FinancialStatementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_statement_id = "financial_statement_id_example"; // string | UUID financialStatement_id

try {
    $apiInstance->deleteFinancialStatementUsingDelete($financial_statement_id);
} catch (Exception $e) {
    echo 'Exception when calling FinancialStatementApi->deleteFinancialStatementUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**string**](../Model/.md)| UUID financialStatement_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFinancialStatementAllUsingGet**
> \com\hydrogen\nucleus\Model\PageFinancialStatement_ getFinancialStatementAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

List all financialStatement

Get information for all financialStatement for all clients defined for your firm.

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
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\FinancialStatementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | currency_conversion
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getFinancialStatementAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialStatementApi->getFinancialStatementAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **string**| currency_conversion | [optional]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageFinancialStatement_**](../Model/PageFinancialStatement_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFinancialStatementUsingGet**
> \com\hydrogen\nucleus\Model\FinancialStatement getFinancialStatementUsingGet($financial_statement_id, $currency_conversion)

Retrieve an financialStatement

Retrieve the information for a specific financialStatement associated with a client.

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
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\FinancialStatementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_statement_id = "financial_statement_id_example"; // string | UUID financial_statement_id
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getFinancialStatementUsingGet($financial_statement_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialStatementApi->getFinancialStatementUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**string**](../Model/.md)| UUID financial_statement_id |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\FinancialStatement**](../Model/FinancialStatement.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateFinancialStatementUsingPut**
> \com\hydrogen\nucleus\Model\FinancialStatement updateFinancialStatementUsingPut($financial_statement, $financial_statement_id)

Update an financialStatement

Update the information for an financialStatement.

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
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\FinancialStatementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_statement = new \com\hydrogen\nucleus\Model\FinancialStatement(); // \com\hydrogen\nucleus\Model\FinancialStatement | financialStatement
$financial_statement_id = "financial_statement_id_example"; // string | UUID financialStatement_id

try {
    $result = $apiInstance->updateFinancialStatementUsingPut($financial_statement, $financial_statement_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialStatementApi->updateFinancialStatementUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | [**\com\hydrogen\nucleus\Model\FinancialStatement**](../Model/FinancialStatement.md)| financialStatement |
 **financial_statement_id** | [**string**](../Model/.md)| UUID financialStatement_id |

### Return type

[**\com\hydrogen\nucleus\Model\FinancialStatement**](../Model/FinancialStatement.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

