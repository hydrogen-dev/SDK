# CurrencyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyUsingPost**](CurrencyApi.md#createCurrencyUsingPost) | **POST** /currency | Creates a new Currency
[**getCurrencyAllUsingGet**](CurrencyApi.md#getCurrencyAllUsingGet) | **GET** /currency | Fetch Currency list
[**getCurrencyUsingGet**](CurrencyApi.md#getCurrencyUsingGet) | **GET** /currency/{currency_id} | Fetch Currency details
[**updateCurrencyUsingPut**](CurrencyApi.md#updateCurrencyUsingPut) | **PUT** /currency/{currency_id} | Update Currency details


<a name="createCurrencyUsingPost"></a>
# **createCurrencyUsingPost**
> CurrencyResponse createCurrencyUsingPost(currencyParams)

Creates a new Currency

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyApi;

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

CurrencyApi apiInstance = new CurrencyApi();
CurrencyParams currencyParams = new CurrencyParams(); // CurrencyParams | It enables a user to create a Currency
try {
    CurrencyResponse result = apiInstance.createCurrencyUsingPost(currencyParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#createCurrencyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyParams** | [**CurrencyParams**](CurrencyParams.md)| It enables a user to create a Currency |

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyAllUsingGet"></a>
# **getCurrencyAllUsingGet**
> PageCurrencyResponse getCurrencyAllUsingGet(symbol, isAllowed, page, size, orderBy, ascending, getLatest)

Fetch Currency list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyApi;

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

CurrencyApi apiInstance = new CurrencyApi();
String symbol = "symbol_example"; // String | To filter response Currency list by Symbol name
Boolean isAllowed = true; // Boolean | To filter response Currency list
Integer page = 56; // Integer | To filter response Currency list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageCurrencyResponse result = apiInstance.getCurrencyAllUsingGet(symbol, isAllowed, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#getCurrencyAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| To filter response Currency list by Symbol name | [optional]
 **isAllowed** | **Boolean**| To filter response Currency list | [optional]
 **page** | **Integer**| To filter response Currency list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageCurrencyResponse**](PageCurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyUsingGet"></a>
# **getCurrencyUsingGet**
> CurrencyResponse getCurrencyUsingGet(currencyId)

Fetch Currency details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyApi;

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

CurrencyApi apiInstance = new CurrencyApi();
UUID currencyId = new UUID(); // UUID | Currency ID
try {
    CurrencyResponse result = apiInstance.getCurrencyUsingGet(currencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#getCurrencyUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**UUID**](.md)| Currency ID |

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrencyUsingPut"></a>
# **updateCurrencyUsingPut**
> CurrencyResponse updateCurrencyUsingPut(currencyId, currencyUpdateParams)

Update Currency details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import CurrencyApi;

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

CurrencyApi apiInstance = new CurrencyApi();
UUID currencyId = new UUID(); // UUID | Currency ID
CurrencyUpdateParams currencyUpdateParams = new CurrencyUpdateParams(); // CurrencyUpdateParams | Currency details to be updated
try {
    CurrencyResponse result = apiInstance.updateCurrencyUsingPut(currencyId, currencyUpdateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#updateCurrencyUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**UUID**](.md)| Currency ID |
 **currencyUpdateParams** | [**CurrencyUpdateParams**](CurrencyUpdateParams.md)| Currency details to be updated | [optional]

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

