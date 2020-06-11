# com\hydrogen\ModelApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelAssetSizeUsingPost**](ModelApi.md#createModelAssetSizeUsingPost) | **POST** /model_asset_size | Create a model asset size
[**createModelChangeUsingPost**](ModelApi.md#createModelChangeUsingPost) | **POST** /model/{model_id}/model_change | Change a model composition
[**createModelCommentUsingPost**](ModelApi.md#createModelCommentUsingPost) | **POST** /model_comment | Create a model commentary
[**createModelHoldingUsingPost**](ModelApi.md#createModelHoldingUsingPost) | **POST** /model_holding | Create a model holding
[**createModelTransactionUsingPost**](ModelApi.md#createModelTransactionUsingPost) | **POST** /model_transaction | Create a model transaction
[**createModelUsingPost**](ModelApi.md#createModelUsingPost) | **POST** /model | Create a model
[**deleteModelAssetSizeUsingDelete**](ModelApi.md#deleteModelAssetSizeUsingDelete) | **DELETE** /model_asset_size/{model_asset_size_id} | Delete a model asset size
[**deleteModelCommentUsingDelete**](ModelApi.md#deleteModelCommentUsingDelete) | **DELETE** /model_comment/{model_comment_id} | Delete a model commentary
[**deleteModelHoldingUsingDelete**](ModelApi.md#deleteModelHoldingUsingDelete) | **DELETE** /model_holding/{model_holding_id} | Delete a model holding
[**deleteModelTransactionUsingDelete**](ModelApi.md#deleteModelTransactionUsingDelete) | **DELETE** /model_transaction/{model_transaction_id} | Delete a model transaction
[**deleteModelUsingDelete**](ModelApi.md#deleteModelUsingDelete) | **DELETE** /model/{model_id} | Delete a model
[**getModelAllUsingGet**](ModelApi.md#getModelAllUsingGet) | **GET** /model | List all models
[**getModelAssetSizeAllUsingGet**](ModelApi.md#getModelAssetSizeAllUsingGet) | **GET** /model_asset_size | List all model asset sizes
[**getModelAssetSizeUsingGet**](ModelApi.md#getModelAssetSizeUsingGet) | **GET** /model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**getModelCommentAllUsingGet**](ModelApi.md#getModelCommentAllUsingGet) | **GET** /model_comment | List all model commentary
[**getModelCommentUsingGet**](ModelApi.md#getModelCommentUsingGet) | **GET** /model_comment/{model_comment_id} | Retrieve a model commentary
[**getModelHoldingAllUsingGet**](ModelApi.md#getModelHoldingAllUsingGet) | **GET** /model_holding | List all model holdings
[**getModelHoldingUsingGet**](ModelApi.md#getModelHoldingUsingGet) | **GET** /model_holding/{model_holding_id} | Retrieve a model holding
[**getModelTransactionAllUsingGet**](ModelApi.md#getModelTransactionAllUsingGet) | **GET** /model_transaction | List all model transactions
[**getModelTransactionUsingGet**](ModelApi.md#getModelTransactionUsingGet) | **GET** /model_transaction/{model_transaction_id} | Retrieve a model transaction
[**getModelUsingGet**](ModelApi.md#getModelUsingGet) | **GET** /model/{model_id} | Retrieve a model
[**updateModelAssetSizeUsingPut**](ModelApi.md#updateModelAssetSizeUsingPut) | **PUT** /model_asset_size/{model_asset_size_id} | Update a model asset size
[**updateModelCommentUsingPut**](ModelApi.md#updateModelCommentUsingPut) | **PUT** /model_comment/{model_comment_id} | Update a model commentary
[**updateModelHoldingUsingPut**](ModelApi.md#updateModelHoldingUsingPut) | **PUT** /model_holding/{model_holding_id} | Update a model holding
[**updateModelTransactionUsingPut**](ModelApi.md#updateModelTransactionUsingPut) | **PUT** /model_transaction/{model_transaction_id} | Update a model transaction
[**updateModelUsingPut**](ModelApi.md#updateModelUsingPut) | **PUT** /model/{model_id} | Update a model


# **createModelAssetSizeUsingPost**
> \com\hydrogen\Model\ModelAssetSize createModelAssetSizeUsingPost($req)

Create a model asset size

Create a new asset size record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$req = new \com\hydrogen\Model\ModelAssetSize(); // \com\hydrogen\Model\ModelAssetSize | req

try {
    $result = $apiInstance->createModelAssetSizeUsingPost($req);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelAssetSizeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**\com\hydrogen\Model\ModelAssetSize**](../Model/ModelAssetSize.md)| req |

### Return type

[**\com\hydrogen\Model\ModelAssetSize**](../Model/ModelAssetSize.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createModelChangeUsingPost**
> \com\hydrogen\Model\ModelTransaction[] createModelChangeUsingPost($change_request, $model_id)

Change a model composition

Model composition changes represent a change in a model’s holdings.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$change_request = new \com\hydrogen\Model\OrderReconcileRequest(); // \com\hydrogen\Model\OrderReconcileRequest | changeRequest
$model_id = "model_id_example"; // string | UUID model_id

try {
    $result = $apiInstance->createModelChangeUsingPost($change_request, $model_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelChangeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **change_request** | [**\com\hydrogen\Model\OrderReconcileRequest**](../Model/OrderReconcileRequest.md)| changeRequest |
 **model_id** | [**string**](../Model/.md)| UUID model_id |

### Return type

[**\com\hydrogen\Model\ModelTransaction[]**](../Model/ModelTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createModelCommentUsingPost**
> int createModelCommentUsingPost($model_comment_request)

Create a model commentary

Create a new comment for a model available for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_comment_request = new \com\hydrogen\Model\ModelComment(); // \com\hydrogen\Model\ModelComment | modelCommentRequest

try {
    $result = $apiInstance->createModelCommentUsingPost($model_comment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelCommentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_request** | [**\com\hydrogen\Model\ModelComment**](../Model/ModelComment.md)| modelCommentRequest |

### Return type

**int**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createModelHoldingUsingPost**
> \com\hydrogen\Model\ModelHolding createModelHoldingUsingPost($model_holding_request)

Create a model holding

Create a new model holding record for a specific model and date.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_holding_request = new \com\hydrogen\Model\ModelHolding(); // \com\hydrogen\Model\ModelHolding | modelHoldingRequest

try {
    $result = $apiInstance->createModelHoldingUsingPost($model_holding_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelHoldingUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_request** | [**\com\hydrogen\Model\ModelHolding**](../Model/ModelHolding.md)| modelHoldingRequest |

### Return type

[**\com\hydrogen\Model\ModelHolding**](../Model/ModelHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createModelTransactionUsingPost**
> \com\hydrogen\Model\ModelTransaction createModelTransactionUsingPost($model_transaction_request)

Create a model transaction

Create a new transaction record for a security under a model for a specific date.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_transaction_request = new \com\hydrogen\Model\ModelTransaction(); // \com\hydrogen\Model\ModelTransaction | modelTransactionRequest

try {
    $result = $apiInstance->createModelTransactionUsingPost($model_transaction_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelTransactionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_request** | [**\com\hydrogen\Model\ModelTransaction**](../Model/ModelTransaction.md)| modelTransactionRequest |

### Return type

[**\com\hydrogen\Model\ModelTransaction**](../Model/ModelTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createModelUsingPost**
> \com\hydrogen\Model\Model createModelUsingPost($model_info_request)

Create a model

Create a new model for your firm to which a portfolios can later subscribe.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_info_request = new \com\hydrogen\Model\Model(); // \com\hydrogen\Model\Model | modelInfoRequest

try {
    $result = $apiInstance->createModelUsingPost($model_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->createModelUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_info_request** | [**\com\hydrogen\Model\Model**](../Model/Model.md)| modelInfoRequest |

### Return type

[**\com\hydrogen\Model\Model**](../Model/Model.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteModelAssetSizeUsingDelete**
> deleteModelAssetSizeUsingDelete($model_asset_size_id)

Delete a model asset size

Permanently delete a model asset size record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_asset_size_id = "model_asset_size_id_example"; // string | UUID model_asset_size_id

try {
    $apiInstance->deleteModelAssetSizeUsingDelete($model_asset_size_id);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->deleteModelAssetSizeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**string**](../Model/.md)| UUID model_asset_size_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteModelCommentUsingDelete**
> deleteModelCommentUsingDelete($model_comment_id)

Delete a model commentary

Permanently delete a model comment for a model

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_comment_id = "model_comment_id_example"; // string | UUID model_comment_id

try {
    $apiInstance->deleteModelCommentUsingDelete($model_comment_id);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->deleteModelCommentUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**string**](../Model/.md)| UUID model_comment_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteModelHoldingUsingDelete**
> deleteModelHoldingUsingDelete($model_holding_id)

Delete a model holding

Permanently delete a model holding record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_holding_id = "model_holding_id_example"; // string | UUID model_holding_id

try {
    $apiInstance->deleteModelHoldingUsingDelete($model_holding_id);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->deleteModelHoldingUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**string**](../Model/.md)| UUID model_holding_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteModelTransactionUsingDelete**
> deleteModelTransactionUsingDelete($model_transaction_id)

Delete a model transaction

Permanently delete a model transaction for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_transaction_id = "model_transaction_id_example"; // string | UUID model_transaction_id

try {
    $apiInstance->deleteModelTransactionUsingDelete($model_transaction_id);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->deleteModelTransactionUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**string**](../Model/.md)| UUID model_transaction_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteModelUsingDelete**
> deleteModelUsingDelete($model_id)

Delete a model

Permanently delete a model for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_id = "model_id_example"; // string | UUID model_id

try {
    $apiInstance->deleteModelUsingDelete($model_id);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->deleteModelUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**string**](../Model/.md)| UUID model_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelAllUsingGet**
> \com\hydrogen\Model\PageModel_ getModelAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all models

Get details for all models defined for your firm to which portfolios can subscribe.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
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
    $result = $apiInstance->getModelAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageModel_**](../Model/PageModel_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelAssetSizeAllUsingGet**
> \com\hydrogen\Model\PageModelAssetSize_ getModelAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all model asset sizes

Get a list of asset sizes per date for all models defined for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
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
    $result = $apiInstance->getModelAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelAssetSizeAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageModelAssetSize_**](../Model/PageModelAssetSize_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelAssetSizeUsingGet**
> \com\hydrogen\Model\ModelAssetSize getModelAssetSizeUsingGet($model_asset_size_id)

Retrieve a model asset size

Retrieve the information for a model asset size record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_asset_size_id = "model_asset_size_id_example"; // string | UUID model_asset_size_id

try {
    $result = $apiInstance->getModelAssetSizeUsingGet($model_asset_size_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelAssetSizeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**string**](../Model/.md)| UUID model_asset_size_id |

### Return type

[**\com\hydrogen\Model\ModelAssetSize**](../Model/ModelAssetSize.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelCommentAllUsingGet**
> \com\hydrogen\Model\PageModelComment_ getModelCommentAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all model commentary

List all comments for all models defined by your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
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
    $result = $apiInstance->getModelCommentAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelCommentAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageModelComment_**](../Model/PageModelComment_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelCommentUsingGet**
> \com\hydrogen\Model\ModelComment getModelCommentUsingGet($model_comment_id)

Retrieve a model commentary

Retrieve the information for a model comment for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_comment_id = "model_comment_id_example"; // string | UUID model_comment_id

try {
    $result = $apiInstance->getModelCommentUsingGet($model_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelCommentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**string**](../Model/.md)| UUID model_comment_id |

### Return type

[**\com\hydrogen\Model\ModelComment**](../Model/ModelComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelHoldingAllUsingGet**
> \com\hydrogen\Model\PageModelHolding_ getModelHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all model holdings

Get all model holding records for all models defined for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
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
    $result = $apiInstance->getModelHoldingAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelHoldingAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageModelHolding_**](../Model/PageModelHolding_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelHoldingUsingGet**
> \com\hydrogen\Model\ModelHolding getModelHoldingUsingGet($model_holding_id)

Retrieve a model holding

Retrieve the information for a model holding record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_holding_id = "model_holding_id_example"; // string | UUID model_holding_id

try {
    $result = $apiInstance->getModelHoldingUsingGet($model_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**string**](../Model/.md)| UUID model_holding_id |

### Return type

[**\com\hydrogen\Model\ModelHolding**](../Model/ModelHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelTransactionAllUsingGet**
> \com\hydrogen\Model\PageModelTransaction_ getModelTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all model transactions

Get details for all transaction records for all models defined by your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
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
    $result = $apiInstance->getModelTransactionAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageModelTransaction_**](../Model/PageModelTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelTransactionUsingGet**
> \com\hydrogen\Model\ModelTransaction getModelTransactionUsingGet($model_transaction_id)

Retrieve a model transaction

Retrieve the information for a model transaction for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_transaction_id = "model_transaction_id_example"; // string | UUID model_transaction_id

try {
    $result = $apiInstance->getModelTransactionUsingGet($model_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**string**](../Model/.md)| UUID model_transaction_id |

### Return type

[**\com\hydrogen\Model\ModelTransaction**](../Model/ModelTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelUsingGet**
> \com\hydrogen\Model\Model getModelUsingGet($model_id)

Retrieve a model

Get the information for a model for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_id = "model_id_example"; // string | UUID model_id

try {
    $result = $apiInstance->getModelUsingGet($model_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->getModelUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**string**](../Model/.md)| UUID model_id |

### Return type

[**\com\hydrogen\Model\Model**](../Model/Model.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateModelAssetSizeUsingPut**
> \com\hydrogen\Model\ModelAssetSize updateModelAssetSizeUsingPut($model_asset_size, $model_asset_size_id)

Update a model asset size

Update a model asset size record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_asset_size = new \com\hydrogen\Model\ModelAssetSize(); // \com\hydrogen\Model\ModelAssetSize | model_asset_size
$model_asset_size_id = "model_asset_size_id_example"; // string | UUID model_asset_size_id

try {
    $result = $apiInstance->updateModelAssetSizeUsingPut($model_asset_size, $model_asset_size_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->updateModelAssetSizeUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size** | [**\com\hydrogen\Model\ModelAssetSize**](../Model/ModelAssetSize.md)| model_asset_size |
 **model_asset_size_id** | [**string**](../Model/.md)| UUID model_asset_size_id |

### Return type

[**\com\hydrogen\Model\ModelAssetSize**](../Model/ModelAssetSize.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateModelCommentUsingPut**
> \com\hydrogen\Model\ModelComment updateModelCommentUsingPut($model_comment, $model_comment_id)

Update a model commentary

Update a model comment for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_comment = new \com\hydrogen\Model\ModelComment(); // \com\hydrogen\Model\ModelComment | model_comment
$model_comment_id = "model_comment_id_example"; // string | UUID model_comment_id

try {
    $result = $apiInstance->updateModelCommentUsingPut($model_comment, $model_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->updateModelCommentUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment** | [**\com\hydrogen\Model\ModelComment**](../Model/ModelComment.md)| model_comment |
 **model_comment_id** | [**string**](../Model/.md)| UUID model_comment_id |

### Return type

[**\com\hydrogen\Model\ModelComment**](../Model/ModelComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateModelHoldingUsingPut**
> \com\hydrogen\Model\ModelHolding updateModelHoldingUsingPut($model_holding, $model_holding_id)

Update a model holding

Update a model holding record for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_holding = new \com\hydrogen\Model\ModelHolding(); // \com\hydrogen\Model\ModelHolding | model_holding
$model_holding_id = "model_holding_id_example"; // string | UUID model_holding_id

try {
    $result = $apiInstance->updateModelHoldingUsingPut($model_holding, $model_holding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->updateModelHoldingUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding** | [**\com\hydrogen\Model\ModelHolding**](../Model/ModelHolding.md)| model_holding |
 **model_holding_id** | [**string**](../Model/.md)| UUID model_holding_id |

### Return type

[**\com\hydrogen\Model\ModelHolding**](../Model/ModelHolding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateModelTransactionUsingPut**
> \com\hydrogen\Model\ModelTransaction updateModelTransactionUsingPut($model_transaction, $model_transaction_id)

Update a model transaction

Update a model transaction for a model.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_transaction = new \com\hydrogen\Model\ModelTransaction(); // \com\hydrogen\Model\ModelTransaction | model_transaction
$model_transaction_id = "model_transaction_id_example"; // string | UUID model_transaction_id

try {
    $result = $apiInstance->updateModelTransactionUsingPut($model_transaction, $model_transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->updateModelTransactionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction** | [**\com\hydrogen\Model\ModelTransaction**](../Model/ModelTransaction.md)| model_transaction |
 **model_transaction_id** | [**string**](../Model/.md)| UUID model_transaction_id |

### Return type

[**\com\hydrogen\Model\ModelTransaction**](../Model/ModelTransaction.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateModelUsingPut**
> \com\hydrogen\Model\Model updateModelUsingPut($model, $model_id)

Update a model

Update a model for your firm.

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
$apiInstance = new com\hydrogen\Api\ModelApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model = new \com\hydrogen\Model\Model(); // \com\hydrogen\Model\Model | model
$model_id = "model_id_example"; // string | UUID model_id

try {
    $result = $apiInstance->updateModelUsingPut($model, $model_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModelApi->updateModelUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**\com\hydrogen\Model\Model**](../Model/Model.md)| model |
 **model_id** | [**string**](../Model/.md)| UUID model_id |

### Return type

[**\com\hydrogen\Model\Model**](../Model/Model.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

