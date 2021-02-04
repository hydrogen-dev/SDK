# com\hydrogen\proton\AnnuitiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuityCalculatorAccumulationHorizon**](AnnuitiesApi.md#annuityCalculatorAccumulationHorizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
[**annuityCalculatorAnnuityAmount**](AnnuitiesApi.md#annuityCalculatorAnnuityAmount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
[**annuityCalculatorDecumulationHorizon**](AnnuitiesApi.md#annuityCalculatorDecumulationHorizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
[**annuityCalculatorDepositAmount**](AnnuitiesApi.md#annuityCalculatorDepositAmount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
[**annuityCalculatorInitialBalance**](AnnuitiesApi.md#annuityCalculatorInitialBalance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
[**variableAnnuity**](AnnuitiesApi.md#variableAnnuity) | **POST** /variable_annuity | Variable Annuity


# **annuityCalculatorAccumulationHorizon**
> map[string,object] annuityCalculatorAccumulationHorizon($annuity_calculator_accumulation_horizon_request)

Annuity Calculator - Accumulation Horizon

Calculate the necessary fixed annuity contribution period

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_accumulation_horizon_request = new \com\hydrogen\proton\Model\AnnuityCalculatorAccumulationHorizonRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon

try {
    $result = $apiInstance->annuityCalculatorAccumulationHorizon($annuity_calculator_accumulation_horizon_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorAccumulationHorizon: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_accumulation_horizon_request** | [**\com\hydrogen\proton\Model\AnnuityCalculatorAccumulationHorizonRequest**](../Model/AnnuityCalculatorAccumulationHorizonRequest.md)| Request payload for Annuity Calculator - Accumulation Horizon |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **annuityCalculatorAnnuityAmount**
> map[string,object] annuityCalculatorAnnuityAmount($annuity_calculator_annuity_amount_request)

Annuity Calculator - Annuity Amount

Calculate the achievable fixed annuity amount

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_annuity_amount_request = new \com\hydrogen\proton\Model\AnnuityCalculatorAnnuityAmountRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorAnnuityAmountRequest | Request payload for Annuity Calculator - Annuity Amount

try {
    $result = $apiInstance->annuityCalculatorAnnuityAmount($annuity_calculator_annuity_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorAnnuityAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_annuity_amount_request** | [**\com\hydrogen\proton\Model\AnnuityCalculatorAnnuityAmountRequest**](../Model/AnnuityCalculatorAnnuityAmountRequest.md)| Request payload for Annuity Calculator - Annuity Amount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **annuityCalculatorDecumulationHorizon**
> map[string,object] annuityCalculatorDecumulationHorizon($annuity_calculator_decumulation_horizon_request)

Annuity Calculator - Decumulation Horizon

Calculate the achievable fixed annuity payout period

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_decumulation_horizon_request = new \com\hydrogen\proton\Model\AnnuityCalculatorDecumulationHorizonRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorDecumulationHorizonRequest | Request payload for Annuity Calculator - Decumulation Horizon

try {
    $result = $apiInstance->annuityCalculatorDecumulationHorizon($annuity_calculator_decumulation_horizon_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorDecumulationHorizon: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_decumulation_horizon_request** | [**\com\hydrogen\proton\Model\AnnuityCalculatorDecumulationHorizonRequest**](../Model/AnnuityCalculatorDecumulationHorizonRequest.md)| Request payload for Annuity Calculator - Decumulation Horizon |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **annuityCalculatorDepositAmount**
> map[string,object] annuityCalculatorDepositAmount($annuity_calculator_deposit_amount_request)

Annuity Calculator - Deposit Amount

Calculate the necessary periodic deposit amount for a fixed annuity

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_deposit_amount_request = new \com\hydrogen\proton\Model\AnnuityCalculatorDepositAmountRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorDepositAmountRequest | Request payload for Annuity Calculator - Deposit Amount

try {
    $result = $apiInstance->annuityCalculatorDepositAmount($annuity_calculator_deposit_amount_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorDepositAmount: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_deposit_amount_request** | [**\com\hydrogen\proton\Model\AnnuityCalculatorDepositAmountRequest**](../Model/AnnuityCalculatorDepositAmountRequest.md)| Request payload for Annuity Calculator - Deposit Amount |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **annuityCalculatorInitialBalance**
> map[string,object] annuityCalculatorInitialBalance($annuity_calculator_initial_balance_request)

Annuity Calculator - Initial Balance

Calculate the necessary initial balance for a fixed annuity

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_initial_balance_request = new \com\hydrogen\proton\Model\AnnuityCalculatorInitialBalanceRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorInitialBalanceRequest | Request payload for Annuity Calculator - Initial Balance

try {
    $result = $apiInstance->annuityCalculatorInitialBalance($annuity_calculator_initial_balance_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorInitialBalance: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_initial_balance_request** | [**\com\hydrogen\proton\Model\AnnuityCalculatorInitialBalanceRequest**](../Model/AnnuityCalculatorInitialBalanceRequest.md)| Request payload for Annuity Calculator - Initial Balance |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **variableAnnuity**
> map[string,object] variableAnnuity($variable_annuity_request)

Variable Annuity

Project the behavior of a variable annuity over time

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
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$variable_annuity_request = new \com\hydrogen\proton\Model\VariableAnnuityRequest(); // \com\hydrogen\proton\Model\VariableAnnuityRequest | Request payload for Variable Annuity

try {
    $result = $apiInstance->variableAnnuity($variable_annuity_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->variableAnnuity: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable_annuity_request** | [**\com\hydrogen\proton\Model\VariableAnnuityRequest**](../Model/VariableAnnuityRequest.md)| Request payload for Variable Annuity |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

