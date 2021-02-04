# BusinessApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBusinessUsingPost**](BusinessApi.md#createBusinessUsingPost) | **POST** /business | Create a business
[**deleteBusinessUsingDelete**](BusinessApi.md#deleteBusinessUsingDelete) | **DELETE** /business/{business_id} | Delete a business
[**getBusinessAllUsingGet**](BusinessApi.md#getBusinessAllUsingGet) | **GET** /business | List all business
[**getBusinessAssetSizeUsingGet**](BusinessApi.md#getBusinessAssetSizeUsingGet) | **GET** /business/{business_id}/asset_size | List all business asset sizes
[**getBusinessClientTransactionAllUsingGet**](BusinessApi.md#getBusinessClientTransactionAllUsingGet) | **GET** /business/{business_id}/transaction | List all business transactions
[**getBusinessHoldingUsingGet**](BusinessApi.md#getBusinessHoldingUsingGet) | **GET** /business/{business_id}/holding | List all business holdings
[**getBusinessUsingGet**](BusinessApi.md#getBusinessUsingGet) | **GET** /business/{business_id} | Retrieve a business
[**updateBusinessUsingPut**](BusinessApi.md#updateBusinessUsingPut) | **PUT** /business/{business_id} | Update a business


<a name="createBusinessUsingPost"></a>
# **createBusinessUsingPost**
> Business createBusinessUsingPost(businessRequest)

Create a business

Create a new business, or register a new business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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

BusinessApi apiInstance = new BusinessApi();
Business businessRequest = new Business(); // Business | businessRequest
try {
    Business result = apiInstance.createBusinessUsingPost(businessRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#createBusinessUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessRequest** | [**Business**](Business.md)| businessRequest |

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBusinessUsingDelete"></a>
# **deleteBusinessUsingDelete**
> deleteBusinessUsingDelete(businessId)

Delete a business

Permanently delete a business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
UUID businessId = new UUID(); // UUID | UUID business_id
try {
    apiInstance.deleteBusinessUsingDelete(businessId);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#deleteBusinessUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**UUID**](.md)| UUID business_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessAllUsingGet"></a>
# **getBusinessAllUsingGet**
> PageBusiness getBusinessAllUsingGet(ascending, filter, orderBy, page, size)

List all business

Get details for all business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageBusiness result = apiInstance.getBusinessAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessAllUsingGet");
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

[**PageBusiness**](PageBusiness.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessAssetSizeUsingGet"></a>
# **getBusinessAssetSizeUsingGet**
> List&lt;AvailableDateDoubleVO&gt; getBusinessAssetSizeUsingGet(businessId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate)

List all business asset sizes

Get a list of asset sizes per date for a business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
UUID businessId = new UUID(); // UUID | UUID business_id
String currencyConversion = "currencyConversion_example"; // String | Currency Code
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean excludeSubledger = false; // Boolean | exclude_subledger
Boolean getLatest = true; // Boolean | true or false
String sortType = "sortType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<AvailableDateDoubleVO> result = apiInstance.getBusinessAssetSizeUsingGet(businessId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessAssetSizeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**UUID**](.md)| UUID business_id |
 **currencyConversion** | **String**| Currency Code | [optional]
 **endDate** | **LocalDate**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| exclude_subledger | [optional] [default to false]
 **getLatest** | **Boolean**| true or false | [optional]
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **startDate** | **LocalDate**| start date | [optional] [default to null]

### Return type

[**List&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessClientTransactionAllUsingGet"></a>
# **getBusinessClientTransactionAllUsingGet**
> PagePortfolioTransaction getBusinessClientTransactionAllUsingGet(businessId, ascending, currencyConversion, endDate, orderBy, page, size, startDate)

List all business transactions

Get the information for all transactions under all client registered with your business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
UUID businessId = new UUID(); // UUID | UUID business_id
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String endDate = "endDate_example"; // String | end date - yyyy-mm-dd
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
String startDate = "startDate_example"; // String | start date - yyyy-mm-dd
try {
    PagePortfolioTransaction result = apiInstance.getBusinessClientTransactionAllUsingGet(businessId, ascending, currencyConversion, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessClientTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**UUID**](.md)| UUID business_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **endDate** | **String**| end date - yyyy-mm-dd | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **String**| start date - yyyy-mm-dd | [optional]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessHoldingUsingGet"></a>
# **getBusinessHoldingUsingGet**
> List&lt;PortfolioHoldingAgg&gt; getBusinessHoldingUsingGet(businessId, currencyConversion, endDate, getLatest, startDate)

List all business holdings

Get a list of holdings for a business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
UUID businessId = new UUID(); // UUID | UUID business_id
String currencyConversion = "currencyConversion_example"; // String | Currency Code
String endDate = "endDate_example"; // String | end date - yyyy-mm-dd
Boolean getLatest = true; // Boolean | true or false
String startDate = "startDate_example"; // String | start date - yyyy-mm-dd
try {
    List<PortfolioHoldingAgg> result = apiInstance.getBusinessHoldingUsingGet(businessId, currencyConversion, endDate, getLatest, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**UUID**](.md)| UUID business_id |
 **currencyConversion** | **String**| Currency Code | [optional]
 **endDate** | **String**| end date - yyyy-mm-dd | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **startDate** | **String**| start date - yyyy-mm-dd | [optional]

### Return type

[**List&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessUsingGet"></a>
# **getBusinessUsingGet**
> Business getBusinessUsingGet(businessId)

Retrieve a business

Retrieve the information for a business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
UUID businessId = new UUID(); // UUID | UUID business_id
try {
    Business result = apiInstance.getBusinessUsingGet(businessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**UUID**](.md)| UUID business_id |

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBusinessUsingPut"></a>
# **updateBusinessUsingPut**
> Business updateBusinessUsingPut(business, businessId)

Update a business

Update the information for a business.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import io.swagger.client.api.BusinessApi;

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
}BusinessApi apiInstance = new BusinessApi();
Object business = null; // Object | business
UUID businessId = new UUID(); // UUID | UUID business_id
try {
    Business result = apiInstance.updateBusinessUsingPut(business, businessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#updateBusinessUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | [**Business**](Business.md)| business |
 **businessId** | [**UUID**](.md)| UUID business_id |

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

