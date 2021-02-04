# HouseholdApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHouseholdUsingPost**](HouseholdApi.md#createHouseholdUsingPost) | **POST** /household | Create a Household
[**deleteHouseholdUsingDelete**](HouseholdApi.md#deleteHouseholdUsingDelete) | **DELETE** /household/{household_id} | Delete a Household
[**getHouseholdAllUsingGet**](HouseholdApi.md#getHouseholdAllUsingGet) | **GET** /household | List all household
[**getHouseholdClientAssetSizeUsingGet**](HouseholdApi.md#getHouseholdClientAssetSizeUsingGet) | **GET** /household/{household_id}/asset_size | List all household client asset sizes
[**getHouseholdClientHoldingUsingGet**](HouseholdApi.md#getHouseholdClientHoldingUsingGet) | **GET** /household/{household_id}/holding | List all household&#39;s clientIds holdings
[**getHouseholdClientTransactionUsingGet**](HouseholdApi.md#getHouseholdClientTransactionUsingGet) | **GET** /household/{household_id}/transaction | List all household&#39;s client ids transactions
[**getHouseholdUsingGet**](HouseholdApi.md#getHouseholdUsingGet) | **GET** /household/{household_id} | Retrieve a Household
[**updateHouseholdUsingPut**](HouseholdApi.md#updateHouseholdUsingPut) | **PUT** /household/{household_id} | Update a Household


<a name="createHouseholdUsingPost"></a>
# **createHouseholdUsingPost**
> Household createHouseholdUsingPost(household)

Create a Household

Create a new household, with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
Household household = new Household(); // Household | household
try {
    Household result = apiInstance.createHouseholdUsingPost(household);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#createHouseholdUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household |

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteHouseholdUsingDelete"></a>
# **deleteHouseholdUsingDelete**
> deleteHouseholdUsingDelete(householdId)

Delete a Household

Permanently delete a household

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
UUID householdId = new UUID(); // UUID | UUID household_id
try {
    apiInstance.deleteHouseholdUsingDelete(householdId);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#deleteHouseholdUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| UUID household_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdAllUsingGet"></a>
# **getHouseholdAllUsingGet**
> PageHousehold getHouseholdAllUsingGet(ascending, filter, orderBy, page, size)

List all household

Get details for all Household.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageHousehold result = apiInstance.getHouseholdAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#getHouseholdAllUsingGet");
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

[**PageHousehold**](PageHousehold.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdClientAssetSizeUsingGet"></a>
# **getHouseholdClientAssetSizeUsingGet**
> List&lt;AvailableDateDoubleVO&gt; getHouseholdClientAssetSizeUsingGet(householdId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate)

List all household client asset sizes

Get a list of asset sizes per date for a client&#39;s household.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
UUID householdId = new UUID(); // UUID | UUID household_id
String currencyConversion = "currencyConversion_example"; // String | USD
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean excludeSubledger = true; // Boolean | true or false
Boolean getLatest = true; // Boolean | true or false
String sortType = "sortType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<AvailableDateDoubleVO> result = apiInstance.getHouseholdClientAssetSizeUsingGet(householdId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#getHouseholdClientAssetSizeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| UUID household_id |
 **currencyConversion** | **String**| USD | [optional]
 **endDate** | **LocalDate**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| true or false | [optional]
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

<a name="getHouseholdClientHoldingUsingGet"></a>
# **getHouseholdClientHoldingUsingGet**
> List&lt;PortfolioHoldingAgg&gt; getHouseholdClientHoldingUsingGet(householdId, currencyConversion, endDate, getLatest, startDate)

List all household&#39;s clientIds holdings

Get the information for all the securities that are currently being held by a household&#39;s client ids registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
UUID householdId = new UUID(); // UUID | UUID household_id
String currencyConversion = "currencyConversion_example"; // String | USD
LocalDate endDate = LocalDate.now(); // LocalDate | end date - yyyy-mm-dd
Boolean getLatest = true; // Boolean | true or false
LocalDate startDate = LocalDate.now(); // LocalDate | start date - yyyy-mm-dd
try {
    List<PortfolioHoldingAgg> result = apiInstance.getHouseholdClientHoldingUsingGet(householdId, currencyConversion, endDate, getLatest, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#getHouseholdClientHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| UUID household_id |
 **currencyConversion** | **String**| USD | [optional]
 **endDate** | **LocalDate**| end date - yyyy-mm-dd | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **startDate** | **LocalDate**| start date - yyyy-mm-dd | [optional]

### Return type

[**List&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdClientTransactionUsingGet"></a>
# **getHouseholdClientTransactionUsingGet**
> PagePortfolioTransaction getHouseholdClientTransactionUsingGet(householdId, ascending, currencyConversion, endDate, orderBy, page, size, startDate)

List all household&#39;s client ids transactions

Get the information for all transactions under a household client ids registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
UUID householdId = new UUID(); // UUID | UUID household_id
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | USD
LocalDate endDate = LocalDate.now(); // LocalDate | end date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    PagePortfolioTransaction result = apiInstance.getHouseholdClientTransactionUsingGet(householdId, ascending, currencyConversion, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#getHouseholdClientTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| UUID household_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| USD | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdUsingGet"></a>
# **getHouseholdUsingGet**
> Household getHouseholdUsingGet(householdId)

Retrieve a Household

Retrieve the information for a Household.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
UUID householdId = new UUID(); // UUID | UUID household_id
try {
    Household result = apiInstance.getHouseholdUsingGet(householdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#getHouseholdUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| UUID household_id |

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateHouseholdUsingPut"></a>
# **updateHouseholdUsingPut**
> Household updateHouseholdUsingPut(household, householdId)

Update a Household

Update the information for a Household.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import HouseholdApi;

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
HouseholdApi apiInstance = new HouseholdApi();
Object household = null; // Object | household
UUID householdId = new UUID(); // UUID | UUID household_id
try {
    Household result = apiInstance.updateHouseholdUsingPut(household, householdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HouseholdApi#updateHouseholdUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | **Object**| household |
 **householdId** | [**UUID**](.md)| UUID household_id |

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

