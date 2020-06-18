# HydrogenIntegrationApi.IAVApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIAVUsingPost**](IAVApi.md#createIAVUsingPost) | **POST** /iav | Instant Account Verification of an account.
[**getIAVUsingGet**](IAVApi.md#getIAVUsingGet) | **GET** /iav/{nucleus_bank_link_id} | Get verified account based on id.


<a name="createIAVUsingPost"></a>
# **createIAVUsingPost**
> IavResponseVo createIAVUsingPost(iavRequestCO, opts)

Instant Account Verification of an account.

Endpoint is used to verify account.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.IAVApi();

var iavRequestCO = new HydrogenIntegrationApi.IavCO(); // IavCO | iavRequestCO

var opts = { 
  'authorization': "authorization_example" // String | Authorization
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createIAVUsingPost(iavRequestCO, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iavRequestCO** | [**IavCO**](IavCO.md)| iavRequestCO | 
 **authorization** | **String**| Authorization | [optional] 

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getIAVUsingGet"></a>
# **getIAVUsingGet**
> IavResponseVo getIAVUsingGet(authorization, nucleusBankLinkId)

Get verified account based on id.

Get verified account based on id.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.IAVApi();

var authorization = "authorization_example"; // String | Authorization

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIAVUsingGet(authorization, nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization | 
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

