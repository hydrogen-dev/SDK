# GoalsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goalAccumulationAllocation**](GoalsApi.md#goalAccumulationAllocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
[**goalAccumulationRecommendation**](GoalsApi.md#goalAccumulationRecommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
[**goalAccumulationStatus**](GoalsApi.md#goalAccumulationStatus) | **POST** /goal_accumulation/status | Goal Accumulation Status
[**goalDecumulationAllocation**](GoalsApi.md#goalDecumulationAllocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
[**goalDecumulationRecommendation**](GoalsApi.md#goalDecumulationRecommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
[**goalDecumulationStatus**](GoalsApi.md#goalDecumulationStatus) | **POST** /goal_decumulation/status | Goal Decumulation Status


<a name="goalAccumulationAllocation"></a>
# **goalAccumulationAllocation**
> Map&lt;String, Object&gt; goalAccumulationAllocation(goalAccumulationAllocationRequest)

Goal Accumulation Allocation

Allocate based on an accumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalAccumulationAllocationRequest goalAccumulationAllocationRequest = new GoalAccumulationAllocationRequest(); // GoalAccumulationAllocationRequest | Request payload for Goal Accumulation Allocation
try {
    Map<String, Object> result = apiInstance.goalAccumulationAllocation(goalAccumulationAllocationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalAccumulationAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationAllocationRequest** | [**GoalAccumulationAllocationRequest**](GoalAccumulationAllocationRequest.md)| Request payload for Goal Accumulation Allocation |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationRecommendation"></a>
# **goalAccumulationRecommendation**
> Map&lt;String, Object&gt; goalAccumulationRecommendation(goalAccumulationRecommendationRequest)

Goal Accumulation Recommendation

Generate recommendations to achieve an accumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalAccumulationRecommendationRequest goalAccumulationRecommendationRequest = new GoalAccumulationRecommendationRequest(); // GoalAccumulationRecommendationRequest | Request payload for Goal Accumulation Recommendation
try {
    Map<String, Object> result = apiInstance.goalAccumulationRecommendation(goalAccumulationRecommendationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalAccumulationRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationRecommendationRequest** | [**GoalAccumulationRecommendationRequest**](GoalAccumulationRecommendationRequest.md)| Request payload for Goal Accumulation Recommendation |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationStatus"></a>
# **goalAccumulationStatus**
> Map&lt;String, Object&gt; goalAccumulationStatus(goalAccumulationStatusRequest)

Goal Accumulation Status

Track the status of an accumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalAccumulationStatusRequest goalAccumulationStatusRequest = new GoalAccumulationStatusRequest(); // GoalAccumulationStatusRequest | Request payload for Goal Accumulation Status
try {
    Map<String, Object> result = apiInstance.goalAccumulationStatus(goalAccumulationStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalAccumulationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationStatusRequest** | [**GoalAccumulationStatusRequest**](GoalAccumulationStatusRequest.md)| Request payload for Goal Accumulation Status |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationAllocation"></a>
# **goalDecumulationAllocation**
> Map&lt;String, Object&gt; goalDecumulationAllocation(goalDecumulationAllocationRequest)

Goal Decumulation Allocation

Allocate based on a decumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalDecumulationAllocationRequest goalDecumulationAllocationRequest = new GoalDecumulationAllocationRequest(); // GoalDecumulationAllocationRequest | Request payload for Goal Decumulation Allocation
try {
    Map<String, Object> result = apiInstance.goalDecumulationAllocation(goalDecumulationAllocationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalDecumulationAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationAllocationRequest** | [**GoalDecumulationAllocationRequest**](GoalDecumulationAllocationRequest.md)| Request payload for Goal Decumulation Allocation |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationRecommendation"></a>
# **goalDecumulationRecommendation**
> Map&lt;String, Object&gt; goalDecumulationRecommendation(goalDecumulationRecommendationRequest)

Goal Decumulation Recommendation

Generate recommendations to achieve a decumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalDecumulationRecommendationRequest goalDecumulationRecommendationRequest = new GoalDecumulationRecommendationRequest(); // GoalDecumulationRecommendationRequest | Request payload for Goal Decumulation Recommendation
try {
    Map<String, Object> result = apiInstance.goalDecumulationRecommendation(goalDecumulationRecommendationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalDecumulationRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationRecommendationRequest** | [**GoalDecumulationRecommendationRequest**](GoalDecumulationRecommendationRequest.md)| Request payload for Goal Decumulation Recommendation |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationStatus"></a>
# **goalDecumulationStatus**
> Map&lt;String, Object&gt; goalDecumulationStatus(goalDecumulationStatusRequest)

Goal Decumulation Status

Track the status of a decumulation goal

### Example
```java
// Import classes:
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.AuthApiClient;

//import com.hydrogen.proton.auth.*;
//import GoalsApi;

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


GoalsApi apiInstance = new GoalsApi();
GoalDecumulationStatusRequest goalDecumulationStatusRequest = new GoalDecumulationStatusRequest(); // GoalDecumulationStatusRequest | Request payload for Goal Decumulation Status
try {
    Map<String, Object> result = apiInstance.goalDecumulationStatus(goalDecumulationStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#goalDecumulationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationStatusRequest** | [**GoalDecumulationStatusRequest**](GoalDecumulationStatusRequest.md)| Request payload for Goal Decumulation Status |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

