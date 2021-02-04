# AdminClientApi

All URIs are relative to *https://dev.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdminClientUsingPost**](AdminClientApi.md#createAdminClientUsingPost) | **POST** /client | Create an admin client
[**deleteAdminClientUsingGet**](AdminClientApi.md#deleteAdminClientUsingGet) | **DELETE** /client/{client_id} | Delete an admin client
[**getAdminClientUsingGet**](AdminClientApi.md#getAdminClientUsingGet) | **GET** /client/{client_id} | Get an admin client
[**getAllAdminClientUsingGet**](AdminClientApi.md#getAllAdminClientUsingGet) | **GET** /client | List all admin clients
[**updateAdminClientUsingPut**](AdminClientApi.md#updateAdminClientUsingPut) | **PUT** /client/{client_id} | Update an admin client


<a name="createAdminClientUsingPost"></a>
# **createAdminClientUsingPost**
> AdminClient createAdminClientUsingPost(client)

Create an admin client

Create an admin client

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import com.hydrogen.nucleus.api.AdminClientApi;

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

AdminClientApi apiInstance = new AdminClientApi();
AdminClient client = new AdminClient(); // AdminClient | client
try {
    AdminClient result = apiInstance.createAdminClientUsingPost(client);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminClientApi#createAdminClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client |

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAdminClientUsingGet"></a>
# **deleteAdminClientUsingGet**
> deleteAdminClientUsingGet(clientId)

Delete an admin client

Delete an admin client

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import com.hydrogen.nucleus.api.AdminClientApi;

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

AdminClientApi apiInstance = new AdminClientApi();
Long clientId = 789L; // Long | client_id
try {
    apiInstance.deleteAdminClientUsingGet(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminClientApi#deleteAdminClientUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| client_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAdminClientUsingGet"></a>
# **getAdminClientUsingGet**
> AdminClient getAdminClientUsingGet(clientId)

Get an admin client

Get an admin client

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import com.hydrogen.nucleus.api.AdminClientApi;

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

AdminClientApi apiInstance = new AdminClientApi();
Long clientId = 789L; // Long | client_id
try {
    AdminClient result = apiInstance.getAdminClientUsingGet(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminClientApi#getAdminClientUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| client_id |

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllAdminClientUsingGet"></a>
# **getAllAdminClientUsingGet**
> PageAdminClient getAllAdminClientUsingGet(ascending, filter, orderBy, page, size)

List all admin clients

Get a list of all admin clients

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import com.hydrogen.nucleus.api.AdminClientApi;

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

AdminClientApi apiInstance = new AdminClientApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "username"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAdminClient result = apiInstance.getAllAdminClientUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminClientApi#getAllAdminClientUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to username]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAdminClient**](PageAdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAdminClientUsingPut"></a>
# **updateAdminClientUsingPut**
> AdminClient updateAdminClientUsingPut(client, clientId)

Update an admin client

Update an admin client

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import com.hydrogen.nucleus.api.AdminClientApi;

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

AdminClientApi apiInstance = new AdminClientApi();
AdminClient client = new AdminClient(); // AdminClient | client
Long clientId = 789L; // Long | client_id
try {
    AdminClient result = apiInstance.updateAdminClientUsingPut(client, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminClientApi#updateAdminClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client |
 **clientId** | **Long**| client_id |

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

