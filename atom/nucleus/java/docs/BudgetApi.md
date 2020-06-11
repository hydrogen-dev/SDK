# BudgetApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBudgetUsingPost**](BudgetApi.md#createBudgetUsingPost) | **POST** /budget | Create a budget request
[**deleteBudgetUsingDelete**](BudgetApi.md#deleteBudgetUsingDelete) | **DELETE** /budget/{budget_id} | Delete a budget request
[**getBudgetAllUsingGet**](BudgetApi.md#getBudgetAllUsingGet) | **GET** /budget | List all budget requests
[**getBudgetUsingGet**](BudgetApi.md#getBudgetUsingGet) | **GET** /budget/{budget_id} | Retrieve a budget request
[**updateBudgetUsingPut**](BudgetApi.md#updateBudgetUsingPut) | **PUT** /budget/{budget_id} | Update a budget request


<a name="createBudgetUsingPost"></a>
# **createBudgetUsingPost**
> Budget createBudgetUsingPost(budgetRequest)

Create a budget request

Create a new budget request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BudgetApi;

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

BudgetApi apiInstance = new BudgetApi();
Budget budgetRequest = new Budget(); // Budget | budgetRequest
try {
    Budget result = apiInstance.createBudgetUsingPost(budgetRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetApi#createBudgetUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetRequest** | [**Budget**](Budget.md)| budgetRequest |

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBudgetUsingDelete"></a>
# **deleteBudgetUsingDelete**
> deleteBudgetUsingDelete(budgetId)

Delete a budget request

Permanently delete a budget request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BudgetApi;

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

BudgetApi apiInstance = new BudgetApi();
UUID budgetId = new UUID(); // UUID | UUID budget_id
try {
    apiInstance.deleteBudgetUsingDelete(budgetId);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetApi#deleteBudgetUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| UUID budget_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBudgetAllUsingGet"></a>
# **getBudgetAllUsingGet**
> PageBudget getBudgetAllUsingGet(ascending, filter, orderBy, page, size)

List all budget requests

Get the information for all budget requests.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BudgetApi;

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

BudgetApi apiInstance = new BudgetApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageBudget result = apiInstance.getBudgetAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetApi#getBudgetAllUsingGet");
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

[**PageBudget**](PageBudget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBudgetUsingGet"></a>
# **getBudgetUsingGet**
> Budget getBudgetUsingGet(budgetId)

Retrieve a budget request

Retrieve the information for a budget request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BudgetApi;

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

BudgetApi apiInstance = new BudgetApi();
UUID budgetId = new UUID(); // UUID | UUID budget_id
try {
    Budget result = apiInstance.getBudgetUsingGet(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetApi#getBudgetUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| UUID budget_id |

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBudgetUsingPut"></a>
# **updateBudgetUsingPut**
> Budget updateBudgetUsingPut(budget, budgetId)

Update a budget request

Update the information for a budget request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import BudgetApi;

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

BudgetApi apiInstance = new BudgetApi();
Budget budget = new Budget(); // Budget | budget
UUID budgetId = new UUID(); // UUID | UUID budget_id
try {
    Budget result = apiInstance.updateBudgetUsingPut(budget, budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetApi#updateBudgetUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget** | [**Budget**](Budget.md)| budget |
 **budgetId** | [**UUID**](.md)| UUID budget_id |

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

