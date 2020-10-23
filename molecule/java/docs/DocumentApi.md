# DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPost**](DocumentApi.md#createDocumentUsingPost) | **POST** /document | Create a new Document
[**getDocumentUsingGet**](DocumentApi.md#getDocumentUsingGet) | **GET** /document/{document_id} | Retrieve a Document
[**verifyDocumentUsingPost**](DocumentApi.md#verifyDocumentUsingPost) | **POST** /document/verify | Verify a Document


<a name="createDocumentUsingPost"></a>
# **createDocumentUsingPost**
> TransactionSuccessResponse createDocumentUsingPost(documentParams)

Create a new Document

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import DocumentApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

DocumentApi apiInstance = new DocumentApi();
DocumentParams documentParams = new DocumentParams(); // DocumentParams | Enables a user to store a Document hash on the blockchain
try {
    TransactionSuccessResponse result = apiInstance.createDocumentUsingPost(documentParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#createDocumentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentParams** | [**DocumentParams**](DocumentParams.md)| Enables a user to store a Document hash on the blockchain |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentUsingGet"></a>
# **getDocumentUsingGet**
> DocumentResponse getDocumentUsingGet(documentId)

Retrieve a Document

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import DocumentApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

DocumentApi apiInstance = new DocumentApi();
UUID documentId = new UUID(); // UUID | Document ID
try {
    DocumentResponse result = apiInstance.getDocumentUsingGet(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocumentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| Document ID |

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyDocumentUsingPost"></a>
# **verifyDocumentUsingPost**
> DocumentVerifyResponse verifyDocumentUsingPost(documentParams)

Verify a Document

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import DocumentApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

DocumentApi apiInstance = new DocumentApi();
DocumentParams documentParams = new DocumentParams(); // DocumentParams | Enables a user to verify a Document has not been changed
try {
    DocumentVerifyResponse result = apiInstance.verifyDocumentUsingPost(documentParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#verifyDocumentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentParams** | [**DocumentParams**](DocumentParams.md)| Enables a user to verify a Document has not been changed |

### Return type

[**DocumentVerifyResponse**](DocumentVerifyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

