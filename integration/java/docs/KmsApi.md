# KmsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKMSUsingPost**](KmsApi.md#createKMSUsingPost) | **POST** /kms | Create an secret key
[**deleteKMSUsingDelete**](KmsApi.md#deleteKMSUsingDelete) | **DELETE** /kms/{kms_id} | Delete an secret key value
[**getKMSAllUsingGet**](KmsApi.md#getKMSAllUsingGet) | **GET** /kms | List all KMS Clients
[**getKMSUsingGet**](KmsApi.md#getKMSUsingGet) | **GET** /kms/{kms_id} | Retrieve an secret key value
[**updateKMSUsingPut**](KmsApi.md#updateKMSUsingPut) | **PUT** /kms/{kms_id} | Update an Key Value


<a name="createKMSUsingPost"></a>
# **createKMSUsingPost**
> KmsConfig createKMSUsingPost(kmsConfig)

Create an secret key

Create an secret key.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KmsApi;

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

KmsApi apiInstance = new KmsApi();
KmsConfig kmsConfig = new KmsConfig(); // KmsConfig | kmsConfig
try {
    KmsConfig result = apiInstance.createKMSUsingPost(kmsConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KmsApi#createKMSUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsConfig** | [**KmsConfig**](KmsConfig.md)| kmsConfig |

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKMSUsingDelete"></a>
# **deleteKMSUsingDelete**
> deleteKMSUsingDelete(kmsId)

Delete an secret key value

Permanently delete an secret key value under a tenant.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KmsApi;

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

KmsApi apiInstance = new KmsApi();
UUID kmsId = new UUID(); // UUID | KMS Id
try {
    apiInstance.deleteKMSUsingDelete(kmsId);
} catch (ApiException e) {
    System.err.println("Exception when calling KmsApi#deleteKMSUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsId** | [**UUID**](.md)| KMS Id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKMSAllUsingGet"></a>
# **getKMSAllUsingGet**
> PageKmsConfig getKMSAllUsingGet(ascending, orderBy, page, size)

List all KMS Clients

Get details for all clients registered with your firm.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KmsApi;

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

KmsApi apiInstance = new KmsApi();
Boolean ascending = false; // Boolean | ascending
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageKmsConfig result = apiInstance.getKMSAllUsingGet(ascending, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KmsApi#getKMSAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageKmsConfig**](PageKmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKMSUsingGet"></a>
# **getKMSUsingGet**
> KmsConfig getKMSUsingGet(kmsId)

Retrieve an secret key value

Retrieve the information for a specific value associated with a Secret key.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KmsApi;

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

KmsApi apiInstance = new KmsApi();
UUID kmsId = new UUID(); // UUID | KMS Id
try {
    KmsConfig result = apiInstance.getKMSUsingGet(kmsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KmsApi#getKMSUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsId** | [**UUID**](.md)| KMS Id |

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKMSUsingPut"></a>
# **updateKMSUsingPut**
> KmsConfig updateKMSUsingPut(kmsConfig, kmsId)

Update an Key Value

Update the information for an key value.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KmsApi;

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

KmsApi apiInstance = new KmsApi();
KmsConfig kmsConfig = new KmsConfig(); // KmsConfig | kmsConfig
UUID kmsId = new UUID(); // UUID | kms_id
try {
    KmsConfig result = apiInstance.updateKMSUsingPut(kmsConfig, kmsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KmsApi#updateKMSUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsConfig** | [**KmsConfig**](KmsConfig.md)| kmsConfig |
 **kmsId** | [**UUID**](.md)| kms_id |

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

