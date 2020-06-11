# com\hydrogen\PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budgetCalculator**](PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
[**cashFlowAnalysis**](PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**financialPicture**](PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture


# **budgetCalculator**
> map[string,object] budgetCalculator($budget_calculator_request)

Budget Calculator

Analyze spending against a defined budget

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
$apiInstance = new com\hydrogen\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$budget_calculator_request = new \com\hydrogen\Model\BudgetCalculatorRequest(); // \com\hydrogen\Model\BudgetCalculatorRequest | Request payload for Budget Calculator

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
 **budget_calculator_request** | [**\com\hydrogen\Model\BudgetCalculatorRequest**](../Model/BudgetCalculatorRequest.md)| Request payload for Budget Calculator |

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
$apiInstance = new com\hydrogen\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cash_flow_analysis_request = new \com\hydrogen\Model\CashFlowAnalysisRequest(); // \com\hydrogen\Model\CashFlowAnalysisRequest | Request payload for Cash Flow Analysis

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
 **cash_flow_analysis_request** | [**\com\hydrogen\Model\CashFlowAnalysisRequest**](../Model/CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis |

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
$apiInstance = new com\hydrogen\Api\PersonalFinancialManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_picture_request = new \com\hydrogen\Model\FinancialPictureRequest(); // \com\hydrogen\Model\FinancialPictureRequest | Request payload for Financial Picture

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
 **financial_picture_request** | [**\com\hydrogen\Model\FinancialPictureRequest**](../Model/FinancialPictureRequest.md)| Request payload for Financial Picture |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

