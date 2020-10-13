# com\hydrogen\molecule\TokenCrowdsaleApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployCrowdsaleUsingPost**](TokenCrowdsaleApi.md#deployCrowdsaleUsingPost) | **POST** /crowdsale/deploy | Deploy token for Crowdsale
[**fundCrowdsaleUsingPost**](TokenCrowdsaleApi.md#fundCrowdsaleUsingPost) | **POST** /crowdsale/fund | Fund/add Tokens supply to Crowdsale
[**purchaseCrowdsaleUsingPost**](TokenCrowdsaleApi.md#purchaseCrowdsaleUsingPost) | **POST** /crowdsale/purchase | Purchase Tokens from Crowdsale


# **deployCrowdsaleUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse deployCrowdsaleUsingPost($crowdsale_deploy_params)

Deploy token for Crowdsale

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\TokenCrowdsaleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$crowdsale_deploy_params = new \com\hydrogen\molecule\Model\CrowdsaleDeployParams(); // \com\hydrogen\molecule\Model\CrowdsaleDeployParams | Deploy token for Crowdsale

try {
    $result = $apiInstance->deployCrowdsaleUsingPost($crowdsale_deploy_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenCrowdsaleApi->deployCrowdsaleUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_deploy_params** | [**\com\hydrogen\molecule\Model\CrowdsaleDeployParams**](../Model/CrowdsaleDeployParams.md)| Deploy token for Crowdsale |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **fundCrowdsaleUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse fundCrowdsaleUsingPost($crowdsale_fund_params)

Fund/add Tokens supply to Crowdsale

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\TokenCrowdsaleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$crowdsale_fund_params = new \com\hydrogen\molecule\Model\CrowdsaleFundParams(); // \com\hydrogen\molecule\Model\CrowdsaleFundParams | Fund provided Token's supply to Crowdsale

try {
    $result = $apiInstance->fundCrowdsaleUsingPost($crowdsale_fund_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenCrowdsaleApi->fundCrowdsaleUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_fund_params** | [**\com\hydrogen\molecule\Model\CrowdsaleFundParams**](../Model/CrowdsaleFundParams.md)| Fund provided Token&#39;s supply to Crowdsale |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **purchaseCrowdsaleUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse purchaseCrowdsaleUsingPost($crowdsale_purchase_params)

Purchase Tokens from Crowdsale

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
// 3) Generate Token for client_token
$config = \com\hydrogen\molecule\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\molecule\ApiException $e) {
    print_r($e);
}

$apiInstance = new com\hydrogen\molecule\Api\TokenCrowdsaleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$crowdsale_purchase_params = new \com\hydrogen\molecule\Model\CrowdsalePurchaseParams(); // \com\hydrogen\molecule\Model\CrowdsalePurchaseParams | Purchase Tokens

try {
    $result = $apiInstance->purchaseCrowdsaleUsingPost($crowdsale_purchase_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenCrowdsaleApi->purchaseCrowdsaleUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_purchase_params** | [**\com\hydrogen\molecule\Model\CrowdsalePurchaseParams**](../Model/CrowdsalePurchaseParams.md)| Purchase Tokens |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

