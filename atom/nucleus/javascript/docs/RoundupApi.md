# HydrogenNucleusApi.RoundupApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoundupSettingsUsingPost**](RoundupApi.md#createRoundupSettingsUsingPost) | **POST** /roundup_setting | Create a Roundup Settings
[**createRoundupUsingPost**](RoundupApi.md#createRoundupUsingPost) | **POST** /roundup | Create a roundup
[**deleteRoundupSettingsUsingDelete**](RoundupApi.md#deleteRoundupSettingsUsingDelete) | **DELETE** /roundup_setting/{roundup_setting_id} | Delete a roundup settings
[**getRoundupAllUsingGet**](RoundupApi.md#getRoundupAllUsingGet) | **GET** /roundup | List all roundups
[**getRoundupSettingsAllUsingGet**](RoundupApi.md#getRoundupSettingsAllUsingGet) | **GET** /roundup_setting | List all roundup settings
[**getRoundupSettingsUsingGet**](RoundupApi.md#getRoundupSettingsUsingGet) | **GET** /roundup_setting/{roundup_setting_id} | Retrieve a Roundup Setting
[**getRoundupUsingGet**](RoundupApi.md#getRoundupUsingGet) | **GET** /roundup/{roundup_id} | Retrieve a Roundup
[**updateRoundupSettingsUsingPut**](RoundupApi.md#updateRoundupSettingsUsingPut) | **PUT** /roundup_setting/{roundup_setting_id} | Update a roundup settings


<a name="createRoundupSettingsUsingPost"></a>
# **createRoundupSettingsUsingPost**
> RoundupSettings createRoundupSettingsUsingPost(roundupSettings)

Create a Roundup Settings

Create a Roundup Settings for Roundup amount with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupSettings = new HydrogenNucleusApi.RoundupSettings(); // RoundupSettings | roundupSettings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createRoundupSettingsUsingPost(roundupSettings, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettings** | [**RoundupSettings**](RoundupSettings.md)| roundupSettings | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createRoundupUsingPost"></a>
# **createRoundupUsingPost**
> Roundup createRoundupUsingPost(roundupCO)

Create a roundup

Create a new roundup with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupCO = new HydrogenNucleusApi.RoundupCO(); // RoundupCO | roundupCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createRoundupUsingPost(roundupCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupCO** | [**RoundupCO**](RoundupCO.md)| roundupCO | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRoundupSettingsUsingDelete"></a>
# **deleteRoundupSettingsUsingDelete**
> deleteRoundupSettingsUsingDelete(roundupSettingId)

Delete a roundup settings

Permanently delete a  roundup settings registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupSettingId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID roundup_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteRoundupSettingsUsingDelete(roundupSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettingId** | **String**| UUID roundup_setting_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupAllUsingGet"></a>
# **getRoundupAllUsingGet**
> PageRoundup getRoundupAllUsingGet(opts)

List all roundups

Get details for all roundups.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

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
apiInstance.getRoundupAllUsingGet(opts, callback);
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

[**PageRoundup**](PageRoundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupSettingsAllUsingGet"></a>
# **getRoundupSettingsAllUsingGet**
> PageRoundupSettings getRoundupSettingsAllUsingGet(opts)

List all roundup settings

Get details for all roundup setting with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

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
apiInstance.getRoundupSettingsAllUsingGet(opts, callback);
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

[**PageRoundupSettings**](PageRoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupSettingsUsingGet"></a>
# **getRoundupSettingsUsingGet**
> RoundupSettings getRoundupSettingsUsingGet(roundupSettingId)

Retrieve a Roundup Setting

Retrieve the information for a Roundup Settings with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupSettingId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID roundup_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRoundupSettingsUsingGet(roundupSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettingId** | **String**| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupUsingGet"></a>
# **getRoundupUsingGet**
> Roundup getRoundupUsingGet(roundupId)

Retrieve a Roundup

Retrieve the information for a Roundup.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID roundup_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRoundupUsingGet(roundupId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupId** | **String**| UUID roundup_id | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateRoundupSettingsUsingPut"></a>
# **updateRoundupSettingsUsingPut**
> RoundupSettings updateRoundupSettingsUsingPut(roundupSetting, roundupSettingId)

Update a roundup settings

Update the information for a roundup setting registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RoundupApi();

var roundupSetting = new HydrogenNucleusApi.RoundupSettings(); // RoundupSettings | roundup_setting

var roundupSettingId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID roundup_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateRoundupSettingsUsingPut(roundupSetting, roundupSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSetting** | [**RoundupSettings**](RoundupSettings.md)| roundup_setting | 
 **roundupSettingId** | **String**| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

