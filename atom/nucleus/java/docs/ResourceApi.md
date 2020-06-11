# ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCountryUsingGet**](ResourceApi.md#getAllCountryUsingGet) | **GET** /resource/country | Get All Countries
[**getAllCurrencyUsingGet**](ResourceApi.md#getAllCurrencyUsingGet) | **GET** /resource/currency | Get All Currencies
[**getAllStatesUsingGet**](ResourceApi.md#getAllStatesUsingGet) | **GET** /resource/state | List all state resource
[**getAllStatisticsUsingGet**](ResourceApi.md#getAllStatisticsUsingGet) | **GET** /resource/statistic | List all statistic resource


<a name="getAllCountryUsingGet"></a>
# **getAllCountryUsingGet**
> List&lt;Country&gt; getAllCountryUsingGet()

Get All Countries

Get All Countries. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
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
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
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

<a name="getAllStatesUsingGet"></a>
# **getAllStatesUsingGet**
> List&lt;State&gt; getAllStatesUsingGet(countryCode)

List all state resource

Get the information for all possible state resource.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
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
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ResourceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
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

