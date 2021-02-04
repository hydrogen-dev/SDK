# SmsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVendorCallLimit**](SmsApi.md#getVendorCallLimit) | **GET** /sms/status/{sms_id} | Fetch details for corresponding sms_id
[**sendMail**](SmsApi.md#sendMail) | **POST** /sms | Send SMS to recipient


<a name="getVendorCallLimit"></a>
# **getVendorCallLimit**
> SMS getVendorCallLimit(smsId)

Fetch details for corresponding sms_id

Fetch details for corresponding sms_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import com.hydrogen.integration.api.SmsApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                        "USERNAME", "PASSWORD");     
//  Creating a token using client_token
authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
        "CLIENT_TOKEN");      
} catch (ApiException e) {
e.printStackTrace();
}


SmsApi apiInstance = new SmsApi();
UUID smsId = new UUID(); // UUID | sms_id
try {
    SMS result = apiInstance.getVendorCallLimit(smsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#getVendorCallLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsId** | [**UUID**](.md)| sms_id |

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
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import com.hydrogen.integration.api.SmsApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                        "USERNAME", "PASSWORD");     
//  Creating a token using client_token
authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
        "CLIENT_TOKEN");      
} catch (ApiException e) {
e.printStackTrace();
}


SmsApi apiInstance = new SmsApi();
SMSVO smsVO = new SMSVO(); // SMSVO | smsVO
try {
    SMSResponseVO result = apiInstance.sendMail(smsVO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#sendMail");
    e.printStackTrace();
}
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

