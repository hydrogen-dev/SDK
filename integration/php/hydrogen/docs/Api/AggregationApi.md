# com\hydrogen\integration\AggregationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountUsingPost**](AggregationApi.md#createAggregationAccountUsingPost) | **POST** /aggregation/account | Create mapping between client,vendor,tenant
[**createPropertyValueUsingPost**](AggregationApi.md#createPropertyValueUsingPost) | **POST** /property_value | Create mapping between client,vendor,tenant for the property
[**deleteAggregationAccountUsingDelete**](AggregationApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation/account/{nucleus_aggregation_account_id} | De-Link mapping between client,vendor,tenant
[**getAggregationAccountAllUsingGet**](AggregationApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation/account | Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
[**getAggregationAccountBalanceAllUsingGet**](AggregationApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation/balance | Fetch all aggregation account balance details with for the given aggregation accounts
[**getAggregationAccountBalanceUsingGet**](AggregationApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation/balance/{nucleus_aggregation_account_id} | Fetch aggregation account balance details with the mapping created in POST endpoint
[**getAggregationAccountHoldingAllUsingGet**](AggregationApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation/holding | Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
[**getAggregationAccountHoldingUsingGet**](AggregationApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation/holding/{nucleus_aggregation_account_id} | Fetch aggregation account holding details with the mapping created in POST endpoint
[**getAggregationAccountTransactionAllUsingGet**](AggregationApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation/transaction | Fetch all aggregation account balance details with for the given aggregation accounts
[**getAggregationAccountTransactionUsingGet**](AggregationApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation/transaction/{nucleus_aggregation_account_id} | Fetch aggregation account transaction details with the mapping created in POST endpoint
[**getAggregationAccountUsingGet**](AggregationApi.md#getAggregationAccountUsingGet) | **GET** /aggregation/account/{nucleus_aggregation_account_id} | Fetch aggregation account details with the mapping created in POST endpoint


# **createAggregationAccountUsingPost**
> \com\hydrogen\integration\Model\AggregationAccountsResponseVO createAggregationAccountUsingPost($aggregation_request_object)

Create mapping between client,vendor,tenant

Create mapping between client,vendor,tenant

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_request_object = new \com\hydrogen\integration\Model\AggregationRequestObject(); // \com\hydrogen\integration\Model\AggregationRequestObject | aggregationRequestObject

try {
    $result = $apiInstance->createAggregationAccountUsingPost($aggregation_request_object);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->createAggregationAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**\com\hydrogen\integration\Model\AggregationRequestObject**](../Model/AggregationRequestObject.md)| aggregationRequestObject |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountsResponseVO**](../Model/AggregationAccountsResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createPropertyValueUsingPost**
> \com\hydrogen\integration\Model\PropertyValueResponseVO createPropertyValueUsingPost($aggregation_request_object)

Create mapping between client,vendor,tenant for the property

Create mapping between client,vendor,tenant for property

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_request_object = new \com\hydrogen\integration\Model\AggregationRequestObject(); // \com\hydrogen\integration\Model\AggregationRequestObject | aggregationRequestObject

try {
    $result = $apiInstance->createPropertyValueUsingPost($aggregation_request_object);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->createPropertyValueUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**\com\hydrogen\integration\Model\AggregationRequestObject**](../Model/AggregationRequestObject.md)| aggregationRequestObject |

### Return type

[**\com\hydrogen\integration\Model\PropertyValueResponseVO**](../Model/PropertyValueResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete($nucleus_aggregation_account_id)

De-Link mapping between client,vendor,tenant

De-Link mapping between client,vendor,tenant

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_aggregation_account_id = "nucleus_aggregation_account_id_example"; // string | nucleus_aggregation_account_id

try {
    $apiInstance->deleteAggregationAccountUsingDelete($nucleus_aggregation_account_id);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->deleteAggregationAccountUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**string**](../Model/.md)| nucleus_aggregation_account_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountAllUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountResponseVO[] getAggregationAccountAllUsingGet($aggregation_account_id_list)

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id_list = array("aggregation_account_id_list_example"); // string[] | aggregation_account_id_list

try {
    $result = $apiInstance->getAggregationAccountAllUsingGet($aggregation_account_id_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**string[]**](../Model/string.md)| aggregation_account_id_list |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountResponseVO[]**](../Model/AggregationAccountResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountBalanceAllUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountBalanceResponseVO[] getAggregationAccountBalanceAllUsingGet($aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts

Fetch all aggregation account balance details with for the given aggregation accounts

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id_list = array("aggregation_account_id_list_example"); // string[] | aggregation_account_id_list

try {
    $result = $apiInstance->getAggregationAccountBalanceAllUsingGet($aggregation_account_id_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountBalanceAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**string[]**](../Model/string.md)| aggregation_account_id_list |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountBalanceResponseVO[]**](../Model/AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountBalanceUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountBalanceResponseVO getAggregationAccountBalanceUsingGet($nucleus_aggregation_account_id)

Fetch aggregation account balance details with the mapping created in POST endpoint

Fetch aggregation account balance details with the mapping created in POST endpoint

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_aggregation_account_id = "nucleus_aggregation_account_id_example"; // string | nucleus_aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountBalanceUsingGet($nucleus_aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountBalanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**string**](../Model/.md)| nucleus_aggregation_account_id |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountBalanceResponseVO**](../Model/AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountHoldingAllUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountHoldingResponseVO[] getAggregationAccountHoldingAllUsingGet($aggregation_account_id_list)

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id_list = array("aggregation_account_id_list_example"); // string[] | aggregation_account_id_list

try {
    $result = $apiInstance->getAggregationAccountHoldingAllUsingGet($aggregation_account_id_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountHoldingAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**string[]**](../Model/string.md)| aggregation_account_id_list |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountHoldingResponseVO[]**](../Model/AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountHoldingUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountHoldingResponseVO getAggregationAccountHoldingUsingGet($nucleus_aggregation_account_id)

Fetch aggregation account holding details with the mapping created in POST endpoint

Fetch aggregation account holding details with the mapping created in POST endpoint

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_aggregation_account_id = "nucleus_aggregation_account_id_example"; // string | nucleus_aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountHoldingUsingGet($nucleus_aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**string**](../Model/.md)| nucleus_aggregation_account_id |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountHoldingResponseVO**](../Model/AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountTransactionAllUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountTransactionResponseVO[] getAggregationAccountTransactionAllUsingGet($aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts

Fetch all aggregation account balance details with for the given aggregation accounts

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$aggregation_account_id_list = array("aggregation_account_id_list_example"); // string[] | aggregation_account_id_list

try {
    $result = $apiInstance->getAggregationAccountTransactionAllUsingGet($aggregation_account_id_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**string[]**](../Model/string.md)| aggregation_account_id_list |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountTransactionResponseVO[]**](../Model/AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountTransactionUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountTransactionResponseVO getAggregationAccountTransactionUsingGet($nucleus_aggregation_account_id)

Fetch aggregation account transaction details with the mapping created in POST endpoint

Fetch aggregation account transaction details with the mapping created in POST endpoint

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_aggregation_account_id = "nucleus_aggregation_account_id_example"; // string | nucleus_aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountTransactionUsingGet($nucleus_aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**string**](../Model/.md)| nucleus_aggregation_account_id |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountTransactionResponseVO**](../Model/AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAggregationAccountUsingGet**
> \com\hydrogen\integration\Model\AggregationAccountResponseVO getAggregationAccountUsingGet($nucleus_aggregation_account_id)

Fetch aggregation account details with the mapping created in POST endpoint

Fetch aggregation account details with the mapping created in POST endpoint

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
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AggregationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_aggregation_account_id = "nucleus_aggregation_account_id_example"; // string | nucleus_aggregation_account_id

try {
    $result = $apiInstance->getAggregationAccountUsingGet($nucleus_aggregation_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AggregationApi->getAggregationAccountUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**string**](../Model/.md)| nucleus_aggregation_account_id |

### Return type

[**\com\hydrogen\integration\Model\AggregationAccountResponseVO**](../Model/AggregationAccountResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

