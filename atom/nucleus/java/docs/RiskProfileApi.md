# RiskProfileApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRiskProfileUsingPost**](RiskProfileApi.md#createRiskProfileUsingPost) | **POST** /risk_profile | Create a Risk Profile
[**deleteRiskProfileUsingDelete**](RiskProfileApi.md#deleteRiskProfileUsingDelete) | **DELETE** /risk_profile/{risk_profile_id} | Delete a Risk Profile
[**getRiskProfileAllUsingGet**](RiskProfileApi.md#getRiskProfileAllUsingGet) | **GET** /risk_profile | Get All Risk Profile
[**getRiskProfileUsingGet**](RiskProfileApi.md#getRiskProfileUsingGet) | **GET** /risk_profile/{risk_profile_id} | Get a Risk Profile
[**updateRiskProfileUsingPut**](RiskProfileApi.md#updateRiskProfileUsingPut) | **PUT** /risk_profile/{risk_profile_id} | Update a Risk Profile


<a name="createRiskProfileUsingPost"></a>
# **createRiskProfileUsingPost**
> RiskProfile createRiskProfileUsingPost(riskProfile)

Create a Risk Profile

Create a new Risk Profile. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RiskProfileApi;

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

RiskProfileApi apiInstance = new RiskProfileApi();
RiskProfile riskProfile = new RiskProfile(); // RiskProfile | riskProfile
try {
    RiskProfile result = apiInstance.createRiskProfileUsingPost(riskProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskProfileApi#createRiskProfileUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfile** | [**RiskProfile**](RiskProfile.md)| riskProfile |

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRiskProfileUsingDelete"></a>
# **deleteRiskProfileUsingDelete**
> deleteRiskProfileUsingDelete(riskProfileId)

Delete a Risk Profile

Permanently Delete a Risk Profile.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RiskProfileApi;

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

RiskProfileApi apiInstance = new RiskProfileApi();
UUID riskProfileId = new UUID(); // UUID | UUID risk_profile_id
try {
    apiInstance.deleteRiskProfileUsingDelete(riskProfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskProfileApi#deleteRiskProfileUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfileId** | [**UUID**](.md)| UUID risk_profile_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRiskProfileAllUsingGet"></a>
# **getRiskProfileAllUsingGet**
> PageRiskProfile getRiskProfileAllUsingGet(ascending, filter, orderBy, page, size)

Get All Risk Profile

Get All Risk Profile. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RiskProfileApi;

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

RiskProfileApi apiInstance = new RiskProfileApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageRiskProfile result = apiInstance.getRiskProfileAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskProfileApi#getRiskProfileAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageRiskProfile**](PageRiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRiskProfileUsingGet"></a>
# **getRiskProfileUsingGet**
> RiskProfile getRiskProfileUsingGet(riskProfileId)

Get a Risk Profile

Get a Risk Profile. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RiskProfileApi;

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

RiskProfileApi apiInstance = new RiskProfileApi();
UUID riskProfileId = new UUID(); // UUID | UUID risk_profile_id
try {
    RiskProfile result = apiInstance.getRiskProfileUsingGet(riskProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskProfileApi#getRiskProfileUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfileId** | [**UUID**](.md)| UUID risk_profile_id |

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRiskProfileUsingPut"></a>
# **updateRiskProfileUsingPut**
> RiskProfile updateRiskProfileUsingPut(riskProfile, riskProfileId)

Update a Risk Profile

Update a Risk Profile. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RiskProfileApi;

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

RiskProfileApi apiInstance = new RiskProfileApi();
RiskProfile riskProfile = new RiskProfile(); // RiskProfile | risk_profile
UUID riskProfileId = new UUID(); // UUID | UUID risk_profile_id
try {
    RiskProfile result = apiInstance.updateRiskProfileUsingPut(riskProfile, riskProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskProfileApi#updateRiskProfileUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfile** | [**RiskProfile**](RiskProfile.md)| risk_profile |
 **riskProfileId** | [**UUID**](.md)| UUID risk_profile_id |

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

