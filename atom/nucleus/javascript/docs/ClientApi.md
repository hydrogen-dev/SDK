# HydrogenNucleusApi.ClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientStatusUsingPost**](ClientApi.md#createClientStatusUsingPost) | **POST** /client_status | Create an client status
[**createClientUsingPost**](ClientApi.md#createClientUsingPost) | **POST** /client | Create a client
[**deleteClientStatusUsingDelete**](ClientApi.md#deleteClientStatusUsingDelete) | **DELETE** /client_status/{client_status_id} | Delete an client status
[**deleteClientUsingDelete**](ClientApi.md#deleteClientUsingDelete) | **DELETE** /client/{client_id} | Delete a client
[**getClientAccountOverviewUsingGet**](ClientApi.md#getClientAccountOverviewUsingGet) | **GET** /client/{client_id}/account_overview | List all client Account overview
[**getClientAdvisorOverviewUsingGet**](ClientApi.md#getClientAdvisorOverviewUsingGet) | **GET** /client/{client_id}/advisor_overview | Advisor overview
[**getClientAllUsingGet**](ClientApi.md#getClientAllUsingGet) | **GET** /client | List all clients
[**getClientAssetSizeUsingGet**](ClientApi.md#getClientAssetSizeUsingGet) | **GET** /client/{client_id}/asset_size | List all client asset sizes
[**getClientGoalOverviewUsingGet**](ClientApi.md#getClientGoalOverviewUsingGet) | **GET** /client/{client_id}/goal_overview | Retrieve client&#39;s goal details 
[**getClientHoldingUsingGet**](ClientApi.md#getClientHoldingUsingGet) | **GET** /client/{client_id}/holding | List all client holdings
[**getClientStatusAllUsingGet**](ClientApi.md#getClientStatusAllUsingGet) | **GET** /client_status | List all client statuses
[**getClientStatusUsingGet**](ClientApi.md#getClientStatusUsingGet) | **GET** /client_status/{client_status_id} | Retrieve an client status
[**getClientTransactionAllUsingGet**](ClientApi.md#getClientTransactionAllUsingGet) | **GET** /client/{client_id}/transaction | List all client transactions
[**getClientUsingGet**](ClientApi.md#getClientUsingGet) | **GET** /client/{client_id} | Retrieve a client
[**updateClientStatusUsingPut**](ClientApi.md#updateClientStatusUsingPut) | **PUT** /client_status/{client_status_id} | Update an client status
[**updateClientUsingPut**](ClientApi.md#updateClientUsingPut) | **PUT** /client/{client_id} | Update a client


<a name="createClientStatusUsingPost"></a>
# **createClientStatusUsingPost**
> ClientStatus createClientStatusUsingPost(clientStatusRequest)

Create an client status

Create an client status record for an client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientStatusRequest = new HydrogenNucleusApi.ClientStatus(); // ClientStatus | clientStatusRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientStatusUsingPost(clientStatusRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusRequest** | [**ClientStatus**](ClientStatus.md)| clientStatusRequest | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientUsingPost"></a>
# **createClientUsingPost**
> Client createClientUsingPost(clientRequest)

Create a client

Create a new client, or register a new user, with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientRequest = new HydrogenNucleusApi.Client(); // Client | clientRequest


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
 **clientRequest** | [**Client**](Client.md)| clientRequest | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteClientStatusUsingDelete"></a>
# **deleteClientStatusUsingDelete**
> deleteClientStatusUsingDelete(clientStatusId)

Delete an client status

Permanently delete an client status record from an client’s history.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientStatusId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID client_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientStatusUsingDelete(clientStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusId** | [**String**](.md)| UUID client_status_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteClientUsingDelete"></a>
# **deleteClientUsingDelete**
> deleteClientUsingDelete(clientId)

Delete a client

Permanently delete a client registered with your firm. Turns the client&#39;s is_active  &#x3D; 0

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientUsingDelete(clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAccountOverviewUsingGet"></a>
# **getClientAccountOverviewUsingGet**
> Object getClientAccountOverviewUsingGet(clientId, opts)

List all client Account overview

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'orderBy': "update_date" // String | order_by
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientAccountOverviewUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **orderBy** | **String**| order_by | [optional] [default to update_date]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAdvisorOverviewUsingGet"></a>
# **getClientAdvisorOverviewUsingGet**
> Object getClientAdvisorOverviewUsingGet(clientId, opts)

Advisor overview

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id

var opts = { 
  'showClients': false // Boolean | show_clients
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientAdvisorOverviewUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **showClients** | **Boolean**| show_clients | [optional] [default to false]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAllUsingGet"></a>
# **getClientAllUsingGet**
> PageClient getClientAllUsingGet(opts)

List all clients

Get details for all clients registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

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
apiInstance.getClientAllUsingGet(opts, callback);
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

[**PageClient**](PageClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAssetSizeUsingGet"></a>
# **getClientAssetSizeUsingGet**
> [AvailableDateDoubleVO] getClientAssetSizeUsingGet(clientId, opts)

List all client asset sizes

Get a list of asset sizes per date for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | Currency Code
  'endDate': new Date("null"), // Date | end date
  'excludeSubledger': false, // Boolean | exclude_subledger
  'getLatest': true, // Boolean | true or false
  'sortType': "sortType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  'startDate': new Date("null") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientAssetSizeUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **currencyConversion** | **String**| Currency Code | [optional] 
 **endDate** | **Date**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| exclude_subledger | [optional] [default to false]
 **getLatest** | **Boolean**| true or false | [optional] 
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **startDate** | **Date**| start date | [optional] [default to null]

### Return type

[**[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientGoalOverviewUsingGet"></a>
# **getClientGoalOverviewUsingGet**
> VClientGoalViewData getClientGoalOverviewUsingGet(clientId, opts)

Retrieve client&#39;s goal details 

Retrieve client&#39;s goal details

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID client_id

var opts = { 
  'portfolioGoal': false // Boolean | portfolio_goal
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientGoalOverviewUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]

### Return type

[**VClientGoalViewData**](VClientGoalViewData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientHoldingUsingGet"></a>
# **getClientHoldingUsingGet**
> [PortfolioHoldingAgg] getClientHoldingUsingGet(clientId, opts)

List all client holdings

Get the information for all the securities that are currently being held by a client registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | Currency Code
  'endDate': "endDate_example", // String | end date - yyyy-mm-dd
  'getLatest': true, // Boolean | true or false
  'startDate': "startDate_example" // String | start date - yyyy-mm-dd
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientHoldingUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **currencyConversion** | **String**| Currency Code | [optional] 
 **endDate** | **String**| end date - yyyy-mm-dd | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **startDate** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientStatusAllUsingGet"></a>
# **getClientStatusAllUsingGet**
> PageClientStatus getClientStatusAllUsingGet(opts)

List all client statuses

Get the client status history information for all clients.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

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
apiInstance.getClientStatusAllUsingGet(opts, callback);
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

[**PageClientStatus**](PageClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientStatusUsingGet"></a>
# **getClientStatusUsingGet**
> ClientStatus getClientStatusUsingGet(clientStatusId)

Retrieve an client status

Retrieve the information for a specific client status record for an client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientStatusId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID client_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientStatusUsingGet(clientStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusId** | [**String**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientTransactionAllUsingGet"></a>
# **getClientTransactionAllUsingGet**
> PagePortfolioTransaction getClientTransactionAllUsingGet(clientId, opts)

List all client transactions

Get the information for all transactions under a client registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'currencyConversion': "currencyConversion_example", // String | currency_conversion
  'endDate': "endDate_example", // String | end date - yyyy-mm-dd
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': "startDate_example" // String | start date - yyyy-mm-dd
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientTransactionAllUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
 **endDate** | **String**| end date - yyyy-mm-dd | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientUsingGet"></a>
# **getClientUsingGet**
> Client getClientUsingGet(clientId)

Retrieve a client

Retrieve the information for a client registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientUsingGet(clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateClientStatusUsingPut"></a>
# **updateClientStatusUsingPut**
> ClientStatus updateClientStatusUsingPut(clientStatus, clientStatusId)

Update an client status

Update an client status record for an client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var clientStatus = null; // Object | client_status

var clientStatusId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID client_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientStatusUsingPut(clientStatus, clientStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatus** | **Object**| client_status | 
 **clientStatusId** | [**String**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientUsingPut"></a>
# **updateClientUsingPut**
> Client updateClientUsingPut(client, clientId)

Update a client

Update the information for a client registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ClientApi();

var client = null; // Object | client

var clientId = "\"d79bb3a3-f259-430c-8fa8-a93f87cc3bdf\""; // String | UUID client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientUsingPut(client, clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | **Object**| client | 
 **clientId** | [**String**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

