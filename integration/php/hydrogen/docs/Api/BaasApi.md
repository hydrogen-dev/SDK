# com\hydrogen\integration\BaasApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBaasAccountUsingPost**](BaasApi.md#createBaasAccountUsingPost) | **POST** /baas/account | create a Baas account
[**createBaasBusinessUsingPost**](BaasApi.md#createBaasBusinessUsingPost) | **POST** /baas/business | Create a Baas Business
[**createBaasClientUsingPost**](BaasApi.md#createBaasClientUsingPost) | **POST** /baas/client | Create a Baas Client
[**createBaasSubAccountUsingPost**](BaasApi.md#createBaasSubAccountUsingPost) | **POST** /baas/subaccount | create a Baas subaccount
[**getBaasAccountStatementUsingGet**](BaasApi.md#getBaasAccountStatementUsingGet) | **GET** /baas/statement/{nucleus_account_id} | Get a Baas account statement
[**getBaasPortfolioBalanceUsingGet**](BaasApi.md#getBaasPortfolioBalanceUsingGet) | **GET** /baas/balance/{nucleus_portfolio_id} | Get a Baas portfolio balance
[**getBaasPortfolioTransactionUsingGet**](BaasApi.md#getBaasPortfolioTransactionUsingGet) | **GET** /baas/transaction/{nucleus_portfolio_id} | Get a Baas portfolio transaction
[**updateBaasBusinessUsingPut**](BaasApi.md#updateBaasBusinessUsingPut) | **PUT** /baas/business/{nucleus_business_id} | Update a Baas business
[**updateBaasClientUsingPut**](BaasApi.md#updateBaasClientUsingPut) | **PUT** /baas/client/{nucleus_client_id} | Update a Baas client


# **createBaasAccountUsingPost**
> \com\hydrogen\integration\Model\BaasAccountVO createBaasAccountUsingPost($baas_account_co)

create a Baas account

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$baas_account_co = new \com\hydrogen\integration\Model\BaasAccountCO(); // \com\hydrogen\integration\Model\BaasAccountCO | baasAccountCO

try {
    $result = $apiInstance->createBaasAccountUsingPost($baas_account_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->createBaasAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_account_co** | [**\com\hydrogen\integration\Model\BaasAccountCO**](../Model/BaasAccountCO.md)| baasAccountCO |

### Return type

[**\com\hydrogen\integration\Model\BaasAccountVO**](../Model/BaasAccountVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBaasBusinessUsingPost**
> \com\hydrogen\integration\Model\BaasBusinessVO createBaasBusinessUsingPost($baas_business_co)

Create a Baas Business

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$baas_business_co = new \com\hydrogen\integration\Model\CreateBaasBusinessCO(); // \com\hydrogen\integration\Model\CreateBaasBusinessCO | baasBusinessCO

try {
    $result = $apiInstance->createBaasBusinessUsingPost($baas_business_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->createBaasBusinessUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_business_co** | [**\com\hydrogen\integration\Model\CreateBaasBusinessCO**](../Model/CreateBaasBusinessCO.md)| baasBusinessCO |

### Return type

[**\com\hydrogen\integration\Model\BaasBusinessVO**](../Model/BaasBusinessVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBaasClientUsingPost**
> \com\hydrogen\integration\Model\BaasClientVO createBaasClientUsingPost($baas_client_co)

Create a Baas Client

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$baas_client_co = new \com\hydrogen\integration\Model\CreateBaasClientCO(); // \com\hydrogen\integration\Model\CreateBaasClientCO | baasClientCO

try {
    $result = $apiInstance->createBaasClientUsingPost($baas_client_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->createBaasClientUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_client_co** | [**\com\hydrogen\integration\Model\CreateBaasClientCO**](../Model/CreateBaasClientCO.md)| baasClientCO |

### Return type

[**\com\hydrogen\integration\Model\BaasClientVO**](../Model/BaasClientVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createBaasSubAccountUsingPost**
> \com\hydrogen\integration\Model\BaasSubAccountVO createBaasSubAccountUsingPost($baas_sub_account_co)

create a Baas subaccount

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$baas_sub_account_co = new \com\hydrogen\integration\Model\BaasSubAccountCO(); // \com\hydrogen\integration\Model\BaasSubAccountCO | baasSubAccountCO

try {
    $result = $apiInstance->createBaasSubAccountUsingPost($baas_sub_account_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->createBaasSubAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_sub_account_co** | [**\com\hydrogen\integration\Model\BaasSubAccountCO**](../Model/BaasSubAccountCO.md)| baasSubAccountCO |

### Return type

[**\com\hydrogen\integration\Model\BaasSubAccountVO**](../Model/BaasSubAccountVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBaasAccountStatementUsingGet**
> \com\hydrogen\integration\Model\BaasStatementsVO getBaasAccountStatementUsingGet($end_date, $nucleus_account_id, $start_date, $statement_type)

Get a Baas account statement

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$nucleus_account_id = "nucleus_account_id_example"; // string | nucleus_account_id
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date
$statement_type = "statement_type_example"; // string | statement_type

try {
    $result = $apiInstance->getBaasAccountStatementUsingGet($end_date, $nucleus_account_id, $start_date, $statement_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->getBaasAccountStatementUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **\DateTime**| end_date |
 **nucleus_account_id** | [**string**](../Model/.md)| nucleus_account_id |
 **start_date** | **\DateTime**| start_date |
 **statement_type** | **string**| statement_type | [optional]

### Return type

[**\com\hydrogen\integration\Model\BaasStatementsVO**](../Model/BaasStatementsVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBaasPortfolioBalanceUsingGet**
> \com\hydrogen\integration\Model\BaasBalanceVO getBaasPortfolioBalanceUsingGet($nucleus_portfolio_id, $end_date, $start_date)

Get a Baas portfolio balance

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getBaasPortfolioBalanceUsingGet($nucleus_portfolio_id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->getBaasPortfolioBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\BaasBalanceVO**](../Model/BaasBalanceVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBaasPortfolioTransactionUsingGet**
> \com\hydrogen\integration\Model\BaasTransactionsVO getBaasPortfolioTransactionUsingGet($nucleus_portfolio_id, $end_date, $start_date)

Get a Baas portfolio transaction

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_portfolio_id = "nucleus_portfolio_id_example"; // string | nucleus_portfolio_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end_date
$start_date = new \DateTime("2013-10-20"); // \DateTime | start_date

try {
    $result = $apiInstance->getBaasPortfolioTransactionUsingGet($nucleus_portfolio_id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->getBaasPortfolioTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**string**](../Model/.md)| nucleus_portfolio_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\BaasTransactionsVO**](../Model/BaasTransactionsVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBaasBusinessUsingPut**
> \com\hydrogen\integration\Model\BaasBusinessVO updateBaasBusinessUsingPut($nucleus_business_id, $baas_business_co)

Update a Baas business

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_business_id = "nucleus_business_id_example"; // string | nucleus_business_id
$baas_business_co = new \com\hydrogen\integration\Model\UpdateBaasBusinessCO(); // \com\hydrogen\integration\Model\UpdateBaasBusinessCO | baasBusinessCO

try {
    $result = $apiInstance->updateBaasBusinessUsingPut($nucleus_business_id, $baas_business_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->updateBaasBusinessUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_business_id** | [**string**](../Model/.md)| nucleus_business_id |
 **baas_business_co** | [**\com\hydrogen\integration\Model\UpdateBaasBusinessCO**](../Model/UpdateBaasBusinessCO.md)| baasBusinessCO | [optional]

### Return type

[**\com\hydrogen\integration\Model\BaasBusinessVO**](../Model/BaasBusinessVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBaasClientUsingPut**
> \com\hydrogen\integration\Model\BaasClientVO updateBaasClientUsingPut($nucleus_client_id, $baas_client_co)

Update a Baas client

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\BaasApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$baas_client_co = new \com\hydrogen\integration\Model\UpdateBaasClientCO(); // \com\hydrogen\integration\Model\UpdateBaasClientCO | baasClientCO

try {
    $result = $apiInstance->updateBaasClientUsingPut($nucleus_client_id, $baas_client_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BaasApi->updateBaasClientUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |
 **baas_client_co** | [**\com\hydrogen\integration\Model\UpdateBaasClientCO**](../Model/UpdateBaasClientCO.md)| baasClientCO | [optional]

### Return type

[**\com\hydrogen\integration\Model\BaasClientVO**](../Model/BaasClientVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

