# HydrogenIntegrationApi.WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookUsingPost**](WebhookApi.md#createWebhookUsingPost) | **POST** /webhook | Create a webhook
[**deleteWebhookUsingDelete**](WebhookApi.md#deleteWebhookUsingDelete) | **DELETE** /webhook/{webhook_id} | Delete a webhook
[**getWebhookAllUsingGet**](WebhookApi.md#getWebhookAllUsingGet) | **GET** /webhook | List all webhooks
[**getWebhookUsingGet**](WebhookApi.md#getWebhookUsingGet) | **GET** /webhook/{webhook_id} | Retrieve a webhook
[**updateWebhookUsingPut**](WebhookApi.md#updateWebhookUsingPut) | **PUT** /webhook/{webhook_id} | Update a webhook


<a name="createWebhookUsingPost"></a>
# **createWebhookUsingPost**
> Webhook createWebhookUsingPost(webhookRequest)

Create a webhook

One active webhook service is allowed at all times.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WebhookApi();

var webhookRequest = new HydrogenIntegrationApi.Webhook(); // Webhook | webhookRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createWebhookUsingPost(webhookRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRequest** | [**Webhook**](Webhook.md)| webhookRequest | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteWebhookUsingDelete"></a>
# **deleteWebhookUsingDelete**
> deleteWebhookUsingDelete(webhookId)

Delete a webhook

Permanently delete a webhook for your business. The webhook_id must be provided.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WebhookApi();

var webhookId = "webhookId_example"; // String | UUID webhook_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteWebhookUsingDelete(webhookId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**String**](.md)| UUID webhook_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookAllUsingGet"></a>
# **getWebhookAllUsingGet**
> PageWebhook getWebhookAllUsingGet(opts)

List all webhooks

Get information for all webhooks defined for your business.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WebhookApi();

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
apiInstance.getWebhookAllUsingGet(opts, callback);
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

[**PageWebhook**](PageWebhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookUsingGet"></a>
# **getWebhookUsingGet**
> Webhook getWebhookUsingGet(webhookId)

Retrieve a webhook

Retrieve the information for a specific webhook. The webhook_id must be provided.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WebhookApi();

var webhookId = "webhookId_example"; // String | UUID webhook_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWebhookUsingGet(webhookId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**String**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateWebhookUsingPut"></a>
# **updateWebhookUsingPut**
> Webhook updateWebhookUsingPut(webhook, webhookId)

Update a webhook

Update a webhook for your business. The webhook_id must be provided

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.WebhookApi();

var webhook = null; // Object | webhook

var webhookId = "webhookId_example"; // String | UUID webhook_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateWebhookUsingPut(webhook, webhookId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | **Object**| webhook | 
 **webhookId** | [**String**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

