# SmtpApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSmtpStatus**](SmtpApi.md#getSmtpStatus) | **GET** /smtp/status/{email_id} | Fetch details for corresponding email_id
[**sendMail1**](SmtpApi.md#sendMail1) | **POST** /smtp | Send Mail to recipient


<a name="getSmtpStatus"></a>
# **getSmtpStatus**
> Email getSmtpStatus(emailId)

Fetch details for corresponding email_id

Fetch details for corresponding email_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import com.hydrogen.integration.api.SmtpApi;

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


SmtpApi apiInstance = new SmtpApi();
UUID emailId = new UUID(); // UUID | email_id
try {
    Email result = apiInstance.getSmtpStatus(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#getSmtpStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**](.md)| email_id |

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
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import com.hydrogen.integration.api.SmtpApi;

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


SmtpApi apiInstance = new SmtpApi();
SmtpVO smtpVO = new SmtpVO(); // SmtpVO | smtpVO
try {
    SmtpResponseVO result = apiInstance.sendMail1(smtpVO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpApi#sendMail1");
    e.printStackTrace();
}
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

