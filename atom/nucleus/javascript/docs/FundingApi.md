# HydrogenNucleusApi.FundingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankLinkUsingPost**](FundingApi.md#createBankLinkUsingPost) | **POST** /bank_link | Create a bank link
[**createDepositUsingPost**](FundingApi.md#createDepositUsingPost) | **POST** /deposit | Create a deposit request
[**createFundingUsingPost**](FundingApi.md#createFundingUsingPost) | **POST** /funding | Create a funding request
[**createTransferUsingPost**](FundingApi.md#createTransferUsingPost) | **POST** /transfer | Create a transfer requests
[**createWithdrawalUsingPost**](FundingApi.md#createWithdrawalUsingPost) | **POST** /withdrawal | Create a withdrawal request
[**deleteBankLinkUsingDelete**](FundingApi.md#deleteBankLinkUsingDelete) | **DELETE** /bank_link/{bank_link_id} | Delete a bank link
[**deleteDepositUsingDelete**](FundingApi.md#deleteDepositUsingDelete) | **DELETE** /deposit/{deposit_id} | Delete a deposit request
[**deleteFundingUsingDelete**](FundingApi.md#deleteFundingUsingDelete) | **DELETE** /funding/{funding_id} | Delete a funding request
[**deleteTransferUsingDelete**](FundingApi.md#deleteTransferUsingDelete) | **DELETE** /transfer/{transfer_id} | Delete a transfer request
[**deleteWithdrawalUsingDelete**](FundingApi.md#deleteWithdrawalUsingDelete) | **DELETE** /withdrawal/{withdrawal_id} | Delete a withdrawal request
[**getBankLinkAllUsingGet**](FundingApi.md#getBankLinkAllUsingGet) | **GET** /bank_link | List all bank links
[**getBankLinkUsingGet**](FundingApi.md#getBankLinkUsingGet) | **GET** /bank_link/{bank_link_id} | Retrieve a bank link
[**getDepositAllUsingGet**](FundingApi.md#getDepositAllUsingGet) | **GET** /deposit | List all deposit requests
[**getDepositUsingGet**](FundingApi.md#getDepositUsingGet) | **GET** /deposit/{deposit_id} | Retrieve a deposit request
[**getFundingAllUsingGet**](FundingApi.md#getFundingAllUsingGet) | **GET** /funding | List all funding requests 
[**getFundingUsingGet**](FundingApi.md#getFundingUsingGet) | **GET** /funding/{funding_id} | Retrieve a funding request
[**getTransferAllUsingGet**](FundingApi.md#getTransferAllUsingGet) | **GET** /transfer | List all transfer requests
[**getTransferUsingGet**](FundingApi.md#getTransferUsingGet) | **GET** /transfer/{transfer_id} | Retrieve a transfer request
[**getWithdrawalAllUsingGet**](FundingApi.md#getWithdrawalAllUsingGet) | **GET** /withdrawal | List all withdrawal requests
[**getWithdrawalUsingGet**](FundingApi.md#getWithdrawalUsingGet) | **GET** /withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**updateBankLinkBulkUsingPut**](FundingApi.md#updateBankLinkBulkUsingPut) | **PUT** /bulk_bank_link | Update list of bank link
[**updateBankLinkUsingPut**](FundingApi.md#updateBankLinkUsingPut) | **PUT** /bank_link/{bank_link_id} | Update a bank link
[**updateDepositUsingPut**](FundingApi.md#updateDepositUsingPut) | **PUT** /deposit/{deposit_id} | Update a deposit request
[**updateFundingUsingPut**](FundingApi.md#updateFundingUsingPut) | **PUT** /funding/{funding_id} | Update a funding request
[**updateTransferUsingPut**](FundingApi.md#updateTransferUsingPut) | **PUT** /transfer/{transfer_id} | Update a transfer request
[**updateWithdrawalUsingPut**](FundingApi.md#updateWithdrawalUsingPut) | **PUT** /withdrawal/{withdrawal_id} | Update a withdrawal request


<a name="createBankLinkUsingPost"></a>
# **createBankLinkUsingPost**
> BankLink createBankLinkUsingPost(bankLinkInfoRequest)

Create a bank link

Create a new bank link for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var bankLinkInfoRequest = new HydrogenNucleusApi.BankLink(); // BankLink | bankLinkInfoRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBankLinkUsingPost(bankLinkInfoRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkInfoRequest** | [**BankLink**](BankLink.md)| bankLinkInfoRequest | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDepositUsingPost"></a>
# **createDepositUsingPost**
> DailyDeposit createDepositUsingPost(dailyDepositRequest)

Create a deposit request

Create a new deposit request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var dailyDepositRequest = new HydrogenNucleusApi.DailyDeposit(); // DailyDeposit | dailyDepositRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDepositUsingPost(dailyDepositRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dailyDepositRequest** | [**DailyDeposit**](DailyDeposit.md)| dailyDepositRequest | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createFundingUsingPost"></a>
# **createFundingUsingPost**
> Funding createFundingUsingPost(fundingRequest)

Create a funding request

Create a new funding request for an account. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var fundingRequest = new HydrogenNucleusApi.Funding(); // Funding | fundingRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFundingUsingPost(fundingRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingRequest** | [**Funding**](Funding.md)| fundingRequest | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createTransferUsingPost"></a>
# **createTransferUsingPost**
> ExternalAccountTransfer createTransferUsingPost(externalAccountTransferRequest)

Create a transfer requests

Create a new external account transfer for a client account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var externalAccountTransferRequest = new HydrogenNucleusApi.ExternalAccountTransfer(); // ExternalAccountTransfer | externalAccountTransferRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createTransferUsingPost(externalAccountTransferRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountTransferRequest** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| externalAccountTransferRequest | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createWithdrawalUsingPost"></a>
# **createWithdrawalUsingPost**
> DailyWithdrawal createWithdrawalUsingPost(dailyWithdrawalRequest)

Create a withdrawal request

Create a new withdrawal request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var dailyWithdrawalRequest = new HydrogenNucleusApi.DailyWithdrawal(); // DailyWithdrawal | dailyWithdrawalRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createWithdrawalUsingPost(dailyWithdrawalRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dailyWithdrawalRequest** | [**DailyWithdrawal**](DailyWithdrawal.md)| dailyWithdrawalRequest | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankLinkUsingDelete"></a>
# **deleteBankLinkUsingDelete**
> deleteBankLinkUsingDelete(bankLinkId)

Delete a bank link

Permanently delete a bank link defined for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var bankLinkId = "4ff21db3-97ab-4bbd-9885-be6aec522c44"; // String | UUID bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBankLinkUsingDelete(bankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | **String**| UUID bank_link_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDepositUsingDelete"></a>
# **deleteDepositUsingDelete**
> deleteDepositUsingDelete(depositId)

Delete a deposit request

Permanently delete a deposit request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var depositId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID deposit_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteDepositUsingDelete(depositId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | **String**| UUID deposit_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteFundingUsingDelete"></a>
# **deleteFundingUsingDelete**
> deleteFundingUsingDelete(fundingId)

Delete a funding request

Permanently delete a funding request defined for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var fundingId = "708689ce-b0fd-4062-9954-6c8dd82707cf"; // String | UUID funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFundingUsingDelete(fundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | **String**| UUID funding_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTransferUsingDelete"></a>
# **deleteTransferUsingDelete**
> deleteTransferUsingDelete(transfer, transferId)

Delete a transfer request

Permanently delete a external account transfer from a client account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var transfer = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID external_account_transfer_id

var transferId = "transferId_example"; // String | transfer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteTransferUsingDelete(transfer, transferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | **String**| UUID external_account_transfer_id | 
 **transferId** | **String**| transfer_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteWithdrawalUsingDelete"></a>
# **deleteWithdrawalUsingDelete**
> deleteWithdrawalUsingDelete(withdrawalId)

Delete a withdrawal request

Permanently delete a withdrawal request from an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var withdrawalId = "be07c93a-c0b0-4fb0-97e1-3a0f77b8c969"; // String | UUID withdrawal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteWithdrawalUsingDelete(withdrawalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | **String**| UUID withdrawal_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkAllUsingGet"></a>
# **getBankLinkAllUsingGet**
> PageBankLink getBankLinkAllUsingGet(opts)

List all bank links

Get all bank links defined for all clients defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

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
apiInstance.getBankLinkAllUsingGet(opts, callback);
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

[**PageBankLink**](PageBankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkUsingGet"></a>
# **getBankLinkUsingGet**
> BankLink getBankLinkUsingGet(bankLinkId)

Retrieve a bank link

Retrieve the information for a bank link for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var bankLinkId = "4ff21db3-97ab-4bbd-9885-be6aec522c44"; // String | UUID bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinkUsingGet(bankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | **String**| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDepositAllUsingGet"></a>
# **getDepositAllUsingGet**
> PageDailyDeposit getDepositAllUsingGet(opts)

List all deposit requests

Get the information for all deposit requests for all clients.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

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
apiInstance.getDepositAllUsingGet(opts, callback);
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

[**PageDailyDeposit**](PageDailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDepositUsingGet"></a>
# **getDepositUsingGet**
> DailyDeposit getDepositUsingGet(depositId)

Retrieve a deposit request

Retrieve the information for a deposit request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var depositId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID deposit_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDepositUsingGet(depositId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | **String**| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFundingAllUsingGet"></a>
# **getFundingAllUsingGet**
> PageFunding getFundingAllUsingGet(opts)

List all funding requests 

Get the information for all funding requests defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

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
apiInstance.getFundingAllUsingGet(opts, callback);
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

[**PageFunding**](PageFunding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFundingUsingGet"></a>
# **getFundingUsingGet**
> Funding getFundingUsingGet(fundingId)

Retrieve a funding request

Retrieve the information for a funding request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var fundingId = "708689ce-b0fd-4062-9954-6c8dd82707cf"; // String | UUID funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFundingUsingGet(fundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | **String**| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransferAllUsingGet"></a>
# **getTransferAllUsingGet**
> PageExternalAccountTransfer getTransferAllUsingGet(opts)

List all transfer requests

Get the information for all external account transfers defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

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
apiInstance.getTransferAllUsingGet(opts, callback);
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

[**PageExternalAccountTransfer**](PageExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransferUsingGet"></a>
# **getTransferUsingGet**
> ExternalAccountTransfer getTransferUsingGet(externalAccountTransferId, transferId)

Retrieve a transfer request

Retrieve the information for a external account transfer for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var externalAccountTransferId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID external_account_transfer_id

var transferId = "transferId_example"; // String | transfer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransferUsingGet(externalAccountTransferId, transferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountTransferId** | **String**| UUID external_account_transfer_id | 
 **transferId** | **String**| transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWithdrawalAllUsingGet"></a>
# **getWithdrawalAllUsingGet**
> PageDailyWithdrawal getWithdrawalAllUsingGet(opts)

List all withdrawal requests

Get the information for all withdrawal requests for all clients.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

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
apiInstance.getWithdrawalAllUsingGet(opts, callback);
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

[**PageDailyWithdrawal**](PageDailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWithdrawalUsingGet"></a>
# **getWithdrawalUsingGet**
> DailyWithdrawal getWithdrawalUsingGet(withdrawalId)

Retrieve a withdrawal request

Retrieve the information for a withdrawal request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var withdrawalId = "be07c93a-c0b0-4fb0-97e1-3a0f77b8c969"; // String | UUID withdrawal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWithdrawalUsingGet(withdrawalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | **String**| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankLinkBulkUsingPut"></a>
# **updateBankLinkBulkUsingPut**
> [BankLink] updateBankLinkBulkUsingPut(bankLinkList)

Update list of bank link

Update bank link list for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var bankLinkList = [new HydrogenNucleusApi.BankLink()]; // [BankLink] | bankLinkList


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkBulkUsingPut(bankLinkList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkList** | [**[BankLink]**](BankLink.md)| bankLinkList | 

### Return type

[**[BankLink]**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBankLinkUsingPut"></a>
# **updateBankLinkUsingPut**
> BankLink updateBankLinkUsingPut(bankLink, bankLinkId)

Update a bank link

Update the information for a bank link for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var bankLink = new HydrogenNucleusApi.BankLink(); // BankLink | bank_link

var bankLinkId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkUsingPut(bankLink, bankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLink** | [**BankLink**](BankLink.md)| bank_link | 
 **bankLinkId** | **String**| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateDepositUsingPut"></a>
# **updateDepositUsingPut**
> DailyDeposit updateDepositUsingPut(deposit, depositId)

Update a deposit request

Update the information for a deposit request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var deposit = new HydrogenNucleusApi.DailyDeposit(); // DailyDeposit | deposit

var depositId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID deposit_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateDepositUsingPut(deposit, depositId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit** | [**DailyDeposit**](DailyDeposit.md)| deposit | 
 **depositId** | **String**| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateFundingUsingPut"></a>
# **updateFundingUsingPut**
> Funding updateFundingUsingPut(funding, fundingId)

Update a funding request

Update the information for a funding request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var funding = new HydrogenNucleusApi.Funding(); // Funding | funding

var fundingId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID funding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFundingUsingPut(funding, fundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding** | [**Funding**](Funding.md)| funding | 
 **fundingId** | **String**| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTransferUsingPut"></a>
# **updateTransferUsingPut**
> ExternalAccountTransfer updateTransferUsingPut(transfer, transferId)

Update a transfer request

Update the information for a external account transfer for a client account. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var transfer = new HydrogenNucleusApi.ExternalAccountTransfer(); // ExternalAccountTransfer | transfer

var transferId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID external_account_transfer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTransferUsingPut(transfer, transferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| transfer | 
 **transferId** | **String**| UUID external_account_transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateWithdrawalUsingPut"></a>
# **updateWithdrawalUsingPut**
> DailyWithdrawal updateWithdrawalUsingPut(withdrawal, withdrawalId)

Update a withdrawal request

Update the information for a withdrawal request for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FundingApi();

var withdrawal = new HydrogenNucleusApi.DailyWithdrawal(); // DailyWithdrawal | withdrawal

var withdrawalId = "be07c93a-c0b0-4fb0-97e1-3a0f77b8c969"; // String | UUID withdrawal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateWithdrawalUsingPut(withdrawal, withdrawalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal** | [**DailyWithdrawal**](DailyWithdrawal.md)| withdrawal | 
 **withdrawalId** | **String**| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

