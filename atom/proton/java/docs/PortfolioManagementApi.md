# PortfolioManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rebalancingSignal**](PortfolioManagementApi.md#rebalancingSignal) | **POST** /rebalancing_signal | Rebalancing Signal


<a name="rebalancingSignal"></a>
# **rebalancingSignal**
> Map&lt;String, Object&gt; rebalancingSignal(rebalancingSignalRequest)

Rebalancing Signal

Generate rebalancing signals for a group of investments

### Example
```java
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PortfolioManagementApi;

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

PortfolioManagementApi apiInstance = new PortfolioManagementApi();
RebalancingSignalRequest rebalancingSignalRequest = new RebalancingSignalRequest(); // RebalancingSignalRequest | Request payload for Rebalancing Signal
try {
    Map<String, Object> result = apiInstance.rebalancingSignal(rebalancingSignalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioManagementApi#rebalancingSignal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rebalancingSignalRequest** | [**RebalancingSignalRequest**](RebalancingSignalRequest.md)| Request payload for Rebalancing Signal |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

