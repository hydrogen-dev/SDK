# com\hydrogen\proton\FinancialPlanningApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**educationCalculatorAnnualCost**](FinancialPlanningApi.md#educationCalculatorAnnualCost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
[**educationCalculatorDepositAmount**](FinancialPlanningApi.md#educationCalculatorDepositAmount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
[**educationCalculatorPercentCovered**](FinancialPlanningApi.md#educationCalculatorPercentCovered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
[**mortgageCalculatorDownPayment**](FinancialPlanningApi.md#mortgageCalculatorDownPayment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
[**mortgageCalculatorHomePrice**](FinancialPlanningApi.md#mortgageCalculatorHomePrice) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
[**mortgageCalculatorPeriodicPayment**](FinancialPlanningApi.md#mortgageCalculatorPeriodicPayment) | **POST** /mortgage_calculator/periodic_payment | Mortgage Calculator - Periodic Payment
[**purchaseCalculatorAmount**](FinancialPlanningApi.md#purchaseCalculatorAmount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
[**purchaseCalculatorDepositAmount**](FinancialPlanningApi.md#purchaseCalculatorDepositAmount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
[**purchaseCalculatorHorizon**](FinancialPlanningApi.md#purchaseCalculatorHorizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
[**retirementCalculatorDepositAmount**](FinancialPlanningApi.md#retirementCalculatorDepositAmount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
[**retirementCalculatorExpenses**](FinancialPlanningApi.md#retirementCalculatorExpenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
[**retirementCalculatorPercentCovered**](FinancialPlanningApi.md#retirementCalculatorPercentCovered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered


# **educationCalculatorAnnualCost**
> map[string,object] educationCalculatorAnnualCost($education_calculator_annual_cost_request)

Education Calculator - Annual Cost

Calculate the achievable education costs

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$education_calculator_annual_cost_request = new \com\hydrogen\proton\Model\EducationCalculatorAnnualCostRequest(); // \com\hydrogen\proton\Model\EducationCalculatorAnnualCostRequest | Request payload for Education Calculator - Annual Cost

try {
    $result = $apiInstance->educationCalculatorAnnualCost($education_calculator_annual_cost_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->educationCalculatorAnnualCost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_annual_cost_request** | [**\com\hydrogen\proton\Model\EducationCalculatorAnnualCostRequest**](../Model/EducationCalculatorAnnualCostRequest.md)| Request payload for Education Calculator - Annual Cost |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **educationCalculatorDepositAmount**
> map[string,object] educationCalculatorDepositAmount($education_calculator_deposit_amount_request)

Education Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve education costs

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$education_calculator_deposit_amount_request = new \com\hydrogen\proton\Model\EducationCalculatorDepositAmountRequest(); // \com\hydrogen\proton\Model\EducationCalculatorDepositAmountRequest | Request payload for Education Calculator - Deposit Amount

try {
    $result = $apiInstance->educationCalculatorDepositAmount($education_calculator_deposit_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->educationCalculatorDepositAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_deposit_amount_request** | [**\com\hydrogen\proton\Model\EducationCalculatorDepositAmountRequest**](../Model/EducationCalculatorDepositAmountRequest.md)| Request payload for Education Calculator - Deposit Amount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **educationCalculatorPercentCovered**
> map[string,object] educationCalculatorPercentCovered($education_calculator_percent_covered_request)

Education Calculator - Percent Covered

Calculate the achievable percentage of education costs that can be covered

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$education_calculator_percent_covered_request = new \com\hydrogen\proton\Model\EducationCalculatorPercentCoveredRequest(); // \com\hydrogen\proton\Model\EducationCalculatorPercentCoveredRequest | Request payload for Education Calculator - Percent Covered

try {
    $result = $apiInstance->educationCalculatorPercentCovered($education_calculator_percent_covered_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->educationCalculatorPercentCovered: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_percent_covered_request** | [**\com\hydrogen\proton\Model\EducationCalculatorPercentCoveredRequest**](../Model/EducationCalculatorPercentCoveredRequest.md)| Request payload for Education Calculator - Percent Covered |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **mortgageCalculatorDownPayment**
> map[string,object] mortgageCalculatorDownPayment($mortgage_calculator_down_payment_request)

Mortgage Calculator - Down Payment

Calculate the necessary down payment for the mortgage

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mortgage_calculator_down_payment_request = new \com\hydrogen\proton\Model\MortgageCalculatorDownPaymentRequest(); // \com\hydrogen\proton\Model\MortgageCalculatorDownPaymentRequest | Request payload for Mortgage Calculator - Down Payment

try {
    $result = $apiInstance->mortgageCalculatorDownPayment($mortgage_calculator_down_payment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->mortgageCalculatorDownPayment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_down_payment_request** | [**\com\hydrogen\proton\Model\MortgageCalculatorDownPaymentRequest**](../Model/MortgageCalculatorDownPaymentRequest.md)| Request payload for Mortgage Calculator - Down Payment |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **mortgageCalculatorHomePrice**
> map[string,object] mortgageCalculatorHomePrice($mortgage_calculator_home_price_request)

Mortgage Calculator - Home Price

Calculate the achievable home price for the mortgage

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mortgage_calculator_home_price_request = new \com\hydrogen\proton\Model\MortgageCalculatorHomePriceRequest(); // \com\hydrogen\proton\Model\MortgageCalculatorHomePriceRequest | Request payload for Mortgage Calculator - Home Price

try {
    $result = $apiInstance->mortgageCalculatorHomePrice($mortgage_calculator_home_price_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->mortgageCalculatorHomePrice: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_home_price_request** | [**\com\hydrogen\proton\Model\MortgageCalculatorHomePriceRequest**](../Model/MortgageCalculatorHomePriceRequest.md)| Request payload for Mortgage Calculator - Home Price |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **mortgageCalculatorPeriodicPayment**
> map[string,object] mortgageCalculatorPeriodicPayment($mortgage_calculator_periodic_payment_request)

Mortgage Calculator - Periodic Payment

Calculate the periodic payment for the mortgage

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mortgage_calculator_periodic_payment_request = new \com\hydrogen\proton\Model\MortgageCalculatorPeriodicPaymentRequest(); // \com\hydrogen\proton\Model\MortgageCalculatorPeriodicPaymentRequest | Request payload for Mortgage Calculator - Periodic Payment

try {
    $result = $apiInstance->mortgageCalculatorPeriodicPayment($mortgage_calculator_periodic_payment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->mortgageCalculatorPeriodicPayment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_periodic_payment_request** | [**\com\hydrogen\proton\Model\MortgageCalculatorPeriodicPaymentRequest**](../Model/MortgageCalculatorPeriodicPaymentRequest.md)| Request payload for Mortgage Calculator - Periodic Payment |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **purchaseCalculatorAmount**
> map[string,object] purchaseCalculatorAmount($purchase_calculator_amount_request)

Purchase Calculator - Amount

Calculate the achievable purchase amount

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$purchase_calculator_amount_request = new \com\hydrogen\proton\Model\PurchaseCalculatorAmountRequest(); // \com\hydrogen\proton\Model\PurchaseCalculatorAmountRequest | Request payload for Purchase Calculator - Amount

try {
    $result = $apiInstance->purchaseCalculatorAmount($purchase_calculator_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->purchaseCalculatorAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_amount_request** | [**\com\hydrogen\proton\Model\PurchaseCalculatorAmountRequest**](../Model/PurchaseCalculatorAmountRequest.md)| Request payload for Purchase Calculator - Amount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **purchaseCalculatorDepositAmount**
> map[string,object] purchaseCalculatorDepositAmount($purchase_calculator_deposit_amount_request)

Purchase Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve the purchase amount

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$purchase_calculator_deposit_amount_request = new \com\hydrogen\proton\Model\PurchaseCalculatorDepositAmountRequest(); // \com\hydrogen\proton\Model\PurchaseCalculatorDepositAmountRequest | Request payload for Purchase Calculator - Deposit Amount

try {
    $result = $apiInstance->purchaseCalculatorDepositAmount($purchase_calculator_deposit_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->purchaseCalculatorDepositAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_deposit_amount_request** | [**\com\hydrogen\proton\Model\PurchaseCalculatorDepositAmountRequest**](../Model/PurchaseCalculatorDepositAmountRequest.md)| Request payload for Purchase Calculator - Deposit Amount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **purchaseCalculatorHorizon**
> map[string,object] purchaseCalculatorHorizon($purchase_calculator_horizon_request)

Purchase Calculator - Horizon

Calculate the necessary time horizon to achieve the purchase amount

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$purchase_calculator_horizon_request = new \com\hydrogen\proton\Model\PurchaseCalculatorHorizonRequest(); // \com\hydrogen\proton\Model\PurchaseCalculatorHorizonRequest | Request payload for Purchase Calculator - Horizon

try {
    $result = $apiInstance->purchaseCalculatorHorizon($purchase_calculator_horizon_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->purchaseCalculatorHorizon: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_horizon_request** | [**\com\hydrogen\proton\Model\PurchaseCalculatorHorizonRequest**](../Model/PurchaseCalculatorHorizonRequest.md)| Request payload for Purchase Calculator - Horizon |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retirementCalculatorDepositAmount**
> map[string,object] retirementCalculatorDepositAmount($retirement_calculator_deposit_amount_request)

Retirement Calculator - Deposit Amount

Calculate the necessary period deposit amount to achieve the retirement expenses

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$retirement_calculator_deposit_amount_request = new \com\hydrogen\proton\Model\RetirementCalculatorDepositAmountRequest(); // \com\hydrogen\proton\Model\RetirementCalculatorDepositAmountRequest | Request payload for Retirement Calculator - Deposit AMount

try {
    $result = $apiInstance->retirementCalculatorDepositAmount($retirement_calculator_deposit_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->retirementCalculatorDepositAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_deposit_amount_request** | [**\com\hydrogen\proton\Model\RetirementCalculatorDepositAmountRequest**](../Model/RetirementCalculatorDepositAmountRequest.md)| Request payload for Retirement Calculator - Deposit AMount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retirementCalculatorExpenses**
> map[string,object] retirementCalculatorExpenses($retirement_calculator_expenses_request)

Retirement Calculator - Expenses

Calculate the achievable retirement expenses

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$retirement_calculator_expenses_request = new \com\hydrogen\proton\Model\RetirementCalculatorExpensesRequest(); // \com\hydrogen\proton\Model\RetirementCalculatorExpensesRequest | Request payload for Retirement Calculator - Expenses

try {
    $result = $apiInstance->retirementCalculatorExpenses($retirement_calculator_expenses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->retirementCalculatorExpenses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_expenses_request** | [**\com\hydrogen\proton\Model\RetirementCalculatorExpensesRequest**](../Model/RetirementCalculatorExpensesRequest.md)| Request payload for Retirement Calculator - Expenses |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retirementCalculatorPercentCovered**
> map[string,object] retirementCalculatorPercentCovered($retirement_calculator_percent_covered_request)

Retirement Calculator - Percent Covered

Calculate the achievable percentage of retirement expenses that can be covered

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
$apiInstance = new com\hydrogen\proton\Api\FinancialPlanningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$retirement_calculator_percent_covered_request = new \com\hydrogen\proton\Model\RetirementCalculatorPercentCoveredRequest(); // \com\hydrogen\proton\Model\RetirementCalculatorPercentCoveredRequest | Request payload for Retirement Calculator - Percent Covered

try {
    $result = $apiInstance->retirementCalculatorPercentCovered($retirement_calculator_percent_covered_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialPlanningApi->retirementCalculatorPercentCovered: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_percent_covered_request** | [**\com\hydrogen\proton\Model\RetirementCalculatorPercentCoveredRequest**](../Model/RetirementCalculatorPercentCoveredRequest.md)| Request payload for Retirement Calculator - Percent Covered |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

