# AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountingUsingPost**](AccountingApi.md#createAccountingUsingPost) | **POST** /accounting | Create an accounting
[**deleteAccountingUsingDelete**](AccountingApi.md#deleteAccountingUsingDelete) | **DELETE** /accounting/{accounting_id} | Delete an accounting
[**getAccountingAllUsingGet**](AccountingApi.md#getAccountingAllUsingGet) | **GET** /accounting | List all accounting
[**getAccountingUsingGet**](AccountingApi.md#getAccountingUsingGet) | **GET** /accounting/{accounting_id} | Retrieve an accounting
[**updateAccountingUsingPut**](AccountingApi.md#updateAccountingUsingPut) | **PUT** /accounting/{accounting_id} | Update an accounting


<a name="createAccountingUsingPost"></a>
# **createAccountingUsingPost**
> Accounting createAccountingUsingPost(accounting)

Create an accounting

Store stats pulled from accounting vendors.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AccountingApi;

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

AccountingApi apiInstance = new AccountingApi();
Accounting accounting = new Accounting(); // Accounting | accounting
try {
    Accounting result = apiInstance.createAccountingUsingPost(accounting);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#createAccountingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting |

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAccountingUsingDelete"></a>
# **deleteAccountingUsingDelete**
> deleteAccountingUsingDelete(accountingId)

Delete an accounting

Permanently delete an accounting.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AccountingApi;

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

AccountingApi apiInstance = new AccountingApi();
UUID accountingId = new UUID(); // UUID | UUID accounting_id
try {
    apiInstance.deleteAccountingUsingDelete(accountingId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#deleteAccountingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingId** | [**UUID**](.md)| UUID accounting_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingAllUsingGet"></a>
# **getAccountingAllUsingGet**
> PageAccounting getAccountingAllUsingGet(ascending, filter, orderBy, page, size)

List all accounting

Get information for all accounting for all clients defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AccountingApi;

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

AccountingApi apiInstance = new AccountingApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccounting result = apiInstance.getAccountingAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#getAccountingAllUsingGet");
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

[**PageAccounting**](PageAccounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingUsingGet"></a>
# **getAccountingUsingGet**
> Accounting getAccountingUsingGet(accountingId)

Retrieve an accounting

Retrieve the information for a specific accounting associated with a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AccountingApi;

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

AccountingApi apiInstance = new AccountingApi();
UUID accountingId = new UUID(); // UUID | UUID accounting_id
try {
    Accounting result = apiInstance.getAccountingUsingGet(accountingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#getAccountingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingId** | [**UUID**](.md)| UUID accounting_id |

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAccountingUsingPut"></a>
# **updateAccountingUsingPut**
> Accounting updateAccountingUsingPut(accounting, accountingId)

Update an accounting

Update the information for an accounting.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AccountingApi;

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

AccountingApi apiInstance = new AccountingApi();
Accounting accounting = new Accounting(); // Accounting | accounting
UUID accountingId = new UUID(); // UUID | UUID accounting_id
try {
    Accounting result = apiInstance.updateAccountingUsingPut(accounting, accountingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#updateAccountingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting |
 **accountingId** | [**UUID**](.md)| UUID accounting_id |

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

