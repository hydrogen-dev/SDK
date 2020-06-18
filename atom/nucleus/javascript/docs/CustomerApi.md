# HydrogenNucleusApi.CustomerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerRevenueUsingPost**](CustomerApi.md#createCustomerRevenueUsingPost) | **POST** /customer_revenue | Create a customer revenue
[**createCustomerUsingPost**](CustomerApi.md#createCustomerUsingPost) | **POST** /customer | Create a customer
[**deleteCustomerRevenueUsingDelete**](CustomerApi.md#deleteCustomerRevenueUsingDelete) | **DELETE** /customer_revenue/{customer_revenue_id} | Delete a customer revenue
[**deleteCustomerUsingDelete**](CustomerApi.md#deleteCustomerUsingDelete) | **DELETE** /customer/{customer_id} | Delete a customer
[**getCustomerAllUsingGet**](CustomerApi.md#getCustomerAllUsingGet) | **GET** /customer | List all customer
[**getCustomerRevenueAllUsingGet**](CustomerApi.md#getCustomerRevenueAllUsingGet) | **GET** /customer_revenue | List all customer revenue
[**getCustomerRevenueUsingGet**](CustomerApi.md#getCustomerRevenueUsingGet) | **GET** /customer_revenue/{customer_revenue_id} | Retrieve a customer revenue
[**getCustomerUsingGet**](CustomerApi.md#getCustomerUsingGet) | **GET** /customer/{customer_id} | Retrieve a customer
[**updateCustomerRevenueUsingPut**](CustomerApi.md#updateCustomerRevenueUsingPut) | **PUT** /customer_revenue/{customer_revenue_id} | Update a customer revenue
[**updateCustomerUsingPut**](CustomerApi.md#updateCustomerUsingPut) | **PUT** /customer/{customer_id} | Update a customer


<a name="createCustomerRevenueUsingPost"></a>
# **createCustomerRevenueUsingPost**
> CustomerRevenue createCustomerRevenueUsingPost(customerRevenue)

Create a customer revenue

Create a new customer revenue, with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerRevenue = new HydrogenNucleusApi.CustomerRevenue(); // CustomerRevenue | customerRevenue


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomerRevenueUsingPost(customerRevenue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenue** | [**CustomerRevenue**](CustomerRevenue.md)| customerRevenue | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCustomerUsingPost"></a>
# **createCustomerUsingPost**
> Customer createCustomerUsingPost(customer)

Create a customer

Create a new customer, with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customer = new HydrogenNucleusApi.Customer(); // Customer | customer


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomerUsingPost(customer, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCustomerRevenueUsingDelete"></a>
# **deleteCustomerRevenueUsingDelete**
> deleteCustomerRevenueUsingDelete(customerRevenueId)

Delete a customer revenue

Delete a customer revenue. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerRevenueId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_revenue_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomerRevenueUsingDelete(customerRevenueId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenueId** | **String**| UUID customer_revenue_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCustomerUsingDelete"></a>
# **deleteCustomerUsingDelete**
> deleteCustomerUsingDelete(customerId)

Delete a customer

Delete a customer. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomerUsingDelete(customerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| UUID customer_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerAllUsingGet"></a>
# **getCustomerAllUsingGet**
> PageCustomer getCustomerAllUsingGet(opts)

List all customer

List all customer. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

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
apiInstance.getCustomerAllUsingGet(opts, callback);
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

[**PageCustomer**](PageCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerRevenueAllUsingGet"></a>
# **getCustomerRevenueAllUsingGet**
> PageCustomerRevenue getCustomerRevenueAllUsingGet(opts)

List all customer revenue

List all customer revenue. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

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
apiInstance.getCustomerRevenueAllUsingGet(opts, callback);
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

[**PageCustomerRevenue**](PageCustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerRevenueUsingGet"></a>
# **getCustomerRevenueUsingGet**
> CustomerRevenue getCustomerRevenueUsingGet(customerRevenueId)

Retrieve a customer revenue

Retrieve a customer revenue. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerRevenueId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_revenue_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCustomerRevenueUsingGet(customerRevenueId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenueId** | **String**| UUID customer_revenue_id | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerUsingGet"></a>
# **getCustomerUsingGet**
> Customer getCustomerUsingGet(customerId)

Retrieve a customer

Retrieve a customer. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCustomerUsingGet(customerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCustomerRevenueUsingPut"></a>
# **updateCustomerRevenueUsingPut**
> CustomerRevenue updateCustomerRevenueUsingPut(customerRevenue, customerRevenueId)

Update a customer revenue

Update a customer revenue. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customerRevenue = new HydrogenNucleusApi.CustomerRevenue(); // CustomerRevenue | customer_revenue

var customerRevenueId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_revenue_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCustomerRevenueUsingPut(customerRevenue, customerRevenueId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenue** | [**CustomerRevenue**](CustomerRevenue.md)| customer_revenue | 
 **customerRevenueId** | **String**| UUID customer_revenue_id | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCustomerUsingPut"></a>
# **updateCustomerUsingPut**
> Customer updateCustomerUsingPut(customer, customerId)

Update a customer

Update a customer. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CustomerApi();

var customer = new HydrogenNucleusApi.Customer(); // Customer | customer

var customerId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID customer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCustomerUsingPut(customer, customerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 
 **customerId** | **String**| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

