# HydrogenIntegrationApi.KYCApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKYCUsingPost**](KYCApi.md#createKYCUsingPost) | **POST** /kyc | Do kyc for the client.
[**getKYCStatusUsingGet**](KYCApi.md#getKYCStatusUsingGet) | **GET** /kyc_status | Fetch kyc_status for the given nucleus_client_id


<a name="createKYCUsingPost"></a>
# **createKYCUsingPost**
> KycResponseVo createKYCUsingPost(kycRequestCO)

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

var kycRequestCO = new HydrogenIntegrationApi.KycRequestCO(); // KycRequestCO | kycRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createKYCUsingPost(kycRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> [KycResponseVo] getKYCStatusUsingGet(opts)

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

var opts = { 
  'getLatest': false, // Boolean | get_latest
  'kycType': "all", // String | kyc_type
  'nucleusBusinessId': "nucleusBusinessId_example", // String | nucleus_business_id
  'nucleusClientId': "nucleusClientId_example", // String | nucleus_client_id
  'product': "atom" // String | product
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getKYCStatusUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getLatest** | **Boolean**| get_latest | [optional] [default to false]
 **kycType** | **String**| kyc_type | [optional] [default to all]
 **nucleusBusinessId** | [**String**](.md)| nucleus_business_id | [optional] 
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | [optional] 
 **product** | **String**| product | [optional] [default to atom]

### Return type

[**[KycResponseVo]**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

