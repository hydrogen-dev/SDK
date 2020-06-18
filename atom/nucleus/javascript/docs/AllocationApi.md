# HydrogenNucleusApi.AllocationApi

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


<a name="createAllocationCompositionUsingPost"></a>
# **createAllocationCompositionUsingPost**
> AllocationComposition createAllocationCompositionUsingPost(allocRequest)

Create an allocation composition

Create a new allocation composition record for an allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocRequest = new HydrogenNucleusApi.AllocationComposition(); // AllocationComposition | allocRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAllocationCompositionUsingPost(allocRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocRequest** | [**AllocationComposition**](AllocationComposition.md)| allocRequest | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAllocationUsingPost"></a>
# **createAllocationUsingPost**
> Allocation createAllocationUsingPost(allocationRequest)

Create an allocation

Create a new allocation for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationRequest = new HydrogenNucleusApi.Allocation(); // Allocation | allocationRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAllocationUsingPost(allocationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationRequest** | [**Allocation**](Allocation.md)| allocationRequest | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllocationCompositionUsingDelete"></a>
# **deleteAllocationCompositionUsingDelete**
> deleteAllocationCompositionUsingDelete(allocationCompositionId)

Delete an allocation composition

Permanently delete an allocation composition record for an allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationCompositionId = "2b74355b-00eb-460b-a504-822248e50621"; // String | UUID allocation_composition_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAllocationCompositionUsingDelete(allocationCompositionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | **String**| UUID allocation_composition_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAllocationUsingDelete"></a>
# **deleteAllocationUsingDelete**
> deleteAllocationUsingDelete(allocationId)

Delete an allocation

Permanently delete an allocation defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID allocation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAllocationUsingDelete(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| UUID allocation_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllHoldingsUsingGET"></a>
# **getAllHoldingsUsingGET**
> [ModelHoldingAgg] getAllHoldingsUsingGET(allocationId, opts)

List all allocation holdings

Get the information for all securities assigned to a specific allocation. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID allocation_id

var opts = { 
  'endDate': new Date("null"), // Date | end_date
  'startDate': new Date("null") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllHoldingsUsingGET(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| UUID allocation_id | 
 **endDate** | **Date**| end_date | [optional] [default to null]
 **startDate** | **Date**| start_date | [optional] [default to null]

### Return type

[**[ModelHoldingAgg]**](ModelHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllTransactionsUsingGET"></a>
# **getAllTransactionsUsingGET**
> PageModelTransaction getAllTransactionsUsingGET(allocationId, opts)

List all allocation transactions

Get the information for all transactions made under an allocation to achieve the composition of the allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "allocationId_example"; // String | UUID allocation_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'endDate': new Date("null"), // Date | end_date
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': new Date("null") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllTransactionsUsingGET(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| UUID allocation_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **Date**| end_date | [optional] [default to null]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start_date | [optional] [default to null]

### Return type

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAggregatedDataUsingGET"></a>
# **getAllocationAggregatedDataUsingGET**
> AllocationAggregatedVO getAllocationAggregatedDataUsingGET(allocationId)

List all Allocation aggregated data overview

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | Allocation Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationAggregatedDataUsingGET(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| Allocation Id | 

### Return type

[**AllocationAggregatedVO**](AllocationAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllUsingGet"></a>
# **getAllocationAllUsingGet**
> PageAllocation getAllocationAllUsingGet(opts)

List all allocations

Get details for all allocations defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationAllUsingGet(opts, callback);
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

[**PageAllocation**](PageAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationCompositionAllUsingGet"></a>
# **getAllocationCompositionAllUsingGet**
> PageAllocationComposition getAllocationCompositionAllUsingGet(opts)

List all allocations compositions

Get the allocation composition for all allocations.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationCompositionAllUsingGet(opts, callback);
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

[**PageAllocationComposition**](PageAllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationCompositionUsingGet"></a>
# **getAllocationCompositionUsingGet**
> AllocationComposition getAllocationCompositionUsingGet(allocationCompositionId)

Retrieve an allocation composition

Retrieve the information of an allocation composition record for an allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationCompositionId = "2b74355b-00eb-460b-a504-822248e50621"; // String | UUID allocation_composition_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationCompositionUsingGet(allocationCompositionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | **String**| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationUsingGet"></a>
# **getAllocationUsingGet**
> Allocation getAllocationUsingGet(allocationId)

Retrieve an allocation

Retrieve the information for an allocation defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID allocation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationUsingGet(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAssetsizeUsingGET"></a>
# **getAssetsizeUsingGET**
> [DateDoubleVO] getAssetsizeUsingGET(allocationId, opts)

List all allocation asset sizes

Get a list of asset sizes by date for a specific allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationId = "allocationId_example"; // String | UUID allocation_id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end date
  'getLatest': true, // Boolean | get_latest
  'isCurrentWeight': true, // Boolean | is_current_weight
  'sortType': "sortType_example", // String | D (Daily), Q (quarterly), M (Monthly), Y (Annually) 
  'startDate': new Date("2013-10-20") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAssetsizeUsingGET(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| UUID allocation_id | 
 **endDate** | **Date**| end date | [optional] 
 **getLatest** | **Boolean**| get_latest | [optional] 
 **isCurrentWeight** | **Boolean**| is_current_weight | [optional] [default to true]
 **sortType** | **String**| D (Daily), Q (quarterly), M (Monthly), Y (Annually)  | [optional] 
 **startDate** | **Date**| start date | [optional] 

### Return type

[**[DateDoubleVO]**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAllocationCompositionUsingPut"></a>
# **updateAllocationCompositionUsingPut**
> AllocationComposition updateAllocationCompositionUsingPut(allocationComposition, allocationCompositionId)

Update an allocation composition

Update the information of an allocation composition record for an allocation.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocationComposition = new HydrogenNucleusApi.AllocationComposition(); // AllocationComposition | aggregation_composition

var allocationCompositionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID allocation_composition_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAllocationCompositionUsingPut(allocationComposition, allocationCompositionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationComposition** | [**AllocationComposition**](AllocationComposition.md)| aggregation_composition | 
 **allocationCompositionId** | **String**| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAllocationUsingPut"></a>
# **updateAllocationUsingPut**
> Allocation updateAllocationUsingPut(allocation, allocationId)

Update an allocation

Update an allocation defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AllocationApi();

var allocation = new HydrogenNucleusApi.Allocation(); // Allocation | allocation

var allocationId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID allocation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAllocationUsingPut(allocation, allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | [**Allocation**](Allocation.md)| allocation | 
 **allocationId** | **String**| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

