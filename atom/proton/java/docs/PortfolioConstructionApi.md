# PortfolioConstructionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mvo**](PortfolioConstructionApi.md#mvo) | **POST** /mvo | MVO


<a name="mvo"></a>
# **mvo**
> Map&lt;String, Object&gt; mvo(mvoRequest)

MVO

Run a mean-variance optimization for a group of potential investments

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import PortfolioConstructionApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


PortfolioConstructionApi apiInstance = new PortfolioConstructionApi();
MvoRequest mvoRequest = new MvoRequest(); // MvoRequest | Request payload for MVO
try {
    Map<String, Object> result = apiInstance.mvo(mvoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioConstructionApi#mvo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mvoRequest** | [**MvoRequest**](MvoRequest.md)| Request payload for MVO |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

