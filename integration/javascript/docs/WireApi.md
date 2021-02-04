# HydrogenIntegrationApi.WireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelWireTransferUsingDelete**](WireApi.md#cancelWireTransferUsingDelete) | **DELETE** /wire/{nucleus_funding_id} | Cancel the Wire transfer
[**createBankLinkUsingPost3**](WireApi.md#createBankLinkUsingPost3) | **POST** /wire/bank_link | Create bank link
[**deleteBankLinkUsingDelete3**](WireApi.md#deleteBankLinkUsingDelete3) | **DELETE** /wire/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getBankLinkUsingGet3**](WireApi.md#getBankLinkUsingGet3) | **GET** /wire/bank_link/{nucleus_bank_link_id} | Get bank link
[**getClientBankLinksUsingGet2**](WireApi.md#getClientBankLinksUsingGet2) | **GET** /wire/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfWireTransfersUsingGet**](WireApi.md#getListOfWireTransfersUsingGet) | **GET** /wire/client/{nucleus_client_id} | Get a list of Wire transfers
[**getWireTransferUsingGet**](WireApi.md#getWireTransferUsingGet) | **GET** /wire/{nucleus_funding_id} | Get the Wire transfer
[**submitWireTransferUsingPost**](WireApi.md#submitWireTransferUsingPost) | **POST** /wire | Submit a Wire transfer
[**updateBankLinkUsingPut3**](WireApi.md#updateBankLinkUsingPut3) | **PUT** /wire/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelWireTransferUsingDelete"></a>
# **cancelWireTransferUsingDelete**
> WireTransferResponseVO cancelWireTransferUsingDelete(nucleusFundingId)

Cancel the Wire transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cancelWireTransferUsingDelete(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBankLinkUsingPost3"></a>
# **createBankLinkUsingPost3**
> WireBankLinkResponseVO createBankLinkUsingPost3(request)

Create bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var request = new HydrogenIntegrationApi.WireBankLinkRequestCO(); // WireBankLinkRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBankLinkUsingPost3(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WireBankLinkRequestCO**](WireBankLinkRequestCO.md)| request | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete3"></a>
# **deleteBankLinkUsingDelete3**
> WireBankLinkResponseVO deleteBankLinkUsingDelete3(nucleusBankLinkId)

Delete bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBankLinkUsingDelete3(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet3"></a>
# **getBankLinkUsingGet3**
> WireBankLinkResponseVO getBankLinkUsingGet3(nucleusBankLinkId)

Get bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinkUsingGet3(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet2"></a>
# **getClientBankLinksUsingGet2**
> [WireBankLinkResponseVO] getClientBankLinksUsingGet2(nucleusClientId)

Get client bank links

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientBankLinksUsingGet2(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**[WireBankLinkResponseVO]**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfWireTransfersUsingGet"></a>
# **getListOfWireTransfersUsingGet**
> [WireTransferResponseVO] getListOfWireTransfersUsingGet(nucleusClientId)

Get a list of Wire transfers

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getListOfWireTransfersUsingGet(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**[WireTransferResponseVO]**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWireTransferUsingGet"></a>
# **getWireTransferUsingGet**
> WireTransferResponseVO getWireTransferUsingGet(nucleusFundingId)

Get the Wire transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWireTransferUsingGet(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitWireTransferUsingPost"></a>
# **submitWireTransferUsingPost**
> WireTransferResponseVO submitWireTransferUsingPost(transferRequest)

Submit a Wire transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var transferRequest = new HydrogenIntegrationApi.WireTransferRequestCO(); // WireTransferRequestCO | transferRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitWireTransferUsingPost(transferRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**WireTransferRequestCO**](WireTransferRequestCO.md)| transferRequest | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut3"></a>
# **updateBankLinkUsingPut3**
> WireBankLinkResponseVO updateBankLinkUsingPut3(nucleusBankLinkId)

Update bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WireApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkUsingPut3(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

