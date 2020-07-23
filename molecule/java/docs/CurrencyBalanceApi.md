# CurrencyBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencyBalanceAllUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceAllUsingGet) | **GET** /currency_balance | Fetch Currency Balance list
[**getCurrencyBalanceUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceUsingGet) | **GET** /currency_balance/{currency_balance_id} | Fetch Currency Balance details
[**updateCurrencyBalanceUsingPost**](CurrencyBalanceApi.md#updateCurrencyBalanceUsingPost) | **POST** /currency_balance/update | Update(Fetch) latest Currency Balance


<a name="getCurrencyBalanceAllUsingGet"></a>
# **getCurrencyBalanceAllUsingGet**
> PageCurrencyBalanceResponse getCurrencyBalanceAllUsingGet(walletId, currencyId, page, size, orderBy, ascending, getLatest)

Fetch Currency Balance list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyBalanceApi;

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

CurrencyBalanceApi apiInstance = new CurrencyBalanceApi();
UUID walletId = new UUID(); // UUID | To filter response Currency Balance list by wallet ID
UUID currencyId = new UUID(); // UUID | To filter response Currency Balance list by currency ID
Integer page = 56; // Integer | To filter response Currency Balance list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageCurrencyBalanceResponse result = apiInstance.getCurrencyBalanceAllUsingGet(walletId, currencyId, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyBalanceApi#getCurrencyBalanceAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| To filter response Currency Balance list by wallet ID | [optional]
 **currencyId** | [**UUID**](.md)| To filter response Currency Balance list by currency ID | [optional]
 **page** | **Integer**| To filter response Currency Balance list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageCurrencyBalanceResponse**](PageCurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyBalanceUsingGet"></a>
# **getCurrencyBalanceUsingGet**
> CurrencyBalanceResponse getCurrencyBalanceUsingGet(currencyBalanceId)

Fetch Currency Balance details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyBalanceApi;

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

CurrencyBalanceApi apiInstance = new CurrencyBalanceApi();
UUID currencyBalanceId = new UUID(); // UUID | Currency Balance ID
try {
    CurrencyBalanceResponse result = apiInstance.getCurrencyBalanceUsingGet(currencyBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyBalanceApi#getCurrencyBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceId** | [**UUID**](.md)| Currency Balance ID |

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrencyBalanceUsingPost"></a>
# **updateCurrencyBalanceUsingPost**
> CurrencyBalanceResponse updateCurrencyBalanceUsingPost(currencyBalanceUpdateParams)

Update(Fetch) latest Currency Balance

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyBalanceApi;

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

CurrencyBalanceApi apiInstance = new CurrencyBalanceApi();
CurrencyBalanceUpdateParams currencyBalanceUpdateParams = new CurrencyBalanceUpdateParams(); // CurrencyBalanceUpdateParams | To fetch/update latest record
try {
    CurrencyBalanceResponse result = apiInstance.updateCurrencyBalanceUsingPost(currencyBalanceUpdateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyBalanceApi#updateCurrencyBalanceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceUpdateParams** | [**CurrencyBalanceUpdateParams**](CurrencyBalanceUpdateParams.md)| To fetch/update latest record |

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

