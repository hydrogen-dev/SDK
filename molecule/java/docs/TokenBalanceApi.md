# TokenBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenBalanceAllUsingGet**](TokenBalanceApi.md#getTokenBalanceAllUsingGet) | **GET** /token_balance | Fetch Token Balance list
[**getTokenBalanceUsingGet**](TokenBalanceApi.md#getTokenBalanceUsingGet) | **GET** /token_balance/{token_balance_id} | Fetch Token Balance details


<a name="getTokenBalanceAllUsingGet"></a>
# **getTokenBalanceAllUsingGet**
> PageTokenBalanceResponse getTokenBalanceAllUsingGet(walletId, tokenId, page, size, orderBy, ascending, getLatest)

Fetch Token Balance list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenBalanceApi;

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

TokenBalanceApi apiInstance = new TokenBalanceApi();
UUID walletId = new UUID(); // UUID | To filter response Token Balance list by wallet ID
UUID tokenId = new UUID(); // UUID | To filter response Token Balance list by Token ID
Integer page = 56; // Integer | To filter response Token Balance list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageTokenBalanceResponse result = apiInstance.getTokenBalanceAllUsingGet(walletId, tokenId, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenBalanceApi#getTokenBalanceAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| To filter response Token Balance list by wallet ID | [optional]
 **tokenId** | [**UUID**](.md)| To filter response Token Balance list by Token ID | [optional]
 **page** | **Integer**| To filter response Token Balance list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageTokenBalanceResponse**](PageTokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenBalanceUsingGet"></a>
# **getTokenBalanceUsingGet**
> TokenBalanceResponse getTokenBalanceUsingGet(tokenBalanceId)

Fetch Token Balance details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenBalanceApi;

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

TokenBalanceApi apiInstance = new TokenBalanceApi();
UUID tokenBalanceId = new UUID(); // UUID | Token Balance ID
try {
    TokenBalanceResponse result = apiInstance.getTokenBalanceUsingGet(tokenBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenBalanceApi#getTokenBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenBalanceId** | [**UUID**](.md)| Token Balance ID |

### Return type

[**TokenBalanceResponse**](TokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

