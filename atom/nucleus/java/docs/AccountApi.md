# AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountAllocationMappingUsingPost**](AccountApi.md#createAccountAllocationMappingUsingPost) | **POST** /account_allocation | Create an account allocation
[**createAccountTypeUsingPost**](AccountApi.md#createAccountTypeUsingPost) | **POST** /account_type | Create an account type
[**createAccountUsingPost**](AccountApi.md#createAccountUsingPost) | **POST** /account | Create an account
[**deleteAccountAllocationMappingUsingDelete**](AccountApi.md#deleteAccountAllocationMappingUsingDelete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**deleteAccountPermissionUsingDELETE**](AccountApi.md#deleteAccountPermissionUsingDELETE) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**deleteAccountTypeUsingDelete**](AccountApi.md#deleteAccountTypeUsingDelete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**deleteAccountUsingDelete**](AccountApi.md#deleteAccountUsingDelete) | **DELETE** /account/{account_id} | Delete an account
[**getAccountAllUsingGet**](AccountApi.md#getAccountAllUsingGet) | **GET** /account | List all accounts
[**getAccountAllocationMappingAllUsingGet**](AccountApi.md#getAccountAllocationMappingAllUsingGet) | **GET** /account_allocation | List all account allocations
[**getAccountAllocationMappingUsingGet**](AccountApi.md#getAccountAllocationMappingUsingGet) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**getAccountAssetSizeAggAllUsingGet**](AccountApi.md#getAccountAssetSizeAggAllUsingGet) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**getAccountAssetSizeAllUsingGet**](AccountApi.md#getAccountAssetSizeAllUsingGet) | **GET** /account_asset_size | List all account asset sizes
[**getAccountOverviewUsingGet**](AccountApi.md#getAccountOverviewUsingGet) | **GET** /account/{account_id}/account_overview | List all Account overview
[**getAccountPermissionUsingGET**](AccountApi.md#getAccountPermissionUsingGET) | **GET** /account_permission/{account_id} | Get an account permission
[**getAccountTypeAllUsingGet**](AccountApi.md#getAccountTypeAllUsingGet) | **GET** /account_type | List all account types
[**getAccountTypeUsingGet**](AccountApi.md#getAccountTypeUsingGet) | **GET** /account_type/{account_type_id} | Get an Account Type
[**getAccountUsingGet**](AccountApi.md#getAccountUsingGet) | **GET** /account/{account_id} | Retrieve an account
[**getAllAccountPermissionUsingGET**](AccountApi.md#getAllAccountPermissionUsingGET) | **GET** /account_permission | List all account permission
[**getPortfolioHoldingAggAllUsingGet**](AccountApi.md#getPortfolioHoldingAggAllUsingGet) | **GET** /account/{account_id}/holding | List all account holdings
[**getPortfolioTransactionAggAllUsingGet**](AccountApi.md#getPortfolioTransactionAggAllUsingGet) | **GET** /account/{account_id}/transaction | List all account transactions
[**insertAccountAndRelatedPermissionUsingPOST**](AccountApi.md#insertAccountAndRelatedPermissionUsingPOST) | **POST** /account_permission | create an account permission
[**subscribeAccountUsingPost**](AccountApi.md#subscribeAccountUsingPost) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**updateAccountAllocationMappingUsingPut**](AccountApi.md#updateAccountAllocationMappingUsingPut) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**updateAccountTypeUsingPut**](AccountApi.md#updateAccountTypeUsingPut) | **PUT** /account_type/{account_type_id} | Update an account type
[**updateAccountUsingPut**](AccountApi.md#updateAccountUsingPut) | **PUT** /account/{account_id} | Update an account
[**updateClientAccountPermissionUsingPUT**](AccountApi.md#updateClientAccountPermissionUsingPUT) | **PUT** /account_permission/{account_id} | Update an account permission


<a name="createAccountAllocationMappingUsingPost"></a>
# **createAccountAllocationMappingUsingPost**
> AccountAllocationMapping createAccountAllocationMappingUsingPost(allocRequest)

Create an account allocation

Create an account-allocation mapping for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
AccountAllocationMapping allocRequest = new AccountAllocationMapping(); // AccountAllocationMapping | allocRequest
try {
    AccountAllocationMapping result = apiInstance.createAccountAllocationMappingUsingPost(allocRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createAccountAllocationMappingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocRequest** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest |

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountTypeUsingPost"></a>
# **createAccountTypeUsingPost**
> AccountType createAccountTypeUsingPost(accountTypeRequest)

Create an account type

Create a new account type for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
AccountType accountTypeRequest = new AccountType(); // AccountType | accountTypeRequest
try {
    AccountType result = apiInstance.createAccountTypeUsingPost(accountTypeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createAccountTypeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeRequest** | [**AccountType**](AccountType.md)| accountTypeRequest |

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountUsingPost"></a>
# **createAccountUsingPost**
> Account createAccountUsingPost(clientAccountRequest)

Create an account

Create an account under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Account clientAccountRequest = new Account(); // Account | clientAccountRequest
try {
    Account result = apiInstance.createAccountUsingPost(clientAccountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#createAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientAccountRequest** | [**Account**](Account.md)| clientAccountRequest |

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAccountAllocationMappingUsingDelete"></a>
# **deleteAccountAllocationMappingUsingDelete**
> deleteAccountAllocationMappingUsingDelete(accountAllocationId)

Delete an account allocation

Permanently delete an account-allocation mapping for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountAllocationId = new UUID(); // UUID | UUID account_allocation_id
try {
    apiInstance.deleteAccountAllocationMappingUsingDelete(accountAllocationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountAllocationMappingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**UUID**](.md)| UUID account_allocation_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountPermissionUsingDELETE"></a>
# **deleteAccountPermissionUsingDELETE**
> AccountPermissionVO deleteAccountPermissionUsingDELETE(accountId)

Delete an account permission

Delete an account permission

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | account_id
try {
    AccountPermissionVO result = apiInstance.deleteAccountPermissionUsingDELETE(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountPermissionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountTypeUsingDelete"></a>
# **deleteAccountTypeUsingDelete**
> deleteAccountTypeUsingDelete(accountTypeId, accountTypeId2)

Delete an account type

Permanently delete a possible account type defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountTypeId = new UUID(); // UUID | UUID account_type_id
UUID accountTypeId2 = new UUID(); // UUID | account_type_id
try {
    apiInstance.deleteAccountTypeUsingDelete(accountTypeId, accountTypeId2);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountTypeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | [**UUID**](.md)| UUID account_type_id |
 **accountTypeId2** | [**UUID**](.md)| account_type_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountUsingDelete"></a>
# **deleteAccountUsingDelete**
> deleteAccountUsingDelete(accountId)

Delete an account

Permanently delete an account under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
try {
    apiInstance.deleteAccountUsingDelete(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllUsingGet"></a>
# **getAccountAllUsingGet**
> PageAccount getAccountAllUsingGet(ascending, filter, orderBy, page, size)

List all accounts

Get information for all accounts for all clients defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccount result = apiInstance.getAccountAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountAllUsingGet");
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

[**PageAccount**](PageAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllocationMappingAllUsingGet"></a>
# **getAccountAllocationMappingAllUsingGet**
> PageAccountAllocationMapping getAccountAllocationMappingAllUsingGet(ascending, filter, orderBy, page, size)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccountAllocationMapping result = apiInstance.getAccountAllocationMappingAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountAllocationMappingAllUsingGet");
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

[**PageAccountAllocationMapping**](PageAccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllocationMappingUsingGet"></a>
# **getAccountAllocationMappingUsingGet**
> AccountAllocationMapping getAccountAllocationMappingUsingGet(accountAllocationId)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountAllocationId = new UUID(); // UUID | UUID account_allocation_id
try {
    AccountAllocationMapping result = apiInstance.getAccountAllocationMappingUsingGet(accountAllocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountAllocationMappingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**UUID**](.md)| UUID account_allocation_id |

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAssetSizeAggAllUsingGet"></a>
# **getAccountAssetSizeAggAllUsingGet**
> List&lt;AvailableDateDoubleVO&gt; getAccountAssetSizeAggAllUsingGet(accountId, endDate, excludeSubledger, getLatest, sortType, startDate)

List all account asset sizes

Get a list of asset sizes by date for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | Account Id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean excludeSubledger = false; // Boolean | exclude_subledger
Boolean getLatest = true; // Boolean | true or false
String sortType = "sortType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<AvailableDateDoubleVO> result = apiInstance.getAccountAssetSizeAggAllUsingGet(accountId, endDate, excludeSubledger, getLatest, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountAssetSizeAggAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| Account Id |
 **endDate** | **LocalDate**| end date | [optional]
 **excludeSubledger** | **Boolean**| exclude_subledger | [optional] [default to false]
 **getLatest** | **Boolean**| true or false | [optional]
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**List&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAssetSizeAllUsingGet"></a>
# **getAccountAssetSizeAllUsingGet**
> PageVAccountAssetSize getAccountAssetSizeAllUsingGet(ascending, filter, orderBy, page, size)

List all account asset sizes

Get information for all account asset sizes

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageVAccountAssetSize result = apiInstance.getAccountAssetSizeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountAssetSizeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageVAccountAssetSize**](PageVAccountAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountOverviewUsingGet"></a>
# **getAccountOverviewUsingGet**
> AccountOverviewVO getAccountOverviewUsingGet(accountId, ascending, orderBy)

List all Account overview

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
Boolean ascending = false; // Boolean | ascending
String orderBy = "update_date"; // String | order_by
try {
    AccountOverviewVO result = apiInstance.getAccountOverviewUsingGet(accountId, ascending, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountOverviewUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **orderBy** | **String**| order_by | [optional] [default to update_date]

### Return type

[**AccountOverviewVO**](AccountOverviewVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountPermissionUsingGET"></a>
# **getAccountPermissionUsingGET**
> AccountPermissionVO getAccountPermissionUsingGET(accountId)

Get an account permission

Get an account permission

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | account_id
try {
    AccountPermissionVO result = apiInstance.getAccountPermissionUsingGET(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountPermissionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountTypeAllUsingGet"></a>
# **getAccountTypeAllUsingGet**
> PageAccountType getAccountTypeAllUsingGet(ascending, filter, orderBy, page, size)

List all account types

List all account types defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccountType result = apiInstance.getAccountTypeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountTypeAllUsingGet");
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

[**PageAccountType**](PageAccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountTypeUsingGet"></a>
# **getAccountTypeUsingGet**
> AccountType getAccountTypeUsingGet(accountTypeId, accountTypeId2)

Get an Account Type

Get an account types defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountTypeId = new UUID(); // UUID | UUID account_type_id
UUID accountTypeId2 = new UUID(); // UUID | account_type_id
try {
    AccountType result = apiInstance.getAccountTypeUsingGet(accountTypeId, accountTypeId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountTypeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | [**UUID**](.md)| UUID account_type_id |
 **accountTypeId2** | [**UUID**](.md)| account_type_id |

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountUsingGet"></a>
# **getAccountUsingGet**
> Account getAccountUsingGet(accountId)

Retrieve an account

Retrieve the information for a specific account associated with a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
try {
    Account result = apiInstance.getAccountUsingGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllAccountPermissionUsingGET"></a>
# **getAllAccountPermissionUsingGET**
> PageAccountPermissionVO getAllAccountPermissionUsingGET(ascending, filter, orderBy, page, size)

List all account permission

List all account permission

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccountPermissionVO result = apiInstance.getAllAccountPermissionUsingGET(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAllAccountPermissionUsingGET");
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

[**PageAccountPermissionVO**](PageAccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingAggAllUsingGet"></a>
# **getPortfolioHoldingAggAllUsingGet**
> List&lt;PortfolioHoldingAgg&gt; getPortfolioHoldingAggAllUsingGet(accountId, endDate, getLatest, startDate)

List all account holdings

Get information for all the securities that are currently being held by an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
String endDate = "endDate_example"; // String | end date 
Boolean getLatest = true; // Boolean | true or false
String startDate = "startDate_example"; // String | start date 
try {
    List<PortfolioHoldingAgg> result = apiInstance.getPortfolioHoldingAggAllUsingGet(accountId, endDate, getLatest, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getPortfolioHoldingAggAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |
 **endDate** | **String**| end date  | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **startDate** | **String**| start date  | [optional]

### Return type

[**List&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionAggAllUsingGet"></a>
# **getPortfolioTransactionAggAllUsingGet**
> PagePortfolioTransaction getPortfolioTransactionAggAllUsingGet(accountId, ascending, endDate, orderBy, page, size, startDate)

List all account transactions

Get the information for all transactions for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
Boolean ascending = false; // Boolean | ascending
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    PagePortfolioTransaction result = apiInstance.getPortfolioTransactionAggAllUsingGet(accountId, ascending, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getPortfolioTransactionAggAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **OffsetDateTime**| start_date | [optional] [default to null]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertAccountAndRelatedPermissionUsingPOST"></a>
# **insertAccountAndRelatedPermissionUsingPOST**
> AccountPermissionVO insertAccountAndRelatedPermissionUsingPOST(aclClientPermissionVO)

create an account permission

create an account permission

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
AclClientPermissionVO aclClientPermissionVO = new AclClientPermissionVO(); // AclClientPermissionVO | aclClientPermissionVO
try {
    AccountPermissionVO result = apiInstance.insertAccountAndRelatedPermissionUsingPOST(aclClientPermissionVO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#insertAccountAndRelatedPermissionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aclClientPermissionVO** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscribeAccountUsingPost"></a>
# **subscribeAccountUsingPost**
> List&lt;Portfolio&gt; subscribeAccountUsingPost(accountId, allocRequest)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | UUID account_id
AccountAllocationMapping allocRequest = new AccountAllocationMapping(); // AccountAllocationMapping | allocRequest
try {
    List<Portfolio> result = apiInstance.subscribeAccountUsingPost(accountId, allocRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#subscribeAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| UUID account_id |
 **allocRequest** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest |

### Return type

[**List&lt;Portfolio&gt;**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountAllocationMappingUsingPut"></a>
# **updateAccountAllocationMappingUsingPut**
> AccountAllocationMapping updateAccountAllocationMappingUsingPut(accountAllocationId, accountAllocationMapping)

Update an account allocation

Update the information for an account-allocation mapping.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountAllocationId = new UUID(); // UUID | UUID account_allocation_id
AccountAllocationMapping accountAllocationMapping = new AccountAllocationMapping(); // AccountAllocationMapping | account_allocation_mapping
try {
    AccountAllocationMapping result = apiInstance.updateAccountAllocationMappingUsingPut(accountAllocationId, accountAllocationMapping);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#updateAccountAllocationMappingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**UUID**](.md)| UUID account_allocation_id |
 **accountAllocationMapping** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| account_allocation_mapping | [optional]

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountTypeUsingPut"></a>
# **updateAccountTypeUsingPut**
> AccountType updateAccountTypeUsingPut(accountType, accountTypeId)

Update an account type

Update the information for a possible account type defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
AccountType accountType = new AccountType(); // AccountType | account_type
UUID accountTypeId = new UUID(); // UUID | UUID account_type_id
try {
    AccountType result = apiInstance.updateAccountTypeUsingPut(accountType, accountTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#updateAccountTypeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | [**AccountType**](AccountType.md)| account_type |
 **accountTypeId** | [**UUID**](.md)| UUID account_type_id |

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountUsingPut"></a>
# **updateAccountUsingPut**
> Account updateAccountUsingPut(account, accountId)

Update an account

Update the information for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
Account account = new Account(); // Account | account
UUID accountId = new UUID(); // UUID | UUID account_id
try {
    Account result = apiInstance.updateAccountUsingPut(account, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#updateAccountUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| account |
 **accountId** | [**UUID**](.md)| UUID account_id |

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientAccountPermissionUsingPUT"></a>
# **updateClientAccountPermissionUsingPUT**
> AccountPermissionVO updateClientAccountPermissionUsingPUT(accountId, aclClientPermissionVO)

Update an account permission

Update an account permission

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import AccountApi;

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

AccountApi apiInstance = new AccountApi();
UUID accountId = new UUID(); // UUID | account_id
AclClientPermissionVO aclClientPermissionVO = new AclClientPermissionVO(); // AclClientPermissionVO | aclClientPermissionVO
try {
    AccountPermissionVO result = apiInstance.updateClientAccountPermissionUsingPUT(accountId, aclClientPermissionVO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#updateClientAccountPermissionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **aclClientPermissionVO** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

