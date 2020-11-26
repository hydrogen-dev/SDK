# com\hydrogen\proton\PortfolioManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rebalancingSignal**](PortfolioManagementApi.md#rebalancingSignal) | **POST** /rebalancing_signal | Rebalancing Signal


# **rebalancingSignal**
> map[string,object] rebalancingSignal($rebalancing_signal_request)

Rebalancing Signal

Generate rebalancing signals for a group of investments

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
}$apiInstance = new com\hydrogen\proton\Api\PortfolioManagementApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$rebalancing_signal_request = new \com\hydrogen\proton\Model\RebalancingSignalRequest(); // \com\hydrogen\proton\Model\RebalancingSignalRequest | Request payload for Rebalancing Signal

try {
    $result = $apiInstance->rebalancingSignal($rebalancing_signal_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PortfolioManagementApi->rebalancingSignal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rebalancing_signal_request** | [**\com\hydrogen\proton\Model\RebalancingSignalRequest**](../Model/RebalancingSignalRequest.md)| Request payload for Rebalancing Signal |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

