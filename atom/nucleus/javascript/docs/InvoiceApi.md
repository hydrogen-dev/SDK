# HydrogenNucleusApi.InvoiceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoicePaymentUsingPost**](InvoiceApi.md#createInvoicePaymentUsingPost) | **POST** /invoice_payment | Create a invoicePayment
[**createInvoiceUsingPost**](InvoiceApi.md#createInvoiceUsingPost) | **POST** /invoice | Create a invoice
[**deleteInvoicePaymentUsingDelete**](InvoiceApi.md#deleteInvoicePaymentUsingDelete) | **DELETE** /invoice_payment/{invoice_payment_id} | Delete a invoicePayment
[**deleteInvoiceUsingDelete**](InvoiceApi.md#deleteInvoiceUsingDelete) | **DELETE** /invoice/{invoice_id} | Delete a invoice
[**getInvoiceAllUsingGet**](InvoiceApi.md#getInvoiceAllUsingGet) | **GET** /invoice | List all invoice
[**getInvoicePaymentAllUsingGet**](InvoiceApi.md#getInvoicePaymentAllUsingGet) | **GET** /invoice_payment | List all invoicePayment
[**getInvoicePaymentUsingGet**](InvoiceApi.md#getInvoicePaymentUsingGet) | **GET** /invoice_payment/{invoice_payment_id} | Retrieve a invoicePayment
[**getInvoiceUsingGet**](InvoiceApi.md#getInvoiceUsingGet) | **GET** /invoice/{invoice_id} | Retrieve a invoice
[**updateInvoicePaymentUsingPut**](InvoiceApi.md#updateInvoicePaymentUsingPut) | **PUT** /invoice_payment/{invoice_payment_id} | Update a invoicePayment
[**updateInvoiceUsingPut**](InvoiceApi.md#updateInvoiceUsingPut) | **PUT** /invoice/{invoice_id} | Update a invoice


<a name="createInvoicePaymentUsingPost"></a>
# **createInvoicePaymentUsingPost**
> InvoicePayment createInvoicePaymentUsingPost(invoicePayment)

Create a invoicePayment

Create a new invoicePayment, for tracking invoice status.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoicePayment = new HydrogenNucleusApi.InvoicePayment(); // InvoicePayment | invoicePayment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createInvoicePaymentUsingPost(invoicePayment, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePayment** | [**InvoicePayment**](InvoicePayment.md)| invoicePayment | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInvoiceUsingPost"></a>
# **createInvoiceUsingPost**
> Invoice createInvoiceUsingPost(invoice)

Create a invoice

Create a new invoice, with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoice = new HydrogenNucleusApi.Invoice(); // Invoice | invoice


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createInvoiceUsingPost(invoice, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInvoicePaymentUsingDelete"></a>
# **deleteInvoicePaymentUsingDelete**
> deleteInvoicePaymentUsingDelete(invoicePaymentId)

Delete a invoicePayment

Delete a invoicePayment. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoicePaymentId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID invoice_payment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteInvoicePaymentUsingDelete(invoicePaymentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePaymentId** | **String**| UUID invoice_payment_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInvoiceUsingDelete"></a>
# **deleteInvoiceUsingDelete**
> deleteInvoiceUsingDelete(invoiceId)

Delete a invoice

Delete a invoice. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoiceId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID invoice_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteInvoiceUsingDelete(invoiceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| UUID invoice_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceAllUsingGet"></a>
# **getInvoiceAllUsingGet**
> PageInvoice getInvoiceAllUsingGet(opts)

List all invoice

List all invoice. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

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
apiInstance.getInvoiceAllUsingGet(opts, callback);
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

[**PageInvoice**](PageInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoicePaymentAllUsingGet"></a>
# **getInvoicePaymentAllUsingGet**
> PageInvoicePayment getInvoicePaymentAllUsingGet(opts)

List all invoicePayment

List all invoicePayment. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

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
apiInstance.getInvoicePaymentAllUsingGet(opts, callback);
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

[**PageInvoicePayment**](PageInvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoicePaymentUsingGet"></a>
# **getInvoicePaymentUsingGet**
> InvoicePayment getInvoicePaymentUsingGet(invoicePaymentId)

Retrieve a invoicePayment

Retrieve a invoicePayment. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoicePaymentId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID invoice_payment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInvoicePaymentUsingGet(invoicePaymentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePaymentId** | **String**| UUID invoice_payment_id | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceUsingGet"></a>
# **getInvoiceUsingGet**
> Invoice getInvoiceUsingGet(invoiceId)

Retrieve a invoice

Retrieve a invoice. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoiceId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID invoice_idd


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInvoiceUsingGet(invoiceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| UUID invoice_idd | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInvoicePaymentUsingPut"></a>
# **updateInvoicePaymentUsingPut**
> InvoicePayment updateInvoicePaymentUsingPut(invoicePayment, invoicePaymentId)

Update a invoicePayment

Update a invoicePayment. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoicePayment = new HydrogenNucleusApi.InvoicePayment(); // InvoicePayment | invoice_payment

var invoicePaymentId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID invoice_payment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInvoicePaymentUsingPut(invoicePayment, invoicePaymentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePayment** | [**InvoicePayment**](InvoicePayment.md)| invoice_payment | 
 **invoicePaymentId** | **String**| UUID invoice_payment_id | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInvoiceUsingPut"></a>
# **updateInvoiceUsingPut**
> Invoice updateInvoiceUsingPut(invoice, invoiceId)

Update a invoice

Update a invoice. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InvoiceApi();

var invoice = new HydrogenNucleusApi.Invoice(); // Invoice | invoice

var invoiceId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID invoice_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInvoiceUsingPut(invoice, invoiceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 
 **invoiceId** | **String**| UUID invoice_id | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

