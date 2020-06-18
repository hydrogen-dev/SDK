# com\hydrogen\integration\KYCApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKYCUsingPost**](KYCApi.md#createKYCUsingPost) | **POST** /kyc | Do kyc for the client.
[**getKYCStatusUsingGet**](KYCApi.md#getKYCStatusUsingGet) | **GET** /kyc_status/{nucleus_client_id} | Fetch kyc_status for the given nucleus_client_id


# **createKYCUsingPost**
> \com\hydrogen\integration\Model\KycResponseVo createKYCUsingPost($kyc_request_co)

Do kyc for the client.

Do kyc for the client.

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KYCApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$kyc_request_co = new \com\hydrogen\integration\Model\KycRequestCO(); // \com\hydrogen\integration\Model\KycRequestCO | kycRequestCO

try {
    $result = $apiInstance->createKYCUsingPost($kyc_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KYCApi->createKYCUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kyc_request_co** | [**\com\hydrogen\integration\Model\KycRequestCO**](../Model/KycRequestCO.md)| kycRequestCO |

### Return type

[**\com\hydrogen\integration\Model\KycResponseVo**](../Model/KycResponseVo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getKYCStatusUsingGet**
> \com\hydrogen\integration\Model\KycResponseVo[] getKYCStatusUsingGet($nucleus_client_id, $get_latest, $kyc_type, $product)

Fetch kyc_status for the given nucleus_client_id

Fetch kyc_status for the given nucleus_client_id

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\KYCApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$get_latest = false; // bool | get_latest
$kyc_type = "all"; // string | kyc_type
$product = "atom"; // string | product

try {
    $result = $apiInstance->getKYCStatusUsingGet($nucleus_client_id, $get_latest, $kyc_type, $product);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KYCApi->getKYCStatusUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |
 **get_latest** | **bool**| get_latest | [optional] [default to false]
 **kyc_type** | **string**| kyc_type | [optional] [default to all]
 **product** | **string**| product | [optional] [default to atom]

### Return type

[**\com\hydrogen\integration\Model\KycResponseVo[]**](../Model/KycResponseVo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

