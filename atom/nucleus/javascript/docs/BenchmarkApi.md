# HydrogenNucleusApi.BenchmarkApi

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createBenchmark();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createBenchmark = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var benchmark = new HydrogenNucleusApi.Benchmark(); // Benchmark | benchmark
    apiInstance.createBenchmarkUsingPost(benchmark, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteBenchmark();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteBenchmark = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var benchmarkId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID benchmark_id
    apiInstance.deleteBenchmarkUsingDelete(benchmarkId, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | **String**| UUID benchmark_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkAllUsingGet"></a>
# **getBenchmarkAllUsingGet**
> PageBenchmark getBenchmarkAllUsingGet(opts)

List all benchmarks

Get details for all benchmarks defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getBenchmarkAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getBenchmarkAll = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getBenchmarkAllUsingGet(opts, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageBenchmark**](PageBenchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkAssetSizeAllUsingGet"></a>
# **getBenchmarkAssetSizeAllUsingGet**
> [DateDoubleVO] getBenchmarkAssetSizeAllUsingGet(benchmarkId, opts)

List all benchmark asset sizes

Get a list of asset sizes by date for a benchmark.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getBenchmarkAssetSizeAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getBenchmarkAssetSizeAll = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var benchmarkId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID benchmark_id
    var opts = { 
      'endDate': new Date("2013-10-20"), // Date | end date
      'sortType': "sortType_example", // String | sort_type
      'startDate': new Date("2013-10-20") // Date | start date
    };
    apiInstance.getBenchmarkAssetSizeAllUsingGet(benchmarkId, opts, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | **String**| UUID benchmark_id | 
 **endDate** | **Date**| end date | [optional] 
 **sortType** | **String**| sort_type | [optional] 
 **startDate** | **Date**| start date | [optional] 

### Return type

[**[DateDoubleVO]**](DateDoubleVO.md)

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getBenchmark();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getBenchmark = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var benchmarkId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID benchmark_id
    apiInstance.getBenchmarkUsingGet(benchmarkId, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | **String**| UUID benchmark_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateBenchmark();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateBenchmark = () => {
    var apiInstance = new HydrogenNucleusApi.BenchmarkApi();
    var benchmark = new HydrogenNucleusApi.Benchmark(); // Benchmark | benchmark
    var benchmarkId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID benchmark_id
    apiInstance.updateBenchmarkUsingPut(benchmark, benchmarkId, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark | 
 **benchmarkId** | **String**| UUID benchmark_id | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

