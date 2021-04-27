# AppTokenApi

All URIs are relative to *https://api.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppTokenUsingGET**](AppTokenApi.md#getAppTokenUsingGET) | **GET** /app_token | getAppToken


<a name="getAppTokenUsingGET"></a>
# **getAppTokenUsingGET**
> List&lt;AppToken&gt; getAppTokenUsingGET(appName)

getAppToken

### Example
```java
//import com.hydrogen.admin.AuthApiClient;
//import com.hydrogen.admin.ApiException;
//import com.hydrogen.admin.model.AppToken;
//import com.hydrogen.admin.*;
//import AppTokenApi;
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
AppTokenApi apiInstance = new AppTokenApi();
List<String> appName = Arrays.asList("appName_example"); // List<String> | app_name
try {
    List<AppToken> result = apiInstance.getAppTokenUsingGET(appName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppTokenApi#getAppTokenUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appName** | [**List&lt;String&gt;**](String.md)| app_name |

### Return type

[**List&lt;AppToken&gt;**](AppToken.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*
