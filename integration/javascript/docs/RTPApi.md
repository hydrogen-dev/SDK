# HydrogenIntegrationApi.RTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRtpTransferUsingDelete**](RTPApi.md#cancelRtpTransferUsingDelete) | **DELETE** /rtp/{nucleus_funding_id} | Cancel the RTP transfer
[**createBankLinkUsingPost2**](RTPApi.md#createBankLinkUsingPost2) | **POST** /rtp/bank_link | Create bank link
[**deleteBankLinkUsingDelete2**](RTPApi.md#deleteBankLinkUsingDelete2) | **DELETE** /rtp/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getBankLinkUsingGet2**](RTPApi.md#getBankLinkUsingGet2) | **GET** /rtp/bank_link/{nucleus_bank_link_id} | Get bank link
[**getClientBankLinksUsingGet1**](RTPApi.md#getClientBankLinksUsingGet1) | **GET** /rtp/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfRtpTransfersUsingGet**](RTPApi.md#getListOfRtpTransfersUsingGet) | **GET** /rtp/client/{nucleus_client_id} | Get a list of Rtp transfers
[**getRtpTransferUsingGet**](RTPApi.md#getRtpTransferUsingGet) | **GET** /rtp/{nucleus_funding_id} | Get the RTP transfer
[**submitRtpTransferUsingPost**](RTPApi.md#submitRtpTransferUsingPost) | **POST** /rtp | Submit a RTP transfer
[**updateBankLinkUsingPut2**](RTPApi.md#updateBankLinkUsingPut2) | **PUT** /rtp/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelRtpTransferUsingDelete"></a>
# **cancelRtpTransferUsingDelete**
> RtpTransferResponseVO cancelRtpTransferUsingDelete(nucleusFundingId)

Cancel the RTP transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cancelRtpTransferUsingDelete(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBankLinkUsingPost2"></a>
# **createBankLinkUsingPost2**
> RtpBankLinkResponseVO createBankLinkUsingPost2(request)

Create bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var request = new HydrogenIntegrationApi.RtpBankLinkRequestCO(); // RtpBankLinkRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBankLinkUsingPost2(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RtpBankLinkRequestCO**](RtpBankLinkRequestCO.md)| request | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete2"></a>
# **deleteBankLinkUsingDelete2**
> RtpBankLinkResponseVO deleteBankLinkUsingDelete2(nucleusBankLinkId)

Delete bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBankLinkUsingDelete2(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet2"></a>
# **getBankLinkUsingGet2**
> RtpBankLinkResponseVO getBankLinkUsingGet2(nucleusBankLinkId)

Get bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinkUsingGet2(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet1"></a>
# **getClientBankLinksUsingGet1**
> [RtpBankLinkResponseVO] getClientBankLinksUsingGet1(nucleusClientId)

Get client bank links

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientBankLinksUsingGet1(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**[RtpBankLinkResponseVO]**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfRtpTransfersUsingGet"></a>
# **getListOfRtpTransfersUsingGet**
> [RtpTransferResponseVO] getListOfRtpTransfersUsingGet(nucleusClientId)

Get a list of Rtp transfers

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getListOfRtpTransfersUsingGet(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**[RtpTransferResponseVO]**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRtpTransferUsingGet"></a>
# **getRtpTransferUsingGet**
> RtpTransferResponseVO getRtpTransferUsingGet(nucleusFundingId)

Get the RTP transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRtpTransferUsingGet(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitRtpTransferUsingPost"></a>
# **submitRtpTransferUsingPost**
> RtpTransferResponseVO submitRtpTransferUsingPost(transferRequest)

Submit a RTP transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var transferRequest = new HydrogenIntegrationApi.RtpTransferRequestCO(); // RtpTransferRequestCO | transferRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitRtpTransferUsingPost(transferRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**RtpTransferRequestCO**](RtpTransferRequestCO.md)| transferRequest | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut2"></a>
# **updateBankLinkUsingPut2**
> RtpBankLinkResponseVO updateBankLinkUsingPut2(nucleusBankLinkId)

Update bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.RTPApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkUsingPut2(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

