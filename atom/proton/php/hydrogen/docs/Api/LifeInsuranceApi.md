# com\hydrogen\LifeInsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lifeInsuranceNeedsCalculator**](LifeInsuranceApi.md#lifeInsuranceNeedsCalculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator


# **lifeInsuranceNeedsCalculator**
> map[string,object] lifeInsuranceNeedsCalculator($life_insurance_needs_calculator_request)

Life Insurance Needs Calculator

Calculate life insurance needs based on existing asset and liability data

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
$apiInstance = new com\hydrogen\Api\LifeInsuranceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$life_insurance_needs_calculator_request = new \com\hydrogen\Model\LifeInsuranceNeedsCalculatorRequest(); // \com\hydrogen\Model\LifeInsuranceNeedsCalculatorRequest | Request payload for Life Insurance Needs Calculator

try {
    $result = $apiInstance->lifeInsuranceNeedsCalculator($life_insurance_needs_calculator_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LifeInsuranceApi->lifeInsuranceNeedsCalculator: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **life_insurance_needs_calculator_request** | [**\com\hydrogen\Model\LifeInsuranceNeedsCalculatorRequest**](../Model/LifeInsuranceNeedsCalculatorRequest.md)| Request payload for Life Insurance Needs Calculator |

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

