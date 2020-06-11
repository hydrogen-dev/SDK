# FinancialOfferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialOfferUsingPost**](FinancialOfferApi.md#createFinancialOfferUsingPost) | **POST** /financial_offer | Create a comparison request
[**deleteFinancialOfferUsingDelete**](FinancialOfferApi.md#deleteFinancialOfferUsingDelete) | **DELETE** /financial_offer/{financial_offer_id} | Delete a comparison request
[**getFinancialOfferAllUsingGet**](FinancialOfferApi.md#getFinancialOfferAllUsingGet) | **GET** /financial_offer | List all comparison requests
[**getFinancialOfferUsingGet**](FinancialOfferApi.md#getFinancialOfferUsingGet) | **GET** /financial_offer/{financial_offer_id} | Retrieve a comparison request
[**updateFinancialOfferUsingPut**](FinancialOfferApi.md#updateFinancialOfferUsingPut) | **PUT** /financial_offer/{financial_offer_id} | Update a comparison request


<a name="createFinancialOfferUsingPost"></a>
# **createFinancialOfferUsingPost**
> FinancialOffer createFinancialOfferUsingPost(financialOffer)

Create a comparison request

Create a new comparison request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FinancialOfferApi;

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

FinancialOfferApi apiInstance = new FinancialOfferApi();
FinancialOffer financialOffer = new FinancialOffer(); // FinancialOffer | financialOffer
try {
    FinancialOffer result = apiInstance.createFinancialOfferUsingPost(financialOffer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialOfferApi#createFinancialOfferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**FinancialOffer**](FinancialOffer.md)| financialOffer |

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFinancialOfferUsingDelete"></a>
# **deleteFinancialOfferUsingDelete**
> deleteFinancialOfferUsingDelete(financialOffer, financialOfferId)

Delete a comparison request

Permanently delete a comparison request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FinancialOfferApi;

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

FinancialOfferApi apiInstance = new FinancialOfferApi();
UUID financialOffer = new UUID(); // UUID | UUID financial_offer_id
UUID financialOfferId = new UUID(); // UUID | financial_offer_id
try {
    apiInstance.deleteFinancialOfferUsingDelete(financialOffer, financialOfferId);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialOfferApi#deleteFinancialOfferUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**UUID**](.md)| UUID financial_offer_id |
 **financialOfferId** | [**UUID**](.md)| financial_offer_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialOfferAllUsingGet"></a>
# **getFinancialOfferAllUsingGet**
> PageFinancialOffer getFinancialOfferAllUsingGet(ascending, filter, orderBy, page, size)

List all comparison requests

Get the information for all comparison requests.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FinancialOfferApi;

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

FinancialOfferApi apiInstance = new FinancialOfferApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFinancialOffer result = apiInstance.getFinancialOfferAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialOfferApi#getFinancialOfferAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFinancialOffer**](PageFinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialOfferUsingGet"></a>
# **getFinancialOfferUsingGet**
> FinancialOffer getFinancialOfferUsingGet(financialOffer, financialOfferId)

Retrieve a comparison request

Retrieve the information for a comparison request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FinancialOfferApi;

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

FinancialOfferApi apiInstance = new FinancialOfferApi();
UUID financialOffer = new UUID(); // UUID | UUID financial_offer_id
UUID financialOfferId = new UUID(); // UUID | financial_offer_id
try {
    FinancialOffer result = apiInstance.getFinancialOfferUsingGet(financialOffer, financialOfferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialOfferApi#getFinancialOfferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**UUID**](.md)| UUID financial_offer_id |
 **financialOfferId** | [**UUID**](.md)| financial_offer_id |

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFinancialOfferUsingPut"></a>
# **updateFinancialOfferUsingPut**
> FinancialOffer updateFinancialOfferUsingPut(financialOffer, financialOfferId)

Update a comparison request

Update the information for a comparison request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FinancialOfferApi;

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

FinancialOfferApi apiInstance = new FinancialOfferApi();
FinancialOffer financialOffer = new FinancialOffer(); // FinancialOffer | financial_offer
UUID financialOfferId = new UUID(); // UUID | UUID financial_offer_id
try {
    FinancialOffer result = apiInstance.updateFinancialOfferUsingPut(financialOffer, financialOfferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialOfferApi#updateFinancialOfferUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**FinancialOffer**](FinancialOffer.md)| financial_offer |
 **financialOfferId** | [**UUID**](.md)| UUID financial_offer_id |

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

