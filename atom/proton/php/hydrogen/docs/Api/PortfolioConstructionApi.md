# com\hydrogen\proton\PortfolioConstructionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mvo**](PortfolioConstructionApi.md#mvo) | **POST** /mvo | MVO


# **mvo**
> map[string,object] mvo($mvo_request)

MVO

Run a mean-variance optimization for a group of potential investments

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\PortfolioConstructionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mvo_request = new \com\hydrogen\proton\Model\MvoRequest(); // \com\hydrogen\proton\Model\MvoRequest | Request payload for MVO

try {
    $result = $apiInstance->mvo($mvo_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioConstructionApi->mvo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mvo_request** | [**\com\hydrogen\proton\Model\MvoRequest**](../Model/MvoRequest.md)| Request payload for MVO |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

