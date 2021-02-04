# AsyncApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsyncData**](AsyncApi.md#getAsyncData) | **GET** /async/{integration_type}/{service} | Create async transaction for GET endpoints for bulk data
[**getAsyncData1**](AsyncApi.md#getAsyncData1) | **GET** /async/{integration_type}/{service}/{id} | Create async transaction for GET endpoints for bulk data
[**getAsyncData2**](AsyncApi.md#getAsyncData2) | **POST** /async/{integration_type}/{service} | Create async transaction for POST endpoints for bulk data
[**getAsyncStatus**](AsyncApi.md#getAsyncStatus) | **GET** /async/status/{id} | Get Status of async transaction created through GET/POST endpoints


<a name="getAsyncData"></a>
# **getAsyncData**
> AsyncTransaction getAsyncData(id, integrationType, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AsyncApi;

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
AsyncApi apiInstance = new AsyncApi();
UUID id = new UUID(); // UUID | UUID id
String integrationType = "integrationType_example"; // String | String integration_type
String service = "service_example"; // String | String service
try {
    AsyncTransaction result = apiInstance.getAsyncData(id, integrationType, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncApi#getAsyncData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| UUID id |
 **integrationType** | **String**| String integration_type |
 **service** | **String**| String service |

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsyncData1"></a>
# **getAsyncData1**
> AsyncTransaction getAsyncData1(id, integrationType, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AsyncApi;

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
AsyncApi apiInstance = new AsyncApi();
UUID id = new UUID(); // UUID | UUID id
String integrationType = "integrationType_example"; // String | String integration_type
String service = "service_example"; // String | String service
try {
    AsyncTransaction result = apiInstance.getAsyncData1(id, integrationType, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncApi#getAsyncData1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| UUID id |
 **integrationType** | **String**| String integration_type |
 **service** | **String**| String service |

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsyncData2"></a>
# **getAsyncData2**
> AsyncTransaction getAsyncData2(data, integrationType, service)

Create async transaction for POST endpoints for bulk data

Create async transaction for POST endpoints for bulk data

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AsyncApi;

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
AsyncApi apiInstance = new AsyncApi();
JsonNode data = new JsonNode(); // JsonNode | data
String integrationType = "integrationType_example"; // String | String integration_type
String service = "service_example"; // String | String service
try {
    AsyncTransaction result = apiInstance.getAsyncData2(data, integrationType, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncApi#getAsyncData2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data |
 **integrationType** | **String**| String integration_type |
 **service** | **String**| String service |

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAsyncStatus"></a>
# **getAsyncStatus**
> AsyncTransactionVO getAsyncStatus(id)

Get Status of async transaction created through GET/POST endpoints

Get Status of async transaction created through GET/POST endpoints

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AsyncApi;

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
AsyncApi apiInstance = new AsyncApi();
UUID id = new UUID(); // UUID | UUID Async Transaction Id
try {
    AsyncTransactionVO result = apiInstance.getAsyncStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncApi#getAsyncStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| UUID Async Transaction Id |

### Return type

[**AsyncTransactionVO**](AsyncTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

