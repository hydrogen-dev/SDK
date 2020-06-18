# com\hydrogen\proton\FinancialHealthApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diversificationScore**](FinancialHealthApi.md#diversificationScore) | **POST** /diversification_score | Diversification Score
[**emergencyFundCalculator**](FinancialHealthApi.md#emergencyFundCalculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
[**financialHealthCheck**](FinancialHealthApi.md#financialHealthCheck) | **POST** /financial_health_check | Financial Health Check
[**portfolioOptimizationScore**](FinancialHealthApi.md#portfolioOptimizationScore) | **POST** /portfolio_optimization_score | Portfolio Optimization Score


# **diversificationScore**
> map[string,object] diversificationScore($diversification_score_request)

Diversification Score

Assess how well a group of investments is diversified

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\FinancialHealthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$diversification_score_request = new \com\hydrogen\proton\Model\DiversificationScoreRequest(); // \com\hydrogen\proton\Model\DiversificationScoreRequest | Request payload for Diversification Score

try {
    $result = $apiInstance->diversificationScore($diversification_score_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialHealthApi->diversificationScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diversification_score_request** | [**\com\hydrogen\proton\Model\DiversificationScoreRequest**](../Model/DiversificationScoreRequest.md)| Request payload for Diversification Score |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **emergencyFundCalculator**
> map[string,object] emergencyFundCalculator($emergency_fund_calculator_request)

Emergency Fund Calculator

Calculate a target emergency fund amount and savings plan

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\FinancialHealthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$emergency_fund_calculator_request = new \com\hydrogen\proton\Model\EmergencyFundCalculatorRequest(); // \com\hydrogen\proton\Model\EmergencyFundCalculatorRequest | Request payload for Emergency Fund Calculator

try {
    $result = $apiInstance->emergencyFundCalculator($emergency_fund_calculator_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialHealthApi->emergencyFundCalculator: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergency_fund_calculator_request** | [**\com\hydrogen\proton\Model\EmergencyFundCalculatorRequest**](../Model/EmergencyFundCalculatorRequest.md)| Request payload for Emergency Fund Calculator |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **financialHealthCheck**
> map[string,object] financialHealthCheck($financial_health_check_request)

Financial Health Check

Calculate a series of financial ratios to assess financial health

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\FinancialHealthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_health_check_request = new \com\hydrogen\proton\Model\FinancialHealthCheckRequest(); // \com\hydrogen\proton\Model\FinancialHealthCheckRequest | Request payload for Financial Health Check

try {
    $result = $apiInstance->financialHealthCheck($financial_health_check_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialHealthApi->financialHealthCheck: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_health_check_request** | [**\com\hydrogen\proton\Model\FinancialHealthCheckRequest**](../Model/FinancialHealthCheckRequest.md)| Request payload for Financial Health Check |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **portfolioOptimizationScore**
> map[string,object] portfolioOptimizationScore($portfolio_optimization_score_request)

Portfolio Optimization Score

Analyze a group of investments against the optimized result

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\FinancialHealthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_optimization_score_request = new \com\hydrogen\proton\Model\PortfolioOptimizationScoreRequest(); // \com\hydrogen\proton\Model\PortfolioOptimizationScoreRequest | Request payload for Portfolio Optimization Score

try {
    $result = $apiInstance->portfolioOptimizationScore($portfolio_optimization_score_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialHealthApi->portfolioOptimizationScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_optimization_score_request** | [**\com\hydrogen\proton\Model\PortfolioOptimizationScoreRequest**](../Model/PortfolioOptimizationScoreRequest.md)| Request payload for Portfolio Optimization Score |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

