# BenchmarkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBenchmarkUsingPost**](BenchmarkApi.md#createBenchmarkUsingPost) | **POST** /benchmark | Create a benchmark
[**deleteBenchmarkUsingDelete**](BenchmarkApi.md#deleteBenchmarkUsingDelete) | **DELETE** /benchmark/{benchmark_id} | Delete a benchmark
[**getBenchmarkAllUsingGet**](BenchmarkApi.md#getBenchmarkAllUsingGet) | **GET** /benchmark | List all benchmarks
[**getBenchmarkAssetSizeAllUsingGet**](BenchmarkApi.md#getBenchmarkAssetSizeAllUsingGet) | **GET** /benchmark/{benchmark_id}/asset_size | List all benchmark asset sizes
[**getBenchmarkUsingGet**](BenchmarkApi.md#getBenchmarkUsingGet) | **GET** /benchmark/{benchmark_id} | Retrieve a benchmark
[**updateBenchmarkUsingPut**](BenchmarkApi.md#updateBenchmarkUsingPut) | **PUT** /benchmark/{benchmark_id} | Update a benchmark


<a name="createBenchmarkUsingPost"></a>
# **createBenchmarkUsingPost**
> Benchmark createBenchmarkUsingPost(benchmark)

Create a benchmark

Create a new benchmark for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
Benchmark benchmark = new Benchmark(); // Benchmark | benchmark
try {
    Benchmark result = apiInstance.createBenchmarkUsingPost(benchmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#createBenchmarkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark |

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBenchmarkUsingDelete"></a>
# **deleteBenchmarkUsingDelete**
> deleteBenchmarkUsingDelete(benchmarkId)

Delete a benchmark

Permanently delete a benchmark.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
UUID benchmarkId = new UUID(); // UUID | UUID benchmark_id
try {
    apiInstance.deleteBenchmarkUsingDelete(benchmarkId);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#deleteBenchmarkUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**UUID**](.md)| UUID benchmark_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkAllUsingGet"></a>
# **getBenchmarkAllUsingGet**
> PageBenchmark getBenchmarkAllUsingGet(ascending, filter, orderBy, page, size)

List all benchmarks

Get details for all benchmarks defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageBenchmark result = apiInstance.getBenchmarkAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#getBenchmarkAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageBenchmark**](PageBenchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkAssetSizeAllUsingGet"></a>
# **getBenchmarkAssetSizeAllUsingGet**
> List&lt;DateDoubleVO&gt; getBenchmarkAssetSizeAllUsingGet(benchmarkId, endDate, sortType, startDate)

List all benchmark asset sizes

Get a list of asset sizes by date for a benchmark.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
UUID benchmarkId = new UUID(); // UUID | UUID benchmark_id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
String sortType = "sortType_example"; // String | sort_type
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<DateDoubleVO> result = apiInstance.getBenchmarkAssetSizeAllUsingGet(benchmarkId, endDate, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#getBenchmarkAssetSizeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**UUID**](.md)| UUID benchmark_id |
 **endDate** | **LocalDate**| end date | [optional]
 **sortType** | **String**| sort_type | [optional]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**List&lt;DateDoubleVO&gt;**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkUsingGet"></a>
# **getBenchmarkUsingGet**
> Benchmark getBenchmarkUsingGet(benchmarkId)

Retrieve a benchmark

Retrieve the information for a benchmark.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
UUID benchmarkId = new UUID(); // UUID | UUID benchmark_id
try {
    Benchmark result = apiInstance.getBenchmarkUsingGet(benchmarkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#getBenchmarkUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**UUID**](.md)| UUID benchmark_id |

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBenchmarkUsingPut"></a>
# **updateBenchmarkUsingPut**
> Benchmark updateBenchmarkUsingPut(benchmark, benchmarkId)

Update a benchmark

Updated the information for a benchmark.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BenchmarkApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


BenchmarkApi apiInstance = new BenchmarkApi();
Benchmark benchmark = new Benchmark(); // Benchmark | benchmark
UUID benchmarkId = new UUID(); // UUID | UUID benchmark_id
try {
    Benchmark result = apiInstance.updateBenchmarkUsingPut(benchmark, benchmarkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BenchmarkApi#updateBenchmarkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark |
 **benchmarkId** | [**UUID**](.md)| UUID benchmark_id |

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

