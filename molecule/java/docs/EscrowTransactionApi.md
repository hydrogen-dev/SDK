# EscrowTransactionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEscrowTransactionUsingPost**](EscrowTransactionApi.md#createEscrowTransactionUsingPost) | **POST** /escrow_transaction | Create a new Escrow Transaction
[**getEscrowTransactionAllUsingGet**](EscrowTransactionApi.md#getEscrowTransactionAllUsingGet) | **GET** /escrow_transaction | List all Escrow Transaction
[**getEscrowTransactionUsingGet**](EscrowTransactionApi.md#getEscrowTransactionUsingGet) | **GET** /escrow_transaction/{escrow_transaction_id} | Fetch Escrow Transaction
[**updateEscrowTransactionUsingPut**](EscrowTransactionApi.md#updateEscrowTransactionUsingPut) | **PUT** /escrow_transaction/{escrow_transaction_id} | Update Escrow Transaction


<a name="createEscrowTransactionUsingPost"></a>
# **createEscrowTransactionUsingPost**
> EscrowTransactionResponse createEscrowTransactionUsingPost(escrowDepositParams)

Create a new Escrow Transaction

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowTransactionApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

EscrowTransactionApi apiInstance = new EscrowTransactionApi();
EscrowDepositParams escrowDepositParams = new EscrowDepositParams(); // EscrowDepositParams | It enables a user to create a escrow transaction
try {
    EscrowTransactionResponse result = apiInstance.createEscrowTransactionUsingPost(escrowDepositParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowTransactionApi#createEscrowTransactionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowDepositParams** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction |

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowTransactionAllUsingGet"></a>
# **getEscrowTransactionAllUsingGet**
> PageEscrowTransactionResponse getEscrowTransactionAllUsingGet(page, size, orderBy, ascending, getLatest)

List all Escrow Transaction

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowTransactionApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

EscrowTransactionApi apiInstance = new EscrowTransactionApi();
Integer page = 56; // Integer | To filter response Escrow Transaction list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageEscrowTransactionResponse result = apiInstance.getEscrowTransactionAllUsingGet(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowTransactionApi#getEscrowTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Escrow Transaction list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageEscrowTransactionResponse**](PageEscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowTransactionUsingGet"></a>
# **getEscrowTransactionUsingGet**
> EscrowTransactionResponse getEscrowTransactionUsingGet(escrowTransactionId)

Fetch Escrow Transaction

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowTransactionApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

EscrowTransactionApi apiInstance = new EscrowTransactionApi();
UUID escrowTransactionId = new UUID(); // UUID | Escrow Transaction ID
try {
    EscrowTransactionResponse result = apiInstance.getEscrowTransactionUsingGet(escrowTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowTransactionApi#getEscrowTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowTransactionId** | [**UUID**](.md)| Escrow Transaction ID |

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEscrowTransactionUsingPut"></a>
# **updateEscrowTransactionUsingPut**
> EscrowTransactionResponse updateEscrowTransactionUsingPut(escrowTransactionId, escrowDepositParams)

Update Escrow Transaction

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowTransactionApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

EscrowTransactionApi apiInstance = new EscrowTransactionApi();
UUID escrowTransactionId = new UUID(); // UUID | Escrow Transaction ID
EscrowDepositParams escrowDepositParams = new EscrowDepositParams(); // EscrowDepositParams | It enables a user to create a escrow transaction
try {
    EscrowTransactionResponse result = apiInstance.updateEscrowTransactionUsingPut(escrowTransactionId, escrowDepositParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowTransactionApi#updateEscrowTransactionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowTransactionId** | [**UUID**](.md)| Escrow Transaction ID |
 **escrowDepositParams** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | [optional]

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

