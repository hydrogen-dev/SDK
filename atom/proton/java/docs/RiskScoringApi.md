# RiskScoringApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensionalRiskScore**](RiskScoringApi.md#dimensionalRiskScore) | **POST** /dimensional_risk_score | Dimensional Risk Score
[**riskAllocation**](RiskScoringApi.md#riskAllocation) | **POST** /risk_allocation | Risk Allocation
[**riskScore**](RiskScoringApi.md#riskScore) | **POST** /risk_score | Risk Score


<a name="dimensionalRiskScore"></a>
# **dimensionalRiskScore**
> Map&lt;String, Object&gt; dimensionalRiskScore(dimensionalRiskScoreRequest)

Dimensional Risk Score

Calculate a dimensional risk score based on questionnaire responses

### Example
```java
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import RiskScoringApi;

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

RiskScoringApi apiInstance = new RiskScoringApi();
DimensionalRiskScoreRequest dimensionalRiskScoreRequest = new DimensionalRiskScoreRequest(); // DimensionalRiskScoreRequest | Request payload for Dimensional Risk Score
try {
    Map<String, Object> result = apiInstance.dimensionalRiskScore(dimensionalRiskScoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskScoringApi#dimensionalRiskScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionalRiskScoreRequest** | [**DimensionalRiskScoreRequest**](DimensionalRiskScoreRequest.md)| Request payload for Dimensional Risk Score |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskAllocation"></a>
# **riskAllocation**
> Map&lt;String, Object&gt; riskAllocation(riskAllocationRequest)

Risk Allocation

Allocate based on a risk score

### Example
```java
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import RiskScoringApi;

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

RiskScoringApi apiInstance = new RiskScoringApi();
RiskAllocationRequest riskAllocationRequest = new RiskAllocationRequest(); // RiskAllocationRequest | Request payload for Risk Allocation
try {
    Map<String, Object> result = apiInstance.riskAllocation(riskAllocationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskScoringApi#riskAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskAllocationRequest** | [**RiskAllocationRequest**](RiskAllocationRequest.md)| Request payload for Risk Allocation |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskScore"></a>
# **riskScore**
> Map&lt;String, Object&gt; riskScore(riskScoreRequest)

Risk Score

Calculate a risk score based on questionnaire responses

### Example
```java
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import RiskScoringApi;

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

RiskScoringApi apiInstance = new RiskScoringApi();
RiskScoreRequest riskScoreRequest = new RiskScoreRequest(); // RiskScoreRequest | Request payload for Risk Score
try {
    Map<String, Object> result = apiInstance.riskScore(riskScoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskScoringApi#riskScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskScoreRequest** | [**RiskScoreRequest**](RiskScoreRequest.md)| Request payload for Risk Score |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

