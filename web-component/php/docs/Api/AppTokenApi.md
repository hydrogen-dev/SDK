# com\hydrogen\admin\AppTokenApi

All URIs are relative to *https://api.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppTokenUsingGET**](AppTokenApi.md#getAppTokenUsingGET) | **GET** /app_token | getAppToken


# **getAppTokenUsingGET**
> \com\hydrogen\admin\Model\AppToken[] getAppTokenUsingGET($app_name)

getAppToken

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}

$app_name = array("app_name_example"); // string[] | app_name

try {
    $result = $apiInstance->getAppTokenUsingGET($app_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppTokenApi->getAppTokenUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_name** | [**string[]**](../Model/string.md)| app_name |

### Return type

[**\com\hydrogen\admin\Model\AppToken[]**](../Model/AppToken.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
