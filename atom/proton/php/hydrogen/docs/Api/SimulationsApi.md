# com\hydrogen\proton\SimulationsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backtest**](SimulationsApi.md#backtest) | **POST** /backtest | Backtest
[**eventStudy**](SimulationsApi.md#eventStudy) | **POST** /event_study | Event Study
[**monteCarlo**](SimulationsApi.md#monteCarlo) | **POST** /monte_carlo | Monte Carlo
[**portfolioWhatIf**](SimulationsApi.md#portfolioWhatIf) | **POST** /portfolio_what_if | Porfolio What-If
[**savingsCalculator**](SimulationsApi.md#savingsCalculator) | **POST** /savings_calculator | Savings Calculator
[**scenarioAnalysis**](SimulationsApi.md#scenarioAnalysis) | **POST** /scenario_analysis | Scenario Analysis
[**sensitivityAnalysis**](SimulationsApi.md#sensitivityAnalysis) | **POST** /sensitivity_analysis | Sensitivity Analysis


# **backtest**
> map[string,object] backtest($backtest_request)

Backtest

Run a historical analysis for a group of investments

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$backtest_request = new \com\hydrogen\proton\Model\BacktestRequest(); // \com\hydrogen\proton\Model\BacktestRequest | Request payload for Backtest

try {
    $result = $apiInstance->backtest($backtest_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->backtest: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backtest_request** | [**\com\hydrogen\proton\Model\BacktestRequest**](../Model/BacktestRequest.md)| Request payload for Backtest |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventStudy**
> map[string,object] eventStudy($event_study_request)

Event Study

Analyze a group of investments against key historical events

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$event_study_request = new \com\hydrogen\proton\Model\EventStudyRequest(); // \com\hydrogen\proton\Model\EventStudyRequest | Request payload for Event Study

try {
    $result = $apiInstance->eventStudy($event_study_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->eventStudy: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_study_request** | [**\com\hydrogen\proton\Model\EventStudyRequest**](../Model/EventStudyRequest.md)| Request payload for Event Study |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **monteCarlo**
> map[string,object] monteCarlo($monte_carlo_request)

Monte Carlo

Simulate the future growth of a group of investments

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$monte_carlo_request = new \com\hydrogen\proton\Model\MonteCarloRequest(); // \com\hydrogen\proton\Model\MonteCarloRequest | Request payload for Monte Carlo

try {
    $result = $apiInstance->monteCarlo($monte_carlo_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->monteCarlo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monte_carlo_request** | [**\com\hydrogen\proton\Model\MonteCarloRequest**](../Model/MonteCarloRequest.md)| Request payload for Monte Carlo |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **portfolioWhatIf**
> map[string,object] portfolioWhatIf($portfolio_what_if_request)

Porfolio What-If

Simulate the impact of adding, removing, reducing, or increasing various positions in a group of investments

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_what_if_request = new \com\hydrogen\proton\Model\PortfolioWhatIfRequest(); // \com\hydrogen\proton\Model\PortfolioWhatIfRequest | Request payload for Portfolio What-If

try {
    $result = $apiInstance->portfolioWhatIf($portfolio_what_if_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->portfolioWhatIf: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_what_if_request** | [**\com\hydrogen\proton\Model\PortfolioWhatIfRequest**](../Model/PortfolioWhatIfRequest.md)| Request payload for Portfolio What-If |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **savingsCalculator**
> map[string,object] savingsCalculator($savings_calculator_request)

Savings Calculator

Simulate the future growth of a simple savings account

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$savings_calculator_request = new \com\hydrogen\proton\Model\SavingsCalculatorRequest(); // \com\hydrogen\proton\Model\SavingsCalculatorRequest | Request payload for Savings Calculator

try {
    $result = $apiInstance->savingsCalculator($savings_calculator_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->savingsCalculator: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savings_calculator_request** | [**\com\hydrogen\proton\Model\SavingsCalculatorRequest**](../Model/SavingsCalculatorRequest.md)| Request payload for Savings Calculator |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **scenarioAnalysis**
> map[string,object] scenarioAnalysis($scneario_analysis_request)

Scenario Analysis

Analyze a group of investments against a series of external economic factors

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$scneario_analysis_request = new \com\hydrogen\proton\Model\ScenarioAnalysisRequest(); // \com\hydrogen\proton\Model\ScenarioAnalysisRequest | Request payload for Scenario Analysis

try {
    $result = $apiInstance->scenarioAnalysis($scneario_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->scenarioAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scneario_analysis_request** | [**\com\hydrogen\proton\Model\ScenarioAnalysisRequest**](../Model/ScenarioAnalysisRequest.md)| Request payload for Scenario Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **sensitivityAnalysis**
> map[string,object] sensitivityAnalysis($sensitivity_analysis_request)

Sensitivity Analysis

Analyze a group of investments against an external economic factor

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
}$apiInstance = new com\hydrogen\proton\Api\SimulationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sensitivity_analysis_request = new \com\hydrogen\proton\Model\SensitivityAnalysisRequest(); // \com\hydrogen\proton\Model\SensitivityAnalysisRequest | Request payload for Sensitivity Analysis

try {
    $result = $apiInstance->sensitivityAnalysis($sensitivity_analysis_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SimulationsApi->sensitivityAnalysis: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivity_analysis_request** | [**\com\hydrogen\proton\Model\SensitivityAnalysisRequest**](../Model/SensitivityAnalysisRequest.md)| Request payload for Sensitivity Analysis |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

