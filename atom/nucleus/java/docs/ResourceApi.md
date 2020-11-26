# ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFxRateBulkUsingPost**](ResourceApi.md#createFxRateBulkUsingPost) | **POST** /resource/fx_rate | Create a bulk fxRate
[**getAllCountryUsingGet**](ResourceApi.md#getAllCountryUsingGet) | **GET** /resource/country | Get All Countries
[**getAllCurrencyUsingGet**](ResourceApi.md#getAllCurrencyUsingGet) | **GET** /resource/currency | Get All Currencies
[**getAllMerchantCategoryCodeUsingGet**](ResourceApi.md#getAllMerchantCategoryCodeUsingGet) | **GET** /resource/merchant_category_code | Get All Merchant Category Codes
[**getAllStatesUsingGet**](ResourceApi.md#getAllStatesUsingGet) | **GET** /resource/state | List all state resource
[**getAllStatisticsUsingGet**](ResourceApi.md#getAllStatisticsUsingGet) | **GET** /resource/statistic | List all statistic resource
[**getCurrencyExchangeRateAllUsingGet**](ResourceApi.md#getCurrencyExchangeRateAllUsingGet) | **GET** /resource/fx_rate | List all fxRates


<a name="createFxRateBulkUsingPost"></a>
# **createFxRateBulkUsingPost**
> List&lt;FxRate&gt; createFxRateBulkUsingPost(fxRateList)

Create a bulk fxRate

Create a bulk fxRate.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
List<FxRate> fxRateList = Arrays.asList(new FxRate()); // List<FxRate> | fxRateList
try {
    List<FxRate> result = apiInstance.createFxRateBulkUsingPost(fxRateList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#createFxRateBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fxRateList** | [**List&lt;FxRate&gt;**](FxRate.md)| fxRateList |

### Return type

[**List&lt;FxRate&gt;**](FxRate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCountryUsingGet"></a>
# **getAllCountryUsingGet**
> List&lt;Country&gt; getAllCountryUsingGet()

Get All Countries

Get All Countries. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
try {
    List<Country> result = apiInstance.getAllCountryUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllCountryUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCurrencyUsingGet"></a>
# **getAllCurrencyUsingGet**
> List&lt;Currency&gt; getAllCurrencyUsingGet()

Get All Currencies

Get All Currencies. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
try {
    List<Currency> result = apiInstance.getAllCurrencyUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllCurrencyUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllMerchantCategoryCodeUsingGet"></a>
# **getAllMerchantCategoryCodeUsingGet**
> List&lt;MerchantCategoryCode&gt; getAllMerchantCategoryCodeUsingGet()

Get All Merchant Category Codes

Get All Merchant Category Codes.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
try {
    List<MerchantCategoryCode> result = apiInstance.getAllMerchantCategoryCodeUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllMerchantCategoryCodeUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MerchantCategoryCode&gt;**](MerchantCategoryCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStatesUsingGet"></a>
# **getAllStatesUsingGet**
> List&lt;State&gt; getAllStatesUsingGet(countryCode)

List all state resource

Get the information for all possible state resource.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
String countryCode = "US"; // String | country_code
try {
    List<State> result = apiInstance.getAllStatesUsingGet(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllStatesUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| country_code | [optional] [default to US]

### Return type

[**List&lt;State&gt;**](State.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStatisticsUsingGet"></a>
# **getAllStatisticsUsingGet**
> Map&lt;String, List&lt;StatisticResourceVO&gt;&gt; getAllStatisticsUsingGet()

List all statistic resource

Get the information for all possible statistic resource.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
try {
    Map<String, List<StatisticResourceVO>> result = apiInstance.getAllStatisticsUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllStatisticsUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;StatisticResourceVO&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyExchangeRateAllUsingGet"></a>
# **getCurrencyExchangeRateAllUsingGet**
> List&lt;FxRateView&gt; getCurrencyExchangeRateAllUsingGet(filter)

List all fxRates

Get information for all fxRates defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


ResourceApi apiInstance = new ResourceApi();
String filter = "filter_example"; // String | filter
try {
    List<FxRateView> result = apiInstance.getCurrencyExchangeRateAllUsingGet(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getCurrencyExchangeRateAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]

### Return type

[**List&lt;FxRateView&gt;**](FxRateView.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

