# UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReasonCodeUsingPost**](UtilsApi.md#createReasonCodeUsingPost) | **POST** /reason_code | Create a reason code
[**createStageUsingPost**](UtilsApi.md#createStageUsingPost) | **POST** /stage | Create an account stage
[**createTransactionCodeUsingPost**](UtilsApi.md#createTransactionCodeUsingPost) | **POST** /transaction_code | Create a transaction code
[**deleteReasonCodeUsingDelete**](UtilsApi.md#deleteReasonCodeUsingDelete) | **DELETE** /reason_code/{reason_code_id} | Delete a reason code
[**deleteStageUsingDelete**](UtilsApi.md#deleteStageUsingDelete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**deleteTransactionCodeUsingDelete**](UtilsApi.md#deleteTransactionCodeUsingDelete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**getReasonCodeAllUsingGet**](UtilsApi.md#getReasonCodeAllUsingGet) | **GET** /reason_code | List all reason codes
[**getReasonCodeUsingGet**](UtilsApi.md#getReasonCodeUsingGet) | **GET** /reason_code/{reason_code_id} | Retrieve a reason code
[**getStageAllUsingGet**](UtilsApi.md#getStageAllUsingGet) | **GET** /stage | List all account stages
[**getStageUsingGet**](UtilsApi.md#getStageUsingGet) | **GET** /stage/{stage_id} | Retrieve an account stage
[**getTransactionCodeAllUsingGet**](UtilsApi.md#getTransactionCodeAllUsingGet) | **GET** /transaction_code | List all transaction codes
[**getTransactionCodeUsingGet**](UtilsApi.md#getTransactionCodeUsingGet) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**updateReasonCodeUsingPut**](UtilsApi.md#updateReasonCodeUsingPut) | **PUT** /reason_code/{reason_code_id} | Update a reason code
[**updateStageUsingPut**](UtilsApi.md#updateStageUsingPut) | **PUT** /stage/{stage_id} | Update an account stage
[**updateTransactionCodeUsingPut**](UtilsApi.md#updateTransactionCodeUsingPut) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


<a name="createReasonCodeUsingPost"></a>
# **createReasonCodeUsingPost**
> ReasonCode createReasonCodeUsingPost(reasonCodeRequest)

Create a reason code

Create a new reason code for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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


UtilsApi apiInstance = new UtilsApi();
ReasonCode reasonCodeRequest = new ReasonCode(); // ReasonCode | reasonCodeRequest
try {
    ReasonCode result = apiInstance.createReasonCodeUsingPost(reasonCodeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createReasonCodeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeRequest** | [**ReasonCode**](ReasonCode.md)| reasonCodeRequest |

### Return type

[**ReasonCode**](ReasonCode.md)

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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

<a name="deleteReasonCodeUsingDelete"></a>
# **deleteReasonCodeUsingDelete**
> deleteReasonCodeUsingDelete(reasonCodeId)

Delete a reason code

Permanently delete a reason code for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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


UtilsApi apiInstance = new UtilsApi();
UUID reasonCodeId = new UUID(); // UUID | UUID reason_code_id
try {
    apiInstance.deleteReasonCodeUsingDelete(reasonCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#deleteReasonCodeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeId** | [**UUID**](.md)| UUID reason_code_id |

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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

<a name="getReasonCodeAllUsingGet"></a>
# **getReasonCodeAllUsingGet**
> PageReasonCode getReasonCodeAllUsingGet(ascending, filter, orderBy, page, size)

List all reason codes

Get the information for all reason codes defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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


UtilsApi apiInstance = new UtilsApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageReasonCode result = apiInstance.getReasonCodeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getReasonCodeAllUsingGet");
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

[**PageReasonCode**](PageReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReasonCodeUsingGet"></a>
# **getReasonCodeUsingGet**
> ReasonCode getReasonCodeUsingGet(reasonCodeId)

Retrieve a reason code

Retrieve the information for a reason code defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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


UtilsApi apiInstance = new UtilsApi();
UUID reasonCodeId = new UUID(); // UUID | UUID reason_code_id
try {
    ReasonCode result = apiInstance.getReasonCodeUsingGet(reasonCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getReasonCodeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeId** | [**UUID**](.md)| UUID reason_code_id |

### Return type

[**ReasonCode**](ReasonCode.md)

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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

<a name="updateReasonCodeUsingPut"></a>
# **updateReasonCodeUsingPut**
> ReasonCode updateReasonCodeUsingPut(reasonCode, reasonCodeId)

Update a reason code

Update a reason code for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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


UtilsApi apiInstance = new UtilsApi();
ReasonCode reasonCode = new ReasonCode(); // ReasonCode | reason_code
UUID reasonCodeId = new UUID(); // UUID | UUID reason_code_id
try {
    ReasonCode result = apiInstance.updateReasonCodeUsingPut(reasonCode, reasonCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#updateReasonCodeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCode** | [**ReasonCode**](ReasonCode.md)| reason_code |
 **reasonCodeId** | [**UUID**](.md)| UUID reason_code_id |

### Return type

[**ReasonCode**](ReasonCode.md)

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import UtilsApi;

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

