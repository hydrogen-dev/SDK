# com\hydrogen\nucleus\InsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInsuranceCoverageUsingPost**](InsuranceApi.md#createInsuranceCoverageUsingPost) | **POST** /insurance_coverage | Create a insurance coverage request
[**createInsuranceDiscountUsingPost**](InsuranceApi.md#createInsuranceDiscountUsingPost) | **POST** /insurance_discount | Create a insurance discount request
[**createInsuranceQuoteUsingPost**](InsuranceApi.md#createInsuranceQuoteUsingPost) | **POST** /insurance_quote | Create a insuranceQuote request
[**deleteInsuranceCoverageUsingDelete**](InsuranceApi.md#deleteInsuranceCoverageUsingDelete) | **DELETE** /insurance_coverage/{insurance_coverage_id} | Delete an insurance coverage request
[**deleteInsuranceDiscountUsingDelete**](InsuranceApi.md#deleteInsuranceDiscountUsingDelete) | **DELETE** /insurance_discount/{insurance_discount_id} | Delete an insurance discount request
[**deleteInsuranceQuoteUsingDelete**](InsuranceApi.md#deleteInsuranceQuoteUsingDelete) | **DELETE** /insurance_quote/{insurance_quote_id} | Delete a insuranceQuote request
[**getInsuranceCoverageAllUsingGet**](InsuranceApi.md#getInsuranceCoverageAllUsingGet) | **GET** /insurance_coverage | Get all insurance coverage request
[**getInsuranceCoverageUsingGet**](InsuranceApi.md#getInsuranceCoverageUsingGet) | **GET** /insurance_coverage/{insurance_coverage_id} | Get a insurance coverage request
[**getInsuranceDiscountAllUsingGet**](InsuranceApi.md#getInsuranceDiscountAllUsingGet) | **GET** /insurance_discount | Get all insurance discount request
[**getInsuranceDiscountUsingGet**](InsuranceApi.md#getInsuranceDiscountUsingGet) | **GET** /insurance_discount/{insurance_discount_id} | Get a insurance discount request
[**getInsuranceQuoteAllUsingGet**](InsuranceApi.md#getInsuranceQuoteAllUsingGet) | **GET** /insurance_quote | List all insuranceQuote requests
[**getInsuranceQuoteUsingGet**](InsuranceApi.md#getInsuranceQuoteUsingGet) | **GET** /insurance_quote/{insurance_quote_id} | Retrieve a insuranceQuote request
[**updateInsuranceCoverageUsingPut**](InsuranceApi.md#updateInsuranceCoverageUsingPut) | **PUT** /insurance_coverage/{insurance_coverage_id} | Update a insurance coverage request
[**updateInsuranceDiscountUsingPut**](InsuranceApi.md#updateInsuranceDiscountUsingPut) | **PUT** /insurance_discount/{insurance_discount_id} | Update an insurance discount
[**updateInsuranceQuoteUsingPut**](InsuranceApi.md#updateInsuranceQuoteUsingPut) | **PUT** /insurance_quote/{insurance_quote_id} | Update a insuranceQuote request


# **createInsuranceCoverageUsingPost**
> \com\hydrogen\nucleus\Model\InsuranceCoverage createInsuranceCoverageUsingPost($insurance_coverage)

Create a insurance coverage request

Create a new insurance coverage.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_coverage = new \com\hydrogen\nucleus\Model\InsuranceCoverage(); // \com\hydrogen\nucleus\Model\InsuranceCoverage | insuranceCoverage

try {
    $result = $apiInstance->createInsuranceCoverageUsingPost($insurance_coverage);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->createInsuranceCoverageUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**\com\hydrogen\nucleus\Model\InsuranceCoverage**](../Model/InsuranceCoverage.md)| insuranceCoverage |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceCoverage**](../Model/InsuranceCoverage.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createInsuranceDiscountUsingPost**
> \com\hydrogen\nucleus\Model\InsuranceDiscount createInsuranceDiscountUsingPost($insurance_discount)

Create a insurance discount request

Create a new insurance discount.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_discount = new \com\hydrogen\nucleus\Model\InsuranceDiscount(); // \com\hydrogen\nucleus\Model\InsuranceDiscount | insuranceDiscount

try {
    $result = $apiInstance->createInsuranceDiscountUsingPost($insurance_discount);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->createInsuranceDiscountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**\com\hydrogen\nucleus\Model\InsuranceDiscount**](../Model/InsuranceDiscount.md)| insuranceDiscount |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceDiscount**](../Model/InsuranceDiscount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createInsuranceQuoteUsingPost**
> \com\hydrogen\nucleus\Model\InsuranceQuote createInsuranceQuoteUsingPost($insurance_quote)

Create a insuranceQuote request

Create a new insuranceQuote request.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_quote = new \com\hydrogen\nucleus\Model\InsuranceQuote(); // \com\hydrogen\nucleus\Model\InsuranceQuote | insuranceQuote

try {
    $result = $apiInstance->createInsuranceQuoteUsingPost($insurance_quote);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->createInsuranceQuoteUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**\com\hydrogen\nucleus\Model\InsuranceQuote**](../Model/InsuranceQuote.md)| insuranceQuote |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceQuote**](../Model/InsuranceQuote.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteInsuranceCoverageUsingDelete**
> deleteInsuranceCoverageUsingDelete($insurance_coverage_id)

Delete an insurance coverage request

Delete an  insurance coverage.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_coverage_id = "insurance_coverage_id_example"; // string | UUID insurance_coverage_id

try {
    $apiInstance->deleteInsuranceCoverageUsingDelete($insurance_coverage_id);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->deleteInsuranceCoverageUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**string**](../Model/.md)| UUID insurance_coverage_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteInsuranceDiscountUsingDelete**
> deleteInsuranceDiscountUsingDelete($insurance_discount_id)

Delete an insurance discount request

Delete an  insurance discount.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_discount_id = "insurance_discount_id_example"; // string | UUID insurance_discount_id

try {
    $apiInstance->deleteInsuranceDiscountUsingDelete($insurance_discount_id);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->deleteInsuranceDiscountUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**string**](../Model/.md)| UUID insurance_discount_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteInsuranceQuoteUsingDelete**
> deleteInsuranceQuoteUsingDelete($insurance_quote_id)

Delete a insuranceQuote request

Permanently delete a insuranceQuote request.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_quote_id = "insurance_quote_id_example"; // string | UUID insurance_quote_id

try {
    $apiInstance->deleteInsuranceQuoteUsingDelete($insurance_quote_id);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->deleteInsuranceQuoteUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote_id** | [**string**](../Model/.md)| UUID insurance_quote_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceCoverageAllUsingGet**
> \com\hydrogen\nucleus\Model\PageInsuranceCoverage_ getInsuranceCoverageAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

Get all insurance coverage request

Get all new insurance coverage.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
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
    $result = $apiInstance->getInsuranceCoverageAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceCoverageAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageInsuranceCoverage_**](../Model/PageInsuranceCoverage_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceCoverageUsingGet**
> \com\hydrogen\nucleus\Model\InsuranceCoverage getInsuranceCoverageUsingGet($insurance_coverage_id, $currency_conversion)

Get a insurance coverage request

Get a new insurance coverage.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_coverage_id = "insurance_coverage_id_example"; // string | UUID insurance_coverage_id
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getInsuranceCoverageUsingGet($insurance_coverage_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceCoverageUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**string**](../Model/.md)| UUID insurance_coverage_id |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceCoverage**](../Model/InsuranceCoverage.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceDiscountAllUsingGet**
> \com\hydrogen\nucleus\Model\PageInsuranceDiscount_ getInsuranceDiscountAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

Get all insurance discount request

Get all new insurance discount.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
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
    $result = $apiInstance->getInsuranceDiscountAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceDiscountAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageInsuranceDiscount_**](../Model/PageInsuranceDiscount_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceDiscountUsingGet**
> \com\hydrogen\nucleus\Model\InsuranceDiscount getInsuranceDiscountUsingGet($insurance_discount_id, $currency_conversion)

Get a insurance discount request

Get a new insurance discount.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_discount_id = "insurance_discount_id_example"; // string | UUID insurance_discount_id
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getInsuranceDiscountUsingGet($insurance_discount_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceDiscountUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**string**](../Model/.md)| UUID insurance_discount_id |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceDiscount**](../Model/InsuranceDiscount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceQuoteAllUsingGet**
> \com\hydrogen\nucleus\Model\PageInsuranceQuote_ getInsuranceQuoteAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

List all insuranceQuote requests

Get the information for all insuranceQuote requests.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
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
    $result = $apiInstance->getInsuranceQuoteAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceQuoteAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageInsuranceQuote_**](../Model/PageInsuranceQuote_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInsuranceQuoteUsingGet**
> \com\hydrogen\nucleus\Model\InsuranceQuote getInsuranceQuoteUsingGet($insurance_quote_id, $currency_conversion)

Retrieve a insuranceQuote request

Retrieve the information for a insuranceQuote request.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_quote_id = "insurance_quote_id_example"; // string | UUID insurance_quote_id
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getInsuranceQuoteUsingGet($insurance_quote_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->getInsuranceQuoteUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote_id** | [**string**](../Model/.md)| UUID insurance_quote_id |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceQuote**](../Model/InsuranceQuote.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInsuranceCoverageUsingPut**
> \com\hydrogen\nucleus\Model\InsuranceCoverage updateInsuranceCoverageUsingPut($insurance_coverage, $insurance_coverage_id)

Update a insurance coverage request

Update a new insurance coverage.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_coverage = new \com\hydrogen\nucleus\Model\InsuranceCoverage(); // \com\hydrogen\nucleus\Model\InsuranceCoverage | insurance_coverage
$insurance_coverage_id = "insurance_coverage_id_example"; // string | UUID insurance_coverage_id

try {
    $result = $apiInstance->updateInsuranceCoverageUsingPut($insurance_coverage, $insurance_coverage_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->updateInsuranceCoverageUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**\com\hydrogen\nucleus\Model\InsuranceCoverage**](../Model/InsuranceCoverage.md)| insurance_coverage |
 **insurance_coverage_id** | [**string**](../Model/.md)| UUID insurance_coverage_id |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceCoverage**](../Model/InsuranceCoverage.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInsuranceDiscountUsingPut**
> \com\hydrogen\nucleus\Model\InsuranceDiscount updateInsuranceDiscountUsingPut($insurance_discount, $insurance_discount_id)

Update an insurance discount

Update an new insurance .

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_discount = new \com\hydrogen\nucleus\Model\InsuranceDiscount(); // \com\hydrogen\nucleus\Model\InsuranceDiscount | insurance_discount
$insurance_discount_id = "insurance_discount_id_example"; // string | UUID insurance_discount_id

try {
    $result = $apiInstance->updateInsuranceDiscountUsingPut($insurance_discount, $insurance_discount_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->updateInsuranceDiscountUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**\com\hydrogen\nucleus\Model\InsuranceDiscount**](../Model/InsuranceDiscount.md)| insurance_discount |
 **insurance_discount_id** | [**string**](../Model/.md)| UUID insurance_discount_id |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceDiscount**](../Model/InsuranceDiscount.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInsuranceQuoteUsingPut**
> \com\hydrogen\nucleus\Model\InsuranceQuote updateInsuranceQuoteUsingPut($insurance_quote, $insurance_quote_id)

Update a insuranceQuote request

Update the information for a insuranceQuote request.

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
$apiInstance = new com\hydrogen\nucleus\Api\InsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$insurance_quote = new \com\hydrogen\nucleus\Model\InsuranceQuote(); // \com\hydrogen\nucleus\Model\InsuranceQuote | insurance_quote
$insurance_quote_id = "insurance_quote_id_example"; // string | UUID insurance_quote_id

try {
    $result = $apiInstance->updateInsuranceQuoteUsingPut($insurance_quote, $insurance_quote_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InsuranceApi->updateInsuranceQuoteUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**\com\hydrogen\nucleus\Model\InsuranceQuote**](../Model/InsuranceQuote.md)| insurance_quote |
 **insurance_quote_id** | [**string**](../Model/.md)| UUID insurance_quote_id |

### Return type

[**\com\hydrogen\nucleus\Model\InsuranceQuote**](../Model/InsuranceQuote.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

