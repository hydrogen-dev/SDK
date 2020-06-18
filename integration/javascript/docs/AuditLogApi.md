# HydrogenIntegrationApi.AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditLogAllUsingGet**](AuditLogApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | Gel all audit log


<a name="getAuditLogAllUsingGet"></a>
# **getAuditLogAllUsingGet**
> Pageobject getAuditLogAllUsingGet(opts)

Gel all audit log

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AuditLogApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'endDate': new Date("null"), // Date | end_date
  'event': "event_example", // String | event
  'integrationType': "integrationType_example", // String | integration_type
  'isRequest': false, // Boolean | is_request
  'nucleusClientId': "nucleusClientId_example", // String | nucleus_client_id
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'requestType': "requestType_example", // String | request_type
  'size': 25, // Number | size
  'startDate': new Date("null"), // Date | start_date
  'vendorName': "vendorName_example" // String | vendor_name
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
 **endDate** | **Date**| end_date | [optional] [default to null]
 **event** | **String**| event | [optional] 
 **integrationType** | **String**| integration_type | [optional] 
 **isRequest** | **Boolean**| is_request | [optional] [default to false]
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **requestType** | **String**| request_type | [optional] 
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start_date | [optional] [default to null]
 **vendorName** | **String**| vendor_name | [optional] 

### Return type

[**Pageobject**](Pageobject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

