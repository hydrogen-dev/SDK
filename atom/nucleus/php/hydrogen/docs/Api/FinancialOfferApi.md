# com\hydrogen\FinancialOfferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialOfferUsingPost**](FinancialOfferApi.md#createFinancialOfferUsingPost) | **POST** /financial_offer | Create a comparison request
[**deleteFinancialOfferUsingDelete**](FinancialOfferApi.md#deleteFinancialOfferUsingDelete) | **DELETE** /financial_offer/{financial_offer_id} | Delete a comparison request
[**getFinancialOfferAllUsingGet**](FinancialOfferApi.md#getFinancialOfferAllUsingGet) | **GET** /financial_offer | List all comparison requests
[**getFinancialOfferUsingGet**](FinancialOfferApi.md#getFinancialOfferUsingGet) | **GET** /financial_offer/{financial_offer_id} | Retrieve a comparison request
[**updateFinancialOfferUsingPut**](FinancialOfferApi.md#updateFinancialOfferUsingPut) | **PUT** /financial_offer/{financial_offer_id} | Update a comparison request


# **createFinancialOfferUsingPost**
> \com\hydrogen\Model\FinancialOffer createFinancialOfferUsingPost($financial_offer)

Create a comparison request

Create a new comparison request.

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
$apiInstance = new com\hydrogen\Api\FinancialOfferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_offer = new \com\hydrogen\Model\FinancialOffer(); // \com\hydrogen\Model\FinancialOffer | financialOffer

try {
    $result = $apiInstance->createFinancialOfferUsingPost($financial_offer);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialOfferApi->createFinancialOfferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**\com\hydrogen\Model\FinancialOffer**](../Model/FinancialOffer.md)| financialOffer |

### Return type

[**\com\hydrogen\Model\FinancialOffer**](../Model/FinancialOffer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteFinancialOfferUsingDelete**
> deleteFinancialOfferUsingDelete($financial_offer, $financial_offer_id)

Delete a comparison request

Permanently delete a comparison request.

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
$apiInstance = new com\hydrogen\Api\FinancialOfferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_offer = "financial_offer_example"; // string | UUID financial_offer_id
$financial_offer_id = "financial_offer_id_example"; // string | financial_offer_id

try {
    $apiInstance->deleteFinancialOfferUsingDelete($financial_offer, $financial_offer_id);
} catch (Exception $e) {
    echo 'Exception when calling FinancialOfferApi->deleteFinancialOfferUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**string**](../Model/.md)| UUID financial_offer_id |
 **financial_offer_id** | [**string**](../Model/.md)| financial_offer_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFinancialOfferAllUsingGet**
> \com\hydrogen\Model\PageFinancialOffer_ getFinancialOfferAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all comparison requests

Get the information for all comparison requests.

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
$apiInstance = new com\hydrogen\Api\FinancialOfferApi(
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
    $result = $apiInstance->getFinancialOfferAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialOfferApi->getFinancialOfferAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageFinancialOffer_**](../Model/PageFinancialOffer_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFinancialOfferUsingGet**
> \com\hydrogen\Model\FinancialOffer getFinancialOfferUsingGet($financial_offer, $financial_offer_id)

Retrieve a comparison request

Retrieve the information for a comparison request.

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
$apiInstance = new com\hydrogen\Api\FinancialOfferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_offer = "financial_offer_example"; // string | UUID financial_offer_id
$financial_offer_id = "financial_offer_id_example"; // string | financial_offer_id

try {
    $result = $apiInstance->getFinancialOfferUsingGet($financial_offer, $financial_offer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialOfferApi->getFinancialOfferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**string**](../Model/.md)| UUID financial_offer_id |
 **financial_offer_id** | [**string**](../Model/.md)| financial_offer_id |

### Return type

[**\com\hydrogen\Model\FinancialOffer**](../Model/FinancialOffer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateFinancialOfferUsingPut**
> \com\hydrogen\Model\FinancialOffer updateFinancialOfferUsingPut($financial_offer, $financial_offer_id)

Update a comparison request

Update the information for a comparison request.

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
$apiInstance = new com\hydrogen\Api\FinancialOfferApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$financial_offer = new \com\hydrogen\Model\FinancialOffer(); // \com\hydrogen\Model\FinancialOffer | financial_offer
$financial_offer_id = "financial_offer_id_example"; // string | UUID financial_offer_id

try {
    $result = $apiInstance->updateFinancialOfferUsingPut($financial_offer, $financial_offer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FinancialOfferApi->updateFinancialOfferUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**\com\hydrogen\Model\FinancialOffer**](../Model/FinancialOffer.md)| financial_offer |
 **financial_offer_id** | [**string**](../Model/.md)| UUID financial_offer_id |

### Return type

[**\com\hydrogen\Model\FinancialOffer**](../Model/FinancialOffer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

