# com\hydrogen\nucleus\BusinessApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBusinessUsingPost**](BusinessApi.md#createBusinessUsingPost) | **POST** /business | Create a business
[**deleteBusinessUsingDelete**](BusinessApi.md#deleteBusinessUsingDelete) | **DELETE** /business/{business_id} | Delete a business
[**getBusinessAllUsingGet**](BusinessApi.md#getBusinessAllUsingGet) | **GET** /business | List all business
[**getBusinessAssetSizeUsingGet**](BusinessApi.md#getBusinessAssetSizeUsingGet) | **GET** /business/{business_id}/asset_size | List all business asset sizes
[**getBusinessClientTransactionAllUsingGet**](BusinessApi.md#getBusinessClientTransactionAllUsingGet) | **GET** /business/{business_id}/transaction | List all business transactions
[**getBusinessHoldingUsingGet**](BusinessApi.md#getBusinessHoldingUsingGet) | **GET** /business/{business_id}/holding | List all business holdings
[**getBusinessUsingGet**](BusinessApi.md#getBusinessUsingGet) | **GET** /business/{business_id} | Retrieve a business
[**updateBusinessUsingPut**](BusinessApi.md#updateBusinessUsingPut) | **PUT** /business/{business_id} | Update a business


# **createBusinessUsingPost**
> \com\hydrogen\nucleus\Model\Business createBusinessUsingPost($business_request)

Create a business

Create a new business, or register a new business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_request = new \com\hydrogen\nucleus\Model\Business(); // \com\hydrogen\nucleus\Model\Business | businessRequest

try {
    $result = $apiInstance->createBusinessUsingPost($business_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->createBusinessUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**\com\hydrogen\nucleus\Model\Business**](../Model/Business.md)| businessRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Business**](../Model/Business.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBusinessUsingDelete**
> deleteBusinessUsingDelete($business_id)

Delete a business

Permanently delete a business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = "business_id_example"; // string | UUID business_id

try {
    $apiInstance->deleteBusinessUsingDelete($business_id);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->deleteBusinessUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**string**](../Model/.md)| UUID business_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBusinessAllUsingGet**
> \com\hydrogen\nucleus\Model\PageBusiness_ getBusinessAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all business

Get details for all business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getBusinessAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->getBusinessAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageBusiness_**](../Model/PageBusiness_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBusinessAssetSizeUsingGet**
> \com\hydrogen\nucleus\Model\AvailableDateDoubleVO[] getBusinessAssetSizeUsingGet($business_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date)

List all business asset sizes

Get a list of asset sizes per date for a business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = "business_id_example"; // string | UUID business_id
$currency_conversion = "currency_conversion_example"; // string | Currency Code
$end_date = new \DateTime("null"); // \DateTime | end date
$exclude_subledger = false; // bool | exclude_subledger
$get_latest = true; // bool | true or false
$sort_type = "sort_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
$start_date = new \DateTime("null"); // \DateTime | start date

try {
    $result = $apiInstance->getBusinessAssetSizeUsingGet($business_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->getBusinessAssetSizeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**string**](../Model/.md)| UUID business_id |
 **currency_conversion** | **string**| Currency Code | [optional]
 **end_date** | **\DateTime**| end date | [optional] [default to null]
 **exclude_subledger** | **bool**| exclude_subledger | [optional] [default to false]
 **get_latest** | **bool**| true or false | [optional]
 **sort_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **start_date** | **\DateTime**| start date | [optional] [default to null]

### Return type

[**\com\hydrogen\nucleus\Model\AvailableDateDoubleVO[]**](../Model/AvailableDateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBusinessClientTransactionAllUsingGet**
> \com\hydrogen\nucleus\Model\PagePortfolioTransaction_ getBusinessClientTransactionAllUsingGet($business_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date)

List all business transactions

Get the information for all transactions under all client registered with your business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = "business_id_example"; // string | UUID business_id
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | currency_conversion
$end_date = "end_date_example"; // string | end date - yyyy-mm-dd
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = "start_date_example"; // string | start date - yyyy-mm-dd

try {
    $result = $apiInstance->getBusinessClientTransactionAllUsingGet($business_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->getBusinessClientTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**string**](../Model/.md)| UUID business_id |
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **string**| currency_conversion | [optional]
 **end_date** | **string**| end date - yyyy-mm-dd | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **string**| start date - yyyy-mm-dd | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\PagePortfolioTransaction_**](../Model/PagePortfolioTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBusinessHoldingUsingGet**
> \com\hydrogen\nucleus\Model\PortfolioHoldingAgg[] getBusinessHoldingUsingGet($business_id, $currency_conversion, $end_date, $get_latest, $start_date)

List all business holdings

Get a list of holdings for a business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = "business_id_example"; // string | UUID business_id
$currency_conversion = "currency_conversion_example"; // string | Currency Code
$end_date = "end_date_example"; // string | end date - yyyy-mm-dd
$get_latest = true; // bool | true or false
$start_date = "start_date_example"; // string | start date - yyyy-mm-dd

try {
    $result = $apiInstance->getBusinessHoldingUsingGet($business_id, $currency_conversion, $end_date, $get_latest, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->getBusinessHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**string**](../Model/.md)| UUID business_id |
 **currency_conversion** | **string**| Currency Code | [optional]
 **end_date** | **string**| end date - yyyy-mm-dd | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **start_date** | **string**| start date - yyyy-mm-dd | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\PortfolioHoldingAgg[]**](../Model/PortfolioHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBusinessUsingGet**
> \com\hydrogen\nucleus\Model\Business getBusinessUsingGet($business_id)

Retrieve a business

Retrieve the information for a business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = "business_id_example"; // string | UUID business_id

try {
    $result = $apiInstance->getBusinessUsingGet($business_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->getBusinessUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**string**](../Model/.md)| UUID business_id |

### Return type

[**\com\hydrogen\nucleus\Model\Business**](../Model/Business.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBusinessUsingPut**
> \com\hydrogen\nucleus\Model\Business updateBusinessUsingPut($business, $business_id)

Update a business

Update the information for a business.

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

$apiInstance = new com\hydrogen\nucleus\Api\BusinessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business = new \stdClass; // object | business
$business_id = "business_id_example"; // string | UUID business_id

try {
    $result = $apiInstance->updateBusinessUsingPut($business, $business_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessApi->updateBusinessUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **object**| business |
 **business_id** | [**string**](../Model/.md)| UUID business_id |

### Return type

[**\com\hydrogen\nucleus\Model\Business**](../Model/Business.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

