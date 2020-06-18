# ApplicationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationUsingPost**](ApplicationApi.md#createApplicationUsingPost) | **POST** /application | Create an application
[**deleteApplicationUsingDelete**](ApplicationApi.md#deleteApplicationUsingDelete) | **DELETE** /application/{application_id} | Delete an Application
[**getApplicationAllUsingGet**](ApplicationApi.md#getApplicationAllUsingGet) | **GET** /application | List all Application
[**getApplicationUsingGet**](ApplicationApi.md#getApplicationUsingGet) | **GET** /application/{application_id} | Retrieve an Application
[**updateApplicationUsingPut**](ApplicationApi.md#updateApplicationUsingPut) | **PUT** /application/{application_id} | Update an Application


<a name="createApplicationUsingPost"></a>
# **createApplicationUsingPost**
> Application createApplicationUsingPost(application)

Create an application

Create an application

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
Application application = new Application(); // Application | application
try {
    Application result = apiInstance.createApplicationUsingPost(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#createApplicationUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application |

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteApplicationUsingDelete"></a>
# **deleteApplicationUsingDelete**
> deleteApplicationUsingDelete(applicationId)

Delete an Application

Permanently delete an Application.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
UUID applicationId = new UUID(); // UUID | UUID application_id
try {
    apiInstance.deleteApplicationUsingDelete(applicationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#deleteApplicationUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| UUID application_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationAllUsingGet"></a>
# **getApplicationAllUsingGet**
> PageApplication getApplicationAllUsingGet(ascending, filter, orderBy, page, size)

List all Application

Get details for all Application.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageApplication result = apiInstance.getApplicationAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplicationAllUsingGet");
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

[**PageApplication**](PageApplication.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationUsingGet"></a>
# **getApplicationUsingGet**
> Application getApplicationUsingGet(applicationId)

Retrieve an Application

Retrieve the information for an Application.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
UUID applicationId = new UUID(); // UUID | UUID application_id
try {
    Application result = apiInstance.getApplicationUsingGet(applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplicationUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| UUID application_id |

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateApplicationUsingPut"></a>
# **updateApplicationUsingPut**
> Application updateApplicationUsingPut(application, applicationId)

Update an Application

Update the information for an Application

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
Application application = new Application(); // Application | application
UUID applicationId = new UUID(); // UUID | UUID application_id
try {
    Application result = apiInstance.updateApplicationUsingPut(application, applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#updateApplicationUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application |
 **applicationId** | [**UUID**](.md)| UUID application_id |

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

