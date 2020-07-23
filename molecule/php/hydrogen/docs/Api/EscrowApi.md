# com\hydrogen\molecule\EscrowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEscrowUsingPost**](EscrowApi.md#createEscrowUsingPost) | **POST** /escrow | Create a new Escrow
[**getEscrowAllUsingGet**](EscrowApi.md#getEscrowAllUsingGet) | **GET** /escrow | List all Escrow
[**getEscrowUsingGet**](EscrowApi.md#getEscrowUsingGet) | **GET** /escrow/{escrow_id} | Fetch Escrow


# **createEscrowUsingPost**
> \com\hydrogen\molecule\Model\EscrowResponse createEscrowUsingPost($escrow_params)

Create a new Escrow

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
$apiInstance = new com\hydrogen\molecule\Api\EscrowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$escrow_params = new \com\hydrogen\molecule\Model\EscrowParams(); // \com\hydrogen\molecule\Model\EscrowParams | It enables a user to create a escrow

try {
    $result = $apiInstance->createEscrowUsingPost($escrow_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowApi->createEscrowUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_params** | [**\com\hydrogen\molecule\Model\EscrowParams**](../Model/EscrowParams.md)| It enables a user to create a escrow |

### Return type

[**\com\hydrogen\molecule\Model\EscrowResponse**](../Model/EscrowResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getEscrowAllUsingGet**
> \com\hydrogen\molecule\Model\PageEscrowResponse_ getEscrowAllUsingGet($page, $size, $order_by, $ascending, $get_latest)

List all Escrow

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
$apiInstance = new com\hydrogen\molecule\Api\EscrowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page = 56; // int | To filter response Escrow list by page number
$size = 56; // int | Number of records per page
$order_by = "order_by_example"; // string | Field to sort record list
$ascending = true; // bool | Sorting order
$get_latest = true; // bool | To fetch latest (one) record

try {
    $result = $apiInstance->getEscrowAllUsingGet($page, $size, $order_by, $ascending, $get_latest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowApi->getEscrowAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Escrow list by page number | [optional]
 **size** | **int**| Number of records per page | [optional]
 **order_by** | **string**| Field to sort record list | [optional]
 **ascending** | **bool**| Sorting order | [optional]
 **get_latest** | **bool**| To fetch latest (one) record | [optional]

### Return type

[**\com\hydrogen\molecule\Model\PageEscrowResponse_**](../Model/PageEscrowResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getEscrowUsingGet**
> \com\hydrogen\molecule\Model\EscrowResponse getEscrowUsingGet($escrow_id)

Fetch Escrow

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
$apiInstance = new com\hydrogen\molecule\Api\EscrowApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$escrow_id = "escrow_id_example"; // string | Escrow ID

try {
    $result = $apiInstance->getEscrowUsingGet($escrow_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EscrowApi->getEscrowUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_id** | [**string**](../Model/.md)| Escrow ID |

### Return type

[**\com\hydrogen\molecule\Model\EscrowResponse**](../Model/EscrowResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

