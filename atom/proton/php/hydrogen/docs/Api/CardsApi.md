# com\hydrogen\proton\CardsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardLimitCheck**](CardsApi.md#cardLimitCheck) | **POST** /card_limit_check | Card Limit Check
[**cardTransactionAuthorization**](CardsApi.md#cardTransactionAuthorization) | **POST** /card_authorization | Card Transaction Authorization


# **cardLimitCheck**
> map[string,object] cardLimitCheck($card_limit_check_request)

Card Limit Check

Evaluate card transaction history against spending controls

### Example
```php
<?php
require_once('../vendor/autoload.php');
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
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\CardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_limit_check_request = new \com\hydrogen\proton\Model\CardLimitCheckRequest(); // \com\hydrogen\proton\Model\CardLimitCheckRequest | Request payload for Card Limit Check

try {
    $result = $apiInstance->cardLimitCheck($card_limit_check_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardsApi->cardLimitCheck: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_limit_check_request** | [**\com\hydrogen\proton\Model\CardLimitCheckRequest**](../Model/CardLimitCheckRequest.md)| Request payload for Card Limit Check |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cardTransactionAuthorization**
> map[string,object] cardTransactionAuthorization($card_transaction_authorization_request)

Card Transaction Authorization

Approve or reject a card transaction based on applicable conditions

### Example
```php
<?php
require_once('../vendor/autoload.php');
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
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\CardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_transaction_authorization_request = new \com\hydrogen\proton\Model\CardTransactionAuthorizationRequest(); // \com\hydrogen\proton\Model\CardTransactionAuthorizationRequest | Request payload for Card Transaction Authorization

try {
    $result = $apiInstance->cardTransactionAuthorization($card_transaction_authorization_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardsApi->cardTransactionAuthorization: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_transaction_authorization_request** | [**\com\hydrogen\proton\Model\CardTransactionAuthorizationRequest**](../Model/CardTransactionAuthorizationRequest.md)| Request payload for Card Transaction Authorization |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

