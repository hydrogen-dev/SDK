# com\hydrogen\molecule\DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPost**](DocumentApi.md#createDocumentUsingPost) | **POST** /document | Create a new Document
[**getDocumentUsingGet**](DocumentApi.md#getDocumentUsingGet) | **GET** /document/{document_id} | Retrieve a Document
[**verifyDocumentUsingPost**](DocumentApi.md#verifyDocumentUsingPost) | **POST** /document/verify | Verify a Document


# **createDocumentUsingPost**
> \com\hydrogen\molecule\Model\TransactionSuccessResponse createDocumentUsingPost($document_params)

Create a new Document

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

$apiInstance = new com\hydrogen\molecule\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_params = new \com\hydrogen\molecule\Model\DocumentParams(); // \com\hydrogen\molecule\Model\DocumentParams | Enables a user to store a Document hash on the blockchain

try {
    $result = $apiInstance->createDocumentUsingPost($document_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->createDocumentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**\com\hydrogen\molecule\Model\DocumentParams**](../Model/DocumentParams.md)| Enables a user to store a Document hash on the blockchain |

### Return type

[**\com\hydrogen\molecule\Model\TransactionSuccessResponse**](../Model/TransactionSuccessResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDocumentUsingGet**
> \com\hydrogen\molecule\Model\DocumentResponse getDocumentUsingGet($document_id)

Retrieve a Document

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

$apiInstance = new com\hydrogen\molecule\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_id = "document_id_example"; // string | Document ID

try {
    $result = $apiInstance->getDocumentUsingGet($document_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getDocumentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**string**](../Model/.md)| Document ID |

### Return type

[**\com\hydrogen\molecule\Model\DocumentResponse**](../Model/DocumentResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **verifyDocumentUsingPost**
> \com\hydrogen\molecule\Model\DocumentVerifyResponse verifyDocumentUsingPost($document_params)

Verify a Document

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

$apiInstance = new com\hydrogen\molecule\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_params = new \com\hydrogen\molecule\Model\DocumentParams(); // \com\hydrogen\molecule\Model\DocumentParams | Enables a user to verify a Document has not been changed

try {
    $result = $apiInstance->verifyDocumentUsingPost($document_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->verifyDocumentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**\com\hydrogen\molecule\Model\DocumentParams**](../Model/DocumentParams.md)| Enables a user to verify a Document has not been changed |

### Return type

[**\com\hydrogen\molecule\Model\DocumentVerifyResponse**](../Model/DocumentVerifyResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

