# HydrogenIntegrationApi.KYCApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKYCUsingPost**](KYCApi.md#createKYCUsingPost) | **POST** /kyc | Do kyc for the client.
[**getKYCStatusUsingGet**](KYCApi.md#getKYCStatusUsingGet) | **GET** /kyc_status/{nucleus_client_id} | Fetch kyc_status for the given nucleus_client_id


<a name="createKYCUsingPost"></a>
# **createKYCUsingPost**
> KycResponseVo createKYCUsingPost(authorization, kycRequestCO)

Do kyc for the client.

Do kyc for the client.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KYCApi();

var authorization = "authorization_example"; // String | Authorization

var kycRequestCO = new HydrogenIntegrationApi.KycRequestCO(); // KycRequestCO | kycRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createKYCUsingPost(authorization, kycRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization | 
 **kycRequestCO** | [**KycRequestCO**](KycRequestCO.md)| kycRequestCO | 

### Return type

[**KycResponseVo**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getKYCStatusUsingGet"></a>
# **getKYCStatusUsingGet**
> [KycResponseVo] getKYCStatusUsingGet(authorization, nucleusClientId, opts)

Fetch kyc_status for the given nucleus_client_id

Fetch kyc_status for the given nucleus_client_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KYCApi();

var authorization = "authorization_example"; // String | Authorization

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id

var opts = { 
  'getLatest': false, // Boolean | get_latest
  'kycType': "all", // String | kyc_type
  'product': "atom" // String | product
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getKYCStatusUsingGet(authorization, nucleusClientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization | 
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 
 **getLatest** | **Boolean**| get_latest | [optional] [default to false]
 **kycType** | **String**| kyc_type | [optional] [default to all]
 **product** | **String**| product | [optional] [default to atom]

### Return type

[**[KycResponseVo]**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

