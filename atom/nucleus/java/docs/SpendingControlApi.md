# SpendingControlApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpendingControlUsingPost**](SpendingControlApi.md#createSpendingControlUsingPost) | **POST** /spending_control | Create a Spending Control
[**deleteSpendingControlUsingDelete**](SpendingControlApi.md#deleteSpendingControlUsingDelete) | **DELETE** /spending_control/{spending_control_id} | Delete a Spending Control
[**getSpendingControlAllUsingGet**](SpendingControlApi.md#getSpendingControlAllUsingGet) | **GET** /spending_control | List all Spending Control
[**getSpendingControlUsingGet**](SpendingControlApi.md#getSpendingControlUsingGet) | **GET** /spending_control/{spending_control_id} | Retrieve a Spending Control
[**updateSpendingControlUsingPut**](SpendingControlApi.md#updateSpendingControlUsingPut) | **PUT** /spending_control/{spending_control_id} | Update a Spending Control


<a name="createSpendingControlUsingPost"></a>
# **createSpendingControlUsingPost**
> SpendingControl createSpendingControlUsingPost(spendingControl)

Create a Spending Control

Create a new Spending Control.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SpendingControlApi;

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
SpendingControlApi apiInstance = new SpendingControlApi();
SpendingControl spendingControl = new SpendingControl(); // SpendingControl | spendingControl
try {
    SpendingControl result = apiInstance.createSpendingControlUsingPost(spendingControl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingControlApi#createSpendingControlUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControl** | [**SpendingControl**](SpendingControl.md)| spendingControl |

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSpendingControlUsingDelete"></a>
# **deleteSpendingControlUsingDelete**
> deleteSpendingControlUsingDelete(spendingControlId)

Delete a Spending Control

Permanently Delete Spending Control.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SpendingControlApi;

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
SpendingControlApi apiInstance = new SpendingControlApi();
UUID spendingControlId = new UUID(); // UUID | spending_control_id
try {
    apiInstance.deleteSpendingControlUsingDelete(spendingControlId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingControlApi#deleteSpendingControlUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControlId** | [**UUID**](.md)| spending_control_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSpendingControlAllUsingGet"></a>
# **getSpendingControlAllUsingGet**
> PageSpendingControl getSpendingControlAllUsingGet(ascending, filter, orderBy, page, size)

List all Spending Control

List all Spending Control.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SpendingControlApi;

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
SpendingControlApi apiInstance = new SpendingControlApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSpendingControl result = apiInstance.getSpendingControlAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingControlApi#getSpendingControlAllUsingGet");
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

[**PageSpendingControl**](PageSpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpendingControlUsingGet"></a>
# **getSpendingControlUsingGet**
> SpendingControl getSpendingControlUsingGet(spendingControlId)

Retrieve a Spending Control

Retrieve a Spending Control. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SpendingControlApi;

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
SpendingControlApi apiInstance = new SpendingControlApi();
UUID spendingControlId = new UUID(); // UUID | spending_control_id
try {
    SpendingControl result = apiInstance.getSpendingControlUsingGet(spendingControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingControlApi#getSpendingControlUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControlId** | [**UUID**](.md)| spending_control_id |

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSpendingControlUsingPut"></a>
# **updateSpendingControlUsingPut**
> SpendingControl updateSpendingControlUsingPut(spendingControl, spendingControlId)

Update a Spending Control

Update a Spending Control. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SpendingControlApi;

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
SpendingControlApi apiInstance = new SpendingControlApi();
Object spendingControl = null; // Object | spending_control
UUID spendingControlId = new UUID(); // UUID | UUID spending_control_id
try {
    SpendingControl result = apiInstance.updateSpendingControlUsingPut(spendingControl, spendingControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingControlApi#updateSpendingControlUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControl** | **Object**| spending_control |
 **spendingControlId** | [**UUID**](.md)| UUID spending_control_id |

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

