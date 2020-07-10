# com\hydrogen\integration\IAVApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIAVUsingPost**](IAVApi.md#createIAVUsingPost) | **POST** /iav | Instant Account Verification of an account.
[**getIAVUsingGet**](IAVApi.md#getIAVUsingGet) | **GET** /iav/{nucleus_bank_link_id} | Get verified account based on id.


# **createIAVUsingPost**
> \com\hydrogen\integration\Model\IavResponseVo createIAVUsingPost($iav_request_co)

Instant Account Verification of an account.

Endpoint is used to verify account.

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
$apiInstance = new com\hydrogen\integration\Api\IAVApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$iav_request_co = new \com\hydrogen\integration\Model\IavRequestCO(); IavRequestCO

try {
    $result = $apiInstance->createIAVUsingPost($iav_request_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IAVApi->createIAVUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iav_request_co** | [**\com\hydrogen\integration\Model\IavRequestCO**](../Model/IavRequestCO.md)| iavRequestCO |

### Return type

[**\com\hydrogen\integration\Model\IavResponseVo**](../Model/IavResponseVo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getIAVUsingGet**
> \com\hydrogen\integration\Model\IavResponseVo getIAVUsingGet($nucleus_bank_link_id)

Get verified account based on id.

Get verified account based on id.

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
$apiInstance = new com\hydrogen\integration\Api\IAVApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_bank_link_id = "nucleus_bank_link_id_example"; // string | nucleus_bank_link_id

try {
    $result = $apiInstance->getIAVUsingGet($nucleus_bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IAVApi->getIAVUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**string**](../Model/.md)| nucleus_bank_link_id |

### Return type

[**\com\hydrogen\integration\Model\IavResponseVo**](../Model/IavResponseVo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

