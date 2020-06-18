# HydrogenNucleusApi.FeatureApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeatureTrackUsingPost**](FeatureApi.md#createFeatureTrackUsingPost) | **POST** /feature_track | Create a Feature Track
[**createFeatureUsingPost**](FeatureApi.md#createFeatureUsingPost) | **POST** /feature | Create a  Feature
[**deleteFeatureTrackUsingDelete**](FeatureApi.md#deleteFeatureTrackUsingDelete) | **DELETE** /feature_track/{feature_track_id} | Delete a Feature Track
[**deleteFeatureUsingDelete**](FeatureApi.md#deleteFeatureUsingDelete) | **DELETE** /feature/{feature_id} | Delete a Feature
[**getFeatureAllUsingGet**](FeatureApi.md#getFeatureAllUsingGet) | **GET** /feature | List all Feature
[**getFeatureTrackAllUsingGet**](FeatureApi.md#getFeatureTrackAllUsingGet) | **GET** /feature_track | List all Feature track
[**getFeatureTrackUsingGet**](FeatureApi.md#getFeatureTrackUsingGet) | **GET** /feature_track/{feature_track_id} | Retrieve a Feature track
[**getFeatureUsingGet**](FeatureApi.md#getFeatureUsingGet) | **GET** /feature/{feature_id} | Retrieve a Feature
[**updateFeatureTrackUsingPut**](FeatureApi.md#updateFeatureTrackUsingPut) | **PUT** /feature_track/{feature_track_id} | Update a Feature Track
[**updateFeatureUsingPut**](FeatureApi.md#updateFeatureUsingPut) | **PUT** /feature/{feature_id} | Update a Feature


<a name="createFeatureTrackUsingPost"></a>
# **createFeatureTrackUsingPost**
> FeatureTrack createFeatureTrackUsingPost(featureTrack)

Create a Feature Track

Create a new feature track.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureTrack = new HydrogenNucleusApi.FeatureTrack(); // FeatureTrack | featureTrack


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFeatureTrackUsingPost(featureTrack, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrack** | [**FeatureTrack**](FeatureTrack.md)| featureTrack | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createFeatureUsingPost"></a>
# **createFeatureUsingPost**
> Feature createFeatureUsingPost(feature)

Create a  Feature

Create a new feature.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var feature = new HydrogenNucleusApi.Feature(); // Feature | feature


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFeatureUsingPost(feature, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFeatureTrackUsingDelete"></a>
# **deleteFeatureTrackUsingDelete**
> deleteFeatureTrackUsingDelete(featureTrackId)

Delete a Feature Track

Permanently delete a feature track registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureTrackId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID feature_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFeatureTrackUsingDelete(featureTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrackId** | **String**| UUID feature_track_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteFeatureUsingDelete"></a>
# **deleteFeatureUsingDelete**
> deleteFeatureUsingDelete(featureId)

Delete a Feature

Permanently delete a  feature registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID feature_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFeatureUsingDelete(featureId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureId** | **String**| UUID feature_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureAllUsingGet"></a>
# **getFeatureAllUsingGet**
> PageFeature getFeatureAllUsingGet(opts)

List all Feature

Get details for all features.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

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
apiInstance.getFeatureAllUsingGet(opts, callback);
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

[**PageFeature**](PageFeature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureTrackAllUsingGet"></a>
# **getFeatureTrackAllUsingGet**
> PageFeatureTrack getFeatureTrackAllUsingGet(opts)

List all Feature track

Get details for all feature track.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

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
apiInstance.getFeatureTrackAllUsingGet(opts, callback);
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

[**PageFeatureTrack**](PageFeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureTrackUsingGet"></a>
# **getFeatureTrackUsingGet**
> FeatureTrack getFeatureTrackUsingGet(featureTrackId)

Retrieve a Feature track

Retrieve the information for a Feature track.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureTrackId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID feature_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFeatureTrackUsingGet(featureTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrackId** | **String**| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureUsingGet"></a>
# **getFeatureUsingGet**
> Feature getFeatureUsingGet(featureId)

Retrieve a Feature

Retrieve the information for a Feature.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID feature_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFeatureUsingGet(featureId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureId** | **String**| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFeatureTrackUsingPut"></a>
# **updateFeatureTrackUsingPut**
> FeatureTrack updateFeatureTrackUsingPut(featureTrack, featureTrackId)

Update a Feature Track

Update the information for a Feature track registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var featureTrack = new HydrogenNucleusApi.FeatureTrack(); // FeatureTrack | feature_track

var featureTrackId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID feature_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFeatureTrackUsingPut(featureTrack, featureTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrack** | [**FeatureTrack**](FeatureTrack.md)| feature_track | 
 **featureTrackId** | **String**| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateFeatureUsingPut"></a>
# **updateFeatureUsingPut**
> Feature updateFeatureUsingPut(feature, featureId)

Update a Feature

Update the information for a Feature registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FeatureApi();

var feature = new HydrogenNucleusApi.Feature(); // Feature | feature

var featureId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID feature_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFeatureUsingPut(feature, featureId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature | 
 **featureId** | **String**| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

