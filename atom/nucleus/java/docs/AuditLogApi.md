# AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuditLogUsingPost**](AuditLogApi.md#createAuditLogUsingPost) | **POST** /audit_log | Create a audit log
[**getAuditLogAllUsingGet**](AuditLogApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | List all audit log
[**getAuditLogUsingGet**](AuditLogApi.md#getAuditLogUsingGet) | **GET** /audit_log/{audit_log_id} | Retrieve a audit log


<a name="createAuditLogUsingPost"></a>
# **createAuditLogUsingPost**
> AuditLog createAuditLogUsingPost(auditLog)

Create a audit log

Create a new audit log.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AuditLogApi;

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

AuditLogApi apiInstance = new AuditLogApi();
AuditLog auditLog = new AuditLog(); // AuditLog | auditLog
try {
    AuditLog result = apiInstance.createAuditLogUsingPost(auditLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#createAuditLogUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditLog** | [**AuditLog**](AuditLog.md)| auditLog |

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAuditLogAllUsingGet"></a>
# **getAuditLogAllUsingGet**
> PageAuditLog getAuditLogAllUsingGet(ascending, filter, orderBy, page, size)

List all audit log

Get details for all audit log.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AuditLogApi;

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

AuditLogApi apiInstance = new AuditLogApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAuditLog result = apiInstance.getAuditLogAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#getAuditLogAllUsingGet");
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

[**PageAuditLog**](PageAuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAuditLogUsingGet"></a>
# **getAuditLogUsingGet**
> AuditLog getAuditLogUsingGet(auditLogId)

Retrieve a audit log

Retrieve the information for a audit log.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AuditLogApi;

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

AuditLogApi apiInstance = new AuditLogApi();
UUID auditLogId = new UUID(); // UUID | UUID audit_log_id
try {
    AuditLog result = apiInstance.getAuditLogUsingGet(auditLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#getAuditLogUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditLogId** | [**UUID**](.md)| UUID audit_log_id |

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

