# HydrogenIntegrationApi.UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenExchangeUsingPost**](UtilsApi.md#createTokenExchangeUsingPost) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**createUserUsingPost**](UtilsApi.md#createUserUsingPost) | **POST** /user | Create user in vendor
[**getAuditLogAllUsingGet**](UtilsApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | Gel all audit log
[**getWidgetLinkUsingGet**](UtilsApi.md#getWidgetLinkUsingGet) | **GET** /widget_link/{nucleus_client_id} | Retrieve widget link


<a name="createTokenExchangeUsingPost"></a>
# **createTokenExchangeUsingPost**
> ExchangePublicTokenVO createTokenExchangeUsingPost(exchangeTokenCO)

Retrieve token based on certain vendor specific value

Retrieve the token.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.UtilsApi();

var exchangeTokenCO = new HydrogenIntegrationApi.ExchangeTokenCO(); // ExchangeTokenCO | exchangeTokenCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createTokenExchangeUsingPost(exchangeTokenCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeTokenCO** | [**ExchangeTokenCO**](ExchangeTokenCO.md)| exchangeTokenCO | 

### Return type

[**ExchangePublicTokenVO**](ExchangePublicTokenVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserUsingPost"></a>
# **createUserUsingPost**
> UserResponseVO createUserUsingPost(createUserRequest)

Create user in vendor

Create user in vendor.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.UtilsApi();

var createUserRequest = new HydrogenIntegrationApi.CreateUserRequest(); // CreateUserRequest | createUserRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createUserUsingPost(createUserRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| createUserRequest | 

### Return type

[**UserResponseVO**](UserResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

var apiInstance = new HydrogenIntegrationApi.UtilsApi();

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

<a name="getWidgetLinkUsingGet"></a>
# **getWidgetLinkUsingGet**
> WidgetUrlVO getWidgetLinkUsingGet(nucleusClientId, opts)

Retrieve widget link

Retrieve the widget link.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.UtilsApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id

var opts = { 
  'isMobileWebview': false, // Boolean | is_mobile_webview
  'mode': "aggregation", // String | mode
  'vendorName': "vendorName_example" // String | vendor_name
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWidgetLinkUsingGet(nucleusClientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 
 **isMobileWebview** | **Boolean**| is_mobile_webview | [optional] [default to false]
 **mode** | **String**| mode | [optional] [default to aggregation]
 **vendorName** | **String**| vendor_name | [optional] 

### Return type

[**WidgetUrlVO**](WidgetUrlVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

