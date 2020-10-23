# IavApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIAVUsingPost**](IavApi.md#createIAVUsingPost) | **POST** /iav | Instant Account Verification of an account.
[**getIAVUsingGet**](IavApi.md#getIAVUsingGet) | **GET** /iav/{nucleus_bank_link_id} | Get verified account based on id.


<a name="createIAVUsingPost"></a>
# **createIAVUsingPost**
> IavResponseVo createIAVUsingPost(iavRequestCO)

Instant Account Verification of an account.

Endpoint is used to verify account.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import IavApi;

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

IavApi apiInstance = new IavApi();
IavRequestCO iavRequestCO = new IavRequestCO(); // IavRequestCO | iavRequestCO
try {
    IavResponseVo result = apiInstance.createIAVUsingPost(iavRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IavApi#createIAVUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iavRequestCO** | [**IavRequestCO**](IavRequestCO.md)| iavRequestCO |

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getIAVUsingGet"></a>
# **getIAVUsingGet**
> IavResponseVo getIAVUsingGet(nucleusBankLinkId)

Get verified account based on id.

Get verified account based on id.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import IavApi;

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

IavApi apiInstance = new IavApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    IavResponseVo result = apiInstance.getIAVUsingGet(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IavApi#getIAVUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

