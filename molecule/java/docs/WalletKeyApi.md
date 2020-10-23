# WalletKeyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletKeyUsingPost**](WalletKeyApi.md#createWalletKeyUsingPost) | **POST** /wallet_key | Creates a new Wallet Key for provided Wallet ID
[**generateWalletKeyUsingPost**](WalletKeyApi.md#generateWalletKeyUsingPost) | **POST** /wallet_key/generator | Generates Wallet Key for provided Wallet ID
[**getWalletKeyAllUsingGet**](WalletKeyApi.md#getWalletKeyAllUsingGet) | **GET** /wallet_key | Fetch Wallet Key list
[**getWalletKeyUsingGet**](WalletKeyApi.md#getWalletKeyUsingGet) | **GET** /wallet_key/{wallet_key_id} | Fetch Wallet Key details


<a name="createWalletKeyUsingPost"></a>
# **createWalletKeyUsingPost**
> WalletKeyResponse createWalletKeyUsingPost(walletKeyParams)

Creates a new Wallet Key for provided Wallet ID

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletKeyApi;

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

WalletKeyApi apiInstance = new WalletKeyApi();
WalletKeyParams walletKeyParams = new WalletKeyParams(); // WalletKeyParams | It enables a user to create a Wallet Key record
try {
    WalletKeyResponse result = apiInstance.createWalletKeyUsingPost(walletKeyParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletKeyApi#createWalletKeyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyParams** | [**WalletKeyParams**](WalletKeyParams.md)| It enables a user to create a Wallet Key record |

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateWalletKeyUsingPost"></a>
# **generateWalletKeyUsingPost**
> WalletKeyResponse generateWalletKeyUsingPost(walletKeyGenerateParams)

Generates Wallet Key for provided Wallet ID

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletKeyApi;

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

WalletKeyApi apiInstance = new WalletKeyApi();
WalletKeyGenerateParams walletKeyGenerateParams = new WalletKeyGenerateParams(); // WalletKeyGenerateParams | It enables a user to generate a Wallet Key record
try {
    WalletKeyResponse result = apiInstance.generateWalletKeyUsingPost(walletKeyGenerateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletKeyApi#generateWalletKeyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyGenerateParams** | [**WalletKeyGenerateParams**](WalletKeyGenerateParams.md)| It enables a user to generate a Wallet Key record |

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletKeyAllUsingGet"></a>
# **getWalletKeyAllUsingGet**
> PageWalletKeyResponse getWalletKeyAllUsingGet(page, size, orderBy, ascending, getLatest)

Fetch Wallet Key list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletKeyApi;

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

WalletKeyApi apiInstance = new WalletKeyApi();
Integer page = 56; // Integer | To filter response wallet list page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageWalletKeyResponse result = apiInstance.getWalletKeyAllUsingGet(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletKeyApi#getWalletKeyAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response wallet list page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageWalletKeyResponse**](PageWalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletKeyUsingGet"></a>
# **getWalletKeyUsingGet**
> WalletKeyResponse getWalletKeyUsingGet(walletKeyId)

Fetch Wallet Key details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import WalletKeyApi;

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

WalletKeyApi apiInstance = new WalletKeyApi();
UUID walletKeyId = new UUID(); // UUID | Wallet Key ID
try {
    WalletKeyResponse result = apiInstance.getWalletKeyUsingGet(walletKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletKeyApi#getWalletKeyUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyId** | [**UUID**](.md)| Wallet Key ID |

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

