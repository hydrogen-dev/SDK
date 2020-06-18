# com\hydrogen\integration\UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenExchangeUsingPost**](UtilsApi.md#createTokenExchangeUsingPost) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**createUserUsingPost**](UtilsApi.md#createUserUsingPost) | **POST** /user | Create user in vendor
[**getWidgetLinkUsingGet**](UtilsApi.md#getWidgetLinkUsingGet) | **GET** /widget_link/{nucleus_client_id} | Retrieve widget link


# **createTokenExchangeUsingPost**
> \com\hydrogen\integration\Model\ExchangePublicTokenVO createTokenExchangeUsingPost($exchange_token_co)

Retrieve token based on certain vendor specific value

Retrieve the token.

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
$apiInstance = new com\hydrogen\integration\Api\UtilsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$exchange_token_co = new \com\hydrogen\integration\Model\ExchangeTokenCO(); // \com\hydrogen\integration\Model\ExchangeTokenCO | exchangeTokenCO

try {
    $result = $apiInstance->createTokenExchangeUsingPost($exchange_token_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UtilsApi->createTokenExchangeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange_token_co** | [**\com\hydrogen\integration\Model\ExchangeTokenCO**](../Model/ExchangeTokenCO.md)| exchangeTokenCO |

### Return type

[**\com\hydrogen\integration\Model\ExchangePublicTokenVO**](../Model/ExchangePublicTokenVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createUserUsingPost**
> \com\hydrogen\integration\Model\UserResponseVO createUserUsingPost($create_user_request)

Create user in vendor

Create user in vendor.

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
$apiInstance = new com\hydrogen\integration\Api\UtilsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_user_request = new \com\hydrogen\integration\Model\CreateUserRequest(); // \com\hydrogen\integration\Model\CreateUserRequest | createUserRequest

try {
    $result = $apiInstance->createUserUsingPost($create_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UtilsApi->createUserUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_user_request** | [**\com\hydrogen\integration\Model\CreateUserRequest**](../Model/CreateUserRequest.md)| createUserRequest |

### Return type

[**\com\hydrogen\integration\Model\UserResponseVO**](../Model/UserResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWidgetLinkUsingGet**
> \com\hydrogen\integration\Model\WidgetUrlVO getWidgetLinkUsingGet($nucleus_client_id, $is_mobile_webview, $mode, $vendor_name)

Retrieve widget link

Retrieve the widget link.

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
$apiInstance = new com\hydrogen\integration\Api\UtilsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$is_mobile_webview = false; // bool | is_mobile_webview
$mode = "aggregation"; // string | mode
$vendor_name = "vendor_name_example"; // string | vendor_name

try {
    $result = $apiInstance->getWidgetLinkUsingGet($nucleus_client_id, $is_mobile_webview, $mode, $vendor_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UtilsApi->getWidgetLinkUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |
 **is_mobile_webview** | **bool**| is_mobile_webview | [optional] [default to false]
 **mode** | **string**| mode | [optional] [default to aggregation]
 **vendor_name** | **string**| vendor_name | [optional]

### Return type

[**\com\hydrogen\integration\Model\WidgetUrlVO**](../Model/WidgetUrlVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

