# HydrogenNucleusApi.AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuditLogUsingPost**](AuditLogApi.md#createAuditLogUsingPost) | **POST** /audit_log | Create a audit log
[**getAuditLogAllUsingGet**](AuditLogApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | List all audit log
[**getAuditLogUsingGet**](AuditLogApi.md#getAuditLogUsingGet) | **GET** /audit_log/{audit_log_id} | Retrieve a audit log


<a name="createAuditLogUsingPost"></a>
# **createAuditLogUsingPost**
> AuditLog createAuditLogUsingPost(auditLog)

Create a audit log

Create a new audit log.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AuditLogApi();

var auditLog = new HydrogenNucleusApi.AuditLog(); // AuditLog | auditLog


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAuditLogUsingPost(auditLog, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditLog** | [**AuditLog**](AuditLog.md)| auditLog | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAuditLogAllUsingGet"></a>
# **getAuditLogAllUsingGet**
> PageAuditLog getAuditLogAllUsingGet(opts)

List all audit log

Get details for all audit log.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AuditLogApi();

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
apiInstance.getAuditLogAllUsingGet(opts, callback);
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

[**PageAuditLog**](PageAuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAuditLogUsingGet"></a>
# **getAuditLogUsingGet**
> AuditLog getAuditLogUsingGet(auditLogId)

Retrieve a audit log

Retrieve the information for a audit log.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AuditLogApi();

var auditLogId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID audit_log_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAuditLogUsingGet(auditLogId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditLogId** | **String**| UUID audit_log_id | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

