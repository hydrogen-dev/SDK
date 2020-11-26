# com\hydrogen\nucleus\DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPost**](DocumentApi.md#createDocumentUsingPost) | **POST** /document | Create a Document
[**deleteDocumentUsingDelete**](DocumentApi.md#deleteDocumentUsingDelete) | **DELETE** /document/{document_id} | Delete a tenant document by Id
[**getDocumentAllUsingGet**](DocumentApi.md#getDocumentAllUsingGet) | **GET** /document | List all Documents
[**getDocumentUsingGet**](DocumentApi.md#getDocumentUsingGet) | **GET** /document/{document_id} | Retrieve a Tenant Document by Document Id
[**updateDocumentUsingPut**](DocumentApi.md#updateDocumentUsingPut) | **PUT** /document/{document_id} | Update a Tenant Document


# **createDocumentUsingPost**
> \com\hydrogen\nucleus\Model\Document createDocumentUsingPost($document_request)

Create a Document

Create a new Document for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_request = new \com\hydrogen\nucleus\Model\Document(); // \com\hydrogen\nucleus\Model\Document | documentRequest

try {
    $result = $apiInstance->createDocumentUsingPost($document_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->createDocumentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_request** | [**\com\hydrogen\nucleus\Model\Document**](../Model/Document.md)| documentRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Document**](../Model/Document.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDocumentUsingDelete**
> deleteDocumentUsingDelete($document_id)

Delete a tenant document by Id

Permanently delete a tenant document by Id

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
$apiInstance = new com\hydrogen\nucleus\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_id = "document_id_example"; // string | UUID document_id

try {
    $apiInstance->deleteDocumentUsingDelete($document_id);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->deleteDocumentUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**string**](../Model/.md)| UUID document_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDocumentAllUsingGet**
> \com\hydrogen\nucleus\Model\PageDocument_ getDocumentAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all Documents

Get the information for all Documents

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
$apiInstance = new com\hydrogen\nucleus\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getDocumentAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getDocumentAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageDocument_**](../Model/PageDocument_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDocumentUsingGet**
> \com\hydrogen\nucleus\Model\Document getDocumentUsingGet($document_id)

Retrieve a Tenant Document by Document Id

Retrieve the information for a Tenant Document by Document Id

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
$apiInstance = new com\hydrogen\nucleus\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document_id = "document_id_example"; // string | UUID document_id

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
 **document_id** | [**string**](../Model/.md)| UUID document_id |

### Return type

[**\com\hydrogen\nucleus\Model\Document**](../Model/Document.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDocumentUsingPut**
> \com\hydrogen\nucleus\Model\Document updateDocumentUsingPut($document, $document_id)

Update a Tenant Document

Updated the information for a Tenant Documents

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
$apiInstance = new com\hydrogen\nucleus\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$document = new \com\hydrogen\nucleus\Model\Document(); // \com\hydrogen\nucleus\Model\Document | document
$document_id = "document_id_example"; // string | UUID document_id

try {
    $result = $apiInstance->updateDocumentUsingPut($document, $document_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->updateDocumentUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | [**\com\hydrogen\nucleus\Model\Document**](../Model/Document.md)| document |
 **document_id** | [**string**](../Model/.md)| UUID document_id |

### Return type

[**\com\hydrogen\nucleus\Model\Document**](../Model/Document.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

