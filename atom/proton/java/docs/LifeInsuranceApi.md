# LifeInsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lifeInsuranceNeedsCalculator**](LifeInsuranceApi.md#lifeInsuranceNeedsCalculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator


<a name="lifeInsuranceNeedsCalculator"></a>
# **lifeInsuranceNeedsCalculator**
> Map&lt;String, Object&gt; lifeInsuranceNeedsCalculator(lifeInsuranceNeedsCalculatorRequest)

Life Insurance Needs Calculator

Calculate life insurance needs based on existing asset and liability data

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import LifeInsuranceApi;

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

LifeInsuranceApi apiInstance = new LifeInsuranceApi();
LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest = new LifeInsuranceNeedsCalculatorRequest(); // LifeInsuranceNeedsCalculatorRequest | Request payload for Life Insurance Needs Calculator
try {
    Map<String, Object> result = apiInstance.lifeInsuranceNeedsCalculator(lifeInsuranceNeedsCalculatorRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LifeInsuranceApi#lifeInsuranceNeedsCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifeInsuranceNeedsCalculatorRequest** | [**LifeInsuranceNeedsCalculatorRequest**](LifeInsuranceNeedsCalculatorRequest.md)| Request payload for Life Insurance Needs Calculator |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

