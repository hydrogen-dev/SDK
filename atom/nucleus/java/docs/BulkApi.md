# BulkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkUsingPost**](BulkApi.md#createBulkUsingPost) | **POST** /bulk/{entity_uri} | Create a bulk data
[**deleteBulkUsingDelete**](BulkApi.md#deleteBulkUsingDelete) | **DELETE** /bulk/{entity_uri} | Delete a bulk data
[**getBulkStatusUsingGet**](BulkApi.md#getBulkStatusUsingGet) | **GET** /bulk/status/{id} | Status of bulk transaction
[**updateBulkUsingPut**](BulkApi.md#updateBulkUsingPut) | **PUT** /bulk/{entity_uri} | Update a bulk data


<a name="createBulkUsingPost"></a>
# **createBulkUsingPost**
> BulkTransaction createBulkUsingPost(data, entityUri)

Create a bulk data

Create a new bulk data for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BulkApi;

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

BulkApi apiInstance = new BulkApi();
JsonNode data = new JsonNode(); // JsonNode | data
UUID entityUri = new UUID(); // UUID | UUID entity_uri
try {
    BulkTransaction result = apiInstance.createBulkUsingPost(data, entityUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#createBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data |
 **entityUri** | [**UUID**](.md)| UUID entity_uri |

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBulkUsingDelete"></a>
# **deleteBulkUsingDelete**
> BulkTransaction deleteBulkUsingDelete(data, entityUri)

Delete a bulk data

Delete a bulk data for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BulkApi;

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

BulkApi apiInstance = new BulkApi();
JsonNode data = new JsonNode(); // JsonNode | data
UUID entityUri = new UUID(); // UUID | UUID entity_uri
try {
    BulkTransaction result = apiInstance.deleteBulkUsingDelete(data, entityUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#deleteBulkUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data |
 **entityUri** | [**UUID**](.md)| UUID entity_uri |

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkStatusUsingGet"></a>
# **getBulkStatusUsingGet**
> BulkTransactionVO getBulkStatusUsingGet(id)

Status of bulk transaction

Get the status of bulk transaction.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BulkApi;

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

BulkApi apiInstance = new BulkApi();
UUID id = new UUID(); // UUID | UUID Bulk Transaction Id
try {
    BulkTransactionVO result = apiInstance.getBulkStatusUsingGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#getBulkStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| UUID Bulk Transaction Id |

### Return type

[**BulkTransactionVO**](BulkTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBulkUsingPut"></a>
# **updateBulkUsingPut**
> BulkTransaction updateBulkUsingPut(data, entityUri)

Update a bulk data

Update a bulk data for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BulkApi;

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

BulkApi apiInstance = new BulkApi();
JsonNode data = new JsonNode(); // JsonNode | data
UUID entityUri = new UUID(); // UUID | UUID entity_uri
try {
    BulkTransaction result = apiInstance.updateBulkUsingPut(data, entityUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#updateBulkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data |
 **entityUri** | [**UUID**](.md)| UUID entity_uri |

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

