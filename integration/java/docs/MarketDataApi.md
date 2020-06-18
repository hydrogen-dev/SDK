# MarketDataApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMarketDataHistoricalUsingPost**](MarketDataApi.md#createMarketDataHistoricalUsingPost) | **POST** /market_data/historical | Create historical market data
[**createMarketDataQuoteUsingPost**](MarketDataApi.md#createMarketDataQuoteUsingPost) | **POST** /market_data/quote | Create quote market data


<a name="createMarketDataHistoricalUsingPost"></a>
# **createMarketDataHistoricalUsingPost**
> MdHistoryResponseVO createMarketDataHistoricalUsingPost(historyRequest)

Create historical market data

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import MarketDataApi;

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
MarketDataApi apiInstance = new MarketDataApi();
MdHistoryRequestCO historyRequest = new MdHistoryRequestCO(); // MdHistoryRequestCO | historyRequest
try {
    MdHistoryResponseVO result = apiInstance.createMarketDataHistoricalUsingPost(historyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#createMarketDataHistoricalUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **historyRequest** | [**MdHistoryRequestCO**](MdHistoryRequestCO.md)| historyRequest |

### Return type

[**MdHistoryResponseVO**](MdHistoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMarketDataQuoteUsingPost"></a>
# **createMarketDataQuoteUsingPost**
> MdQuoteResponseVO createMarketDataQuoteUsingPost(quoteRequest)

Create quote market data

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import MarketDataApi;

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
MarketDataApi apiInstance = new MarketDataApi();
MdQuoteRequestCO quoteRequest = new MdQuoteRequestCO(); // MdQuoteRequestCO | quoteRequest
try {
    MdQuoteResponseVO result = apiInstance.createMarketDataQuoteUsingPost(quoteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#createMarketDataQuoteUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteRequest** | [**MdQuoteRequestCO**](MdQuoteRequestCO.md)| quoteRequest |

### Return type

[**MdQuoteResponseVO**](MdQuoteResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

