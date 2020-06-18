# HydrogenNucleusApi.NotificationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotificationClientUsingPost**](NotificationApi.md#createNotificationClientUsingPost) | **POST** /notification_client | Create a Notification Client
[**createNotificationSettingUsingPost**](NotificationApi.md#createNotificationSettingUsingPost) | **POST** /notification_setting | Create a Notification Setting
[**createNotificationUsingPost**](NotificationApi.md#createNotificationUsingPost) | **POST** /notification | Create a Notification
[**deleteNotificationClientUsingDelete**](NotificationApi.md#deleteNotificationClientUsingDelete) | **DELETE** /notification_client/{notification_client_id} | Delete a Notification Client
[**deleteNotificationSettingUsingDelete**](NotificationApi.md#deleteNotificationSettingUsingDelete) | **DELETE** /notification_setting/{notification_setting_id} | Delete a Notification Setting
[**deleteNotificationUsingDelete**](NotificationApi.md#deleteNotificationUsingDelete) | **DELETE** /notification/{notification_id} | Delete a Notification
[**getNotificationAllUsingGet**](NotificationApi.md#getNotificationAllUsingGet) | **GET** /notification | Get All Notification
[**getNotificationClientAllUsingGet**](NotificationApi.md#getNotificationClientAllUsingGet) | **GET** /notification_client | List all Notification Client
[**getNotificationClientUsingGet**](NotificationApi.md#getNotificationClientUsingGet) | **GET** /notification_client/{notification_client_id} | Retrieve a Notification Client
[**getNotificationSettingAllUsingGet**](NotificationApi.md#getNotificationSettingAllUsingGet) | **GET** /notification_setting | List all Notification Setting
[**getNotificationSettingUsingGet**](NotificationApi.md#getNotificationSettingUsingGet) | **GET** /notification_setting/{notification_setting_id} | Retrieve a Notification Setting
[**getNotificationUsingGet**](NotificationApi.md#getNotificationUsingGet) | **GET** /notification/{notification_id} | Get a Notification
[**updateNotificationClientUsingPut**](NotificationApi.md#updateNotificationClientUsingPut) | **PUT** /notification_client/{notification_client_id} | Update a Notification Client
[**updateNotificationSettingUsingPut**](NotificationApi.md#updateNotificationSettingUsingPut) | **PUT** /notification_setting/{notification_setting_id} | Update a Notification Setting
[**updateNotificationUsingPut**](NotificationApi.md#updateNotificationUsingPut) | **PUT** /notification/{notification_id} | Update a Notification


<a name="createNotificationClientUsingPost"></a>
# **createNotificationClientUsingPost**
> NotificationClient createNotificationClientUsingPost(notificationClient)

Create a Notification Client

Create a new Notification Client. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationClient = new HydrogenNucleusApi.NotificationClient(); // NotificationClient | notificationClient


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNotificationClientUsingPost(notificationClient, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClient** | [**NotificationClient**](NotificationClient.md)| notificationClient | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNotificationSettingUsingPost"></a>
# **createNotificationSettingUsingPost**
> NotificationSetting createNotificationSettingUsingPost(notificationSetting)

Create a Notification Setting

Create a new Notification Setting. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationSetting = new HydrogenNucleusApi.NotificationSetting(); // NotificationSetting | notificationSetting


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNotificationSettingUsingPost(notificationSetting, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSetting** | [**NotificationSetting**](NotificationSetting.md)| notificationSetting | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNotificationUsingPost"></a>
# **createNotificationUsingPost**
> Notification createNotificationUsingPost(notification)

Create a Notification

Create a new Notification. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notification = new HydrogenNucleusApi.Notification(); // Notification | notification


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNotificationUsingPost(notification, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteNotificationClientUsingDelete"></a>
# **deleteNotificationClientUsingDelete**
> deleteNotificationClientUsingDelete(notificationClientId)

Delete a Notification Client

Permanently Delete Notification Client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationClientId = "notificationClientId_example"; // String | notification_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNotificationClientUsingDelete(notificationClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClientId** | **String**| notification_client_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNotificationSettingUsingDelete"></a>
# **deleteNotificationSettingUsingDelete**
> deleteNotificationSettingUsingDelete(notificationSettingId)

Delete a Notification Setting

Permanently Delete Notification Setting. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationSettingId = "notificationSettingId_example"; // String | notification_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNotificationSettingUsingDelete(notificationSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSettingId** | **String**| notification_setting_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNotificationUsingDelete"></a>
# **deleteNotificationUsingDelete**
> deleteNotificationUsingDelete(notificationId)

Delete a Notification

Permanently Delete a Notification. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID notification_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNotificationUsingDelete(notificationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**| UUID notification_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationAllUsingGet"></a>
# **getNotificationAllUsingGet**
> PageNotification getNotificationAllUsingGet(opts)

Get All Notification

Get All Notification. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

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
apiInstance.getNotificationAllUsingGet(opts, callback);
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

[**PageNotification**](PageNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationClientAllUsingGet"></a>
# **getNotificationClientAllUsingGet**
> PageNotificationClient getNotificationClientAllUsingGet(opts)

List all Notification Client

List all Notification Client. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

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
apiInstance.getNotificationClientAllUsingGet(opts, callback);
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

[**PageNotificationClient**](PageNotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationClientUsingGet"></a>
# **getNotificationClientUsingGet**
> NotificationClient getNotificationClientUsingGet(notificationClientId)

Retrieve a Notification Client

Retrieve a  Notification Client. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationClientId = "notificationClientId_example"; // String | notification_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNotificationClientUsingGet(notificationClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClientId** | **String**| notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationSettingAllUsingGet"></a>
# **getNotificationSettingAllUsingGet**
> PageNotificationSetting getNotificationSettingAllUsingGet(opts)

List all Notification Setting

List all Notification Setting. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

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
apiInstance.getNotificationSettingAllUsingGet(opts, callback);
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

[**PageNotificationSetting**](PageNotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationSettingUsingGet"></a>
# **getNotificationSettingUsingGet**
> NotificationSetting getNotificationSettingUsingGet(notificationSettingId)

Retrieve a Notification Setting

Retrieve a  Notification Setting. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationSettingId = "notificationSettingId_example"; // String | notification_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNotificationSettingUsingGet(notificationSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSettingId** | **String**| notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationUsingGet"></a>
# **getNotificationUsingGet**
> Notification getNotificationUsingGet(notificationId)

Get a Notification

Get a Notification. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationId = "notificationId_example"; // String | notification_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNotificationUsingGet(notificationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**| notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationClientUsingPut"></a>
# **updateNotificationClientUsingPut**
> NotificationClient updateNotificationClientUsingPut(notificationClient, notificationClientId)

Update a Notification Client

Update a  Notification Client. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationClient = new HydrogenNucleusApi.NotificationClient(); // NotificationClient | notification_client

var notificationClientId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID notification_client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNotificationClientUsingPut(notificationClient, notificationClientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClient** | [**NotificationClient**](NotificationClient.md)| notification_client | 
 **notificationClientId** | **String**| UUID notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNotificationSettingUsingPut"></a>
# **updateNotificationSettingUsingPut**
> NotificationSetting updateNotificationSettingUsingPut(notificationSetting, notificationSettingId)

Update a Notification Setting

Update a  Notification Setting. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notificationSetting = new HydrogenNucleusApi.NotificationSetting(); // NotificationSetting | notification_setting

var notificationSettingId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID notification_setting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNotificationSettingUsingPut(notificationSetting, notificationSettingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSetting** | [**NotificationSetting**](NotificationSetting.md)| notification_setting | 
 **notificationSettingId** | **String**| UUID notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNotificationUsingPut"></a>
# **updateNotificationUsingPut**
> Notification updateNotificationUsingPut(notification, notificationId)

Update a Notification

Update a Notification. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.NotificationApi();

var notification = new HydrogenNucleusApi.Notification(); // Notification | notification

var notificationId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID notification_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNotificationUsingPut(notification, notificationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 
 **notificationId** | **String**| UUID notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

