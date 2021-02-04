# HydrogenIntegrationApi.SMTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailDetails**](SMTPApi.md#getEmailDetails) | **GET** /smtp/status/{email_id} | Fetch details for corresponding email_id
[**sendMail1**](SMTPApi.md#sendMail1) | **POST** /smtp | Send Mail to recipient


<a name="getEmailDetails"></a>
# **getEmailDetails**
> Email getEmailDetails(emailId)

Fetch details for corresponding email_id

Fetch details for corresponding email_id

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.SMTPApi();

var emailId = "emailId_example"; // String | email_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getEmailDetails(emailId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**String**](.md)| email_id | 

### Return type

[**Email**](Email.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendMail1"></a>
# **sendMail1**
> SmtpResponseVO sendMail1(smtpVO)

Send Mail to recipient

Send Mail to recipient

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.SMTPApi();

var smtpVO = new HydrogenIntegrationApi.SmtpVO(); // SmtpVO | smtpVO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sendMail1(smtpVO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smtpVO** | [**SmtpVO**](SmtpVO.md)| smtpVO | 

### Return type

[**SmtpResponseVO**](SmtpResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

