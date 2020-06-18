# DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPost**](DocumentApi.md#createDocumentUsingPost) | **POST** /document | Create a Document
[**deleteDocumentUsingDelete**](DocumentApi.md#deleteDocumentUsingDelete) | **DELETE** /document/{document_id} | Delete a tenant document by Id
[**getDocumentAllUsingGet**](DocumentApi.md#getDocumentAllUsingGet) | **GET** /document | List all Documents
[**getDocumentUsingGet**](DocumentApi.md#getDocumentUsingGet) | **GET** /document/{document_id} | Retrieve a Tenant Document by Document Id
[**updateDocumentUsingPut**](DocumentApi.md#updateDocumentUsingPut) | **PUT** /document/{document_id} | Update a Tenant Document


<a name="createDocumentUsingPost"></a>
# **createDocumentUsingPost**
> Document createDocumentUsingPost(documentRequest)

Create a Document

Create a new Document for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import DocumentApi;

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

DocumentApi apiInstance = new DocumentApi();
Document documentRequest = new Document(); // Document | documentRequest
try {
    Document result = apiInstance.createDocumentUsingPost(documentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#createDocumentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentRequest** | [**Document**](Document.md)| documentRequest |

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDocumentUsingDelete"></a>
# **deleteDocumentUsingDelete**
> deleteDocumentUsingDelete(documentId)

Delete a tenant document by Id

Permanently delete a tenant document by Id

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import DocumentApi;

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

DocumentApi apiInstance = new DocumentApi();
UUID documentId = new UUID(); // UUID | UUID document_id
try {
    apiInstance.deleteDocumentUsingDelete(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#deleteDocumentUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| UUID document_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDocumentAllUsingGet"></a>
# **getDocumentAllUsingGet**
> PageDocument getDocumentAllUsingGet(ascending, filter, orderBy, page, size)

List all Documents

Get the information for all Documents 

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import DocumentApi;

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

DocumentApi apiInstance = new DocumentApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageDocument result = apiInstance.getDocumentAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocumentAllUsingGet");
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

[**PageDocument**](PageDocument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDocumentUsingGet"></a>
# **getDocumentUsingGet**
> Document getDocumentUsingGet(documentId)

Retrieve a Tenant Document by Document Id

Retrieve the information for a Tenant Document by Document Id

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import DocumentApi;

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

DocumentApi apiInstance = new DocumentApi();
UUID documentId = new UUID(); // UUID | UUID document_id
try {
    Document result = apiInstance.getDocumentUsingGet(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocumentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| UUID document_id |

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDocumentUsingPut"></a>
# **updateDocumentUsingPut**
> Document updateDocumentUsingPut(document, documentId)

Update a Tenant Document

Updated the information for a Tenant Documents

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import DocumentApi;

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

DocumentApi apiInstance = new DocumentApi();
Document document = new Document(); // Document | document
UUID documentId = new UUID(); // UUID | UUID document_id
try {
    Document result = apiInstance.updateDocumentUsingPut(document, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#updateDocumentUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | [**Document**](Document.md)| document |
 **documentId** | [**UUID**](.md)| UUID document_id |

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

