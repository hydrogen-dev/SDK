# HydrogenAdminApi.AppTokenApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppTokenUsingGET**](AppTokenApi.md#getAppTokenUsingGET) | **GET** /app_token | getAppToken


<a name="getAppTokenUsingGET"></a>
# **getAppTokenUsingGET**
> [AppToken] getAppTokenUsingGET(appName)

getAppToken

### Example
```javascript
var HydrogenAdminApi = require('hydrogen_admin_api');
var defaultClient = HydrogenAdminApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenAdminApi.AppTokenApi();

var appName = ["appName_example"]; // [String] | app_name


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppTokenUsingGET(appName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appName** | [**[String]**](String.md)| app_name |

### Return type

[**[AppToken]**](AppToken.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*
