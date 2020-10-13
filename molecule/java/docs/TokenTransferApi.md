# TokenTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenTransferUsingPost**](TokenTransferApi.md#createTokenTransferUsingPost) | **POST** /token_transfer | Creates Token Transfer record
[**getTokenTransferAllUsingGet**](TokenTransferApi.md#getTokenTransferAllUsingGet) | **GET** /token_transfer | Fetch Token Transfer record list
[**getTokenTransferUsingGet**](TokenTransferApi.md#getTokenTransferUsingGet) | **GET** /token_transfer/{token_transfer_id} | Fetch Token Transfer record details


<a name="createTokenTransferUsingPost"></a>
# **createTokenTransferUsingPost**
> TransactionSuccessResponse createTokenTransferUsingPost(tokenTransferParams)

Creates Token Transfer record

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenTransferApi;

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

TokenTransferApi apiInstance = new TokenTransferApi();
TokenTransferParams tokenTransferParams = new TokenTransferParams(); // TokenTransferParams | It enables a user to transfer Tokens
try {
    TransactionSuccessResponse result = apiInstance.createTokenTransferUsingPost(tokenTransferParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenTransferApi#createTokenTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenTransferParams** | [**TokenTransferParams**](TokenTransferParams.md)| It enables a user to transfer Tokens |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenTransferAllUsingGet"></a>
# **getTokenTransferAllUsingGet**
> PageTokenTransferResponse getTokenTransferAllUsingGet(walletId, page, size, orderBy, ascending, getLatest)

Fetch Token Transfer record list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenTransferApi;

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

TokenTransferApi apiInstance = new TokenTransferApi();
UUID walletId = new UUID(); // UUID | To filter response Token Transfer list by Wallet ID
Integer page = 56; // Integer | To filter response Token Transfer list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageTokenTransferResponse result = apiInstance.getTokenTransferAllUsingGet(walletId, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenTransferApi#getTokenTransferAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| To filter response Token Transfer list by Wallet ID | [optional]
 **page** | **Integer**| To filter response Token Transfer list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageTokenTransferResponse**](PageTokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenTransferUsingGet"></a>
# **getTokenTransferUsingGet**
> TokenTransferResponse getTokenTransferUsingGet(tokenTransferId)

Fetch Token Transfer record details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenTransferApi;

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

TokenTransferApi apiInstance = new TokenTransferApi();
UUID tokenTransferId = new UUID(); // UUID | Token Transfer ID
try {
    TokenTransferResponse result = apiInstance.getTokenTransferUsingGet(tokenTransferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenTransferApi#getTokenTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenTransferId** | [**UUID**](.md)| Token Transfer ID |

### Return type

[**TokenTransferResponse**](TokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

