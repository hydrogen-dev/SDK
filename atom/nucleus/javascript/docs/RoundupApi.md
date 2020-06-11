# HydrogenAtomApi.RoundupApi

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

var roundupSettings = new HydrogenAtomApi.RoundupSettings(); // RoundupSettings | roundupSettings


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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

var roundupCO = new HydrogenAtomApi.RoundupCO(); // RoundupCO | roundupCO


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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

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
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);


var apiInstance = new HydrogenAtomApi.RoundupApi();

var roundupSetting = new HydrogenAtomApi.RoundupSettings(); // RoundupSettings | roundup_setting

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

