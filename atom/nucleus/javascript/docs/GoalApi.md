# HydrogenNucleusApi.GoalApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGoalTrackUsingPost**](GoalApi.md#createGoalTrackUsingPost) | **POST** /goal_track | Create a goal track record
[**createGoalUsingPost**](GoalApi.md#createGoalUsingPost) | **POST** /goal | Create a goal
[**deleteGoalTrackUsingDelete**](GoalApi.md#deleteGoalTrackUsingDelete) | **DELETE** /goal_track/{goal_track_id} | Delete a goal track record
[**deleteGoalUsingDelete**](GoalApi.md#deleteGoalUsingDelete) | **DELETE** /goal/{goal_id} | Delete a goal
[**getGoalAllUsingGet**](GoalApi.md#getGoalAllUsingGet) | **GET** /goal | List all goals
[**getGoalAssetSizeAllUsingGet**](GoalApi.md#getGoalAssetSizeAllUsingGet) | **GET** /goal/{goal_id}/asset_size | List goal asset sizes
[**getGoalHoldingAllUsingGet**](GoalApi.md#getGoalHoldingAllUsingGet) | **GET** /goal/{goal_id}/holding | List goal holdings
[**getGoalTrackAllUsingGet**](GoalApi.md#getGoalTrackAllUsingGet) | **GET** /goal_track | List all goal track records
[**getGoalTrackUsingGet**](GoalApi.md#getGoalTrackUsingGet) | **GET** /goal_track/{goal_track_id} | Retrieve a goal track record
[**getGoalTransactionAllUsingGet**](GoalApi.md#getGoalTransactionAllUsingGet) | **GET** /goal/{goal_id}/transaction | List goal transactions
[**getGoalUsingGet**](GoalApi.md#getGoalUsingGet) | **GET** /goal/{goal_id} | Retrieve a goal
[**updateGoalTrackUsingPut**](GoalApi.md#updateGoalTrackUsingPut) | **PUT** /goal_track/{goal_track_id} | Update a goal track record
[**updateGoalUsingPut**](GoalApi.md#updateGoalUsingPut) | **PUT** /goal/{goal_id} | Update a goal


<a name="createGoalTrackUsingPost"></a>
# **createGoalTrackUsingPost**
> GoalTrack createGoalTrackUsingPost(goalTrack)

Create a goal track record

Create a goal track record for a goal under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalTrack = new HydrogenNucleusApi.GoalTrack(); // GoalTrack | goalTrack


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createGoalTrackUsingPost(goalTrack, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrack** | [**GoalTrack**](GoalTrack.md)| goalTrack | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createGoalUsingPost"></a>
# **createGoalUsingPost**
> Goal createGoalUsingPost(goalRequest)

Create a goal

Create a new goal for your firm that clients can customize for themselves.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalRequest = new HydrogenNucleusApi.Goal(); // Goal | goalRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createGoalUsingPost(goalRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalRequest** | [**Goal**](Goal.md)| goalRequest | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteGoalTrackUsingDelete"></a>
# **deleteGoalTrackUsingDelete**
> deleteGoalTrackUsingDelete(goalTrackId, goalTrackId2)

Delete a goal track record

Permanently delete an goal track record for a goal under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalTrackId = "4e1c4f70-8611-44fa-bac5-f9f390c16852"; // String | UUID goal_track_id

var goalTrackId2 = "goalTrackId_example"; // String | goal_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteGoalTrackUsingDelete(goalTrackId, goalTrackId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | **String**| UUID goal_track_id | 
 **goalTrackId2** | **String**| goal_track_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteGoalUsingDelete"></a>
# **deleteGoalUsingDelete**
> deleteGoalUsingDelete(goalId)

Delete a goal

Permanently delete a goal for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteGoalUsingDelete(goalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | **String**| UUID goal_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalAllUsingGet"></a>
# **getGoalAllUsingGet**
> PageGoal getGoalAllUsingGet(opts)

List all goals

Get the details for all goals defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

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
apiInstance.getGoalAllUsingGet(opts, callback);
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

[**PageGoal**](PageGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalAssetSizeAllUsingGet"></a>
# **getGoalAssetSizeAllUsingGet**
> [AvailableDateDoubleVO] getGoalAssetSizeAllUsingGet(clientId, goalId, opts)

List goal asset sizes

Get a list of asset sizes per date for a goal for a specified client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var clientId = "clientId_example"; // String | client_id

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id

var opts = { 
  'endDate': new Date("2013-10-20T19:20:30+01:00"), // Date | end_date
  'getLatest': false, // Boolean | get_latest
  'portfolioGoal': false, // Boolean | portfolio_goal
  'sortType': "sortType_example", // String | sort_type
  'startDate': new Date("2013-10-20T19:20:30+01:00") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalAssetSizeAllUsingGet(clientId, goalId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| client_id | 
 **goalId** | **String**| UUID goal_id | 
 **endDate** | **Date**| end_date | [optional] 
 **getLatest** | **Boolean**| get_latest | [optional] [default to false]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **sortType** | **String**| sort_type | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalHoldingAllUsingGet"></a>
# **getGoalHoldingAllUsingGet**
> [PortfolioHoldingAgg] getGoalHoldingAllUsingGet(clientId, goalId, opts)

List goal holdings

Get the information for all the securities that are currently being held in portfolios associated with a particular goal.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var clientId = "clientId_example"; // String | client_id

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id

var opts = { 
  'endDate': new Date("2013-10-20T19:20:30+01:00"), // Date | end_date
  'portfolioGoal': false, // Boolean | portfolio_goal
  'startDate': new Date("2013-10-20T19:20:30+01:00") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalHoldingAllUsingGet(clientId, goalId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| client_id | 
 **goalId** | **String**| UUID goal_id | 
 **endDate** | **Date**| end_date | [optional] 
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTrackAllUsingGet"></a>
# **getGoalTrackAllUsingGet**
> PageGoalTrack getGoalTrackAllUsingGet(opts)

List all goal track records

Get information for all goal track records stored for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'endDate': "endDate_example", // String | end date 
  'filter': "filter_example", // String | filter
  'getLatest': true, // Boolean | true or false
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': "startDate_example" // String | start date 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTrackAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **String**| end date  | [optional] 
 **filter** | **String**| filter | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **String**| start date  | [optional] 

### Return type

[**PageGoalTrack**](PageGoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTrackUsingGet"></a>
# **getGoalTrackUsingGet**
> GoalTrack getGoalTrackUsingGet(goalTrackId, goalTrackId2)

Retrieve a goal track record

Retrieve the information for a specific goal track record for a goal under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalTrackId = "4e1c4f70-8611-44fa-bac5-f9f390c16852"; // String | UUID goal_track_id

var goalTrackId2 = "goalTrackId_example"; // String | goal_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTrackUsingGet(goalTrackId, goalTrackId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | **String**| UUID goal_track_id | 
 **goalTrackId2** | **String**| goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTransactionAllUsingGet"></a>
# **getGoalTransactionAllUsingGet**
> PagePortfolioTransaction getGoalTransactionAllUsingGet(clientId, goalId, opts)

List goal transactions

Get the information for all transactions under portfolios associated with a particular goal.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var clientId = "clientId_example"; // String | client_id

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'endDate': new Date("2013-10-20T19:20:30+01:00"), // Date | end_date
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'portfolioGoal': false, // Boolean | portfolio_goal
  'size': 25, // Number | size
  'startDate': new Date("2013-10-20T19:20:30+01:00") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTransactionAllUsingGet(clientId, goalId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| client_id | 
 **goalId** | **String**| UUID goal_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **Date**| end_date | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalUsingGet"></a>
# **getGoalUsingGet**
> Goal getGoalUsingGet(goalId)

Retrieve a goal

Retrieve the information for a goal defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalUsingGet(goalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | **String**| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateGoalTrackUsingPut"></a>
# **updateGoalTrackUsingPut**
> GoalTrack updateGoalTrackUsingPut(goalTrack, goalTrackId)

Update a goal track record

Update the information for a goal track record.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goalTrack = new HydrogenNucleusApi.GoalTrack(); // GoalTrack | goal_track

var goalTrackId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateGoalTrackUsingPut(goalTrack, goalTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrack** | [**GoalTrack**](GoalTrack.md)| goal_track | 
 **goalTrackId** | **String**| UUID goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateGoalUsingPut"></a>
# **updateGoalUsingPut**
> Goal updateGoalUsingPut(goal, goalId)

Update a goal

Update a goal defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.GoalApi();

var goal = new HydrogenNucleusApi.Goal(); // Goal | goal

var goalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateGoalUsingPut(goal, goalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal** | [**Goal**](Goal.md)| goal | 
 **goalId** | **String**| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

