# WalletApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletUsingPost**](WalletApi.md#createWalletUsingPost) | **POST** /wallet | Creates a new Wallet
[**getWalletAllUsingGet**](WalletApi.md#getWalletAllUsingGet) | **GET** /wallet | Fetch Wallet list
[**getWalletByWalletKeyUsingGet**](WalletApi.md#getWalletByWalletKeyUsingGet) | **GET** /wallet/wallet_key/{wallet_key_id} | Fetch Wallet details by Wallet Key ID
[**getWalletUsingGet**](WalletApi.md#getWalletUsingGet) | **GET** /wallet/{wallet_id} | Fetch Wallet details
[**updateWalletUsingPut**](WalletApi.md#updateWalletUsingPut) | **PUT** /wallet/{wallet_id} | Update Wallet details


<a name="createWalletUsingPost"></a>
# **createWalletUsingPost**
> WalletResponse createWalletUsingPost(walletParams)

Creates a new Wallet

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletApi;

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

WalletApi apiInstance = new WalletApi();
WalletParams walletParams = new WalletParams(); // WalletParams | It enables a user to create a Wallet
try {
    WalletResponse result = apiInstance.createWalletUsingPost(walletParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#createWalletUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletParams** | [**WalletParams**](WalletParams.md)| It enables a user to create a Wallet |

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletAllUsingGet"></a>
# **getWalletAllUsingGet**
> PageWalletResponse getWalletAllUsingGet(nucleusClientId, isPrimary, page, size, orderBy, ascending, getLatest)

Fetch Wallet list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletApi;

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

WalletApi apiInstance = new WalletApi();
UUID nucleusClientId = new UUID(); // UUID | To filter response wallet list by client's ID
Boolean isPrimary = true; // Boolean | To filter response for primary wallets
Integer page = 56; // Integer | To filter response wallet list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageWalletResponse result = apiInstance.getWalletAllUsingGet(nucleusClientId, isPrimary, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getWalletAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| To filter response wallet list by client&#39;s ID | [optional]
 **isPrimary** | **Boolean**| To filter response for primary wallets | [optional]
 **page** | **Integer**| To filter response wallet list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageWalletResponse**](PageWalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletByWalletKeyUsingGet"></a>
# **getWalletByWalletKeyUsingGet**
> WalletResponse getWalletByWalletKeyUsingGet(walletKeyId)

Fetch Wallet details by Wallet Key ID

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletApi;

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

WalletApi apiInstance = new WalletApi();
UUID walletKeyId = new UUID(); // UUID | Wallet Key ID
try {
    WalletResponse result = apiInstance.getWalletByWalletKeyUsingGet(walletKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getWalletByWalletKeyUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyId** | [**UUID**](.md)| Wallet Key ID |

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletUsingGet"></a>
# **getWalletUsingGet**
> WalletResponse getWalletUsingGet(walletId)

Fetch Wallet details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletApi;

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

WalletApi apiInstance = new WalletApi();
UUID walletId = new UUID(); // UUID | Wallet ID
try {
    WalletResponse result = apiInstance.getWalletUsingGet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getWalletUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| Wallet ID |

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWalletUsingPut"></a>
# **updateWalletUsingPut**
> WalletResponse updateWalletUsingPut(walletId, walletUpdateParams)

Update Wallet details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletApi;

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

WalletApi apiInstance = new WalletApi();
UUID walletId = new UUID(); // UUID | Wallet ID
WalletParams walletUpdateParams = new WalletParams(); // WalletParams | Wallet details to be updated
try {
    WalletResponse result = apiInstance.updateWalletUsingPut(walletId, walletUpdateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#updateWalletUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| Wallet ID |
 **walletUpdateParams** | [**WalletParams**](WalletParams.md)| Wallet details to be updated | [optional]

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

