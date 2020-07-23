# CurrencyTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyTransferUsingPost**](CurrencyTransferApi.md#createCurrencyTransferUsingPost) | **POST** /currency_transfer | Creates Currency Transfer record
[**getCurrencyTransferAllUsingGet**](CurrencyTransferApi.md#getCurrencyTransferAllUsingGet) | **GET** /currency_transfer | Fetch Currency Transfer record list
[**getCurrencyTransferUsingGet**](CurrencyTransferApi.md#getCurrencyTransferUsingGet) | **GET** /currency_transfer/{currency_transfer_id} | Fetch Currency Transfer record details


<a name="createCurrencyTransferUsingPost"></a>
# **createCurrencyTransferUsingPost**
> TransactionSuccessResponse createCurrencyTransferUsingPost(currencyTransferParams)

Creates Currency Transfer record

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyTransferApi;

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

CurrencyTransferApi apiInstance = new CurrencyTransferApi();
CurrencyTransferParams currencyTransferParams = new CurrencyTransferParams(); // CurrencyTransferParams | It enables a user to transfer Currency
try {
    TransactionSuccessResponse result = apiInstance.createCurrencyTransferUsingPost(currencyTransferParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyTransferApi#createCurrencyTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferParams** | [**CurrencyTransferParams**](CurrencyTransferParams.md)| It enables a user to transfer Currency |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyTransferAllUsingGet"></a>
# **getCurrencyTransferAllUsingGet**
> PageCurrencyTransferResponse getCurrencyTransferAllUsingGet(walletId, currencyId, page, size, orderBy, ascending, getLatest)

Fetch Currency Transfer record list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyTransferApi;

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

CurrencyTransferApi apiInstance = new CurrencyTransferApi();
UUID walletId = new UUID(); // UUID | To filter response Currency Transfer list by Wallet ID
UUID currencyId = new UUID(); // UUID | To filter response Currency Transfer list by Currency ID
Integer page = 56; // Integer | To filter response Currency Transfer list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageCurrencyTransferResponse result = apiInstance.getCurrencyTransferAllUsingGet(walletId, currencyId, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyTransferApi#getCurrencyTransferAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| To filter response Currency Transfer list by Wallet ID | [optional]
 **currencyId** | [**UUID**](.md)| To filter response Currency Transfer list by Currency ID | [optional]
 **page** | **Integer**| To filter response Currency Transfer list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageCurrencyTransferResponse**](PageCurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyTransferUsingGet"></a>
# **getCurrencyTransferUsingGet**
> CurrencyTransferResponse getCurrencyTransferUsingGet(currencyTransferId)

Fetch Currency Transfer record details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyTransferApi;

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

CurrencyTransferApi apiInstance = new CurrencyTransferApi();
UUID currencyTransferId = new UUID(); // UUID | Currency Transfer ID
try {
    CurrencyTransferResponse result = apiInstance.getCurrencyTransferUsingGet(currencyTransferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyTransferApi#getCurrencyTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferId** | [**UUID**](.md)| Currency Transfer ID |

### Return type

[**CurrencyTransferResponse**](CurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

