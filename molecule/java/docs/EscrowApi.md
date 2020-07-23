# EscrowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEscrowUsingPost**](EscrowApi.md#createEscrowUsingPost) | **POST** /escrow | Create a new Escrow
[**getEscrowAllUsingGet**](EscrowApi.md#getEscrowAllUsingGet) | **GET** /escrow | List all Escrow
[**getEscrowUsingGet**](EscrowApi.md#getEscrowUsingGet) | **GET** /escrow/{escrow_id} | Fetch Escrow


<a name="createEscrowUsingPost"></a>
# **createEscrowUsingPost**
> EscrowResponse createEscrowUsingPost(escrowParams)

Create a new Escrow

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowApi;

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

EscrowApi apiInstance = new EscrowApi();
EscrowParams escrowParams = new EscrowParams(); // EscrowParams | It enables a user to create a escrow
try {
    EscrowResponse result = apiInstance.createEscrowUsingPost(escrowParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowApi#createEscrowUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowParams** | [**EscrowParams**](EscrowParams.md)| It enables a user to create a escrow |

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowAllUsingGet"></a>
# **getEscrowAllUsingGet**
> PageEscrowResponse getEscrowAllUsingGet(page, size, orderBy, ascending, getLatest)

List all Escrow

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowApi;

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

EscrowApi apiInstance = new EscrowApi();
Integer page = 56; // Integer | To filter response Escrow list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageEscrowResponse result = apiInstance.getEscrowAllUsingGet(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowApi#getEscrowAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Escrow list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageEscrowResponse**](PageEscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowUsingGet"></a>
# **getEscrowUsingGet**
> EscrowResponse getEscrowUsingGet(escrowId)

Fetch Escrow

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import EscrowApi;

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

EscrowApi apiInstance = new EscrowApi();
UUID escrowId = new UUID(); // UUID | Escrow ID
try {
    EscrowResponse result = apiInstance.getEscrowUsingGet(escrowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EscrowApi#getEscrowUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowId** | [**UUID**](.md)| Escrow ID |

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

