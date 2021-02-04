# HydrogenIntegrationApi.ACHApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelAchTransferUsingDelete**](ACHApi.md#cancelAchTransferUsingDelete) | **DELETE** /ach/{nucleus_funding_id} | Cancel the ACH transfer
[**createAchCardLinkUsingPost**](ACHApi.md#createAchCardLinkUsingPost) | **POST** /ach/card_link | Create an ACH card link
[**createBankLinkUsingPost**](ACHApi.md#createBankLinkUsingPost) | **POST** /ach/bank_link | Create bank link
[**createBusinessUsingPost**](ACHApi.md#createBusinessUsingPost) | **POST** /ach/business | Create a business
[**createClientUsingPost**](ACHApi.md#createClientUsingPost) | **POST** /ach/client | Create a client
[**deleteBankLinkUsingDelete**](ACHApi.md#deleteBankLinkUsingDelete) | **DELETE** /ach/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getAchTransferUsingGet**](ACHApi.md#getAchTransferUsingGet) | **GET** /ach/{nucleus_funding_id} | Get the ACH transfer
[**getBalanceUsingGet**](ACHApi.md#getBalanceUsingGet) | **GET** /ach/balance/{portfolio_id} | Get balance
[**getBankLinkUsingGet**](ACHApi.md#getBankLinkUsingGet) | **GET** /ach/bank_link/{nucleus_bank_link_id} | Get bank link
[**getBankLinksForReserveAccountUsingGet**](ACHApi.md#getBankLinksForReserveAccountUsingGet) | **GET** /ach/bank_link/reserve | Get bank links for a reserve account
[**getClientBankLinksUsingGet**](ACHApi.md#getClientBankLinksUsingGet) | **GET** /ach/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfClientAchTransfersUsingGet**](ACHApi.md#getListOfClientAchTransfersUsingGet) | **GET** /ach/client/{nucleus_client_id} | Get a list of client's ACH transfers
[**getListOfTenantAchTransfersUsingGet**](ACHApi.md#getListOfTenantAchTransfersUsingGet) | **GET** /ach | Get a list of tenant's ACH transfers
[**submitAchTransferUsingPost**](ACHApi.md#submitAchTransferUsingPost) | **POST** /ach | Submit an ACH transfer
[**updateBankLinkUsingPut**](ACHApi.md#updateBankLinkUsingPut) | **PUT** /ach/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelAchTransferUsingDelete"></a>
# **cancelAchTransferUsingDelete**
> AchTransferResponseVO cancelAchTransferUsingDelete(nucleusFundingId)

Cancel the ACH transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cancelAchTransferUsingDelete(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAchCardLinkUsingPost"></a>
# **createAchCardLinkUsingPost**
> AchCardLinkResponseVO createAchCardLinkUsingPost(cardLinkRequestCO)

Create an ACH card link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var cardLinkRequestCO = new HydrogenIntegrationApi.AchCardLinkRequestCO(); // AchCardLinkRequestCO | cardLinkRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAchCardLinkUsingPost(cardLinkRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardLinkRequestCO** | [**AchCardLinkRequestCO**](AchCardLinkRequestCO.md)| cardLinkRequestCO | 

### Return type

[**AchCardLinkResponseVO**](AchCardLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBankLinkUsingPost"></a>
# **createBankLinkUsingPost**
> AchBankLinkResponseVO createBankLinkUsingPost(achBankLinkRequestCO)

Create bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var achBankLinkRequestCO = new HydrogenIntegrationApi.AchBankLinkRequestCO(); // AchBankLinkRequestCO | achBankLinkRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBankLinkUsingPost(achBankLinkRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **achBankLinkRequestCO** | [**AchBankLinkRequestCO**](AchBankLinkRequestCO.md)| achBankLinkRequestCO | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBusinessUsingPost"></a>
# **createBusinessUsingPost**
> BaseResponseVO createBusinessUsingPost(businessRequest)

Create a business

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var businessRequest = new HydrogenIntegrationApi.AchBusinessRequestCO(); // AchBusinessRequestCO | businessRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBusinessUsingPost(businessRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessRequest** | [**AchBusinessRequestCO**](AchBusinessRequestCO.md)| businessRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientUsingPost"></a>
# **createClientUsingPost**
> AchClientResponseVO createClientUsingPost(clientRequest)

Create a client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var clientRequest = new HydrogenIntegrationApi.AchClientRequestCO(); // AchClientRequestCO | clientRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientUsingPost(clientRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientRequest** | [**AchClientRequestCO**](AchClientRequestCO.md)| clientRequest | 

### Return type

[**AchClientResponseVO**](AchClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete"></a>
# **deleteBankLinkUsingDelete**
> AchBankLinkResponseVO deleteBankLinkUsingDelete(nucleusBankLinkId)

Delete bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBankLinkUsingDelete(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAchTransferUsingGet"></a>
# **getAchTransferUsingGet**
> AchTransferResponseVO getAchTransferUsingGet(nucleusFundingId)

Get the ACH transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusFundingId = "nucleusFundingId_example"; // String | nucleus_funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAchTransferUsingGet(nucleusFundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBalanceUsingGet"></a>
# **getBalanceUsingGet**
> AchBalanceResponseVO getBalanceUsingGet(portfolioId, opts)

Get balance

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBalanceUsingGet(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| portfolio_id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**AchBalanceResponseVO**](AchBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet"></a>
# **getBankLinkUsingGet**
> AchBankLinkResponseVO getBankLinkUsingGet(nucleusBankLinkId)

Get bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinkUsingGet(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinksForReserveAccountUsingGet"></a>
# **getBankLinksForReserveAccountUsingGet**
> [AchBankLinkResponseVO] getBankLinksForReserveAccountUsingGet()

Get bank links for a reserve account

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinksForReserveAccountUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[AchBankLinkResponseVO]**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet"></a>
# **getClientBankLinksUsingGet**
> [AchBankLinkResponseVO] getClientBankLinksUsingGet(nucleusClientId)

Get client bank links

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientBankLinksUsingGet(nucleusClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 

### Return type

[**[AchBankLinkResponseVO]**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfClientAchTransfersUsingGet"></a>
# **getListOfClientAchTransfersUsingGet**
> PageAchTransferResponseVO getListOfClientAchTransfersUsingGet(nucleusClientId, opts)

Get a list of client's ACH transfers

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusClientId = "nucleusClientId_example"; // String | nucleus_client_id

var opts = { 
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
apiInstance.getListOfClientAchTransfersUsingGet(nucleusClientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| nucleus_client_id | 
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfTenantAchTransfersUsingGet"></a>
# **getListOfTenantAchTransfersUsingGet**
> PageAchTransferResponseVO getListOfTenantAchTransfersUsingGet(opts)

Get a list of tenant's ACH transfers

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': new Date("2013-10-20"), // Date | start_date
  'status': "status_example" // String | status
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getListOfTenantAchTransfersUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **Date**| end_date | [optional] 
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start_date | [optional] 
 **status** | **String**| status | [optional] 

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitAchTransferUsingPost"></a>
# **submitAchTransferUsingPost**
> AchTransferResponseVO submitAchTransferUsingPost(transferRequest)

Submit an ACH transfer

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var transferRequest = new HydrogenIntegrationApi.AchTransferRequestCO(); // AchTransferRequestCO | transferRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitAchTransferUsingPost(transferRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**AchTransferRequestCO**](AchTransferRequestCO.md)| transferRequest | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut"></a>
# **updateBankLinkUsingPut**
> AchBankLinkResponseVO updateBankLinkUsingPut(nucleusBankLinkId)

Update bank link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.ACHApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkUsingPut(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

