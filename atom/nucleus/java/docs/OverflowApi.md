# OverflowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOverflowSettingsUsingPost**](OverflowApi.md#createOverflowSettingsUsingPost) | **POST** /overflow_setting | Create a Overflow Settings request
[**createOverflowUsingPost**](OverflowApi.md#createOverflowUsingPost) | **POST** /overflow | Create a Overflow request
[**deleteOverflowSettingsUsingDelete**](OverflowApi.md#deleteOverflowSettingsUsingDelete) | **DELETE** /overflow_setting/{overflow_settings_id} | Delete a overflow settings
[**getOverflowAllUsingGet**](OverflowApi.md#getOverflowAllUsingGet) | **GET** /overflow | List all overflow objects
[**getOverflowSettingsAllUsingGet**](OverflowApi.md#getOverflowSettingsAllUsingGet) | **GET** /overflow_setting | List all overflow settings
[**getOverflowSettingsUsingGet**](OverflowApi.md#getOverflowSettingsUsingGet) | **GET** /overflow_setting/{overflow_settings_id} | Retrieve a Overflow Setting
[**getOverflowUsingGet**](OverflowApi.md#getOverflowUsingGet) | **GET** /overflow/{overflow_id} | Retrieve a Overflow object
[**updateOverflowSettingsUsingPut**](OverflowApi.md#updateOverflowSettingsUsingPut) | **PUT** /overflow_setting/{overflow_settings_id} | Update a overflow settings


<a name="createOverflowSettingsUsingPost"></a>
# **createOverflowSettingsUsingPost**
> OverflowSettings createOverflowSettingsUsingPost(overflowSettings)

Create a Overflow Settings request

Create a new Overflow Settings request.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
OverflowSettings overflowSettings = new OverflowSettings(); // OverflowSettings | overflowSettings
try {
    OverflowSettings result = apiInstance.createOverflowSettingsUsingPost(overflowSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#createOverflowSettingsUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettings** | [**OverflowSettings**](OverflowSettings.md)| overflowSettings |

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOverflowUsingPost"></a>
# **createOverflowUsingPost**
> Overflow createOverflowUsingPost(overflowVO)

Create a Overflow request

Create a new Overflow request.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
OverflowVO overflowVO = new OverflowVO(); // OverflowVO | overflowVO
try {
    Overflow result = apiInstance.createOverflowUsingPost(overflowVO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#createOverflowUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowVO** | [**OverflowVO**](OverflowVO.md)| overflowVO |

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOverflowSettingsUsingDelete"></a>
# **deleteOverflowSettingsUsingDelete**
> deleteOverflowSettingsUsingDelete(overflowSettingsId)

Delete a overflow settings

Permanently delete a  overflow settings registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
UUID overflowSettingsId = new UUID(); // UUID | UUID overflow_settings_id
try {
    apiInstance.deleteOverflowSettingsUsingDelete(overflowSettingsId);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#deleteOverflowSettingsUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettingsId** | [**UUID**](.md)| UUID overflow_settings_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowAllUsingGet"></a>
# **getOverflowAllUsingGet**
> PageOverflow getOverflowAllUsingGet(ascending, filter, orderBy, page, size)

List all overflow objects

Get details for all overflow.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOverflow result = apiInstance.getOverflowAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#getOverflowAllUsingGet");
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

[**PageOverflow**](PageOverflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowSettingsAllUsingGet"></a>
# **getOverflowSettingsAllUsingGet**
> PageOverflowSettings getOverflowSettingsAllUsingGet(ascending, filter, orderBy, page, size)

List all overflow settings

Get details for all overflow setting.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOverflowSettings result = apiInstance.getOverflowSettingsAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#getOverflowSettingsAllUsingGet");
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

[**PageOverflowSettings**](PageOverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowSettingsUsingGet"></a>
# **getOverflowSettingsUsingGet**
> OverflowSettings getOverflowSettingsUsingGet(overflowSettingsId)

Retrieve a Overflow Setting

Retrieve the information for a Overflow Settings.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
UUID overflowSettingsId = new UUID(); // UUID | UUID overflow_settings_id
try {
    OverflowSettings result = apiInstance.getOverflowSettingsUsingGet(overflowSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#getOverflowSettingsUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettingsId** | [**UUID**](.md)| UUID overflow_settings_id |

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowUsingGet"></a>
# **getOverflowUsingGet**
> Overflow getOverflowUsingGet(overflowId)

Retrieve a Overflow object

Retrieve the information for a Overflow.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
UUID overflowId = new UUID(); // UUID | UUID overflow_id
try {
    Overflow result = apiInstance.getOverflowUsingGet(overflowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#getOverflowUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowId** | [**UUID**](.md)| UUID overflow_id |

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOverflowSettingsUsingPut"></a>
# **updateOverflowSettingsUsingPut**
> OverflowSettings updateOverflowSettingsUsingPut(overflowSettings, overflowSettingsId)

Update a overflow settings

Update the information for a overflow setting registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import OverflowApi;

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
OverflowApi apiInstance = new OverflowApi();
Object overflowSettings = null; // Object | overflow_settings
UUID overflowSettingsId = new UUID(); // UUID | UUID overflow_settings_id
try {
    OverflowSettings result = apiInstance.updateOverflowSettingsUsingPut(overflowSettings, overflowSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverflowApi#updateOverflowSettingsUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettings** | **Object**| overflow_settings |
 **overflowSettingsId** | [**UUID**](.md)| UUID overflow_settings_id |

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

