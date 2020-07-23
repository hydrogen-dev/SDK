# TokenSupplyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenSupplyAllUsingGet**](TokenSupplyApi.md#getTokenSupplyAllUsingGet) | **GET** /token_supply | Fetch Token Supply record list
[**getTokenSupplyUsingGet**](TokenSupplyApi.md#getTokenSupplyUsingGet) | **GET** /token_supply/{token_supply_id} | Fetch Token Supply details


<a name="getTokenSupplyAllUsingGet"></a>
# **getTokenSupplyAllUsingGet**
> PageTokenSupplyResponse getTokenSupplyAllUsingGet(tokenId, page, size, orderBy, ascending, getLatest)

Fetch Token Supply record list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenSupplyApi;

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

TokenSupplyApi apiInstance = new TokenSupplyApi();
UUID tokenId = new UUID(); // UUID | To filter response Token Supply list by Token ID
Integer page = 56; // Integer | To filter response Token Supply list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageTokenSupplyResponse result = apiInstance.getTokenSupplyAllUsingGet(tokenId, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenSupplyApi#getTokenSupplyAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| To filter response Token Supply list by Token ID | [optional]
 **page** | **Integer**| To filter response Token Supply list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageTokenSupplyResponse**](PageTokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenSupplyUsingGet"></a>
# **getTokenSupplyUsingGet**
> TokenSupplyResponse getTokenSupplyUsingGet(tokenSupplyId)

Fetch Token Supply details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenSupplyApi;

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

TokenSupplyApi apiInstance = new TokenSupplyApi();
UUID tokenSupplyId = new UUID(); // UUID | Token Supply ID
try {
    TokenSupplyResponse result = apiInstance.getTokenSupplyUsingGet(tokenSupplyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenSupplyApi#getTokenSupplyUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenSupplyId** | [**UUID**](.md)| Token Supply ID |

### Return type

[**TokenSupplyResponse**](TokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

