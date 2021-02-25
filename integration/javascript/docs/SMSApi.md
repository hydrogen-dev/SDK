# HydrogenIntegrationApi.SMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSmsStatus**](SMSApi.md#getSmsStatus) | **GET** /sms/status/{sms_id} | Fetch details for corresponding sms_id
[**sendMail**](SMSApi.md#sendMail) | **POST** /sms | Send SMS to recipient


<a name="getSmsStatus"></a>
# **getSmsStatus**
> SMS getSmsStatus(smsId)

Fetch details for corresponding sms_id

Fetch details for corresponding sms_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.SMSApi();

var smsId = "smsId_example"; // String | sms_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSmsStatus(smsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsId** | [**String**](.md)| sms_id | 

### Return type

[**SMS**](SMS.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendMail"></a>
# **sendMail**
> SMSResponseVO sendMail(smsVO)

Send SMS to recipient

Send SMS to recipient

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.SMSApi();

var smsVO = new HydrogenIntegrationApi.SMSVO(); // SMSVO | smsVO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sendMail(smsVO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsVO** | [**SMSVO**](SMSVO.md)| smsVO | 

### Return type

[**SMSResponseVO**](SMSResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

