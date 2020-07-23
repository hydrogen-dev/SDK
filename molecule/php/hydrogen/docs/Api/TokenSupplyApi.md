# com\hydrogen\molecule\TokenSupplyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenSupplyAllUsingGet**](TokenSupplyApi.md#getTokenSupplyAllUsingGet) | **GET** /token_supply | Fetch Token Supply record list
[**getTokenSupplyUsingGet**](TokenSupplyApi.md#getTokenSupplyUsingGet) | **GET** /token_supply/{token_supply_id} | Fetch Token Supply details


# **getTokenSupplyAllUsingGet**
> \com\hydrogen\molecule\Model\PageTokenSupplyResponse_ getTokenSupplyAllUsingGet($token_id, $page, $size, $order_by, $ascending, $get_latest)

Fetch Token Supply record list

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\TokenSupplyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_id = "token_id_example"; // string | To filter response Token Supply list by Token ID
$page = 56; // int | To filter response Token Supply list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getTokenSupplyAllUsingGet($token_id, $page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenSupplyApi->getTokenSupplyAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**string**](../Model/.md)| To filter response Token Supply list by Token ID | [optional]
 **page** | **int**| To filter response Token Supply list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageTokenSupplyResponse_**](../Model/PageTokenSupplyResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTokenSupplyUsingGet**
> \com\hydrogen\molecule\Model\TokenSupplyResponse getTokenSupplyUsingGet($token_supply_id)

Fetch Token Supply details

### Example
```php
<?php
require_once('../vendor/autoload.php');

try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\molecule\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\molecule\Api\TokenSupplyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_supply_id = "token_supply_id_example"; // string | Token Supply ID

try {
    $result = $apiInstance->getTokenSupplyUsingGet($token_supply_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenSupplyApi->getTokenSupplyUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_supply_id** | [**string**](../Model/.md)| Token Supply ID |

### Return type

[**\com\hydrogen\molecule\Model\TokenSupplyResponse**](../Model/TokenSupplyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

