# WalletPermissionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletPermissionAllUsingGet**](WalletPermissionApi.md#getWalletPermissionAllUsingGet) | **GET** /wallet_permission | Fetch Wallet list with client&#39;s permissions
[**getWalletPermissionUsingGet**](WalletPermissionApi.md#getWalletPermissionUsingGet) | **GET** /wallet_permission/{wallet_id} | Fetch Wallet&#39;s client permissions details
[**updateWalletPermissionUsingPut**](WalletPermissionApi.md#updateWalletPermissionUsingPut) | **PUT** /wallet_permission/{wallet_id} | Update client&#39;s permission for provided Wallet


<a name="getWalletPermissionAllUsingGet"></a>
# **getWalletPermissionAllUsingGet**
> PageWalletPermissionResponse getWalletPermissionAllUsingGet(nucleusClientId, isActive, page, size, orderBy, ascending, getLatest)

Fetch Wallet list with client&#39;s permissions

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletPermissionApi;

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

WalletPermissionApi apiInstance = new WalletPermissionApi();
UUID nucleusClientId = new UUID(); // UUID | To filter response wallet list by client's ID
Boolean isActive = true; // Boolean | To filter response for active wallets
Integer page = 56; // Integer | To filter response wallet list page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageWalletPermissionResponse result = apiInstance.getWalletPermissionAllUsingGet(nucleusClientId, isActive, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletPermissionApi#getWalletPermissionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| To filter response wallet list by client&#39;s ID | [optional]
 **isActive** | **Boolean**| To filter response for active wallets | [optional]
 **page** | **Integer**| To filter response wallet list page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageWalletPermissionResponse**](PageWalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletPermissionUsingGet"></a>
# **getWalletPermissionUsingGet**
> WalletPermissionResponse getWalletPermissionUsingGet(walletId)

Fetch Wallet&#39;s client permissions details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletPermissionApi;

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

WalletPermissionApi apiInstance = new WalletPermissionApi();
UUID walletId = new UUID(); // UUID | Wallet ID
try {
    WalletPermissionResponse result = apiInstance.getWalletPermissionUsingGet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletPermissionApi#getWalletPermissionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| Wallet ID |

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWalletPermissionUsingPut"></a>
# **updateWalletPermissionUsingPut**
> WalletPermissionResponse updateWalletPermissionUsingPut(walletId, clientPermissions)

Update client&#39;s permission for provided Wallet

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletPermissionApi;

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

WalletPermissionApi apiInstance = new WalletPermissionApi();
UUID walletId = new UUID(); // UUID | Wallet ID
WalletPermissionUpdateParams clientPermissions = new WalletPermissionUpdateParams(); // WalletPermissionUpdateParams | Client's permission to be updated
try {
    WalletPermissionResponse result = apiInstance.updateWalletPermissionUsingPut(walletId, clientPermissions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletPermissionApi#updateWalletPermissionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| Wallet ID |
 **clientPermissions** | [**WalletPermissionUpdateParams**](WalletPermissionUpdateParams.md)| Client&#39;s permission to be updated |

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

