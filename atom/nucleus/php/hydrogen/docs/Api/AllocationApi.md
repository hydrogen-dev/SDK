# com\hydrogen\AllocationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAllocationCompositionUsingPost**](AllocationApi.md#createAllocationCompositionUsingPost) | **POST** /allocation_composition | Create an allocation composition
[**createAllocationUsingPost**](AllocationApi.md#createAllocationUsingPost) | **POST** /allocation | Create an allocation
[**deleteAllocationCompositionUsingDelete**](AllocationApi.md#deleteAllocationCompositionUsingDelete) | **DELETE** /allocation_composition/{allocation_composition_id} | Delete an allocation composition
[**deleteAllocationUsingDelete**](AllocationApi.md#deleteAllocationUsingDelete) | **DELETE** /allocation/{allocation_id} | Delete an allocation
[**getAllHoldingsUsingGET**](AllocationApi.md#getAllHoldingsUsingGET) | **GET** /allocation/{allocation_id}/holding | List all allocation holdings
[**getAllTransactionsUsingGET**](AllocationApi.md#getAllTransactionsUsingGET) | **GET** /allocation/{allocation_id}/transaction | List all allocation transactions
[**getAllocationAggregatedDataUsingGET**](AllocationApi.md#getAllocationAggregatedDataUsingGET) | **GET** /allocation/{allocation_id}/aggregate_data | List all Allocation aggregated data overview
[**getAllocationAllUsingGet**](AllocationApi.md#getAllocationAllUsingGet) | **GET** /allocation | List all allocations
[**getAllocationCompositionAllUsingGet**](AllocationApi.md#getAllocationCompositionAllUsingGet) | **GET** /allocation_composition | List all allocations compositions
[**getAllocationCompositionUsingGet**](AllocationApi.md#getAllocationCompositionUsingGet) | **GET** /allocation_composition/{allocation_composition_id} | Retrieve an allocation composition
[**getAllocationUsingGet**](AllocationApi.md#getAllocationUsingGet) | **GET** /allocation/{allocation_id} | Retrieve an allocation
[**getAssetsizeUsingGET**](AllocationApi.md#getAssetsizeUsingGET) | **GET** /allocation/{allocation_id}/asset_size | List all allocation asset sizes
[**updateAllocationCompositionUsingPut**](AllocationApi.md#updateAllocationCompositionUsingPut) | **PUT** /allocation_composition/{allocation_composition_id} | Update an allocation composition
[**updateAllocationUsingPut**](AllocationApi.md#updateAllocationUsingPut) | **PUT** /allocation/{allocation_id} | Update an allocation


# **createAllocationCompositionUsingPost**
> \com\hydrogen\Model\AllocationComposition createAllocationCompositionUsingPost($alloc_request)

Create an allocation composition

Create a new allocation composition record for an allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$alloc_request = new \com\hydrogen\Model\AllocationComposition(); // \com\hydrogen\Model\AllocationComposition | allocRequest

try {
    $result = $apiInstance->createAllocationCompositionUsingPost($alloc_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->createAllocationCompositionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**\com\hydrogen\Model\AllocationComposition**](../Model/AllocationComposition.md)| allocRequest |

### Return type

[**\com\hydrogen\Model\AllocationComposition**](../Model/AllocationComposition.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAllocationUsingPost**
> \com\hydrogen\Model\Allocation createAllocationUsingPost($allocation_request)

Create an allocation

Create a new allocation for your firm.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_request = new \com\hydrogen\Model\Allocation(); // \com\hydrogen\Model\Allocation | allocationRequest

try {
    $result = $apiInstance->createAllocationUsingPost($allocation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->createAllocationUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_request** | [**\com\hydrogen\Model\Allocation**](../Model/Allocation.md)| allocationRequest |

### Return type

[**\com\hydrogen\Model\Allocation**](../Model/Allocation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAllocationCompositionUsingDelete**
> deleteAllocationCompositionUsingDelete($allocation_composition_id)

Delete an allocation composition

Permanently delete an allocation composition record for an allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_composition_id = "allocation_composition_id_example"; // string | UUID allocation_composition_id

try {
    $apiInstance->deleteAllocationCompositionUsingDelete($allocation_composition_id);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->deleteAllocationCompositionUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**string**](../Model/.md)| UUID allocation_composition_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAllocationUsingDelete**
> deleteAllocationUsingDelete($allocation_id)

Delete an allocation

Permanently delete an allocation defined by your firm.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | UUID allocation_id

try {
    $apiInstance->deleteAllocationUsingDelete($allocation_id);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->deleteAllocationUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllHoldingsUsingGET**
> \com\hydrogen\Model\ModelHoldingAgg[] getAllHoldingsUsingGET($allocation_id, $end_date, $start_date)

List all allocation holdings

Get the information for all securities assigned to a specific allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | UUID allocation_id
$end_date = new \DateTime("null"); // \DateTime | end_date
$start_date = new \DateTime("null"); // \DateTime | start_date

try {
    $result = $apiInstance->getAllHoldingsUsingGET($allocation_id, $end_date, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllHoldingsUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |
 **end_date** | **\DateTime**| end_date | [optional] [default to null]
 **start_date** | **\DateTime**| start_date | [optional] [default to null]

### Return type

[**\com\hydrogen\Model\ModelHoldingAgg[]**](../Model/ModelHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllTransactionsUsingGET**
> \com\hydrogen\Model\PageModelTransaction_ getAllTransactionsUsingGET($allocation_id, $ascending, $end_date, $order_by, $page, $size, $start_date)

List all allocation transactions

Get the information for all transactions made under an allocation to achieve the composition of the allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | UUID allocation_id
$ascending = false; // bool | ascending
$end_date = new \DateTime("null"); // \DateTime | end_date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("null"); // \DateTime | start_date

try {
    $result = $apiInstance->getAllTransactionsUsingGET($allocation_id, $ascending, $end_date, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllTransactionsUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **\DateTime**| end_date | [optional] [default to null]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start_date | [optional] [default to null]

### Return type

[**\com\hydrogen\Model\PageModelTransaction_**](../Model/PageModelTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationAggregatedDataUsingGET**
> \com\hydrogen\Model\AllocationAggregatedVO getAllocationAggregatedDataUsingGET($allocation_id)

List all Allocation aggregated data overview

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | Allocation Id

try {
    $result = $apiInstance->getAllocationAggregatedDataUsingGET($allocation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllocationAggregatedDataUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| Allocation Id |

### Return type

[**\com\hydrogen\Model\AllocationAggregatedVO**](../Model/AllocationAggregatedVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationAllUsingGet**
> \com\hydrogen\Model\PageAllocation_ getAllocationAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all allocations

Get details for all allocations defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
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
    $result = $apiInstance->getAllocationAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllocationAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAllocation_**](../Model/PageAllocation_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationCompositionAllUsingGet**
> \com\hydrogen\Model\PageAllocationComposition_ getAllocationCompositionAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all allocations compositions

Get the allocation composition for all allocations.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
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
    $result = $apiInstance->getAllocationCompositionAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllocationCompositionAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAllocationComposition_**](../Model/PageAllocationComposition_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationCompositionUsingGet**
> \com\hydrogen\Model\AllocationComposition getAllocationCompositionUsingGet($allocation_composition_id)

Retrieve an allocation composition

Retrieve the information of an allocation composition record for an allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_composition_id = "allocation_composition_id_example"; // string | UUID allocation_composition_id

try {
    $result = $apiInstance->getAllocationCompositionUsingGet($allocation_composition_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllocationCompositionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**string**](../Model/.md)| UUID allocation_composition_id |

### Return type

[**\com\hydrogen\Model\AllocationComposition**](../Model/AllocationComposition.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationUsingGet**
> \com\hydrogen\Model\Allocation getAllocationUsingGet($allocation_id)

Retrieve an allocation

Retrieve the information for an allocation defined by your firm.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | UUID allocation_id

try {
    $result = $apiInstance->getAllocationUsingGet($allocation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAllocationUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |

### Return type

[**\com\hydrogen\Model\Allocation**](../Model/Allocation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAssetsizeUsingGET**
> \com\hydrogen\Model\DateDoubleVO[] getAssetsizeUsingGET($allocation_id, $end_date, $get_latest, $is_current_weight, $sort_type, $start_date)

List all allocation asset sizes

Get a list of asset sizes by date for a specific allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | UUID allocation_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$get_latest = true; // bool | get_latest
$is_current_weight = true; // bool | is_current_weight
$sort_type = "sort_type_example"; // string | D (Daily), Q (quarterly), M (Monthly), Y (Annually)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getAssetsizeUsingGET($allocation_id, $end_date, $get_latest, $is_current_weight, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->getAssetsizeUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |
 **end_date** | **\DateTime**| end date | [optional]
 **get_latest** | **bool**| get_latest | [optional]
 **is_current_weight** | **bool**| is_current_weight | [optional] [default to true]
 **sort_type** | **string**| D (Daily), Q (quarterly), M (Monthly), Y (Annually) | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\Model\DateDoubleVO[]**](../Model/DateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAllocationCompositionUsingPut**
> \com\hydrogen\Model\AllocationComposition updateAllocationCompositionUsingPut($allocation_composition, $allocation_composition_id)

Update an allocation composition

Update the information of an allocation composition record for an allocation.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_composition = new \com\hydrogen\Model\AllocationComposition(); // \com\hydrogen\Model\AllocationComposition | aggregation_composition
$allocation_composition_id = "allocation_composition_id_example"; // string | UUID allocation_composition_id

try {
    $result = $apiInstance->updateAllocationCompositionUsingPut($allocation_composition, $allocation_composition_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->updateAllocationCompositionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition** | [**\com\hydrogen\Model\AllocationComposition**](../Model/AllocationComposition.md)| aggregation_composition |
 **allocation_composition_id** | [**string**](../Model/.md)| UUID allocation_composition_id |

### Return type

[**\com\hydrogen\Model\AllocationComposition**](../Model/AllocationComposition.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAllocationUsingPut**
> \com\hydrogen\Model\Allocation updateAllocationUsingPut($allocation, $allocation_id)

Update an allocation

Update an allocation defined by your firm.

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
$apiInstance = new com\hydrogen\Api\AllocationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation = new \com\hydrogen\Model\Allocation(); // \com\hydrogen\Model\Allocation | allocation
$allocation_id = "allocation_id_example"; // string | UUID allocation_id

try {
    $result = $apiInstance->updateAllocationUsingPut($allocation, $allocation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllocationApi->updateAllocationUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | [**\com\hydrogen\Model\Allocation**](../Model/Allocation.md)| allocation |
 **allocation_id** | [**string**](../Model/.md)| UUID allocation_id |

### Return type

[**\com\hydrogen\Model\Allocation**](../Model/Allocation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

