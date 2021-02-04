# com\hydrogen\proton\BusinessFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessFinancialHealthCheck**](BusinessFinancialManagementApi.md#businessFinancialHealthCheck) | **POST** /business/financial_health_check | Business Financial Health Check
[**cashAnalysis**](BusinessFinancialManagementApi.md#cashAnalysis) | **POST** /business/cash_analysis | Cash Analysis
[**customerAnalysis**](BusinessFinancialManagementApi.md#customerAnalysis) | **POST** /business/customer_analysis | Customer Analysis
[**financialStatementAnalysis**](BusinessFinancialManagementApi.md#financialStatementAnalysis) | **POST** /business/financial_statement_analysis | Financial Statement Analysis
[**invoiceAnalysis**](BusinessFinancialManagementApi.md#invoiceAnalysis) | **POST** /business/invoice_analysis | Invoice Analysis


# **businessFinancialHealthCheck**
> map[string,object] businessFinancialHealthCheck($business_financial_health_check_request)

Business Financial Health Check

Calculate a series of financial ratios to assess business financial health

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\BusinessFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_financial_health_check_request = new \com\hydrogen\proton\Model\BusinessFinancialHealthCheckRequest(); // \com\hydrogen\proton\Model\BusinessFinancialHealthCheckRequest | Request payload for Business Financial Health Check

try {
    $result = $apiInstance->businessFinancialHealthCheck($business_financial_health_check_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessFinancialManagementApi->businessFinancialHealthCheck: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_financial_health_check_request** | [**\com\hydrogen\proton\Model\BusinessFinancialHealthCheckRequest**](../Model/BusinessFinancialHealthCheckRequest.md)| Request payload for Business Financial Health Check |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cashAnalysis**
> map[string,object] cashAnalysis($cash_analysis_request)

Cash Analysis

Analyze cash activity over time

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\BusinessFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cash_analysis_request = new \com\hydrogen\proton\Model\CashAnalysisRequest(); // \com\hydrogen\proton\Model\CashAnalysisRequest | Request payload for Cash Analysis

try {
    $result = $apiInstance->cashAnalysis($cash_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessFinancialManagementApi->cashAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_analysis_request** | [**\com\hydrogen\proton\Model\CashAnalysisRequest**](../Model/CashAnalysisRequest.md)| Request payload for Cash Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **customerAnalysis**
> map[string,object] customerAnalysis($customer_analysis_request)

Customer Analysis

Analyze customer revenues over a time period

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\BusinessFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_analysis_request = new \com\hydrogen\proton\Model\CustomerAnalysisRequest(); // \com\hydrogen\proton\Model\CustomerAnalysisRequest | Request payload for Customer Analysis

try {
    $result = $apiInstance->customerAnalysis($customer_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessFinancialManagementApi->customerAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_analysis_request** | [**\com\hydrogen\proton\Model\CustomerAnalysisRequest**](../Model/CustomerAnalysisRequest.md)| Request payload for Customer Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **financialStatementAnalysis**
> map[string,object] financialStatementAnalysis($financial_statement_analysis_request)

Financial Statement Analysis

Analyze financial statement accounting data for a business

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\BusinessFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_statement_analysis_request = new \com\hydrogen\proton\Model\FinancialStatementAnalysisRequest(); // \com\hydrogen\proton\Model\FinancialStatementAnalysisRequest | Request payload for Financial Statement Analysis

try {
    $result = $apiInstance->financialStatementAnalysis($financial_statement_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessFinancialManagementApi->financialStatementAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_analysis_request** | [**\com\hydrogen\proton\Model\FinancialStatementAnalysisRequest**](../Model/FinancialStatementAnalysisRequest.md)| Request payload for Financial Statement Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invoiceAnalysis**
> map[string,object] invoiceAnalysis($invoice_analysis_request)

Invoice Analysis

Analyze invoices to understand the context of money owed and paid to a business

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\BusinessFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_analysis_request = new \com\hydrogen\proton\Model\BusinessInvoiceAnalysisRequest(); // \com\hydrogen\proton\Model\BusinessInvoiceAnalysisRequest | Request payload for Invoice Analysis

try {
    $result = $apiInstance->invoiceAnalysis($invoice_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessFinancialManagementApi->invoiceAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_analysis_request** | [**\com\hydrogen\proton\Model\BusinessInvoiceAnalysisRequest**](../Model/BusinessInvoiceAnalysisRequest.md)| Request payload for Invoice Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

