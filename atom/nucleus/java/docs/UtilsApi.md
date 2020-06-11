# UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountStatusUsingPost**](UtilsApi.md#createAccountStatusUsingPost) | **POST** /account_status | Create an account status
[**createStageUsingPost**](UtilsApi.md#createStageUsingPost) | **POST** /stage | Create an account stage
[**createTransactionCodeUsingPost**](UtilsApi.md#createTransactionCodeUsingPost) | **POST** /transaction_code | Create a transaction code
[**deleteAccountStatusUsingDelete**](UtilsApi.md#deleteAccountStatusUsingDelete) | **DELETE** /account_status/{account_status_id} | Delete an account status
[**deleteStageUsingDelete**](UtilsApi.md#deleteStageUsingDelete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**deleteTransactionCodeUsingDelete**](UtilsApi.md#deleteTransactionCodeUsingDelete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**getAccountStatusAllUsingGet**](UtilsApi.md#getAccountStatusAllUsingGet) | **GET** /account_status | List all account statuses
[**getAccountStatusUsingGet**](UtilsApi.md#getAccountStatusUsingGet) | **GET** /account_status/{account_status_id} | Retrieve an account status
[**getStageAllUsingGet**](UtilsApi.md#getStageAllUsingGet) | **GET** /stage | List all account stages
[**getStageUsingGet**](UtilsApi.md#getStageUsingGet) | **GET** /stage/{stage_id} | Retrieve an account stage
[**getTransactionCodeAllUsingGet**](UtilsApi.md#getTransactionCodeAllUsingGet) | **GET** /transaction_code | List all transaction codes
[**getTransactionCodeUsingGet**](UtilsApi.md#getTransactionCodeUsingGet) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**updateAccountStatusUsingPut**](UtilsApi.md#updateAccountStatusUsingPut) | **PUT** /account_status/{account_status_id} | Update an account status
[**updateStageUsingPut**](UtilsApi.md#updateStageUsingPut) | **PUT** /stage/{stage_id} | Update an account stage
[**updateTransactionCodeUsingPut**](UtilsApi.md#updateTransactionCodeUsingPut) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


<a name="createAccountStatusUsingPost"></a>
# **createAccountStatusUsingPost**
> AccountStatus createAccountStatusUsingPost(accountStatusRequest)

Create an account status

Create an account status record for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
AccountStatus accountStatusRequest = new AccountStatus(); // AccountStatus | accountStatusRequest
try {
    AccountStatus result = apiInstance.createAccountStatusUsingPost(accountStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createAccountStatusUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusRequest** | [**AccountStatus**](AccountStatus.md)| accountStatusRequest |

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStageUsingPost"></a>
# **createStageUsingPost**
> Stage createStageUsingPost(stageRequest)

Create an account stage

Create a new account stage

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
Stage stageRequest = new Stage(); // Stage | stageRequest
try {
    Stage result = apiInstance.createStageUsingPost(stageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createStageUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageRequest** | [**Stage**](Stage.md)| stageRequest |

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createTransactionCodeUsingPost"></a>
# **createTransactionCodeUsingPost**
> TransactionCode createTransactionCodeUsingPost(transactionRequest)

Create a transaction code

Create a new transaction code for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
TransactionCode transactionRequest = new TransactionCode(); // TransactionCode | transactionRequest
try {
    TransactionCode result = apiInstance.createTransactionCodeUsingPost(transactionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createTransactionCodeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequest** | [**TransactionCode**](TransactionCode.md)| transactionRequest |

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAccountStatusUsingDelete"></a>
# **deleteAccountStatusUsingDelete**
> deleteAccountStatusUsingDelete(accountStatusId)

Delete an account status

Permanently delete an account status record from an account’s history.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID accountStatusId = new UUID(); // UUID | UUID account_status_id
try {
    apiInstance.deleteAccountStatusUsingDelete(accountStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#deleteAccountStatusUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | [**UUID**](.md)| UUID account_status_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteStageUsingDelete"></a>
# **deleteStageUsingDelete**
> deleteStageUsingDelete(stageId)

Delete an account stage

Permanently delete an account stage.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID stageId = new UUID(); // UUID | UUID stage_id
try {
    apiInstance.deleteStageUsingDelete(stageId);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#deleteStageUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**UUID**](.md)| UUID stage_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTransactionCodeUsingDelete"></a>
# **deleteTransactionCodeUsingDelete**
> deleteTransactionCodeUsingDelete(transactionCodeId)

Delete a transaction code

Permanently delete a transaction code for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID transactionCodeId = new UUID(); // UUID | UUID transaction_code_id
try {
    apiInstance.deleteTransactionCodeUsingDelete(transactionCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#deleteTransactionCodeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**UUID**](.md)| UUID transaction_code_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountStatusAllUsingGet"></a>
# **getAccountStatusAllUsingGet**
> PageAccountStatus getAccountStatusAllUsingGet(ascending, filter, orderBy, page, size)

List all account statuses

Get the account status history information for all accounts.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAccountStatus result = apiInstance.getAccountStatusAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getAccountStatusAllUsingGet");
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

[**PageAccountStatus**](PageAccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountStatusUsingGet"></a>
# **getAccountStatusUsingGet**
> AccountStatus getAccountStatusUsingGet(accountStatusId)

Retrieve an account status

Retrieve the information for a specific account status record for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID accountStatusId = new UUID(); // UUID | UUID account_status_id
try {
    AccountStatus result = apiInstance.getAccountStatusUsingGet(accountStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getAccountStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | [**UUID**](.md)| UUID account_status_id |

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStageAllUsingGet"></a>
# **getStageAllUsingGet**
> PageStage getStageAllUsingGet(ascending, filter, orderBy, page, size)

List all account stages

Get the information for all possible account stages.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageStage result = apiInstance.getStageAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getStageAllUsingGet");
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

[**PageStage**](PageStage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStageUsingGet"></a>
# **getStageUsingGet**
> Stage getStageUsingGet(stageId)

Retrieve an account stage

Retrieve the information for a specific account stage.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID stageId = new UUID(); // UUID | UUID stage_id
try {
    Stage result = apiInstance.getStageUsingGet(stageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getStageUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**UUID**](.md)| UUID stage_id |

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionCodeAllUsingGet"></a>
# **getTransactionCodeAllUsingGet**
> PageTransactionCode getTransactionCodeAllUsingGet(ascending, filter, orderBy, page, size)

List all transaction codes

Get the information for all transaction codes defined by your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageTransactionCode result = apiInstance.getTransactionCodeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getTransactionCodeAllUsingGet");
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

[**PageTransactionCode**](PageTransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionCodeUsingGet"></a>
# **getTransactionCodeUsingGet**
> TransactionCode getTransactionCodeUsingGet(transactionCodeId)

Retrieve a transaction code

Retrieve the information for a transaction code defined by your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
UUID transactionCodeId = new UUID(); // UUID | UUID transaction_code_id
try {
    TransactionCode result = apiInstance.getTransactionCodeUsingGet(transactionCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getTransactionCodeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**UUID**](.md)| UUID transaction_code_id |

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAccountStatusUsingPut"></a>
# **updateAccountStatusUsingPut**
> AccountStatus updateAccountStatusUsingPut(accountStatus, accountStatusId)

Update an account status

Update an account status record for an account.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
AccountStatus accountStatus = new AccountStatus(); // AccountStatus | account_status
UUID accountStatusId = new UUID(); // UUID | UUID account_status_id
try {
    AccountStatus result = apiInstance.updateAccountStatusUsingPut(accountStatus, accountStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#updateAccountStatusUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatus** | [**AccountStatus**](AccountStatus.md)| account_status |
 **accountStatusId** | [**UUID**](.md)| UUID account_status_id |

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStageUsingPut"></a>
# **updateStageUsingPut**
> Stage updateStageUsingPut(stage, stageId)

Update an account stage

Update the information for an account stage.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
Stage stage = new Stage(); // Stage | stage
UUID stageId = new UUID(); // UUID | UUID stage_id
try {
    Stage result = apiInstance.updateStageUsingPut(stage, stageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#updateStageUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | [**Stage**](Stage.md)| stage |
 **stageId** | [**UUID**](.md)| UUID stage_id |

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTransactionCodeUsingPut"></a>
# **updateTransactionCodeUsingPut**
> TransactionCode updateTransactionCodeUsingPut(transactionCode, transactionCodeId)

Update a transaction code

Update a transaction code for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import UtilsApi;

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

UtilsApi apiInstance = new UtilsApi();
TransactionCode transactionCode = new TransactionCode(); // TransactionCode | transaction_code
UUID transactionCodeId = new UUID(); // UUID | UUID transaction_code_id
try {
    TransactionCode result = apiInstance.updateTransactionCodeUsingPut(transactionCode, transactionCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#updateTransactionCodeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCode** | [**TransactionCode**](TransactionCode.md)| transaction_code |
 **transactionCodeId** | [**UUID**](.md)| UUID transaction_code_id |

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

