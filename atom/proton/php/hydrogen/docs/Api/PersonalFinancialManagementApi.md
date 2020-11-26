# com\hydrogen\proton\PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budgetCalculator**](PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
[**cashFlowAnalysis**](PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**feeAnalysis**](PersonalFinancialManagementApi.md#feeAnalysis) | **POST** /fee_analysis | RFee Analysis
[**financialPicture**](PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture
[**recurringTransactionAnalysis**](PersonalFinancialManagementApi.md#recurringTransactionAnalysis) | **POST** /recurring_transaction_analysis | Recurring Transaction Analysis


# **budgetCalculator**
> map[string,object] budgetCalculator($budget_calculator_request)

Budget Calculator

Analyze spending against a defined budget

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
}$apiInstance = new com\hydrogen\proton\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$budget_calculator_request = new \com\hydrogen\proton\Model\BudgetCalculatorRequest(); // \com\hydrogen\proton\Model\BudgetCalculatorRequest | Request payload for Budget Calculator

try {
    $result = $apiInstance->budgetCalculator($budget_calculator_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PersonalFinancialManagementApi->budgetCalculator: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_calculator_request** | [**\com\hydrogen\proton\Model\BudgetCalculatorRequest**](../Model/BudgetCalculatorRequest.md)| Request payload for Budget Calculator |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cashFlowAnalysis**
> map[string,object] cashFlowAnalysis($cash_flow_analysis_request)

Cash Flow Analysis

Analyze income, expenses, and net income

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
}$apiInstance = new com\hydrogen\proton\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cash_flow_analysis_request = new \com\hydrogen\proton\Model\CashFlowAnalysisRequest(); // \com\hydrogen\proton\Model\CashFlowAnalysisRequest | Request payload for Cash Flow Analysis

try {
    $result = $apiInstance->cashFlowAnalysis($cash_flow_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PersonalFinancialManagementApi->cashFlowAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_flow_analysis_request** | [**\com\hydrogen\proton\Model\CashFlowAnalysisRequest**](../Model/CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **feeAnalysis**
> map[string,object] feeAnalysis($fee_analysis_request)

RFee Analysis

Analyze fee data

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
}$apiInstance = new com\hydrogen\proton\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$fee_analysis_request = new \com\hydrogen\proton\Model\FeeAnalysisRequest(); // \com\hydrogen\proton\Model\FeeAnalysisRequest | Request payload for Fee Analysis

try {
    $result = $apiInstance->feeAnalysis($fee_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PersonalFinancialManagementApi->feeAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fee_analysis_request** | [**\com\hydrogen\proton\Model\FeeAnalysisRequest**](../Model/FeeAnalysisRequest.md)| Request payload for Fee Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **financialPicture**
> map[string,object] financialPicture($financial_picture_request)

Financial Picture

Assess assets, liabilities, and net worth

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
}$apiInstance = new com\hydrogen\proton\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_picture_request = new \com\hydrogen\proton\Model\FinancialPictureRequest(); // \com\hydrogen\proton\Model\FinancialPictureRequest | Request payload for Financial Picture

try {
    $result = $apiInstance->financialPicture($financial_picture_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PersonalFinancialManagementApi->financialPicture: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_picture_request** | [**\com\hydrogen\proton\Model\FinancialPictureRequest**](../Model/FinancialPictureRequest.md)| Request payload for Financial Picture |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **recurringTransactionAnalysis**
> map[string,object] recurringTransactionAnalysis($recurring_transaction_analysis_request)

Recurring Transaction Analysis

Analyze recurring transactions

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
}$apiInstance = new com\hydrogen\proton\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$recurring_transaction_analysis_request = new \com\hydrogen\proton\Model\RecurringTransactionAnalysisRequest(); // \com\hydrogen\proton\Model\RecurringTransactionAnalysisRequest | Request payload for Recurring Transaction Analysis

try {
    $result = $apiInstance->recurringTransactionAnalysis($recurring_transaction_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PersonalFinancialManagementApi->recurringTransactionAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurring_transaction_analysis_request** | [**\com\hydrogen\proton\Model\RecurringTransactionAnalysisRequest**](../Model/RecurringTransactionAnalysisRequest.md)| Request payload for Recurring Transaction Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

