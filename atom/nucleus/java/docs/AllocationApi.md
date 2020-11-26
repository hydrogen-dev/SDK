# AllocationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAllocationCompositionUsingPost**](AllocationApi.md#createAllocationCompositionUsingPost) | **POST** /allocation_composition | Create an allocation composition
[**createAllocationUsingPost**](AllocationApi.md#createAllocationUsingPost) | **POST** /allocation | Create an allocation
[**deleteAllocationCompositionUsingDelete**](AllocationApi.md#deleteAllocationCompositionUsingDelete) | **DELETE** /allocation_composition/{allocation_composition_id} | Delete an allocation composition
[**deleteAllocationUsingDelete**](AllocationApi.md#deleteAllocationUsingDelete) | **DELETE** /allocation/{allocation_id} | Delete an allocation
[**getAllocationAllAggregateDataUsingGet**](AllocationApi.md#getAllocationAllAggregateDataUsingGet) | **GET** /allocation/{allocation_id}/aggregate_data | List all Allocation aggregated data overview
[**getAllocationAllAssetSizeAllUsingGet**](AllocationApi.md#getAllocationAllAssetSizeAllUsingGet) | **GET** /allocation/{allocation_id}/asset_size | List all allocation asset sizes
[**getAllocationAllHoldingAllUsingGet**](AllocationApi.md#getAllocationAllHoldingAllUsingGet) | **GET** /allocation/{allocation_id}/holding | List all allocation holdings
[**getAllocationAllTransactionAllUsingGet**](AllocationApi.md#getAllocationAllTransactionAllUsingGet) | **GET** /allocation/{allocation_id}/transaction | List all allocation transactions
[**getAllocationAllUsingGet**](AllocationApi.md#getAllocationAllUsingGet) | **GET** /allocation | List all allocations
[**getAllocationCompositionAllUsingGet**](AllocationApi.md#getAllocationCompositionAllUsingGet) | **GET** /allocation_composition | List all allocations compositions
[**getAllocationCompositionUsingGet**](AllocationApi.md#getAllocationCompositionUsingGet) | **GET** /allocation_composition/{allocation_composition_id} | Retrieve an allocation composition
[**getAllocationUsingGet**](AllocationApi.md#getAllocationUsingGet) | **GET** /allocation/{allocation_id} | Retrieve an allocation
[**updateAllocationCompositionUsingPut**](AllocationApi.md#updateAllocationCompositionUsingPut) | **PUT** /allocation_composition/{allocation_composition_id} | Update an allocation composition
[**updateAllocationUsingPut**](AllocationApi.md#updateAllocationUsingPut) | **PUT** /allocation/{allocation_id} | Update an allocation


<a name="createAllocationCompositionUsingPost"></a>
# **createAllocationCompositionUsingPost**
> AllocationComposition createAllocationCompositionUsingPost(allocRequest)

Create an allocation composition

Create a new allocation composition record for an allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
AllocationComposition allocRequest = new AllocationComposition(); // AllocationComposition | allocRequest
try {
    AllocationComposition result = apiInstance.createAllocationCompositionUsingPost(allocRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#createAllocationCompositionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocRequest** | [**AllocationComposition**](AllocationComposition.md)| allocRequest |

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAllocationUsingPost"></a>
# **createAllocationUsingPost**
> Allocation createAllocationUsingPost(allocationRequest)

Create an allocation

Create a new allocation for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
Allocation allocationRequest = new Allocation(); // Allocation | allocationRequest
try {
    Allocation result = apiInstance.createAllocationUsingPost(allocationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#createAllocationUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationRequest** | [**Allocation**](Allocation.md)| allocationRequest |

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllocationCompositionUsingDelete"></a>
# **deleteAllocationCompositionUsingDelete**
> deleteAllocationCompositionUsingDelete(allocationCompositionId)

Delete an allocation composition

Permanently delete an allocation composition record for an allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationCompositionId = new UUID(); // UUID | UUID allocation_composition_id
try {
    apiInstance.deleteAllocationCompositionUsingDelete(allocationCompositionId);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#deleteAllocationCompositionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | [**UUID**](.md)| UUID allocation_composition_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAllocationUsingDelete"></a>
# **deleteAllocationUsingDelete**
> deleteAllocationUsingDelete(allocationId)

Delete an allocation

Permanently delete an allocation defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | UUID allocation_id
try {
    apiInstance.deleteAllocationUsingDelete(allocationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#deleteAllocationUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| UUID allocation_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllAggregateDataUsingGet"></a>
# **getAllocationAllAggregateDataUsingGet**
> AllocationAggregatedVO getAllocationAllAggregateDataUsingGet(allocationId)

List all Allocation aggregated data overview

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | Allocation Id
try {
    AllocationAggregatedVO result = apiInstance.getAllocationAllAggregateDataUsingGet(allocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationAllAggregateDataUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| Allocation Id |

### Return type

[**AllocationAggregatedVO**](AllocationAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllAssetSizeAllUsingGet"></a>
# **getAllocationAllAssetSizeAllUsingGet**
> List&lt;DateDoubleVO&gt; getAllocationAllAssetSizeAllUsingGet(allocationId, endDate, getLatest, isCurrentWeight, sortType, startDate)

List all allocation asset sizes

Get a list of asset sizes by date for a specific allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | UUID allocation_id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean getLatest = true; // Boolean | get_latest
Boolean isCurrentWeight = true; // Boolean | is_current_weight
String sortType = "sortType_example"; // String | D (Daily), Q (quarterly), M (Monthly), Y (Annually) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<DateDoubleVO> result = apiInstance.getAllocationAllAssetSizeAllUsingGet(allocationId, endDate, getLatest, isCurrentWeight, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationAllAssetSizeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| UUID allocation_id |
 **endDate** | **LocalDate**| end date | [optional]
 **getLatest** | **Boolean**| get_latest | [optional]
 **isCurrentWeight** | **Boolean**| is_current_weight | [optional] [default to true]
 **sortType** | **String**| D (Daily), Q (quarterly), M (Monthly), Y (Annually)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**List&lt;DateDoubleVO&gt;**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllHoldingAllUsingGet"></a>
# **getAllocationAllHoldingAllUsingGet**
> List&lt;ModelHoldingVO&gt; getAllocationAllHoldingAllUsingGet(allocationId, endDate, startDate)

List all allocation holdings

Get the information for all securities assigned to a specific allocation. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | UUID allocation_id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<ModelHoldingVO> result = apiInstance.getAllocationAllHoldingAllUsingGet(allocationId, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationAllHoldingAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| UUID allocation_id |
 **endDate** | **LocalDate**| end date | [optional]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**List&lt;ModelHoldingVO&gt;**](ModelHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllTransactionAllUsingGet"></a>
# **getAllocationAllTransactionAllUsingGet**
> PageModelTransaction getAllocationAllTransactionAllUsingGet(allocationId, ascending, endDate, orderBy, page, size, startDate)

List all allocation transactions

Get the information for all transactions made under an allocation to achieve the composition of the allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | UUID allocation_id
Boolean ascending = false; // Boolean | ascending
LocalDate endDate = LocalDate.now(); // LocalDate | end date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    PageModelTransaction result = apiInstance.getAllocationAllTransactionAllUsingGet(allocationId, ascending, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationAllTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| UUID allocation_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **LocalDate**| end date | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationAllUsingGet"></a>
# **getAllocationAllUsingGet**
> PageAllocation getAllocationAllUsingGet(ascending, filter, orderBy, page, size)

List all allocations

Get details for all allocations defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAllocation result = apiInstance.getAllocationAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationAllUsingGet");
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

[**PageAllocation**](PageAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationCompositionAllUsingGet"></a>
# **getAllocationCompositionAllUsingGet**
> PageAllocationComposition getAllocationCompositionAllUsingGet(ascending, filter, orderBy, page, size)

List all allocations compositions

Get the allocation composition for all allocations.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAllocationComposition result = apiInstance.getAllocationCompositionAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationCompositionAllUsingGet");
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

[**PageAllocationComposition**](PageAllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationCompositionUsingGet"></a>
# **getAllocationCompositionUsingGet**
> AllocationComposition getAllocationCompositionUsingGet(allocationCompositionId)

Retrieve an allocation composition

Retrieve the information of an allocation composition record for an allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationCompositionId = new UUID(); // UUID | UUID allocation_composition_id
try {
    AllocationComposition result = apiInstance.getAllocationCompositionUsingGet(allocationCompositionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationCompositionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | [**UUID**](.md)| UUID allocation_composition_id |

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationUsingGet"></a>
# **getAllocationUsingGet**
> Allocation getAllocationUsingGet(allocationId)

Retrieve an allocation

Retrieve the information for an allocation defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
UUID allocationId = new UUID(); // UUID | UUID allocation_id
try {
    Allocation result = apiInstance.getAllocationUsingGet(allocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#getAllocationUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| UUID allocation_id |

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAllocationCompositionUsingPut"></a>
# **updateAllocationCompositionUsingPut**
> AllocationComposition updateAllocationCompositionUsingPut(allocationComposition, allocationCompositionId)

Update an allocation composition

Update the information of an allocation composition record for an allocation.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
AllocationComposition allocationComposition = new AllocationComposition(); // AllocationComposition | allocation_composition
UUID allocationCompositionId = new UUID(); // UUID | UUID allocation_composition_id
try {
    AllocationComposition result = apiInstance.updateAllocationCompositionUsingPut(allocationComposition, allocationCompositionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#updateAllocationCompositionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationComposition** | [**AllocationComposition**](AllocationComposition.md)| allocation_composition |
 **allocationCompositionId** | [**UUID**](.md)| UUID allocation_composition_id |

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAllocationUsingPut"></a>
# **updateAllocationUsingPut**
> Allocation updateAllocationUsingPut(allocation, allocationId)

Update an allocation

Update an allocation defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import AllocationApi;

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


AllocationApi apiInstance = new AllocationApi();
Allocation allocation = new Allocation(); // Allocation | allocation
UUID allocationId = new UUID(); // UUID | UUID allocation_id
try {
    Allocation result = apiInstance.updateAllocationUsingPut(allocation, allocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationApi#updateAllocationUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | [**Allocation**](Allocation.md)| allocation |
 **allocationId** | [**UUID**](.md)| UUID allocation_id |

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

