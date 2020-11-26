# com\hydrogen\nucleus\BenchmarkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBenchmarkUsingPost**](BenchmarkApi.md#createBenchmarkUsingPost) | **POST** /benchmark | Create a benchmark
[**deleteBenchmarkUsingDelete**](BenchmarkApi.md#deleteBenchmarkUsingDelete) | **DELETE** /benchmark/{benchmark_id} | Delete a benchmark
[**getBenchmarkAllUsingGet**](BenchmarkApi.md#getBenchmarkAllUsingGet) | **GET** /benchmark | List all benchmarks
[**getBenchmarkAssetSizeAllUsingGet**](BenchmarkApi.md#getBenchmarkAssetSizeAllUsingGet) | **GET** /benchmark/{benchmark_id}/asset_size | List all benchmark asset sizes
[**getBenchmarkUsingGet**](BenchmarkApi.md#getBenchmarkUsingGet) | **GET** /benchmark/{benchmark_id} | Retrieve a benchmark
[**updateBenchmarkUsingPut**](BenchmarkApi.md#updateBenchmarkUsingPut) | **PUT** /benchmark/{benchmark_id} | Update a benchmark


# **createBenchmarkUsingPost**
> \com\hydrogen\nucleus\Model\Benchmark createBenchmarkUsingPost($benchmark)

Create a benchmark

Create a new benchmark for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark = new \com\hydrogen\nucleus\Model\Benchmark(); // \com\hydrogen\nucleus\Model\Benchmark | benchmark

try {
    $result = $apiInstance->createBenchmarkUsingPost($benchmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->createBenchmarkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**\com\hydrogen\nucleus\Model\Benchmark**](../Model/Benchmark.md)| benchmark |

### Return type

[**\com\hydrogen\nucleus\Model\Benchmark**](../Model/Benchmark.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBenchmarkUsingDelete**
> deleteBenchmarkUsingDelete($benchmark_id)

Delete a benchmark

Permanently delete a benchmark.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark_id = "benchmark_id_example"; // string | UUID benchmark_id

try {
    $apiInstance->deleteBenchmarkUsingDelete($benchmark_id);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->deleteBenchmarkUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**string**](../Model/.md)| UUID benchmark_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBenchmarkAllUsingGet**
> \com\hydrogen\nucleus\Model\PageBenchmark_ getBenchmarkAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all benchmarks

Get details for all benchmarks defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
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
    $result = $apiInstance->getBenchmarkAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->getBenchmarkAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageBenchmark_**](../Model/PageBenchmark_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBenchmarkAssetSizeAllUsingGet**
> \com\hydrogen\nucleus\Model\DateDoubleVO[] getBenchmarkAssetSizeAllUsingGet($benchmark_id, $end_date, $sort_type, $start_date)

List all benchmark asset sizes

Get a list of asset sizes by date for a benchmark.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark_id = "benchmark_id_example"; // string | UUID benchmark_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$sort_type = "sort_type_example"; // string | sort_type
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getBenchmarkAssetSizeAllUsingGet($benchmark_id, $end_date, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->getBenchmarkAssetSizeAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**string**](../Model/.md)| UUID benchmark_id |
 **end_date** | **\DateTime**| end date | [optional]
 **sort_type** | **string**| sort_type | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\DateDoubleVO[]**](../Model/DateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBenchmarkUsingGet**
> \com\hydrogen\nucleus\Model\Benchmark getBenchmarkUsingGet($benchmark_id)

Retrieve a benchmark

Retrieve the information for a benchmark.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark_id = "benchmark_id_example"; // string | UUID benchmark_id

try {
    $result = $apiInstance->getBenchmarkUsingGet($benchmark_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->getBenchmarkUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**string**](../Model/.md)| UUID benchmark_id |

### Return type

[**\com\hydrogen\nucleus\Model\Benchmark**](../Model/Benchmark.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBenchmarkUsingPut**
> \com\hydrogen\nucleus\Model\Benchmark updateBenchmarkUsingPut($benchmark, $benchmark_id)

Update a benchmark

Updated the information for a benchmark.

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
$apiInstance = new com\hydrogen\nucleus\Api\BenchmarkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark = new \com\hydrogen\nucleus\Model\Benchmark(); // \com\hydrogen\nucleus\Model\Benchmark | benchmark
$benchmark_id = "benchmark_id_example"; // string | UUID benchmark_id

try {
    $result = $apiInstance->updateBenchmarkUsingPut($benchmark, $benchmark_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BenchmarkApi->updateBenchmarkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**\com\hydrogen\nucleus\Model\Benchmark**](../Model/Benchmark.md)| benchmark |
 **benchmark_id** | [**string**](../Model/.md)| UUID benchmark_id |

### Return type

[**\com\hydrogen\nucleus\Model\Benchmark**](../Model/Benchmark.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

