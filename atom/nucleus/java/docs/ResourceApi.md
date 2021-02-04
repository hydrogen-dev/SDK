# ResourceApi

All URIs are relative to *https://localhost:9080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAggregationAccountCategoryMappingUsingGet**](ResourceApi.md#getAggregationAccountCategoryMappingUsingGet) | **GET** /resource/account_category | Get All Aggregation Account Category mapping
[**getAggregationAccountTransactionCategoryMappingUsingGet**](ResourceApi.md#getAggregationAccountTransactionCategoryMappingUsingGet) | **GET** /resource/merchant_category | Get All Aggregation Account Transaction Category mapping
[**getAllCountryUsingGet**](ResourceApi.md#getAllCountryUsingGet) | **GET** /resource/country | Get All Countries
[**getAllCurrencyUsingGet**](ResourceApi.md#getAllCurrencyUsingGet) | **GET** /resource/currency | Get All Currencies
[**getAllMerchantCategoryCodeUsingGet**](ResourceApi.md#getAllMerchantCategoryCodeUsingGet) | **GET** /resource/merchant_category_code | Get All Merchant Category Codes
[**getAllStatesUsingGet**](ResourceApi.md#getAllStatesUsingGet) | **GET** /resource/state | List all state resource
[**getAllStatisticsUsingGet**](ResourceApi.md#getAllStatisticsUsingGet) | **GET** /resource/statistic | List all statistic resource
[**getCurrencyExchangeRateAllUsingGet**](ResourceApi.md#getCurrencyExchangeRateAllUsingGet) | **GET** /resource/fx_rate | List all fxRates
[**getMerchantsAllUsingGet**](ResourceApi.md#getMerchantsAllUsingGet) | **GET** /resource/merchant | Get all merchants


<a name="getAggregationAccountCategoryMappingUsingGet"></a>
# **getAggregationAccountCategoryMappingUsingGet**
> List&lt;CategoryResponseVO&gt; getAggregationAccountCategoryMappingUsingGet(tenantName)

Get All Aggregation Account Category mapping

Get All Aggregation Account Category mapping.

### Example
```java
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
String tenantName = "tenantName_example"; // String | tenant_name
try {
    List<CategoryResponseVO> result = apiInstance.getAggregationAccountCategoryMappingUsingGet(tenantName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAggregationAccountCategoryMappingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantName** | **String**| tenant_name | [optional]

### Return type

[**List&lt;CategoryResponseVO&gt;**](CategoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountTransactionCategoryMappingUsingGet"></a>
# **getAggregationAccountTransactionCategoryMappingUsingGet**
> List&lt;CategoryResponseVO&gt; getAggregationAccountTransactionCategoryMappingUsingGet(tenantName)

Get All Aggregation Account Transaction Category mapping

Get All Aggregation Account Transaction Category mapping.

### Example
```java
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
String tenantName = "tenantName_example"; // String | tenant_name
try {
    List<CategoryResponseVO> result = apiInstance.getAggregationAccountTransactionCategoryMappingUsingGet(tenantName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAggregationAccountTransactionCategoryMappingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantName** | **String**| tenant_name | [optional]

### Return type

[**List&lt;CategoryResponseVO&gt;**](CategoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCountryUsingGet"></a>
# **getAllCountryUsingGet**
> List&lt;Country&gt; getAllCountryUsingGet()

Get All Countries

Get All Countries. 

### Example
```java
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
> List&lt;MerchantCategoryCode&gt; getAllMerchantCategoryCodeUsingGet(filter)

Get All Merchant Category Codes

Get All Merchant Category Codes.

### Example
```java
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
    List<MerchantCategoryCode> result = apiInstance.getAllMerchantCategoryCodeUsingGet(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getAllMerchantCategoryCodeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]

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
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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

<a name="getMerchantsAllUsingGet"></a>
# **getMerchantsAllUsingGet**
> MXMerchantRes getMerchantsAllUsingGet(ascending, filter, orderBy, page, size)

Get all merchants

List all merchants.

### Example
```java
// Import classes:
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.api.ResourceApi;

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
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "id"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    MXMerchantRes result = apiInstance.getMerchantsAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceApi#getMerchantsAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to id]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**MXMerchantRes**](MXMerchantRes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

