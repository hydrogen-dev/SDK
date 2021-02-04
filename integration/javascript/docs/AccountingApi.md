# HydrogenIntegrationApi.AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateCustomer**](AccountingApi.md#createOrUpdateCustomer) | **GET** /accounting/customer | Update/Create all customers in Nucleus for a given nucleus_client_id
[**createOrUpdateCustomerRevenue**](AccountingApi.md#createOrUpdateCustomerRevenue) | **GET** /accounting/customer_revenue/{nucleus_customer_id} | Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
[**createOrUpdateInvoicePayment**](AccountingApi.md#createOrUpdateInvoicePayment) | **GET** /accounting/invoice_payment/{nucleus_invoice_id} | Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
[**createOrUpdateInvoices**](AccountingApi.md#createOrUpdateInvoices) | **GET** /accounting/invoice | Update/Create all invoices in Nucleus for a given nucleus_client_id
[**deleteAccountingVendorAccessConfigIsActiveById**](AccountingApi.md#deleteAccountingVendorAccessConfigIsActiveById) | **DELETE** /accounting/vendor/{id} | Permanently delete relation with particular accounting vendor.
[**getAccountingStats**](AccountingApi.md#getAccountingStats) | **GET** /accounting/report | Get accounting stats from financial statements at the vendor for the business provided
[**getAccountingVendorInfoUsingClientId**](AccountingApi.md#getAccountingVendorInfoUsingClientId) | **GET** /accounting/vendor/{nucleus_client_id} | Get Accounting Vendor Config
[**updateAccountingVendorAccessConfigIsActiveById**](AccountingApi.md#updateAccountingVendorAccessConfigIsActiveById) | **PUT** /accounting/vendor/{id} | Enable/Disable relation with particular accounting vendor.
[**updateCustomer**](AccountingApi.md#updateCustomer) | **GET** /accounting/customer/{nucleus_customer_id} | Update customer in Nucleus for a given nucleus_customer_id
[**updateInvoice**](AccountingApi.md#updateInvoice) | **GET** /accounting/invoice/{nucleus_invoice_id} | Update invoice in Nucleus for a given nucleus_invoice_id


<a name="createOrUpdateCustomer"></a>
# **createOrUpdateCustomer**
> AccountingFinalResponseVO createOrUpdateCustomer(nucleusClientId)

Update/Create all customers in Nucleus for a given nucleus_client_id

Update/Create all customers in Nucleus for a given nucleus_client_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrUpdateCustomer(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateCustomerRevenue"></a>
# **createOrUpdateCustomerRevenue**
> AccountingFinalResponseVO createOrUpdateCustomerRevenue(nucleusCustomerId, startDate, opts)

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusCustomerId = "nucleusCustomerId_example"; // String | nucleus_customer_id

var startDate = new Date("2013-10-20T19:20:30+01:00"); // Date | start_date

var opts = { 
  'accountingMethod': "accrual", // String | accounting_method
  'endDate': new Date("null") // Date | end_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrUpdateCustomerRevenue(nucleusCustomerId, startDate, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**String**](.md)| nucleus_customer_id | 
 **startDate** | **Date**| start_date | 
 **accountingMethod** | **String**| accounting_method | [optional] [default to accrual]
 **endDate** | **Date**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateInvoicePayment"></a>
# **createOrUpdateInvoicePayment**
> AccountingFinalResponseVO createOrUpdateInvoicePayment(nucleusInvoiceId)

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusInvoiceId = "nucleusInvoiceId_example"; // String | nucleus_invoice_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrUpdateInvoicePayment(nucleusInvoiceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusInvoiceId** | [**String**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateInvoices"></a>
# **createOrUpdateInvoices**
> AccountingFinalResponseVO createOrUpdateInvoices(nucleusCustomerId, startDate, opts)

Update/Create all invoices in Nucleus for a given nucleus_client_id

Update/Create all invoices in Nucleus for a given nucleus_client_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusCustomerId = "nucleusCustomerId_example"; // String | nucleus_customer_id

var startDate = new Date("2013-10-20T19:20:30+01:00"); // Date | start_date

var opts = { 
  'endDate': new Date("null") // Date | end_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrUpdateInvoices(nucleusCustomerId, startDate, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**String**](.md)| nucleus_customer_id | 
 **startDate** | **Date**| start_date | 
 **endDate** | **Date**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAccountingVendorAccessConfigIsActiveById"></a>
# **deleteAccountingVendorAccessConfigIsActiveById**
> deleteAccountingVendorAccessConfigIsActiveById(id)

Permanently delete relation with particular accounting vendor.

Permanently delete relation with particular accounting vendor.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var id = "id_example"; // String | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountingVendorAccessConfigIsActiveById(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingStats"></a>
# **getAccountingStats**
> AccountingFinalResponseVO getAccountingStats(opts)

Get accounting stats from financial statements at the vendor for the business provided

Get accounting stats from financial statements at the vendor for the business provided

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var opts = { 
  'accountingMethod': "accrual", // String | accounting_method
  'nucleusClientId': "nucleusClientId_example", // String | nucleus_client_id
  'periodLength': "periodLength_example", // String | period_length
  'periodMonth': 56, // Number | period_month
  'periodQuarter': 56, // Number | period_quarter
  'periodType': "periodType_example", // String | period_type
  'periodYear': 56, // Number | period_year
  'report': "report_example", // String | report
  'statementDate': new Date("2013-10-20T19:20:30+01:00") // Date | statement_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountingStats(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingMethod** | **String**| accounting_method | [optional] [default to accrual]
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | [optional] 
 **periodLength** | **String**| period_length | [optional] 
 **periodMonth** | **Number**| period_month | [optional] 
 **periodQuarter** | **Number**| period_quarter | [optional] 
 **periodType** | **String**| period_type | [optional] 
 **periodYear** | **Number**| period_year | [optional] 
 **report** | **String**| report | [optional] 
 **statementDate** | **Date**| statement_date | [optional] 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountingVendorInfoUsingClientId"></a>
# **getAccountingVendorInfoUsingClientId**
> VendorAccessConfigVO getAccountingVendorInfoUsingClientId(nucleusClientId)

Get Accounting Vendor Config

Get Accounting vendor config information with its status.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountingVendorInfoUsingClientId(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAccountingVendorAccessConfigIsActiveById"></a>
# **updateAccountingVendorAccessConfigIsActiveById**
> VendorAccessConfigVO updateAccountingVendorAccessConfigIsActiveById(id, isActive)

Enable/Disable relation with particular accounting vendor.

Enable/Disable link with particular accounting vendor.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var id = "id_example"; // String | id

var isActive = true; // Boolean | is_active


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountingVendorAccessConfigIsActiveById(id, isActive, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **isActive** | **Boolean**| is_active | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCustomer"></a>
# **updateCustomer**
> AccountingFinalResponseVO updateCustomer(nucleusCustomerId)

Update customer in Nucleus for a given nucleus_customer_id

Update customer in Nucleus for a given nucleus_customer_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusCustomerId = "nucleusCustomerId_example"; // String | nucleus_customer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCustomer(nucleusCustomerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**String**](.md)| nucleus_customer_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInvoice"></a>
# **updateInvoice**
> AccountingFinalResponseVO updateInvoice(nucleusInvoiceId)

Update invoice in Nucleus for a given nucleus_invoice_id

Update invoice in Nucleus for a given nucleus_invoice_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AccountingApi();

var nucleusInvoiceId = "nucleusInvoiceId_example"; // String | nucleus_invoice_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInvoice(nucleusInvoiceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusInvoiceId** | [**String**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

